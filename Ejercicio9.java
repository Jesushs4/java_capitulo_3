/**
 * Escribe un programa que calcule el volumen de un cono según la fórmula
 * V = 1/3*π*r^2*h
 * @author Jesús Herrera Sánchez
 */
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdzuca el radio del cono:");
        double radio = sc.nextDouble();
        System.out.println("Introduzca la altura del cono:");
        double altura = sc.nextDouble();
        double radio2 = Math.pow(radio, 2);
        double volumen =(1.0/3.0)*(3.1416)*(radio2)*(altura);
        System.out.println("El cono de radio "+radio+" y altura "+altura+" tiene un volumen de "+volumen);
        sc.close();

    }
    
}
