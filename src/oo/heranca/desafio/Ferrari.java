package oo.heranca.desafio;

public class Ferrari extends Carro {

    @Override
    void acelerar() {
        velocidadeAtual += 15;
    }

    @Override
    void frear() {
        super.frear();
        super.frear();
        super.frear();
    }
}