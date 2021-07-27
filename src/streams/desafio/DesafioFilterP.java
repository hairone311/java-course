package streams.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilterP {
    
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Lisa", 22, 8.1);
        Aluno a2 = new Aluno("Ana", 17, 9.0);
        Aluno a3 = new Aluno("Isaac", 15, 9.0);
        Aluno a4 = new Aluno("Iveth", 18, 6.5);
        Aluno a5 = new Aluno("Tom", 25, 8.1);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

        Predicate<Aluno> idadeElegivel = 
            a -> a.idade >= 18 && a.idade <= 25;
        
        Predicate<Aluno> notaElegivel = 
            a -> a.nota >= 7 && a.nota <= 10;

        Function<Aluno, String> saudacaoAprovado = 
            a -> "Ola " + a.nome + ", voce ganhou uma bolsa de estudos. Parabens!";

        alunos.stream()
            .filter(idadeElegivel)
            .filter(notaElegivel)
            .map(saudacaoAprovado)
            .forEach(System.out::println);
    }
}