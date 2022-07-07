import javax.swing.JOptionPane;

public class Ej10App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		int sumaVentas=0;
		
		String numVentas = JOptionPane.showInputDialog("Introduce el número de ventas");
		
		int ventas = Integer.parseInt(numVentas);
		
		for(int i=1; i<=ventas; i++) {
			
			String tecladoVentas = JOptionPane.showInputDialog("Introduce el valor de la venta:" +i);
			
			int ventasFinal = Integer.parseInt(tecladoVentas);
			
			sumaVentas=ventasFinal+sumaVentas;
			}
		
		JOptionPane.showMessageDialog(null,  "El total de la suma de todas las ventas es: " +sumaVentas);
	}
}
