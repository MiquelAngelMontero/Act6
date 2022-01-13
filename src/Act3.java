/**
 * 
 * Miquel Angel Montero Act3 13/01/2022 
 * 
 */
import javax.swing.JOptionPane;
public class Act3 {

	public static void main(String[] args) {

		String numS = JOptionPane.showInputDialog("Introduce un n�mero");
		int num = Integer.parseInt(numS);
		
		if(calcularPrimo(num)) {
			JOptionPane.showMessageDialog(null, "El n�mero introducido es primo");
		}else {
			JOptionPane.showMessageDialog(null, "El n�mero introducido no es primo");
		}

	}
	
	public static boolean calcularPrimo(int num) {
		int cont = 2;
		boolean vuelta = true;
		
		while((vuelta) && (cont != num)) {
			if(num%cont == 0) {
				vuelta = false;
			}
			cont++;
		}
		return vuelta;
			
	}

}

