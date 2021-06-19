package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {

    public static void main(String[] args) {

        Carro civic = new Civic();

        Carro ferrari = new Ferrari(400);

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