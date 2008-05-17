package visao;

import javax.swing.UIManager;
import negocio.ControleProjeto;
import negocio.ExportarImagem;
import negocio.ExportarPDF;
import negocio.Imprimir;
import negocio.plugin.LerDoModelo;
import negocio.Matriz;

/**
 *
 * @author  Fabio
 */
public class Tela extends javax.swing.JFrame {
    ControleProjeto projeto;
    Matriz matriz;
    ExportarImagem exImagem;
    ExportarPDF exPDF;
    Imprimir imprimir;
    LerDoModelo lerModelo;

    public Tela() {
        initComponents();
        setExtendedState( MAXIMIZED_BOTH );
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        salvarProjeto = new javax.swing.JButton();
        jToolBar3 = new javax.swing.JToolBar();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jToolBar4 = new javax.swing.JToolBar();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jToolBar6 = new javax.swing.JToolBar();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new visao.JTableCustomizado();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JSeparator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JSeparator();
        jMenu7 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trama");
        setMinimumSize(new java.awt.Dimension(800, 550));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        jToolBar1.setRollover(true);
        jToolBar1.setAlignmentX(0.0F);
        jToolBar1.setMaximumSize(new java.awt.Dimension(150, 31));
        jToolBar1.setMinimumSize(new java.awt.Dimension(158, 30));
        jToolBar1.setPreferredSize(new java.awt.Dimension(110, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add16.gif"))); // NOI18N
        jButton3.setText("Novo");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setIconTextGap(1);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Open16.gif"))); // NOI18N
        jButton4.setText("Abrir");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setIconTextGap(1);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        salvarProjeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Save16.gif"))); // NOI18N
        salvarProjeto.setText("Salvar");
        salvarProjeto.setFocusable(false);
        salvarProjeto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salvarProjeto.setIconTextGap(1);
        salvarProjeto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        salvarProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarProjetoActionPerformed(evt);
            }
        });
        jToolBar1.add(salvarProjeto);

        jPanel1.add(jToolBar1);

        jToolBar3.setRollover(true);
        jToolBar3.setAlignmentY(0.5F);
        jToolBar3.setMaximumSize(new java.awt.Dimension(50, 50));
        jToolBar3.setMinimumSize(new java.awt.Dimension(50, 50));
        jToolBar3.setPreferredSize(new java.awt.Dimension(80, 30));

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/RowDelete16.gif"))); // NOI18N
        jButton16.setText("Novo");
        jButton16.setFocusable(false);
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.setIconTextGap(1);
        jButton16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(jButton16);

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Stop16.gif"))); // NOI18N
        jButton17.setText("Apagar");
        jButton17.setFocusable(false);
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton17.setIconTextGap(1);
        jButton17.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(jButton17);

        jPanel1.add(jToolBar3);

        jToolBar2.setRollover(true);
        jToolBar2.setMaximumSize(new java.awt.Dimension(400, 30));
        jToolBar2.setMinimumSize(new java.awt.Dimension(300, 30));
        jToolBar2.setPreferredSize(new java.awt.Dimension(340, 30));

        jLabel1.setText(null);
        jToolBar2.add(jLabel1);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.gif"))); // NOI18N
        jButton10.setFocusable(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton10);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_ok.gif"))); // NOI18N
        jButton11.setFocusable(false);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setIconTextGap(1);
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton11);

        jTextField1.setColumns(15);
        jTextField1.setFont(new java.awt.Font("Arial", 0, 12));
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jTextField1.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField1.setMinimumSize(new java.awt.Dimension(10, 30));
        jToolBar2.add(jTextField1);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Play16.gif"))); // NOI18N
        jButton6.setText("Direita");
        jButton6.setAlignmentX(0.5F);
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setIconTextGap(1);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton6);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Down16.gif"))); // NOI18N
        jButton7.setText("Baixo");
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setIconTextGap(1);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton7);

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Find16.gif"))); // NOI18N
        jButton13.setText("Destacar");
        jButton13.setFocusable(false);
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.setIconTextGap(1);
        jButton13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton13);

        jPanel1.add(jToolBar2);

        jToolBar4.setRollover(true);
        jToolBar4.setMaximumSize(new java.awt.Dimension(400, 30));
        jToolBar4.setMinimumSize(new java.awt.Dimension(200, 30));
        jToolBar4.setPreferredSize(new java.awt.Dimension(230, 30));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/RowDelete16.gif"))); // NOI18N
        jButton8.setText("Novo");
        jButton8.setFocusable(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setIconTextGap(1);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar4.add(jButton8);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon-delete.gif"))); // NOI18N
        jButton9.setText("Apagar");
        jButton9.setFocusable(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setIconTextGap(1);
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar4.add(jButton9);

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Preferences16.gif"))); // NOI18N
        jButton14.setText("Ordenar");
        jButton14.setFocusable(false);
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar4.add(jButton14);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Import16.gif"))); // NOI18N
        jButton12.setText("Importar");
        jButton12.setFocusable(false);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setIconTextGap(1);
        jButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar4.add(jButton12);

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Refresh16.gif"))); // NOI18N
        jButton15.setText("Atualizar");
        jButton15.setFocusable(false);
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.setIconTextGap(1);
        jButton15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar4.add(jButton15);

        jPanel1.add(jToolBar4);

        jToolBar6.setRollover(true);
        jPanel1.add(jToolBar6);

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane1.setName("Requisitos X UC"); // NOI18N

        jTable1.setCellSelectionEnabled(true);
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Requisitos X UC", jPanel3);

        jLabel2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("jLabel2");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(649, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(391, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("UC X Classes Análise", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 854, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("UC X Robustez", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 854, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Robustez X Classes Projeto", jPanel6);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Requisitos X UC");

        jMenu1.setText("Arquivo");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/New16.gif"))); // NOI18N
        jMenuItem3.setText("Novo Projeto...");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Salvar Projeto");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Fechar Projeto");
        jMenu1.add(jMenuItem5);
        jMenu1.add(jSeparator3);

        jMenuItem1.setText("Salvar como PDF");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Salvar como Imagem");
        jMenu1.add(jMenuItem2);

        jMenuItem7.setText("Imprimir...");
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Matriz");

        jMenuItem6.setText("Nova Matriz");
        jMenu2.add(jMenuItem6);

        jMenu4.setText("Apagar Matriz");
        jMenu2.add(jMenu4);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Linha/Coluna");

        jMenu6.setText("Nova Linha");
        jMenu5.add(jMenu6);

        jMenu8.setText("Apagar Linha");
        jMenu5.add(jMenu8);
        jMenu5.add(jSeparator1);

        jMenu7.setText("Nova Coluna");
        jMenu5.add(jMenu7);

        jMenu9.setText("Apagar Coluna");
        jMenu5.add(jMenu9);

        jMenuItem9.setText("Importar do Modelo");
        jMenu5.add(jMenuItem9);

        jMenuBar1.add(jMenu5);

        jMenu10.setText("Ferramentas");

        jMenuItem10.setText("Ordenar");
        jMenu10.add(jMenuItem10);

        jMenuItem11.setText("Importar");
        jMenu10.add(jMenuItem11);

        jMenuItem12.setText("Atualizar");
        jMenu10.add(jMenuItem12);

        jMenuItem13.setText("Destacar");
        jMenu10.add(jMenuItem13);

        jMenuItem14.setText("Resetar campos novos");
        jMenu10.add(jMenuItem14);

        jMenuBar1.add(jMenu10);

        jMenu3.setText("Ajuda");

        jMenuItem8.setText("Sobre");
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarProjetoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_salvarProjetoActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jButton4ActionPerformed

    public static void main( String args[] ) {
        try {
            UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName() );
        } catch ( Exception ex ) {
            ex.printStackTrace();
        }
        java.awt.EventQueue.invokeLater( new Runnable() {
                                     public void run() {
                                         new Tela().setVisible( true );
                                     }
                                 } );
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JToolBar jToolBar6;
    private javax.swing.JButton salvarProjeto;
    // End of variables declaration//GEN-END:variables
}
