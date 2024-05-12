package tarea_jerarquia_de_herencia_cuadrilatero;

import java.util.ArrayList;
import java.util.Arrays;

public class Punto {
    
    public static int [] formato(String punto){
        String x = ""+punto.charAt(0);
        String y = ""+punto.charAt(2);
        int [] puntoF = new int [2];
        puntoF [0] = Integer.parseInt(x);
        puntoF [1] = Integer.parseInt(y);
        return puntoF;
    }
    
    public static int [] geTamaño(int [] punto1, int [] punto2, int [] punto3, int [] punto4){
        int [] esquinas = new int [4];
        ArrayList<int []> puntos = new ArrayList();
        puntos.add(punto1);
        puntos.add(punto2);
        puntos.add(punto3);
        puntos.add(punto4);
        int xMayor = punto1[0];
        int yMayor = punto1[1];
        for (int i = 0; i < puntos.size(); i++) {
        int comparar = puntos.get(i)[0];
            if(comparar >= xMayor){
                xMayor = comparar;
            }
        }
        for (int i = 0; i < puntos.size(); i++) {
        int comparar = puntos.get(i)[1];
            if(comparar >= yMayor){
                yMayor = comparar;
            }
        }
        esquinas[0] = xMayor;
        esquinas[1] = yMayor;
        return esquinas;
    }
    
    public static void dibujar(int [] punto1, int [] punto2, int [] punto3, int [] punto4, int [] tamaños){
        int ejey = tamaños[1]+1;
        int ejex = tamaños[0]+1;
        int cont = ejey;
        for (int i = ejey; i >= 0; i--) {
            System.out.print(cont+"-");
            cont--;
            for (int j = 0; j <= ejex; j++) {
                if(punto1[0] == j && punto1[1] == i){
                    System.out.print(" O");
                }else if(punto2[0] == j && punto2[1] == i){
                    System.out.print(" O");
                }else if(punto3[0] == j && punto3[1] == i){
                    System.out.print(" O");
                }else if(punto4[0] == j && punto4[1] == i){
                    System.out.print(" O");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.print("  ");
        for (int i = 0; i <= ejex; i++) {
            System.out.print(" |");
        }
        System.out.print("\n  ");
        for (int i = 0; i <= ejex; i++) {
            System.out.print(" "+i);
        }
        System.out.println();
    }
    
}
