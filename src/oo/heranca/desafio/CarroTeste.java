package oo.heranca.desafio;

public class CarroTeste {

    public static void main(String[] args) {

        Carro civic = new Civic();

        Carro ferrari = new Ferrari();

        civic.acelerar();
        System.out.println(civic);

        civic.acelerar();
        System.out.println(civic);

        ferrari.acelerar();
        System.out.println(ferrari);

        ferrari.acelerar();
        System.out.println(ferrari);
    }
}