
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Apicalling {

    public static void main(String[] args) {
        String url = "https://jsonplaceholder.typicode.com/posts/1"; // Example URL

        try {
            // Create a URL object
            URL obj = new URL(url);
            
            // Open a connection to the URL
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            
            // Set the request method
            con.setRequestMethod("GET");
            
            // Get the response code
            int responseCode = con.getResponseCode();
            System.out.println("Response Code: " + responseCode);
            
            // Read the response
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            
            // Print the result
            System.out.println("Response: " + response.toString());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// <dependency>
//     <groupId>com.squareup.okhttp3</groupId>
//     <artifactId>okhttp</artifactId>
//     <version>4.10.0</version>
// </dependency>


// import okhttp3.OkHttpClient;
// import okhttp3.Request;
// import okhttp3.Response;

// import java.io.IOException;

// public class ApiCallExample {

//     public static void main(String[] args) {
//         // Create an OkHttpClient instance
//         OkHttpClient client = new OkHttpClient();
        
//         // Define the request
//         Request request = new Request.Builder()
//                 .url("https://jsonplaceholder.typicode.com/posts/1") // Example URL
//                 .build();
        
//         // Execute the request
//         try (Response response = client.newCall(request).execute()) {
//             if (response.isSuccessful()) {
//                 // Print the response body
//                 System.out.println("Response: " + response.body().string());
//             } else {
//                 System.out.println("Request failed with code: " + response.code());
//             }
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }

// <dependency>
//     <groupId>org.apache.httpcomponents</groupId>
//     <artifactId>httpclient</artifactId>
//     <version>4.5.13</version>
// </dependency>

// import org.apache.http.HttpResponse;
// import org.apache.http.client.methods.CloseableHttpResponse;
// import org.apache.http.client.methods.HttpGet;
// import org.apache.http.impl.client.CloseableHttpClient;
// import org.apache.http.impl.client.HttpClients;
// import org.apache.http.util.EntityUtils;

// import java.io.IOException;

// public class ApiCallExample {

//     public static void main(String[] args) {
//         // Create an HttpClient instance
//         try (CloseableHttpClient client = HttpClients.createDefault()) {
//             // Define the request
//             HttpGet request = new HttpGet("https://jsonplaceholder.typicode.com/posts/1"); // Example URL
            
//             // Execute the request
//             try (CloseableHttpResponse response = client.execute(request)) {
//                 // Get the response body
//                 String responseBody = EntityUtils.toString(response.getEntity());
//                 System.out.println("Response: " + responseBody);
//             }
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }

