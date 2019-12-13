package ar.edu.unahur.obj2.ejercicio2;

public class Matencio{


    public String prepararMate(TipoMate tipoMate){
        StringBuffer instrucciones = new StringBuffer();
        calentarAgua(instrucciones);
        llenarTermo(instrucciones);
        agregarYerbaAlMate(instrucciones);
        agregarSaboresSiHay(tipoMate, instrucciones);
        mojarElMate(instrucciones);
        ponerLaBombilla(instrucciones);
        cebar(instrucciones);

        return instrucciones.toString();
    }

    private void calentarAgua(StringBuffer instrucciones ){
        instrucciones.append("Calentar el agua a 80 grados");
    }

    private void llenarTermo(StringBuffer instrucciones ){
        instrucciones.append(("Llene el termo con el agua caliente");
    }

    private void agregarYerbaAlMate(StringBuffer instrucciones ){
        instrucciones.append(("Incline el mate a 45 grados y llene 3/4 partes de yerba");
    }

    private void agregarSaboresSiHay(TipoMate tipoMate, StringBuffer instrucciones ){

        if(TipoMate.CITRIC.equals(tipoMate)){
            instrucciones.append(("Agregue las cáscaras de naranja a la yerba, mezcle");
        }else if(TipoMate.MENTA.equals(tipoMate)){
            instrucciones.append(("Agregue la menta a la yerba, mezcle");
        }else if(TipoMate.PEPERINA.equals(tipoMate)){
            instrucciones.append(("Agregue la peperina a la yerba, mezcle");
        }else if(TipoMate.DULCE.equals(tipoMate)){
            instrucciones.append(("Agregue azucar a la yerba, repita esta operación antes de cada cebada");
        }else {
            throw new RuntimeException("Tipo de mate inválido");
        }
    }

    private void mojarElMate(StringBuffer instrucciones ){
        instrucciones.append(("Moje el mate lentamente del lado que el nivel de yerba es más bajo 3 veces dejando que la yerba se humedezca");
    }

    private void ponerLaBombilla(StringBuffer instrucciones ){
        instrucciones.append(("Inserte la bombilla en la yerba húmeda");
    }

    private void cebar(StringBuffer instrucciones ){
        instrucciones.append(("Ya puede comenzar la ronda");
    }


}