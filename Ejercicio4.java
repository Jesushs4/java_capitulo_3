/**
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 * @author Jesús Herrera Sánchez
 */
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer numero a operar:");
        int num1 = sc.nextInt();
        System.out.println("Introduzca el segundo numero a operar:");
        int num2 = sc.nextInt();
        System.out.println(num1+" + "+num2+" = "+(num1+num2));
        System.out.println(num1+" - "+num2+" = "+(num1-num2));
        System.out.println(num1+" x "+num2+" = "+(num1*num2));
        System.out.println((double)num1+" / "+(double)num2+" = "+(double)num1/num2);
        sc.close();
    }
}
