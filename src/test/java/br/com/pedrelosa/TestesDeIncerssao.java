package br.com.pedrelosa;

import br.com.pedrelosa.connection.ConnectionDAO;
import br.com.pedrelosa.model.AbreviacaoLogradouro;
import br.com.pedrelosa.model.Bairro;
import br.com.pedrelosa.model.Logradouro;
import br.com.pedrelosa.model.TipoLogradouro;
import org.junit.Assert;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestesDeIncerssao {

//    @Test
    public void bairro() throws Exception {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PIZZARIA_PU");
        EntityManager em = factory.createEntityManager();

        em.clear();

        ConnectionDAO<Bairro> bCDAO = new ConnectionDAO<>();

        Bairro bairro = new Bairro();

        bairro.setNome("Amadeu Furtado");
        bairro.setTaxaEntrega(5.0);

        bCDAO.salvar(bairro);

        Bairro bairroBanco = em.find(Bairro.class, 2L);

        System.out.println(bairroBanco);

        em.close();

    }

    @Test
    public void logradouro() throws Exception {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PIZZARIA_PU");
        EntityManager em = factory.createEntityManager();

        ConnectionDAO<Logradouro> lCDAO = new ConnectionDAO<>();

        Bairro bairroBanco1 = em.find(Bairro.class, 1L);
        Bairro bairroBanco2 = em.find(Bairro.class, 2L);

        Logradouro l1 = new Logradouro();
        Logradouro l2 = new Logradouro();
        Logradouro l3 = new Logradouro();
        Logradouro l4 = new Logradouro();

        l1.setNome("Padre Guerra");
        l1.setTipoLogradouro(TipoLogradouro.RUA);
        l1.setAbreviacaoLogradouro(AbreviacaoLogradouro.PADRE);
        l1.setBairro(bairroBanco1);
        l2.setNome("Azevedo Bolão");
        l2.setTipoLogradouro(TipoLogradouro.RUA);
        l2.setBairro(bairroBanco1);
        l3.setNome("Conego Pena Forte");
        l3.setTipoLogradouro(TipoLogradouro.RUA);
        l3.setBairro(bairroBanco2);
        l4.setNome("Dom Manuel de Medeiros");
        l4.setTipoLogradouro(TipoLogradouro.RUA);
        l4.setBairro(bairroBanco1);

        lCDAO.salvar(l1);
        lCDAO.salvar(l2);
        lCDAO.salvar(l3);
        lCDAO.salvar(l4);


        Logradouro lb1 = em.find(Logradouro.class, 1L);
        Logradouro lb2 = em.find(Logradouro.class, 2L);
        Logradouro lb3 = em.find(Logradouro.class, 3L);
        Logradouro lb4 = em.find(Logradouro.class, 4L);

        Assert.assertEquals(l1, lb1);
        Assert.assertEquals(l2, lb2);
        Assert.assertEquals(l3, lb3);
        Assert.assertEquals(l4, lb4);

        em.close();
    }
}
