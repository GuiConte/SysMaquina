/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Guilherme
 */
public class ConsultaFuncionario {

    private JFrame janela;
    private JPanel painelConsultaFuncionario;
    private JTable tblFuncionario;
    private JScrollPane scrollTable;
    private DefaultTableModel modelo;
    private JButton btnAltera,btnNovo,btnExclui,btnRetorna,btnPrimeiro,btnAnterior,btnProximo,btnUltimo;

    public void desenharTela() {

        janela = new JFrame("Cadastro de Funcionarios");        
        janela.setSize(475, 460);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);

        painelConsultaFuncionario = new JPanel();
        painelConsultaFuncionario.setLayout(null);
        painelConsultaFuncionario.setSize(460, 460);
        painelConsultaFuncionario.setLocation(0, 0);
        
        criarTabela();
        
        btnPrimeiro = new JButton("|<");
        btnPrimeiro.setBounds(134, 315, 50, 25);
        btnPrimeiro.setFont(new Font("Arial", 0, 8));
        btnPrimeiro.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelConsultaFuncionario.add(btnPrimeiro);
        
        btnAnterior = new JButton("<");
        btnAnterior.setBounds(184, 315, 50, 25);
        btnAnterior.setFont(new Font("Arial", 0, 8));
        btnAnterior.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelConsultaFuncionario.add(btnAnterior);
        
        btnProximo = new JButton(">");
        btnProximo.setBounds(234, 315, 50, 25);
        btnProximo.setFont(new Font("Arial", 0, 8));
        btnProximo.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelConsultaFuncionario.add(btnProximo);
        
        btnUltimo = new JButton(">|");
        btnUltimo.setBounds(284, 315, 50, 25);
        btnUltimo.setFont(new Font("Arial", 0, 8));
        btnUltimo.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelConsultaFuncionario.add(btnUltimo);
        
        btnAltera = new JButton("Altera");
        btnAltera.setBounds(85, 360, 60, 53);
        btnAltera.setFont(new Font("Arial", 0, 8));
        btnAltera.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelConsultaFuncionario.add(btnAltera);
        
        btnNovo = new JButton("Novo");
        btnNovo.setBounds(165, 360, 60, 53);
        btnNovo.setFont(new Font("Arial", 0, 8)); 
        btnNovo.addActionListener((java.awt.event.ActionEvent evt)->{
             CadastroFuncionario cadFuncionario = new CadastroFuncionario();
             cadFuncionario.desenharTela();   
         
        });
        painelConsultaFuncionario.add(btnNovo);
        
        btnExclui = new JButton("Exclui");
        btnExclui.setBounds(245, 360, 60, 53);
        btnExclui.setFont(new Font("Arial", 0, 8)); 
        btnExclui.addActionListener((java.awt.event.ActionEvent evt)->{
             
        });
        painelConsultaFuncionario.add(btnExclui);
        
        btnRetorna = new JButton("Retorna");
        btnRetorna.setBounds(325, 360, 60, 53);
        btnRetorna.setFont(new Font("Arial", 0, 8)); 
        btnRetorna.addActionListener((java.awt.event.ActionEvent evt)->{
             
        });
        painelConsultaFuncionario.add(btnRetorna);
        
        janela.add(painelConsultaFuncionario);
        janela.setVisible(true);

    }
    
    private void criarTabela() {
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        modelo.addColumn("Código");
        modelo.addColumn("Funcionario");
        modelo.addColumn("Função");
        modelo.addColumn("Comissão %");

        tblFuncionario = new JTable();
        tblFuncionario.setModel(modelo);
        tblFuncionario.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblFuncionario.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblFuncionario.getColumnModel().getColumn(2).setPreferredWidth(160);

        tblFuncionario.getTableHeader().setResizingAllowed(false);
        tblFuncionario.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblFuncionario.getTableHeader();
        cabecalho.setFont(new Font("Arial", 1, 14));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblFuncionario.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblFuncionario.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        tblFuncionario.getColumnModel().getColumn(2).setCellRenderer(centralizaColunas);

        tblFuncionario.setFont(new Font("Arial", 0, 14));

        scrollTable = new JScrollPane(tblFuncionario,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(10, 20, 450, 280);
        tblFuncionario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelConsultaFuncionario.add(scrollTable);
    }
}
