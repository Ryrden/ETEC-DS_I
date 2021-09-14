package Agenda06;

import javax.swing.JOptionPane;

public class Ex1_Produtos {

	public static void main(String[] args) {
		// declaração de variáveis
		int option;
		
		//Entrada e conversão de dados
		option = Integer.parseInt(JOptionPane.showInputDialog("Entre com um código de produto: "));
		
		//Processamento
		switch (option) {
		case 100:
			JOptionPane.showInternalMessageDialog(null, "O produto selecionado é um lápis preto n.2");
			break;
		case 150:
			JOptionPane.showInternalMessageDialog(null, "O produto selecionado é uma Borracha branca");
			break;
		case 200:
			JOptionPane.showInternalMessageDialog(null, "O produto selecionado é uma Caneta azul");
			break;
		case 230:
			JOptionPane.showInternalMessageDialog(null, "O produto selecionado é uma Caneta vermelha");
			break;
		case 256:
			JOptionPane.showInternalMessageDialog(null, "O produto selecionado é um Giz de cera 12 unid.");
			break;
		case 300:
			JOptionPane.showInternalMessageDialog(null, "O produto selecionado é uma Cartolina branca");
			break;
		case 310:
			JOptionPane.showInternalMessageDialog(null, "O produto selecionado é Resma de sulfite A4");
			break;
		case 400:
			JOptionPane.showInternalMessageDialog(null, "O produto selecionado é um estojo escolar verde");
			break;
		case 470:
			JOptionPane.showInternalMessageDialog(null, "O produto selecionado é um caderno universitário 100 fls.");
			break;
		case 500:
			JOptionPane.showInternalMessageDialog(null, "O produto selecionado é um caderno brochura 50fls.");
			break;
		default:
			JOptionPane.showInternalMessageDialog(null, "Produto não cadastrado!");
			
		}
	}

}
