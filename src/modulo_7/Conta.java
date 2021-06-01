package modulo_7;

public abstract class Conta {
     private int numero;
     private int agencia;
    protected double saldo;
    protected double sacar;
    protected double depositar;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }


    public abstract double getSaldo();



    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract double getSacar();


    public void setSacar(double sacar) {
        this.sacar = sacar;
    }

    public abstract double getDepositar();

    public abstract  void setDepositar(double depositar);


    public Conta(int numero, int agencia, double saldo, double sacar) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.sacar = sacar;
    }


}
