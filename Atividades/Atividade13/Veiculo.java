abstract class Veiculo implements ICadastrarVeiculo {
    protected String marca;
    protected String modelo;
    protected int anoFabricacao;
    protected double quilometragem;

    // GET E SET MARCA
    public String getMarca(){return this.marca;}
    public void setMarca(String valor){this.marca = valor;}

    // GET E SET MODELO
    public String getModelo(){return this.modelo;}
    public void setModelo(String valor){this.modelo = valor;}

    // GET E SET ANO FABRICACAO
    public int getAnoFabricacao(){return this.anoFabricacao;}
    public void setAnoFabricacao(int valor){this.anoFabricacao = valor;}

    // GET E SET QUILOMETRAGEM
    public double getQuilometragem(){return this.quilometragem;}
    public void setQuilometragem(double valor){this.quilometragem = valor;}

    @Override
    public void cadastrarVeiculo(String marca, String modelo, int anoFabricacao, double quilometragem) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = quilometragem;

        System.out.println(marca+" "+modelo+" "+anoFabricacao+" "+quilometragem+" cadastrado com sucesso!");
    }

    @Override
    public void cadastrarVeiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;

        System.out.println(marca+" "+modelo+" cadastrado com sucesso!");
    }

    @Override
    public void cadastrarVeiculo(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;

        System.out.println(marca+" "+modelo+" "+anoFabricacao+" cadastrado com sucesso!");
    }

    @Override
    public void cadastrarVeiculo(String marca, String modelo, double quilometragem) {
        this.marca = marca;
        this.modelo = modelo;
        this.quilometragem = quilometragem;

        System.out.println(marca+" "+modelo+" "+quilometragem+" cadastrado com sucesso!");
    }

    @Override
    public void cadastrarVeiculo(String modelo, int anoFabricacao, double quilometragem) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = quilometragem;

        System.out.println(modelo+" "+anoFabricacao+" "+quilometragem+" cadastrado com sucesso!");
    }

    protected abstract void mostrarInformacoes() throws Exception;
}