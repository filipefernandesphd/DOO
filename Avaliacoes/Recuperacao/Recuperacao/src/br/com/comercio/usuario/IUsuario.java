package br.com.comercio.usuario;

/** Interface que define os métodos para manipular usuários.
 * Seu principal objetivo é fornecer uma estrutura para obter e definir
 */
public interface IUsuario {
    /**
     * Retorna o nome do usuário.
     * @return uma String contendo o nome do usuário.
     */
    String getNome();

    /**
     * Define o nome do usuário.
     * @param nome String que definirá o nome do usuário.
     */
    void setNome(String nome);

    /**
     * Retorna o email do usuário.
     * @return uma String contendo o email do usuário.
     */
    String getEmail();

    /**
     * Define o email do usuário.
     * @param email String que definirá o email do usuário.
     */
    void setEmail(String email);
}
