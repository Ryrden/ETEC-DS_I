package Agenda6;

import java.util.Scanner;

public class Fichario_Ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Digite um número entre 1 a 12 que ele será relacionado com um mês do ano: ");
		
		int numero =  input.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("Mês de Janeiro");
			break;
		case 2:
			System.out.println("Mês de Fevereiro");
			break;
		case 3:
			System.out.println("Mês de Março");
			break;
		case 4:
			System.out.println("Mês de Abril");
			break;
		case 5:
			System.out.println("Mês de Maio");
			break;
		case 6:
			System.out.println("Mês de Junho");
			break;
		case 7:
			System.out.println("Mês de Julho");
			break;
		case 8:
			System.out.println("Mês de Agosto");
			break;
		case 9:
			System.out.println("Mês de Setembro");
			break;
		case 10:
			System.out.println("Mês de Outubro");
			break;
		case 11:
			System.out.println("Mês de Novembro");
			break;
		case 12:
			System.out.println("Mês de Dezembro");
			break;
		default:
			System.out.println("Mês invalido");
			break;
		}
	}
}