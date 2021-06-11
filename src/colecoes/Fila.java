package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();

		// Offer e Add -> Adicionam elementos na fila
		// Diferenca e o comportamento que ocorre quando a fila esta cheia
		fila.add("Ana"); // Retorna falso
		fila.offer("Bia"); // Lanca uma excepcao
		fila.offer("Carlos");
		fila.add("Daniel");
		fila.offer("Rafaela");
		fila.add("Gui");

		// Peek e Element -> obter o proximo elemento da fila (sem remover)
		// Diferenca e o comportamento que ocorre quando a fila esta vazia
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek()); // lanca uma excepcao
		System.out.println(fila.element());

		// Pool e Remove -> obter o proximo elemento da fila e remove
		// Diferenca e o comportamento que ocorre quando a fila esta vazia
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); // lanca uma excepcao
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		// fila.clear();
		// fila.size();
		// fila.isEmpty();
		//  fila.contains(...);
	}
}
