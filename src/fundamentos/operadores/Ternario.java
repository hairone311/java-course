package fundamentos.operadores;

public class Ternario {
    
    public static void main(String[] args) {
        
        double media = 8.6;
        String resultado = media >= 7.0 ? "aprovado." : "reprovado.";

        System.out.println("O aluno foi " + resultado);

        double nota = 7.3;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultadoDesconto = temDesconto ? "Sim" : "Nao";
        System.out.println("Tem desconto? " + resultadoDesconto);
    }
}
