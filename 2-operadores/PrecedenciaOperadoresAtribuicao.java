public class PrecedenciaOperadoresAtribuicao {
    public static void main(String[] args) {
        int numero = 5;

        // Pré-incremento
        int resultadoPreIncremento = ++numero; // Incrementa antes de atribuir
        System.out.println("Resultado do pré-incremento: " + resultadoPreIncremento);
        System.out.println("Valor de 'numero' após o pré-incremento: " + numero);

        // Pós-incremento
        int resultadoPosIncremento = numero++; // Atribui antes de incrementar
        System.out.println("Resultado do pós-incremento: " + resultadoPosIncremento);
        System.out.println("Valor de 'numero' após o pós-incremento: " + numero);

        // Pré-decremento
        int resultadoPreDecremento = --numero; // Decrementa antes de atribuir
        System.out.println("Resultado do pré-decremento: " + resultadoPreDecremento);
        System.out.println("Valor de 'numero' após o pré-decremento: " + numero);

        // Pós-decremento
        int resultadoPosDecremento = numero--; // Atribui antes de decrementar
        System.out.println("Resultado do pós-decremento: " + resultadoPosDecremento);
        System.out.println("Valor de 'numero' após o pós-decremento: " + numero);
    }
}
