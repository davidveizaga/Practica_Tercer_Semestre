package Ejercice96_4_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double ka,kb,r;
        Scanner leer=new Scanner(System.in);
        ka=70;
        kb=150;
        r=kb-ka;
        while (r>0){
            ka=ka+1;
            kb=kb-1;
            r=kb-ka;
        }
        if (r==0){
            ka=kb;
        }else{
            ka=ka-0.5;
        }
        System.out.println("Punto de encuentro es: "+ka);
    }
}
