package Agenda04;

import java.util.Scanner;

public class multiplicando_dois_numeros {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
				
		System.out.println("Esse programa vai multiplicar dois valore inseridos por voc�");
		System.out.print("Digite o primeiro n�mero: ");
		int numero1 = input.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		int numero2 = input.nextInt();
		
		int resultado = numero1 * numero2;
		
		System.out.println("a multiplica��o entre os dois n�meros digitados � " + resultado);
	}

}
