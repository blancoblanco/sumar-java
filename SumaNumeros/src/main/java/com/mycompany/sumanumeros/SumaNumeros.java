package com.mycompany.sumanumeros;

import java.util.Scanner;

public class SumaNumeros {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        int num2=entrada.nextInt();
         
        int suma = num + num2;
    
        
        System.out.println(suma);

    }
}
