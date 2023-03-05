package miPrimerProyecto;

public class MatiasDelgadoclase1_1 {

	public static void main(String[] args) {
		// 1a
		int numeroInicio = 5;
		int numeroFin = 14;
		
		int contador = numeroInicio;
		
		while (contador <= numeroFin) {
			System.out.println("1a: " + contador);
			contador = contador + 1;

		}
		
		//1b
		
		contador = numeroInicio; // reinicio contador
		
		while (contador <= numeroFin) {
			if (contador % 2 == 0) {
				System.out.println("1b: " + contador);
			}
			contador = contador + 1;
		}
		
		//1c
		
		contador = numeroInicio;
		
		boolean variableExtra = false; // true para nro par, false para impar
		
		while (contador <= numeroFin) {
			if (contador % 2 == 0 && variableExtra == true) {
				System.out.println("1c: " + contador);
			}
			if (contador % 2 != 0 && variableExtra == false) {
				System.out.println("1c: " + contador);
			}
			contador = contador + 1;
		}
		
		//1d
		
		contador = numeroInicio;
		
		for (int i = numeroFin; i >= numeroInicio; i--) {
			if (i % 2 == 0) {
				System.out.println("1d: " + i);
			}
		}
	}

}
