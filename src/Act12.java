/**
 * 
 * Miquel Angel Montero Act12 13/01/2022 
 * 
 */
import javax.swing.JOptionPane;
public class Act12 {

	public static void main(String[] args) {

		String tamS = JOptionPane.showInputDialog("Indica el tamanyo de la array");
		int tam = Integer.parseInt(tamS);
		
		String numf = JOptionPane.showInputDialog("Indica el número final");
		
		int array[] = new int[tam];
		
		llenarArray(array);
		mostrarArray(array);
		mostrarArray(arrayNumeroFinal(array, numf));
		
	}
	
	public static void llenarArray(int array[]) {

		for(int i=0; i<array.length; i++) {
			
			array[i] = (int) (Math.random() * (300 - 1)+1);
			
		}
		
	}
	
	public static void mostrarArray(int array[]) {
		System.out.println("\nIndice/Valor");
		
		for(int i = 0; i<array.length; i++){
			if(array[i] != 0) {
				System.out.println(i+" / "+array[i]);
			}
		}
	}
	
	public static int[] arrayNumeroFinal(int arrayent[], String num) {
		
		int arraysal[] = new int[arrayent.length];
		int cont = 0;
		
		for(int i=0; i<arrayent.length; i++) {
			
			String str = Integer.toString(arrayent[i]);
			
			if(str.endsWith(num)) {
				
				arraysal[cont] = Integer.parseInt(str);
				cont++;
				
			}
			
		}
		
		return arraysal;
	}

}
