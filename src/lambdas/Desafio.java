package lambdas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    
    public static void main(String[] args) {
        
        Produto p = new Produto("iPad", 3255.89, 0.13);

        /**
         * 1. A partir do produto calcular o preco real (com desconto)
         * 2. Imposto municipal: >= 2500 (8.5%) / < 2500 (Isento)
         * 3. Frete: >= 3000 (100) / < 3000 (50)
         * 4. Arredondar: Deixar duas casas decimais
         * 5. Formatar R$1234,56
         */


        // 1
        Function<Produto, Double> precoReal = 
                produto -> produto.preco * (1 - produto.desconto);

        // 2
        UnaryOperator<Double> imposto = 
                preco -> preco >= 2500 ? preco * (1 + 0.085) : preco;

        // 3
        UnaryOperator<Double> frete = 
                preco -> preco >= 3000 ? preco + 100 : preco + 50;

        // 4
        UnaryOperator<Double> precoFinal = preco -> {
            BigDecimal bd = new BigDecimal(preco)
                    .setScale(2, RoundingMode.HALF_UP);
            return bd.doubleValue();
        };

        // 5
        Function<Double, String> precoFormatado = 
                preco -> String.format("R$%.2f", preco);

        System.out.println(precoReal
                .andThen(imposto)
                .andThen(frete)
                .andThen(precoFinal)
                .andThen(precoFormatado)
                .apply(p));
    }
}