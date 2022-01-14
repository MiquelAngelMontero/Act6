/**
 * 
 * Miquel Angel Montero Act10 13/01/2022 
 * 
 */
import javax.swing.JOptionPane;
public class Act10 {

	public static void main(String[] args) {

		String tamS = JOptionPane.showInputDialog("Indica el tamanyo de la array");
		int tam = Integer.parseInt(tamS);
		
		String maxS = JOptionPane.showInputDialog("Indica el valor máximo aleatorio");
		int max = Integer.parseInt(maxS);
		
		String minS = JOptionPane.showInputDialog("Indica el valor mínimo aleatorio");
		int min = Integer.parseInt(minS);
		
		int array[] = new int[tam];
		
		llenarArrayPrimos(array, min, max);
		mostrarArray(array);
		
		System.out.println("En número más grande de la array es el "+calcularMaximo(array));

	}

	public static void llenarArrayPrimos(int array[], int min, int max) {

		for(int i=0; i<array.length; i++) {
			boolean primo = false;
			
			do {
				
				int rand = (int) (Math.random() * (max - min)+min);
				if (calcularPrimo(rand)) {
					array[i]=rand;
					primo = true;
				}
				
			}while(primo==false);
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
	
	public static int calcularMaximo(int array[]) {
		int max = 0;
		
		for(int i=0; i<array.length; i++) {
			if (array[i]>max) {
				max = array[i];
			}
		}
		
		return max;
	}
	
	public static void mostrarArray(int array[]) {
		System.out.println("Indice/Valor");
		
		for(int i = 0; i<array.length; i++){
			
			System.out.println(i+" / "+array[i]);
			
		}
	}
}
	

