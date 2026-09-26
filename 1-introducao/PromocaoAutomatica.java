public class PromocaoAutomatica {
    public static void main(String[] args) {
        byte a = 10;
        short b = 20;
        char c = 'A';
        int d = 30;
        long e = 40L;
        float f = 50.0f;
        double g = 60.0;

        // Operações de promoção automática
        int resultado1 = a + b; // byte + short -> int
        System.out.println("Resultado 1: " + resultado1);

        int resultado2 = c + d; // char + int -> int
        System.out.println("Resultado 2: " + resultado2);

        float resultado3 = e + f; // long + float -> float (promovido para long)
        System.out.println("Resultado 3: " + resultado3);

        double resultado4 = g + d; // double + int -> double
        System.out.println("Resultado 4: " + resultado4);

    }
}
