package Agenda08;

import java.util.Scanner;

public class Classific_Filmes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int idade, idade_ruim = 0; // idade_ruim = idade_[Avalia��o]
		int contador = 1;
		String avaliacao;
		int A = 0; 
		int B = 0; 
		int C = 0;   //A,B,C,D,E s�o enumeradores para contabilizar a qualidade do filme
		int D = 0; 
		int E = 0; 
		
		System.out.println("Esse programa tem como finalidade medir a qualidade do filme em exibi��o\n");
		
		while (contador <= 100) {
			System.out.print("Ol� espectador, qual a sua idade? R: ");
			idade = input.nextInt();
			input.nextLine();
			while (idade < 6 && idade > 120) { //Verificando se 6 < idade < 120 (intui��o de idade permitida)
				System.out.println("essa idade n�o � valida para avaliar o filme, para avaliar sua idade precisa estar entre 6 a 120"
						+ " Qual a sua idade? R: ");
				idade = input.nextInt();
				input.nextLine();
			}
			
			System.out.print("\nQual a sua avalia��o para o filme? \nA - �timo /  B - Bom / C - Regular  / D - Ruim  / E -  P�ssimo \nR: ");
			avaliacao = input.nextLine();
			
			while (!avaliacao.equals("A") && !avaliacao.equals("B") && !avaliacao.equals("C") && !avaliacao.equals("D") 
					&& !avaliacao.equals("E")) {                                                 //Verificando se a resposta � v�lida 
				System.out.print("Voc� digitou uma avalia��o inexistente, ela deve ser id�ntica \na lista acima"
						+ " para que o nosso sistema a reconhe�a. \ntente de novo: ");
				avaliacao = input.nextLine();
			}
			
			if (avaliacao.equals("A")) {
				A = A + 1;
			} else if (avaliacao.equals("B")) {
				B = B + 1;
			} else if (avaliacao.equals("C")) {
				C = C + 1;
			} else if (avaliacao.equals("D")) {
				D = D + 1;
				idade_ruim = idade_ruim + idade;
			} else {
				E = E + 1;
			}
			
			contador = contador + 1;
		}

		System.out.println("\n\n----------- O PROGRAMA EST� FINALIZADO -----------------\n");
		System.out.println("A Quantidade de avalia��es �timas para o filme exibido foram:\t" + A );
		System.out.println("\n\nA m�dia aritm�tica de idade das pessoas que avaliaram o filme como ruim foi de: " + (float)idade_ruim/100);
		System.out.println("\n\nA porcentagem de pessoas que avaliaram o filme como p�ssimo foi equivalente a: " + (float)E/100*100 +"%");
	}
}
