/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.exemplos;

/**
 *
 * @author 20162148060002
 */
public class Teste {
    
    public static void main(String[] args) {
       Produto produto = new Produto();
        
       produto.setCodigo(12);
       produto.setNome("Bombril");
       
       System.out.println(produto.getNome());
       
       Produto produtoNovo;
       produtoNovo = produto;
       
       System.out.println(produtoNovo.getNome());
       
       /*produto = null;*/
       System.out.println(produto.getNome());
       
       /*produtoNovo = null;*/
       System.out.println(produtoNovo.getNome());       
    }    
}
