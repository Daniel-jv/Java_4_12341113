package tarea_jerarquia_de_herencia_cuadrilatero;

import java.util.Arrays;

public class Cuadrilatero {
    
    private int [] P1;
    private int [] P2;
    private int [] P3;
    private int [] P4;

    public Cuadrilatero(int[] P1, int[] P2, int[] P3, int[] P4) {
        this.P1 = P1;
        this.P2 = P2;
        this.P3 = P3;
        this.P4 = P4;
    }
    
    @Override
    public String toString() {
        return "Punto 1 -> " + Arrays.toString(P1) + "\nPunto 2 -> " + Arrays.toString(P2) + "\nPunto 3 -> " + Arrays.toString(P3) + "\nPunto 4 -> " + Arrays.toString(P4);
    }

    public int[] getP1() {
        return P1;
    }

    public void setP1(int[] P1) {
        this.P1 = P1;
    }

    public int[] getP2() {
        return P2;
    }

    public void setP2(int[] P2) {
        this.P2 = P2;
    }

    public int[] getP3() {
        return P3;
    }

    public void setP3(int[] P3) {
        this.P3 = P3;
    }

    public int[] getP4() {
        return P4;
    }

    public void setP4(int[] P4) {
        this.P4 = P4;
    }
    
}
