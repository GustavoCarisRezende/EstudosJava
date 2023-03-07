/*
 * int: 32 bits;
 * long: 64 bits = 48944L;
 * short: 16 bits;
 * byte: até 127;
 * */

package VariaveisFluxo;

public class TestaConversao {
	public static void main(String[] args) {
		// Não é possível realizar a conversão de um double para int apenas atribuindo os valores
		double salario = 1270.5;
		// int valor = salario; \\
		// Para isso realizamos o cast do tipo da variável, com a sintaxe abaixo
		int valor = (int) salario;	
		System.out.println("Valor após o cast: " + valor);
		// O double não é preciso, assim como o float, por isso, no exemplo abaixo temos o resultado
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println("O total é: " + total);
		float valorFloat = 3.14f;
		System.out.println("Valor float: " + valorFloat);
	}
}
