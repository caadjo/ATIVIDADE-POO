/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.pessoa;

/**
 *
 * @author Caio Veloso &lt;caio.veloso at ifnmg.edu.br&gt;
 */
public class Telefone {
    private Byte ddd;
    private Integer numero;
    
    private Pessoa pessoa;
    
    public Telefone(){
    }

    public Telefone(Byte ddd, Integer numero, Pessoa pessoa) {
        this.ddd = ddd;
        this.numero = numero;
        this.pessoa = pessoa;
    }
    
    

    public Byte getDdd() {
        return ddd;
    }

    public void setDdd(Byte ddd) {
        this.ddd = ddd;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

   @Override
public String toString() {
    String numeroFormatado;
    
    if (numero.toString().length() == 9) {
        // Telefone celular (9 dígitos)
        String parte1 = numero.toString().substring(0, 3);
        String parte2 = numero.toString().substring(3, 6);
        String parte3 = numero.toString().substring(6, 9);
        numeroFormatado = "(" + ddd + ") " + parte1 + "-" + parte2 + "-" + parte3;
    } else if (numero.toString().length() == 8) {
        // Telefone fixo (8 dígitos)
        String parte1 = numero.toString().substring(0, 4);
        String parte2 = numero.toString().substring(4, 8);
        numeroFormatado = "(" + ddd + ") " + parte1 + "-" + parte2;
    } else {
        // Outro formato
        numeroFormatado = "(" + ddd + ") " + numero.toString();
    }
    
    return numeroFormatado;
}




  
    
    
    
    
}
