package Agenda06;

import javax.swing.JOptionPane;

public class Ex3_Cadastro_com_submenu {

	public static void main(String[] args) {
		// declaração de variáveis
		int opcao, submenu;
		
		// entrada de dados
		opcao = Integer.parseInt(JOptionPane.showInputDialog("Entre com a opção desejada:"+
						"\n - Cadastrar usuário" +
						"\n - Alterar dados" +
						"\n - Excluir usuário"));

		// processamento e saida
		switch (opcao) {
		case 1:
			JOptionPane.showMessageDialog(null, "Cadastrando usuário");
			break;
		case 2:
			submenu = Integer.parseInt(JOptionPane.showInputDialog(
							"Menu de alteração de dados" +
							"\nSelecione a opção desejada:" +
							"\n1 - Alterar nome" +
							"\n2 - Alterar endereço" +
							"\n3 - Alterar Telefone" +
							"\n4 - Alterar RG"));
			// Início do 2º switch
			switch (submenu) {
			case 1:
				JOptionPane.showMessageDialog(null, "Alterar nome selecionado");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Alterar endereço selecionado");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Alterar telefone selecionado");
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Alterar RG selecionado");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida");
				break;
			}//fim do 2ºswitch
			break;
		}//fim do 1º switch		

	}//fim do método main

}//fim da classe 
