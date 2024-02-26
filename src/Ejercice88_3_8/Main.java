package Ejercice88_3_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double na ,pa,total;
        System.out.println("ibgrese el numero de alumnos que realiaran el viaje");
        na= leer.nextDouble();
        if (na>=100) {
            pa=65.0;
        }else{
            if (na>=50){
                pa=70;
            }else{
                if(na>=30){
                    pa=95.0;
                }else{
                    pa=4000/na;
                }
            }
        }
        total=pa*na;
        System.out.println("el pago individual es: "+pa);
        System.out.println("el pago total es: "+total);

    }
}
