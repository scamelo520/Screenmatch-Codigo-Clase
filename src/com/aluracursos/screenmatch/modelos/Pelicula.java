package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
        private String director;

        public String getDirector() {
                return director;
        }

        public void setDirector(String director) {
                this.director = director;
        }

        @Override
        public int getClasificacion() {
                return (int) (calcularMedia()/2);
        }

        @Override
        public String toString() {
                return "Pelicula: " +this.getNombre()+ "(" +getFechaLanzamiento()+ ")";
        }

        public Pelicula(String nombre, int fechaLanzamiento){
                super(nombre, fechaLanzamiento);
        }
}