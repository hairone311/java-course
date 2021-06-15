package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {

		Compra compra1 = new Compra();
		compra1.adicionarItem("Arroz", 2000, 1);
		compra1.adicionarItem(new Produto("Notebook", 20000), 2);

		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 100, 5);
		compra2.adicionarItem(new Produto("Impressora", 5000), 2);

		Cliente cliente = new Cliente("Maria Julia Moraes");
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2);

		System.out.println(cliente.obterValorTotal());
	}
}
