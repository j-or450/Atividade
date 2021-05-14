package modulo_6;
import java.util.Scanner;

public class Diario {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String data[] = {"01/05/2021","02/05/2021","03/05/2021","04/05/2021"};
        String aluno[] = {"Ana         ","Fernando    ","Maria       ","Paulo       "}; //O espaço em branco dentro dos elementos é para a saida do algoritmo ficar mais organizado.

        String[][] presencaLinsta = new String[data.length][aluno.length];
        String[][] listaDePresenca = new String[data.length][aluno.length];

        System.out.println("------------------------------------------------");
        System.out.println("******* Escola de Pragramação Mentorama ********");
        System.out.println("------------------------------------------------");
        System.out.println("Sala: 5      Turma: B      Horario: Noturno");
        System.out.println("Diario de presença");
        System.out.println("Digite [P] para presente ou [F] para falta.");
        System.out.println("------------------------------------------------");

        //Exibe a data, nome do aluno e armazena o valor digitado pelo usuario na matriz listaDePresença.
        for(int i = 0; i < data.length; i++) {
            System.out.println("Lista de presença do dia: " + data[i]);
            for( int x = 0; x < aluno.length; x++){
                System.out.println(aluno[x].trim() + " esta presente:"); //O metudo "trin()" tira o espaço colocado  nos elementos do vetor aluno.
                System.out.print("-> ");
                presencaLinsta[i][x] = input.nextLine().toUpperCase(); //Digita "P" ou "F"
                //Se uma letra diferente de 'P' ou de 'F' for digitado ela nao passara na estrutura de controle evitando falhas
                if(presencaLinsta[i][x].equals("P") || presencaLinsta[i][x].equals("F")){
                    //Se a letra digitado for "P" ele sera trocado por pela palavra "Presente".
                    if (presencaLinsta[i][x].equals("P")) {
                        listaDePresenca[i][x] = "Presente";
                    }
                    else {
                        listaDePresenca[i][x] = "Falta   ";
                    }
                }
                else{
                    System.out.println("Por favor digite [P] para presente ou [F] para falta.");
                    x--; //Faz o laço for volta uma posição anterior ao erro de digitação para ser corrigido.
                }
            }
            System.out.println("------------------------------------------------");
        }

        System.out.println();
        System.out.println("============================================================");
        System.out.println("***********    Escola de Pragramação Mentorama   ***********");
        System.out.println("Sala: 5               Turma: B              Horario: Noturno");
        System.out.println("============================================================");
        System.out.println("                    Diario de presença                      ");
        System.out.println("------------------------------------------------------------");

        //Exibe a data que esta no vetor data.
        System.out.print("Data       ");
        for(int dt = 0; dt < data.length; dt++){
            System.out.print(data[dt] + "   ");
        }
        System.out.println();

        //Exibe os alunos que estão no vetor aluno e a presença ou falta deles.
        for(int i = 0; i < aluno.length; i++){
            System.out.print(aluno[i]);
            for(int x = 0; x < aluno.length; x++) {
                System.out.print(listaDePresenca[x][i] + "     ");
            }
            System.out.println();
        }
        System.out.println("============================================================");
    }
}


