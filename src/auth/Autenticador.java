package auth;

import java.util.ArrayList;

public class Autenticador {
    
    private ArrayList<Usuario> usuarios;

    public Autenticador(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    public Usuario logar(String login, String senha) {
        
        for(Usuario user: usuarios){
            if(user.getLogin() == login && user.getSenha() == senha){
                return user;
            }
        }
        return null;
    }    
}