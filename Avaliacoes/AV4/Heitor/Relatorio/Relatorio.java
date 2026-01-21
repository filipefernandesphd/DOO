public class Relatorio{

String r = "";

// Cabeçalho
r += formatador.cabecalho();
r += "---------------------------------------------------------\n";

for (T item : itens) {
    r += formatador.formatar(item) + "\n";
}
return r;
}