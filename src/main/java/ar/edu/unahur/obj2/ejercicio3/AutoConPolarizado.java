package ar.edu.unahur.obj2.ejercicio3;

public class AutoConPolarizado  extends  Auto{
    Auto ai;

    public AutoConPolarizado(Auto ai) {
        this.ai = ai;
    }

    @Override
    public double getCosto() {
        return ai.getCosto() + 2000;
    }
}
