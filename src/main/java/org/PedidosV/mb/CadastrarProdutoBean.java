package org.PedidosV.mb;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.PedidosV.DAO.ProdutosVDAO;
import org.PedidosV.modelo.Produto;

/**
 *
 * @author Vanessa
 */
@Named(value = "cadastrarProdutoBean")
@RequestScoped
public class CadastrarProdutoBean {
            
    Produto produto = new Produto();
    @Inject
    ProdutosVDAO produtoVDAO;
    
    public void adicionar() {
        produtoVDAO.salvar(produto);
        //System.out.println(produto);
    }

    public Produto getProduto() {
        return produto;
    }
}

