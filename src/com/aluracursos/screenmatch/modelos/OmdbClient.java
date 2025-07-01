/*package com.aluracursos.screenmatch.modelos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class OmdbClient {
    private final String apiKey = "3175eb05&";
    private final String baseUrl = "http://www.omdbapi.com/?t=";

    public OmdbClient(String busqueda) {
    }

    public String buscarPelicula(String busqueda){
        HttpClient client = HttpClient.newHttpClient();
        String direccion = baseUrl + busqueda.replace(" ", "+")+
                "&apikey="+apiKey;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al buscar la pelicula: " +e.getMessage());
            return null;
        }
        String json = response.body();
        System.out.println(json);
    }
}*/
