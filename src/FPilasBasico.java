
import java.util.Stack;
import javax.swing.JOptionPane;


public class FPilasBasico extends javax.swing.JFrame {
    
    Stack <String> nombres = new Stack();
    Stack <String> elegidos = new Stack();
    Stack <String> enviados = new Stack();

    
    public FPilasBasico() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TNombre = new javax.swing.JTextField();
        BAgregar = new javax.swing.JButton();
        BSacar = new javax.swing.JButton();
        BVaciar = new javax.swing.JButton();
        LPilas = new javax.swing.JLabel();
        BTransferir = new javax.swing.JButton();
        LElegidos = new javax.swing.JLabel();
        BEnviar = new javax.swing.JButton();
        LEnviados = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setText("Nombre:");

        BAgregar.setText("Agregar");
        BAgregar.addActionListener(this::BAgregarActionPerformed);

        BSacar.setText("Sacar");
        BSacar.addActionListener(this::BSacarActionPerformed);

        BVaciar.setText("Vaciar");
        BVaciar.addActionListener(this::BVaciarActionPerformed);

        LPilas.setBackground(new java.awt.Color(102, 102, 255));
        LPilas.setOpaque(true);

        BTransferir.setText("Transferir");
        BTransferir.addActionListener(this::BTransferirActionPerformed);

        LElegidos.setBackground(new java.awt.Color(102, 255, 51));
        LElegidos.setOpaque(true);

        BEnviar.setText("Enviar");
        BEnviar.addActionListener(this::BEnviarActionPerformed);

        LEnviados.setBackground(new java.awt.Color(255, 51, 51));
        LEnviados.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BAgregar)
                .addGap(41, 41, 41)
                .addComponent(BSacar)
                .addGap(39, 39, 39)
                .addComponent(BVaciar)
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(TNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(BTransferir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LEnviados, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                    .addComponent(LElegidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LPilas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(BEnviar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BAgregar)
                    .addComponent(BSacar)
                    .addComponent(BVaciar))
                .addGap(39, 39, 39)
                .addComponent(LPilas, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTransferir)
                .addGap(18, 18, 18)
                .addComponent(LElegidos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(BEnviar)
                .addGap(27, 27, 27)
                .addComponent(LEnviados, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAgregarActionPerformed
        String nom = TNombre.getText();
        if(nom == null || nom.equals("")){
            JOptionPane.showMessageDialog(this, "Introduce un nombre");
            return;
        }
        nombres.push(nom);
        LPilas.setText(nombres.toString());
        TNombre.setText("");
    }//GEN-LAST:event_BAgregarActionPerformed

    private void BVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVaciarActionPerformed
        nombres.clear();
        LPilas.setText(nombres.toString());
    }//GEN-LAST:event_BVaciarActionPerformed

    private void BSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSacarActionPerformed
        if (nombres.empty() == false) {
            nombres.pop();
            
        } else {
            JOptionPane.showMessageDialog(this, "La pila está vacia");
        }
        LPilas.setText(nombres.toString());
    }//GEN-LAST:event_BSacarActionPerformed

    private void BTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTransferirActionPerformed
       if(nombres.empty() == true){
           JOptionPane.showMessageDialog(this, "La pila está vacia");
           return;
       }
        String sacado = nombres.pop();
        elegidos.push(sacado);
        LPilas.setText(nombres.toString());
        LElegidos.setText(elegidos.toString());
    }//GEN-LAST:event_BTransferirActionPerformed

    private void BEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEnviarActionPerformed
        if(elegidos.empty() == true){
           JOptionPane.showMessageDialog(this, "La pila está vacia");
           return;
       }
        String sacado = elegidos.pop();
        enviados.push(sacado);
        
        LElegidos.setText(elegidos.toString());
        LEnviados.setText(enviados.toString());
    }//GEN-LAST:event_BEnviarActionPerformed

    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FPilasBasico().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAgregar;
    private javax.swing.JButton BEnviar;
    private javax.swing.JButton BSacar;
    private javax.swing.JButton BTransferir;
    private javax.swing.JButton BVaciar;
    private javax.swing.JLabel LElegidos;
    private javax.swing.JLabel LEnviados;
    private javax.swing.JLabel LPilas;
    private javax.swing.JTextField TNombre;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
