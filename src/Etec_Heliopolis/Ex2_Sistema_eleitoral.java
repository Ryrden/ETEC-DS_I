package Etec_Heliopolis;

import java.util.Scanner;

public class Ex2_Sistema_eleitoral {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Descubra se voc� est� apto para votar, digite a sua idade: ");

		int idade = input.nextInt();
		
		if (idade > 16) {
			System.out.println("Voc� est� apto para votar");
		}else {
			System.out.println("Voc� n�o est� apto para votar");
		}

	}

}
