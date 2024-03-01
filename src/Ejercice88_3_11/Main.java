package Ejercice88_3_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double n,pa,ca,to,total;
        String ti,tp;
        System.out.println("ingrese el numero de hamburgesa");
        n=leer.nextInt();
        System.out.println("ingrese el tipo de hamburgesa");
        ti=leer.nextLine();
        System.out.println("ingrese el tipo de pago");
        tp=leer.nextLine();

        if (ti=="Sencilla"){
            pa=20.00;
        }else{
            if (ti=="Doble"){
                pa=25.00;
            }else {
                pa=28.00;
            }
        }
        to=pa*n;
        if (tp=="Tarjeta"){
            ca=to*0.05;
        }else{
            ca=0;
        }
        total=to+ca;
        System.out.println("la hamburgesa costo: "+pa);
        System.out.println("El total sin cargo es: "+to);
        System.out.println("El cargo es: "+ca);
        System.out.println("El total por pagar es: "+total);
    }
}
