import um.Carro;

public class ClasseMain {

    public static void main(String... args) {
        //Primeiro carro
        Carro carro = new Carro("Gol",4,"Flex",2020);
        carro.setCor("Azul");
        carro.setArDoCarro("Sim");
        carro.setDirecaoHidraulica("Sim");
        carro.imprimeValores();

        //Segundo carro
        Carro carro2 = new Carro("Gol",2,"Gasolina",2010);
        carro2.setCor("Preto");
        carro2.setArDoCarro("Não");
        carro2.setDirecaoHidraulica("Sim");
        carro2.imprimeValores();





    }
}
