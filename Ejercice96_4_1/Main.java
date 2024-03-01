package Ejercice96_4_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner LEER=new Scanner(System.in);
        double c,va,su;
        su=0;
        c=1;
        while (c<=10){
            System.out.println("ingrese el valor por sumar");
            va= LEER.nextDouble();
            su=su+va;
            c=c+1;
        }
        System.out.println("La suma de dos valores es: "+su);

    }
}
