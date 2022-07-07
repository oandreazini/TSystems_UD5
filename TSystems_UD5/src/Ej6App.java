import javax.swing.JOptionPane;

public class Ej6App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double IVA=0.21;
		
		String numero = JOptionPane.showInputDialog("Introduce el precio de un producto:");
		
		//JOptionPane.showMessageDialog(null, "El precio del producto sin IVA es: " +numero);
		
		double precio = Double.parseDouble(numero);
		double precioIva=precio*IVA+precio;	
		
		JOptionPane.showMessageDialog(null,  "El precio del producto con IVA es: " +precioIva);
		
	}	
}
