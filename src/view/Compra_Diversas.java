
package view;

import java.awt.Font;
import java.text.ParseException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.text.MaskFormatter;


public class Compra_Diversas {
    
  private JFrame janela;
    private JPanel painelPrincipal,painelProduto,painelVendedor;
    private JLabel lblData, lblFornecedor, lblCI, lblProduto, lblQuantidade, lblValorUnitario, lblValorTotal,lblCodCliente, lblVeiculo,lblObservacao, lblPrazo,lblDataVencimento, lblDesconto, lblAdiantamento, lblTotal;
    private JTextField  txtFornecedor, txtCodFornecedor, txtCI, txtProduto, txtQuantidade, txtValorUnitario, txtValorTotal, txtPrazo, txtDesconto, txtAdiantamento, txtTotal;
    private JTable tblProduto;
    private JScrollPane scrollTable;
    private DefaultTableModel modelo;
    private JButton btnConsultaFornecedor,btnNovo,btnCancelaProd,btnAlterarProd,btnExcluirProd,btnGravaProd, btnSair, btnCancelar, btnConsultar, btnGravar;
    private JComboBox cbVeiculos;
    private JFormattedTextField txtData,txtDataVencimento; 
     private JScrollPane scrollObs;
    private JTextArea txtObservacao;
    
      public void desenharTela() throws ParseException {

        janela = new JFrame("Compras Diversas");
        janela.setSize(620, 680);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
       

        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(600, 640);
        painelPrincipal.setLocation(7, 5);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        
        
        
         lblData = new JLabel("Data ");
        lblData.setBounds(13, 20, 60, 22);
        painelPrincipal.add(lblData);
        
        txtData = new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtData.setBounds(10, 40, 100, 22);
        painelPrincipal.add(txtData);
        
        
         lblFornecedor = new JLabel("Fornecedor ");
        lblFornecedor.setBounds(120, 20, 110, 22);
        painelPrincipal.add(lblFornecedor);
        
        txtFornecedor = new JTextField();
        txtFornecedor.setBounds(120, 40, 250, 22);
        painelPrincipal.add(txtFornecedor);
        
         lblCodCliente = new JLabel("Cod.For");
        lblCodCliente.setBounds(380, 20, 120, 22);
        painelPrincipal.add(lblCodCliente);
        
        txtCodFornecedor = new JTextField();
        txtCodFornecedor.setBounds(380, 40, 60, 22);
        painelPrincipal.add(txtCodFornecedor);
        
        
        
          //------------BOTAO PESQUISAR PRODUTO ---------------------//
       
       btnConsultaFornecedor = new JButton();
       btnConsultaFornecedor.setBounds(450, 40, 20, 20);       
       btnConsultaFornecedor.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
       btnConsultaFornecedor.setToolTipText("Pesquisar Fornecedor");
       btnConsultaFornecedor.setHorizontalTextPosition(SwingConstants.CENTER);
        btnConsultaFornecedor.addActionListener((java.awt.event.ActionEvent evt) -> {  
           
           ConsultaFornecedorProdutor_Simplificado consult = new ConsultaFornecedorProdutor_Simplificado();
           consult.desenharTela();
        });
        
       painelPrincipal.add(btnConsultaFornecedor);
        
       //-------------------------------------------------------------------//
       
         lblCI = new JLabel("C.I CPD");
        lblCI.setBounds(490, 20, 120, 22);
        painelPrincipal.add(lblCI);
        
        txtCI = new JTextField();
        txtCI.setBounds(490, 40, 60, 22);
        painelPrincipal.add(txtCI);
       
        
        painelProduto = new JPanel();
        painelProduto.setLayout(null);
        painelProduto.setSize(580, 100);
        painelProduto.setLocation(10, 290);
        painelProduto.setBorder(BorderFactory.createTitledBorder(""));
        painelPrincipal.add(painelProduto);
        
        
        lblProduto = new JLabel("Produto ");
        lblProduto.setBounds(13, 10, 60, 22);
        painelProduto.add(lblProduto);
        
        
         txtProduto = new JTextField();
        txtProduto.setBounds(10, 30, 240, 22);
        painelProduto.add(txtProduto);
        
        
         lblQuantidade = new JLabel("Quantidade");
        lblQuantidade.setBounds(260, 10, 70, 22);
        painelProduto.add(lblQuantidade);
        
        
         txtQuantidade = new JTextField();
        txtQuantidade.setBounds(260, 30, 80, 22);
        painelProduto.add(txtQuantidade);
        
        
          //-------------------------------------------------------------//   
         lblValorUnitario = new JLabel(" Vlr Unitário ");
        lblValorUnitario.setBounds(350, 10, 80, 22);
        painelProduto.add(lblValorUnitario);
        
         txtValorUnitario = new JTextField();
        txtValorUnitario.setBounds(350, 30, 80, 22);
        painelProduto.add(txtValorUnitario);
        
        //-------------------------------------------------------------// 
         lblValorUnitario = new JLabel(" Valor Total ");
        lblValorUnitario.setBounds(440, 10, 80, 22);
        painelProduto.add(lblValorUnitario);
   
        
         txtValorUnitario = new JTextField();
        txtValorUnitario.setBounds(440, 30, 80, 22);
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
       
       
       
       
       
          painelVendedor = new JPanel();
        painelVendedor.setLayout(null);
        painelVendedor.setSize(580, 180);
        painelVendedor.setLocation(10, 400);
        painelVendedor.setBorder(BorderFactory.createTitledBorder(""));
        painelPrincipal.add(painelVendedor);
          //----------------------------------------------------------//
         lblVeiculo = new JLabel("Veiculo");
        lblVeiculo.setBounds(10, 10, 120, 22);
        painelVendedor.add(lblVeiculo);
        
        cbVeiculos = new JComboBox();
        cbVeiculos.setBounds(10, 30, 140, 21);
        painelVendedor.add(cbVeiculos);
        
        //----------------------------------------//
         
         lblObservacao = new JLabel("Observação ");
        lblObservacao.setBounds(10, 60, 100, 22);
        painelVendedor.add(lblObservacao);
        
         txtObservacao = new JTextArea();
        txtObservacao.setLineWrap(true);
        txtObservacao.setWrapStyleWord(true);

        scrollObs = new JScrollPane(txtObservacao, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollObs.setBounds(10, 80, 280, 90);
        painelVendedor.add(scrollObs);
        
        
         //----------------------------------------//
         
         lblPrazo = new JLabel("Prazo ");
        lblPrazo.setBounds(300, 60, 100, 22);
        painelVendedor.add(lblPrazo);
        
        
         txtPrazo = new JTextField();
        txtPrazo.setBounds(300, 80, 50, 22);
        painelVendedor.add(txtPrazo);
        
         //----------------------------------------//
         
         lblDataVencimento = new JLabel("Data Vencimento ");
        lblDataVencimento.setBounds(360, 60, 130, 22);
        painelVendedor.add(lblDataVencimento);
        
        
         txtDataVencimento = new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtDataVencimento.setBounds(360, 80, 100, 22);
        painelVendedor.add(txtDataVencimento);
        
        
           //----------------------------------------//
         
         lblDesconto = new JLabel("Desconto ");
        lblDesconto.setBounds(470, 60, 130, 22);
        painelVendedor.add(lblDesconto);
        
        
         txtDesconto = new JTextField();
        txtDesconto.setBounds(470, 80, 100, 22);
        painelVendedor.add(txtDesconto);
        
        
           //----------------------------------------//
         
         lblAdiantamento = new JLabel("Adiantamento ");
        lblAdiantamento.setBounds(360, 110, 130, 22);
        painelVendedor.add(lblAdiantamento);
        
        
         txtAdiantamento = new JTextField();
        txtAdiantamento.setBounds(360, 130, 100, 22);
        painelVendedor.add(txtAdiantamento);
        
        
          //----------------------------------------//
         
         lblTotal = new JLabel("Total ");
        lblTotal.setBounds(470, 110, 130, 22);
        painelVendedor.add(lblTotal);
        
        
         txtTotal = new JTextField();
        txtTotal.setBounds(470, 130, 100, 22);
        painelVendedor.add(txtTotal);
        
        
           //-------------------------------------------------------------------------------------------// 
        btnGravar = new JButton("Gravar");
       btnGravar.setBounds(100, 590, 100, 35);       
       btnGravar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));      
       btnGravar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnGravar.setFont(new Font("Arial", 1, 13));
        
       painelPrincipal.add(btnGravar);
   //-------------------------------------------------------------------------------------------// 
   
   
   //-------------------------------------------------------------------------------------------// 
        btnConsultar = new JButton("Consultar");
       btnConsultar.setBounds(210, 590, 100, 35);       
       btnConsultar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/consulta.png"));      
       btnConsultar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnConsultar.setFont(new Font("Arial", 1, 13));
        
       painelPrincipal.add(btnConsultar);
   //-------------------------------------------------------------------------------------------// 
   
   
   //-------------------------------------------------------------------------------------------// 
        btnCancelar = new JButton("Cancelar");
       btnCancelar.setBounds(320, 590, 100, 35);       
       btnCancelar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));      
       btnCancelar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnCancelar.setFont(new Font("Arial", 1, 13));
        
       painelPrincipal.add(btnCancelar);
   //-------------------------------------------------------------------------------------------// 
   
   
   //-------------------------------------------------------------------------------------------// 
        btnSair = new JButton("Sair");
       btnSair.setBounds(430, 590, 100, 35);       
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

       
        modelo.addColumn("Descrição Produto");
         modelo.addColumn("Quantidade");
        modelo.addColumn("Vlr Unitario");
        modelo.addColumn("Vlr Total");
     

        tblProduto = new JTable();
        tblProduto.setModel(modelo);
        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(300);
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(90);
        tblProduto.getColumnModel().getColumn(2).setPreferredWidth(90);
        tblProduto.getColumnModel().getColumn(3).setPreferredWidth(90);
        

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
        scrollTable.setBounds(10, 80, 580, 200);
        tblProduto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelPrincipal.add(scrollTable);
    }
      
}
