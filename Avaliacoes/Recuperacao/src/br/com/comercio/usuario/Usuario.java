package br.com.comercio.usuario;

/** Representa um usuário do sistema e implementa a interface {@link IUsuario}.
 * Contém informações básicas como nome e email.
 */
public class Usuario implements IUsuario {
    private String nome;
    private String email;

    /**
     * Construtor da classe Usuario.
     * @param nome String que definirá o nome do usuário.
     * @param email String que definirá o email do usuário.
     */
    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    /**
     * Retorna o nome do usuário.
     * @return uma String contendo o nome do usuário.
     */
    @Override
    public String getNome(){ return this.nome; }

    /**
     * Define o nome do usuário.
     * @param nome String que definirá o nome do usuário.
     */
    @Override
    public void setNome(String nome) { this.nome = nome; }

    /**
     * Retorna o email do usuário.
     * @return uma String contendo o email do usuário.
     */
    @Override
    public String getEmail(){ return this.email; }

    /**
     * Define o email do usuário.
     * @param email String que definirá o email do usuário.
     */
    @Override
    public void setEmail(String email) { this.email = email; }
}
