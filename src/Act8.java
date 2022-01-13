/**
 * 
 * Miquel Angel Montero Act8 13/01/2022 
 * 
 */
import javax.swing.JOptionPane;
public class Act8 {
	
	public static void main(String[] args) {

		int array[] = new int[10];
		llenarArray(array);
		mostrarArray(array);
		
	}
	
	public static void llenarArray(int array[]) {

		for(int i=0; i<10; i++) {
			
			String iS = JOptionPane.showInputDialog("Introduce un número en la posición "+i+" de la array");
			array[i] = Integer.parseInt(iS);
			
		}
		
	}
	
	public static void mostrarArray(int array[]) {
		System.out.println("Indice/Valor");
		
		for(int i = 0; i<10; i++){
			
			System.out.println(i+" / "+array[i]);
			
		}
		
	}
	
}
