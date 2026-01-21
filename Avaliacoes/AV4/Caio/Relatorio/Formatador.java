package Relatorio;

public interface Formatador<T> {
/**
 * Definir cabeçalho padrão do relatório
 * @return cabeçalho
 */
public String cabecalho();

/**
 * Converte T em String
 * @param obj objetivo do tipo T
 * @return T convertido em String
 */
public String formatar(T obj);
    
}
