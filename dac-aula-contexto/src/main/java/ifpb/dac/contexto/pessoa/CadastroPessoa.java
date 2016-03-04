package ifpb.dac.contexto.pessoa;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ricardo Job
 */
public class CadastroPessoa extends javax.swing.JFrame {

    private CadastroPessoaService service = new CadastroPessoaService();
    private PessoaTabela modelo = new PessoaTabela();
    private Pessoa pessoa = new Pessoa();

    public CadastroPessoa() {
        initComponents();
        jTable1.addMouseListener(new TabelaMouseAdapter());
        atualizarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        nome = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        id.setEditable(false);

        jLabel1.setText("Id:");

        jLabel2.setText("Nome:");

        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pessoa = new Pessoa(nome.getText());
        salvar();
        atualizarTabela();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//        int ids = Integer.parseInt(id.getText());
//        Pessoa pessoa = new Pessoa(ids, nome.getText());
        excluir();
        atualizarTabela();

    }//GEN-LAST:event_jButton2ActionPerformed

     
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nome;
    // End of variables declaration//GEN-END:variables

    private void salvar() {
        service.salvar(pessoa);
    }

    private void atualizarTabela() {
        modelo.atualizarTabela(service.todos());
    }

    private void excluir() {
        service.excluir(pessoa);
    }

    private void atualizaUI(Pessoa pessoa) {
        nome.setText(pessoa.getNome());
        id.setText(String.valueOf(pessoa.getId()));
    }

    private void atualizaUI() {
        atualizaUI(pessoa);
    }

    /*Classe responsavel pelos eventos do Mouse na Tabela*/
    private class TabelaMouseAdapter extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {
            /* Aqui seria uma instancia acoplada, já existente no contexto de persitência */
            pessoa = modelo.selecionar(jTable1.getSelectedRow());
            atualizaUI();
            /* Aqui seria uma nova instancia, uma entidade desacoplada */
//                Pessoa selecionar = modelo.selecionar(jTable1.getSelectedRow());
//                atualizaUI(selecionar);
        }

    }

    /*Classe responsavel pelo gerenciamento dos dados da Tabela*/
    private class PessoaTabela extends AbstractTableModel {

        private List<Pessoa> pessoas;

        public PessoaTabela() {
            this(new ArrayList<>());
        }

        public PessoaTabela(List<Pessoa> pessoas) {
            this.pessoas = pessoas;
        }

        @Override
        public int getRowCount() {
            return pessoas.size();
        }

        @Override
        public String getColumnName(int column) {
            switch (column) {
                case 0:
                    return "Id";
                case 1:
                    return "Nome";
                default:
                    return "";
            }
        }

        @Override
        public int getColumnCount() {
            return 2;
        }

        public Pessoa selecionar(int index) {
            return pessoas.get(index);
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Pessoa p = pessoas.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return p.getId();
                case 1:
                    return p.getNome();
                default:
                    return "";
            }
        }

        public void atualizarTabela(List<Pessoa> pessoas) {
            this.pessoas = pessoas;
            fireTableDataChanged();
        }

    }
}
