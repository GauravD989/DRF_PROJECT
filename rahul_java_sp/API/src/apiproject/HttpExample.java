package apiproject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpExample {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		String url="https://api.dictionaryapi.dev/api/v2/entries/en/Happy";
		
		HttpRequest request = HttpRequest.newBuilder()
		.GET()
		.uri(URI.create(url))
		.build();
		
		HttpClient client= HttpClient.newBuilder().build();
		HttpResponse<String> response= client.send(request, HttpResponse.BodyHandlers.ofString());
		
		System.out.println(response.statusCode());
		System.out.println(response.body());

	}

}
