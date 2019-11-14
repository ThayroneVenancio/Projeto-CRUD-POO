/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univs.edu.telas;

import javax.swing.JOptionPane;
import univs.edu.funcionario.Funcionario;
import univs.edu.funcionario.FuncionarioDAO;
import univs.edu.usuario.Usuario;

/**
 *
 * @author LABORATORIO 01
 */
public class TelaFuncionario extends javax.swing.JFrame {

    Funcionario funcionario = new Funcionario();
    FuncionarioDAO dao = new  FuncionarioDAO();
    
    
    public TelaFuncionario() {
        initComponents();
    }
    
    public void LimparCampos(){
           funcionario = new Funcionario(); 
           tfNome.setText("");
           tfSalario.setText("");
           tfUsuario.setText("");
           tfCPF.setText("");
           jcCargo.setSelectedItem("Selecione");
        }
    
    public void preencherFuncionaro(){
        tfNome.setText(funcionario.getNomeFuncionario.getSalario());
        tfCPF.setText(funcionario.getCpf());
        tfSalario.setText(String.valueOf(funcionario.getSalario()));
        tfUsuario.setText(funcionario.getUsuario().getLogin());
        jcCargo.setSelectedItem(funcionario.getCargo());
    }

    public  void carregarUsuario(Usuario usuario){
           funcionario.setUsuario(usuario);
           tfUsuario.setText(usuario.getLogin());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfLogin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfLogin3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfCPF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfSalario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jcCargo = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        tfLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLoginActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Login:");

        tfLogin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLogin3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Nome:");

        jButton4.setText("Voltar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Cadastro Funcionario");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(109, 19, 192, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/univs/edu/imagens/usuario-40.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 11, 40, 40);

        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });
        getContentPane().add(tfNome);
        tfNome.setBounds(131, 78, 148, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nome:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 80, 41, 15);

        tfCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCPFActionPerformed(evt);
            }
        });
        getContentPane().add(tfCPF);
        tfCPF.setBounds(131, 104, 148, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("CPF:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(80, 100, 29, 30);

        tfSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSalarioActionPerformed(evt);
            }
        });
        getContentPane().add(tfSalario);
        tfSalario.setBounds(130, 130, 148, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Salario:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(70, 130, 50, 15);

        jcCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Administrador", "Recursos Humanos" }));
        jcCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCargoActionPerformed(evt);
            }
        });
        getContentPane().add(jcCargo);
        jcCargo.setBounds(130, 160, 150, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Cargo:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(70, 160, 50, 15);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Usuario:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(70, 200, 50, 15);

        tfUsuario.setEnabled(false);
        tfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(tfUsuario);
        tfUsuario.setBounds(130, 200, 148, 20);

        jButton1.setText("Selecionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(290, 200, 90, 23);

        jButton2.setText("Pesquisar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(270, 260, 90, 23);

        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(10, 260, 61, 23);

        jButton5.setText("Limpar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(90, 260, 73, 23);

        jButton6.setText("Salvar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(180, 260, 73, 23);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLoginActionPerformed

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void tfCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCPFActionPerformed

    private void tfLogin3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLogin3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLogin3ActionPerformed

    private void tfSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSalarioActionPerformed

    private void jcCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcCargoActionPerformed

    private void tfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    TelaVincularUsuario tela = new TelaVincularUsuario(this);
    tela.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        LimparCampos();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(!tfNome.getText().isEmpty() && 
                !tfCPF.getText().isEmpty() && 
                !tfSalario.getText().isEmpty() && 
                !tfUsuario.getText().isEmpty() && 
                !jcCargo.getSelectedItem().equals("Selecione")){
        funcionario.setCargo(String.valueOf(jcCargo.getSelectedItem()));
        funcionario.setCpf(tfCPF.getText());
        funcionario.setNomeFuncionario(tfNome.getText());
        funcionario.setSalario(Double.parseDouble(tfSalario.getText()));
        dao.salvar(funcionario);
        LimparCampos();
        }else{
            JOptionPane.showMessageDialog(null,"Preencha todos os campos");
    
}
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> jcCargo;
    private javax.swing.JTextField tfCPF;
    private javax.swing.JTextField tfLogin;
    private javax.swing.JTextField tfLogin3;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfSalario;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
