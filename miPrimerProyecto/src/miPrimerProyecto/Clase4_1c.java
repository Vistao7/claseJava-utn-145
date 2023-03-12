package miPrimerProyecto;

import java.util.Arrays;
import java.util.Scanner;

public class Clase4_1c {

	public static void main(String[] args) {
		
		int arrayOrdenado[] = new int[] {77,44,89};
		
		String letra = "d";
		String letraAscendente = "a";
		String letraDescendiente = "d";
		
        Scanner scn = new Scanner(System.in);
		
		if (letra.equals("")) {
			System.out.println("ingresar letra "+letraAscendente+" para orden ascendiente o "+letraDescendiente+" para descendiente: ");
			letra = inputLetra_conDosVariables(scn, letraAscendente, letraDescendiente);
		}
		
		if (!arrayCheck_noVacio(arrayOrdenado)) {
			System.out.println("Ingresar "+arrayOrdenado.length+" numeros: ");

			arrayOrdenado = ingresoNumeros(scn, arrayOrdenado.length);
		}
		
		
		arrayOrdenado = ordenamiento(arrayOrdenado, letra);
		
		System.out.println(Arrays.toString(arrayOrdenado));
		
		scn.close();

	}
	
	public static int[] ordenamiento(int[] arrayDeOrdenamiento, String letraOrdenamiento) {
		
		if(letraOrdenamiento.equals("a")) {
			
			Arrays.sort(arrayDeOrdenamiento);
			for(int i = 0; i < arrayDeOrdenamiento.length; i++) {
			}
			
		} else { //aca aprovechamos que array sort organiza de mayor a menor, 
				//asi que cambiamos todos los numeros a negativo, organizamos y los cambiamos nuevamente
			for(int i = 0; i < arrayDeOrdenamiento.length; i++) {
				arrayDeOrdenamiento[i] = arrayDeOrdenamiento[i] * -1;
			}
			
			Arrays.sort(arrayDeOrdenamiento);
			
			for(int i = 0; i < arrayDeOrdenamiento.length; i++) {
				arrayDeOrdenamiento[i] = arrayDeOrdenamiento[i] * -1;
			}
			
			
		}
		
		return arrayDeOrdenamiento;
	}
	
	
	
	public static String inputLetra_conDosVariables(Scanner scn, String firstVar, String secondVar) {
		
		
		String letraIngresada = scn.nextLine();
		while (!letraIngresada.equals(firstVar) && !letraIngresada.equals(secondVar)) {
			System.out.println("Caracter Incorrecto, ingresar nuevamente: ");
			System.out.println(letraIngresada);
			letraIngresada = scn.nextLine();
		}
		
		return letraIngresada;
	}
	
	
	
	public static boolean arrayCheck_noVacio(int[] array) {
	    for (int i = 0; i < array.length; i++) {
	        if (array[i] != 0) {
	            return true;
	        }
	    }
	    return false;
	}
	
	
	
	public static int[] ingresoNumeros(Scanner scn, int cantidadElementos) {
	    int[] numeros = new int[cantidadElementos];
	    for (int i = 0; i < cantidadElementos; i++) {
	        System.out.println("Ingresar número " + (i+1) + ": ");
	        numeros[i] = scn.nextInt();
	    }
	    return numeros;
	}

}