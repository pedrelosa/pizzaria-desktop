package br.com.pedrelosa.connection;

import br.com.pedrelosa.model.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO extends ConnectionDAO<Cliente>{

    public List<Cliente> consutarTodosClientes(){
        EntityManager em = super.getEntityManager();
        List<Cliente> clientes;

        try {
            Query q = em.createNamedQuery("Cliente.consultarTodos");
            clientes = q.getResultList();
        }catch (Exception e){
            clientes = new ArrayList<>();
        }finally {
            em.close();

        }

        return clientes;
    }

}
