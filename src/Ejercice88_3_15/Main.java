package Ejercice88_3_15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double tt, la,ac,ns;
        String nc="a";
        System.out.println("");
        tt=leer.nextDouble();
        System.out.println("");
        la= leer.nextDouble();
        if (nc =="a"){
            ac=la*0.25;
            ac=la*0.35;
            ac=la*0.40;
        }else{
            ac=la*0.50;
        }
        ns=la+ac;
        System.out.println("El aumento de credito es: "+ac);
        System.out.println("Nuevo limite de credito es: "+ns);
    }
}
