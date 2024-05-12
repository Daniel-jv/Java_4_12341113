package tarea_jerarquia_de_herencia_cuadrilatero;

public class Cuadrado extends Cuadrilatero{

    public Cuadrado(int[] P1, int[] P2, int[] P3, int[] P4) {
        super(P1, P2, P3, P4);
    }
    
    public static int areaCuadrado(int [] punto1, int [] punto2){
        int lado = punto1[0] - punto2[0];
        if(lado <= 0){
            lado = punto2[0] - punto1[0];
            if(lado <= 0){
                lado = punto1[1] - punto2[1];
                if(lado <= 0){
                    lado = punto2[1] - punto1[1];
                }
            }
        }
        return (lado*lado);
    }
    
}
