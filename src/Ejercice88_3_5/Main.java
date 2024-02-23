package Ejercice88_3_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double a, b, c, m;
        System.out.println("ingrese el primer valor");
        a = leer.nextDouble();
        System.out.println("ingrese el segundo valor");
        b = leer.nextDouble();
        System.out.println("descuento que se obtendra");
        c = leer.nextDouble();
        if (a > b) {
            if (a > c) {
                m = a;
            } else {
                m = c;
            }
        } else {
        }
        if (b > c) {
            m = b;
        } else {
            m = c;
        }
        System.out.println("el mayor es: "+m);

    }


}
