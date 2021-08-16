package Agenda04;

import java.util.Scanner;

public class nome_e_sobrenome {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Este programa irá mostrar o seu nome trocado com o seu sobrenome, mas para isso...");
		System.out.print("Digite o seu primeiro NOME: ");
		String nome = input.next();
		
		System.out.print("Digite o seu SOBRENOME: ");
		String sobrenome = input.next();
		
		System.out.println(sobrenome + ' ' + nome);	
	}

}
