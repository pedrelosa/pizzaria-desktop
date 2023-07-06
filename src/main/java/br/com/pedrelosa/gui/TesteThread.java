package br.com.pedrelosa.gui;

import br.com.pedrelosa.connection.LogradouroDAO;
import br.com.pedrelosa.model.Logradouro;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.swing.*;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class TesteThread extends Thread{

    private DefaultListModel<String> model;
    private JList<String> lLogradouros;
    private JTextField tfLogradouro;

    public TesteThread(DefaultListModel<String> model, JList<String> lLogradouros, JTextField tfLogradouro){
        this.model = model;
        this.lLogradouros = lLogradouros;
        this.tfLogradouro = tfLogradouro;
        this.start();
    }

    @Override
    public void run(){

        if (tfLogradouro.getText().length() != 0){


//        LogradouroDAO lDAO = new LogradouroDAO();
//
//        List<Logradouro> logradouros = lDAO.buscaTodosPorCaracteres(tfLogradouro.getText());
//
//        logradouros.forEach(logradouro -> {
//            if (!model.contains(logradouro.getNome())){
//                model.addElement(logradouro.getNome());
//            }
//        });

            HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create("https://viacep.com.br/ws/CE/Fortaleza/"+tfLogradouro.getText().replace(" ", "+")+"/json/"))

                    .build();

            HttpClient httpClient = HttpClient.newBuilder().build();

            try {
                HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();

                JSONArray jsonArray = new JSONArray(json);

                for (int i = 0; i < jsonArray.length(); i++) {

                    JSONObject jsonObject = jsonArray.getJSONObject(i);

                    if (jsonObject.get("bairro").equals("Parquelândia")
                            || jsonObject.get("bairro").equals("Parque Araxá")
                            || jsonObject.get("bairro").equals("Amadeu furtado")
                            || jsonObject.get("bairro").equals("Rodolfo teófilo")
                            || jsonObject.get("bairro").equals("Bela Vista")
                            || jsonObject.get("bairro").equals("Presidente Kennedy")
                            || jsonObject.get("bairro").equals("São Gerardo")
                            || jsonObject.get("bairro").equals("Monte Castelo")
                            || jsonObject.get("bairro").equals("Farias Brito")
                            || jsonObject.get("bairro").equals("Benfica")){
//                    System.out.println(jsonObject.get("logradouro"));
                        model.addElement(jsonObject.get("logradouro") + ", " + jsonObject.get("bairro"));
                    }

                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
