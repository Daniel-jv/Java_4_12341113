package tarea_jerarquia_de_herencia_cuadrilatero;

import java.util.ArrayList;

public class Trapezoide extends Cuadrilatero{

    public Trapezoide(int[] P1, int[] P2, int[] P3, int[] P4) {
        super(P1, P2, P3, P4);
    }

    public static int areaTrapezoide(ArrayList <int []> puntos){
        int alturamax = puntos.get(0)[1];
        int alturamin = puntos.get(0)[1];
        for (int i = 0; i < puntos.size(); i++) {
            int compararaltmax = puntos.get(i)[1];
            if(compararaltmax > alturamax){
                alturamax = compararaltmax;
            }
            int comaparealtmin = puntos.get(i)[1];
            if(comaparealtmin < alturamin){
                alturamin = comaparealtmin;
            }
        }
        int altura = alturamax - alturamin;
        int base1 = puntos.get(0)[0] - puntos.get(1)[0];
        int base2 = puntos.get(2)[0] - puntos.get(3)[0];
        if(base1 <= 0){
            base1 = puntos.get(3)[0] - puntos.get(2)[0];
            if(base1 <= 0){
                base1 = puntos.get(3)[0] - puntos.get(1)[0];
                if(base1 <= 0){
                    base1 = puntos.get(2)[0] - puntos.get(0)[0];
                    if(base1 <= 0){
                        base1 = puntos.get(0)[0] - puntos.get(2)[0];
                        if(base1 <= 0){
                            base1 = puntos.get(1)[0] - puntos.get(3)[0];
                        }
                    }
                }
            }
        }
        if(base2 <= 0){
            base2 = puntos.get(1)[0] - puntos.get(0)[0];
            if(base2 <= 0){
                base2 = puntos.get(1)[0] - puntos.get(2)[0];
                if(base2 <= 0){
                    base2 = puntos.get(3)[0] - puntos.get(0)[0];
                    if(base2 <= 0){
                        base2 = puntos.get(0)[0] - puntos.get(3)[0];
                        if(base2 <= 0){
                            base2 = puntos.get(2)[0] - puntos.get(1)[0];
                        }
                    }
                }
            }
        }
        int area = ((base1 + base2) * altura)/2;
        return area;
    }
    
}
