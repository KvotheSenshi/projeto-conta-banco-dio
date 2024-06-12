import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("CONTA BANCÁRIA - ITAÚ");
        System.out.println();
        System.out.println("Por favor, digite o número de sua agência (1234): ");
        agencia = sc.next();

        System.out.println("Agora digite o número da sua conta (12345): ");
        numero = sc.nextInt();

        System.out.println("Informe o seu nome:");
        nomeCliente = sc.next();
        sc.nextLine();

        System.out.println("Agora me informe o seu saldo atual: ");
        saldo = sc.nextDouble();

        System.out.println();
        System.out.printf("Olá %s, obrigado pro criar uma conta em "
                        + "nosso BANCO, sua agência é: %s "
                        + "Conta: %d e seu saldo de R$ %.2f já está disponível "
                        + "para saque.", nomeCliente, agencia, numero, saldo);

        sc.close();

    }

}

    
        // TO DO: Conhecer e importar a classe scanner
        // TO DO: Exibir as mensagens para o nosso usuário
        // TO DO: Obter pela classe scanner os valores digitados pelo terminal
        // TO DO: Exibir a mensagem da conta criada
    

