import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String nomeCliente;
        String agencia;
        int numero;
        BigDecimal saldo;

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        nomeCliente = sc.nextLine();
        sc.nextLine();
        System.out.println("Qual a sua agência?");
        agencia = sc.nextLine();
        sc.nextLine();
        System.out.println("Qual o número da conta?");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Qual o seu Saldo?");
        saldo = sc.nextBigDecimal();
        sc.close();

        msg(nomeCliente, agencia, numero, saldo);

    }

    public static void msg(String nomeCliente, String agencia, int numero, BigDecimal saldo) {
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta no nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível.");
    }
}
