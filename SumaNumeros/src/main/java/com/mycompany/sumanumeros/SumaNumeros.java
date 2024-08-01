package com.mycompany.sumanumeros;

import java.util.Scanner;

public class SumaNumeros {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("digite un numero");
        int num = entrada.nextInt();
        System.out.println("digite un segundo numero");
        int num2 = entrada.nextInt();

        sumaNumeros(num,num2);
    }

    public static void sumaNumeros(int num,int num2) {

        int suma = num + num2;
        System.out.println("la suma es: "+suma);
    }
}
