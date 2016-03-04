/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.contexto.pessoa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


/**
 *
 * @author jederson
 */
public class CadastroPessoaServiceTestMock {
    
    CadastroPessoaService cadastrarPessoaService;
    Pessoa p = new Pessoa("Raul Seixas");
    
    public CadastroPessoaServiceTestMock() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of salvar method, of class CadastroPessoaService.
     */
    @Test
    public void testSalvar() {
                
        cadastrarPessoaService = mock(CadastroPessoaService.class);
        when(cadastrarPessoaService.salvar(p)).thenReturn(Boolean.TRUE);
        when(cadastrarPessoaService.salvar(null)).thenReturn(Boolean.FALSE);
        
        assertTrue(cadastrarPessoaService.salvar(p));
        assertFalse(cadastrarPessoaService.salvar(null));
    }

    /**
     * Test of todos method, of class CadastroPessoaService.
     */
    @Test
    public void testTodosEmpty() {
       cadastrarPessoaService = mock(CadastroPessoaService.class);
                   
       when(cadastrarPessoaService.todos()).thenReturn(Collections.<Pessoa>emptyList());
       assertNotNull(cadastrarPessoaService.todos());
       assertTrue(cadastrarPessoaService.todos().isEmpty());
       
    }
    
    @Test
    public void testTodosNoEmpty(){
        cadastrarPessoaService = mock(CadastroPessoaService.class);
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(p);
       
        when(cadastrarPessoaService.todos()).thenReturn(pessoas);
        assertNotNull(cadastrarPessoaService.todos());
        assertFalse(cadastrarPessoaService.todos().isEmpty());
    }
 
    /**
     * Test of excluir method, of class CadastroPessoaService.
     */
    @Test
    public void testExcluir() {
        cadastrarPessoaService = mock(CadastroPessoaService.class);
        
        when(cadastrarPessoaService.excluir(p)).thenReturn(Boolean.TRUE);
        assertTrue(cadastrarPessoaService.excluir(p));
        
        when(cadastrarPessoaService.excluir(null)).thenReturn(Boolean.FALSE);
        assertFalse(cadastrarPessoaService.excluir(null));
    }
    
}

