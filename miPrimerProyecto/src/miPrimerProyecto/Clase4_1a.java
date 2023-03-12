package miPrimerProyecto;

import java.util.Arrays;
import java.util.Scanner;

public class Clase4_1a {

	public static void main(String[] args) {
		
		int arrayOrdenado[] = new int[] {44,128,11};
		String letra = "q";
		
		arrayOrdenado = ordenamiento(arrayOrdenado, letra);
		
		System.out.println(Arrays.toString(arrayOrdenado));
		
	}
	
	public static int[] ordenamiento(int[] arrayDeOrdenamiento, String letraOrdenamiento) {
		
		if(letraOrdenamiento.equals("a")) {
			
			Arrays.sort(arrayDeOrdenamiento);
			for(int i = 0; i < arrayDeOrdenamiento.length; i++) {
			}
			
		} else if (letraOrdenamiento.equals("b")) { //aca aprovechamos que array sort organiza de mayor a menor, 
				//asi que cambiamos todos los numeros a negativo, organizamos y los cambiamos nuevamente
			for(int i = 0; i < arrayDeOrdenamiento.length; i++) {
				arrayDeOrdenamiento[i] = arrayDeOrdenamiento[i] * -1;
			}
			
			Arrays.sort(arrayDeOrdenamiento);
			
			for(int i = 0; i < arrayDeOrdenamiento.length; i++) {
				arrayDeOrdenamiento[i] = arrayDeOrdenamiento[i] * -1;
			}
			
			
		} else {
			System.out.println("Error en input, revisar parametros ingresados");
			
		}
		
		return arrayDeOrdenamiento;
	}
	
	
	


}