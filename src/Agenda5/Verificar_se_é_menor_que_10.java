package Agenda5;

import java.util.Scanner;

public class Verificar_se_�_menor_que_10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite um n�mero: ");
		num = input.nextInt();
		
		if (num >= 10) {
			System.out.print("\nO n�mero digitado � maior ou igual a 10 ");
		}else {
			System.out.print("\nO n�mero digitador � menor que 10 ");
		}
		
		if (num % 2 == 0) {
			System.out.println("e tamb�m � divis�vel por 2");
		}else {
			System.out.println("e n�o � divis�vel por 2");
		}
	}

}
