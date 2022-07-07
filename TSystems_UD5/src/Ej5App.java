import java.util.Scanner;

public class Ej5App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double resto;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número por teclado:");
		
		String num = sc.nextLine();
		sc.close();
		
		double num1 = Double.parseDouble(num);
		resto = num1%2;
		
		if(resto == 0) {
			System.out.println("El valor introducido por teclado es divisible entre 2");
		}else {
			System.out.println("El valor introducido por teclado NO es divisible entre 2");
		}
		
	}

}
