package Agenda6;

import java.util.Scanner;

public class Fichario_Ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Digite um n�mero entre 1 a 12 que ele ser� relacionado com um m�s do ano: ");
		
		int numero =  input.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("M�s de Janeiro");
			break;
		case 2:
			System.out.println("M�s de Fevereiro");
			break;
		case 3:
			System.out.println("M�s de Mar�o");
			break;
		case 4:
			System.out.println("M�s de Abril");
			break;
		case 5:
			System.out.println("M�s de Maio");
			break;
		case 6:
			System.out.println("M�s de Junho");
			break;
		case 7:
			System.out.println("M�s de Julho");
			break;
		case 8:
			System.out.println("M�s de Agosto");
			break;
		case 9:
			System.out.println("M�s de Setembro");
			break;
		case 10:
			System.out.println("M�s de Outubro");
			break;
		case 11:
			System.out.println("M�s de Novembro");
			break;
		case 12:
			System.out.println("M�s de Dezembro");
			break;
		default:
			System.out.println("M�s invalido");
			break;
		}
	}
}