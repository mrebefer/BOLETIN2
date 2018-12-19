
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
public class Boletin2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner se usa para introducir texto
        Scanner leer = new Scanner(System.in);
        float temperaturaC = 0;
        System.out.println("Intrdouzca temperatura celsius: ");
        temperaturaC = leer.nextFloat();
        //formula kelvin
        float conversionKelvin = (float) (temperaturaC + 273.15f);
        System.out.println(+temperaturaC + " grados son " + conversionKelvin + " grados kelvin");
        //formula fahrenheit
        float conversionFahrenheit = (float) ((temperaturaC * 1.8) + 32);
        System.out.println(temperaturaC + " grados son " + conversionFahrenheit + " grados fahrenheit");

    }
}


