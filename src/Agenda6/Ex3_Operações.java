package Agenda6;

import javax.swing.JOptionPane;

public class Ex3_Operações {

	public static void main(String[] args) {
		//declaração de variáveis
		double num1, num2, resultado;
		int operacao;
		
		//entrada de dados
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Entre com o primeiro número"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Entre com o segundo número"));
		
		operacao = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite a operação desejada: "
				+ "\n1 -Soma"
				+ "\n2 - Subtração"
				+ "\n3 - Multiplicação"
				+ "\n4 - Divisão"
				+ "\n5 - Resto da divisão"));
		
		//processamento
		switch (operacao) {
		case 1: //Soma
			resultado = num1 + num2;
			break;
		case 2: //subtração
			resultado = num1 - num2;
			break;
		case 3: //multiplicação
			resultado = num1 * num2;
			break;
		case 4: //divisão
			resultado = num1 / num2;
			break;
		case 5: //resto da divisão
			resultado = num1 % num2;
			break;
		default:
			resultado = 0;
			break;
		}// fim do switch-case
		
		//saida de dados
		JOptionPane.showInternalMessageDialog(null, "O resultado da operação é " + resultado);
	}// fim do método main

}// fim da classe
