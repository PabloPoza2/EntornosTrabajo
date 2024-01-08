package Trabajo;

import java.util.Scanner;

public class Circunferencia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        double area = calcularArea(radio);
        double perimetro = calcularPerimetro(radio);

        System.out.println("Área de la circunferencia: " + area);
        System.out.println("Perímetro de la circunferencia: " + perimetro);

        scanner.close();
    }

    public static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double calcularPerimetro(double radio) {
        return 2 * Math.PI * radio;
    }
}
