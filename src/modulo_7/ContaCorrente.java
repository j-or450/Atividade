package modulo_7;

public class ContaCorrente extends Conta{
    private double chequeEspecial;

    public ContaCorrente(int numero, int agencia, double saldo, double sacar, double chequeEspecial) {
        super(numero, agencia, saldo, sacar);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public String toString() {
        return "Numero: " + getNumero() +
                "     Agencia: " + getAgencia();
    }
    public double getSaldo(){
        return this.chequeEspecial + this.saldo;
    }

    public double getSacar() {
        return this.saldo-this.sacar;
    }

    public double getDepositar() {
        return depositar;
    }
    public void setDepositar(double depositar){
        this.depositar += depositar;
    }
}
