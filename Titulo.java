package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.Excepciones.ErrorEnConversionDeDuracionException;

public class Titulo implements Comparable<Titulo> {
    public String nombre;

    public int fechaLanzamiento;

    public int duracionMinutos;

    boolean incluidoPlan;

    private double sumaEvaluaciones;

    private int totalEvaluaciones;

    public Titulo(TituloOmdb miTituloOmdb) {
        this.nombre = miTituloOmdb.title();
        this.fechaLanzamiento = Integer.valueOf(miTituloOmdb.year());
        if (miTituloOmdb.runtime().contains("N/A")){
            throw new ErrorEnConversionDeDuracionException(
                    "No pude convertir la duracion porque contiene un N/A");
        }
        this.duracionMinutos = Integer.valueOf(miTituloOmdb.runtime().substring(0, 3).replace(
                " ", ""));
    }

    public int getTotalEvaluaciones(){
        return totalEvaluaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public boolean getIncluidoPlan() {
        return incluidoPlan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public void setIncluidoPlan(boolean incluidoPlan) {
        this.incluidoPlan = incluidoPlan;
    }

    public void muestraFichaTecnica(){
        System.out.println("Mi pelicula es:" +nombre);
        System.out.println("Su fecha de lanzamiento es:" +fechaLanzamiento);
        System.out.println("Duracion en minutos:" +getDuracionMinutos());
    }

    public void evalua(double nota){
        sumaEvaluaciones += nota;
        totalEvaluaciones++;
    }

    public double calcularMedia(){
        return sumaEvaluaciones/totalEvaluaciones;
    }

    public Titulo (String nombre, int fechaLanzamiento){
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return "(nombre=" + nombre +
                ", fechaLanzamiento=" + fechaLanzamiento +
                ", duracionMinutos=" + duracionMinutos + ")";
    }
}
