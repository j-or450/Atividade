package um;

public class Carro {

    private Integer quantidadePneus;
    private Integer anoDeFabricação;
    private Integer quantidadeDePortas;
    private String cor;
    private String tipoDeCombustivel;
    private String modeloDoCarro;
    private String arDoCarro;
    private String direcaoHidraulica;


    //Metudo construtor
    public  Carro(String modeloDoCarro,Integer quantidadeDePortas,String tipoDeCombustivel,Integer anoDeFabricação) {
        this.setModeloDoCarro(modeloDoCarro);
        this.setQuantidadeDePortas(quantidadeDePortas);
        this.setTipoDeCombustivel(tipoDeCombustivel);
        this.setAnoDeFabricação(anoDeFabricação);
        this.setQuantidadePneus(quantidadePneus);
    }

    public String getModeloDoCarro() {
        return modeloDoCarro;
    }

    public void setModeloDoCarro(String modeloDoCarro) {
        this.modeloDoCarro = modeloDoCarro;
    }

    public Integer getAnoDeFabricação() {
        return anoDeFabricação;
    }

    public void setAnoDeFabricação(Integer anoDeFabricação) {
        this.anoDeFabricação = anoDeFabricação;
    }

    public Integer getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(Integer quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public Integer getQuantidadePneus() {
        return quantidadePneus + 1;
    }

    public void setQuantidadePneus(Integer quantidadePneus) {
        this.quantidadePneus = 4;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getArDoCarro() {
        return arDoCarro;
    }

    public void setArDoCarro(String arDoCarro) {
        this.arDoCarro = arDoCarro;
    }

    public String getDirecaoHidraulica() {
        return direcaoHidraulica;
    }

    public void setDirecaoHidraulica(String direcaoHidraulica) {
        this.direcaoHidraulica = direcaoHidraulica;
    }


    public void imprimeValores () {
        System.out.println("----------Carro----------");
        System.out.println("Modelo do carro:......." + this.getModeloDoCarro());
        System.out.println("Cor do carro:.........." + this.getCor());
        System.out.println("Quantidade de portas:.." + this.getQuantidadeDePortas());
        System.out.println("Tipo de combustivel:..." + this.getTipoDeCombustivel());
        System.out.println("Ano de fabricação:....." + this.getAnoDeFabricação());
        System.out.println("Ar condicoanado:......." + this.getArDoCarro());
        System.out.println("Direcao hidraulica:...." + this.getDirecaoHidraulica());
        System.out.println("Quantidade Pneus:......" + this.getQuantidadePneus() + "\n");
    }
}

