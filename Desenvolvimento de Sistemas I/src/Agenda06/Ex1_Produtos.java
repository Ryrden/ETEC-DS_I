package Agenda06;

import javax.swing.JOptionPane;

public class Ex1_Produtos {

	public static void main(String[] args) {
		// declara��o de vari�veis
		int option;
		
		//Entrada e convers�o de dados
		option = Integer.parseInt(JOptionPane.showInputDialog("Entre com um c�digo de produto: "));
		
		//Processamento
		switch (option) {
		case 100:
			JOptionPane.showInternalMessageDialog(null, "O produto selecionado � um l�pis preto n.2");
			break;
		case 150:
			JOptionPane.showInternalMessageDialog(null, "O produto selecionado � uma Borracha branca");
			break;
		case 200:
			JOptionPane.showInternalMessageDialog(null, "O produto selecionado � uma Caneta azul");
			break;
		case 230:
			JOptionPane.showInternalMessageDialog(null, "O produto selecionado � uma Caneta vermelha");
			break;
		case 256:
			JOptionPane.showInternalMessageDialog(null, "O produto selecionado � um Giz de cera 12 unid.");
			break;
		case 300:
			JOptionPane.showInternalMessageDialog(null, "O produto selecionado � uma Cartolina branca");
			break;
		case 310:
			JOptionPane.showInternalMessageDialog(null, "O produto selecionado � Resma de sulfite A4");
			break;
		case 400:
			JOptionPane.showInternalMessageDialog(null, "O produto selecionado � um estojo escolar verde");
			break;
		case 470:
			JOptionPane.showInternalMessageDialog(null, "O produto selecionado � um caderno universit�rio 100 fls.");
			break;
		case 500:
			JOptionPane.showInternalMessageDialog(null, "O produto selecionado � um caderno brochura 50fls.");
			break;
		default:
			JOptionPane.showInternalMessageDialog(null, "Produto n�o cadastrado!");
			
		}
	}

}
