import javax.swing.JOptionPane;

public class Ej12App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String contraseña ="Ej12App";
		
		for(int i=1; i<=3; i++) {
			String contra = JOptionPane.showInputDialog("Introduce la contraseña");
			if(contraseña.equals(contra)) {
				JOptionPane.showMessageDialog(null,  "Enhorabuena");
				break;
			}	
		}
	}
}
