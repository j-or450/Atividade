package modulo_6;

public class AulaTresVetores {

    public static void main(String[] args) {

        int[] valores = new int[4];
        valores[0] = 10;
        valores[1] = 15;
        valores[2] = 20;
        valores[3] = 25;

        //for( int i = 0; i < valores.length; i++ ){
            //System.out.println(i);
        //}

        for( int x : valores){
            System.out.println(x);
        }
    }
}
