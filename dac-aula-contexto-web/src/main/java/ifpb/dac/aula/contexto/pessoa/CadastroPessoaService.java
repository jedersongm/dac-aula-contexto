package ifpb.dac.aula.contexto.pessoa;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 01/03/2016, 07:31:55
 */
@Stateless
public class CadastroPessoaService {

    @EJB
    private ReposistorioDePessoa reposistorio;

    public void salvar(Pessoa pessoa) {
        reposistorio.salvar(pessoa);
    }

    public List<Pessoa> todos() {
        return reposistorio.todos();
    }

    public void excluir(Pessoa pessoa) {
        reposistorio.excluir(pessoa);
    }
}
