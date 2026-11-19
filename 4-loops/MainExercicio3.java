// Crie um programa que calcule s soma de todos os números iteiros positivos e menores ou iguais a esse 
// número. Utilize o laço do...while

public class MainExercicio3 {
    public static void main(String[] args) {
        int numero = 10; // Número para calcular a soma
        int soma = 0;
        int i = 1;

        do {
            soma += i; // Adiciona o número atual à soma
            i++;
        } while (i <= numero);

        System.out.println("A soma de todos os números inteiros positivos e menores ou iguais a " + numero + " é: " + soma);
    }
}
