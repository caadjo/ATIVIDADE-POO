/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifnmg.pessoa;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

/**
 *
 * @author Caio Veloso  &lt;caio.veloso at ifnmg.edu.br&gt;
 */
public class Pessoa {

    private String nome;                     // max length = 45
    private LocalDate nascimento;
    private Byte idade;
    private Credencial cred;
    private ArrayList<Endereco> enderecos;
    private ArrayList<Telefone> telefones;
    private ArrayList<Compra> compras;


    
    
    public Pessoa() {
        enderecos = new ArrayList<>();
        telefones = new ArrayList<>();
        compras = new ArrayList<>();
    }

    public Pessoa(String nome, LocalDate nascimento, Byte idade, Credencial cred) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.idade = idade;
        this.cred = cred;
    }

  

  


  


   
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
     public String getNome() {
        return nome;
    }

    public Credencial getCred() {
        return cred;
    }

    public void setCred(Credencial cred) {
        this.cred = cred;
    }

    public void setNome(String nome)
            throws Exception {
        if (nome.length() > 45) {
            throw new Exception("O nome nao pode conter mais que 45 caracteres");
        }
        if (nome == null) {
            throw new Exception("Nao pode ser NULL");
        }
        this.nome = nome;
    }

  
    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
        
        idade  = (byte)nascimento.until(LocalDate.now() , ChronoUnit.YEARS);
              
    }
    public Byte getIdade() {
        return idade;
    }
    
     public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

   public void setEnderecos(ArrayList<Endereco> enderecos) {
        this.enderecos = enderecos;
   }
        
public void adicionarEndereco(Endereco endereco) {
        enderecos.add(endereco);
        endereco.setPessoa(this);
    }
 
 public void adicionarTelefone(Telefone telefone){
     telefones.add(telefone);
     telefone.setPessoa(this);
 }

    public void setTelefones(ArrayList<Telefone> telefones) {
        this.telefones = telefones;
    }
    
    public void adicionarCompras(Compra compra){
        compras.add(compra);
        
    }
    
   

    
//</editor-fold>

   


  

  
    
   
    
    
    
    
    
    
    
    
    
    
    
    
//<editor-fold defaultstate="collapsed" desc="to String">
    

//</editor-fold>

@Override
public String toString() {
    StringBuilder result = new StringBuilder();

    // Nome
    result.append(nome).append(", ");

    // Data de Nascimento
    result.append(nascimento.getDayOfMonth()).append("/")
          .append(nascimento.getMonthValue()).append("/")
          .append(nascimento.getYear()).append(", ");

    // Idade
    result.append(idade).append(" anos, ");

    // Email
    result.append(cred.getEmail()).append(", ");

    // Senha
    result.append("Senha: '").append(cred.getSenha()).append("', ");

    // Administrador
    if (cred.isAdministrador()) {
        result.append("Administrador, ");
    } else {
        result.append("Usuario Geral, ");
    }

    // Endereços
    result.append("Endereços: [");
    for (int i = 0; i < enderecos.size(); i++) {
        Endereco endereco = enderecos.get(i);
        result.append(endereco.toString());
        if (i < enderecos.size() - 1) {
            result.append("; ");
        }
    }
    result.append("], ");

    // Telefones
    result.append("Telefones: [");
    for (int i = 0; i < telefones.size(); i++) {
        Telefone telefone = telefones.get(i);
        result.append("(").append(telefone.getDdd()).append(") ").append(telefone.getNumero());
        if (i < telefones.size() - 1) {
            result.append("; ");
        }
    }
    result.append("], ");

    // Gasto total
    BigDecimal gastoTotal = BigDecimal.ZERO;
    for (Compra compra : compras) {
        gastoTotal = gastoTotal.add(compra.calcularTotal());
    }
    result.append("Gasto total: R$ ").append(gastoTotal).append(", ");

    // Compras
    result.append("Compras: [");
    for (int i = 0; i < compras.size(); i++) {
        Compra compra = compras.get(i);
        String notaFiscalStr = String.format("%09d", compra.getNotaFiscal()); // Formata a nota fiscal com zeros à esquerda
        result.append(notaFiscalStr).append(", R$ ").append(compra.calcularTotal());
        if (i < compras.size() - 1) {
            result.append("; ");
        }
    }
    result.append("]");

    return result.toString();
}




    }


    

  
    
    
    
    
    
    
    
    


    
    

