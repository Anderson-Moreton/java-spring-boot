// Verifica se é par ou ímpar utilizando Switch case

public class SwitchCase {
    public static void main(String[] args) {
        int numero = 10;
        switch (numero % 2) {
            case 0:
                System.out.println("O número " + numero + " é par.");
                break;
            case 1:
                System.out.println("O número " + numero + " é ímpar.");
                break;
            default:
                System.out.println("Número inválido.");
        }
    }
}