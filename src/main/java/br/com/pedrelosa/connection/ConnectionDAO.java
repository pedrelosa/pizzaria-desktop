package br.com.pedrelosa.connection;

import br.com.pedrelosa.model.EntidadeBase;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionDAO<T extends EntidadeBase> {

    public EntityManager getEntityManager(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PIZZARIA_PU");
        return factory.createEntityManager();
    }

    public T salvar(T t) throws Exception {
        EntityManager em = this.getEntityManager();

        try {
            em.getTransaction().begin();
            if (t.getId() == null){
                em.persist(t);// Execulta o insert
            }else{
                if (!em.contains(t) && em.find(t.getClass(), t.getId()) == null){
                    throw new Exception("Erro ao atualizar o Cliente");
                }
                em.merge(t);// Execulta o update
            }
            em.getTransaction().commit();
        }finally {
            em.close();
        }

        return t;
    }

    public void remover(Class<T> tClass, Long id){
        EntityManager em = this.getEntityManager();

        T t = em.find(tClass, id);

        em.getTransaction().begin();
        em.remove(t);
        em.getTransaction().commit();

        em.close();

    }

    public T consultaPorId(Class<T> tClass, Long id){
        EntityManager em = this.getEntityManager();

        T t = em.find(tClass, id);

        em.close();

        return t;
    }

}
