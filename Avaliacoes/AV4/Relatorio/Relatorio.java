package Relatorio;

import java.util.ArrayList;

public class Relatorio<T> {

    private final ArrayList<T> itens;
    private final Formatador<T> formatador;

    public Relatorio(ArrayList<T> itens, Formatador<T> formatador) {
        this.itens = new ArrayList<>(itens);
        this.formatador = formatador;
    }

    public String gerar() {
        String r = "";

        // Cabeçalho
        r += formatador.cabecalho();
        r += "---------------------------------------------------------\n";

        for (T item : itens) {
            r += formatador.formatar(item) + "\n";
        }
        return r;
    }
}