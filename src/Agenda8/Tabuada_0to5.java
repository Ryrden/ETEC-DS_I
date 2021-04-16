package Agenda8;

public class Tabuada_0to5 {

	public static void main(String[] args) {
		
		int constante = 0;
		int multiplicador = 1;
		
		while (constante <= 5) {
			multiplicador = 1;
			do {
				System.out.println(constante + " x " + multiplicador + " = " + constante * multiplicador);
				multiplicador = multiplicador + 1;
			} while (multiplicador <= 10);
			System.out.println("----------------");
			
			constante = constante + 1;
		}

	}

}
