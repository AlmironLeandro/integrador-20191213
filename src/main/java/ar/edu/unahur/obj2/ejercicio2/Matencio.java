package ar.edu.unahur.obj2.ejercicio2;

public class Matencio{


    public String prepararMate(Mate Mate){
        StringBuffer instrucciones = new StringBuffer();
        calentarAgua(instrucciones);
        llenarTermo(instrucciones);
        agregarYerbaAlMate(instrucciones);
        mojarElMate(instrucciones);
        ponerLaBombilla(instrucciones);
        cebar(instrucciones);

        return instrucciones.toString();
    }

    private void calentarAgua(StringBuffer instrucciones ){
        instrucciones.append("Calentar el agua a 80 grados");
    }

    private void llenarTermo(StringBuffer instrucciones ){
        instrucciones.append("Llene el termo con el agua caliente");
    }

    private void agregarYerbaAlMate(StringBuffer instrucciones ){
        instrucciones.append("Incline el mate a 45 grados y llene 3/4 partes de yerba");
    }


    private void mojarElMate(StringBuffer instrucciones ){
        instrucciones.append("Moje el mate lentamente del lado que el nivel de yerba es más bajo 3 veces dejando que la yerba se humedezca");
    }

    private void ponerLaBombilla(StringBuffer instrucciones ){
        instrucciones.append("Inserte la bombilla en la yerba húmeda");
    }

    private void cebar(StringBuffer instrucciones ){
        instrucciones.append("Ya puede comenzar la ronda");
    }


}