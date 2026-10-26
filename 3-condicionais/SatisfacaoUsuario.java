// Verifica o nível de satisfação do usuário usando Switch case

public class SatisfacaoUsuario {
    public static void main(String[] args) {
        int nivelSatisfacao = 4; // Exemplo de nível de satisfação (1 a 5)

        switch (nivelSatisfacao) {
            case 1 -> System.out.println("O usuário está muito insatisfeito.");
            
            case 2 -> System.out.println("O usuário está insatisfeito.");
            
            case 3 -> System.out.println("O usuário está neutral.");
            
            case 4 -> System.out.println("O usuário está satisfeito.");
            
            case 5 -> System.out.println("O usuário está muito satisfeito.");
            
            default -> System.out.println("Opção inválida, selecione um nível de satisfação entre 1 e 5.");
        }
    }
}
