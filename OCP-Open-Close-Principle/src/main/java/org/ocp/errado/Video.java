package org.ocp.errado;

public class Video {
    private Type type;

    public void calcularInteresse(){
        if (type == Type.MOVIE){
            System.out.println("Calcular interesse baseado em filme");
        } else if (type == Type.TVSHOW) {
            System.out.println("Calcular interesse baseado em serie");
        }
    }
}
