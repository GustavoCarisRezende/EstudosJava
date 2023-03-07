package VariaveisFluxo;

public class CalculoIR {
	
	public static void main(String[] args) {
		
		double salario = 3300.00;
		String msg = "";
		
		if(salario >= 1900 && salario <= 2800) {
			msg = "7.5%, com até R$142";
		} else if(salario > 2800 && salario <= 3751) {
			msg = "15%, com até R$350";
		} else if(salario > 3751 && salario <= 4664) {
			msg = "22.5%, com até R$636";
		}
		
		System.out.println("\nCom base em seu salário, seu IR é de " + msg + " de dedução!\n");
		
	}
	
}
