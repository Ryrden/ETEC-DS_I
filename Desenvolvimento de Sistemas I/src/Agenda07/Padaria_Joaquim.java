package Agenda07;

import java.util.Scanner;

public class Padaria_Joaquim {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String produto;
		float valor;
		
		for (int i = 1; i <= 10; i++) {
			
			
			System.out.print("Digite o nome do produto " + i +": ");
			produto = input.nextLine();
			
			System.out.print("\nQual o preço do produto " + i +"? R$ ");
			valor = input.nextFloat();
			input.nextLine();
			
			System.out.println("O respectivo valor com desconto de 50% para esse produto é: R$ " + (valor/2)+"\n");
		}

	}

}