package Agenda6;

import javax.swing.JOptionPane;

public class Ex3_Opera��es {

	public static void main(String[] args) {
		//declara��o de vari�veis
		double num1, num2, resultado;
		int operacao;
		
		//entrada de dados
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Entre com o primeiro n�mero"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Entre com o segundo n�mero"));
		
		operacao = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite a opera��o desejada: "
				+ "\n1 -Soma"
				+ "\n2 - Subtra��o"
				+ "\n3 - Multiplica��o"
				+ "\n4 - Divis�o"
				+ "\n5 - Resto da divis�o"));
		
		//processamento
		switch (operacao) {
		case 1: //Soma
			resultado = num1 + num2;
			break;
		case 2: //subtra��o
			resultado = num1 - num2;
			break;
		case 3: //multiplica��o
			resultado = num1 * num2;
			break;
		case 4: //divis�o
			resultado = num1 / num2;
			break;
		case 5: //resto da divis�o
			resultado = num1 % num2;
			break;
		default:
			resultado = 0;
			break;
		}// fim do switch-case
		
		//saida de dados
		JOptionPane.showInternalMessageDialog(null, "O resultado da opera��o � " + resultado);
	}// fim do m�todo main

}// fim da classe
