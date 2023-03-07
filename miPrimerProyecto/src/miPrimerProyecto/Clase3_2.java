package miPrimerProyecto;

public class Clase3_2 {

	public static void main(String[] args) {
		String strCodificacion = "Ipmb!rvf!ubm\"!tpz!vo!tusjoh!ef!nvftusb";
		
		int cantidadDeDesplazamiento = 1;
		
		boolean flagCodificacion = false; //True para codificar, false para descodificar
		
		String strResuelto = "";
		
		char letras[] = new char[strCodificacion.length()];
		
		if (flagCodificacion) {
			for (int i = 0; i < strCodificacion.length(); i++ ) { //recorre el string
				
				letras[i] = (char) (strCodificacion.charAt(i) + cantidadDeDesplazamiento); //va añadiendo cada letra del string a una lista y le suma 1, esto lo codifica
				
				strResuelto += letras[i]; // pasamos todo a otro string para mejor legibilidad
				
			}
		} else {
			for (int i = 0; i < strCodificacion.length(); i++ ) {
				
				letras[i] = (char) (strCodificacion.charAt(i) - cantidadDeDesplazamiento); //mismo que arriba pero quita 1 para descodificarlo
				
				strResuelto += letras[i];
				
			}
		}
		
		System.out.println(strResuelto);

	}

}
