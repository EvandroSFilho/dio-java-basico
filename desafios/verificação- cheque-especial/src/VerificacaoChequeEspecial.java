import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Infome o valor do saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Informe o valor do saque: ");
        double saque = scanner.nextDouble();

        // Define um limite para o cheque especial
        double limiteChequeEspecial = 500;

        // Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) {
            // TODO: Imprimir "Transação realizada com sucesso."
            System.out.println("Transação realizada com sucesso.");
        } else {
            double saldoChequeEspecial = saldo + limiteChequeEspecial;

            if (saque <= saldoChequeEspecial) {
                // TODO: Verificar se o saque ultrapassa o limite do cheque especial
                System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");

            } else {
                System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}