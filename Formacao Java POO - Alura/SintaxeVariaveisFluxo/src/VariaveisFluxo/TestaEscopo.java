package VariaveisFluxo;

public class TestaEscopo {
	
	public static void main(String[] args) {
		
		System.out.println("TESTANDO ESCOPO DE VARIÁVEIS");
		
		int idade = 20;
		int quantidadePessoas = 3;
		
		if (quantidadePessoas >= 2) {
			// As variáveis são criadas a valem nas chaves que a mesma são criadas
			boolean acompanhado = true;
		} else {
			// Ou seja, o acompanhado de cima é diferente desse, por isso 'declaramos 2 vezes'
			boolean acompanhado = false;
		}
		
		// Isso aqui não funciona, pois a variável 'morreu' na condicional
		// System.out.println(acompanhado);
		
		// O mais correto é assim
		boolean acompanhadoNew;
		
		// Variáveis não ter valor padrão, e não podemos utiliza-las sem valor
		// System.out.println(acompanhadoNew);
		
		if(quantidadePessoas >= 2) {
			acompanhadoNew = true;
		} else {
			acompanhadoNew = false;
		}
		
		// Também não podemos utilizar a variável se existir alguma chance dela não ter valor
		String variavel;
		if(idade > 18) {
			variavel = "OK!";
		}
		// else {variavel = "NO!";}

		// Então isso causa erro se o else estiver comentado
		
		// System.out.println(variavel);
	}
}
