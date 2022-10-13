/**
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 * @author Jesús Herrera Sánchez
 */
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántas pesetas desea convertir a euros?");
        int pesetas = sc.nextInt();
        double euros=pesetas/166.386;
        System.out.println(pesetas+" pesetas son "+euros+" euros");
        sc.close();
    }
    
}
