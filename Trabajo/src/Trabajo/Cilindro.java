package Trabajo;

import java.util.Scanner;

public class Cilindro {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el radio: ");
		int radio = scanner.nextInt();
		
		System.out.println("Ingrese la altura: ");
		int altura = scanner.nextInt();
		
		double area = calcularArea(radio, altura);
		
		System.out.println("El area del cilindro es: " + area);
	}
	public static double calcularArea(int radio, int altura ) {
		double area = 2 * 3.14 * radio * (altura + radio);
		return area;
	}

}
