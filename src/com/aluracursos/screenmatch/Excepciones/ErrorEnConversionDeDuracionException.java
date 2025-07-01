package com.aluracursos.screenmatch.Excepciones;

public class ErrorEnConversionDeDuracionException extends RuntimeException{
    private String mensaje;

    public ErrorEnConversionDeDuracionException(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
