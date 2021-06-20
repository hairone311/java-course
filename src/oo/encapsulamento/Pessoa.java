package oo.encapsulamento;

public class Pessoa {

    private int idade;
    private String nome;
    private String sobrenome;

    public Pessoa(String nome, String sobrenome, int idade) {
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);
    }

    // Getter
    public int getIdade() {
        return idade;
    }

    // Setter
    public void setIdade(int novaIdade) {
        novaIdade = Math.abs(novaIdade);
        if (novaIdade >= 0 && novaIdade < 130) {
            this.idade = novaIdade;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto() {
        return getNome() + " " + getSobrenome();
    }

    public String toString() {
        return "Ola, eu sou o " + getNome() + ", tenho " + getIdade() + " anos.";
    }
}