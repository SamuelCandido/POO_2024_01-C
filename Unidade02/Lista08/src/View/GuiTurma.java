/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Professor;
import Model.Titulacao;
import Model.Turma;
import Model.Turno;

/**
 *
 * @author samue
 */
public class GuiTurma extends javax.swing.JFrame {
    Turma turma = new Turma();
    /**
     * Creates new form GuiTurma
     */
    public GuiTurma() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        tfDisciplina = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        rdMatutino = new javax.swing.JRadioButton();
        rdVespertino = new javax.swing.JRadioButton();
        rdNoturno = new javax.swing.JRadioButton();
        tfNomeProfessor = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        rdGraduacao = new javax.swing.JRadioButton();
        rdMestrado = new javax.swing.JRadioButton();
        rdDoutorado = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btIncluirAluno = new javax.swing.JButton();
        btListaDados = new javax.swing.JButton();
        lbProfessor = new javax.swing.JLabel();
        lbTurma = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Disciplina:");

        buttonGroup1.add(rdMatutino);
        rdMatutino.setText("Matutino");

        buttonGroup1.add(rdVespertino);
        rdVespertino.setText("Vespertino");

        buttonGroup1.add(rdNoturno);
        rdNoturno.setText("Noturno");

        buttonGroup2.add(rdGraduacao);
        rdGraduacao.setText("Graduação");

        buttonGroup2.add(rdMestrado);
        rdMestrado.setText("Mestrado");

        buttonGroup2.add(rdDoutorado);
        rdDoutorado.setText("Doutorado");

        jLabel2.setText("Nome:");

        jLabel3.setText("Email:");

        btIncluirAluno.setText("Incluir Aluno");
        btIncluirAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirAlunoActionPerformed(evt);
            }
        });

        btListaDados.setText("Consulta Turma");
        btListaDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListaDadosActionPerformed(evt);
            }
        });

        lbProfessor.setText("Professor");

        lbTurma.setText("Turma");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                .addComponent(tfNomeProfessor)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btIncluirAluno)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(rdMatutino)
                        .addGap(18, 18, 18)
                        .addComponent(rdVespertino)
                        .addGap(18, 18, 18)
                        .addComponent(rdNoturno))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btListaDados)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addComponent(rdGraduacao)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(rdMestrado)
                            .addGap(18, 18, 18)
                            .addComponent(rdDoutorado))))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbTurma)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbProfessor)
                        .addGap(144, 144, 144))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbTurma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdMatutino)
                    .addComponent(rdVespertino)
                    .addComponent(rdNoturno))
                .addGap(18, 18, 18)
                .addComponent(lbProfessor)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdGraduacao)
                    .addComponent(rdMestrado)
                    .addComponent(rdDoutorado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btIncluirAluno)
                    .addComponent(btListaDados))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btIncluirAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirAlunoActionPerformed
        GuiFormulario formularioAluno = new GuiFormulario(turma);
        formularioAluno.setVisible(true);
    }//GEN-LAST:event_btIncluirAlunoActionPerformed

    private void btListaDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListaDadosActionPerformed
        turma.setDisciplina(tfDisciplina.getText());
        
        if (rdMatutino.isSelected()) {
            turma.setTurno(Turno.MATUTINO);
        } 
        else if (rdVespertino.isSelected()) {
            turma.setTurno(Turno.VESPERTINO);
        } 
        else if (rdNoturno.isSelected()) {
            turma.setTurno(Turno.NOTURNO);
        } 
        
        Professor professor = new Professor();
        
        professor.setNome(tfNomeProfessor.getText());
        professor.setEmail(tfEmail.getText());
        
        if (rdGraduacao.isSelected()) {
            professor.setTitulacao(Titulacao.GRADUCAO);
        } 
        else if (rdMestrado.isSelected()) {
            professor.setTitulacao(Titulacao.MESTRADO);
        } 
        else if (rdDoutorado.isSelected()) {
            professor.setTitulacao(Titulacao.DOUTORADO);
        } 
        
        turma.setProfessor(professor);
        
        GuiConsulta consulta = new GuiConsulta(turma);
        consulta.setVisible(true);
    }//GEN-LAST:event_btListaDadosActionPerformed

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
            java.util.logging.Logger.getLogger(GuiTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiTurma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btIncluirAluno;
    private javax.swing.JButton btListaDados;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbProfessor;
    private javax.swing.JLabel lbTurma;
    private javax.swing.JRadioButton rdDoutorado;
    private javax.swing.JRadioButton rdGraduacao;
    private javax.swing.JRadioButton rdMatutino;
    private javax.swing.JRadioButton rdMestrado;
    private javax.swing.JRadioButton rdNoturno;
    private javax.swing.JRadioButton rdVespertino;
    private javax.swing.JTextField tfDisciplina;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNomeProfessor;
    // End of variables declaration//GEN-END:variables
}
