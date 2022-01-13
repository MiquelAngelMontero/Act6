/**
 * 
 * Miquel Angel Montero Act11 13/01/2022 
 * 
 */
import javax.swing.JOptionPane;
public class Act11 {

	public static void main(String[] args) {
		
		String tamS = JOptionPane.showInputDialog("Indica el tamanyo de la array");
		int tam = Integer.parseInt(tamS);
		
		int array1[] = new int[tam];
		int array2[] = new int[tam];
		
		llenarArray(array1);
		llenarArray(array2);
		
		multiplicarArray(array1, array2);
		
		System.out.println("Array1: ");
		mostrarArray(array1);
		
		System.out.println("\nArray2");
		mostrarArray(array2);
		
		System.out.println("\nArray multiplicada");
		mostrarArray(multiplicarArray(array1, array2));
		
	}
	
	public static void llenarArray(int array[]) {

		for(int i=0; i<array.length; i++) {
			
			array[i] = (int) (Math.random() * (9 - 0)+0);
			
		}
		
	}
	
	public static int[] multiplicarArray(int array1[], int array2[]) {
		
		int arrayres[] = new int[array1.length];
		
		for(int i=0; i<array1.length; i++) {
			
			arrayres[i] = array1[i] * array2[i];
			
		}
		
		return arrayres;
		
	}
	
	public static void mostrarArray(int array[]) {
		System.out.println("Indice/Valor");
		
		for(int i = 0; i<array.length; i++){
			
			System.out.println(i+" / "+array[i]);
			
		}
	}
	
}
