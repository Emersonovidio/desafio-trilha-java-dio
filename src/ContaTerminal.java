import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        MinhaConta minhaConta = new MinhaConta();

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua conta");
        int conta = scanner.nextInt();

        System.out.println("digite sua agencia");
        String agencia = scanner.next();

        System.out.println("Digite seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        // System.out.println(conta);
        // System.out.println(agencia);
        // System.out.println(nomeCliente);
        // System.out.println(saldo);444444

        System.out.println("Olá " + nomeCliente +
                "obrigado por criar uma conta em nosso banco," + "sua agência é" + agencia + "conta" + conta,
                "e seu saldo R$" + saldo, "já está disponivel para saque.");

    }

}
