package Agenda09;

import javax.swing.JOptionPane;

public class LotocCom {

	public static void main(String[] args) {
		
		int[] num = new int[3];
		int[] sorte = new int[3];
		
		 num[0] = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo ao Software que vai testar a sua sorte, digite 3 números \ncom valores de 0 a 38."));
		 
		 //Verificando dado
		 while (num[0] < 0) {
			 num[0] = Integer.parseInt(JOptionPane.showInputDialog("ATENÇÃO: Este número não é ou está entre 0 e 38, por favor tente novamente"
					 + "\nDigite o seu número da sorte"));
		 }
		 
		 for (int i = 1; i <= 2; i++) {
			 
			 if (i==1) { //Caso o número digitado fora do laço seja dívisivel por 4, vai pra "lista" também
				 if (num[i-1] % 4 == 0) {
					 sorte[i-1] = num[i-1];
				 }
			 }
			 
			 num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu "+ (i+1) +"º número da sorte"));
			 
			 //Verificando dado... denovo :(
			 while (num[i] < 0) { 
				 num[i] = Integer.parseInt(JOptionPane.showInputDialog("ATENÇÃO: Este número não é ou está entre 0 e 38, por favor tente novamente"
						 + "\nDigite o seu "+ (i+1) +"º número da sorte"));
			 }
			 
			 if (num[i] % 4 == 0) { //se o atual digitado for dívisivel por 4 vai pra "lista"
				 sorte[i] = num[i];
			 }		 
		 }
		 int soma = sorte[0] + sorte[1] + sorte[2]; //para não ficar muito extensa a linha
		 
		 if (soma <= 20) { //Prêmio Nenhum
			 JOptionPane.showMessageDialog(null, "A soma dos números sorteados é: " + soma + "\n\nQue Pena, você não ganhou nenhum prêmio :(");
		 } else if (soma > 20 && soma < 25) { //Prêmio Comum
			 JOptionPane.showMessageDialog(null, "A soma dos números sorteados é: " + soma + "\n\nParabéns, você ganhou o prêmio comum :)");
		 } else { //Prêmio Máximo 
			 JOptionPane.showMessageDialog(null, "A soma dos números sorteados é: " + soma + "\n\nIncrível, você ganhou o prêmio máximo :D");
		 }
		 
		 
	}

}
