package Ejercice96_4_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner LEER=new Scanner(System.in);
        double su,c,ed,nu,pr;
        su = 0;

        System.out.println("ingrese un numero");
        nu = LEER.nextDouble();
        c=1;
        do {
            System.out.println("ingrese un numero a sumar");
            ed = LEER.nextDouble();
            su = su + ed;
            c = c + 1;

        }while (c>=nu);
        pr=su/nu;
        System.out.println("la suma total es: "+pr);

        }
    }

