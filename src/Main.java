import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 4;

        System.out.println("====== Sistema Bancário ======");

        while (opcao != 0) {

            System.out.println("\n1) Conta Corrente");
            System.out.println("2) Conta Poupança");
            System.out.println("3) Conta Investimento");
            System.out.println("0) Encerrar");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Número da conta: ");
                String numeroDaConta = sc.nextLine();
                System.out.print("Titular: ");
                String titular = sc.nextLine();
                System.out.print("Saldo inicial: ");
                double saldo = sc.nextDouble();
                System.out.print("Limite do cheque especial: ");
                double limite = sc.nextDouble();
                ContaCorrente conta = new ContaCorrente(numeroDaConta, titular, saldo, limite);
                System.out.println("\n====== Informações da conta ======");
                conta.mostrarDados();
                System.out.print("\nDeseja detalhar o limite? (s/n): ");
                String resposta = sc.next().toLowerCase();
                boolean detalhar = resposta.equals("s");
                if (detalhar) {
                    System.out.println("\n====== Exibindo dados detalhados =====");
                    conta.mostrarDados(true);
                }

            } else if (opcao == 2) {
                System.out.print("Número da conta: ");
                String numeroDaConta = sc.nextLine();
                System.out.print("Titular: ");
                String titular = sc.nextLine();
                System.out.print("Saldo inicial: ");
                double saldo = sc.nextDouble();
                System.out.print("Taxa de rendimento mensal (%): ");
                double taxa = sc.nextDouble();
                ContaPoupanca conta = new ContaPoupanca(numeroDaConta, titular, saldo, taxa);
                System.out.println("\n====== Informações da conta ======");
                conta.mostrarDados();
                System.out.print("\nDeseja exibir a taxa anual? (s/n): ");
                String resposta = sc.next().toLowerCase();
                boolean anual = resposta.equals("s");
                if (anual) {
                    System.out.println("\n====== Exibindo dados com taxa anual ======");
                    conta.mostrarDados(true);
                }
                System.out.print("\nVisualizar projeção de saldo mensal? (s/n): ");
                resposta = sc.next().toLowerCase();
                boolean verProjecao = resposta.equals("s");
                if (verProjecao) {
                    System.out.print("Informe a projeção percentual (ex: 5): ");
                    double projecao = sc.nextDouble();
                    System.out.println("\n====== Exibindo dados com projeção ======");
                    conta.mostrarDados(projecao);
                }

            } else if (opcao == 3) {
                System.out.print("Número da conta: ");
                String numeroDaConta = sc.nextLine();
                System.out.print("Titular: ");
                String titular = sc.nextLine();
                System.out.print("Saldo inicial: ");
                double saldo = sc.nextDouble();
                System.out.print("Taxa de administração (%): ");
                double taxa = sc.nextDouble();
                ContaInvestimento conta = new ContaInvestimento(numeroDaConta, titular, saldo, taxa);
                System.out.println("\n======= Informações da conta =======");
                conta.mostrarDados();
                System.out.print("\nVizualizar a taxa de administração? (s/n): ");
                String resposta = sc.next().toLowerCase();
                boolean considerarTaxa = resposta.equals("s");
                if (considerarTaxa) {
                    System.out.println("\n====== Exibindo dados com taxa e projeção ======");
                    conta.mostrarDados(true);
                }

            } else if (opcao == 0) {
                System.out.println("\nEncerrando o sistema...");
            } else {
                System.out.println("\nOpção inválida! Tente novamente.");
            }
        }
        sc.close();
    }
}