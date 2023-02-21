package utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import java.io.*;
import java.util.*;

@Slf4j
public class DedupMock {
    private static ObjectMapper mapper = new ObjectMapper();

    public static void compareAndRead() throws IOException {
        File[] files = new File("/Users/siddharth.s1/Swiggy/sand/collections-service/deployments/local/wiremock/mappings").listFiles();
        Map<String, List<String>> map = new HashMap<>();
        Set<String> completed = new HashSet<>();
        List<String> matchHeader = Arrays.asList("tid", "retry-missing-rests");
        for (File matchFile : files) {
            if (matchFile.isFile()) {
                String matchFileName = matchFile.getName();
                JsonNode jsonNode = mapper.readTree(matchFile);
                String matchUrl = jsonNode.get("request").get("url").asText();
                if (matchUrl.equals("/orderability/v1/restaurants") || matchUrl.equals("/orderability/v1/all")) {
                    if (!completed.contains(matchFileName)) {
                        completed.add(matchFileName);
                        map.put(matchFileName, new ArrayList<>());
                        String matchJson = jsonNode.get("request").get("customMatcher").get("parameters").get("equalToJson").asText();
                        List<String> matchHeaderValue = getHeaders(jsonNode, matchHeader);
                        File[] secondLoop = new File("/Users/siddharth.s1/Swiggy/sand/collections-service/deployments/local/wiremock/mappings").listFiles();
                        for (File file : secondLoop) {
                            if (file.isFile()) {
                                JsonNode curJsonNode = mapper.readTree(file);
                                String curUrl = curJsonNode.get("request").get("url").asText();
                                if (matchUrl.equals(curUrl)) {
                                    String curJson = curJsonNode.get("request").get("customMatcher").get("parameters").get("equalToJson").asText();
                                    List<String> curHeaderValue = getHeaders(curJsonNode, matchHeader);

                                    try {
                                        if (matchHeaderValue.equals(curHeaderValue)) {
                                            JSONAssert.assertEquals(matchJson, curJson, JSONCompareMode.NON_EXTENSIBLE);
                                            completed.add(file.getName());
                                            map.get(matchFileName).add(file.getName());
                                        }
                                    } catch (Throwable t) {

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(map);
    }

    private static List<String> getHeaders(JsonNode jsonNode, List<String> headers) {
        JsonNode headerNode = jsonNode.get("request").get("headers");
        List<String> response = new ArrayList<>();
        for (int i = 0; i < headers.size(); i++) {
            response.add(null);
            String headerKey = headers.get(i);
            JsonNode headerDic = headerNode.get(headerKey);
            if (headerDic != null) {
                response.set(i, headerDic.get("equalTo").asText());
            }

        }
        return response;
    }


    public static void main(String[] args) throws IOException {
        compareAndRead();
    }

}
