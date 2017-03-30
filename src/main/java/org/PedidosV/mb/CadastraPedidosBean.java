/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.PedidosV.mb;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.PedidosV.modelo.Produto;

/**
 *
 * @author Vanessa_2
 */

@Named(value = "mbCadastrarProduto")
@RequestScoped

public class CadastraPedidosBean {
    Produto produto = new Produto();
    public void adicionar(){
        //produtoDAO.salvar(produto);
	System.out.println(produto);
    }
    public Produto getProduto(){
        return produto;
    }
}
