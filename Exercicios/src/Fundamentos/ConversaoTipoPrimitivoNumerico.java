package Fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1; // Conversao Implicita
		System.out.println(a);
		
		//Cast
		float b = (float) 1.12345; //Conversao explicita
		System.out.println(b);
		
		int c = 10;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.999;
		int f = (int) e;
		System.out.println(f);
	}
}
