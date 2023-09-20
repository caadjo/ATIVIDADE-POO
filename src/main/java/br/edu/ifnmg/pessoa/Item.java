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
public class Item {
    
    private Integer quantidade;
    private Produto produto;

    
    public Item(){
        
    }
    
    
    public Item(Integer quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }
    
    
    
    
    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
    
    
     public BigDecimal calcularTotal(){
        BigDecimal resultado = new BigDecimal(quantidade);
        return resultado.multiply(produto.getPreco());
    }
    

     
     
    @Override
    public String toString() {
        return produto.getNome() + "  " + quantidade + " X " + " R$ " + produto.getPreco() + " = " + " R$ " + calcularTotal();
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
