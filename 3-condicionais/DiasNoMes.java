// Verifica o número de dias em um mês usando switch case

public class DiasNoMes {
    public static void main(String[] args) {
        int mes = 2;

        switch (mes) {
            case  1, 3, 5, 7, 8, 10, 12 -> System.out.println("O mês tem 31 dias.");
            case  4, 6, 9, 11 -> System.out.println("O mês tem 30 dias.");
            case  2 -> System.out.println("O mês tem 28 ou 29 dias.");
            default -> System.out.println("Mês inválido, selecione um número entre 1 e 12.");
        }
    }
}