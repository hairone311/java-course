package fundamentos;

public class TipoString {

    public static void main(String[] args) {
        System.out.println("Oi pessoal!".charAt(5));

        String s = "Boa tarde";

        System.out.println(s.concat("!"));
        System.out.println(s + "!");
        System.out.println(s.startsWith("boa"));
        System.out.println(s.length());
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.162;

        System.out.println("Nome: " + nome +
                            "\nSobrenome" + sobrenome +
                            "\nIdade: " + idade +
                            "\nSalario: " + salario);
        
        System.out.printf("O senhor %s %s tem %d anos de idade e ganha %.2f MT",
                            nome, sobrenome, idade, salario);

        String frase = String.format("\nO senhor %s %s tem %d anos de idade e ganha %.2f MT",
                                        nome, sobrenome, idade, salario);
        
        System.out.println(frase);
    }
}
