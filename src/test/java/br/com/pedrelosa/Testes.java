package br.com.pedrelosa;

import br.com.pedrelosa.connection.ClienteDAO;
import br.com.pedrelosa.connection.ConnectionDAO;
import br.com.pedrelosa.model.*;
import org.junit.Assert;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class Testes {

    //    @Test
    public void cadastraLogradouro() throws Exception {
        ConnectionDAO<Logradouro> lCDAO = new ConnectionDAO<>();

        Logradouro logradouro = new Logradouro();

        logradouro.setNome("Padre Mororó");
        logradouro.setAbreviacaoLogradouro(AbreviacaoLogradouro.PADRE);
        logradouro.setTipoLogradouro(TipoLogradouro.RUA);

        lCDAO.salvar(logradouro);
    }

//    @Test
    public void cadastraBairro() throws Exception {
        ConnectionDAO<Bairro> bCDAO = new ConnectionDAO<>();

        Bairro bairro = new Bairro();

        bairro.setNome("Benfica");
        bairro.setTaxaEntrega(7.0);

        bCDAO.salvar(bairro);
    }

//    @Test
    public void logradouroBairro() throws Exception {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PIZZARIA_PU");
        EntityManager em = factory.createEntityManager();
        ConnectionDAO<Logradouro> lCDAO = new ConnectionDAO<>();

        Logradouro logradouro = em.find(Logradouro.class, 1L);
        Bairro bairro = em.find(Bairro.class, 1L);

        logradouro.setBairro(bairro);

//        System.out.println(bairro);

        lCDAO.salvar(logradouro);


        Logradouro logradouroBanco = em.find(Logradouro.class, 1L);

        Assert.assertEquals(logradouro, logradouroBanco);

        em.close();


    }

//    @Test
    public void cadastroEndereco() throws Exception {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PIZZARIA_PU");
        EntityManager em = factory.createEntityManager();

        ConnectionDAO<Endereco> eCDAO = new ConnectionDAO<>();

        Endereco endereco = new Endereco();
        Logradouro logradouro = em.find(Logradouro.class, 1L);
        Bairro bairro = em.find(Bairro.class, 1L);



        endereco.setLogradouro(logradouro);
        endereco.setNumeroLogradouro("2413");
        endereco.setComplementoLogradouro("Ap 406 bl B");
        endereco.setBairro(bairro);
        endereco.setCep("60015221");
        endereco.setReferencia("Ao lado da oficina zé baiano");

        eCDAO.salvar(endereco);

        Endereco enderecoBanco = em.find(Endereco.class, 1L);

        Assert.assertEquals(endereco, enderecoBanco);

        em.close();
    }

//    @Test
    public void cadastroCliente() throws Exception {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PIZZARIA_PU");
        EntityManager em = factory.createEntityManager();
        ConnectionDAO<Cliente> cCDAO = new ConnectionDAO<>();

        Logradouro logradouro = em.find(Logradouro.class, 1L);
        Bairro bairro = em.find(Bairro.class, 1L);
        Endereco endereco = em.find(Endereco.class, 1L);

        List<Endereco> enderecos = new ArrayList<>();
        enderecos.add(endereco);

        Cliente cliente = new Cliente();

        cliente.setTelefone("85997872280");
        cliente.setNome("Pedro");
        cliente.setNomeCompleto("Pedro Alcântara");
        cliente.setEnderecos(enderecos);
        cliente.setTaxaEntrega(7.0);
        cliente.setObservacoes("Sem azeitona");

        cCDAO.salvar(cliente);

        System.out.println(em.find(Cliente.class, 1L));

        em.close();
    }

//    @Test
    public void imprimindoTudo(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PIZZARIA_PU");
        EntityManager em = factory.createEntityManager();

        Logradouro logradouro = em.find(Logradouro.class, 1L);
        Bairro bairro = em.find(Bairro.class, 1L);
        Endereco endereco = em.find(Endereco.class, 1L);
        Cliente cliente = em.find(Cliente.class, 1L);

        try {

//            System.out.println(cliente.getEnderecos().get(0).getLogradouro());
            Assert.assertEquals(endereco, bairro.getEnderecos().get(0));
            Assert.assertEquals(logradouro, bairro.getLogradouros().get(0));
            Assert.assertEquals(bairro, endereco.getBairro());
            Assert.assertEquals(cliente, endereco.getClientes().get(0));
            Assert.assertEquals(logradouro.getBairro(), bairro);
            Assert.assertEquals(endereco, cliente.getEnderecos().get(0));
            Assert.assertEquals(cliente, logradouro.getBairro().getEnderecos().get(0).getClientes().get(0));
            Assert.assertEquals(bairro, cliente.getEnderecos().get(0).getBairro());
            Assert.assertEquals(logradouro, cliente.getEnderecos().get(0).getLogradouro());
            Assert.assertEquals(cliente, bairro.getEnderecos().get(0).getClientes().get(0));
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            em.close();
        }
    }



    //    @Test
    public void cadastraEndereco() throws Exception {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PIZZARIA_PU");
        EntityManager em = factory.createEntityManager();
        ConnectionDAO<Endereco> eCDAO = new ConnectionDAO<>();

        Endereco endereco = new Endereco();

        Logradouro logradouro = em.find(Logradouro.class, 2L);
        Bairro bairro = em.find(Bairro.class, 1L);

        endereco.setBairro(bairro);
        endereco.setLogradouro(logradouro);
        endereco.setCep("60015330");
        endereco.setReferencia("Em frente à lanchonete do Bené");
        endereco.setNumeroLogradouro("533");
        endereco.setComplementoLogradouro("Escola");

        eCDAO.salvar(endereco);

        Endereco enderecoBanco = em.find(Endereco.class, 6L);

        Assert.assertEquals(enderecoBanco, endereco);

        System.out.println(endereco);
        System.out.println(enderecoBanco);

        em.close();
    }

    @Test
    public void teslads(){
        ClienteDAO clienteDAO = new ClienteDAO();

        List<Cliente> clientes = clienteDAO.consutarTodosClientes();

        for (Cliente c :
                clientes) {
            System.out.println(c.getNome());
        }

    }
    @Test
    public void teslaasdasds(){
        ClienteDAO clienteDAO = new ClienteDAO();

        List<Cliente> clientes = clienteDAO.consutarTodosClientes();

        for (Cliente c :
                clientes) {
            System.out.println(c.getNome());
        }

    }

    //    @Test
    public void cadastroLogradouro() {
        ConnectionDAO<Logradouro> lCDAO = new ConnectionDAO<>();

        Logradouro logradouro = new Logradouro();

        logradouro.setTipoLogradouro(TipoLogradouro.RUA);
        logradouro.setNome("Luís de Miranda");

        try {
            lCDAO.salvar(logradouro);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //    @Test
    public void testaCadastroBL() throws Exception {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PIZZARIA_PU");
        EntityManager em = factory.createEntityManager();

        Logradouro logradouro1 = em.find(Logradouro.class, 1L);
        Logradouro logradouro2 = em.find(Logradouro.class, 2L);

        Bairro bairro = em.find(Bairro.class, 1L);

        logradouro1.setBairro(bairro);
        logradouro2.setBairro(bairro);

        Assert.assertEquals(logradouro1.getBairro(), bairro);

        ConnectionDAO<Logradouro> lCDAO = new ConnectionDAO<>();

        lCDAO.salvar(logradouro1);
        lCDAO.salvar(logradouro2);

        Logradouro logradouroBanco = em.find(Logradouro.class, 1L);

        Assert.assertEquals(logradouroBanco.getBairro(), bairro);

        System.out.println(bairro);
        System.out.println(logradouroBanco.getBairro());


    }
}
