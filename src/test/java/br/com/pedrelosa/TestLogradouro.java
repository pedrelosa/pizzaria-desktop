package br.com.pedrelosa;

import br.com.pedrelosa.connection.LogradouroDAO;
import br.com.pedrelosa.model.Logradouro;
import org.junit.Assert;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class TestLogradouro {

    @Test
    public void retornaLogradouro(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PIZZARIA_PU");
        EntityManager em = factory.createEntityManager();

        LogradouroDAO lCDAO = new LogradouroDAO();

        Logradouro lb = em.find(Logradouro.class, 2L);

        List<Logradouro> lq = lCDAO.buscaTodosPorCaracteres("Aze");

        Assert.assertEquals(lb.getNome(), lq.get(0).getNome());

        em.close();

    }

    @Test
    public void retornaLogradouros(){
        LogradouroDAO lCDAO = new LogradouroDAO();

        List<Logradouro> lq = lCDAO.buscaTodosPorCaracteres("Prof");

        lq.forEach(System.out::println);

    }

}
