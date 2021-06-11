package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// (*f - 32) * 5/9 = *C
		final double FACTOR = 5 / 9.0;
		final double AJUSTE = 32;

		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE)  * FACTOR;

		System.out.println("O resultado é " + celsius + " °C.");
	}
}
