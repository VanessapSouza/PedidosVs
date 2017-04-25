/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.PedidosV.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.PedidosV.modelo.Produto;

/**
 *
 * @author Vanessa
 */
public class ProdutosVDAO {
     @PersistenceContext
    private EntityManager em;
    
    @Transactional
    public void salvar(Produto produto){
        em.persist(produto);
    
    }
    public List<Produto> buscarTodos(){
        TypedQuery<Produto> query = em.
                createQuery("select c from Produto c", Produto.class);
        return query.getResultList();
    }
}
