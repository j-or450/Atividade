package modulo_7;

public class TestaConta {
    public static void main(String[] args) {

        ContaCorrente contCorrente = new ContaCorrente(22,1,"Banco AA",1000.00,100.00);
        System.out.println(contCorrente);

        System.out.println("O saldo da conta corrente é R$ "+ contCorrente.getSaldo());


        ContaPoupanca contPoupanca = new ContaPoupanca(23,1,"Banco AA",10,20,0.05);

        System.out.println("O saldo da conta corrente é R$ " + contPoupanca);

    }
}
