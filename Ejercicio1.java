/**
 * Realiza un programa que pida dos números y que luego muestre el resultado
 * de su multiplicación.
 * @author Jesús Herrera Sánchez
 */
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un numero para multiplicar:");
        int num1 = sc.nextInt();
        System.out.println("Escriba otro numero para multiplicar:");
        int num2 = sc.nextInt();
        System.out.println(num1+" x "+num2+" = "+(num1*num2));
        sc.close();

    }

}