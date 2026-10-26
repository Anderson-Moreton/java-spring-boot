// Verifica frequência e nota do aluno para determinar se ele foi aprovado ou reprovado

public class AlunoAprovado {
    public static void main(String[] args) {
        int nota1 = 7;
        int nota2 = 8;
        int frequencia = 75; // Frequência em porcentagem

        if (frequencia >= 75 && (nota1 + nota2) / 2 >= 6) {
            System.out.println("Aprovado com frequência: " + frequencia + "% e média: " + (nota1 + nota2) / 2);
        } else {
            System.out.println("Reprovado com frequência: " + frequencia + "% e média: " + (nota1 + nota2) / 2);
        }
    }
}