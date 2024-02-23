package Ejercice88_3_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double np,total;
        System.out.println("ingrese el costo del traje");
        np=leer.nextDouble();
        if(np>300){
            total=np*75;
        }else{

        }if(np>200){
            total=np*85;
        }else{
            total=np*95;
        }
        System.out.println("el total es: "+total);
    }
}
