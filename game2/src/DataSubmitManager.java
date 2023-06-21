import java.io.IOException;

import java.net.http.*;

import static java.net.URI.*;

public class DataSubmitManager {
    public DataSubmitManager(String name, int score) throws IOException, InterruptedException {
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(
                        create("http://localhost:8080/api/v1/games/"))
                .POST(HttpRequest.BodyPublishers.ofString("{\"name\":\""+name+"\", \"score\":"+score+"}"))
                .header("Content-type", "application/json")
                .build();
        var res = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(res.body());
    }
}
