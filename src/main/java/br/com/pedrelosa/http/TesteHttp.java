package br.com.pedrelosa.http;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TesteHttp {
    public static void main(String[] args) throws IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://viacep.com.br/ws/CE/Fortaleza/Professor+Mora/json/"))

                .build();

        HttpClient httpClient = HttpClient.newBuilder().build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

//        System.out.println(response.body());
//        System.out.println("Deu bom");

        String json = response.body();

        JSONArray jsonArray = new JSONArray(json);

        for (int i = 0; i < jsonArray.length(); i++) {

            JSONObject jsonObject = jsonArray.getJSONObject(i);

            if (jsonObject.get("bairro").equals("Parquelândia") || jsonObject.get("bairro").equals("Parque Araxá")){
                System.out.println(jsonObject.get("logradouro"));
            }

        }

    }
}
