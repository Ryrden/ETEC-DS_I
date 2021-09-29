package Agenda06;

import javax.swing.JOptionPane;

public class Ex2_Cadastro {

	public static void main(String[] args) {
		// declaração de variáveis
		int option;
		
		//entrada de dados
		option = Integer.parseInt(JOptionPane.showInputDialog("Entre com a opção desejada:"
				+ "\n1 - Cadastrar usuário"
				+ "\n2 - Alterar dados"
				+ "\n3 - Excluir usuário"));
		
		//processamento e saída
		switch (option) {
		case 1:
			JOptionPane.showMessageDialog(null, "Cadastrando usuário");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Alterando dados");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Exclusão de usuários");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção Inválida");
			break;
		}//fim do switch-case
		
	}// fim do método main

}// fim da classe
