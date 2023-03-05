package miPrimerProyecto;

public class clase3_1a{

	public static void main(String[] args) {
		String palabraAnalizada = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";
		char letraAnalizada = 'i';
		int contadorLetra = 0;
		
		for (int tamaño = 0; tamaño < palabraAnalizada.length() ; tamaño++) {
			if (palabraAnalizada.charAt(tamaño) == letraAnalizada) {
				contadorLetra++;
			}
		}
		
		System.out.println("hay " + contadorLetra + " " + letraAnalizada + " en la palabra indicada");

	}

}
