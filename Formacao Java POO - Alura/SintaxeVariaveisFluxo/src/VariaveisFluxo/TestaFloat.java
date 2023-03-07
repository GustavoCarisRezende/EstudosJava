package VariaveisFluxo;

public class TestaFloat {
	public static void main(String[] args) {
		// Existem dois tipos de variáveis que armazenam valores com ponto flutuante em Java
		// Temos o double e o float
		double salario = 1250.70;
		System.out.println("O salário é de R$" + salario);
		// Valores do tipo inteiro podem ser usados em variáveis de ponto flutuante
		double idade = 37;
		System.out.println("Int como double: " + idade);
		// É possível realizar contas e atribuir os valores as variáveis
		double divisao = 33.14 / 2;
		System.out.println("O resultado da divisão é " + divisao);
		// Quando o Java se depara com esse tipo de situação, ele realiza o trucamento do resultado para o valor inteiro
		int outraDivisao = 5 / 2;
		System.out.println("Truncamento realizado pelo Java: " + outraDivisao);
		/*
		 * No caso abaixo, o java verifica primeiro as informações depois do '='
		 * Com isso, como ambos os valores são inteiros, o Java entende que o resultado deve ser inteiro
		 */
		double novaTentativa = 5 / 2;
		System.out.println("Nova tentativa da divisão: " + novaTentativa);
		// Para isso utilizamos um valor double na conta
		double outraTentativa = 5.0 / 2;  // Note que estamos declarando a variável e atribuindo o valor na mesma linha
		System.out.println("Outra tentativa: " + outraTentativa);
	}
}
