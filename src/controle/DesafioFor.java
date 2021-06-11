package controle;

public class DesafioFor {

	public static void main(String[] args) {

		String valor = "#";

		for (int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}

		// Versao do desafio
		// Não pode usar valor numérico para controlar o laço!
		for (String cerquilha = "#"; !cerquilha.equals("######"); cerquilha += "#") {
			System.out.println(cerquilha);
		}
	}
}
