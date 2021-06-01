package modulo_7;

import java.util.Scanner;

public class MetudosConta {
    int opcao, varOpcoes, varSair, voltaMenuAnterior, sairDoSaldo, sairDoSaque;
    Scanner input = new Scanner(System.in);

    //Construtor da conta corrente.
    ContaCorrente contCorrente = new ContaCorrente(11111, 41, 1000.00, 100.00, 100);

    //Construtor da conta poupaça.
    ContaPoupanca contPoupanca = new ContaPoupanca(33333, 41, 100, 20, 100,  0.05);

    //Construtor da conta salario.
    ContaSalario contSalario = new ContaSalario(55555, 41, 1500, 100, 2);

    public void primeiroMenu() {
        System.out.println("=============================");
        System.out.println("         BANKTORAMA");
        System.out.println("-----------------------------");
        System.out.println("----------------------");
        System.out.println("Escolha uma conta:");
        System.out.println("Conta corrente     [1]");
        System.out.println("Conta poupaça      [2]");
        System.out.println("Conta salario      [3]");
        System.out.println("Sair do apricativo [9]");
        System.out.println("-----------------");
        System.out.println("Digite uma opção:");
        System.out.print("-> ");
    }

    public void segundoMenu() {
        System.out.println("----------------------");
        System.out.println("Para saldo         [1]");
        System.out.println("Para saque         [2]");
        System.out.println("Para deposito      [3]");
        System.out.println("Menu principal     [4]");
        System.out.println("Sair do aplicativo [9]");
        System.out.println("-----------------");
        System.out.println("Digite uma opção:");
        System.out.print("-> ");
    }

    public void metudoSaldoCorrente() {
        System.out.println("======================");
        System.out.println("SALDO CONTA CORRENTE");
        System.out.println("Saldo: " + contCorrente.getSaldo());
        System.out.println("----------------------");
        System.out.println("Menu anterio       [1]");
        System.out.println("Menu Principal     [2]");
        System.out.println("Sair do apricativo [9]");
        System.out.println("-----------------");
        System.out.println("Digite uma opção:");
        System.out.print("-> ");
    }

    public void metudoSaldoPoupanca() {
        System.out.println("======================");
        System.out.println("SALDO CONTA POUPAÇA");
        System.out.println("Saldo:" + contPoupanca.getSaldo());
        System.out.println("----------------------");
        System.out.println("Menu anterio       [1]");
        System.out.println("Menu Principal     [2]");
        System.out.println("Sair do apricativo [9]");
        System.out.println("-----------------");
        System.out.println("Digite uma opção:");
        System.out.print("-> ");
    }

    public void metudoSaldoSalario() {
        System.out.println("======================");
        System.out.println("SALDO DA CONTA SALARIO");
        System.out.println("Saldo:" + contSalario.getSaldo());
        System.out.println("----------------------");
        System.out.println("Menu anterio       [1]");
        System.out.println("Menu Principal     [2]");
        System.out.println("Sair do apricativo [9]");
        System.out.println("-----------------");
        System.out.println("Digite uma opção:");
        System.out.print("-> ");
    }

    public void metudoSaqueCorrente(){
        System.out.println("======================");
        System.out.println("SAQUE CONTA CORRENTE");
        System.out.println("Valor do saque:");
        System.out.print("-> ");
        contCorrente.sacar = input.nextInt();
        System.out.println("----------------------");
        System.out.println("Saque de: " + contCorrente.sacar + "\nrealizado com sucesso!");
        System.out.println("----------------------");
        System.out.println("Menu anterior      [1]");
        System.out.println("Menu principal     [2]");
        System.out.println("Sair do apricativo [9]");
        System.out.println("-----------------");
        System.out.println("Digite uma opção:");
        System.out.print("-> ");
    }

    public void metudoSaquePoupanca(){
        System.out.println("======================");
        System.out.println("SAQUE CONTA POUPAÇA");
        System.out.println("Valor do saque:");
        System.out.print("-> ");
        contPoupanca.sacar = input.nextInt();
        System.out.println("----------------------");
        System.out.println("Saque de: " + contPoupanca.sacar + "\nrealizado com sucesso!");
        System.out.println("----------------------");
        System.out.println("Menu anterior      [1]");
        System.out.println("Menu principal     [2]");
        System.out.println("Sair do apricativo [9]");
        System.out.println("-----------------");
        System.out.println("Digite uma opção:");
        System.out.print("-> ");
    }

    public void metudoSaqueSalario(){
        System.out.println("======================");
        System.out.println("SAQUE CONTA SALARIO");
        System.out.println("Valor do saque:");
        contSalario.sacar = input.nextInt();
        System.out.println("----------------------");
        System.out.println("Saque de: " + contSalario.sacar + "\nrealizado com sucesso!");
        System.out.println("----------------------");
        System.out.println("Menu anterior      [1]");
        System.out.println("Menu principal     [2]");
        System.out.println("Sair do apricativo [9]");
        System.out.println("-----------------");
        System.out.println("Digite uma opção:");
        System.out.print("-> ");
    }

    public void metudoDepositarCorrente() {
        System.out.println("======================");
        System.out.println("DEPOSITO CONTA CORRENTE");
        System.out.println("Valor do deposito:");
        System.out.print("-> ");
        contCorrente.depositar = input.nextInt();
        System.out.println("----------------------");
        System.out.println("Deposito no valor: " + contCorrente.depositar + "\nrealizado com sucesso!");
        System.out.println("----------------------");
        System.out.println("Menu anterior      [1]");
        System.out.println("Menu principal     [2]");
        System.out.println("Sair do apricativo [9]");
        System.out.println("-----------------");
        System.out.println("Digite uma opção:");
        System.out.print("-> ");
    }

    public void metudoDepositarPoupanca() {
        System.out.println("======================");
        System.out.println("DEPOSITO CONTA POUPAÇA");
        System.out.println("Valor do deposito:");
        System.out.print("-> ");
        contPoupanca.depositar = input.nextInt();
        System.out.println("----------------------");
        System.out.println("Deposito no valor: " + contPoupanca.depositar + "\nrealizado com sucesso!");
        System.out.println("----------------------");
        System.out.println("Menu anterior      [1]");
        System.out.println("Menu principal     [2]");
        System.out.println("Sair do apricativo [9]");
        System.out.println("-----------------");
        System.out.println("Digite uma opção:");
        System.out.print("-> ");
    }

    public void metudoDepositarSalario() {
        System.out.println("======================");
        System.out.println("DEPOSITO CONTA SALARIO");
        System.out.println("Valor do deposito:");
        System.out.print("-> ");
        contSalario.depositar = input.nextInt();
        System.out.println("----------------------");
        System.out.println("Deposito de: " + contSalario.depositar + "\nrealizado com sucesso!");
        System.out.println("----------------------");
        System.out.println("Menu anterior      [1]");
        System.out.println("Menu principal     [2]");
        System.out.println("Sair do apricativo [9]");
        System.out.println("-----------------");
        System.out.println("Digite uma opção:");
        System.out.print("-> ");
    }

    //É usado para sair do apicativo ou ir para o menu principal.
    public void sairDoAplicativo() {
        varOpcoes = input.nextInt();
        if(varOpcoes == 9) { //Sair do aplicativo
            opcao = varOpcoes;
        }else if(varOpcoes == 4){ //Retorna ao menu anterior
            opcao = varOpcoes;
        }
    }

    public void chamaMenuPricipal() {
        varSair = input.nextInt();
        voltaMenuAnterior = varSair;
        if(varSair == 2){ //Vai para o menu pricipal.
            opcao = 4;
        }else if(varSair == 9){ //Sai do aplicativo.
            opcao = 9;
        }
    }

    public void msgNoFimPrograma() {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("    Você saiu do aplicativo mas por favor não demore a voltar!");
        System.out.println("Estaremos aguardando prontos para atende-lo da melhor forma possivel!");
        System.out.println("---------------------------------------------------------------------");
    }
}
