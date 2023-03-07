package VariaveisFluxo;

public class SwitchCase {

	public static void main(String[] args) {
		
		// O switch case também é uma condicional do java e serve para comparação de opções, como no exemplo
		int mes = 10;
		String nomeMes = "";
		
		switch (mes){
			case 1:  // Condição
				nomeMes = "Janeiro";
				break;  // Interrompe o bloco da condição
			case 2:
				nomeMes = "Fevereiro";
				break;
			case 3:
				nomeMes = "Março";
				break;
			case 4:
				nomeMes = "Abril";
				break;
			case 5:
				nomeMes = "Maio";
				break;
			case 6:
				nomeMes = "Junho";
				break;
			case 7:
				nomeMes = "Julho";
				break;
			case 8:
				nomeMes = "Agosto";
				break;
			case 9:
				nomeMes = "Setembro";
				break;
			case 10:
				nomeMes = "Outubro";
				break;
			case 11:
				nomeMes = "Novembro";
				break;
			case 12:
				nomeMes = "Dezembro";
				break;
			// O default ocorre se nenhuma das condições for verdadeira
			default:
				nomeMes = "Inválido";
				break;
		}
		
		System.out.println("O mês escolhido é " + nomeMes);
		
	}
	
}
