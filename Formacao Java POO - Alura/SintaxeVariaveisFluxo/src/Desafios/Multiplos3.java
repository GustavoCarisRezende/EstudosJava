package Desafios;

public class Multiplos3 {
	public static void main(String[] args) {
		for(int num = 100; num >=0; num--) {
			if(num % 3 == 0) {
				String msg = "O número " + Integer.toString(num) + " é múltiplo de 3";
				System.out.println(msg);
			}
		}
	}
}
