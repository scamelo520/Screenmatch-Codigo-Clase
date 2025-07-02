package com.aluracursos.screenmatch.modelos;

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

    public OmdbClient() {

    }

    public String buscarPelicula(String busqueda){
        String direccion = baseUrl + busqueda.replace(" ", "+")+
                "&apikey="+apiKey;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al buscar la pelicula: " +e.getMessage());
            return null;
        }
    }
}
