package Agenda05;

import javax.swing.JOptionPane;

public class Prioridade_fila_de_espera {

	public static void main(String[] args) {
		
		//Declaração de variáveis
		String idade0;
		int idade;
		
		//Entrada de dados
		idade0 = JOptionPane.showInputDialog("Descubra qual é o seu tipo de prioridade \n na fila de espera digitando a sua idade:");
		
		idade = Integer.parseInt(idade0);
		
		//Processamento e saída de dados
		if (idade > 80) {
			JOptionPane.showInternalMessageDialog(null, "Sua prioridade é a maior, você está na fila 80+");
		}else if (idade <= 80 && idade >= 60) {
			JOptionPane.showInternalMessageDialog(null, "Sua prioridade é mediana, você está na fila prioritária");
		}else {
			JOptionPane.showInternalMessageDialog(null, "Sua prioridade é baixa, você está na fila comum");			
		}
		
	}
}

