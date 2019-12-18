package ar.edu.unahur.obj2.ejercicio3;

public class AutoConAire extends Auto {
    Auto ai;

    public AutoConAire(Auto autito) {
        this.ai = autito;
    }

    @Override
    public double getCosto() {
        return ai.getCosto() + 1000 ;
    }
}
