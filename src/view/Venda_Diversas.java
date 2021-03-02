
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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.text.MaskFormatter;

public class Venda_Diversas {
    
    private JFrame janela;
    private JPanel painelPrincipal,painelProduto,painelVendedor;
    private JLabel lblData, lblCliente, lblCI, lblProduto, lblQuantidade, lblValorUnitario, lblValorTotal,lblCodCliente, lblVeiculo,lblObservacao, lblPrazo,lblDataVencimento, lblDesconto, lblAdiantamento, lblTotal;
    private JTextField  txtCliente, txtCodCliente, txtCI, txtProduto, txtQuantidade, txtValorUnitario, txtValorTotal, txtObservacao, txtPrazo, txtDesconto, txtAdiantamento, txtTotal;
    private JTable tblProduto;
    private JScrollPane scrollTable;
    private DefaultTableModel modelo;
    private JButton btnConsultaCliente,btnNovo,btnCancelaProd,btnAlterarProd,btnExcluirProd,btnGravaProd, btnSair, btnCancelar, btnConsultar, btnGravar;
    private JComboBox cbVeiculos;
    private JFormattedTextField txtData,txtDataVencimento;
    
      public void desenharTela() throws ParseException {

        janela = new JFrame("Vendas Diversas");
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
        txtData.setBounds(10, 40, 90, 22);
        painelPrincipal.add(txtData);
        
        
         lblCliente = new JLabel("Cliente ");
        lblCliente.setBounds(110, 20, 60, 22);
        painelPrincipal.add(lblCliente);
        
        txtCliente = new JTextField();
        txtCliente.setBounds(110, 40, 260, 22);
        painelPrincipal.add(txtCliente);
        
         lblCodCliente = new JLabel("Cod.Cliente");
        lblCodCliente.setBounds(380, 20, 120, 22);
        painelPrincipal.add(lblCodCliente);
        
        txtCodCliente = new JTextField();
        txtCodCliente.setBounds(380, 40, 60, 22);
        painelPrincipal.add(txtCodCliente);
        
        
        
          //------------BOTAO PESQUISAR PRODUTO ---------------------//
       
       btnConsultaCliente = new JButton();
       btnConsultaCliente.setBounds(450, 40, 20, 20);       
       btnConsultaCliente.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
       btnConsultaCliente.setToolTipText("Pesquisar Cliente");
       btnConsultaCliente.setHorizontalTextPosition(SwingConstants.CENTER);
        btnConsultaCliente.addActionListener((java.awt.event.ActionEvent evt) -> {  
           
           ConsultaCliente_Simplificada consult = new ConsultaCliente_Simplificada();
           consult.desenharTela();
        });
       
        
       painelPrincipal.add(btnConsultaCliente);
        
       //-------------------------------------------------------------------//
       
         lblCI = new JLabel("C.I VDD");
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
       btnGravaProd = new JButton("Gravar");
       btnGravaProd.setBounds(10, 60, 90, 30);  
      btnGravaProd.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));       
       btnGravaProd.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnGravaProd.setFont(new Font("Arial", 1, 13));
        btnGravaProd.addActionListener((java.awt.event.ActionEvent evt) -> { 
           
                       //criarDadosSetor();
        });       
      
        
       painelProduto.add(btnGravaProd);
       
 //-------------------------------------------------------------------------------------------------------------------//
 
 
        // ---------------- BOTAO GRAVAR-----//
       btnCancelaProd = new JButton("Cancelar Prod");
       btnCancelaProd.setBounds(110,60, 90, 30);  
       btnCancelaProd.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));       
       btnCancelaProd.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnCancelaProd.setFont(new Font("Arial", 1, 13));
        
       painelProduto.add(btnCancelaProd);
       
  //-------------------------------------------------------------------------------------------------------------------//
  
  
         // ---------------- BOTAO GRAVAR-----//
       btnNovo = new JButton("Novo");
       btnNovo.setBounds(210, 60, 90, 30);  
      btnNovo.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/incluir.png"));       
       btnNovo.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnNovo.setFont(new Font("Arial", 1, 13));
        
       painelProduto.add(btnNovo);
       
   //-------------------------------------------------------------------------------------------------------------------//
   
   
        // ---------------- BOTAO GRAVAR-----//
       btnAlterarProd = new JButton("Alterar");
       btnAlterarProd.setBounds(310, 60, 90, 30);  
       btnAlterarProd.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/alterar2.png"));       
       btnAlterarProd.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnAlterarProd.setFont(new Font("Arial", 1, 13));
        
       painelProduto.add(btnAlterarProd);
    //-------------------------------------------------------------------------------------------------------------------//
    
    
        btnExcluirProd = new JButton("Excluir");
       btnExcluirProd.setBounds(410, 60, 90, 30);  
       btnExcluirProd.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/excluir2.png"));       
       btnExcluirProd.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnExcluirProd.setFont(new Font("Arial", 1, 13));
        
       painelProduto.add(btnExcluirProd);
       
       
       
       
       
       
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
        
        
         txtObservacao = new JTextField();
        txtObservacao.setBounds(10, 80, 280, 90);
        painelVendedor.add(txtObservacao);
        
        
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
        txtDataVencimento.setBounds(360, 80, 90, 22);
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
        
        
        
          // ---------------- BOTAO GRAVAR-----//
        btnGravar = new JButton("Gravar");
       btnGravar.setBounds(100, 600, 100, 35);       
        btnGravar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));       
       btnGravar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnGravar.setFont(new Font("Arial", 1, 13));
        
       painelPrincipal.add(btnGravar);
        
          // ---------------- BOTAO CANCELAR-----//
       btnCancelar = new JButton("Cancelar");
       btnCancelar.setBounds(210, 600, 100, 35);       
       btnCancelar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));       
       btnCancelar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnCancelar.setFont(new Font("Arial", 1, 13));
        
       painelPrincipal.add(btnCancelar);
       
       
        // ---------------- BOTAO CANCELAR-----//
       btnConsultar = new JButton("Consultar");
       btnConsultar.setBounds(320, 600, 100, 35);       
       btnConsultar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/consulta.png"));       
       btnConsultar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnConsultar.setFont(new Font("Arial", 1, 13));
        
       painelPrincipal.add(btnConsultar);
        
         // ---------------- BOTAO SAIR-----//
       btnSair = new JButton("Sair");
       btnSair.setBounds(430, 600, 100, 35);       
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
