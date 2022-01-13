/**
 * 
 * Miquel Angel Montero Act6 13/01/2022 
 * 
 */
import javax.swing.JOptionPane;
public class Act6 {

	public static void main(String[] args) {
		int num;
		do {
			String numS = JOptionPane.showInputDialog("Introduce un numero positivo");
			num = Integer.parseInt(numS);
		}while(num <= 0);
		
		JOptionPane.showMessageDialog(null, "Tu número tiene "+calcularCifras(num)+" cifras");

	}
	
	public static int calcularCifras(int num) {
		
		String numS = Integer.toString(num);
		int cifras = numS.length();
		return cifras;
		
	}
	
}
