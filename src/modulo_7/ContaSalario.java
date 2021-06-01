package modulo_7;

public class ContaSalario extends Conta {
    private int limiteDeSaque;

    public ContaSalario(int numero, int agencia, double saldo, double sacar, int limiteDeSaque) {
        super(numero, agencia, saldo, sacar);
        this.limiteDeSaque = limiteDeSaque;
    }

    @Override
    public String toString() {
        return "Numero: " + getNumero() +
                "     Agencia: " + getAgencia();
    }

    public double getSaldo(){
        return this.saldo;
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
