/**
 * Escribe un programa que calcule el área de un triángulo.
 * @author Jesús Herrera Sánchez
 */
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la base del triángulo en metros");
        int base = sc.nextInt();
        System.out.println("Introduzca la altura del triángulo en metros");
        int altura = sc.nextInt();
        System.out.println("El triángulo de base "+base+" m y altura "+altura+" m tiene un área de "+(base*altura)/2+" m");
        sc.close();
        

    }
}
