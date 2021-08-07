package excecao.personalizadaa;

public class NumeroForaIntervaloException extends RuntimeException {

    private String nomeDoAtributo;
    
    public NumeroForaIntervaloException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atributo '%s' esta fora do intervalo.",
                nomeDoAtributo);
    }
}