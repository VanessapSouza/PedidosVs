/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.PedidosV.mb;

/**
 *
 * @author Vanessa_2
 */
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.PedidosV.DAO.ProdutosVDAO;
import org.PedidosV.modelo.Produto;

@Named(value = "ListarProdutos")
@RequestScoped
public class ListarProdutosBean {
    @Inject
    private ProdutosVDAO dao;
    private List<Produto> produtos;

    @PostConstruct
    private void init(){
        this.produtos = dao.buscarTodos();
    }
    
    public List<Produto> getProdutos() {
        return produtos;
    }
    
}
