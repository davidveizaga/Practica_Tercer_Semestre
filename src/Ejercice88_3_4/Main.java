package Ejercito88_3_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double ct,de,pf;
        System.out.println("ingrese el costo del traje");
        ct=leer.nextDouble();
        System.out.println("descuento que se obtendra");
        de=leer.nextDouble();
        if(ct>2500){
            de=ct*0.15;
        }else {
            de=ct*0.08;
        }
        pf=ct-de;
        System.out.println("el precio final es: "+pf);
        System.out.println("el descuento es : "+de);
    }
}
