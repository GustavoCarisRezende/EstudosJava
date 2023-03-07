package VariaveisFluxo;

public class TesteWhile {

	// O while realiza a execução do bloco enquanto a condição for verdadeira
	public static void main(String[] args) {
		// É necessário inicializar e atribuir um valor a variável usada no while
		int contador = 0;
		while(contador <= 10) {
			System.out.println(contador);
			// contado = contador + 1/
			// contador += 1;
			contador ++;
		}
		System.out.println(contador);
	}
	
}
