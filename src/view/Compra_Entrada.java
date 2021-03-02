
package view;

import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.text.MaskFormatter;


public class Compra_Entrada {
    
      private JFrame janela,janelaDados;
    private JPanel painelPrincipal,painelProduto,painelMotorista, painelCompra, painelDados;
    private JLabel lblData, lblFornecedor, lblCI, lblProduto, lblQuantidade, lblValorUnitario, lblValorTotal,lblCodCliente, lblReferencia,lblObservacao, lblPrazo,lblDataVencimento, lblDesconto, lblAdiantamento, lblTotal;
    private JLabel lblVendedor, lblVlrReajustado, lblPrecoMinimo, lblMotorista, lblPlaca, lblQtdSacos, lblBEG, lblDescontoVista, lblFrete, lblDesExtra, lblFunRural;
    private JTextField  txtFornecedor, txtCodFornecedor, txtCI, txtProduto,txtCodProduto, txtQuantidade, txtValorUnitario,txtVlrReajustado, txtValorTotal, txtPrecoMinimo, txtPrazo,txtDesconto, txtAdiantamento, txtTotal;
    private JTextField txtMotorista, txtCodMotorista, txtPlaca, txtQtdSacos, txtBEG, txtDescontoVista, txtFrete, txtDescExtra, txtFunRural;
    private JTable tblProduto;
    private JScrollPane scrollTable,scrollObs;
    private DefaultTableModel modelo;
    private JButton btnConsultaFornecedor, btnConsultarMotorista,btnNovo,btnCancelaProd,btnAlterarProd,btnExcluirProd,btnGravaProd, btnSair, btnCancelar, btnConsultar, btnGravar;
    private JComboBox cbReferencia, cbVendedor;
    private JRadioButton rdAberto, rdFechada;
    private ButtonGroup groupCompra;
    private JFormattedTextField txtData, txtDataVencimento;
    private JLabel lblDados, lblChapa, lblLavacao, lblFreteRoca, lblOutras;
    private JTextField txtChapa, txtLavacao, txtFreteRoca, txtOutras;
    private JButton btnDados;
    private JTextArea txtObservacao;
    
      public void desenharTela() throws ParseException {

        janela = new JFrame("Compra");
        janela.setSize(790, 675);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);

        
       

        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(770, 630);
        painelPrincipal.setLocation(7, 5);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        
        
        
         lblData = new JLabel("Data ");
        lblData.setBounds(13, 20, 60, 22);
        painelPrincipal.add(lblData);
        
        txtData = new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtData.setBounds(10, 40, 80, 22);
        painelPrincipal.add(txtData);
        
        
         lblFornecedor = new JLabel("Fornecedor ");
        lblFornecedor.setBounds(100, 20, 80, 22);
        painelPrincipal.add(lblFornecedor);
        
        txtFornecedor = new JTextField();
        txtFornecedor.setBounds(100, 40, 250, 22);
        painelPrincipal.add(txtFornecedor);
        
        
        
        txtCodFornecedor = new JTextField();
        txtCodFornecedor.setBounds(355, 40, 40, 22);
        painelPrincipal.add(txtCodFornecedor);
        
        
        
          //------------BOTAO PESQUISAR PRODUTO ---------------------//
       
       btnConsultaFornecedor = new JButton();
       btnConsultaFornecedor.setBounds(400, 40, 20, 20);       
       btnConsultaFornecedor.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
       btnConsultaFornecedor.setToolTipText("Pesquisar Fornecedor");
       btnConsultaFornecedor.setHorizontalTextPosition(SwingConstants.CENTER);
        btnConsultaFornecedor.addActionListener((java.awt.event.ActionEvent evt) -> {  
           
           ConsultaFornecedorProdutor_Simplificado consult = new ConsultaFornecedorProdutor_Simplificado();
           consult.desenharTela();
        });
        
       painelPrincipal.add(btnConsultaFornecedor);
        
       //-------------------------------------------------------------------//
       
         lblCI = new JLabel("C.I CPB");
        lblCI.setBounds(440, 20, 120, 22);
        painelPrincipal.add(lblCI);
        
        txtCI = new JTextField();
        txtCI.setBounds(440, 40, 60, 22);
        painelPrincipal.add(txtCI);
        
        
         lblVendedor = new JLabel("Vendedor ");
        lblVendedor.setBounds(520, 20, 80, 22);
        painelPrincipal.add(lblVendedor);
        
        cbVendedor = new JComboBox();
        cbVendedor.setBounds(520, 40, 140, 22);
        painelPrincipal.add(cbVendedor);
        
        
       
        
        painelProduto = new JPanel();
        painelProduto.setLayout(null);
        painelProduto.setSize(750, 100);
        painelProduto.setLocation(10, 240);
        painelProduto.setBorder(BorderFactory.createTitledBorder(""));
        painelPrincipal.add(painelProduto);
        
        
        lblProduto = new JLabel("Produto ");
        lblProduto.setBounds(13, 10, 60, 22);
        painelProduto.add(lblProduto);
        
        
         txtProduto = new JTextField();
        txtProduto.setBounds(10, 30, 240, 22);
        painelProduto.add(txtProduto);
        
         txtCodProduto = new JTextField();
        txtCodProduto.setBounds(255, 30, 40, 22);
        painelProduto.add(txtCodProduto);
        
        
        
         lblQuantidade = new JLabel("Quantidade");
        lblQuantidade.setBounds(310, 10, 70, 22);
        painelProduto.add(lblQuantidade);
        
        
         txtQuantidade = new JTextField();
        txtQuantidade.setBounds(310, 30, 80, 22);
        painelProduto.add(txtQuantidade);
        
        
          //-------------------------------------------------------------//   
         lblValorUnitario = new JLabel(" Vlr Unitário ");
        lblValorUnitario.setBounds(395, 10, 80, 22);
        painelProduto.add(lblValorUnitario);
        
         txtValorUnitario = new JTextField();
        txtValorUnitario.setBounds(395, 30, 80, 22);
        painelProduto.add(txtValorUnitario);
        
        
          //-------------------------------------------------------------//   
         lblVlrReajustado = new JLabel("Vlr Reajustado ");
        lblVlrReajustado.setBounds(480, 10, 100, 22);
        painelProduto.add(lblVlrReajustado);
        
         txtVlrReajustado = new JTextField();
        txtVlrReajustado.setBounds(480, 30, 80, 22);
        painelProduto.add(txtVlrReajustado);
        
        //-------------------------------------------------------------// 
         lblValorUnitario = new JLabel(" Valor Total ");
        lblValorUnitario.setBounds(565, 10, 80, 22);
        painelProduto.add(lblValorUnitario);
   
        
         txtValorUnitario = new JTextField();
        txtValorUnitario.setBounds(565, 30, 80, 22);
        painelProduto.add(txtValorUnitario);
        
        
          //-------------------------------------------------------------// 
         lblPrecoMinimo = new JLabel("Preço Minimo");
        lblPrecoMinimo.setBounds(650, 10, 110, 22);
        painelProduto.add(lblPrecoMinimo);
   
        
         txtValorUnitario = new JTextField();
        txtValorUnitario.setBounds(650, 30, 80, 22);
        painelProduto.add(txtValorUnitario);
        
        
        
          // ---------------- BOTAO GRAVAR-----//
       btnNovo = new JButton("Novo");
       btnNovo.setBounds(30, 65, 100, 25);        
       btnNovo.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/incluir.png"));
       btnNovo.setFont(new Font("Arial", 1, 13));
       btnNovo.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelProduto.add(btnNovo);
        
         // ---------------- BOTAO GRAVAR-----//
       btnAlterarProd = new JButton("Alterar");
       btnAlterarProd.setBounds(140, 65,100, 25);      
       btnAlterarProd.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/alterar2.png"));
       btnAlterarProd.setFont(new Font("Arial", 1, 13));
       btnAlterarProd.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelProduto.add(btnAlterarProd);
       
        btnExcluirProd = new JButton("Excluir");
       btnExcluirProd.setBounds(250, 65, 100, 25);       
       btnExcluirProd.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/excluir2.png"));
       btnExcluirProd.setFont(new Font("Arial", 1, 13));
       btnExcluirProd.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelProduto.add(btnExcluirProd);
     
       
       
        // ---------------- BOTAO GRAVAR-----//
       btnCancelaProd = new JButton("Cancelar");
       btnCancelaProd.setBounds(360, 65, 100, 25);      
        btnCancelaProd.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));
       btnCancelaProd.setFont(new Font("Arial", 1, 13));
       btnCancelaProd.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelProduto.add(btnCancelaProd);
       
       
       
          //---------------- BOTAO GRAVAR-----//
       btnGravaProd = new JButton("Gravar");
       btnGravaProd.setBounds(470, 65, 100, 25);       
       btnGravaProd.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));
       btnGravaProd.setFont(new Font("Arial", 1, 13));
       btnGravaProd.setHorizontalTextPosition(SwingConstants.RIGHT);
       
        
       painelProduto.add(btnGravaProd);
       
       
       
      
          //----------------------------------------------------------//
         lblReferencia = new JLabel("Referencia");
        lblReferencia.setBounds(10, 350, 120, 22);
        painelPrincipal.add(lblReferencia);
        
        cbReferencia = new JComboBox();
        cbReferencia.setBounds(10, 370, 140, 21);
        painelPrincipal.add(cbReferencia);
        
        
         //----------------------------------------//
         
         lblPrazo = new JLabel("Prazo ");
        lblPrazo.setBounds(170, 350, 100, 22);
        painelPrincipal.add(lblPrazo);
        
        
         txtPrazo = new JTextField();
        txtPrazo.setBounds(170, 370, 40, 22);
        painelPrincipal.add(txtPrazo);
        
         //----------------------------------------//
         
         lblDataVencimento = new JLabel("Data Vencimento ");
        lblDataVencimento.setBounds(220, 350, 130, 22);
        painelPrincipal.add(lblDataVencimento);
        
        
         txtDataVencimento = new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtDataVencimento.setBounds(220, 370, 100, 22);
        painelPrincipal.add(txtDataVencimento);
        
        //----------------------------------------//
        
        painelMotorista = new JPanel();
        painelMotorista.setLayout(null);
        painelMotorista.setSize(380, 120);
        painelMotorista.setLocation(10, 410);
        painelMotorista.setBorder(BorderFactory.createTitledBorder("Motorista(s)"));
        painelPrincipal.add(painelMotorista);
        
        //----------------------------------------//
         lblMotorista = new JLabel("Motorista ");
        lblMotorista.setBounds(10, 20, 100, 22);
        painelMotorista.add(lblMotorista);
        
        
         txtMotorista = new JTextField();
        txtMotorista.setBounds(10, 40, 275, 22);
        painelMotorista.add(txtMotorista);
        
         txtCodMotorista = new JTextField();
        txtCodMotorista.setBounds(295, 40, 40, 22);
        painelMotorista.add(txtCodMotorista);
        
        
        
            //------------BOTAO PESQUISAR PRODUTO ---------------------//
       
       btnConsultarMotorista = new JButton();
       btnConsultarMotorista.setBounds(340, 40, 20, 20);       
       btnConsultarMotorista.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
       btnConsultarMotorista.setToolTipText("Pesquisar Fornecedor");
       btnConsultarMotorista.setHorizontalTextPosition(SwingConstants.CENTER);
        
       painelMotorista.add(btnConsultarMotorista);
        
        
       //--------------------------------------------------------------------//
       
         lblPlaca = new JLabel("Placa ");
        lblPlaca.setBounds(10, 70, 80, 22);
        painelMotorista.add(lblPlaca);
        
         txtPlaca = new JTextField();
        txtPlaca.setBounds(10, 90, 80, 22);
        painelMotorista.add(txtPlaca);
        
        
        
          //--------------------------------------------------------------------//
       
         lblQtdSacos = new JLabel("Qtd de Sacos ");
        lblQtdSacos.setBounds(100, 70, 120, 22);
        painelMotorista.add(lblQtdSacos);
        
         txtQtdSacos = new JTextField();
        txtQtdSacos.setBounds(100, 90, 120, 22);
        painelMotorista.add(txtQtdSacos);
        
        
          //--------------------------------------------------------------------//
       
         lblBEG = new JLabel("BEG");
        lblBEG.setBounds(230, 70, 120, 22);
        painelMotorista.add(lblBEG);
        
         txtBEG = new JTextField();
        txtBEG.setBounds(230, 90, 120, 22);
        painelMotorista.add(txtBEG);
       
       
         //--------------------------------------------------------------------//
        
           
        painelCompra = new JPanel();
        painelCompra.setLayout(null);
        painelCompra.setSize(200, 50);
        painelCompra.setLocation(410, 350);
        painelCompra.setBorder(BorderFactory.createTitledBorder("Compra em"));
        painelPrincipal.add(painelCompra);
        
        
        
        
        rdAberto = new JRadioButton("Aberto");
        rdAberto.setBounds(10, 20, 80, 20);
        rdAberto.setFont(new Font("Arial", 0, 12));
        painelCompra.add(rdAberto);
        
        rdFechada = new JRadioButton("Fechado");
        rdFechada.setBounds(90, 20, 80, 20);
        rdFechada.setFont(new Font("Arial", 0, 12));
        painelCompra.add(rdFechada);
        
        groupCompra = new ButtonGroup();
        groupCompra.add(rdAberto);
        groupCompra.add(rdFechada);
        
        
        lblObservacao = new JLabel("Observação ");
        lblObservacao.setBounds(410, 400, 100, 22);
        painelPrincipal.add(lblObservacao);
        
        
        txtObservacao = new JTextArea();
        txtObservacao.setLineWrap(true);
        txtObservacao.setWrapStyleWord(true);

        scrollObs = new JScrollPane(txtObservacao,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollObs.setBounds(410, 420, 200, 150);
        painelPrincipal.add(scrollObs);
        
        
        
        
        
        
           //----------------------------------------//
         
        
        
        
           //----------------------------------------//
         
       lblAdiantamento = new JLabel("Adiantamento ");
        lblAdiantamento.setBounds(660, 340, 130, 22);
        painelPrincipal.add(lblAdiantamento);
        
        
         txtAdiantamento = new JTextField();
        txtAdiantamento.setBounds(650, 360, 100, 22);
        painelPrincipal.add(txtAdiantamento);
        
        //-------------------------------------------------------------------------------------//
          lblDescontoVista = new JLabel("Desconto a Vista ");
        lblDescontoVista.setBounds(650, 380, 130, 22);
        painelPrincipal.add(lblDescontoVista);
        
        
         txtDescontoVista = new JTextField();
        txtDescontoVista.setBounds(650, 400, 100, 22);
        painelPrincipal.add(txtDescontoVista);
        
        
          //----------------------------------------//
        lblFrete = new JLabel("Frete");
        lblFrete.setBounds(650, 420, 130, 22);
        painelPrincipal.add(lblFrete);
        
        
         txtFrete = new JTextField();
        txtFrete.setBounds(650, 440, 100, 22);
        painelPrincipal.add(txtFrete);
        
         //----------------------------------------//
        lblDesExtra = new JLabel("Desc.Extra");
        lblDesExtra.setBounds(650, 460, 130, 22);
        painelPrincipal.add(lblDesExtra);
        
        
         txtDescExtra = new JTextField();
        txtDescExtra.setBounds(650, 480, 100, 22);
        painelPrincipal.add(txtDescExtra);
        
        
         //----------------------------------------//
        lblFunRural = new JLabel("FUNRURAL");
        lblFunRural.setBounds(650, 500, 130, 22);
        painelPrincipal.add(lblFunRural);
        
        
         txtFunRural = new JTextField();
        txtFunRural.setBounds(650, 520, 100, 22);
        painelPrincipal.add(txtFunRural);
        
        //-----------------------------------------------------//
      
        
         lblTotal = new JLabel("Total ");
        lblTotal.setBounds(650, 540, 130, 22);
        painelPrincipal.add(lblTotal);
        
        
         txtTotal = new JTextField();
        txtTotal.setBounds(650, 560, 100, 22);
        painelPrincipal.add(txtTotal);
        
        //---------------------------------------------------------------------------------//
        
        
          // ---------------- BOTAO GRAVAR-----//
        btnDados = new JButton("Dados Complementares");
        btnDados.setBounds(10, 540, 160, 22);       
        btnDados.setFont(new Font("Arial", 1, 12));
        btnDados.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnDados.addActionListener((java.awt.event.ActionEvent evt) -> { 
           
                       criarDadosComplementar();
        });       
      
        
       painelPrincipal.add(btnDados);
        
        
         //-------------------------------------------------------------------------------------------// 
        btnGravar = new JButton("Gravar");
       btnGravar.setBounds(200, 590, 100, 35);       
       btnGravar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));      
       btnGravar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnGravar.setFont(new Font("Arial", 1, 13));
        
       painelPrincipal.add(btnGravar);
   //-------------------------------------------------------------------------------------------// 
   
   
   //-------------------------------------------------------------------------------------------// 
        btnConsultar = new JButton("Consultar");
       btnConsultar.setBounds(310, 590, 100, 35);       
       btnConsultar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/consulta.png"));      
       btnConsultar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnConsultar.setFont(new Font("Arial", 1, 13));
        
       painelPrincipal.add(btnConsultar);
   //-------------------------------------------------------------------------------------------// 
   
   
   //-------------------------------------------------------------------------------------------// 
        btnCancelar = new JButton("Cancelar");
       btnCancelar.setBounds(420, 590, 100, 35);       
       btnCancelar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));      
       btnCancelar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnCancelar.setFont(new Font("Arial", 1, 13));
        
       painelPrincipal.add(btnCancelar);
   //-------------------------------------------------------------------------------------------// 
   
   
   //-------------------------------------------------------------------------------------------// 
        btnSair = new JButton("Sair");
       btnSair.setBounds(530, 590, 100, 35);       
       btnSair.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/sair.png"));      
       btnSair.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnSair.setFont(new Font("Arial", 1, 13));
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

        modelo.addColumn("Código");
        modelo.addColumn("Descrição Produto");
         modelo.addColumn("Quantidade");
        modelo.addColumn("Vlr Unitario");
        modelo.addColumn("Vlr Reajust");
        modelo.addColumn("Vlr Total");
        modelo.addColumn("Qtd Perca");
        modelo.addColumn("Preço Minimo");
     

        tblProduto = new JTable();
        tblProduto.setModel(modelo);
        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(250);
        tblProduto.getColumnModel().getColumn(2).setPreferredWidth(70);
        tblProduto.getColumnModel().getColumn(3).setPreferredWidth(75);
        tblProduto.getColumnModel().getColumn(4).setPreferredWidth(75);
        

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
        scrollTable.setBounds(10, 80, 750, 150);
        tblProduto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelPrincipal.add(scrollTable);
    }
     
       private void criarDadosComplementar() {
     
          
          
        janelaDados = new JFrame("");
        janelaDados.setSize(230, 300);
        janelaDados.setLayout(null);
        janelaDados.setResizable(false);
        janelaDados.setLocationRelativeTo(lblObservacao);
        
              


        painelDados = new JPanel();
        painelDados.setLayout(null);
        painelDados.setSize(210, 260);
        painelDados.setLocation(5, 5);
        painelDados.setBorder(BorderFactory.createTitledBorder(""));
        
        
        
        
          lblDados = new JLabel("Dados Complementares ");
        lblDados.setBounds(20, 10, 200, 22);
        lblDados.setFont(new Font("Arial", 1, 15));
        lblDados.setForeground(Color.BLUE);
        painelDados.add(lblDados);
        
       
      //------------------------------------------------------------------------//
      
        lblChapa = new JLabel("Chapa ");
        lblChapa.setBounds(50, 40, 100, 22);
        painelDados.add(lblChapa);
        
       
        txtChapa = new JTextField();
        txtChapa.setBounds(50, 60, 100, 22);
        painelDados.add(txtChapa);
      
        
           //------------------------------------------------------------------------//
      
        lblLavacao = new JLabel("Lavação ");
        lblLavacao.setBounds(50, 80, 100, 22);
        painelDados.add(lblLavacao);
        
       
        txtLavacao = new JTextField();
        txtLavacao.setBounds(50, 100, 100, 22);
        painelDados.add(txtLavacao);
        
           //------------------------------------------------------------------------//
      
        lblFreteRoca = new JLabel("Frete Roça ");
        lblFreteRoca.setBounds(50, 120, 100, 22);
        painelDados.add(lblFreteRoca);
        
       
        txtFreteRoca = new JTextField();
        txtFreteRoca.setBounds(50, 140, 100, 22);
        painelDados.add(txtFreteRoca);
        
        
           //------------------------------------------------------------------------//
      
        lblOutras = new JLabel("Outras ");
        lblOutras.setBounds(50, 160, 100, 22);
        painelDados.add(lblOutras);
        
       
        txtOutras = new JTextField();
        txtOutras.setBounds(50, 180, 100, 22);
        painelDados.add(txtOutras);
        
        
        
        
         //-------------------------------------------------------------------------------------------// 
        btnSair = new JButton("Sair");
       btnSair.setBounds(50, 220, 100, 27);       
       btnSair.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/sair.png"));      
       btnSair.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnSair.setFont(new Font("Arial", 1, 13));
        
       painelDados.add(btnSair);
       
       janelaDados.add(painelDados);
       janelaDados.setVisible(true);
       }
}

    
    
    
    

