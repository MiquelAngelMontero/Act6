/**
 * 
 * Miquel Angel Montero Act2 13/01/2022 
 * 
 */
import javax.swing.JOptionPane;
public class Act2 {

	public static void main(String[] args) {
		
		String cantS = JOptionPane.showInputDialog("Introduce la cantidad de numeros aleatorios a generar");
		int cant = Integer.parseInt(cantS);
		
		String minS = JOptionPane.showInputDialog("Introduce el numero mínimo del rango");
		int min = Integer.parseInt(minS);
		
		String maxS = JOptionPane.showInputDialog("Introduce el numero máximo del rango");
		int max = Integer.parseInt(maxS);
		
		for(int i=0; i<cant; i++) {
			System.out.println(generarAleatorio(max, min));
		}

	}
	
	public static double generarAleatorio(int max, int min) {
		
		int res = (int) (Math.random() * (max - min)+min);
		
		return res;
	}
	
}
