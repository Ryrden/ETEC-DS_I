package Agenda4;

import java.util.Scanner;

public class Percentual_de_votos_em_relação_a_eleitores {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		int eleitores;
		int votos_nulos;
		int votos_brancos;
		int votos_validos;
		
		System.out.println("Este programa mostrará percentuais dos votos em relação aos eleitores");
		
		System.out.print("Digite quantos eleitores votaram: ");
		eleitores = input.nextInt();
	
		System.out.print("Quantos votos válidos? ");
		votos_validos = input.nextInt();
		
		System.out.print("Quantos votos nulos? ");
		votos_nulos = input.nextInt();
		
		System.out.print("Quantos votos em Branco? ");
		votos_brancos = input.nextInt();
		
		System.out.println("de" + eleitores + "eleitores, teve " + ((votos_validos/eleitores)*100) + "de votos validos, " +  ((votos_brancos/eleitores)*100) + " de votos em brancos e" + ((votos_nulos/eleitores)*100) + " de votos nulos");
				
	}
		

}
