package excecao.personalizadab;

import excecao.Aluno;
import excecao.personalizadaa.NumeroForaIntervaloException;

public class Validar {

    private Validar() {}

    public static void aluno(Aluno aluno) throws StringVaziaException, NumeroForaIntervaloException {

        if(aluno == null) {
            throw new IllegalArgumentException("O aluno esta nullo!");
        }

        if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
            throw new StringVaziaException("nome");
        }

        if(aluno.nota < 0 || aluno.nota > 10) {
            throw new NumeroForaIntervaloException("nota");
        }
    }
}