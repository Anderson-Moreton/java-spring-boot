// Verifica se a média das notas dos alunos é maior que 6 e retorna se foi aprovado ou 
// reprovado com operadores logicos

public class NotaAluno {
    public static void main(String[] args) {
        double nota1 = 7.5;
        double nota2 = 8.0;
        double media = (nota1 + nota2) / 2;

        if (media >= 6) {
            System.out.println("Aprovado com média: " + media);
        } else {
            System.out.println("Reprovado com média: " + media);
        }
    }
}