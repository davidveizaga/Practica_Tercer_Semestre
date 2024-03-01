package Ejercice88_3_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double nc,cc,total;
        System.out.println("tipo de la uva");
        nc=leer.nextDouble();

        if (nc<=3){
            cc=200;
            total=nc*cc;
        }else {
            if (nc<=5){
                cc=150;
                total=(nc-3)*150+600;
            }else {
                if (nc<=8){
                    cc=100;
                    total=(nc-5)*100+900;
                }else {
                    cc=50;
                    total=(nc-8)*50+1200;
                }
            }
        }
        System.out.println("El costo de la consulta es: "+cc);
        System.out.println("El costo del tratamineto es: "+total);

    }
}
