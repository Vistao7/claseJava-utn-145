package miPrimerProyecto;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.io.FileWriter;


public class Clase4_3 {

	public static void main(String[] args) {
		
		//Parametros
		
		String rutaArchivo = System.getProperty("user.dir")+"\\recursos\\entrada.txt";
		
		String rutaDestino = System.getProperty("user.dir")+"\\recursos\\salida.txt";
		
		
		try {
			List<String> lineasArchivo = Files.readAllLines(Paths.get(rutaArchivo));
            String contenidoArchivo = String.join("\n", lineasArchivo);
            
    		
    		//Codigo
    		
    		String stringResuelto = encoder3000(true, 1, contenidoArchivo);
    		
    		
    		FileWriter writer = new FileWriter(rutaDestino);
            writer.write(stringResuelto);
            writer.close();
            System.out.println("Archivo de salida creado correctamente.");

			
		}catch(FileNotFoundException s){
            System.err.println("El archivo no existe.");
            System.exit(1);
			
		}catch (IOException e) {
			e.printStackTrace();
            System.err.println("Ocurrio un problema, vuelva a intentar");
            System.exit(2);
		}
		

	}
	
	public static String encoder3000(boolean flagCodificacion, int cantidadDesplazamiento,String stringCodificacion) {
		
		String strResuelto = "";
		
		char letras[] = new char[stringCodificacion.length()];
		
		if (flagCodificacion) {
			for (int i = 0; i < stringCodificacion.length(); i++ ) { //recorre el string
				
				letras[i] = (char) (stringCodificacion.charAt(i) + cantidadDesplazamiento); //va añadiendo cada letra del string a una lista y le suma "cantidadDeDesplazamiento", esto lo codifica
				
				strResuelto += letras[i]; // pasamos todo a otro string para mejor legibilidad
				
			}
		} else {
			for (int i = 0; i < stringCodificacion.length(); i++ ) {
				
				letras[i] = (char) (stringCodificacion.charAt(i) - cantidadDesplazamiento); //mismo que arriba pero quita "cantidadDeDesplazamiento" para descodificarlo
				
				strResuelto += letras[i];
				
			}
		}
		
		return strResuelto;
	}
	
	

}
