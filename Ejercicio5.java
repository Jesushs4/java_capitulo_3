/**
 * Escribe un programa que calcule el área de un rectángulo.
 * @author Jesús Herrera Sánchez
 */
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la base del rectángulo en metros");
        int base = sc.nextInt();
        System.out.println("Introduzca la altura del rectángulo en metros");
        int altura = sc.nextInt();
        System.out.println("El rectángulo de base "+base+" m y altura "+altura+" m tiene un área de "+(base*altura)+" m");
        sc.close();
        

    }
}
