package Ejercice88_3_14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double pe,co;
        String ns="a";
        ns=leer.nextLine();
        pe=leer.nextDouble();
        if (pe>5000){
            System.out.println("no se puede dar el servicio");
        }else{
            if (ns=="a"){
                co=pe*11;
                co=pe*10;
                co=pe*12;
                co=pe*24;
            }else {
                co=pe*27;
            }
            System.out.println("el costo del servicio es: "+co);
        }
    }
}
