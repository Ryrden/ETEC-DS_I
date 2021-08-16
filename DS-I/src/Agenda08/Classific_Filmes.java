package Agenda08;

import java.util.Scanner;

public class Classific_Filmes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int idade, idade_ruim = 0; // idade_ruim = idade_[Avaliação]
		int contador = 1;
		String avaliacao;
		int A = 0; 
		int B = 0; 
		int C = 0;   //A,B,C,D,E são enumeradores para contabilizar a qualidade do filme
		int D = 0; 
		int E = 0; 
		
		System.out.println("Esse programa tem como finalidade medir a qualidade do filme em exibição\n");
		
		while (contador <= 100) {
			System.out.print("Olá espectador, qual a sua idade? R: ");
			idade = input.nextInt();
			input.nextLine();
			while (idade < 6 && idade > 120) { //Verificando se 6 < idade < 120 (intuição de idade permitida)
				System.out.println("essa idade não é valida para avaliar o filme, para avaliar sua idade precisa estar entre 6 a 120"
						+ " Qual a sua idade? R: ");
				idade = input.nextInt();
				input.nextLine();
			}
			
			System.out.print("\nQual a sua avaliação para o filme? \nA - Ótimo /  B - Bom / C - Regular  / D - Ruim  / E -  Péssimo \nR: ");
			avaliacao = input.nextLine();
			
			while (!avaliacao.equals("A") && !avaliacao.equals("B") && !avaliacao.equals("C") && !avaliacao.equals("D") 
					&& !avaliacao.equals("E")) {                                                 //Verificando se a resposta é válida 
				System.out.print("Você digitou uma avaliação inexistente, ela deve ser idêntica \na lista acima"
						+ " para que o nosso sistema a reconheça. \ntente de novo: ");
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

		System.out.println("\n\n----------- O PROGRAMA ESTÁ FINALIZADO -----------------\n");
		System.out.println("A Quantidade de avaliações ótimas para o filme exibido foram:\t" + A );
		System.out.println("\n\nA média aritmética de idade das pessoas que avaliaram o filme como ruim foi de: " + (float)idade_ruim/100);
		System.out.println("\n\nA porcentagem de pessoas que avaliaram o filme como péssimo foi equivalente a: " + (float)E/100*100 +"%");
	}
}
