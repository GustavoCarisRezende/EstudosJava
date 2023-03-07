package VariaveisFluxo;

public class TestaFor {

	public static void main(String[] args) {
		
		// O for possuí seus argumentes separados por ;
		// Temos 3 argumentos no for, sendo eles
		// 	[1] Opcional: Declaração e inicialização do contados - É executado somente na primeira vez
		// 	[2] Condição que verifica se o laço deve se repetir novamente
		// 	[3] Oque deve ser executado no final de cada interação
		for(int contador = 0; contador <= 10; contador++) {
			System.out.println(contador);
		}
		// Isso não funciona pois a variável só existe no for
		// System.out.println(contador);
	}
	
}
