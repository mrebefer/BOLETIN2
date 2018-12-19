
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
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cantidadEntera;
        int billetes100, billetes20, billetes5, monedas1;
        System.out.println("Introduzca la cantidad entera: ");
        cantidadEntera = leer.nextInt();

        billetes100 = cantidadEntera / 100;
        billetes20 = cantidadEntera % 100 / 20;
        billetes5 = cantidadEntera % 100 / 5;
        monedas1 = cantidadEntera % 100 / 1;
        System.out.println("Son " + billetes100 + " billete(s) de 100: " + billetes20 + " billete(s) de 20: " + billetes5 + " billete(s) de 5: " + monedas1 + " :moneda(s) de 1");
    }

}
