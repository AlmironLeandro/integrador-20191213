package ar.edu.unahur.obj2.ejercicio3;

public class AutoConClimatizador extends Auto {
    Auto a1;

    public AutoConClimatizador(Auto a1) {
        this.a1 = a1;
    }

    @Override
    public double getCosto() {
        return a1.getCosto() + 2500;
    }
}
