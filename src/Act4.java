/**
 * 
 * Miquel Angel Montero Act4 13/01/2022 
 * 
 */
import javax.swing.JOptionPane;
public class Act4 {

	public static void main(String[] args) {

		String numS = JOptionPane.showInputDialog("Introduce un numero");
		int num = Integer.parseInt(numS);
		
		calcularFactorial(num);

	}
	
	public static void calcularFactorial(int num) {
		
		int mult = 1;
		
		for (int i=num; i>0; i--) {
			
			mult = mult * i;
			
		}
		
		JOptionPane.showMessageDialog(null, "El resultado de la operación es: "+mult);
		
	}
	
}
