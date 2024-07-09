/**
 * @author Wellington Oliveira
 */

public class CalculoMediaNota {

    public static void main(String[] args) {
        mediaNotasAluno();
    }

    private static void mediaNotasAluno() {

        int aluno1 = 8;
        int aluno2 = 7;
        int aluno3 = 9;
        int aluno4 = 8;

        int mediasnotas = (aluno1 + aluno2 + aluno3 + aluno4)/4;

        System.out.println(mediasnotas);
    }
}
