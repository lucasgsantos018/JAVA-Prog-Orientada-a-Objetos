/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;


import DAO.FuncionarioDAO;
import Modelo.*;
import DAO.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import excecoes.AutenticacaoException;
/**
 *
 * @author Administrador
 */
public class MenuUsuario extends javax.swing.JFrame {
    private TelaPrincipal tela;
    private AtualizarUsuario telaAtualizarUsu;
    private FuncionarioDAO daoFuncionario = new FuncionarioDAO();
    private UsuarioDAO daoUsuarios = new UsuarioDAO();
    private AutorDAO daoAutor = new AutorDAO();
    private CategoriaDAO daoCategoria = new CategoriaDAO();
    private EmprestimoDAO daoEmprestimo = new EmprestimoDAO();
    private LivroDAO daoLivro = new LivroDAO();
    private Funcionario FuncionarioAtual;

    /**
     * Creates new form GerenciarUsuraio
     */
    public MenuUsuario() {
        initComponents();
    }
    public MenuUsuario(TelaPrincipal tela,FuncionarioDAO daoFuncionario,UsuarioDAO daoUsuraios,LivroDAO daoLivro, EmprestimoDAO daoEmprestimo, AutorDAO daoAutor){
        this.tela= tela;
        this.daoFuncionario = daoFuncionario;
        this.daoUsuarios = daoUsuarios;
        this.daoLivro= daoLivro;
        this.daoEmprestimo=daoEmprestimo;
        this.daoAutor=daoAutor;
        
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

        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textoIDLivro = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("Retornar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setText("Menu Usuario");

        jLabel2.setText("ID(Livro):");

        textoIDLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoIDLivroActionPerformed(evt);
            }
        });

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Lista de livros disponiveis");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(textoIDLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textoIDLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(17, 17, 17))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        tela.abrirTelaLoginUsuario(tela, daoFuncionario, daoUsuarios, daoLivro, daoEmprestimo, daoAutor);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Consulta
       // Mostrar a lista de livros com seus IDs para que o usuário possa escolher qual consultar
        List<Livro> listaLivros = daoLivro.getLista();
        
        String id = textoIDLivro.getText();
        int idConvertido;

        try {
            idConvertido = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Livro não encontrado");
            return; // Encerra o método em caso de erro de conversão
        }
        Livro livroEncontrado = daoLivro.localizar(idConvertido);
        if (livroEncontrado == null) {
            JOptionPane.showMessageDialog(null,"Nenhum livro encontrado com o ID: " + idConvertido);
        } else {
        
            JOptionPane.showMessageDialog(null,"Livro encontrado:");
            JOptionPane.showMessageDialog(null,"ID: " + livroEncontrado.getId() + ", Título: " + livroEncontrado.getTitulo());
            JOptionPane.showMessageDialog(null,"Categorias: " + livroEncontrado.getCategorias());
            JOptionPane.showMessageDialog(null,"Autores: " + livroEncontrado.getAutores());
        }
            

        //dispose();
        //tela.abrirTelaEmprestimo(tela,daoFuncionario,daoUsuarios,daoLivro,daoEmprestimo,daoAutor);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textoIDLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoIDLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoIDLivroActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         List<Livro> livros = daoLivro.getLista();

        if (livros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum livro cadastrado!");
        } else {
            DefaultListModel<String> listModel = new DefaultListModel<>();
            JList<String> jList = new JList<>(listModel);

            for (Livro livro : livros) {
                listModel.addElement(livro.toString());
                System.out.println(livro.toString());
            }
            // Crie um diálogo para exibir a JList
            JFrame frame = new JFrame("Lista de Livros");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            frame.add(new JScrollPane(jList));
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField textoIDLivro;
    // End of variables declaration//GEN-END:variables
}
