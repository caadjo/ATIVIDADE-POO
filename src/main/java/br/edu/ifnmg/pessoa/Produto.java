/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.pessoa;

import java.math.BigDecimal;

/**
 *
 * @author Caio Veloso &lt;caio.veloso at ifnmg.edu.br&gt;
 */
public class Produto {
     private String nome; // max length 150
     private BigDecimal preco;
 
     
    public String getNome() {
        return nome;
    }

    public void setNome(String nome)throws Exception {
        if(nome.length() > 150){
            throw new Exception("O nome do produto nao pode conter mais que 150 caracteres");
        }
        
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return nome + "  R$ " + preco;
    }
     
     
    
    
    
}
