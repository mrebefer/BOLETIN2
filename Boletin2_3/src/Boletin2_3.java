
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maria
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cantidad100, cantidad20, cantidad5, cantidad1;
        System.out.println("Introduzca la cantidad de billetes de 100€: ");
        cantidad100 = leer.nextInt();

        System.out.println("Introduzca la cantidad de billetes de 20€: ");
        cantidad20 = leer.nextInt();

        System.out.println("Introduzca la cantidad de billetes de 5€: ");
        cantidad5 = leer.nextInt();

        System.out.println("Introduzca la cantidad de monedas de 1€: ");
        cantidad1 = leer.nextInt();

        int billetes100 = 0, billetes20 = 0, billetes5 = 0;

        billetes100 = cantidad100 * 100;
        billetes20 = cantidad20 * 20;
        billetes5 = cantidad5 * 5;

        int total = billetes100 + billetes20 + billetes5 + cantidad1;

        System.out.println("Esta es la cantidad total de billetes: " + total);
    }

}
