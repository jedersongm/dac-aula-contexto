package ifpb.dac.contexto.pessoa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 01/03/2016, 07:27:42
 */
public class ReposistorioDePessoa {

    private EntityManager em;

    public ReposistorioDePessoa() {
        this(Persistence.createEntityManagerFactory("dac-contexto"));
    }

    public ReposistorioDePessoa(EntityManagerFactory em) {
        this(em.createEntityManager());
    }

    public ReposistorioDePessoa(EntityManager em) {
        this.em = em;
    }

    public boolean salvar(Pessoa pessoa) {
        em.getTransaction().begin();
        em.persist(pessoa);
        em.getTransaction().commit();
        return true;
    }
    
    public Pessoa find(int id){
        return em.find(Pessoa.class, id);
    }

    public List<Pessoa> todos() {
        return em.createQuery("Select p From Pessoa p", Pessoa.class).getResultList();
    }

    /* Usado para analisar o contexto de persistência */
    public boolean excluir(Pessoa pessoa) {
        em.getTransaction().begin();
//        em.remove(em.merge(pessoa));
        em.remove(pessoa);
        em.getTransaction().commit();
        return true;
    }
}
