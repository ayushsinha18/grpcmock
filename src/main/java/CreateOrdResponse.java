import com.google.protobuf.util.JsonFormat;
import com.swiggy.sand.scube.pricing.models.Requestresponse;
import com.swiggy.sand.scube.serviceability.models.RequestResponse;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CreateOrdResponse {
    public static void write() {
        try {

            String json = "{\"entity_pricing_list\":[{\"entity\":{\"entity_id\":\"211\",\"entity_type\":\"restaurant\"},\"entity_fee\":{\"entity\":{\"entity_id\":\"211\",\"entity_type\":\"restaurant\"},\"fees\":[{\"name\":\"distance\",\"fee\":10},{\"name\":\"special\",\"delivery_surge_applied\":true},{\"name\":\"time\",\"fee\":5}],\"total_fee\":15,\"message\":\"Distance fee applicable###SurgeAssets/Distance######\"},\"entity_discount\":{\"entity\":{\"entity_id\":\"211\",\"entity_type\":\"restaurant\"},\"is_empty\":true}},{\"entity\":{\"entity_id\":\"212\",\"entity_type\":\"restaurant\"},\"entity_fee\":{\"entity\":{\"entity_id\":\"212\",\"entity_type\":\"restaurant\"},\"fees\":[{\"name\":\"distance\",\"fee\":40},{\"name\":\"special\",\"delivery_surge_applied\":true},{\"name\":\"time\",\"fee\":5}],\"total_fee\":45,\"message\":\"Distance fee applicable###SurgeAssets/Distance######\"},\"entity_discount\":{\"entity\":{\"entity_id\":\"212\",\"entity_type\":\"restaurant\"},\"is_empty\":true}},{\"entity\":{\"entity_id\":\"213\",\"entity_type\":\"restaurant\"},\"entity_fee\":{\"entity\":{\"entity_id\":\"213\",\"entity_type\":\"restaurant\"},\"fees\":[{\"name\":\"distance\",\"fee\":40},{\"name\":\"special\",\"delivery_surge_applied\":true},{\"name\":\"time\",\"fee\":5}],\"total_fee\":45,\"message\":\"Distance fee applicable###SurgeAssets/Distance######\"},\"entity_discount\":{\"entity\":{\"entity_id\":\"213\",\"entity_type\":\"restaurant\"},\"discounts\":[{\"header\":\"listing_page_copy\",\"description\":\"dash page copy\",\"short_description\":\"pdp page copy\",\"min_cart_amount\":99,\"discount_type\":\"Percentage\",\"reward_value\":\"50\",\"operation_type\":\"RESTAURANT\",\"id\":\"1011bb4e-f1ad-4b1b-a737-68afc20eb924\",\"coupon_code\":\"TEST8\",\"priority\":1},{\"header\":\"listing_page_copy\",\"description\":\"dash page copy\",\"short_description\":\"pdp page copy\",\"min_cart_amount\":99,\"discount_type\":\"Percentage\",\"reward_value\":\"50\",\"operation_type\":\"RESTAURANT\",\"id\":\"31c04ca7-6caf-4c01-afe1-043d3fa52fd4\",\"coupon_code\":\"TEST123\",\"priority\":2},{\"header\":\"listing_page_copy\",\"description\":\"dash page copy\",\"short_description\":\"pdp page copy\",\"min_cart_amount\":99,\"discount_type\":\"Percentage\",\"reward_value\":\"50\",\"operation_type\":\"RESTAURANT\",\"id\":\"1aa81a84-3f32-41ce-acca-42f31e24c963\",\"coupon_code\":\"COUPON123\",\"priority\":3},{\"header\":\"listing_page_copy\",\"description\":\"dash page copy\",\"short_description\":\"pdp page copy\",\"min_cart_amount\":99,\"discount_type\":\"Percentage\",\"reward_value\":\"40\",\"operation_type\":\"RESTAURANT\",\"id\":\"5d1627e5-224d-4987-81ff-d1b747aee2b5\",\"coupon_code\":\"SWIGGYMARCHFEST\",\"priority\":4},{\"header\":\"listing_page_copy\",\"description\":\"dash page copy\",\"short_description\":\"pdp page copy\",\"min_cart_amount\":99,\"discount_type\":\"Percentage\",\"reward_value\":\"40\",\"operation_type\":\"RESTAURANT\",\"id\":\"ecf0a38a-9d41-4839-aac3-0b661fdca47f\",\"coupon_code\":\"MARCHFESTIVAL\",\"priority\":5},{\"header\":\"listing_page_copy\",\"description\":\"dash page copy\",\"short_description\":\"pdp page copy\",\"min_cart_amount\":99,\"discount_type\":\"Percentage\",\"reward_value\":\"30\",\"operation_type\":\"RESTAURANT\",\"id\":\"d5b0c856-67d5-466a-a2d6-2d9e38b61adc\",\"coupon_code\":\"WELCOMEBACK\",\"priority\":6},{\"header\":\"listing_page_copy\",\"description\":\"dash page copy\",\"short_description\":\"pdp page copy\",\"min_cart_amount\":99,\"discount_type\":\"Percentage\",\"reward_value\":\"20\",\"operation_type\":\"RESTAURANT\",\"id\":\"f26fabe3-c048-4a22-97ff-1946fdda502d\",\"coupon_code\":\"WELCOMEBACK20\",\"priority\":8},{\"header\":\"listing_page_copy\",\"description\":\"dash page copy\",\"short_description\":\"pdp page copy\",\"min_cart_amount\":99,\"discount_type\":\"Flat\",\"reward_value\":\"0.4\",\"operation_type\":\"RESTAURANT\",\"id\":\"7fc59b59-9ef8-47f9-a82a-d23ea8710a7b\",\"coupon_code\":\"SWIGGYFOODFEST\",\"priority\":10},{\"header\":\"listing_page_copy\",\"description\":\"dash page copy\",\"short_description\":\"pdp page copy\",\"min_cart_amount\":99,\"discount_type\":\"Flat\",\"reward_value\":\"0.1\",\"operation_type\":\"RESTAURANT\",\"id\":\"44a5f43f-dbdf-4e50-a7b7-6800c81fe74f\",\"coupon_code\":\"TESTCOUPON\",\"priority\":11}],\"aggregated_discount\":{\"header\":\"listing_page_copy\",\"short_description_list\":[{\"meta\":\"pdp page copy\",\"discount_type\":\"Percentage\",\"operation_type\":\"RESTAURANT\"}],\"description_list\":[{\"meta\":\"dash page copy\",\"discount_type\":\"Percentage\",\"operation_type\":\"RESTAURANT\"}]},\"aggregated_discountV2\":{\"header\":\"50% OFF\",\"short_description_list\":[{\"meta\":\"Use TEST8\",\"discount_type\":\"Percentage\",\"operation_type\":\"RESTAURANT\"}],\"description_list\":[{\"meta\":\"dash page copy\",\"discount_type\":\"Percentage\",\"operation_type\":\"RESTAURANT\"}]},\"discountScore\":{}}},{\"entity\":{\"entity_id\":\"214\",\"entity_type\":\"restaurant\"},\"entity_fee\":{\"entity\":{\"entity_id\":\"214\",\"entity_type\":\"restaurant\"},\"fees\":[{\"name\":\"distance\",\"fee\":40},{\"name\":\"special\",\"delivery_surge_applied\":true},{\"name\":\"time\",\"fee\":5}],\"total_fee\":45,\"message\":\"Distance fee applicable###SurgeAssets/Distance######\"},\"entity_discount\":{\"entity\":{\"entity_id\":\"214\",\"entity_type\":\"restaurant\"},\"discounts\":[{\"header\":\"listing_page_copy\",\"description\":\"dash page copy\",\"short_description\":\"pdp page copy\",\"min_cart_amount\":99,\"discount_type\":\"Percentage\",\"reward_value\":\"100\",\"operation_type\":\"RESTAURANT\",\"id\":\"0f0cb27f-5062-4eed-a331-ed40b94f4817\",\"coupon_code\":\"COUPON3257\",\"priority\":1},{\"header\":\"listing_page_copy\",\"description\":\"dash page copy\",\"short_description\":\"pdp page copy\",\"min_cart_amount\":99,\"discount_type\":\"Percentage\",\"reward_value\":\"100\",\"operation_type\":\"RESTAURANT\",\"id\":\"108702f4-d940-4aa1-be40-e8a623307227\",\"coupon_code\":\"COUPON4752\",\"priority\":2},{\"header\":\"listing_page_copy\",\"description\":\"dash page copy\",\"short_description\":\"pdp page copy\",\"min_cart_amount\":99,\"discount_type\":\"Flat\",\"reward_value\":\"1\",\"operation_type\":\"RESTAURANT\",\"id\":\"d79a72e7-eb82-4de0-b489-b69900cfcb2f\",\"coupon_code\":\"COUPON6193\",\"priority\":3},{\"header\":\"listing_page_copy\",\"description\":\"dash page copy\",\"short_description\":\"pdp page copy\",\"min_cart_amount\":99,\"discount_type\":\"Flat\",\"reward_value\":\"1\",\"operation_type\":\"RESTAURANT\",\"id\":\"b24939bf-f0c6-4214-a646-b2506d03b4f8\",\"coupon_code\":\"COUPON3305\",\"priority\":4}],\"aggregated_discount\":{\"header\":\"listing_page_copy\",\"short_description_list\":[{\"meta\":\"pdp page copy\",\"discount_type\":\"Percentage\",\"operation_type\":\"RESTAURANT\"}],\"description_list\":[{\"meta\":\"dash page copy\",\"discount_type\":\"Percentage\",\"operation_type\":\"RESTAURANT\"}]},\"aggregated_discountV2\":{\"header\":\"100% OFF\",\"short_description_list\":[{\"meta\":\"Use COUPON3257\",\"discount_type\":\"Percentage\",\"operation_type\":\"RESTAURANT\"}],\"description_list\":[{\"meta\":\"dash page copy\",\"discount_type\":\"Percentage\",\"operation_type\":\"RESTAURANT\"}]},\"discountScore\":{}}}]}";
            Requestresponse.PricingResponse.Builder response = Requestresponse.PricingResponse.newBuilder();
            String fileName = "test.txt";
            FileOutputStream fos = new FileOutputStream(fileName);
//            FileInputStream fis = new FileInputStream(fileName2);
            JsonFormat.parser().merge(json, response);
            response.build().writeTo(fos);
            int x = 0;


//        structBuilder.build().toByteString().writeTo(fos);
        } catch (Exception e) {
            String message = e.getMessage();

        }
    }

    public static void read() throws IOException {


        File[] files = new File("/Users/siddharth.s1/Desktop/mocks").listFiles();
//If this pathname does not denote a directory, then listFiles() returns null.

        BufferedWriter writer = new BufferedWriter(new FileWriter("mocksdata.txt"));
        for (File file : files) {
            if (file.isFile()) {
                RequestResponse.OrderabilityResponse.Builder response = RequestResponse.OrderabilityResponse.newBuilder();
                System.out.println(file.getName());
                FileInputStream fis = new FileInputStream(file);
                response.mergeFrom(fis);
                RequestResponse.OrderabilityResponse response1 = response.build();
                writer.write(file.getName() + "\n");
                writer.write(response1.toString());
                writer.write("\n\n\n");
            }
        }
        writer.close();

    }

}
