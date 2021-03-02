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
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
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
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Patrik
 */
public class FluxoPagar {
    
    private JFrame janela, janelaNovo;
    private JTable tblPagar;
    private JScrollPane scrollTable;
    private DefaultTableModel modelo;
    private JPanel painelPrincipal, painelData, painelContas, painelNovo;
    private JButton btnVisualizar, btnPesquisar, btnNovo, btnAlterar, btnExcluir, btnConsultarFornecedor, btnConsultaForn, btnSalvarNovo, btnSairNovo;
    private JComboBox cbDataInicial, cbDataFinal, cbReceita, cbBaixa;
    private JTextField txtFornecedor, txtCodFornecedor,txtTotalPago, txtTotalReceber, txtTotalGeral, txtCI;
    private JLabel lblA, lblFornecedor, lblReceita, lblBaixa, lblTotalPago, lblTotalReceber, lblTotalGeral ,lblCI;
    private ButtonGroup groupContas;
    private JRadioButton rdTodas, rdJuridica, rdFisica;
    private JLabel lblData, lblVencimento, lblFornecedorNovo, lblTotalPagar, lblObservacao;
    private JFormattedTextField txtData, txtVencimento;
    private JTextField txtFornecedorNovo, txtCodFornecedorNovo, txtTotalPagar, txtObservacao;
    
    
     public void desenharTela() {

        janela = new JFrame("Fluxo Caixa - Receber");
        janela.setSize(1020, 570);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        
        

        
        
        
//-----------------------------------------------------------------------//
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(1000, 520);
        painelPrincipal.setLocation(5, 5);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
   //-----------------------------------------------------------------------//     
        
         painelData = new JPanel();
        painelData.setLayout(null);
        painelData.setSize(320, 70);
        painelData.setLocation(10, 310);
        painelData.setBorder(BorderFactory.createTitledBorder("Datas"));
        painelPrincipal.add(painelData);
    //-----------------------------------------------------------------------//    
        
        cbDataInicial = new JComboBox();
        cbDataInicial.setBounds(10, 30, 120, 22);
        painelData.add(cbDataInicial);
     //-----------------------------------------------------------------------//
     
         lblA = new JLabel("A");
        lblA.setBounds(145, 30, 20, 22);
        painelData.add(lblA);
      //-----------------------------------------------------------------------//  
      
         cbDataFinal = new JComboBox();
        cbDataFinal.setBounds(170, 30, 120, 22);
        painelData.add(cbDataFinal);
        //-----------------------------------------------------------------------//
        
        
         
         lblCI = new JLabel("C.I");
        lblCI.setBounds(350, 310, 80, 22);
        painelPrincipal.add(lblCI);
        
        
         txtCI = new JTextField();
        txtCI.setBounds(350, 330, 100, 22);
        painelPrincipal.add(txtCI);
        
        
        
        //-----------------------------------------------------------------------//
        
         lblFornecedor = new JLabel("Fornecedor");
        lblFornecedor.setBounds(10, 390, 80, 22);
        painelPrincipal.add(lblFornecedor);
        
        
         txtFornecedor = new JTextField();
        txtFornecedor.setBounds(10, 410, 350, 22);
        painelPrincipal.add(txtFornecedor);
      
        txtCodFornecedor = new JTextField();
        txtCodFornecedor.setBounds(370, 410, 40, 22);
        painelPrincipal.add(txtCodFornecedor);
        
             
       btnConsultarFornecedor = new JButton();
       btnConsultarFornecedor.setBounds(415, 410, 22, 22);       
       btnConsultarFornecedor.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
       btnConsultarFornecedor.setToolTipText("Pesquisar Fornecedor");
       btnConsultarFornecedor.setHorizontalTextPosition(SwingConstants.CENTER);
        
       painelPrincipal.add(btnConsultarFornecedor);
        
       //-----------------------------------------------------------------------//
        
        
         lblReceita = new JLabel("Receitas");
        lblReceita.setBounds(10, 440, 80, 22);
        painelPrincipal.add(lblReceita);   
        
         cbReceita = new JComboBox();
        cbReceita.setBounds(10, 460, 140, 22);
        painelPrincipal.add(cbReceita);
        
        
         
         lblBaixa = new JLabel("Baixas");
        lblBaixa.setBounds(200, 440, 80, 22);
        painelPrincipal.add(lblBaixa);   
        
         cbBaixa = new JComboBox();
        cbBaixa.setBounds(200, 460, 140, 22);
        painelPrincipal.add(cbBaixa);
        
        
          painelContas = new JPanel();
        painelContas.setLayout(null);
        painelContas.setSize(310, 70);
        painelContas.setLocation(490, 310);
        painelContas.setBorder(BorderFactory.createTitledBorder("Fluxo Contas (Novos Cadastros)"));
        painelPrincipal.add(painelContas);
        
        
          // ---------------- BOTAO GRAVAR-----//
       btnNovo = new JButton("Novo");
       btnNovo.setBounds(10, 25, 90, 27);  
       btnNovo.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/incluir.png"));       
       btnNovo.setHorizontalTextPosition(SwingConstants.RIGHT);
       btnNovo.setFont(new Font("Arial", 1, 13));
         btnNovo.addActionListener((java.awt.event.ActionEvent evt) -> {  
            try {
                CriarNovo();
            } catch (ParseException ex) {
                Logger.getLogger(FluxoPagar.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
       
        
       painelContas.add(btnNovo);
        
       
       
       
        //------------BOTAO PESQUISAR  ---------------------//
       
       btnAlterar = new JButton("Alterar");
       btnAlterar.setBounds(110, 25, 90, 27);       
       btnAlterar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/alterar2.png"));
       btnAlterar.setHorizontalTextPosition(SwingConstants.RIGHT);
       btnAlterar.setFont(new Font("Arial", 1, 13));
        
       painelContas.add(btnAlterar);
       
       
          //------------BOTAO PESQUISAR  ---------------------//
       
       btnExcluir = new JButton("Excluir");
       btnExcluir.setBounds(210, 25, 90, 27);       
       btnExcluir.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/excluir2.png"));
      btnExcluir.setHorizontalTextPosition(SwingConstants.RIGHT);
       btnExcluir.setFont(new Font("Arial", 1, 13));
        
       painelContas.add(btnExcluir);
        
        //-------------------------------------------------------------------//
        
        
          lblTotalPago = new JLabel("Total Pago");
        lblTotalPago.setBounds(850, 330, 135, 22);
        lblTotalPago.setHorizontalAlignment(JLabel.RIGHT);
        painelPrincipal.add(lblTotalPago);   
        
         txtTotalPago = new JTextField();
        txtTotalPago.setBounds(850, 350, 140, 22);
        painelPrincipal.add(txtTotalPago);
        
     //-------------------------------------------------------------------// 
     
     
         lblTotalReceber = new JLabel("Total a Receber");
        lblTotalReceber.setBounds(850, 380, 135, 22);
        lblTotalReceber.setHorizontalAlignment(JLabel.RIGHT);
        painelPrincipal.add(lblTotalReceber);   
        
         txtTotalReceber = new JTextField();
        txtTotalReceber.setBounds(850, 400, 140, 22);
        painelPrincipal.add(txtTotalReceber);
     //-------------------------------------------------------------------//  
     
         lblTotalGeral = new JLabel("Total Geral");
        lblTotalGeral.setBounds(850, 430, 135, 22);
        lblTotalGeral.setHorizontalAlignment(JLabel.RIGHT );
        painelPrincipal.add(lblTotalGeral);   
        
         txtTotalGeral = new JTextField();
        txtTotalGeral.setBounds(850, 450, 140, 22);
        painelPrincipal.add(txtTotalGeral);
        
        
        
        btnVisualizar = new JButton("Visualizar");
        btnVisualizar.setBounds(700, 470, 105, 35);
        btnVisualizar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/visualizar.png"));
        btnVisualizar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnVisualizar.setFont(new Font("Arial", 1, 13));
        btnVisualizar.addActionListener((java.awt.event.ActionEvent evt)->{
            
        });
        painelPrincipal.add(btnVisualizar);
         
        btnPesquisar = new JButton("Pesquisar");
        btnPesquisar.setBounds(590, 470, 105, 35);
        btnPesquisar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/procurar.png"));
        btnPesquisar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnPesquisar.setFont(new Font("Arial", 1, 13));
        btnPesquisar.addActionListener((java.awt.event.ActionEvent evt) -> {  
           
        });
        painelPrincipal.add(btnPesquisar);
        
        
         //----------------------------------------------------------------------------//
          painelContas = new JPanel();
        painelContas.setLayout(null);
        painelContas.setSize(100, 120);
        painelContas.setLocation(440, 390);
        painelContas.setBorder(BorderFactory.createTitledBorder("Contas Pagar"));
        painelPrincipal.add(painelContas);
        
        
        
     //------------------------------------------------------------------------------------//   
        
        rdTodas = new JRadioButton("Todas");
        rdTodas.setBounds(10, 20, 80, 22);
        rdTodas.setFont(new Font("Arial", 0, 11));
        painelContas.add(rdTodas);
        
        
         rdJuridica = new JRadioButton("Juridica");
        rdJuridica.setBounds(10, 50, 80, 22);
        rdJuridica.setFont(new Font("Arial", 0, 11));
        painelContas.add(rdJuridica);
        
        rdFisica = new JRadioButton("Fisica");
        rdFisica.setBounds(10, 80, 80, 22);
        rdFisica.setFont(new Font("Arial", 0, 11));
        painelContas.add(rdFisica);
        
        groupContas = new ButtonGroup();
        groupContas.add(rdTodas);
        groupContas.add(rdJuridica); 
        groupContas.add(rdFisica); 
        
        
        
        criarTabela();
        janela.add(painelPrincipal);
        janela.setVisible(true);
     }
     
      
    private void criarTabela() {
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        modelo.addColumn("C.I");
        modelo.addColumn("Vencimento");
        modelo.addColumn("Cod For");
        modelo.addColumn("Fornecedor");
        modelo.addColumn("Valor");
        modelo.addColumn("Data Baixa");
         modelo.addColumn("Tipo de Gasto");
        modelo.addColumn("Observação");
       
       

        tblPagar = new JTable();
        tblPagar.setModel(modelo);
        tblPagar.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblPagar.getColumnModel().getColumn(1).setPreferredWidth(80);
        tblPagar.getColumnModel().getColumn(2).setPreferredWidth(60);
        tblPagar.getColumnModel().getColumn(3).setPreferredWidth(300);
        tblPagar.getColumnModel().getColumn(4).setPreferredWidth(80);
        tblPagar.getColumnModel().getColumn(5).setPreferredWidth(80);
        tblPagar.getColumnModel().getColumn(6).setPreferredWidth(160);
        tblPagar.getColumnModel().getColumn(7).setPreferredWidth(170);
       

        tblPagar.getTableHeader().setResizingAllowed(false);
        tblPagar.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblPagar.getTableHeader();
        cabecalho.setFont(new Font("Arial", 0, 12));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblPagar.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblPagar.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        tblPagar.getColumnModel().getColumn(2).setCellRenderer(centralizaColunas);
        tblPagar.getColumnModel().getColumn(3).setCellRenderer(centralizaColunas);

        tblPagar.setFont(new Font("Arial", 0, 12));

        scrollTable = new JScrollPane(tblPagar,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(10, 20, 985, 280);
        tblPagar.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelPrincipal.add(scrollTable);
    }
    
    
    private void CriarNovo() throws ParseException {
        
        
        
          janelaNovo = new JFrame("");
        janelaNovo.setSize(360, 330);
        janelaNovo.setLayout(null);
        janelaNovo.setResizable(false);
        janelaNovo.setLocationRelativeTo(null);
        
        
    
        painelNovo = new JPanel();
        painelNovo.setLayout(null);
        painelNovo.setSize(340, 290);
        painelNovo.setLocation(5, 5);
        painelNovo.setBorder(BorderFactory.createTitledBorder(""));
 //------------------------------------------------------------------------------------//
 
 
 
      lblData = new JLabel("Data");
        lblData.setBounds(10, 20, 80, 22);
        painelNovo.add(lblData);
        
        
         txtData = new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtData.setBounds(10, 40, 80, 22);
        painelNovo.add(txtData);
    
  //---------------------------------------------------------------------------------------------//      
        
        lblVencimento = new JLabel("Vencimento");
        lblVencimento.setBounds(100, 20, 80, 22);
        painelNovo.add(lblVencimento);
        
        
         txtVencimento = new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtVencimento.setBounds(100, 40, 80, 22);
        painelNovo.add(txtVencimento);
        
        
        
         //---------------------------------------------------------------------------------------------//      
        
        lblFornecedorNovo = new JLabel("Fornecedor");
        lblFornecedorNovo.setBounds(10, 60, 80, 22);
        painelNovo.add(lblFornecedorNovo);
        
        
         txtFornecedorNovo = new JTextField();
        txtFornecedorNovo.setBounds(10, 80, 250, 22);
        painelNovo.add(txtFornecedorNovo);
        
        
          txtCodFornecedorNovo = new JTextField();
        txtCodFornecedorNovo.setBounds(265, 80, 40, 22);
        painelNovo.add(txtCodFornecedorNovo);
        
               
       btnConsultaForn = new JButton();
       btnConsultaForn.setBounds(310, 80, 22, 22);       
       btnConsultaForn.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
       btnConsultaForn.setToolTipText("Pesquisar Fornecedor");
       btnConsultaForn.setHorizontalTextPosition(SwingConstants.CENTER);
        
       painelNovo.add(btnConsultaForn);
        
    //---------------------------------------------------------------------------------------//    
        
     lblTotalPagar = new JLabel("Total a Pagar");
        lblTotalPagar.setBounds(10, 100, 80, 22);
        painelNovo.add(lblTotalPagar);
        
        
         txtTotalPagar = new JTextField();
        txtTotalPagar.setBounds(10, 120, 100, 22);
        painelNovo.add(txtTotalPagar);    
    
    
    
    
     //---------------------------------------------------------------------------------------//    
        
     lblObservacao = new JLabel("Observação");
        lblObservacao.setBounds(10, 140, 80, 22);
        painelNovo.add(lblObservacao);
        
        
         txtObservacao = new JTextField();
        txtObservacao.setBounds(10, 160, 310, 80);
        painelNovo.add(txtObservacao);    
    
    //--------------------------------------------------------------------------------------//
    
      // ---------------- BOTAO GRAVAR-----//
        btnSalvarNovo = new JButton("Gravar");
        btnSalvarNovo.setBounds(50, 250, 100, 30);  
        btnSalvarNovo.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));
        btnSalvarNovo.setFont(new Font("Arial", 1, 13));
       btnSalvarNovo.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelNovo.add(btnSalvarNovo);
       
       
       
       
       //--------------------------------------------------------------------------------------//
    
      // ---------------- BOTAO GRAVAR-----//
        btnSairNovo = new JButton("Sair");
        btnSairNovo.setBounds(180, 250, 100, 30);  
        btnSairNovo.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/sair.png"));
        btnSairNovo.setFont(new Font("Arial", 1, 13));
       btnSairNovo.setHorizontalTextPosition(SwingConstants.RIGHT);
       btnSairNovo.addActionListener((java.awt.event.ActionEvent evt) -> {
            janela.dispose();
        });
        
       painelNovo.add(btnSairNovo);
    
        
        janelaNovo.add(painelNovo);
        janelaNovo.setVisible(true);
        
    }
    
    
}

