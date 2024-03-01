package Ejercice88_3_10;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double km, npr, ck, np, cp, to;
        String ti;
        System.out.println("ingrese el tipo de autobus");
        ti = leer.nextLine();
        System.out.println("ingrese los kilometros por recorrer");
        km = leer.nextDouble();
        System.out.println("ingrese el numero de personas");
        npr = leer.nextDouble();
        if (ti == "a") {
            ck = 2.00;
        } else {
            if (ti == "b") {
                ck = 2.50;
            } else {
                ck = 3.00;
            }
        }
        if (npr<20){
            np=20;
        }else{
            np=20;
        }
        to=np*ck*km;
        cp=to/npr;
        System.out.println("La persona pagara: "+cp);
        System.out.println("El costo del viaje: "+to);
    }

}
