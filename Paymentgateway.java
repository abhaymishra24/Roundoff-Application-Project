 

// //  <dependency>
// //     <groupId>com.squareup.okhttp3</groupId>
// //     <artifactId>okhttp</artifactId>
// //     <version>4.10.0</version>
// // </dependency>


// import okhttp3.*;

// import java.io.IOException;

// public class Paymentgateway {

//     // Replace these with your actual API credentials
//     private static final String API_URL = "https://api.onepay.com/v1/transactions"; // Example endpoint
//     private static final String API_KEY = "your-api-key";
//     private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");

//     public static void main(String[] args) {
//         // Payment details
//         String json = "{"
//                 + "\"amount\": 1000,"
//                 + "\"currency\": \"USD\","
//                 + "\"description\": \"Payment for Order #12345\","
//                 + "\"payment_method\": \"credit_card\","
//                 + "\"card_number\": \"4111111111111111\","
//                 + "\"card_expiry\": \"12/25\","
//                 + "\"card_cvc\": \"123\""
//                 + "}";

//         try {
//             String response = makePayment(json);
//             System.out.println("Response: " + response);
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }

//     public static String makePayment(String json) throws IOException {
//         OkHttpClient client = new OkHttpClient();

//         RequestBody body = RequestBody.create(json, JSON);
//         Request request = new Request.Builder()
//                 .url(API_URL)
//                 .post(body)
//                 .addHeader("Authorization", "Bearer " + API_KEY)
//                 .addHeader("Content-Type", "application/json")
//                 .build();

//         try (Response response = client.newCall(request).execute()) {
//             if (!response.isSuccessful()) {
//                 throw new IOException("Unexpected code " + response);
//             }
//             return response.body().string();
//         }
//     }
// }
