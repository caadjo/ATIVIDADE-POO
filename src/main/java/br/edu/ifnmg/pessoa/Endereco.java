/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.pessoa;

/**
 *
 * @author Caio Veloso &lt;caio.veloso at ifnmg.edu.br&gt;
 */
public class Endereco {
    
    private TipoLogradouro tipoLogradouro;
    private String logradouro; //255
    private Integer numero; //50
    private String bairro;
    private Integer cep;
    private Pessoa pessoa;

  

    public Endereco(TipoLogradouro tipoLogradouro, String logradouro, String bairro, Integer cep) {
        this.tipoLogradouro = tipoLogradouro;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cep = cep;
    }
    
    public Endereco() {
    }

    // Construtor e outros métodos

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
    
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
     public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) 
        throws Exception {
        if (logradouro.length() > 255) {
            throw new Exception("O logradouro nao pode conter mais que 255 caracteres");
        }
        if (logradouro == null) {
            throw new Exception("Nao pode ser NULL");
        }
        this.logradouro = logradouro;
    }
    

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero){
             this.numero = numero;
    }
    
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) 
        throws Exception{
        if(bairro.length()> 50){
            throw new Exception("O bairro nao pode conter mais que 50 caracteres");
        }
        else{
            
        this.bairro = bairro;
    }
    }
    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }
//</editor-fold>


    public String getTipoLogradouroAsString() {
        return switch (tipoLogradouro) {
            case RUA -> "Rua";
            case AVENIDA -> "Avenida";
            case PRACA -> "Praca";
            default -> "OUTRO";
        }; // Adicione mais casos conforme necessário
    }

   @Override
public String toString() {
    String tipoLogradouroStr = tipoLogradouro == null ? "" : tipoLogradouro.name();
    String enderecoStr = tipoLogradouroStr + " " + logradouro + ", " + numero + ",";
    String bairroStr = bairro;
    String cepStr = String.format("%08d", cep);

    return enderecoStr  + bairroStr + ", " + cepStr;
}

}





   
    
    
    


  