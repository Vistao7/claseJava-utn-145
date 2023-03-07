package miPrimerProyecto;

import java.util.Arrays;   //este import trae metodos para ordenar el array

public class Clase3_1b {
	
	public static void main(String[] args) {
		
		boolean flagAscendente = false; //true para orden ascendente, false para descendiente
		
		int arrayDeNumeros[] = new int[] {15, 203, 94};
		
		if(flagAscendente) {
			
			Arrays.sort(arrayDeNumeros);
			for(int i = 0; i < arrayDeNumeros.length; i++) {
				System.out.println(arrayDeNumeros[i]);
			}
			
		} else { //aca aprovechamos que array sort organiza de mayor a menor, 
				//asi que cambiamos todos los numeros a negativo, organizamos y los cambiamos nuevamente
			for(int i = 0; i < arrayDeNumeros.length; i++) {
				arrayDeNumeros[i] = arrayDeNumeros[i] * -1;
			}
			
			Arrays.sort(arrayDeNumeros);
			
			for(int i = 0; i < arrayDeNumeros.length; i++) {
				arrayDeNumeros[i] = arrayDeNumeros[i] * -1;
				System.out.println(arrayDeNumeros[i]);
			}
			
			
		}
		
		
		
	}
}
