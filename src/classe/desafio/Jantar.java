package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Eliseu", 99.8);
		
		Comida c1 = new Comida("Arroz", 0.180);
		Comida c2 = new Comida("Feijao", 0.300);
		
		System.out.println(p1.apresentar());
		p1.Comer(c1);
		
		System.out.println(p1.apresentar());
		p1.Comer(c2);
		
		System.out.println(p1.apresentar());
	}
}
 