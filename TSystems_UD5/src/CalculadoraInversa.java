import javax.swing.JOptionPane;

public class CalculadoraInversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 0;
		double b = 0;
		double resultado;
		
		String primerNum = JOptionPane.showInputDialog("Introduce el primer operando");
		a = Double.parseDouble(primerNum);
		
		String segundoNum = JOptionPane.showInputDialog("Introduce el segundo operando");
		b = Double.parseDouble(segundoNum);
		
		String signo = JOptionPane.showInputDialog("Introduce el signo aritmético para realizar la operación:");

		switch (signo) {
			case"+":
				resultado= a+b;
				JOptionPane.showMessageDialog(null,  "La suma de " +a+ " y " +b+ " es " +resultado);
				break;
			case"-":
				resultado= a-b;
				JOptionPane.showMessageDialog(null,  "La resta de " +a+ " y " +b+ " es " +resultado);
				break;
			case"*":
				resultado= a*b;
				JOptionPane.showMessageDialog(null,  "La multiplicación de " +a+ " y " +b+ " es " +resultado);
				break;
			case"/":
				resultado= a/b;
				JOptionPane.showMessageDialog(null,  "La división de " +a+ " y " +b+ " es " +resultado);
				break;
			case"^":
				resultado= Math.pow(a, b);
				JOptionPane.showMessageDialog(null,  "El resultado del número como base " +a+ " con exponente" +b+ " es " +resultado);
				break;
			case"%":
				resultado= a%b;
				JOptionPane.showMessageDialog(null,  "El resto de la división de " +a+ " y " +b+ " es " +resultado);
				break;
			default:
				JOptionPane.showMessageDialog(null,  "Entrada incorrecta");
		}
		
		
		
		
		
	}

}
