package Agenda06;

import javax.swing.JOptionPane;

public class Ex3_Cadastro_com_submenu {

	public static void main(String[] args) {
		// declara��o de vari�veis
		int opcao, submenu;
		
		// entrada de dados
		opcao = Integer.parseInt(JOptionPane.showInputDialog("Entre com a op��o desejada:"+
						"\n - Cadastrar usu�rio" +
						"\n - Alterar dados" +
						"\n - Excluir usu�rio"));

		// processamento e saida
		switch (opcao) {
		case 1:
			JOptionPane.showMessageDialog(null, "Cadastrando usu�rio");
			break;
		case 2:
			submenu = Integer.parseInt(JOptionPane.showInputDialog(
							"Menu de altera��o de dados" +
							"\nSelecione a op��o desejada:" +
							"\n1 - Alterar nome" +
							"\n2 - Alterar endere�o" +
							"\n3 - Alterar Telefone" +
							"\n4 - Alterar RG"));
			// In�cio do 2� switch
			switch (submenu) {
			case 1:
				JOptionPane.showMessageDialog(null, "Alterar nome selecionado");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Alterar endere�o selecionado");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Alterar telefone selecionado");
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Alterar RG selecionado");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Op��o inv�lida");
				break;
			}//fim do 2�switch
			break;
		}//fim do 1� switch		

	}//fim do m�todo main

}//fim da classe 
