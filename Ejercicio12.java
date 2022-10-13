/**
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay
 * que tener en cuenta que la nota del primer examen cuenta el 40% y la del
 * segundo examen un 60%.
 * @author Jesús Herrera Sánchez
 */
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce la nota del primer examen:");
    double nota1 = sc.nextDouble();
    System.out.println("¿Qué nota quieres sacar en el trimestre?");
    double nota2 = sc.nextDouble();
    double notafinal = ((nota2-(nota1*0.4))/0.6);
    System.out.println("Para tener un "+nota2+" deberás sacar un "+notafinal+" en el segundo examen");
    sc.close();

    }
}
