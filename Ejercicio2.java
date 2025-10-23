import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el radio: ");
        double r = sc.nextDouble();
        double longitud = 2 * Math.PI * r;
        double area = Math.PI * r * r;
        System.out.println("Longitud: " + longitud);
        System.out.println("Área: " + area);
    }
}