/**
 * 
 * Miquel Angel Montero Act1 13/01/2022 
 * 
 */
import javax.swing.JOptionPane;
public class Act1 {

	public static void main(String[] args) {

		int opcion = 0;
		
		while(opcion!=4) {
			
			String opcionS = JOptionPane.showInputDialog("Menú: \n1.Circulo:\n2.Triangulo\n3.Cuadrado\n4.Salir");
			opcion = Integer.parseInt(opcionS);
			
			switch (opcion) {
				case 1:
					String radS = JOptionPane.showInputDialog("Introduce el radio de tu circulo");
					double rad = Double.parseDouble(radS);
					JOptionPane.showMessageDialog(null, "El area de tu circulo es "+calcularCirculo(rad));
					break;
				case 2:
					String basS = JOptionPane.showInputDialog("Introduce la base de tu triangulo");
					double bas = Double.parseDouble(basS);
					String altS = JOptionPane.showInputDialog("Introduce la altura de tu triangulo");
					double alt = Double.parseDouble(altS);
					JOptionPane.showMessageDialog(null, "El area de tu triangulo es "+calcularTriangulo(bas, alt));
					break;
				case 3:
					String ladS = JOptionPane.showInputDialog("Introduce un lado de tu cuadrado");
					double lad = Double.parseDouble(ladS);
					JOptionPane.showMessageDialog(null, "El area de tu cuadrado es "+calcularCuadrado(lad));
					break;
				case 4:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Introduce un numero del 1 al 4");
			}
			
		}

	}
	
	public static double calcularCirculo(double rad) {
		
		double resultat = Math.PI*(Math.pow(rad, 2));
		
		return resultat;
	}
	
	public static double calcularTriangulo(double base, double altura) {
		
		double resultat = (base * altura)/2;
		
		return resultat;
	}

	public static double calcularCuadrado(double lado) {
		
		double resultat = lado * lado;
		
		return resultat;
	}
}
