package lambdas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    
    public static void main(String[] args) {
        
        Produto p = new Produto("iPad", 3235.89, 0.13);

        /**
         * 1. A partir do produto calcular o preco real (com desconto)
         * 2. Imposto municipal: >= 2500 (8.5%) / < 2500 (Isento)
         * 3. Frete: >= 3000 (100) / < 3000 (50)
         * 4. Arredondar: Deixar duas casas decimais
         * 5. Formatar R$1234,56
         */

        Function<Produto, Double> precoFinal = 
                produto -> produto.preco * (1 - produto.desconto);

        UnaryOperator<Double> impostoMunicipal = 
                preco -> preco >= 2500 ? preco * 1.085 : preco;

        UnaryOperator<Double> frete = 
                preco -> preco >= 3000 ? preco + 100 : preco + 50;

        UnaryOperator<Double> arredondar = preco -> {
            BigDecimal bd = new BigDecimal(preco).setScale(2, RoundingMode.HALF_UP);
            return bd.doubleValue();
        };

        Function<Double, String> formatar = 
                preco -> String.format("R$%.2f", preco).replace(".", ",");

        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);
        
        System.out.println("O preço final é: " + preco);
    }
}