
package condicionescompetencias;

import java.util.logging.Level;
import java.util.logging.Logger;


public class CondicionesCompetencias extends javax.swing.JFrame {

        /**
         * Creates new form CondicionesCompetencias
         */
        public CondicionesCompetencias() {
                initComponents();
                rC = new RCompartido();
                t1 = new Hilo(Area1,rC, 1);
                t2 = new Hilo(Area2, rC, 2);
                t3 = new Hilo(Area3, rC, 3);
                t4 = new Hilo(Area4, rC, 4);
                
        }

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                btCorrer = new javax.swing.JButton();
                btPausa = new javax.swing.JButton();
                btTerminar = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                Area1 = new javax.swing.JTextArea();
                jScrollPane2 = new javax.swing.JScrollPane();
                Area2 = new javax.swing.JTextArea();
                jScrollPane3 = new javax.swing.JScrollPane();
                Area3 = new javax.swing.JTextArea();
                jScrollPane4 = new javax.swing.JScrollPane();
                Area4 = new javax.swing.JTextArea();
                lbHilo1 = new javax.swing.JLabel();
                lbHilo2 = new javax.swing.JLabel();
                lbHilo3 = new javax.swing.JLabel();
                lbHilo4 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                btCorrer.setText("Correr");
                btCorrer.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btCorrerActionPerformed(evt);
                        }
                });

                btPausa.setText("Pausa");
                btPausa.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btPausaActionPerformed(evt);
                        }
                });

                btTerminar.setText("Terminar");
                btTerminar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btTerminarActionPerformed(evt);
                        }
                });

                Area1.setColumns(20);
                Area1.setRows(5);
                jScrollPane1.setViewportView(Area1);

                Area2.setColumns(20);
                Area2.setRows(5);
                jScrollPane2.setViewportView(Area2);

                Area3.setColumns(20);
                Area3.setRows(5);
                jScrollPane3.setViewportView(Area3);

                Area4.setColumns(20);
                Area4.setRows(5);
                jScrollPane4.setViewportView(Area4);

                lbHilo1.setText("Plato 1");
                lbHilo1.setEnabled(false);

                lbHilo2.setText("Plato 2");

                lbHilo3.setText("Plato 3");

                lbHilo4.setText("Plato 4");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btTerminar)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btPausa)
                                                        .addComponent(btCorrer))))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(60, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(lbHilo1)
                                .addGap(174, 174, 174)
                                .addComponent(lbHilo2)
                                .addGap(155, 155, 155)
                                .addComponent(lbHilo3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbHilo4)
                                .addGap(134, 134, 134))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(lbHilo1))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(lbHilo4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(lbHilo3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(lbHilo2, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane2)
                                                        .addComponent(jScrollPane3)
                                                        .addComponent(jScrollPane4)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addComponent(btCorrer)
                                                .addGap(18, 18, 18)
                                                .addComponent(btPausa)
                                                .addGap(18, 18, 18)
                                                .addComponent(btTerminar)))
                                .addContainerGap(110, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void btCorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCorrerActionPerformed
                t1.start();
                t2.start();
                t3.start();
                t4.start();
        }//GEN-LAST:event_btCorrerActionPerformed

        private void btPausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPausaActionPerformed

             
        }//GEN-LAST:event_btPausaActionPerformed

        private void btTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTerminarActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_btTerminarActionPerformed

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
                        java.util.logging.Logger.getLogger(CondicionesCompetencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(CondicionesCompetencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(CondicionesCompetencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(CondicionesCompetencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new CondicionesCompetencias().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JTextArea Area1;
        private javax.swing.JTextArea Area2;
        private javax.swing.JTextArea Area3;
        private javax.swing.JTextArea Area4;
        private javax.swing.JButton btCorrer;
        private javax.swing.JButton btPausa;
        private javax.swing.JButton btTerminar;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JScrollPane jScrollPane3;
        private javax.swing.JScrollPane jScrollPane4;
        private javax.swing.JLabel lbHilo1;
        private javax.swing.JLabel lbHilo2;
        private javax.swing.JLabel lbHilo3;
        private javax.swing.JLabel lbHilo4;
        // End of variables declaration//GEN-END:variables
        private Hilo t1,t2, t3, t4;
        private RCompartido rC;
}
