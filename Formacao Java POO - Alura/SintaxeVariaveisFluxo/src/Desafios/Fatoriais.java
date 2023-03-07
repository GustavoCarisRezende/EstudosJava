package Desafios;

public class Fatoriais {
	public static void main(String[] args) {
		
		for(int valorPrincipal = 1; valorPrincipal <= 10; valorPrincipal++) {
			int resultado = 1;
			for(int valorFatorial = 1; valorFatorial <= valorPrincipal; valorFatorial++) {
				resultado *= valorFatorial;
			}
			System.out.println("Fatorial de " + Integer.toString(valorPrincipal) + 
							   " equivale a " + Integer.toString(resultado));
		}
	}
}
