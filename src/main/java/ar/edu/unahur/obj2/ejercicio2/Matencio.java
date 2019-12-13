package ar.edu.unahur.obj2.ejercicio2;

public class Matencio{


    public void prepararMate(TipoMate tipoMate){

        calentarAgua();
        llenarTermo();
        agregarYerbaAlMate();
        agregarSaboresSiHay(tipoMate);
        mojarElMate();
        ponerLaBombilla();
        cebar();

    }

    private void calentarAgua(){
        System.out.println("Calentar el agua a 80 grados");
    }

    private void llenarTermo(){
        System.out.println("Llene el termo con el agua caliente");
    }

    private void agregarYerbaAlMate(){
        System.out.println("Incline el mate a 45 grados y llene 3/4 partes de yerba");
    }

    private void agregarSaboresSiHay(TipoMate tipoMate){

        if(TipoMate.CITRIC.equals(tipoMate)){
            System.out.println("Agregue las cáscaras de naranja a la yerba, mezcle");
        }else if(TipoMate.MENTA.equals(tipoMate)){
            System.out.println("Agregue la menta a la yerba, mezcle");
        }else if(TipoMate.PEPERINA.equals(tipoMate)){
            System.out.println("Agregue la peperina a la yerba, mezcle");
        }else if(TipoMate.DULCE.equals(tipoMate)){
            System.out.println("Agregue azucar a la yerba, repita esta operación antes de cada cebada");
        }else {
            throw new RuntimeException("Tipo de mate inválido");
        }
    }

    private void mojarElMate(){
        System.out.println("Moje el mate lentamente del lado que el nivel de yerba es más bajo 3 veces dejando que la yerba se humedezca");
    }

    private void ponerLaBombilla(){
        System.out.println("Inserte la bombilla en la yerba húmeda");
    }

    private void cebar(){
        System.out.println("Ya puede comenzar la ronda");
    }


}