/**
 * Realiza un conversor de Mb a Kb.
 * @author Jesús Herrera Sánchez
 */
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca cuantos Mb desea convertir en Kb:");
        int mb = sc.nextInt();
        System.out.println(mb+" Mb son "+mb*1024+" Kb");
        sc.close();
    }
    
}
