package VariaveisFluxo;

public class TesteSomatoria {

	public static void main(String[] args) {
		int contador = 0;
		int total = 0;
		while(contador <= 10) {
			// Toda vez que o laço terminal, a variável total morre e é reinicializada
			// int total = 0;
			total += contador;
			// System.out.println(total);
			contador++;
		}
		System.out.println(total);
	}
	
}
