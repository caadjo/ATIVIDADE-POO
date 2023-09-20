/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.pessoa;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Caio Veloso &lt;caio.veloso at ifnmg.edu.br&gt;
 */
public class Compra {
    
    
    private Long notaFiscal;
    private Pessoa pessoa;
   
    private ArrayList<Item> items;
    
    public Compra(){
    }
    
    public Compra(Long notaFiscal, Pessoa pessoa) {
        this.notaFiscal = notaFiscal;
        this.pessoa = pessoa;
        this.items = new ArrayList<>();
    }

 

   public void adicionarItem(Item item1) {
       items.add(item1);
    }
    

    public Long getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(Long notaFiscal) {
        this.notaFiscal = notaFiscal;
    }
    
    

 public BigDecimal calcularTotal(){
        BigDecimal resultado = new BigDecimal(0);
        
        for (Item it : items ) {
         resultado = resultado.add(it.calcularTotal());
     }
       
        return resultado;
    }

  
       
 @Override
    public String toString() {
       

    NumberFormat nf = new DecimalFormat("0.00");

    String notaFiscalStr = String.format("%09d", notaFiscal); // Formata a nota fiscal com zeros à esquerda
    StringBuilder notaFiscalFormatada = new StringBuilder();

    for (int i = 0; i < notaFiscalStr.length(); i++) {
        notaFiscalFormatada.append(notaFiscalStr.charAt(i));
        if ((notaFiscalStr.length() - i) % 3 == 1 && i < notaFiscalStr.length() - 1) {
            notaFiscalFormatada.append(".");
        }
    }

    StringBuilder result = new StringBuilder("Nota fiscal: ");
    result.append(notaFiscalFormatada); // Formata a nota fiscal com pontos
    result.append("; Cliente: ");
    result.append(pessoa.getNome());
    result.append("; R$ ");
    result.append(nf.format(calcularTotal())); // Formata o total com duas casas decimais
    result.append("; [");

    Iterator<Item> itemIterator = items.iterator();
    while (itemIterator.hasNext()) {
        Item item = itemIterator.next();
        result.append("Item ");
        result.append(items.indexOf(item) + 1);
        result.append(": ");
        result.append(item.toString());

        if (itemIterator.hasNext()) {
            result.append("; ");
        }
    }

    result.append("]");

    return result.toString();
}
    
    
    
    
    
}

 
 
