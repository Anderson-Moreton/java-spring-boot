// Crie um programa que conte quantos doces o filho pode comer enquanto a condição estabelecida pela
// mãe for verdadeira. Ou seja, no máximo 3 doces.

public class MainExercicio2 {
    public static void main(String[] args) {
        int contadorDoces = 1;

        while (contadorDoces <= 3) {
            System.out.println("O filho pode comer o doce número: " + contadorDoces);
            contadorDoces++;
        }
    }
}