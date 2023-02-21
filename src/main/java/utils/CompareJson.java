package utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.swiggy.sand.scube.serviceability.models.RequestResponse;
import lombok.extern.slf4j.Slf4j;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

@Slf4j
public class CompareJson {
    private static ObjectMapper mapper = new ObjectMapper();

    public static void compareAndRead() throws IOException {
        File[] files = new File("/Users/siddharth.s1/Swiggy/sand/collections-service/deployments/local/wiremock/mappings").listFiles();
        String current = getString();
        for (File file : files) {

            if (file.isFile()) {
                JsonNode jsonNode = mapper.readTree(file);
                String url = jsonNode.get("request").get("url").asText();
                Map<String, Set<String>> map = new HashMap<>();
                List<String> matchHeader = Arrays.asList();
                if (url.equals("/orderability/v1/restaurants")) {
                    String getJson = jsonNode.get("request").get("customMatcher").get("parameters").get("equalToJson").asText();
                    try {
                        JSONAssert.assertEquals(current, getJson, JSONCompareMode.NON_EXTENSIBLE);
                        System.out.println("MATCHED");
                    } catch (Throwable t) {
//                        System.out.println(t.getMessage());
                        System.out.println("FAILED");
                    }
                    System.out.println(file.getName());
                    System.out.println("*******\n\n");
                }
            }
        }
    }

    private static byte[] getByte() throws UnsupportedEncodingException {
        String base64S = "CgUxMjEzMAoBMQoBMgoBMwoBNAoDMjEzCgQ0NzU1EhwKBzEyLjk4MDkSBzc3LjYwMzcdxLFPQSUYNZtCIAEqAzEyMzINcG9wdWxhcml0eVNpZDoIZGV2aWNlSWRCAi0x";
        return Base64.getDecoder().decode(base64S.getBytes("UTF-8"));
    }

    private static String getString() throws UnsupportedEncodingException, InvalidProtocolBufferException {
        RequestResponse.SelectiveServiceabilityRequest requestProto = RequestResponse.SelectiveServiceabilityRequest.parseFrom(getByte());
        return JsonFormat.printer().print(requestProto);

    }

    public static void main(String[] args) throws IOException {
        compareAndRead();
    }

}
