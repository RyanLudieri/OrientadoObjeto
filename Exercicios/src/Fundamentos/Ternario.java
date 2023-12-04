package Fundamentos;

public class Ternario {
	public static void main(String[] args) {
		double media = 6.6;
		//String resultadoparcial = media >= 5.0 ? "em recuperação" : "reprovado";
		String resultado = media >= 7.0 ? "aprovado." : "em recuperação";
		
		System.out.println("O aluno está " + resultado);
	}
}
