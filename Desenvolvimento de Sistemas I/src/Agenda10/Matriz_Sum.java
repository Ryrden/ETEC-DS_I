package Agenda10;

public class Matriz_Sum {

	public static void main(String[] args) {
		
		
		int MatrizGigantekkk[][] = {{1,2,3,4,5,6,7,8,9,10}, {1,2,3,4,5,6,7,8,9,10},
				{1,2,3,4,5,6,7,8,9,10}, {1,2,3,4,5,6,7,8,9,10},
				{1,2,3,4,5,6,7,8,9,10}, {1,2,3,4,5,6,7,8,9,10},
				{1,2,3,4,5,6,7,8,9,10}, {1,2,3,4,5,6,7,8,9,10},
				{1,2,3,4,5,6,7,8,9,10}, {1,2,3,4,5,6,7,8,9,10}};
		int soma = 0;
		int linha;
		int coluna;
		
		for(linha = 0; linha < 10; linha++) { //Percorrendo Linhas
			for(coluna = 0; coluna < 10; coluna++) { //Percorrendo Colunas 
				soma = soma + MatrizGigantekkk[linha][coluna]; //Guardando a SOMA da perpectiva linha e coluna percorrida em uma variavel
				
			}
		}
		
		System.out.println(soma);	
	}

}
