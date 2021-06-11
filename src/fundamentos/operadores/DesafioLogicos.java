package fundamentos.operadores;

public class DesafioLogicos {

    public static void main(String[] args) {

        boolean trabalho1 = true; // Trabalho na terca (v ou F)
        boolean trabalho2 = true; // Trabalho na quinta (V ou F)

        boolean comprouTV50 = trabalho1 && trabalho2;
        System.out.println("Comprou TV de 50\"? " + comprouTV50);

        boolean comprouTV32 = trabalho1 ^ trabalho2;
        System.out.println("Comprou TV de 32\"? " + comprouTV32);

        boolean comprouSorvete = comprouTV50 || comprouTV32;
        System.out.println("Comprou sorvete? " + comprouSorvete);

        boolean maisSaudavel = !comprouSorvete; // Operador unario
        System.out.println("Mais saudavel? " + maisSaudavel);
    }
}
