package auth;

/**
 *
 * @author servu
 */
public class Usuario {
    
    private String login;
    private String senha;
    private NivelAcesso nivel_acesso;

    public Usuario(String login, String senha, NivelAcesso nivel_acesso) {
        this.login = login;
        this.senha = senha;
        this.nivel_acesso = nivel_acesso;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public NivelAcesso getNivel_acesso() {
        return nivel_acesso;
    }

    public void setNivel_acesso(NivelAcesso nivel_acesso) {
        this.nivel_acesso = nivel_acesso;
    }
      
}
