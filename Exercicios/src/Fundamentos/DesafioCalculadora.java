package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		//Ler num1
		//Ler num2
		// + - * / %
		Scanner ent1 = new Scanner(System.in);
		
		System.out.println("Informe o número: ");
		double num1 = ent1.nextDouble();
		
		System.out.println("Informe o número: ");
		double num2 = ent1.nextDouble();
		
		System.out.println("Digite qual operação vc deseja");
		String op = ent1.next();
		
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("%.2ff %s %.2f = %.2f", num1 , op, num2, resultado);
		
		
		ent1.close();
	}
}
