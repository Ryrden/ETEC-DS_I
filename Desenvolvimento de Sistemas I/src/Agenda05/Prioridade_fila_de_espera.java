package Agenda05;

import javax.swing.JOptionPane;

public class Prioridade_fila_de_espera {

	public static void main(String[] args) {
		
		//Declara��o de vari�veis
		String idade0;
		int idade;
		
		//Entrada de dados
		idade0 = JOptionPane.showInputDialog("Descubra qual � o seu tipo de prioridade \n na fila de espera digitando a sua idade:");
		
		idade = Integer.parseInt(idade0);
		
		//Processamento e sa�da de dados
		if (idade > 80) {
			JOptionPane.showInternalMessageDialog(null, "Sua prioridade � a maior, voc� est� na fila 80+");
		}else if (idade <= 80 && idade >= 60) {
			JOptionPane.showInternalMessageDialog(null, "Sua prioridade � mediana, voc� est� na fila priorit�ria");
		}else {
			JOptionPane.showInternalMessageDialog(null, "Sua prioridade � baixa, voc� est� na fila comum");			
		}
		
	}
}

