import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            // Solicitando os dados da conta
            System.out.println("Por favor, digite o número da Agência!:");
            String agencia = scanner.nextLine();

            System.out.println("Por favor, digite o número da Conta:");
            int numero = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Por favor, digite o nome do Cliente:");
            String nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o saldo da Conta:");
            double saldo = scanner.nextDouble();

            // Exibindo a mensagem final
            String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência 067-8 %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);
            System.out.println(mensagem);
        }
    }
}


