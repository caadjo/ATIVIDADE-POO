/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.pessoa;

/**
 *
 * @author Caio Veloso &lt;caio.veloso at ifnmg.edu.br&gt;
 */
public class Credencial {

    private String email;
    private String senha; // max length 12
    private boolean administrador = false;

    private Pessoa pessoa;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Credencial() {
    }

    public Credencial(String email, String senha, Pessoa pessoa) {
        this.email = email;
        this.senha = senha;
        this.pessoa = pessoa;
    }


//</editor-fold>
    
   
//<editor-fold defaultstate="collapsed" desc="Getters/Setters">
     public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) 
        throws Exception{
        if (senha.length() > 12){
             throw new Exception("A senha nao pode conter mais que 12 caracteres");
        }
       this.senha = senha;
    }
        
    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }
//</editor-fold>
   
//<editor-fold defaultstate="collapsed" desc="toString">
    
//</editor-fold>

   @Override
public String toString() {
    String administradorStr = administrador ? "Administrador" : "Usuário geral";
    return email + ", '" + senha + "', " + administradorStr;
}


    
    
    
}
