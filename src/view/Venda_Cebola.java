
package view;

import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
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


public class Venda_Cebola {
       
     private JFrame janela, janelaDados, janelaSetor;
    private JPanel painelPrincipal, painelProduto,painelVendedor, painelPagamento, painelDados, painelSetor;
    private JLabel lblData,lblCliente,lblCodCliente,lblCI, lblProduto,lblCodProduto;
    private JTextField txtCliente, txtCodCliente, txtProduto, txtCodProduto;
    private JTable tblProduto,tblSetor, tblSet;
    private JScrollPane scrollTable;
    private DefaultTableModel modelo;
    private JButton btnNovo,btnCancelaProd,btnAlterarProd,btnExcluirProd,btnGravaProd, btnSair, btnCancelar, btnConsultar, btnGravar;
    private JLabel lblVendedor, lblPrazo, lblDataVencimento , lblPrecoFrete, lblAdiantamento, lblSubTotal, lblTotal; 
    private JLabel lblMotorista, lblPlaca, lblBonificacao,lblFrete, lblObservacao,lblDescontoVista, lblValorBonificacao,lblCodMotorista,lblFunRural;
    private JComboBox cbVendedor, cbPrecoFrete,CbBonificacao,cbSetor;
    private JTextField txtPrazo,  txtAdiantamento, txtSubTotal, txtMotorista, txtCodMotorista, txtPlaca, txtFrete;
    private JTextField txtObservacao, txtDescontoVista, txtValorNonificacao, txtFunRural,txtTotal;
    private JButton btnConsultaCliente, btnConsultaMotorista,btnDados, btnSairDados;
    private JRadioButton rdAVista, rdPrazo;
    private ButtonGroup groupPagamento;
    private JFormattedTextField txtData,txtDataVencimento;
    private JLabel lblSacria, lblOutras, lblFreteDestino, lblDescarga, lblComissao, lblDados;
    private JTextField txtSacaria, txtOutras, txtFreteDestino, txtDescarga, txtComissao, txtCI;
    private JLabel lblSetor, lblQtd, lblPrecoUnit, lblValorTotal;
    private JTextField  txtQtd, txtPrecoUnit, txtValorTotal;
    private JButton btnAdicionarSet, btnAlterarSet, btnExcluirSet, btnGravarSet, btnCancelarSet, btnSairSet;
    private JCheckBox cbBonificacao;
    
     public void desenharTela() throws ParseException {

        janela = new JFrame("Vendas Cebola");
      janela.setSize(840, 655);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);



        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(820, 615);
        painelPrincipal.setLocation(5, 5);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        
 //-------------------------------------------------------------------------------------------------------------------//       
        
         lblData = new JLabel("Data ");
        lblData.setBounds(13, 20, 60, 22);
        painelPrincipal.add(lblData);
        
        txtData = new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtData.setBounds(10, 40, 60, 22);
        painelPrincipal.add(txtData);
        
 //-------------------------------------------------------------------------------------------------------------------//
 
 
         lblCliente = new JLabel("Cliente ");
        lblCliente.setBounds(93, 20, 60, 22);
        painelPrincipal.add(lblCliente);
        
        txtCliente = new JTextField();
        txtCliente.setBounds(90, 40, 250, 22);
        painelPrincipal.add(txtCliente);
  //-------------------------------------------------------------------------------------------------------------------//
  
  
         lblCodCliente = new JLabel("Cod.Cliente");
        lblCodCliente.setBounds(350, 20, 120, 22);
        painelPrincipal.add(lblCodCliente);
        
        txtCodCliente = new JTextField();
        txtCodCliente.setBounds(350, 40, 60, 22);
        painelPrincipal.add(txtCodCliente);
        
        
 //--------------------------------------------------------------------------------------//       
         lblCliente = new JLabel("Cliente ");
        lblCliente.setBounds(93, 20, 60, 22);
        painelPrincipal.add(lblCliente);
        
        txtCliente = new JTextField();
        txtCliente.setBounds(90, 40, 250, 22);
        painelPrincipal.add(txtCliente);
 //--------------------------------------------------------------------------------------//       
         lblCodCliente = new JLabel("Cod.Cliente");
        lblCodCliente.setBounds(350, 20, 120, 22);
        painelPrincipal.add(lblCodCliente);
        
        txtCodCliente = new JTextField();
        txtCodCliente.setBounds(350, 40, 60, 22);
        painelPrincipal.add(txtCodCliente);
        
  // ---------------- BOTAO GRAVAR-----//
       btnConsultaCliente = new JButton("");
       btnConsultaCliente.setBounds(415, 40, 22, 22);  
        btnConsultaCliente.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
       btnConsultaCliente.setToolTipText("Pesquisar Cliente");
       btnConsultaCliente.setHorizontalTextPosition(SwingConstants.CENTER);
        btnConsultaCliente.addActionListener((java.awt.event.ActionEvent evt) -> {  
           
           ConsultaCliente_Simplificada consult = new ConsultaCliente_Simplificada();
           consult.desenharTela();
        });
        
       painelPrincipal.add(btnConsultaCliente);
        
        
    //-------------------------------------------------------------------------------------------------------------------//

    
         lblCI = new JLabel("C.I. VDB");
        lblCI.setBounds(450, 20, 120, 22);
        painelPrincipal.add(lblCI);
        
        txtCI = new JTextField();
        txtCI.setBounds(450, 40, 60, 22);
        painelPrincipal.add(txtCI);
    
    
    //----------------------------------------------------------------------------------//
    
    
        //-------------- CRIANDO PAINEL --------------------//
        painelPagamento = new JPanel();
        painelPagamento.setLayout(null);
        painelPagamento.setBounds(620, 15, 190, 50);
        painelPagamento.setBorder(BorderFactory.createTitledBorder("Forma de Pagamento"));
        painelPrincipal.add(painelPagamento);

        rdAVista = new JRadioButton("A Vista");
        rdAVista.setBounds(5, 20, 80, 17);
        rdAVista.setFont(new Font("Arial", 0, 13));
        painelPagamento.add(rdAVista);

        rdPrazo = new JRadioButton("A Prazo");
        rdPrazo.setBounds(90, 20, 80, 17);
        rdPrazo.setFont(new Font("Arial", 0, 13));
        painelPagamento.add(rdPrazo);

        groupPagamento = new ButtonGroup();
        groupPagamento.add(rdAVista);
        groupPagamento.add(rdPrazo);

        painelPrincipal.add(painelPagamento);
    
    
    
    
          painelProduto = new JPanel();
        painelProduto.setLayout(null);
        painelProduto.setSize(800, 70);
        painelProduto.setLocation(10, 290);
        painelProduto.setBorder(BorderFactory.createTitledBorder(""));
        painelPrincipal.add(painelProduto);
        
 //-------------------------------------------------------------------------------------------------------------------//
 
 
        lblProduto = new JLabel("Produto ");
        lblProduto.setBounds(13, 10, 60, 22);
        painelProduto.add(lblProduto);
        
        
         txtProduto = new JTextField();
        txtProduto.setBounds(10, 30, 250, 22);
        painelProduto.add(txtProduto);
  //-------------------------------------------------------------------------------------------------------------------//
  
  
        
         lblCodProduto = new JLabel("Código ");
        lblCodProduto.setBounds(270, 10, 60, 22);
        painelProduto.add(lblCodProduto);
        
        
         txtCodProduto = new JTextField();
        txtCodProduto.setBounds(270, 30, 40, 22);
        painelProduto.add(txtCodProduto);
   //-------------------------------------------------------------------------------------------------------------------//
   
   
        
        // ---------------- BOTAO GRAVAR-----//
       btnGravaProd = new JButton("Gravar");
       btnGravaProd.setBounds(315, 25, 90, 30);  
      btnGravaProd.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));       
       btnGravaProd.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnGravaProd.setFont(new Font("Arial", 1, 13));
        btnGravaProd.addActionListener((java.awt.event.ActionEvent evt) -> { 
           
                       criarDadosSetor();
        });       
      
        
       painelProduto.add(btnGravaProd);
       
 //-------------------------------------------------------------------------------------------------------------------//
 
 
        // ---------------- BOTAO GRAVAR-----//
       btnCancelaProd = new JButton("Cancelar");
       btnCancelaProd.setBounds(410,25, 90, 30);  
       btnCancelaProd.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));       
       btnCancelaProd.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnCancelaProd.setFont(new Font("Arial", 1, 13));
        
       painelProduto.add(btnCancelaProd);
       
  //-------------------------------------------------------------------------------------------------------------------//
  
  
         // ---------------- BOTAO GRAVAR-----//
       btnNovo = new JButton("Novo");
       btnNovo.setBounds(505, 25, 90, 30);  
      btnNovo.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/incluir.png"));       
       btnNovo.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnNovo.setFont(new Font("Arial", 1, 13));
        
       painelProduto.add(btnNovo);
       
   //-------------------------------------------------------------------------------------------------------------------//
   
   
        // ---------------- BOTAO GRAVAR-----//
       btnAlterarProd = new JButton("Alterar");
       btnAlterarProd.setBounds(600, 25, 90, 30);  
       btnAlterarProd.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/alterar2.png"));       
       btnAlterarProd.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnAlterarProd.setFont(new Font("Arial", 1, 13));
        
       painelProduto.add(btnAlterarProd);
    //-------------------------------------------------------------------------------------------------------------------//
    
    
        btnExcluirProd = new JButton("Excluir");
       btnExcluirProd.setBounds(695, 25, 90, 30);  
       btnExcluirProd.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/excluir2.png"));       
       btnExcluirProd.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnExcluirProd.setFont(new Font("Arial", 1, 13));
        
       painelProduto.add(btnExcluirProd);
       
       
     //-------------------------------------------------------------------------------------------------------------------//
     
       
          painelVendedor = new JPanel();
        painelVendedor.setLayout(null);
        painelVendedor.setSize(800, 180);
        painelVendedor.setLocation(10, 370);
        painelVendedor.setBorder(BorderFactory.createTitledBorder(""));
        painelPrincipal.add(painelVendedor);
     //-------------------------------------------------------------------------------------------------------------------//
     
     
       //----------------------------------------------------------//
          lblVendedor = new JLabel("Vendedor");
        lblVendedor.setBounds(10, 10, 120, 22);
        painelVendedor.add(lblVendedor);
        
        cbVendedor = new JComboBox();
        cbVendedor.setBounds(10, 30, 190, 21);
        painelVendedor.add(cbVendedor);
     //-------------------------------------------------------------------------------------------------------------------//
     
     
        //----------------------------------------//
         
         lblPrazo = new JLabel("Prazo ");
        lblPrazo.setBounds(210, 10, 60, 22);
        painelVendedor.add(lblPrazo);
        
        
         txtPrazo = new JTextField();
        txtPrazo.setBounds(210, 30, 50, 22);
        painelVendedor.add(txtPrazo);
        
      //-------------------------------------------------------------------------------------------------------------------//
      
      
       //----------------------------------------------//
       
        lblDataVencimento = new JLabel("Data Vencimento");
        lblDataVencimento.setBounds(270, 10, 110, 22);
        painelVendedor.add(lblDataVencimento);
        
        
         txtDataVencimento =  new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtDataVencimento.setBounds(275, 30, 80, 22);
        painelVendedor.add(txtDataVencimento);
//-------------------------------------------------------------------------------------------------------------------//        
       //----------------------------------------------//  
        
        lblPrecoFrete = new JLabel("Preço Frete");
        lblPrecoFrete.setBounds(380, 10, 110, 22);
        painelVendedor.add(lblPrecoFrete);
        
        
         cbPrecoFrete = new JComboBox();
        cbPrecoFrete.setBounds(380, 30, 80, 21);
        painelVendedor.add(cbPrecoFrete);
        
 //-------------------------------------------------------------------------------------------------------------------//      //----------------------------------------------//  
        lblAdiantamento = new JLabel("Adiantamento");
        lblAdiantamento.setBounds(470, 10, 110, 22);
        painelVendedor.add(lblAdiantamento);
        
        
         txtAdiantamento = new JTextField();
        txtAdiantamento.setBounds(470, 30, 100, 22);
        painelVendedor.add(txtAdiantamento);
  //-------------------------------------------------------------------------------------------------------------------//      
       //----------------------------------------------//  
        lblSubTotal = new JLabel("Sub Total");
        lblSubTotal.setBounds(580, 10, 110, 22);
        painelVendedor.add(lblSubTotal);
        
        
         txtSubTotal = new JTextField();
        txtSubTotal.setBounds(580, 30, 100, 22);
        painelVendedor.add(txtSubTotal);
        
       
         //----------------------------------------------//
          lblMotorista = new JLabel("Motorista ");
        lblMotorista.setBounds(10, 50, 60, 22);
        painelVendedor.add(lblMotorista);
        
        
         txtMotorista = new JTextField();
        txtMotorista.setBounds(10, 70, 280, 22);
        painelVendedor.add(txtMotorista);
        
         //----------------------------------------------//
         txtCodMotorista = new JTextField();
        txtCodMotorista.setBounds(295, 70, 40, 22);
        painelVendedor.add(txtCodMotorista);
        
        
             // ---------------- BOTAO GRAVAR-----//
       btnConsultaMotorista = new JButton("");
       btnConsultaMotorista.setBounds(340, 70, 22, 22);  
        btnConsultaMotorista.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
       btnConsultaMotorista.setToolTipText("Pesquisar Motorista");
       btnConsultaMotorista.setHorizontalTextPosition(SwingConstants.CENTER);
        
       painelVendedor.add(btnConsultaMotorista);
        
        
        
        
  //-----------------------------------------------------------------------------------------//      
        
         //----------------------------------------------//
          lblPlaca = new JLabel("Placa ");
        lblPlaca.setBounds(380, 50, 60, 22);
        painelVendedor.add(lblPlaca);
        
              
         txtPlaca = new JTextField();
        txtPlaca.setBounds(380, 70, 80, 22);
        painelVendedor.add(txtPlaca);
 //-----------------------------------------------------------------------------------------//
        
          //----------------------------------------------//
         lblBonificacao = new JLabel("Bonificação");
        lblBonificacao.setBounds(470, 50, 100, 22);
        painelVendedor.add(lblBonificacao);
        
        CbBonificacao = new JComboBox();
        CbBonificacao.setBounds(470, 70, 80, 21);
        painelVendedor.add(CbBonificacao);
        
        
        
          cbBonificacao = new JCheckBox("Bonificação");
        cbBonificacao.setBounds(450, 100, 120, 21);
        painelVendedor.add(cbBonificacao);
        
//-----------------------------------------------------------------------------------------//        
        
        //----------------------------------------------//  
        lblFrete = new JLabel("Frete");
        lblFrete.setBounds(580, 50, 110, 22);
        painelVendedor.add(lblFrete);
        
        
         txtFrete = new JTextField();
        txtFrete.setBounds(580, 70, 100, 22);
        painelVendedor.add(txtFrete);
        
//-----------------------------------------------------------------------------------------//        
          //----------------------------------------------//  
        lblDescontoVista = new JLabel("Desconto a Vista");
        lblDescontoVista.setBounds(580, 90, 110, 22);
        painelVendedor.add(lblDescontoVista);
        
        
         txtDescontoVista = new JTextField();
        txtDescontoVista.setBounds(580, 110, 100, 22);
        painelVendedor.add(txtDescontoVista);
        
//-----------------------------------------------------------------------------------------//        
         
          //----------------------------------------------//  
        lblFunRural = new JLabel("FUNRURAL");
        lblFunRural.setBounds(580, 130, 110, 22);
        painelVendedor.add(lblFunRural);
        
        
         txtFunRural = new JTextField();
        txtFunRural.setBounds(580, 150, 100, 22);
        painelVendedor.add(txtFunRural);
        
 //-----------------------------------------------------------------------------------------//       
        
          //----------------------------------------------//  
        lblTotal = new JLabel("Total");
        lblTotal.setBounds(690, 130, 110, 22);
        painelVendedor.add(lblTotal);
        
        
         txtTotal = new JTextField();
        txtTotal.setBounds(690, 150, 100, 22);
        painelVendedor.add(txtTotal);
        
        //-----------------------------------------------------//
    
   //-----------------------------------------------------------------------------------------//     
        
          
        lblValorBonificacao = new JLabel("Valor Bonificação");
        lblValorBonificacao.setBounds(470, 130, 110, 22);
        painelVendedor.add(lblValorBonificacao);
        
        
         txtValorNonificacao = new JTextField();
        txtValorNonificacao.setBounds(470, 150, 100, 22);
        painelVendedor.add(txtValorNonificacao);
        
   //-----------------------------------------------------------------------------------------//
        
        
        lblObservacao = new JLabel("Observação:");
        lblObservacao.setBounds(10, 95, 90, 22);
        painelVendedor.add(lblObservacao);
        
        
         txtObservacao = new JTextField();
        txtObservacao.setBounds(85, 100, 360, 50);
        painelVendedor.add(txtObservacao);
        
  //-----------------------------------------------------------------------------------------//
  
  
        // ---------------- BOTAO GRAVAR-----//
        btnDados = new JButton("Dados Complementares");
        btnDados.setBounds(10, 155, 160, 22);       
        btnDados.setFont(new Font("Arial", 1, 12));
        btnDados.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnDados.addActionListener((java.awt.event.ActionEvent evt) -> { 
           
                       criarDadosComplementar();
        });       
      
        
       painelVendedor.add(btnDados);
  
  
  
  
  
  
        // ---------------- BOTAO GRAVAR-----//
        btnGravar = new JButton("Gravar");
       btnGravar.setBounds(200, 565, 100, 35);       
        btnGravar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));       
       btnGravar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnGravar.setFont(new Font("Arial", 1, 13));
        
       painelPrincipal.add(btnGravar);
        
          // ---------------- BOTAO CANCELAR-----//
       btnCancelar = new JButton("Cancelar");
       btnCancelar.setBounds(310, 565, 100, 35);       
       btnCancelar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));       
       btnCancelar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnCancelar.setFont(new Font("Arial", 1, 13));
        
       painelPrincipal.add(btnCancelar);
       
       
        // ---------------- BOTAO CANCELAR-----//
       btnConsultar = new JButton("Consultar");
       btnConsultar.setBounds(420, 565, 100, 35);       
       btnConsultar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/consulta.png"));       
       btnConsultar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnConsultar.setFont(new Font("Arial", 1, 13));
        
       painelPrincipal.add(btnConsultar);
        
         // ---------------- BOTAO SAIR-----//
       btnSair = new JButton("Sair");
       btnSair.setBounds(530, 565, 100, 35);       
       btnSair.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/sair.png"));       
       btnSair.setHorizontalTextPosition(SwingConstants.RIGHT);
       btnSair.setFont(new Font("Arial", 1, 13)); 
       btnSair.addActionListener((java.awt.event.ActionEvent evt) -> { 
           
                        janela.dispose();
        });       
       painelPrincipal.add(btnSair);
         
        
        
        
        criarTabelaSetor();
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
        modelo.addColumn("Descrição Produto");
        modelo.addColumn("QTD Total");
        modelo.addColumn("Total");
     

        tblProduto = new JTable();
        tblProduto.setModel(modelo);
        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(60);
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(200);
        

        tblProduto.getTableHeader().setResizingAllowed(false);
        tblProduto.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblProduto.getTableHeader();
        cabecalho.setFont(new Font("Arial", 1, 11));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblProduto.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblProduto.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        

        tblProduto.setFont(new Font("Arial", 0, 11));

        scrollTable = new JScrollPane(tblProduto,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(10, 80, 400, 200);
        tblProduto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelPrincipal.add(scrollTable);
    }
     
     
     
     
     private void criarTabelaSetor() {
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        modelo.addColumn("Setor");
        modelo.addColumn("QTD");
        modelo.addColumn("Preço Unit");
        modelo.addColumn("Vl Total");
     

        tblProduto = new JTable();
        tblProduto.setModel(modelo);
        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(140);
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(85);
        tblProduto.getColumnModel().getColumn(2).setPreferredWidth(85);
        tblProduto.getColumnModel().getColumn(3).setPreferredWidth(80);
        

        tblProduto.getTableHeader().setResizingAllowed(false);
        tblProduto.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblProduto.getTableHeader();
        cabecalho.setFont(new Font("Arial", 1, 11));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblProduto.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblProduto.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        

        tblProduto.setFont(new Font("Arial", 0, 11));

        scrollTable = new JScrollPane(tblProduto,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(420, 80, 390, 200);
        tblProduto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelPrincipal.add(scrollTable);
    }
    
    

      private void criarDadosComplementar() {
     
          
          
        janelaDados = new JFrame("");
        janelaDados.setSize(230, 320);
        janelaDados.setLayout(null);
        janelaDados.setResizable(false);
        janelaDados.setLocationRelativeTo(lblObservacao);
        
              


        painelDados = new JPanel();
        painelDados.setLayout(null);
        painelDados.setSize(210, 280);
        painelDados.setLocation(5, 5);
        painelDados.setBorder(BorderFactory.createTitledBorder(""));
        
        
        
        
          lblDados = new JLabel("Dados Complementares ");
        lblDados.setBounds(20, 10, 200, 22);
        lblDados.setFont(new Font("Arial", 1, 15));
        lblDados.setForeground(Color.BLUE);
        painelDados.add(lblDados);
        
       
      //------------------------------------------------------------------------//
      
        lblSacria = new JLabel("Sacarias ");
        lblSacria.setBounds(50, 40, 100, 22);
        painelDados.add(lblSacria);
        
       
        txtSacaria = new JTextField();
        txtSacaria.setBounds(50, 60, 100, 22);
        painelDados.add(txtSacaria);
      
        
           //------------------------------------------------------------------------//
      
        lblOutras = new JLabel("Outras ");
        lblOutras.setBounds(50, 80, 100, 22);
        painelDados.add(lblOutras);
        
       
        txtOutras = new JTextField();
        txtOutras.setBounds(50, 100, 100, 22);
        painelDados.add(txtOutras);
        
           //------------------------------------------------------------------------//
      
        lblFreteDestino = new JLabel("Frete Destino ");
        lblFreteDestino.setBounds(50, 120, 100, 22);
        painelDados.add(lblFreteDestino);
        
       
        txtFreteDestino = new JTextField();
        txtFreteDestino.setBounds(50, 140, 100, 22);
        painelDados.add(txtFreteDestino);
        
        
           //------------------------------------------------------------------------//
      
        lblDescarga = new JLabel("Descarga ");
        lblDescarga.setBounds(50, 160, 100, 22);
        painelDados.add(lblDescarga);
        
       
        txtDescarga = new JTextField();
        txtDescarga.setBounds(50, 180, 100, 22);
        painelDados.add(txtDescarga);
        
        
           //------------------------------------------------------------------------//
      
        lblComissao = new JLabel("Comissão ");
        lblComissao.setBounds(50, 200, 100, 22);
        painelDados.add(lblComissao);
        
       
        txtComissao = new JTextField();
        txtComissao.setBounds(50, 220, 100, 22);
        painelDados.add(txtComissao);
        
         //-------------------------------------------------------------------------------------------// 
        btnSair = new JButton("Sair");
       btnSair.setBounds(50, 250, 100, 27);       
       btnSair.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/sair.png"));      
       btnSair.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnSair.setFont(new Font("Arial", 1, 13));
        
       painelDados.add(btnSair);
        
        
        
           //------------------------------------------------------------------------//
      
       
          
          
         janelaDados.add(painelDados);
         janelaDados.setVisible(true);
      }
      
        private void criarDadosSetor() {
            
            
        janelaSetor = new JFrame("");
        janelaSetor.setSize(455, 380);
        janelaSetor.setLayout(null);
        janelaSetor.setResizable(false);
        janelaSetor.setLocationRelativeTo(lblObservacao);
        
              


        painelSetor = new JPanel();
        painelSetor.setLayout(null);
        painelSetor.setSize(435, 290);
        painelSetor.setLocation(5, 5);
        painelSetor.setBorder(BorderFactory.createTitledBorder(""));
            
            
        
           //------------------------------------------------------------------------//
      
        lblSetor = new JLabel("Setor:");
        lblSetor.setBounds(10, 210, 80, 22);
        painelSetor.add(lblSetor);
        
       
        cbSetor = new JComboBox();
        cbSetor.setBounds(10, 230, 150, 22);
        painelSetor.add(cbSetor);
        
         //-------------------------------------------------------------------------------------------//  
        
         
         //------------------------------------------------------------------------//
      
        lblQtd = new JLabel("QTD:");
        lblQtd.setBounds(170, 210, 80, 22);
        painelSetor.add(lblQtd);
        
       
        txtQtd = new JTextField();
        txtQtd.setBounds(170, 230, 80, 22);
        painelSetor.add(txtQtd);
        
         //-------------------------------------------------------------------------------------------//  
         
         
            //------------------------------------------------------------------------//
      
        lblPrecoUnit = new JLabel("Preço Unit:");
        lblPrecoUnit.setBounds(260, 210, 80, 22);
        painelSetor.add(lblPrecoUnit);
        
       
        txtPrecoUnit = new JTextField();
        txtPrecoUnit.setBounds(260, 230, 80, 22);
        painelSetor.add(txtPrecoUnit);
        
         //-------------------------------------------------------------------------------------------// 
         
         
              //------------------------------------------------------------------------//
      
        lblValorTotal = new JLabel("Valor Total:");
        lblValorTotal.setBounds(350, 210, 80, 22);
        painelSetor.add(lblValorTotal);
        
       
        txtValorTotal = new JTextField();
        txtValorTotal.setBounds(350, 230, 80, 22);
        painelSetor.add(txtValorTotal);
        
         //-------------------------------------------------------------------------------------------//  
        
        
         
         
              // ---------------- BOTAO GRAVAR-----//
       btnAdicionarSet = new JButton("Adicionar");
       btnAdicionarSet.setBounds(10, 260, 85, 27);  
       btnAdicionarSet.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/incluir.png"));       
       btnAdicionarSet.setHorizontalTextPosition(SwingConstants.RIGHT);
       btnAdicionarSet.setFont(new Font("Arial", 1, 12));
        
       painelSetor.add(btnAdicionarSet);
       
   //-------------------------------------------------------------------------------------------------------------------//
   
   
        // ---------------- BOTAO GRAVAR-----//
       btnAlterarSet = new JButton("Alterar");
       btnAlterarSet.setBounds(100, 260, 85, 27);  
       btnAlterarSet.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/alterar2.png"));       
       btnAlterarSet.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnAlterarSet.setFont(new Font("Arial", 1, 13));
        
       painelSetor.add(btnAlterarSet);
    //-------------------------------------------------------------------------------------------------------------------//
    
    
        btnExcluirSet = new JButton("Excluir");
       btnExcluirSet.setBounds(190, 260, 85, 27);  
       btnExcluirSet.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/excluir2.png"));       
       btnExcluirSet.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnExcluirSet.setFont(new Font("Arial", 1, 13));
        
       painelSetor.add(btnExcluirSet);
         
         
       
       
       
       
        //-------------------------------------------------------------------------------------------------------------------//
    
    
        btnGravarSet = new JButton("Gravar");
       btnGravarSet.setBounds(120, 305, 90, 30);  
       btnGravarSet.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));       
       btnGravarSet.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnGravarSet.setFont(new Font("Arial", 1, 13));
        
       janelaSetor.add(btnGravarSet);
        
         
         //---------------------------------------------------------------------------------------------------------------//
         
         
       btnCancelarSet = new JButton("Cancelar");
       btnCancelarSet.setBounds(220, 305, 90, 30);  
       btnCancelarSet.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));       
       btnCancelarSet.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnCancelarSet.setFont(new Font("Arial", 1, 13));
        
       janelaSetor.add(btnCancelarSet);
   
        
        
            
            criarTabelaSet();
           janelaSetor.add(painelSetor);
           janelaSetor.setVisible(true);
     
      }
        
        
         private void criarTabelaSet() {
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        modelo.addColumn("Setor");
        modelo.addColumn("QTD");
        modelo.addColumn("Preço Unit");
        modelo.addColumn("Vl Total");
     

        tblSet = new JTable();
        tblSet.setModel(modelo);
        tblSet.getColumnModel().getColumn(0).setPreferredWidth(175);
        tblSet.getColumnModel().getColumn(1).setPreferredWidth(85);
        tblSet.getColumnModel().getColumn(2).setPreferredWidth(85);
        tblSet.getColumnModel().getColumn(3).setPreferredWidth(80);
        

        tblSet.getTableHeader().setResizingAllowed(false);
        tblSet.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblSet.getTableHeader();
        cabecalho.setFont(new Font("Arial", 1, 11));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblSet.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblSet.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        

        tblSet.setFont(new Font("Arial", 0, 11));

        scrollTable = new JScrollPane(tblSet,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(5, 5, 425, 200);
        tblSet.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelSetor.add(scrollTable);
    }
        
        
      
     
}