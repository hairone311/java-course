package controle;

public class DesafioFor {

	public static void main(String[] args) {

		String valor = "#";

		for (int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}

		// Versao do desafio
		// N�o pode usar valor num�rico para controlar o la�o!
		for (String cerquilha = "#"; !cerquilha.equals("######"); cerquilha += "#") {
			System.out.println(cerquilha);
		}
	}
}
