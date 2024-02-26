package Ejercice88_3_7;

import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double ta, p, k, ga;
        String ti="a";


        System.out.println("tamaño de la uva");
        ta = leer.nextDouble();
        System.out.println("precio da la uva");
        p = leer.nextDouble();
        System.out.println("kilos de la produccion");
        k = leer.nextDouble();
        if (ti=="a" ) {
            if (ta == 1) {
                p = p + 0.20;

            } else {
            p = p + 0.30;
            }
        }else {
            if (ta==2){
                p = p - 0.30;
            }else  {
                    p = p - 0.50;

            }
        }
        ga = p * k;
        System.out.println("la ganacia es: " + ga);

    }

}