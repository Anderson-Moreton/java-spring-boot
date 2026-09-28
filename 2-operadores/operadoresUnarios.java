// Operadores Unarios
public class operadoresUnarios {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println("Número original: " + numero);

        // Operador unario de incremento
        numero++;
        System.out.println("Depois do incremento: " + numero);

        // Operador unario de decremento
        numero--;
        System.out.println("Depois do decremento: " + numero);

        // Operador unario de negação
        boolean esVerdadero = true;
        System.out.println("Valor original: " + esVerdadero);
        esVerdadero = !esVerdadero;
        System.out.println("Depois da negação: " + esVerdadero);
    }
}