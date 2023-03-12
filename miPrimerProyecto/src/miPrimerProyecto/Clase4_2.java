package miPrimerProyecto;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Clase4_2 {

	public static void main(String[] args) {
		String rutaArchivo = System.getProperty("user.dir")+"\\recursos\\numerosAleatorios.txt";
		try {
			for(String linea : Files.readAllLines(Paths.get(rutaArchivo))) {
				
				String[] subcadena = linea.split(" ");
				int suma = 0;
				
				for (String conversor : subcadena) {
					int numConv = Integer.parseInt(conversor);
					suma += numConv;
				}
				
				System.out.println("La suma de los numeros en el archivo da: "+suma);
				
			}					
		}catch(FileNotFoundException s){
			System.out.println("El archivo no existe.");
			
		}catch (IOException e) {
			e.printStackTrace();
			
		}

		
	}

}
