/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.pessoa;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Caio Veloso &lt;caio.veloso at ifnmg.edu.br&gt;
 */
public class Main {
    

    public static void main(String[] args) {
        
        //<editor-fold defaultstate="collapsed" desc="Set Produtos">
         Produto prod1 = new Produto();
        Produto prod2 = new Produto();
        Produto prod3 = new Produto();
        Produto prod4 = new Produto();
        Produto prod5 = new Produto();

        try {
            prod1.setNome("Abacaxi");
        } catch (Exception ex) {
            System.out.println(">> " + ex.getMessage());
        }

        prod1.setPreco(new BigDecimal("1.99"));

        try {
            prod2.setNome("Banana");
        } catch (Exception ex) {
            System.out.println(">> " + ex.getMessage());
        }
        prod2.setPreco(new BigDecimal("2.99"));
        try {
            prod3.setNome("Caqui");
        } catch (Exception ex) {
            System.out.println(">> " + ex.getMessage());
        }
        prod3.setPreco(new BigDecimal("3.99"));
        try {
            prod4.setNome("Damasco");
        } catch (Exception ex) {
            System.out.println(">> " + ex.getMessage());
        }
        prod4.setPreco(new BigDecimal("4.99"));
        try {
            prod5.setNome("Espinafre");
        } catch (Exception ex) {
            System.out.println(">> " + ex.getMessage());
        }
        prod5.setPreco(new BigDecimal("5.99"));
        

        
        
//<editor-fold defaultstate="collapsed" desc="Pessoa 1">
        
        Pessoa p1 = new Pessoa();
        Credencial c1 = new Credencial();
        
        
        p1.setNascimento(LocalDate.of(2000, 01, 20));
       
        try {
            p1.setNome("Ana Zaira");
        } catch (Exception ex) {
            System.out.println(">> " + ex.getMessage());
        }

        //System.out.println(">> : " + p1.getNome() + "\n" + p1.getIdade() +"\n" +  p1.getNascimento());
        c1.setAdministrador(true);
        c1.setEmail("ana.zaira@gmail.com");

        try {
            c1.setSenha("asdf123");
        } catch (Exception ex) {
            System.out.println(">> " + ex.getMessage());
        }

        c1.setPessoa(p1);
        p1.setCred(c1);

        Endereco e1 = new Endereco();

        try {
            e1.setBairro("Santa Ana 1");
        } catch (Exception ex) {
            System.out.println(">> " + ex.getMessage());
        }
        try {
            e1.setLogradouro("" + "A1");
        } catch (Exception ex) {
            System.out.println(">> " + ex.getMessage());
        }
        e1.setTipoLogradouro(TipoLogradouro.RUA);

        e1.setCep(39401111);

        e1.setNumero(1011);

        p1.adicionarEndereco(e1);

        Endereco e2 = new Endereco();

        try {
            e2.setBairro("Santa Ana 2");
        } catch (Exception ex) {
            System.out.println(">> " + ex.getMessage());
        }
        try {
            e2.setLogradouro(" A2");
        } catch (Exception ex) {
            System.out.println(">> " + ex.getMessage());
        }
        e2.setTipoLogradouro(TipoLogradouro.RUA);

        e2.setCep(39401112);

        e2.setNumero(1012);

        p1.adicionarEndereco(e2);

        Telefone t1 = new Telefone();

        t1.setDdd((byte) 38);

        t1.setNumero(12341234);

        t1.setPessoa(p1);

        p1.adicionarTelefone(t1);
        
        
         // Compras
         
         
        String numero = "000.100.101";

        String TiraPonto = numero.replace(".", "");

        long num1 = Long.parseLong(TiraPonto);

        Compra compra1 = new Compra(num1, p1);

        Item item1 = new Item(11, prod1);

        compra1.adicionarItem(item1);

        p1.adicionarCompras(compra1);
        
       
        
        try {
            p1.setNome("Ana Zaira");
        } catch (Exception ex) {
            System.out.println(">> " + ex.getMessage());
        }

        //System.out.println(">> : " + p1.getNome() + "\n" + p1.getIdade() +"\n" +  p1.getNascimento());
        c1.setAdministrador(true);
        c1.setEmail("ana.zaira@gmail.com");

        try {
            c1.setSenha("asdf123");
        } catch (Exception ex) {
            System.out.println(">> " + ex.getMessage());
            
        c1.setPessoa(p1);
        p1.setCred(c1);
        
}
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Pessoa 2">
Pessoa p2 = new Pessoa();
          Credencial c2 = new Credencial();
          Endereco e3 = new Endereco();
          Telefone t3  = new Telefone();
          Telefone t4  = new Telefone();
          
          p2.setNascimento(LocalDate.of(1999,01,28));
          
        try {
            p2.setNome("Beatriz Yana");
        } catch (Exception ex) {
            System.out.println(">> " + ex.getMessage());
        }
        
        c2.setAdministrador(false);
        c2.setEmail("beatriz.yana@gmail.com");
        try {
            c2.setSenha("123asdf");
        } catch (Exception ex) {
            System.out.println(">> " + ex.getMessage());
        }
        
        c2.setPessoa(p2);
        
        try {
            e3.setBairro("Santa Beatriz");
        } catch (Exception ex) {
            System.out.println(">> " + ex.getMessage());
        }
        
        e3.setCep(39402222);
        
        e3.setTipoLogradouro(TipoLogradouro.RUA);
        
        e3.setNumero(2022);
        
        
        e3.setPessoa(p2);
        
        try {
            e3.setLogradouro(" B");
        } catch (Exception ex) {
            System.out.println(">> " + ex.getMessage());
        }
        
        t3.setDdd((byte)38);
        t3.setNumero(23452345);
        
      
        t4.setDdd((byte)38);
        t4.setNumero(923452345);
        
        t3.setPessoa(p2);
        t4.setPessoa(p2);
        
        
        
        p2.setCred(c2);
        p2.adicionarEndereco(e3);
        p2.adicionarTelefone(t3);
        p2.adicionarTelefone(t4);
      
      
          
         String numero2 = "000.200.202";

        String TiraPonto2 = numero2.replace(".", "");

        long num2 = Long.parseLong(TiraPonto2);

        Compra compra2 = new Compra(num2, p2);

        Item item2 = new Item(11, prod2);
        Item item3 = new Item(12, prod3);
        Item item4 = new Item(13, prod4);
        Item item5 = new Item(14, prod5);
        
        
        compra2.adicionarItem(item2);
        compra2.adicionarItem(item3);
        compra2.adicionarItem(item4);
        compra2.adicionarItem(item5);
        
        
        p2.adicionarCompras(compra2);
        
        String numero3 = "000.200.212";

        String TiraPonto3 = numero3.replace(".", "");

        long num3 = Long.parseLong(TiraPonto3);

        Compra compra3 = new Compra(num3, p2);

        Item item10 = new Item(21, prod1);
        Item item11 = new Item(22, prod3);
        Item item12 = new Item(23, prod5);
        
        compra3.adicionarItem(item10);
        compra3.adicionarItem(item11);
        compra3.adicionarItem(item12);
        
        p2.adicionarCompras(compra3);



        
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Pessoa 3">
Pessoa p3 = new Pessoa();
          Credencial c3 = new Credencial();
          Endereco e4 = new Endereco();
          Endereco e5 = new Endereco();
          Endereco e6 = new Endereco();
          Telefone t5  = new Telefone();
          Telefone t6  = new Telefone();
          
          p3.setNascimento(LocalDate.of(1998,01,27));
          
        try {
            p3.setNome("Cecília Xerxes");
        } catch (Exception ex) {
            System.out.println(">> " + ex.getMessage());
        }
        
        c3.setAdministrador(false);
        c3.setEmail("cecilia.xerxes@gmail.com");
        try {
            c3.setSenha("123123");
        } catch (Exception ex) {
            System.out.println(">> " + ex.getMessage());
        }
        
        c3.setPessoa(p3);
        
        try {
            e4.setBairro("Santa Cecilia 1");
        } catch (Exception ex) {
            System.out.println(">> " + ex.getMessage());
        }
        
        try {
            e4.setLogradouro(" C1");
        } catch (Exception ex) {
             System.out.println(">> " + ex.getMessage());
        }
        
        e4.setCep(39403331);
        
        e4.setTipoLogradouro(TipoLogradouro.RUA);
        
        e4.setNumero(3031);
        
        
        e4.setPessoa(p3);
        
        try {
            e5.setLogradouro(" C2");
        } catch (Exception ex) {
            System.out.println(">> " + ex.getMessage());
        }
        
         try {
            e5.setBairro("Santa Cecilia 2");
        } catch (Exception ex) {
            System.out.println(">> " + ex.getMessage());
        }
        
        e5.setCep(39403332);
        
        e5.setTipoLogradouro(TipoLogradouro.RUA);
        
        e5.setNumero(3032);
        
        
        e5.setPessoa(p3);
        
                 try {
            e6.setBairro("Santa Cecilia 3");
        } catch (Exception ex) {
            System.out.println(">> " + ex.getMessage());
        }
        
        e6.setCep(39403333);
        
        e6.setTipoLogradouro(TipoLogradouro.RUA);
        
        e6.setNumero(3033);
        
        e6.setPessoa(p3);
        
        try {
            e6.setLogradouro(" C3");
        } catch (Exception ex) {
            System.out.println(">> " + ex.getMessage());
        }
        
        p3.adicionarEndereco(e4);
        p3.adicionarEndereco(e5);
        p3.adicionarEndereco(e6);
        
        t5.setDdd((byte)38);
        t5.setNumero(934563456);
        
      
        t6.setDdd((byte)38);
        t6.setNumero(834563456);
        
        t5.setPessoa(p3);
        t6.setPessoa(p3);
        
        
        
        p3.setCred(c3);
       
        p3.adicionarTelefone(t6);
        p3.adicionarTelefone(t5);
      
        
        
        
          
      
          
         String numero4 = "000.300.303";

        String TiraPonto4 = numero4.replace(".", "");

        long num4 = Long.parseLong(TiraPonto4);

        Compra compra4 = new Compra(num4, p3);

        Item item7 = new Item(31, prod1);
        Item item8 = new Item(32, prod3);
        Item item9 = new Item(33, prod5);
        
        
        
        compra4.adicionarItem(item7);
        compra4.adicionarItem(item8);
        compra4.adicionarItem(item9);
        
        
        p3.adicionarCompras(compra4);
//</editor-fold>
          System.out.println(">  " + prod1.toString());
          System.out.println(">  " + prod2.toString());
          System.out.println(">  " + prod3.toString());
          System.out.println(">  " + prod4.toString());
          System.out.println(">  " + prod5.toString());
          

        System.out.println("\n>" + c1.toString());
        System.out.println(">" + t1.toString());
        System.out.println(">"  + e1.toString());
        System.out.println(">" + e2.toString());
        System.out.println("> " + item1.toString());
        System.out.println(">" + compra1.toString());
        
        
        
        System.out.println("\n>" + c2.toString());
        System.out.println(">" + t3.toString());
        System.out.println(">" + t4.toString());
        System.out.println(">" + e3.toString());
        System.out.println("> " + item2.toString());
        System.out.println("> " + item3.toString());
        System.out.println("> " + item4.toString());
        System.out.println("> " + item5.toString());
        System.out.println(">" + compra2.toString());
        System.out.println("> " + item10.toString());
        System.out.println("> " + item11.toString());
        System.out.println("> " + item12.toString());
        System.out.println(">" + compra3.toString());
        
        
        System.out.println("\n>" + c3.toString());
        System.out.println(">" + t5.toString());
        System.out.println(">" + t6.toString());
        System.out.println(">" + e4.toString());
        System.out.println(">" + e5.toString());
        System.out.println(">" + e6.toString());
        System.out.println("> " + item7.toString());
        System.out.println("> " + item8.toString());
        System.out.println("> " + item9.toString());
        System.out.println(">" + compra4.toString());
      
       

        
        
        
        System.out.println("\n\n\n>" + p1.toString() + "\n> " + p2.toString() + "\n> " + p3.toString());
        
        
        
        // main
    }

    
}


    
    
    
    

