package br.com.pedrelosa.connection;

import br.com.pedrelosa.model.Logradouro;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;


public class LogradouroDAO extends ConnectionDAO<Logradouro> {

    public List<Logradouro> buscaTodosPorCaracteres(String busca){
        EntityManager em = super.getEntityManager();

        List<Logradouro> logradouros;

        try {
            Query q = em.createNamedQuery("Logradouro.buscaPorCaracteres");
            q.setParameter("busca", busca + "%");
            logradouros = q.getResultList();
        }catch (Exception e){
            logradouros = new ArrayList<>();
        }finally {
            em.close();
        }

        return logradouros;

    }

}
