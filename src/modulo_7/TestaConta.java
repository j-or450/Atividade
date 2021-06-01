package modulo_7;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class TestaConta {
    public static void main(String[] args) {
        int retornaMenuAnterior;

        Scanner input = new Scanner(System.in);

        MetudosConta menu = new MetudosConta();

        //Mostra o primeiro menu.
        menu.primeiroMenu();

        //Capitura a opção digitada.
        menu.opcao = input.nextInt();
        for (;;) {

            //Inico do switch 1.
            switch (menu.opcao) {
                case 1: //Entra na conta corrente.
                    System.out.println("=============================");
                    System.out.println("       CONTA CORRENTE");
                    System.out.println(menu.contCorrente);
                    System.out.println("-----------------------------");

                    menu.segundoMenu(); //Mostra o menu sado, sacar e etc.

                    //Captura a opção escolhida.
                    menu.sairDoAplicativo();

                    //Inicio do switch 2.
                    switch (menu.varOpcoes) {
                        case 1: //Entra na fução saldo da conta corrente
                            menu.metudoSaldoCorrente(); //Mostra o saldo da conta corrente.
                            menu.chamaMenuPricipal();
                            if(menu.voltaMenuAnterior == 1) {
                                menu.opcao = 1;
                            }
                            break;

                        case 2: //Entre na fução saque da conta corrente
                            menu.metudoSaqueCorrente();
                            menu.chamaMenuPricipal();
                            break;

                        case 3: //Entra na funcao de deposito da conta corrente.
                            menu.metudoDepositarCorrente(); //Capitura o valor depositado na conta conta corrente.
                            menu.chamaMenuPricipal();
                            break;
                    }
                    // Fim do switch 2.

                    break; //Do switch 1.

                //Case do switch 1.
                case 2://Entra na conta poupaça.
                    System.out.println("=============================");
                    System.out.println("         CONTA POUPAÇA");
                    System.out.println(menu.contPoupanca);
                    System.out.println("-----------------------------");

                    menu.segundoMenu(); //Mostra o menu sado, sacar e etc.

                    //Captura a opção escolhida.
                    menu.sairDoAplicativo();

                    //Inicio do switch 3.
                    switch (menu.varOpcoes) {
                        case 1: //Entra na fução saldo da conta poupaça
                            menu.metudoSaldoPoupanca(); //Mostra o saldo da conta poupaça.
                            menu.chamaMenuPricipal();
                            if(menu.voltaMenuAnterior == 1) {
                                menu.opcao = 2;
                            }
                            break;

                        case 2: //Entre na fução saque da conta poupaça
                            menu.metudoSaquePoupanca();
                            menu.chamaMenuPricipal();
                            break;

                        case 3: //Entra na funcao de deposito da conta poupaça.
                            menu.metudoDepositarPoupanca(); //Capitura o valor depositado na conta poupaça.
                            menu.chamaMenuPricipal();
                            break;
                    }
                    //Fim do switch 3.

                    break; //Do switch 1

                //Case do switch 1.
                case 3: //Entra na conta salario
                    System.out.println("=============================");
                    System.out.println("         CONTA SALARIO");
                    System.out.println(menu.contSalario);
                    System.out.println("-----------------------------");

                    menu.segundoMenu(); //Mostra o menu sado, sacar e etc.

                    //Captura a opção escolhida.
                    menu.sairDoAplicativo();

                    //Inico do switch 4.
                    switch (menu.varOpcoes) {
                        case 1: //Entra na fução saldo da conta salario

                            menu.metudoSaldoSalario(); //Mostra o saldo da conta salario.
                            menu.chamaMenuPricipal();
                            if(menu.voltaMenuAnterior == 1) {
                                menu.opcao = 3;
                            }
                            break;

                        case 2: //Entre na fução saque da conta salario
                            menu.metudoSaqueSalario();
                            menu.chamaMenuPricipal();
                            break;

                        case 3: //Entra na funcao de deposito da conta salario.
                            menu.metudoDepositarSalario(); //Capitura o valor depositado na conta poupaça.
                            menu.chamaMenuPricipal();
                            break;
                    }
                    //Fim do switch 4.

                    break; //Do switch 1.

                //Case do switch 1.
                case 4: //Cai no menu pricipal que é o primeiro menu.
                    menu.primeiroMenu(); //Menu principal.
                    menu.opcao = input.nextInt();
                    break; //Do suitch 1.

            }// Fim do switch 1.

            if(menu.opcao == 9)break; //Finaliza o loop do for.
        }
        menu.msgNoFimPrograma(); //Mensagen para o encerramento do programa.
    }
}
