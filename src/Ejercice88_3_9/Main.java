package Ejercice88_3_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double ti,pag,imp,total;
        String di;
        String tu;
        System.out.println("ingrese el tiempo");
        ti= leer.nextDouble();
        System.out.println("ingrese un tipo");
        di= leer.nextLine();
        System.out.println("ingrese el tipo de turno ");
        tu= leer.nextLine();

        if (ti<=5){
            pag=ti*1;
        }else{
            if (ti<=8){
                pag=(ti-5)*0.8+5.0;
            }else{
                if (ti<=10){
                    pag=(ti-8)*0.7+7.4;
                }else{
                    pag=(ti-10)*0.5+8.8;
                }
            }
        }
        if (di=="dom"){
            imp=pag*0.05;

        }else{
            if (tu=="m"){
                imp=pag*0.15;
            }else{
                imp=pag*0.10;
            }
        }
        total=pag+imp;
        System.out.println("el pago es: "+pag);
        System.out.println("el impuesto es: "+imp);
        System.out.println("el pago total es: "+total);

    }
}
