
package view;

import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.text.MaskFormatter;


public class Sacaria_Entrada {
    
    private JFrame janela;
    private JPanel painelPrincipal, painelEstoque;
    private JLabel lblData, lblDataEntrada, lblFornecedor,lblEntradaNun, lblNumeroNota, lblParcela, lblEstoque;
    private JTextField  txtDataEntrada, txtFornecedor, txtCodFornecedor, txtEntradaNun, txtNumeroNota, txtParcela, txtQTDEstoque;
    private JButton btnConsultaFornecedor, btnGravarSacaria, btnAlterarSacaria, btnCancelarSacaria, btnExcluir;
     private JButton btnSair, btnCancelar, btnGravar, btnConsultar;
    private JComboBox cbEstoque;
    private JTable tblEstoque;
    private JScrollPane scrollTable;
    private DefaultTableModel modelo;
    private JCheckBox cbParcela;
    private JLabel lblDescricao, lblQuantidade, lblVlrUnitario, lblValorTotal, lblCodigo, lblTotalGeral;
    private JTextField txtDescricao, txtCodigo, txtQuantidade, txtVlrUnitario, txtValorTotal, txtTotalGeral;
   private JFormattedTextField txtData;
    
    
 public void desenharTela() throws ParseException {

        janela = new JFrame("Entrada de Sacarias");
        janela.setSize(970, 575);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);

        
        
        
        
       

        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(950, 530);
        painelPrincipal.setLocation(7, 5);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));


    
     //-------------------------------------------------------------------------------------------//   
        
         lblData =new JLabel();
        lblData.setBounds(10, 20, 60, 22);
        painelPrincipal.add(lblData);
        
        txtData =new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtData.setBounds(10, 40, 80, 22);
        painelPrincipal.add(txtData);
        
        
        
         //-------------------------------------------------------------------------------------------//   
        
         lblDataEntrada = new JLabel("Data Entrada ");
        lblDataEntrada.setBounds(100, 20, 120, 22);
        painelPrincipal.add(lblDataEntrada);
        
        txtDataEntrada = new JTextField();
        txtDataEntrada.setBounds(100, 40, 80, 22);
        painelPrincipal.add(txtDataEntrada);
        
        
        
         //-------------------------------------------------------------------------------------------//   
        
         lblFornecedor = new JLabel("Fornecedor");
        lblFornecedor.setBounds(190, 20, 120, 22);
        painelPrincipal.add(lblFornecedor);
        
        txtFornecedor = new JTextField();
        txtFornecedor.setBounds(190, 40, 250, 22);
        painelPrincipal.add(txtFornecedor);
        
        txtCodFornecedor = new JTextField();
        txtCodFornecedor.setBounds(445, 40, 40, 22);
        painelPrincipal.add(txtCodFornecedor);
      //----------------------------------------------//  
        
      btnConsultaFornecedor = new JButton();
       btnConsultaFornecedor.setBounds(490, 40, 20, 20);       
       btnConsultaFornecedor.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
       btnConsultaFornecedor.setToolTipText("Pesquisar Fornecedor");
       btnConsultaFornecedor.setHorizontalTextPosition(SwingConstants.CENTER);
        btnConsultaFornecedor.addActionListener((java.awt.event.ActionEvent evt) -> {  
           
           ConsultaFornecedor_Simplificada consult = new ConsultaFornecedor_Simplificada();
           consult.desenharTela();
        });
        
       painelPrincipal.add(btnConsultaFornecedor);

       
        //-------------------------------------------------------------------------------------------//   
        
         lblEntradaNun = new JLabel("Entrada N°");
        lblEntradaNun.setBounds(520, 20, 120, 22);
        painelPrincipal.add(lblEntradaNun);
        
        txtEntradaNun = new JTextField();
        txtEntradaNun.setBounds(520, 40, 100, 22);
        painelPrincipal.add(txtEntradaNun);
        
        
          //-------------------------------------------------------------------------------------------//   
        
         lblNumeroNota = new JLabel("Número Nota");
        lblNumeroNota.setBounds(630, 20, 120, 22);
        painelPrincipal.add(lblNumeroNota);
        
        txtNumeroNota = new JTextField();
        txtNumeroNota.setBounds(630, 40, 100, 22);
        painelPrincipal.add(txtNumeroNota);
        
          //-------------------------------------------------------------------------------------------//   
        
         lblParcela = new JLabel("Parcela");
        lblParcela.setBounds(740, 20, 120, 22);
        painelPrincipal.add(lblParcela);
        
        txtParcela = new JTextField();
        txtParcela.setBounds(740, 40, 50, 22);
        painelPrincipal.add(txtParcela);
        
        
         
        cbParcela = new JCheckBox("Recalcular Parcela");
        cbParcela.setBounds(800, 35, 140, 22);
        painelPrincipal.add(cbParcela);
       
       //------------------------------------------------------------------------------------------------//
       
       
       
        painelEstoque = new JPanel();
        painelEstoque.setLayout(null);
        painelEstoque.setSize(930, 350);
        painelEstoque.setLocation(10, 80);
        painelEstoque.setBorder(BorderFactory.createTitledBorder(""));
        painelPrincipal.add(painelEstoque);

          //-------------------------------------------------------------------------------------------//   
        
         lblEstoque = new JLabel("Estoque:");
        lblEstoque.setBounds(10, 10, 120, 22);
        painelEstoque.add(lblEstoque);
        
        cbEstoque = new JComboBox();
        cbEstoque.setBounds(65, 10, 140, 22);
        painelEstoque.add(cbEstoque);
        
         txtQTDEstoque = new JTextField();
        txtQTDEstoque.setBounds(210, 10, 40, 22);
        painelEstoque.add(txtQTDEstoque);
       
       //------------------------------------------------------------------------------------------------//
       
       //-------------------------------------------------------------------------------------------//   
        
         lblDescricao = new JLabel("Descrição");
        lblDescricao.setBounds(10, 260, 120, 22);
        painelEstoque.add(lblDescricao);
        
              
         txtDescricao = new JTextField();
        txtDescricao.setBounds(10, 280, 250, 22);
        painelEstoque.add(txtDescricao);
       
       //------------------------------------------------------------------------------------------------//
       
       
         //-------------------------------------------------------------------------------------------//   
        
         lblCodigo = new JLabel("Código");
        lblCodigo.setBounds(270, 260, 120, 22);
        painelEstoque.add(lblCodigo);
        
              
         txtCodigo = new JTextField();
        txtCodigo.setBounds(270, 280, 50, 22);
        painelEstoque.add(txtCodigo);
       
       //------------------------------------------------------------------------------------------------//
        
        
        //-------------------------------------------------------------------------------------------//   
        
         lblQuantidade = new JLabel("Quantidade");
        lblQuantidade.setBounds(340, 260, 120, 22);
        painelEstoque.add(lblQuantidade);
        
              
         txtQuantidade = new JTextField();
        txtQuantidade.setBounds(340, 280, 70, 22);
        painelEstoque.add(txtQuantidade);
       
       //------------------------------------------------------------------------------------------------//
        
        
       
         //-------------------------------------------------------------------------------------------//   
        
         lblVlrUnitario = new JLabel("Vlr Unitário");
        lblVlrUnitario.setBounds(420, 260, 120, 22);
        painelEstoque.add(lblVlrUnitario);
        
              
         txtVlrUnitario = new JTextField();
        txtVlrUnitario.setBounds(420, 280, 70, 22);
        painelEstoque.add(txtVlrUnitario);
       
       //------------------------------------------------------------------------------------------------//
        
       
       
       
         //-------------------------------------------------------------------------------------------//   
        
         lblValorTotal = new JLabel("Vlr Total");
        lblValorTotal.setBounds(500, 260, 120, 22);
        painelEstoque.add(lblValorTotal);
        
              
         txtValorTotal = new JTextField();
        txtValorTotal.setBounds(500, 280, 70, 22);
        painelEstoque.add(txtValorTotal);
       
     //-------------------------------------------------------------------------------------------// 
        btnGravarSacaria = new JButton("Gravar");
       btnGravarSacaria.setBounds(10, 320, 100, 27);       
       btnGravarSacaria.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));       
       btnGravarSacaria.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnGravarSacaria.setFont(new Font("Arial", 1, 13));
        
       painelEstoque.add(btnGravarSacaria);
   //-------------------------------------------------------------------------------------------//    
       
       
         //-------------------------------------------------------------------------------------------// 
        btnCancelarSacaria = new JButton("Cancelar");
       btnCancelarSacaria.setBounds(120, 320, 100, 27);       
       btnCancelarSacaria.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));      
       btnCancelarSacaria.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnCancelarSacaria.setFont(new Font("Arial", 1, 13));
        
       painelEstoque.add(btnCancelarSacaria);
   //-------------------------------------------------------------------------------------------//  
   
   
    //-------------------------------------------------------------------------------------------// 
        btnAlterarSacaria = new JButton("Alterar");
       btnAlterarSacaria.setBounds(230, 320, 100, 27);       
       btnAlterarSacaria.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/alterar2.png"));      
       btnAlterarSacaria.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnAlterarSacaria.setFont(new Font("Arial", 1, 13));
        
       painelEstoque.add(btnAlterarSacaria);
   //-------------------------------------------------------------------------------------------//  
       
        //-------------------------------------------------------------------------------------------// 
        btnExcluir = new JButton("Excluir");
       btnExcluir.setBounds(340, 320, 100, 27);       
       btnExcluir.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/excluir2.png"));      
       btnExcluir.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnExcluir.setFont(new Font("Arial", 1, 13));
        
       painelEstoque.add(btnExcluir);
   //-------------------------------------------------------------------------------------------// 
       
   //-------------------------------------------------------------------------------------------// 
        btnGravar = new JButton("Gravar");
       btnGravar.setBounds(200, 490, 100, 35);       
       btnGravar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));      
       btnGravar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnGravar.setFont(new Font("Arial", 1, 13));
        
       painelPrincipal.add(btnGravar);
   //-------------------------------------------------------------------------------------------// 
   
   
   //-------------------------------------------------------------------------------------------// 
        btnConsultar = new JButton("Consultar");
       btnConsultar.setBounds(310, 490, 100, 35);       
       btnConsultar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/consulta.png"));      
       btnConsultar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnConsultar.setFont(new Font("Arial", 1, 13));
        
       painelPrincipal.add(btnConsultar);
   //-------------------------------------------------------------------------------------------// 
   
   
   //-------------------------------------------------------------------------------------------// 
        btnCancelar = new JButton("Cancelar");
       btnCancelar.setBounds(420, 490, 100, 35);       
       btnCancelar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));      
       btnCancelar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnCancelar.setFont(new Font("Arial", 1, 13));
        
       painelPrincipal.add(btnCancelar);
   //-------------------------------------------------------------------------------------------// 
   
   
   //-------------------------------------------------------------------------------------------// 
        btnSair = new JButton("Sair");
       btnSair.setBounds(530, 490, 100, 35);       
       btnSair.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/sair.png"));      
       btnSair.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnSair.setFont(new Font("Arial", 1, 13));
        btnSair.addActionListener((java.awt.event.ActionEvent evt) -> { 
           
                        janela.dispose();
        });  
        
       painelPrincipal.add(btnSair);
   //-------------------------------------------------------------------------------------------// 
   
   
   //---------------------------------------------------------------------------------------------//
   
        lblTotalGeral = new JLabel("Total Geral ");
        lblTotalGeral.setBounds(800, 440, 160, 22);
        lblTotalGeral.setFont(new Font("Arial", 1, 20));
        lblTotalGeral.setForeground(Color.red);
        painelPrincipal.add(lblTotalGeral);
        
        txtTotalGeral = new JTextField();
        txtTotalGeral.setBounds(800, 465, 100, 22);
        painelPrincipal.add(txtTotalGeral);
        
        
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

        modelo.addColumn("Código");
        modelo.addColumn("Descrição da Sacaria");
        modelo.addColumn("QTD");
        modelo.addColumn("Vlr Unitario");
        modelo.addColumn("Vlr Total");
     

        tblEstoque = new JTable();
        tblEstoque.setModel(modelo);
        tblEstoque.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblEstoque.getColumnModel().getColumn(1).setPreferredWidth(500);
        tblEstoque.getColumnModel().getColumn(2).setPreferredWidth(100);
        tblEstoque.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblEstoque.getColumnModel().getColumn(4).setPreferredWidth(97);
        

        tblEstoque.getTableHeader().setResizingAllowed(false);
        tblEstoque.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblEstoque.getTableHeader();
        cabecalho.setFont(new Font("Arial", 1, 11));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblEstoque.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblEstoque.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        

        tblEstoque.setFont(new Font("Arial", 0, 11));

        scrollTable = new JScrollPane(tblEstoque,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(10, 50, 900, 200);
        tblEstoque.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelEstoque.add(scrollTable);
    }
     
     
}

