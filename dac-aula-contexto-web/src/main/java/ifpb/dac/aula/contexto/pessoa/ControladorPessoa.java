package ifpb.dac.aula.contexto.pessoa;

import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Ricardo Job
 */
@Named(value = "controlador")
@RequestScoped
public class ControladorPessoa {

    private Pessoa pessoa = new Pessoa();

    private List<Pessoa> pessoas;

    @EJB
    private CadastroPessoaService service;

    public ControladorPessoa() {
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Pessoa> getPessoas() {
        pessoas = service.todos();
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public String salvar() {
        service.salvar(pessoa);
        pessoa = new Pessoa();
        return null;
    }

    public String remover(Pessoa p) {
        service.excluir(p);
        return null;
    }

}
