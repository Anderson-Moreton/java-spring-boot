// Operadores de Comparação
public class operadoresComparacao {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Operações de Comparação
        boolean igual = a == b; // Igualdade
        boolean diferente = a != b; // Diferença
        boolean maior = a > b; // Maior que
        boolean menor = a < b; // Menor que
        boolean maiorOuIgual = a >= b; // Maior ou igual
        boolean menorOuIgual = a <= b; // Menor ou igual

        System.out.println("Igual: " + igual);
        System.out.println("Diferente: " + diferente);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Maior ou Igual: " + maiorOuIgual);
        System.out.println("Menor ou Igual: " + menorOuIgual);
    }
}