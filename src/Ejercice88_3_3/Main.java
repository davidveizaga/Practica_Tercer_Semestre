package Ejercice88_3_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double x,pag;
        System.out.println("ingrese la cantidad de lapices");
        x=leer.nextDouble();
        if(x>=1000){
            pag=x*0.85;
        }else{
            pag=x*0.90;
        }
        System.out.println("el pago es : "+ pag);

    }
}
