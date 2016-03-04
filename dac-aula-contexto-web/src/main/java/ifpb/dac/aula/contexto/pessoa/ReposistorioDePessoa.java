package ifpb.dac.aula.contexto.pessoa;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 01/03/2016, 07:27:42
 */
@Stateless
public class ReposistorioDePessoa {

    @PersistenceContext
    private EntityManager em;

    public void salvar(Pessoa pessoa) {
        em.persist(pessoa);
    }

    public List<Pessoa> todos() {
        return em.createQuery("Select p From Pessoa p", Pessoa.class).getResultList();
    }

    public void excluir(Pessoa pessoa) { 
        em.remove(em.merge(pessoa));
    }
}
