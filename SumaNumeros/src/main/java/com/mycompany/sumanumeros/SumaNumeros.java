package com.mycompany.sumanumeros;

import java.util.Scanner;

public class SumaNumeros {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num = entrada.nextInt();
        int num2 = entrada.nextInt();

        sumaNumeros(num,num2 );

    }

    public static int sumaNumeros(int num,int num2) {

        int suma = num + num2;
        return suma;
    }
}
