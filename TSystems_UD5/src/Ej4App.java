import java.lang.Math;
import java.util.Scanner;

public class Ej4App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double area;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el radio del circulo:");
		
		String radio = sc.nextLine();
		sc.close();
		
		double numRadio = Double.parseDouble(radio);
		System.out.println("El radio introducido es: " +numRadio);
		
		area= Math.PI*(Math.pow(numRadio, 2));
		System.out.printf("El área del circulo es: %.2f", area);
	}

}
