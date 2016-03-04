/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.contexto.pessoa;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ifpb.dac.infraestrutura.db.DBUnitHelper;

/**
 *
 * @author jederson
 */
public class ReposistorioDePessoaTestDBUnit {
    
    private ReposistorioDePessoa repository;
    
    public ReposistorioDePessoaTestDBUnit() {
    }
    
        
    @Before
    public void setUp() {
        new DBUnitHelper().cleanInsert("/tabelas/Pessoa.xml");
        repository = new ReposistorioDePessoa();
    }
    
    @After
    public void tearDown() {
        new DBUnitHelper().delete("/tabelas/Pessoa.xml");
    }

    @Test
    public void testFind(){
        Pessoa p = repository.find(746);
        assertNotNull(p);
        assertEquals("Raul dos Santos Seixas", p.getNome());
    }
    /**
     * Test of salvar method, of class ReposistorioDePessoa.
     */
    @Test
    public void testSalvar() {
        Pessoa p = new Pessoa(13, "Bob Marley");
        repository.salvar(p);
        
        Pessoa q = repository.find(13);
        assertNotNull(q);
        assertEquals("Bob Marley", q.getNome());
        assertFalse("Bob Dylan".equals(q.getNome()));
    }

    /**
     * Test of todos method, of class ReposistorioDePessoa.
     */
    @Test
    public void testTodos() {
        assertNotNull(repository.todos().isEmpty());
    }

    /**
     * Test of excluir method, of class ReposistorioDePessoa.
     */
    @Test
    public void testExcluir() {
        Pessoa p = repository.find(746);
        assertNotNull(p);
        assertTrue("Raul dos Santos Seixas".equals(p.getNome()));
        
        repository.excluir(p);
        
        assertNull(p = repository.find(746));
    }
    
}
