import javax.swing.JOptionPane;

public class Ej11App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dia = JOptionPane.showInputDialog("Introduce un día de la semana");
		
		switch(dia) {
			case"Lunes":
				JOptionPane.showMessageDialog(null,  "El Lunes es laboral");
				break;
			case "Martes":
				JOptionPane.showMessageDialog(null,  "El Martes es laboral");
				break;
			case "Miercoles":
				JOptionPane.showMessageDialog(null,  "El Miercoles es laboral");
				break;
			case "Jueves":
				JOptionPane.showMessageDialog(null,  "El Jueves es laboral");
				break;
			case "Viernes":
				JOptionPane.showMessageDialog(null,  "El Viernes es laboral");
				break;
			case "Sabado":
				JOptionPane.showMessageDialog(null,  "El Sabado no es laboral");
				break;
			case "Domingo":
				JOptionPane.showMessageDialog(null,  "El Domingo no es laboral");
				break;
			default:
				JOptionPane.showMessageDialog(null,  "Entrada incorrecta");
		}
	}
}
