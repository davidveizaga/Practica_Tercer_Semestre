package Ejercice96_4_13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int i;
        float p,t=0;
        p=5.0f;
        for ( i=1;i<=20;i++){
            p=p*2;
            System.out.println("El pago mensual es: "+p);
            t=t+p;
        }
        System.out.println("Pago total es: "+t);
    }
}
