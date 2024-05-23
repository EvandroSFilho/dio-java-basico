import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            System.out.println("----------------------------------");
            System.out.println("Menu de Operações Bancárias:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("0 - Encerrar Operação");
            System.out.println("----------------------------------");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Informe o valor a ser depositado: ");
                    double valorDeposito = scan.nextDouble();
                    if (valorDeposito > 0) {
                        saldo += valorDeposito;
                        System.out.println(String.format("Saldo atual: %.1f", saldo));
                    } else {
                        System.out.println("Valor invalido.");
                    }
                    break;
                case 2:
                    Scanner scanne = new Scanner(System.in);
                    System.out.println("Informe o valor a ser sacado: ");
                    double saque = scanne.nextDouble();
                    if (saque > 0 && saque <= saldo) {
                        saldo -= saque;
                        System.out.println(String.format("Saldo atual: %.1f", saldo));
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.println(String.format("Saldo atual: %.1f", saldo));
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false; // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}