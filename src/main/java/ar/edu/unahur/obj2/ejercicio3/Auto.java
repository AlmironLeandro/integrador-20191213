package ar.edu.unahur.obj2.ejercicio3;

public class Auto {

    private double costoBase;
    private boolean conAire;
    private boolean conClimatizador;
    private boolean conPolarizado;

    public Auto(double costoBase, boolean conAire, boolean conClimatizador, boolean conPolarizado) {
        this.costoBase = costoBase;
        this.conAire = conAire;
        this.conClimatizador = conClimatizador;
        this.conPolarizado = conPolarizado;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public boolean isConAire() {
        return conAire;
    }

    public boolean isConClimatizador() {
        return conClimatizador;
    }

    public boolean isConPolarizado() {
        return conPolarizado;
    }
}


