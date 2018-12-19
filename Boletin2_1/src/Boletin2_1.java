
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
public class Boletin2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        float precioTarifa = 0, precioPagado = 0;
        System.out.println("Introduzca el precio de la tarifa: ");
        precioTarifa = leer.nextFloat();
        System.out.println("Introduzca el precio pagado: ");
        precioPagado = leer.nextFloat();
        float porcentaje = (100 - precioPagado / precioTarifa * 100);
        System.out.println("El precio de la tarifa es: " + precioTarifa + " el precio pagado fue: " + precioPagado + " el descuento fue de " + porcentaje);

    }
}
