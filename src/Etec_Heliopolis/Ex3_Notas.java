package Etec_Heliopolis;

import java.util.Scanner;

public class Ex3_Notas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] nome = new String[15];
		Double[] nota1 = new Double[15];
		Double[] nota2 = new Double[15];
		Double[] media = new Double[15];
		
		for (int i = 0; i<15; i++) {
			System.out.println("Qual o "+ i +"º nome? ");
			nome[i] = input.next();
			
			System.out.println("Qual a primeira nota de " + nome[i]+"?");
			nota1[i] = input.nextDouble();
			
			System.out.println("Qual a Segunda nota de " + nome[i]+"?");
			nota2[i] = input.nextDouble();
			
			media[i] = (nota1[i] + nota2[i]) / 2;
		}
		
		double menor_media = media[0];
		double maior_media = media[0];
		double media_turma = 0;
		
		for (int i = 0; i<15; i++) {
			
			if (media[i] < menor_media) {
				menor_media = media[i];
			}else if (media[i] > maior_media) {
				maior_media = media[i];
			
			media_turma = media_turma + media[i];
			}
		}
		media_turma = media_turma / 15;
		
		System.out.println("A média geral da turma foi de" + media_turma);
		System.out.println("A menor média da turma foi de " + menor_media);
		System.out.println("A maior média da turma foi de" + maior_media);
	}

}
