package VariaveisFluxo;

public class TestaCaracteres {
	public static void main(String[] args) {
		// O tipo char trabalha com caracteres representados pelas aspas simples ''
		// O char armazena o código do caractere selecionado, como o padrão ASC / Unicode
		char letra = 'A';
		System.out.println("Sua letra é: " + letra);
		// Portanto o char armazena um valor inteiro
		char valor = 951;
		System.out.println("O caractere selecionado é o: " + valor);
		// Podemos somar valores no char, porém temos de especificar a conversão
		// valor = valor = 1;  // Não compila
		valor = (char) (valor = 1);
		System.out.println("O novo caractere selecionado é o: " + valor);
		
		// O tipo char não é muito utilizado, normalmente usamos o tipo String
		// Vale ressaltar que a String não é uma palavra reservada no Java por não ser um tipo primitivo
		String palavra = "Gustavo Rezende";  // Representada por ""
		System.out.println("A palavra é " + palavra);
		
		// Podemos concatenar strings
		palavra = palavra + ", soy yo.";
		System.out.println("A palavra é " + palavra);
	}
}
