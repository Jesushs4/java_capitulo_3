/**
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 * @author Jesús Herrera Sánchez
 */
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos euros desea convertir a pesetas?");
        int euros = sc.nextInt();
        double pesetas=euros*166.386;
        System.out.println(euros+" euros son "+pesetas+" pesetas");
        sc.close();
    }
    
}
