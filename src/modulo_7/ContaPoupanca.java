package modulo_7;

public class ContaPoupanca extends Conta {
    private int diaAniversario;
    private double taxaDeJuros;

    public ContaPoupanca(int numero, int agencia, double saldo, double sacar, int diaAniversario, double taxaDeJuros) {
        super(numero, agencia, saldo, sacar);
        this.diaAniversario = diaAniversario;
        this.taxaDeJuros = taxaDeJuros;
    }

    @Override
    public String toString() {
        return "Numero: " + getNumero() +
                "             Agencia: " + getAgencia();
    }

    public double getSaldo() {
        return this.saldo + this.taxaDeJuros * this.saldo;
    }

    public double getSacar() {
        return this.saldo - this.sacar;
    }

    public double getDepositar() {
        return depositar;
    }
    public void setDepositar(double depositar){
        this.depositar += depositar;
    }
}


