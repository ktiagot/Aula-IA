package a2202;

import java.util.Scanner;

public class Exercicio02_2 {
	
	public static void main(String[] args) {
		String p1 = "parmera";
		String p2 = "palmeiras";
		String p3 = "corinthians";
		
		System.out.println(contaIguais(p1, p2));
		System.out.println(contaIguais(p1, p3));
		System.out.println(" ");
		System.out.println(contaPosicao(p1, p2));
		System.out.println(contaPosicao(p1, p3));
		System.out.println(" ");
		System.out.println(contaProporcao(p1, p2));
		System.out.println(contaProporcao(p1, p3));
		System.out.println(" ");
		System.out.println(obterSimilaridade(p1, p2));
		System.out.println(obterSimilaridade(p1, p3));
	}
	//Somar um ponto para cada caractere de A que constar em B
	public static int contaIguais(String p1, String p2) {
		int pontos = 0;
		
		//Repeti��o para pegar letra por letra da palavra P1
		for (int i = 0; i < p1.length(); i++) {
			
			//Obtendo letra da P1
			char l1 = p1.charAt(i);
			
			//Repeti��o para pegar letra por letra da palavra P2
			for (int j = 0; j < p2.length(); j++) {
				
				//Obtendo letra da P2
				char l2 = p2.charAt(j);
				
				//Soma um ponto se P1 e P2 forem iguais
				if(l1 == l2) {
					pontos++;
				}
				
			}
		}
		
		return pontos;
	}

	
	//Somar dois pontos para cada caractere de P1 que constar em P2 e estiver na mesma propor��o
	public static int contaProporcao(String p1, String p2) {
		int pontos = 0;
		
		//Repeti��o para pegar letra por letra da palavra P1
		for(int i = 0; i < p1.length(); i++) {
			
			//Obtenho letra de P1
			char letra = p1.charAt(i);
			
			//Conto quantas vezes a letra aparece em P1
			int qtdeL1 = contaLetras(p1, letra);
			
			//Conto quantas vezes a letra aparece em P2
			int qtdeL2 = contaLetras(p2, letra);
			
			//Somos dois pontos se as quantidades forem iguais
			if(qtdeL1 == qtdeL2) {
				pontos += 2;
			}
			
		}
		return pontos;
	}
	
	//Somar tr�s pontos para cada caractere de A que constar em B e estiver na mesma posi��o
	public static int contaPosicao(String p1, String p2) {
		int pontos = 0;
		
		//Repeti��o para obter letra por letra da palavra P1
		for(int i = 0; i < p1.length(); i++) {
			
			//Cuido para n�o acessar �ndice inexistente de P2
			if(i >= p2.length()) break;
			
			char l1 = p1.charAt(i); //Obtendo letra da P1
			char l2 = p2.charAt(i); //Obtendo letra da P2
			
			//Somo tr�s pontos se letras de P1 e P2 forem iguais
			if (l1 == l2) {
				pontos += 3;
			}
		}
		return pontos;
	}
	
	public static int contaLetras(String p1, char letra) {
		int qtde = 0;
		
		//Repeti��o para pegar letra por letra
		for (int i = 0; i < p1.length(); i++) {
			
			//Obtenho a letra de P1
			char l1 = p1.charAt(i);
			
			//Somos um se a letra de P1 for igual a letra do par�metro
			if (l1 == letra) qtde++;
		}
		return qtde;
	}
	
	public int obterDistancia(String p1, String p2) {
		return 0;
	}
	
	public static double obterSimilaridade (String p1, String p2) {
		double similaridade = 0;
		
		//Obtenho a pontua��o m�xima para a palavra p2
		double maxPtos = obterPontuacao(p2, p2);

		//Obtenho a pontua��o m�xima para a palavra p1
		double ptos = obterPontuacao(p1, p1);
		
		//Verifico a propor��o entre a pontua��o e a pontua��o m�xima
		similaridade = ptos / maxPtos;
		
		return similaridade;
	}
	
	public static int obterPontuacao(String p1, String p2) {
		int pontuacao = 0;
		//Obter pontuacao do crit�rio 1;
		pontuacao += contaIguais(p1, p2);
		//Obter pontuacao do crit�rio 2;
		pontuacao += contaProporcao(p1, p2);
		//Obter pontuacao do crit�rio 3;
		pontuacao += contaPosicao(p1, p2);
		
		//Somar pontua��o e retornar
		return pontuacao;
	}
	
}
