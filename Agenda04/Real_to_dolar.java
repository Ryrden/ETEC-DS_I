package Agenda04;

import java.util.Scanner;
	
public class Real_to_dolar {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		float cotacao;
		float dinheiro;
		float money;
		
		System.out.println("Esse programa irá converter Reais em Dolar, mas para isso...");
		System.out.print("Digite a atual cotação do dolar em reais: R$ ");
		cotacao = input.nextFloat();
		
		System.out.print("Digite quanto dinheiro em reais você possui: R$ ");
		dinheiro = input.nextFloat();
		
		money = dinheiro / cotacao;
		
		System.out.println("O valor convertido é: $ " + money);
		
	}
}
