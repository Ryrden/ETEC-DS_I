package Agenda09;

import javax.swing.JOptionPane;

public class LotocCom {

	public static void main(String[] args) {
		
		int[] num = new int[3];
		int[] sorte = new int[3];
		
		 num[0] = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo ao Software que vai testar a sua sorte, digite 3 n�meros \ncom valores de 0 a 38."));
		 
		 //Verificando dado
		 while (num[0] < 0) {
			 num[0] = Integer.parseInt(JOptionPane.showInputDialog("ATEN��O: Este n�mero n�o � ou est� entre 0 e 38, por favor tente novamente"
					 + "\nDigite o seu n�mero da sorte"));
		 }
		 
		 for (int i = 1; i <= 2; i++) {
			 
			 if (i==1) { //Caso o n�mero digitado fora do la�o seja d�visivel por 4, vai pra "lista" tamb�m
				 if (num[i-1] % 4 == 0) {
					 sorte[i-1] = num[i-1];
				 }
			 }
			 
			 num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu "+ (i+1) +"� n�mero da sorte"));
			 
			 //Verificando dado... denovo :(
			 while (num[i] < 0) { 
				 num[i] = Integer.parseInt(JOptionPane.showInputDialog("ATEN��O: Este n�mero n�o � ou est� entre 0 e 38, por favor tente novamente"
						 + "\nDigite o seu "+ (i+1) +"� n�mero da sorte"));
			 }
			 
			 if (num[i] % 4 == 0) { //se o atual digitado for d�visivel por 4 vai pra "lista"
				 sorte[i] = num[i];
			 }		 
		 }
		 int soma = sorte[0] + sorte[1] + sorte[2]; //para n�o ficar muito extensa a linha
		 
		 if (soma <= 20) { //Pr�mio Nenhum
			 JOptionPane.showMessageDialog(null, "A soma dos n�meros sorteados �: " + soma + "\n\nQue Pena, voc� n�o ganhou nenhum pr�mio :(");
		 } else if (soma > 20 && soma < 25) { //Pr�mio Comum
			 JOptionPane.showMessageDialog(null, "A soma dos n�meros sorteados �: " + soma + "\n\nParab�ns, voc� ganhou o pr�mio comum :)");
		 } else { //Pr�mio M�ximo 
			 JOptionPane.showMessageDialog(null, "A soma dos n�meros sorteados �: " + soma + "\n\nIncr�vel, voc� ganhou o pr�mio m�ximo :D");
		 }
		 
		 
	}

}
