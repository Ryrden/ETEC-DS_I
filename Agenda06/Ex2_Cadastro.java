package Agenda06;

import javax.swing.JOptionPane;

public class Ex2_Cadastro {

	public static void main(String[] args) {
		// declara��o de vari�veis
		int option;
		
		//entrada de dados
		option = Integer.parseInt(JOptionPane.showInputDialog("Entre com a op��o desejada:"
				+ "\n1 - Cadastrar usu�rio"
				+ "\n2 - Alterar dados"
				+ "\n3 - Excluir usu�rio"));
		
		//processamento e sa�da
		switch (option) {
		case 1:
			JOptionPane.showMessageDialog(null, "Cadastrando usu�rio");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Alterando dados");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Exclus�o de usu�rios");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Op��o Inv�lida");
			break;
		}//fim do switch-case
		
	}// fim do m�todo main

}// fim da classe
