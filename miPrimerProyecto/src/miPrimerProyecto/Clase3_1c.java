package miPrimerProyecto;

public class Clase3_1c {

	public static void main(String[] args) {
		int numMaximo = 48;
		int totalSuma = 0;
		
		int arrayDeNumeros[] = new int[] {25, 42, 88, 73, 69, 33, 101, 15};
		
		for (int sumaNum : arrayDeNumeros) {
			
			if (sumaNum <= numMaximo) {
				totalSuma = totalSuma + sumaNum;
			}
			
		}
		
		System.out.println("Teniendo un numero maximo de "+numMaximo+" la suma de los numeros menores a este de la lista da: "+totalSuma);
	}

}
