// Criar um programa que calcula a soma dos númerros de 1 a 10 usando o laço for.
public class MainExercicio1 {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            soma += i;
        }
        System.out.println("A soma dos números de 1 a 10 é: " + soma);
    }
}