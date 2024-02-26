package Ejercice88_3_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double num;
        String r;
        System.out.println("valor para determinar su signo");
        num=leer.nextDouble();

        if(num>=0){
            r="positivo";
        }else{
            r="negativo";
        }
        System.out.println("el numero es :"+r);
    }
}
