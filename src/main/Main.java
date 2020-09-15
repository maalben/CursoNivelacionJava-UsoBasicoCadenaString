package main;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa una palabra: ");
        String palabra = teclado.nextLine();

        if(palabra.equals("casa")){
            System.out.println("La palabra " + palabra + " es casa");
        }else{
            System.out.println("La palabra " + palabra + " no es casa");
        }
    }
}
