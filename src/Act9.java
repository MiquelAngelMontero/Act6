/**
 * 
 * Miquel Angel Montero Act9 13/01/2022 
 * 
 */
import javax.swing.JOptionPane;
public class Act9 {
		
	public static void main(String[] args) {
	
		String tamS = JOptionPane.showInputDialog("Indica el tamanyo de la array");
		int tam = Integer.parseInt(tamS);
		
		int array[] = new int[tam];
		
		llenarArray(array);
		mostrarArray(array);
		System.out.println("La suma de los valores de la array es: "+sumarArray(array));
		
	}
	
	public static void llenarArray(int array[]) {

		for(int i=0; i<array.length; i++) {
			
			array[i] = (int) (Math.random() * (9 - 0)+0);
			
		}
		
	}
	
	public static void mostrarArray(int array[]) {
		System.out.println("Indice/Valor");
		
		for(int i = 0; i<array.length; i++){
			
			System.out.println(i+" / "+array[i]);
			
		}
	}
	
	public static int sumarArray(int array[]) {
		int suma = 0;
		
		for(int i=0; i<array.length; i++) {
			suma = suma + array[i];
		}
		
		return suma;
	}
}
