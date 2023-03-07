package VariaveisFluxo;

public class TestaLacos {

	public static void main(String[] args) {
		// Praticando os conhecimentos obtidos
		int tabuada = 1;
		while(tabuada <= 10) {
				for(int num = 0; num <= 10; num++) {
					String msg = Integer.toString(tabuada) + " X " + Integer.toString(num) + " = " + Integer.toString(num * tabuada);
					System.out.println(msg);
				}
				System.out.println("==============================");
				tabuada++;
		}
	}
}
