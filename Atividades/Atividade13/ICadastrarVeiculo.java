interface ICadastrarVeiculo {
    abstract void cadastrarVeiculo(String marca, String modelo, int anoFabricacao, double quilometragem);
    abstract void cadastrarVeiculo(String marca, String modelo);
    abstract void cadastrarVeiculo(String marca, String modelo, int anoFabricacao);
    abstract void cadastrarVeiculo(String marca, String modelo, double quilometragem);
    abstract void cadastrarVeiculo(String modelo, int anoFabricacao, double quilometragem);
}
