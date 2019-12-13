package ar.edu.unahur.obj2.ejercicio3;

public class Concesionaria {



    public double presupuestoAutoConAccesorios(Auto auto) {

        double costoTotal = auto.getCostoBase();

        if(auto.isConAire()){
            costoTotal += 1000.0;
        }

        if(auto.isConClimatizador()){
            costoTotal += 2500.0;
        }

        if(auto.isConPolarizado()){
            costoTotal += 2000.0;
        }

        return costoTotal;
    }


}