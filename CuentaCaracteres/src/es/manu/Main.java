package es.manu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String textico;
        char letrica;
        int contador = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dame un texto: ");
        textico = entrada.nextLine();

        System.out.print("Dame una letrica: ");
        letrica = entrada.nextLine().charAt(0);

        for (int i = 0; i < textico.length(); i++) {
            if (textico.charAt(i) == letrica) contador++;
        }

        System.out.println("la letrica " + letrica + " esta repetia " + contador + " vece");
    }
}
