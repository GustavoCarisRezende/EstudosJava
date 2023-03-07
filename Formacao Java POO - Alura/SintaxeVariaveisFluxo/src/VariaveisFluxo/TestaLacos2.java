package VariaveisFluxo;

public class TestaLacos2 {

	public static void main(String[] args) {
		int linha = 0;
		while(linha <= 10) {
				for(int coluna = 0; coluna <= 10; coluna++) {
					if(coluna > linha) {
						// O comando break interrmope a execução do laço que ele está
						break;
					}
					System.out.print("*");
				}
				System.out.println();
				linha++;
		}
	}	
}
