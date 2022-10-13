/**
 * Realiza un conversor de Kb a Mb.
 * @author Jesús Herrera Sánchez
 */
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca cuantos Kb desea convertir en Mb:");
        double kb = sc.nextInt();
        System.out.println(kb+" Kb son "+kb/1024+" Mb");
        sc.close();
    }
}
