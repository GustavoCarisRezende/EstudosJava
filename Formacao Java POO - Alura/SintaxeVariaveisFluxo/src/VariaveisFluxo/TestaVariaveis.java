/*
 * 	Temos que ficar atentos as convenções utilizadas no Java.
 * */

package VariaveisFluxo;

public class TestaVariaveis {
	public static void main(String[] args){
		System.out.println("Hi new teste!");
		
		// O Java é uma linguagem fortemente tipada
		int idade;  // Declarando a variável
		idade = 19;  // Tipo inteiro recebe valores numéricos
		// Exibindo o valor da variável
		System.out.println("Idade " + idade);
		
		// Trabalhando com operações matemáticas
		idade = 30 + 10;
		// O '+' pode somar valores e concatenar Strings
		System.out.println("Nova idade " + idade);
		idade = 7 * (5 + 2);
		System.out.println("Outra idade " + idade);
	}
}
