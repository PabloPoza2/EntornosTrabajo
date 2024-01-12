package Trabajo;
import java.util.Scanner;

public class AreaCubo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del lado del cubo: ");
        
        double longitudLado = scanner.nextDouble();

        double areaCubo = 6 * Math.pow(longitudLado, 2);

        System.out.println("El área del cubo es: " + areaCubo);

        scanner.close();
    }
}
