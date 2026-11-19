// Demonstrar a aplicação prática dos comandos continue e break em uma estrutura de repetição em Java, 
// usando uma lista de códigos de carteirinha de convênio médico.

public class MainExercicio4 {
    public static void main(String[] args) {
        int codigoDeSaida = 9;
        
        //Inicie um laço for que comece em 1 e vá até 10, usando a variável codigoCarteirinha.  
        for (int codigoCarteirinha = 1; codigoCarteirinha <= 10; codigoCarteirinha++) {
            //Verifique se o codigoCarteirinha é aceito pelo hospital Santa Clara (códigos 3, 7 e 10).
            if (codigoCarteirinha == 3 || codigoCarteirinha == 7 || codigoCarteirinha == 10) {
                // Código aceito, continua para a próxima iteração
                continue;
            }
            
            //Se o código da carteirinha for igual a 8, use o comando break para sair do laço.
            if (codigoCarteirinha == codigoDeSaida) {
                break;
            }
            //Imprima o código da carteirinha atual.
            System.out.println("Código da carteirinha: " + codigoCarteirinha);

        }
    }
}