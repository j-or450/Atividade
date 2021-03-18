package um;

public class Variavel {
    private Character tipoCharacter = 'M';
    private Double tipoDoble = 6.5;
    private Integer tipoInteger = 657894012;


    public Character getTipoCharacter() {
        return tipoCharacter;
    }

    public Double getTipoDoble() {
        return tipoDoble;
    }

    public Integer getTipoInteger() {
        return tipoInteger;
    }

    //Esse metudo exibe os valores
    public void imprimirValores() {
        System.out.println("........Variaveis Wrapper.......");
        System.out.println("Variavel wrapper Character:....." + this.getTipoCharacter());
        System.out.println("Variavel wrapper Doble:........." + this.getTipoDoble());
        System.out.println("Variavel wrapper Integer:......." + this.getTipoInteger());
    }
}
