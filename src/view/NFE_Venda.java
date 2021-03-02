
package view;

import java.awt.Color;
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

public class NFE_Venda {
    
    
    private JFrame janela;
    private JPanel painelPrincipal, painelData, painelCliente, painelTipo, painelProduto;
    private JLabel lblData, lblNF, lblCliente, lblPreco, lblEmitente, lblVendedor, lblParcela, lblCI, lblChaveNFE;
    private JTextField txtNF, txtCliente, txtCodCliente, txtPreco, txtParcela, txtCI, txtChaveNFE;
    private JFormattedTextField txtData;
    private JComboBox cbEmitente, cbVendedor;
    private JRadioButton rdVenda, rdTroca, rdDevolucao, rdTransferencia, rdOutras, rdEntrada, rdComplem, rdEntradaDev;
    private ButtonGroup grupTipo;
     private JTable tblProduto;
    private JScrollPane scrollTable;
    private DefaultTableModel modelo;
    private JLabel lblProduto, lblQuantidade, lblValorUnitario, lblValorTotal,lblEstoque;
    private JTextField txtProduto, txtCodProduto,txtQuantidade, txtValorUnitario, txtValorTotal, txtEstoque;
    private JButton btnGravaProd, btnCancelaProd, btnNovo, btnAlterarProd, btnExcluirProd, btnConsultaProduto;
    private JButton btnGravarNFE, btnConsultarNotas, btnCancelarNFE, btnSair;
    
    
    private JButton btnConsultaCliente, btnPedidos;
    
      public void desenharTela() throws ParseException {

        janela = new JFrame("NF-e Venda");
        janela.setSize(1035, 690);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
              
//----------------------------------------------------------------------------//


        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(1015, 650);
        painelPrincipal.setLocation(5, 5);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
            

  //---------------------------------------------------------------------------//  
  
  
  
  
        painelData = new JPanel();
        painelData.setLayout(null);
        painelData.setSize(110, 170);
        painelData.setLocation(5, 13);
        painelData.setBorder(BorderFactory.createTitledBorder(""));
        painelPrincipal.add(painelData);
  
  
  //---------------------------------------------------------------------------//
  
  
         lblData= new JLabel("Data");
         lblData.setBounds(10, 10, 80, 22);
         painelData.add(lblData);
         
         txtData =new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
         txtData.setBounds(10, 30, 80, 22);
         painelData.add(txtData);
         
 //---------------------------------------------------------------------------//
 
 
 
         lblNF= new JLabel("N.F");
         lblNF.setBounds(10, 60, 80, 22);
         painelData.add(lblNF);
 
          txtNF= new JTextField();
          txtNF. setBounds(10, 80, 80, 22);
          painelData.add(txtNF);
 
 
 
  //---------------------------------------------------------------------------//  
  
  
  
  
        painelCliente = new JPanel();
        painelCliente.setLayout(null);
        painelCliente.setSize(600, 170);
        painelCliente.setLocation(120, 13);
        painelCliente.setBorder(BorderFactory.createTitledBorder(""));
        painelPrincipal.add(painelCliente);
  
  
  //---------------------------------------------------------------------------//
 
 
 
         lblCliente= new JLabel("Cliente");
         lblCliente.setBounds(10, 10, 80, 22);
         painelCliente.add(lblCliente);
 
          txtCliente= new JTextField();
          txtCliente. setBounds(10, 30, 250, 22);
          painelCliente.add(txtCliente);
 
 
          txtCodCliente= new JTextField();
          txtCodCliente. setBounds(265, 30, 50, 22);
          painelCliente.add(txtCodCliente);
 
      
         
    
       btnConsultaCliente = new JButton();
       btnConsultaCliente.setBounds(320, 30, 24, 24);       
       btnConsultaCliente.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
       btnConsultaCliente.setToolTipText("Pesquisar Cliente");
       btnConsultaCliente.setHorizontalTextPosition(SwingConstants.CENTER);
        
       painelCliente.add(btnConsultaCliente);
 
 
 
 
 
 //---------------------------------------------------------------------------//
 
  
         lblPreco= new JLabel("Preço");
         lblPreco.setBounds(350, 10, 80, 22);
         painelCliente.add(lblPreco);
 
          txtPreco= new JTextField();
          txtPreco. setBounds(350, 30, 40, 22);
          painelCliente.add(txtPreco);
 
 
 
 //---------------------------------------------------------------------------//
 
  
         lblEmitente= new JLabel("Empresa Emitente");
         lblEmitente.setBounds(400, 10, 130, 22);
         painelCliente.add(lblEmitente);
 
          cbEmitente= new JComboBox();
          cbEmitente. setBounds(400, 30, 170, 22);
          painelCliente.add(cbEmitente);
 
 
  //---------------------------------------------------------------------------//
 
  
         lblVendedor= new JLabel("Vendedor");
         lblVendedor.setBounds(10, 60, 130, 22);
         painelCliente.add(lblVendedor);
 
          cbVendedor= new JComboBox();
          cbVendedor. setBounds(10, 80, 150, 22);
          painelCliente.add(cbVendedor);
 
 
 //---------------------------------------------------------------------------//
 
  
         lblParcela= new JLabel("Parcelas:");
         lblParcela.setBounds(180, 80, 80, 22);
         painelCliente.add(lblParcela);
 
          txtParcela= new JTextField();
          txtParcela. setBounds(240, 80, 40, 22);
          painelCliente.add(txtParcela);
 
 //---------------------------------------------------------------------------//
 
  
         lblCI= new JLabel("C.I:");
         lblCI.setBounds(325, 80, 60, 22);
         painelCliente.add(lblCI);
 
          txtCI= new JTextField();
          txtCI. setBounds(350, 80, 80, 22);
          painelCliente.add(txtCI);
 
 //---------------------------------------------------------------------------------------//
 
 
 
       btnPedidos = new JButton("Pedidos");
       btnPedidos.setBounds(470, 78, 90, 25); 
       btnPedidos.setHorizontalTextPosition(SwingConstants.CENTER);
       btnPedidos.setFont(new Font("arial",1,12));
        
       painelCliente.add(btnPedidos);
 
 
       
       
       //---------------------------------------------------------------------------//
 
  
         lblChaveNFE= new JLabel("Chave NF-e Referenciada");
         lblChaveNFE.setBounds(10, 110, 150, 22);
         painelCliente.add(lblChaveNFE);
 
          txtChaveNFE= new JTextField();
          txtChaveNFE. setBounds(10, 130, 400, 22);
          painelCliente.add(txtChaveNFE);
 
 //---------------------------------------------------------------------------------------//
       
       
       
          //-------------------------------------------------------------------------------//  
        painelTipo = new JPanel();
        painelTipo.setLayout(null);
        painelTipo.setBorder(BorderFactory.createTitledBorder("Pesquisa por:"));
        painelTipo.setSize(275, 181);
        painelTipo.setLocation(720, 4);

        rdVenda = new JRadioButton("Venda");
        rdVenda.setBounds(8, 25, 120, 17);
        rdVenda.setFont(new Font("Arial", 0, 12));
        painelTipo.add(rdVenda);
//---------------------------------------------------------------------------------------//

        rdTroca = new JRadioButton("Troca");
        rdTroca.setBounds(8, 60, 120, 17);
        rdTroca.setFont(new Font("Arial", 0, 12));
        painelTipo.add(rdTroca);
  //---------------------------------------------------------------------------------------//
  
        rdDevolucao = new JRadioButton("Devolução");
        rdDevolucao.setBounds(8, 95, 120, 17);
        rdDevolucao.setFont(new Font("Arial", 0, 12));
        painelTipo.add(rdDevolucao);

 //---------------------------------------------------------------------------------------//
  
        rdTransferencia = new JRadioButton("Tranferencia");
        rdTransferencia.setBounds(8, 130, 120, 17);
        rdTransferencia.setFont(new Font("Arial", 0, 12));
        painelTipo.add(rdTransferencia);
        
        
      //------------------------------------------------------------------------------------//       
        
        
          rdOutras = new JRadioButton("Outras");
        rdOutras.setBounds(130, 25, 120, 17);
        rdOutras.setFont(new Font("Arial", 0, 12));
        painelTipo.add(rdOutras);
//---------------------------------------------------------------------------------------//

        rdEntrada = new JRadioButton("Entrada");
        rdEntrada.setBounds(130, 60, 120, 17);
        rdEntrada.setFont(new Font("Arial", 0, 12));
        painelTipo.add(rdEntrada);
  //---------------------------------------------------------------------------------------//
  
        rdComplem = new JRadioButton("Complem");
        rdComplem.setBounds(130, 95, 120, 17);
        rdComplem.setFont(new Font("Arial", 0, 12));
        painelTipo.add(rdComplem);

 //---------------------------------------------------------------------------------------//
  
        rdEntradaDev = new JRadioButton("Entrada/Devolução");
        rdEntradaDev.setBounds(130, 130, 140, 17);
        rdEntradaDev.setFont(new Font("Arial", 0, 12));
        painelTipo.add(rdEntradaDev);
        
//---------------------------------------------------------------------------------------//



        grupTipo = new ButtonGroup();
        grupTipo.add(rdVenda);
        grupTipo.add(rdTroca);
        grupTipo.add(rdDevolucao);
        grupTipo.add(rdTransferencia);        
        grupTipo.add(rdOutras);
        grupTipo.add(rdEntrada);
        grupTipo.add(rdComplem);
        grupTipo.add(rdEntradaDev);

        painelPrincipal.add(painelTipo);
        //-------------------------------------------------------------------------------//    
       
       
       
       
        
         
        painelProduto = new JPanel();
        painelProduto.setLayout(null);
        painelProduto.setSize(990, 100);
        painelProduto.setLocation(5, 480);
        painelProduto.setBorder(BorderFactory.createTitledBorder(""));
        painelPrincipal.add(painelProduto);
        
        
        lblProduto = new JLabel("Produto ");
        lblProduto.setBounds(13, 10, 60, 22);
        painelProduto.add(lblProduto);
        
        
         txtProduto = new JTextField();
        txtProduto.setBounds(10, 30, 400, 22);
        painelProduto.add(txtProduto);
        
        txtCodProduto = new JTextField();
        txtCodProduto.setBounds(420, 30, 50, 22);
        painelProduto.add(txtCodProduto);
        
        
       btnConsultaProduto = new JButton();
       btnConsultaProduto.setBounds(475, 28, 24, 24);       
       btnConsultaProduto.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
       btnConsultaProduto.setToolTipText("Pesquisar Produto");
       btnConsultaProduto.setHorizontalTextPosition(SwingConstants.CENTER);
        
       painelProduto.add(btnConsultaProduto);
        
        
         lblQuantidade = new JLabel("Quantidade");
        lblQuantidade.setBounds(520, 10, 70, 22);
        painelProduto.add(lblQuantidade);
        
        
         txtQuantidade = new JTextField();
        txtQuantidade.setBounds(520, 30, 80, 22);
        painelProduto.add(txtQuantidade);
        
        
          //-------------------------------------------------------------//   
         lblValorUnitario = new JLabel(" Vlr Unitário ");
        lblValorUnitario.setBounds(610, 10, 80, 22);
        painelProduto.add(lblValorUnitario);
        
         txtValorUnitario = new JTextField();
        txtValorUnitario.setBounds(610, 30, 80, 22);
        painelProduto.add(txtValorUnitario);
        
        //-------------------------------------------------------------// 
         lblValorUnitario = new JLabel(" Valor Total ");
        lblValorUnitario.setBounds(710, 10, 80, 22);
        painelProduto.add(lblValorUnitario);
   
        
         txtValorUnitario = new JTextField();
        txtValorUnitario.setBounds(710, 30, 80, 22);
        painelProduto.add(txtValorUnitario);
        
         //-------------------------------------------------------------// 
         lblEstoque = new JLabel("Qtd.Estoque:");
        lblEstoque.setBounds(810, 30, 80, 22);
        lblEstoque.setFont( new Font("Arial",1,12));
        lblEstoque.setForeground(Color.red);
        painelProduto.add(lblEstoque);
   
        
         txtEstoque = new JTextField();
        txtEstoque.setBounds(890, 30, 80, 22);
        txtEstoque.setForeground(Color.red);
        txtEstoque.setEditable(false);
        painelProduto.add(txtEstoque);
        
        
        
        // ---------------- BOTAO GRAVAR-----//
       btnGravaProd = new JButton("Gravar");
       btnGravaProd.setBounds(10, 60, 90, 30);  
      btnGravaProd.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));       
       btnGravaProd.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnGravaProd.setFont(new Font("Arial", 1, 13));
        btnGravaProd.addActionListener((java.awt.event.ActionEvent evt) -> { 
           
                       
        });       
      
        
       painelProduto.add(btnGravaProd);
       
 //-------------------------------------------------------------------------------------------------------------------//
 
 
        // ---------------- BOTAO GRAVAR-----//
       btnCancelaProd = new JButton("Cancelar Prod");
       btnCancelaProd.setBounds(110,60, 90, 30);  
       btnCancelaProd.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));       
       btnCancelaProd.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnCancelaProd.setFont(new Font("Arial", 1, 13));
        btnCancelaProd.addActionListener((java.awt.event.ActionEvent evt) -> {
           
        });
        
       painelProduto.add(btnCancelaProd);
       
  //-------------------------------------------------------------------------------------------------------------------//
  
  
         // ---------------- BOTAO GRAVAR-----//
       btnNovo = new JButton("Novo");
       btnNovo.setBounds(210, 60, 90, 30);  
      btnNovo.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/incluir.png"));       
       btnNovo.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnNovo.setFont(new Font("Arial", 1, 13));
        btnNovo.addActionListener((java.awt.event.ActionEvent evt) -> {
           
        });
        
       painelProduto.add(btnNovo);
       
   //-------------------------------------------------------------------------------------------------------------------//
   
   
        // ---------------- BOTAO GRAVAR-----//
       btnAlterarProd = new JButton("Alterar");
       btnAlterarProd.setBounds(310, 60, 90, 30);  
       btnAlterarProd.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/alterar2.png"));       
       btnAlterarProd.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnAlterarProd.setFont(new Font("Arial", 1, 13));
        btnAlterarProd.addActionListener((java.awt.event.ActionEvent evt) -> {
           
        });
        
       painelProduto.add(btnAlterarProd);
    //-------------------------------------------------------------------------------------------------------------------//
    
    
        btnExcluirProd = new JButton("Excluir");
       btnExcluirProd.setBounds(410, 60, 90, 30);  
       btnExcluirProd.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/excluir2.png"));       
       btnExcluirProd.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnExcluirProd.setFont(new Font("Arial", 1, 13));
        btnExcluirProd.addActionListener((java.awt.event.ActionEvent evt) -> {
           
        });
        
       painelProduto.add(btnExcluirProd);
        
       //-------------------------------------------------------------------------------------------------//
       
       
       
       
        // ---------------- BOTAO GRAVAR-----//
        btnGravarNFE = new JButton("Gravar N.F");
        btnGravarNFE.setBounds(250, 600, 130, 40);
        btnGravarNFE.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar.png"));
        btnGravarNFE.setFont(new Font("Arial", 1, 13));
        btnGravarNFE.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnGravarNFE.addActionListener((java.awt.event.ActionEvent evt) -> {
           
        });
        painelPrincipal.add(btnGravarNFE);
        
        
          
        // ---------------- BOTAO GRAVAR-----//
        btnConsultarNotas = new JButton("Consultar N.F");
        btnConsultarNotas.setBounds(400, 600, 130, 40);
        btnConsultarNotas.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/procurar.png"));
        btnConsultarNotas.setFont(new Font("Arial", 1, 13));
        btnConsultarNotas.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnConsultarNotas.addActionListener((java.awt.event.ActionEvent evt) -> {
           
            Consulta_NFE ConsultNFE = new Consulta_NFE();
            try {
                ConsultNFE.desenharTela();
            } catch (ParseException ex) {
                Logger.getLogger(NFE_Venda.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        painelPrincipal.add(btnConsultarNotas);

        // ---------------- BOTAO CANCELAR-----//
        btnCancelarNFE = new JButton("Cancelar N.F");
        btnCancelarNFE.setBounds(550, 600, 125, 40);
        btnCancelarNFE.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar.png"));
        btnCancelarNFE.setFont(new Font("Arial", 1, 13));
        btnCancelarNFE.setHorizontalTextPosition(SwingConstants.RIGHT);
         btnCancelarNFE.addActionListener((java.awt.event.ActionEvent evt) -> {
           
        });

        painelPrincipal.add(btnCancelarNFE);

        // ---------------- BOTAO SAIR-----//
        btnSair = new JButton("Sair");
        btnSair.setBounds(700, 600, 110, 40);
        btnSair.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/sair2.png"));
        btnSair.setFont(new Font("Arial", 1, 13));
        btnSair.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnSair.addActionListener((java.awt.event.ActionEvent evt) -> {
            janela.dispose();
        });
        painelPrincipal.add(btnSair);
       
       
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

        modelo.addColumn("Produto");
        modelo.addColumn("Descrição Produto");
        modelo.addColumn("C. Estoque");
        modelo.addColumn("Quantidade");
        modelo.addColumn("Vlr Unitário");
        modelo.addColumn("Vlr Total");
        modelo.addColumn("Sit Trib");
        modelo.addColumn("NCM");
        modelo.addColumn("CFOP");
        modelo.addColumn("ICMS Base");
        modelo.addColumn("ICMS Valor");
        modelo.addColumn("Uni");
        modelo.addColumn("Vlr Desconto");
        modelo.addColumn("CST PIS");
        modelo.addColumn("% Pis");
        modelo.addColumn("CST CONFIS");
        modelo.addColumn("CONFIS");
        
        
       

        tblProduto = new JTable();
        tblProduto.setModel(modelo);
        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(350);
        tblProduto.getColumnModel().getColumn(2).setPreferredWidth(100);
        tblProduto.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblProduto.getColumnModel().getColumn(4).setPreferredWidth(100);
        tblProduto.getColumnModel().getColumn(5).setPreferredWidth(100);
        tblProduto.getColumnModel().getColumn(6).setPreferredWidth(100);
        tblProduto.getColumnModel().getColumn(7).setPreferredWidth(100);
        tblProduto.getColumnModel().getColumn(8).setPreferredWidth(100);
        tblProduto.getColumnModel().getColumn(9).setPreferredWidth(100);
        tblProduto.getColumnModel().getColumn(10).setPreferredWidth(100);
        tblProduto.getColumnModel().getColumn(11).setPreferredWidth(100);
        tblProduto.getColumnModel().getColumn(12).setPreferredWidth(100);
        tblProduto.getColumnModel().getColumn(13).setPreferredWidth(100);
        tblProduto.getColumnModel().getColumn(14).setPreferredWidth(100);
        tblProduto.getColumnModel().getColumn(15).setPreferredWidth(100);
        tblProduto.getColumnModel().getColumn(16).setPreferredWidth(100);
       

        tblProduto.getTableHeader().setResizingAllowed(false);
        tblProduto.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblProduto.getTableHeader();
        cabecalho.setFont(new Font("Arial", 0, 12));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblProduto.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblProduto.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        tblProduto.getColumnModel().getColumn(2).setCellRenderer(centralizaColunas);
        tblProduto.getColumnModel().getColumn(3).setCellRenderer(centralizaColunas);

        tblProduto.setFont(new Font("Arial", 0, 12));

        scrollTable = new JScrollPane(tblProduto,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(5, 190, 990, 280);
        tblProduto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelPrincipal.add(scrollTable);
    }
    
}
