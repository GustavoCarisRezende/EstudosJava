package VariaveisFluxo;

public class TestaValores {
	// Atalho para criar o método main
	// Digitar 'main' Ctrl + espaço, selecionar o main
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		System.out.println("Segundo número: " + segundo);
		// Quando atribuimos o valor de uma variável a outra, ele atribui o valor novamente
		// E não referencia o objeto na memória como outras linguagens
		segundo = primeiro;
		System.out.println("Segundo número: " + segundo);
		primeiro = 10;
		System.out.println("Segundo número: " + segundo);
	}
}
