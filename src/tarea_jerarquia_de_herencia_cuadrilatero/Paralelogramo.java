package tarea_jerarquia_de_herencia_cuadrilatero;

public class Paralelogramo extends Cuadrilatero{

    public Paralelogramo(int[] P1, int[] P2, int[] P3, int[] P4) {
        super(P1, P2, P3, P4);
    }
    
    public static int areaParalelograma(int [] punto1, int [] punto2, int [] punto3, int [] punto4){
        int base = punto1[0] - punto2[0];
        int altura = punto1[1] - punto2[1];
        if(base == altura || base <= 0 || altura <= 0){
            base = punto1[0] - punto3[0];
            if(base <= 0 || base == altura){
                base = punto1[0] - punto4[0];
                if(base <= 0 || base == altura){
                    base = punto4[0] - punto1[0];
                }
            }
            if(altura <= 0 || base == altura){
                altura = punto1[1] - punto3[1];
                if(altura <= 0 || base == altura){
                    altura = punto1[1] - punto4[1];
                    if(altura <= 0 || base == altura){
                        altura = punto4[1] - punto1[1];
                    }
                }
            }
        }
        int area = base * altura;
        return area;
    }
    
}
