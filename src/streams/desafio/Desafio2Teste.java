package streams.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio2Teste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Arroz", 1750, 0.3, 0.0);
        Produto p2 = new Produto("Trigo", 75, 0.0, 0.0);
        Produto p3 = new Produto("Farinha", 1490, 0.4, 100);
        Produto p4 = new Produto("Soja", 550, 0.3, 0.0);
        Produto p5 = new Produto("Maizena", 1000, 0.3, 0.0);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        Predicate<Produto> desconto = 
            p -> p.desconto >= 0.3;

        Predicate<Produto> frete =
            p -> p.frete == 0;

        Function<Produto, String> superPromocao =
            p -> p.nome + " que custa MZN" + p.preco + " esta em super promocao" 
            + "por MZN" + p.preco * (1 - p.desconto); 
        
        produtos.stream()
            .filter(desconto)
            .filter(frete)
            .map(superPromocao)
            .forEach(System.out::println);
    }
}