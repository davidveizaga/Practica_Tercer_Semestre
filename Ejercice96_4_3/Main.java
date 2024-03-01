package Ejercice96_4_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner LEER=new Scanner(System.in);
        double su,c,va;
        su=0;
        for (double i =1;i<=10;i++) {
            System.out.println("ingrese el numero a sumar ");
            va = LEER.nextDouble();
            su = su + va;
        }
        System.out.println(" la suma total es"+su);
    }
}
