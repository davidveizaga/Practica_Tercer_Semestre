package Ejercice88_3_13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double c,mp,mo,gf,cp,pv;
        System.out.println("tipo de la uva");
        mp=leer.nextDouble();
        System.out.println("tamaño de la uva");
        c=leer.nextDouble();
        if (c==3 || c==4){
            mo= mp*0.75;
        }else{
            if (c==1 || c==5){
                mo=mp*0.80;
            }else {
                mo=mp*0.85;
            }
        }
        if(c==2 || c==06){
            gf=mp*0.30;
        }else{
            if (c==3 || c==6){
                gf=mp*0.35;
            }else {
                gf=mp*0.28;
            }
        }
        cp=mp+mo+gf;
        pv=cp+cp*0.45;
        System.out.println("El costo de produccion es: "+cp);
        System.out.println("El precio de venta es: "+pv);

    }
}
