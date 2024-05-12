package tarea_jerarquia_de_herencia_cuadrilatero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import static tarea_jerarquia_de_herencia_cuadrilatero.Cuadrado.areaCuadrado;
import static tarea_jerarquia_de_herencia_cuadrilatero.Paralelogramo.areaParalelograma;
import static tarea_jerarquia_de_herencia_cuadrilatero.Punto.dibujar;
import static tarea_jerarquia_de_herencia_cuadrilatero.Punto.formato;
import static tarea_jerarquia_de_herencia_cuadrilatero.Punto.geTamaño;
import static tarea_jerarquia_de_herencia_cuadrilatero.Rectangulo.areaRectangulo;
import static tarea_jerarquia_de_herencia_cuadrilatero.Trapezoide.areaTrapezoide;

public class Tarea_Jerarquia_de_Herencia_Cuadrilatero {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Cuadrado> listaCuads = new ArrayList<>();
        ArrayList<Rectangulo> listaRect = new ArrayList<>();
        ArrayList<Paralelogramo> listaParal = new ArrayList<>();
        ArrayList<Trapezoide> listaTrapz = new ArrayList<>();
        boolean var = true;
        while(var){
            System.out.println("---MENU\n1.Crear figura\n2.Listar Cuadrilateros\n3.Salir\nOpcion: ");
            int op = leer.nextInt();
            switch(op){
                
                case 1 ->{
                    System.out.print("Ingrese los cuatro puntos a continuacion (Con el formato x,y )\nPunto 1: ");
                    String p1 = leer.next();
                    int [] punto1 = formato(p1);
                    System.out.print("Punto 2: ");
                    String p2 = leer.next();
                    int [] punto2 = formato(p2);
                    System.out.print("Punto 3: ");
                    String p3 = leer.next();
                    int [] punto3 = formato(p3);
                    System.out.print("Punto 4: ");
                    String p4 = leer.next();
                    int [] punto4 = formato(p4);
                    while(punto1[0] < 0 || punto1[1] < 0 || punto2[0] < 0 || punto2[1] < 0 || punto3[0] < 0 || punto3[1] < 0 || punto4[0] < 0 || punto4[1] < 0 
                            || p1.length() != 3 || p2.length() != 3 || p3.length() != 3 || p4.length() != 3){
                        System.out.println("Ningun punto puede contener un valor negativo (No hay area negativa), intentelo otra vez.");
                        if(punto1[0] < 0 || punto1[1] < 0 || p1.length() != 3){
                            System.out.println("Punto 1: ");
                            p1 = leer.next();
                            punto1 = formato(p1);
                        }
                        if(punto2[0] < 0 || punto2[1] < 0 || p2.length() != 3){
                            System.out.println("Punto 2: ");
                            p2 = leer.next();
                            punto2 = formato(p2);
                        }
                        if(punto3[0] < 0 || punto3[1] < 0 || p3.length() != 3){
                            System.out.println("Punto 3: ");
                            p3 = leer.next();
                            punto3 = formato(p3);
                        }
                        if(punto4[0] < 0 || punto4[1] < 0 || p4.length() != 3){
                            System.out.println("Punto 4: ");
                            p4 = leer.next();
                            punto4 = formato(p4);
                        }
                    }
                    ArrayList<int []> puntos = new ArrayList<>();
                    puntos.add(punto1);
                    puntos.add(punto2);
                    puntos.add(punto3);
                    puntos.add(punto4);
                    int sumax = 0;
                    int sumay = 0;
                    for (int i = 0; i < puntos.size(); i++) {
                        int sumar = puntos.get(i)[0];
                        sumax = sumax + sumar;
                    }
                    for (int i = 0; i < puntos.size(); i++) {
                        int sumar = puntos.get(i)[1];
                        sumay = sumay + sumar;
                    }
                    int perimetro = sumay + sumax;
                    if((punto1[0] == punto2[0] && punto2[0] == punto3[0]) || (punto2[0] == punto3[0] && punto3[0] == punto4[0]) || (punto3[0] == punto4[0] && punto4[0] == punto1[0])|| (punto4[0] == punto1[0] && punto1[0] == punto2[0])
                            || (punto1[1] == punto2[1] && punto2[1] == punto3[1]) || (punto2[1] == punto3[1] && punto3[1] == punto4[1]) || (punto3[1] == punto4[1] && punto4[1] == punto1[1])|| (punto4[1] == punto1[1] && punto1[1] == punto2[1])){
                        System.out.println("---ESO NO ES UNA CUADRILATERO....");
                    }else if((punto1[0] <= punto1[1] && punto2[0] < punto2[1] && punto3[0] < punto3[1])
                            || (punto1[0] >= punto1[1] && punto2[0] > punto2[1] && punto3[0] > punto3[1])
                            || (punto2[0] <= punto2[1] && punto3[0] < punto3[1] && punto4[0] < punto4[1])
                            || (punto2[0] >= punto2[1] && punto3[0] > punto3[1] && punto4[0] > punto4[1])
                            || (punto3[0] <= punto3[1] && punto4[0] < punto4[1] && punto1[0] < punto1[1])
                            || (punto3[0] >= punto3[1] && punto4[0] > punto4[1] && punto1[0] > punto1[1])
                            || (punto4[0] <= punto4[1] && punto1[0] < punto1[1] && punto2[0] < punto2[1])
                            || (punto4[0] >= punto4[1] && punto1[0] > punto1[1] && punto2[0] > punto2[1])){
                        System.out.println("---ES UN PARALELOGRAMO---");
                        Paralelogramo paralelogramo = new Paralelogramo(punto1,punto2,punto3,punto4);
                        dibujar(punto1,punto2,punto3,punto4,geTamaño(punto1, punto2, punto3, punto4));
                        System.out.println("AREA: "+areaParalelograma(punto1,punto2, punto3, punto4));
                        listaParal.add(paralelogramo);
                    }else if((sumax > sumay || sumay > sumax ) && perimetro % 2 == 0){
                        System.out.println("---ES UN RECTANGULO---");
                        Rectangulo rectangulo = new Rectangulo(punto1,punto2,punto3,punto4);
                        dibujar(punto1,punto2,punto3,punto4,geTamaño(punto1, punto2, punto3, punto4));
                        System.out.println("AREA: "+areaRectangulo(punto1,punto2, punto3, punto4));
                        listaRect.add(rectangulo);
                    }else if(sumax == sumay && perimetro % 2 == 0){
                        System.out.println("---ES UN CUADRADO---");
                        Cuadrado cuadrado = new Cuadrado(punto1,punto2,punto3,punto4);
                        dibujar(punto1,punto2,punto3,punto4,geTamaño(punto1, punto2, punto3, punto4));
                        System.out.println("AREA: "+areaCuadrado(punto1,punto2));
                        listaCuads.add(cuadrado);
                    }else{
                        System.out.println("---ES UN TRAPEZOIDE---");
                        Trapezoide trapezoide = new Trapezoide(punto1,punto2,punto3,punto4);
                        dibujar(punto1,punto2,punto3,punto4,geTamaño(punto1, punto2, punto3, punto4));
                        System.out.println("AREA: "+areaTrapezoide(puntos));
                        listaTrapz.add(trapezoide);
                    }

                }
                
                case 2 ->{
                    System.out.println("---LISTA CUADRILATEROS");
                    for (int i = 0; i < listaCuads.size(); i++) {
                        System.out.println("\n---CUADRADO "+(i+1));
                        System.out.println(Arrays.toString(listaCuads.get(i).getP1()));
                        System.out.println(Arrays.toString(listaCuads.get(i).getP2()));
                        System.out.println(Arrays.toString(listaCuads.get(i).getP3()));
                        System.out.println(Arrays.toString(listaCuads.get(i).getP4()));
                     }
                    for (int i = 0; i < listaRect.size(); i++) {
                        System.out.println("\n---RECTANGULO "+(i+1));
                        System.out.println(Arrays.toString(listaRect.get(i).getP1()));
                        System.out.println(Arrays.toString(listaRect.get(i).getP2()));
                        System.out.println(Arrays.toString(listaRect.get(i).getP3()));
                        System.out.println(Arrays.toString(listaRect.get(i).getP4()));
                    }
                    for (int i = 0; i < listaParal.size(); i++) {
                        System.out.println("\n---PARALELOGRAMO "+(i+1));
                        System.out.println(Arrays.toString(listaParal.get(i).getP1()));
                        System.out.println(Arrays.toString(listaParal.get(i).getP2()));
                        System.out.println(Arrays.toString(listaParal.get(i).getP3()));
                        System.out.println(Arrays.toString(listaParal.get(i).getP4()));
                    }
                    for (int i = 0; i < listaTrapz.size(); i++) {
                        System.out.println("\n---TRAPEZOIDE "+(i+1));
                        System.out.println(Arrays.toString(listaTrapz.get(i).getP1()));
                        System.out.println(Arrays.toString(listaTrapz.get(i).getP2()));
                        System.out.println(Arrays.toString(listaTrapz.get(i).getP3()));
                        System.out.println(Arrays.toString(listaTrapz.get(i).getP4()));
                    }
                }
                case 3 ->{
                    System.out.println("SALIO...");
                    var = false;
                }
                
            }
            System.out.println();
                
        }
            
    }
    
}
