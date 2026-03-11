package com.parcial;

public class Libro {
    private String titulo;
    private String autor;
    private int numEjemplares;
    private int numPrestados;

    public Libro() {
        this("", "", 0, 0);
    }

    public Libro(String titulo, String autor, int numEjemplares, int numPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = Math.max(0, numEjemplares);
        this.numPrestados = Math.max(0, numPrestados);
        if (this.numPrestados > this.numEjemplares) {
            this.numPrestados = this.numEjemplares;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = Math.max(0, numEjemplares);
        if (this.numPrestados > this.numEjemplares) {
            this.numPrestados = this.numEjemplares;
        }
    }

    public int getNumPrestados() {
        return numPrestados;
    }

    public void setNumPrestados(int numPrestados) {
        this.numPrestados = Math.max(0, numPrestados);
        if (this.numPrestados > this.numEjemplares) {
            this.numPrestados = this.numEjemplares;
        }
    }

    public boolean prestamo() {
        if (numPrestados < numEjemplares) {
            numPrestados++;
            return true;
        }
        return false;
    }

    public boolean devolucion() {
        if (numPrestados > 0) {
            numPrestados--;
            return true;
        }
        return false;
    }

    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numEjemplares=" + numEjemplares +
                ", numPrestados=" + numPrestados +
                '}';
    }
}
