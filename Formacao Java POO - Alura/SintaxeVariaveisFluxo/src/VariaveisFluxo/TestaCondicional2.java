/* 	Quando escrevemos muitos if e else encadeados, isso não é uma boa prática,
 * sendo considerado 'complexidade ciclomática'. Por isso podemos utilizar os
 * operadores pipe '||' para 'ou' e '&&' para a condicional 'e'. Lembrando de
 * ser respeitado as regras dos parênteses.
 * */

package VariaveisFluxo;

public class TestaCondicional2 {

	public static void main(String[] args) {
		
		// Outro tipo primitivo que temos são os boolenaos		
		int idade = 18;
		int qtdePessoas = 2;
		boolean acompanhado = (qtdePessoas >= 2);  // true ou false
		// Também podem ser atribuídas expressões booleanas na variável
		
		// Como a variável é do tipo boolean, não precisamos falar se ela é == true
		if (idade >= 18 && acompanhado) {
			System.out.println("Você pode entrar!");
		} else {
			System.out.println("Você não pode entrar!");
		}
		
	}

}
