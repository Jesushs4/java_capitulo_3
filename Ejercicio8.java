/**
 * Escribe un programa que calcule el salario semanal de un empleado en base a
 * las horas trabajadas, a razón de 12 euros la hora.
 * @author Jesús Herrera Sánchez
 */
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca las horas que has trabajado");
        int horas = sc.nextInt();
        System.out.println("Se han trabajado "+horas+" horas, por lo que a 12 euros la hora se cobrarán "+horas*12+" euros");
        sc.close();

    }
    
}
