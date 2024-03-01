package Ejercice96_4_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double c,ca,cp,cn,nu;
        cp=0;
        cn=0;
        System.out.println("ingrese un numero");
        nu=leer.nextDouble();
        c=1;
        do {
            System.out.println("ingrese un numero");
            ca=leer.nextDouble();
            if (ca>0){
                cp=cp+1;
            }else {cn=cn+1;}
        }while (c>nu);
        System.out.println("positivo: "+cp);
        System.out.println("negativo: "+cn);

    }
}
