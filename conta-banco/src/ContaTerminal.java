import java.util.Scanner;
// Como estou utilizando comando de entrada, preciso importar o Scanner para dentro do meu projeto.

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação do objeto Scanner para leitura do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicitação dos dados ao usuário
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do Enter 

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = scanner.nextDouble();
        // Se eu utilizar o nextDouble, ao passar o valor preciso representar com virgula.
        // Para não ocorrer erro posso utilizar o .parseDouble, como é um comando mais avançado, não utilizarei nesse desafio.
        

        // Mensagem final com concatenação dos dados
        // Utilizei o println para não ter que ficar dando /n para quebra de linha
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fecha o Scanner
        scanner.close();
    }
}
