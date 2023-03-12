package miPrimerProyecto;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Clase4_2a {

	public static void main(String[] args) {
		String operacion = "m";
		
		String rutaArchivo = System.getProperty("user.dir")+"\\recursos\\numerosAleatorios.txt";
		try {
			int suma = 0;
			if (operacion.equals("m") || operacion.equals("d")) {
				suma = 1;
			}
			
			for(String linea : Files.readAllLines(Paths.get(rutaArchivo))) {
				
				String[] subcadena = linea.split(" ");
				
				
				for (String conversor : subcadena) {
					int numConv = Integer.parseInt(conversor);
					switch(operacion) {
					
					case "a":
						suma += numConv;
						break;
						
					case "m":
						suma *= numConv;
						break;
						
					//libre para hacer una calculadora
					}
					
				}
				
				System.out.println("el calculo de los numeros en el archivo da: "+suma);
				
			}					
		}catch(FileNotFoundException s){
			System.out.println("El archivo no existe.");
			
		}catch (IOException e) {
			e.printStackTrace();
			
		}

		
	}

}
