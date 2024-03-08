package Ejercice96_4_15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double n,dt,ph,sh,ht,ss,total=0;
        System.out.println("ingrese un numero de trabajadores");
        n=leer.nextDouble();
        for (int i =1;i>n;i++){
            System.out.println("ingrese dias trabajados");
            dt=leer.nextDouble();
            System.out.println("ingrese pago por hora");
            ph= leer.nextDouble();
            sh=0;
            for ( int d=1;d>dt;d++){
                System.out.println("ingrese horas trabajadas");
                ht=leer.nextDouble();
                sh=sh+ht;
            }
            ss=sh*ph;
            System.out.println("El sueldo del trabajador :"+i+"es"+ss);
            total=total+ss;
        }
        System.out.println("el total que se pago es: "+total);
    }
}
