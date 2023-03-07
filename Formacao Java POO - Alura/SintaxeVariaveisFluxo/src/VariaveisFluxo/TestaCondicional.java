package VariaveisFluxo;

public class TestaCondicional {

	public static void main(String[] args) {
		// Template sysout do eclipse para o comando abaixo
		System.out.println("TESTE DE CONDICIONAIS\n");
		
		int idade = 19;
		int qtdePessoas = 3;
		
		// O comanando if checa se uma condição é verdadeira, caso seja, executa o bloco dentro das chaves {}
		if (idade >= 18) {
			System.out.println("Você pode entrar!");
		} else { // Se a condição não for verdadeira, o bloco else é executado
			if (qtdePessoas >= 2) {
				System.out.println("Você pode entrar acompanhado de um responsável!");
			} else {
				System.out.println("Você não pode entrar!");
			}
		}
		// Caso tenhamos somente uma instrução no if, não precsamos colocar as chaves
		// Mas por convenção utilizamos sempre as chaves
		if (idade == 18)
			System.out.println("Você tem 18 anos!");
		// Para o else vale a mesma regra, mas por convenção, normalmente não é usado
		else
			System.out.println("Você não tem 18 anos!");
	}

}
