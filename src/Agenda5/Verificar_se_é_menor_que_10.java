package Agenda5;

import java.util.Scanner;

public class Verificar_se_é_menor_que_10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite um número: ");
		num = input.nextInt();
		
		if (num >= 10) {
			System.out.print("\nO número digitado é maior ou igual a 10 ");
		}else {
			System.out.print("\nO número digitador é menor que 10 ");
		}
		
		if (num % 2 == 0) {
			System.out.println("e também é divisível por 2");
		}else {
			System.out.println("e não é divisível por 2");
		}
	}

}
