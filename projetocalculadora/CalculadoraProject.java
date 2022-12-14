/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package myjavaproject.projetocalculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author devre
 */
public class CalculadoraProject extends javax.swing.JFrame {

    /**
     * Creates new form CalculadoraProject
     */
    public CalculadoraProject() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numero1 = new javax.swing.JTextField();
        numero2 = new javax.swing.JTextField();
        resultado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        adicao = new javax.swing.JButton();
        subtracao = new javax.swing.JButton();
        multiplicacao = new javax.swing.JButton();
        divisao = new javax.swing.JButton();
        limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        resultado.setEditable(false);

        jLabel1.setText("=");

        adicao.setText("+");
        adicao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                adicaoMouseReleased(evt);
            }
        });

        subtracao.setText("-");
        subtracao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                subtracaoMouseReleased(evt);
            }
        });

        multiplicacao.setText("*");
        multiplicacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                multiplicacaoMouseReleased(evt);
            }
        });

        divisao.setText("/");
        divisao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                divisaoMouseReleased(evt);
            }
        });

        limpar.setText("Limpar");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(adicao, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subtracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(divisao, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicao)
                    .addComponent(subtracao)
                    .addComponent(multiplicacao)
                    .addComponent(divisao)
                    .addComponent(limpar))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicaoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicaoMouseReleased
        
        try{
            if(numero1.getText().equals("") || numero2.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Preencher os dois campos!", "Calculadora", JOptionPane.ERROR_MESSAGE);
                
            }  else {
                double x, y;
                x = Double.parseDouble(numero1.getText());
                y = Double.parseDouble(numero2.getText());
                resultado.setText((x+y) + "");
            }
        } catch(NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digitar somente n??meros!", "Calculadora", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }//GEN-LAST:event_adicaoMouseReleased

    private void subtracaoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subtracaoMouseReleased
                
        try{
            if(numero1.getText().equals("") || numero2.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Preencher os dois campos!", "Calculadora", JOptionPane.ERROR_MESSAGE);
                
            }  else {
                double x, y;
                x = Double.parseDouble(numero1.getText());
                y = Double.parseDouble(numero2.getText());
                resultado.setText((x-y) + "");
            }
        } catch(NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digitar somente n??meros!", "Calculadora", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }//GEN-LAST:event_subtracaoMouseReleased

    private void multiplicacaoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplicacaoMouseReleased
        
        try{
            if(numero1.getText().equals("") || numero2.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Preencher os dois campos!", "Calculadora", JOptionPane.ERROR_MESSAGE);
                
            }  else {
                double x, y;
                x = Double.parseDouble(numero1.getText());
                y = Double.parseDouble(numero2.getText());
                resultado.setText((x*y) + "");
            }
        } catch(NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digitar somente n??meros!", "Calculadora", JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_multiplicacaoMouseReleased

    private void divisaoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divisaoMouseReleased
        
        try{
            if(numero1.getText().equals("") || numero2.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Preencher os dois campos!", "Calculadora", JOptionPane.ERROR_MESSAGE);
                
            }  else {
                double x, y;
                x = Double.parseDouble(numero1.getText());
                y = Double.parseDouble(numero2.getText());
                resultado.setText((x/y) + "");
            }
        } catch(NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digitar somente n??meros!", "Calculadora", JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_divisaoMouseReleased

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        numero1.setText(null);
        numero2.setText(null);
        resultado.setText(null);
    }//GEN-LAST:event_limparActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraProject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicao;
    private javax.swing.JButton divisao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton limpar;
    private javax.swing.JButton multiplicacao;
    private javax.swing.JTextField numero1;
    private javax.swing.JTextField numero2;
    private javax.swing.JTextField resultado;
    private javax.swing.JButton subtracao;
    // End of variables declaration//GEN-END:variables
}
