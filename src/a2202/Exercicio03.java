package a2202;

public class Exercicio03 {

	public static void main(String[] args) {
		String[] dicio = {"palmeiras", "santos", "corinthians", "são paulo", "portuguesa"};
		
		String termo = "parmera";
		
		double menor = -1;
		String sugestao = null;
		for (String palavra: dicio) {
			double distancia = 
					Exercicio02_2.obterDistancia(termo, palavra);
			if (distancia < menor || sugestao == null) {
				menor = distancia;
				sugestao = palavra;
			}
		}
		System.out.println("Você quis dizer: "+ sugestao);
	}
}
