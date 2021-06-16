package oo.heranca;

public class jogo {

    public static void main(String[] args) {

        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi = new Heroi();
        heroi.x = 10;
        heroi.y = 11;

        System.out.println("Monstro tem => " + monstro.vida + " vidas");
        System.out.println("Heroi tem => " + heroi.vida + " vidas");

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Monstro tem => " + monstro.vida + " vidas");
        System.out.println("Heroi tem => " + heroi.vida + " vidas");
    }
}
