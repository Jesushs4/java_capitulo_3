/**
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible.
 * @author Jesús Herrera Sánchez
 */
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba la base imponible de la factura a calcular:");
        double baseimp = sc.nextDouble();
        double iva = 1.21;
        System.out.println("La base imponible es de "+baseimp+" euros, y la factura será de "+baseimp*iva+" euros");
        sc.close();
    }
    
}
