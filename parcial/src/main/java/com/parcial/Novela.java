package com.parcial;

public class Novela extends Libro {
    private TipoNovela tipo;

    public Novela() {
        super();
        this.tipo = TipoNovela.REALISTA;
    }

    public Novela(String titulo, String autor, int numEjemplares, int numPrestados, TipoNovela tipo) {
        super(titulo, autor, numEjemplares, numPrestados);
        this.tipo = tipo;
    }

    public TipoNovela getTipo() {
        return tipo;
    }

    public void setTipo(TipoNovela tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return "Novela{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", numEjemplares=" + getNumEjemplares() +
                ", numPrestados=" + getNumPrestados() +
                ", tipo=" + tipo +
                '}';
    }
}
