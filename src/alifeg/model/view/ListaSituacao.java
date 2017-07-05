package alifeg.model.view;

import alifeg.model.dao.DaoSituacao;
import alifeg.model.domain.Situacao;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author Peterson
 */
public class ListaSituacao extends javax.swing.JFrame implements ISelecao{
      
    private Object selecao;
    
    
    /**
     * Creates new form ListaSituacao
     */
    public ListaSituacao() {
        initComponents();
        DaoSituacao ds = new DaoSituacao();
        this.ListaDeSituacoes.addAll(ds.getLista());
    }

    public Object getSelecao() {
        return selecao;
    }

    public void setSelecao(Object selecao) {
        this.selecao = selecao;
    }
    
    public void selecionar() {
        if (this.tblLista.getSelectedRowCount() > 1) {
            int[] selectedRows = this.tblLista.getSelectedRows();
            this.selecao = new ArrayList<Situacao>();
            ArrayList<Situacao> s = (ArrayList<Situacao>)this.selecao;
            for (int selectedRow : selectedRows) {
                s.add(ListaDeSituacoes.get(selectedRow));
            }
        } else {
            if (this.tblLista.getSelectedRowCount()==1) {
                this.selecao = this.ListaDeSituacoes.get(this.tblLista.getSelectedRow());
            }
        }
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        ListaDeSituacoes = new ArrayList<Situacao>();
        jToolBar1 = new javax.swing.JToolBar();
        btSelecionar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLista = new javax.swing.JTable();

        ListaDeSituacoes = ObservableCollections.observableList(ListaDeSituacoes);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Situações");
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jToolBar1.setBorder(javax.swing.BorderFactory.createTitledBorder("Controles De Seleção"));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/selecionar.jpg"))); // NOI18N
        btSelecionar.setText("Selecionar");
        btSelecionar.setFocusable(false);
        btSelecionar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSelecionar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionarActionPerformed(evt);
            }
        });
        jToolBar1.add(btSelecionar);

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancelar.jpg"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.setFocusable(false);
        btCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jToolBar1.add(btCancelar);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista"));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, ListaDeSituacoes, tblLista);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${descricao}"));
        columnBinding.setColumnName("Descricao");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tblLista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSelecionarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaSituacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaSituacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaSituacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaSituacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaSituacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<Situacao> ListaDeSituacoes;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSelecionar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tblLista;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setListener(ActionListener listener) {

        btCancelar.addActionListener(listener);
        btSelecionar.addActionListener(listener);
    }
}
