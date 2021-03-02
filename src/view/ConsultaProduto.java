/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Font;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Guilherme
 */
public class ConsultaProduto {

    private JFrame janela;
    private JPanel painelConsultaProduto, painelPequisa;
    private JTable tblProduto;
    private JScrollPane scrollTable;
    private DefaultTableModel modelo;
    private JButton btnExcluir,btnAlterar,btnNovo,btnSair;
    private ButtonGroup groupPesquisa;
    private JRadioButton rdInicio,rdParte;
    private JLabel lblConsulta;
    private JTextField txtConsulta;

    public void desenharTela() {

        janela = new JFrame("Consulta Produto");
        janela.setSize(940, 400);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);

        painelConsultaProduto = new JPanel();
        painelConsultaProduto.setLayout(null);
        painelConsultaProduto.setSize(930, 800);
        painelConsultaProduto.setLocation(0, 0);
        
        criarTabela();
        
     //-------------------------------------------------------------------------------//  
        painelPequisa = new JPanel();
        painelPequisa.setLayout(null);
        painelPequisa.setBorder(BorderFactory.createTitledBorder("Pesquisa por:"));
        painelPequisa.setSize(140, 70);
        painelPequisa.setLocation(10, 290);
        
        rdInicio = new JRadioButton("Inicio do Nome");
        rdInicio.setBounds(8, 20, 120, 17);
        rdInicio.setFont(new Font("Arial", 0, 11));
        painelPequisa.add(rdInicio);
        
        rdParte = new JRadioButton("Parte do Nome");
        rdParte.setBounds(8, 45, 120, 17);
        rdParte.setFont(new Font("Arial", 0, 11));
        painelPequisa.add(rdParte);
        
        groupPesquisa = new ButtonGroup();
        groupPesquisa.add(rdInicio);
        groupPesquisa.add(rdParte);
        
        painelConsultaProduto.add(painelPequisa);
    //-------------------------------------------------------------------------------//    
    
        lblConsulta = new JLabel("Nova Consulta:");
        lblConsulta.setBounds(160, 290, 150, 40);
        lblConsulta.setFont(new Font("Arial", 1, 12));
        painelConsultaProduto.add(lblConsulta);
        
        txtConsulta = new JTextField();
        txtConsulta.setBounds(160, 320, 325, 25);
        painelConsultaProduto.add(txtConsulta);
     //-------------------------------------------------------------------------------//  
     
      //-------------------------------------------------------------------------------//   
        btnNovo = new JButton("Novo");
        btnNovo.setBounds(490, 315, 100, 35);
        btnNovo.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/incluir.png"));
        btnNovo.setFont(new Font("Arial", 1, 13));
        btnNovo.addActionListener((java.awt.event.ActionEvent evt)->{
             CadastroProduto cadProduto = new CadastroProduto();
            try { 
                cadProduto.desenharTela();
            } catch (ParseException ex) {
                Logger.getLogger(ConsultaProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
             janela.dispose();
        });
        painelConsultaProduto.add(btnNovo);
     
       //-------------------------------------------------------------------------------//  
       
       
       //-------------------------------------------------------------------------------//
        btnAlterar = new JButton("Alterar");
        btnAlterar.setBounds(600, 315, 100, 35);
        btnAlterar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/alterar2.png"));
        btnAlterar.setFont(new Font("Arial", 1, 13));
        btnAlterar.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelConsultaProduto.add(btnAlterar);
        
        
        btnExcluir = new JButton("Excluir");
        btnExcluir.setBounds(710, 315, 100, 35);
        btnExcluir.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/excluir2.png"));
        btnExcluir.setFont(new Font("Arial", 1, 13));
        btnExcluir.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelConsultaProduto.add(btnExcluir);
     
     
        
    
    //-------------------------------------------------------------------------------//   
    
        btnSair = new JButton("Sair");
        btnSair.setBounds(820, 315, 100, 35);
        btnSair.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/sair.png"));      
        btnSair.setHorizontalTextPosition(SwingConstants.RIGHT); 
        btnSair.addActionListener((java.awt.event.ActionEvent evt) -> {  
           janela.dispose();
        });
        painelConsultaProduto.add(btnSair);
        
        
        
//-------------------------------------------------------------------------------//
        
        janela.add(painelConsultaProduto);
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
        modelo.addColumn("Descrição do Produto");
        modelo.addColumn("Referência");
        modelo.addColumn("Unidade");
        modelo.addColumn("Preço");
        modelo.addColumn("Ult. Venda");
        modelo.addColumn("Ult. Compra");
        modelo.addColumn("Usuário");

        tblProduto = new JTable();
        tblProduto.setModel(modelo);
        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(70);
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(220);
        tblProduto.getColumnModel().getColumn(2).setPreferredWidth(220);
        tblProduto.getColumnModel().getColumn(3).setPreferredWidth(220);

        tblProduto.getTableHeader().setResizingAllowed(false);
        tblProduto.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblProduto.getTableHeader();
        cabecalho.setFont(new Font("Arial", 1, 14));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblProduto.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblProduto.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        tblProduto.getColumnModel().getColumn(2).setCellRenderer(centralizaColunas);
        tblProduto.getColumnModel().getColumn(3).setCellRenderer(centralizaColunas);

        tblProduto.setFont(new Font("Arial", 0, 14));

        scrollTable = new JScrollPane(tblProduto,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(10, 20, 910, 270);
        tblProduto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelConsultaProduto.add(scrollTable);
    }
}
