import com.google.protobuf.util.JsonFormat;
import com.swiggy.sand.scube.pricing.models.Requestresponse;
import com.swiggy.sand.scube.serviceability.models.RequestResponse;

import java.io.*;
import java.util.Base64;

public class CreateOrdReq {

    public static void read() throws IOException {
        String  req = "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";
        byte[] request = Base64.getDecoder().decode(req.getBytes("UTF-8"));
        Requestresponse.PricingRequestV2  response = Requestresponse.PricingRequestV2.parseFrom(request);
        String x = JsonFormat.printer().print(response);
        String z = "";

    }

    public static void main(String[] args) throws IOException {
        read();
//        write();
    }
}