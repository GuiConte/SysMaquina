
package view;

import java.awt.Font;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
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


public class FluxoReceber {
  
    private JFrame janela, janelaNovo;
    private JTable tblReceber;
    private JScrollPane scrollTable;
    private DefaultTableModel modelo;
    private JPanel painelPrincipal, painelData, painelContas, painelNovo;
    private JButton btnVisualizar, btnPesquisar, btnNovo, btnAlterar, btnExcluir, btnConsultarCliente, btnConsultaCliente, btnSalvarNovo, btnSairNovo;
    private JComboBox cbDataInicial, cbDataFinal, cbReceita, cbBaixa;
    private JTextField txtCliente, txtCodCliente,txtTotalPago, txtTotalReceber, txtTotalGeral, txtCI;
    private JLabel lblA, lblCliente, lblReceita, lblBaixa, lblTotalPago, lblTotalReceber, lblTotalGeral ,lblCI;
    private JLabel lblData, lblVencimento, lblClienteNovo, lblTotalPagar, lblObservacao;
    private JFormattedTextField txtData, txtVencimento;
    private JTextField txtClienteNovo, txtCodClienteNovo, txtTotalPagar, txtObservacao;
    
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
        
         lblCliente = new JLabel("Cliente");
        lblCliente.setBounds(10, 390, 80, 22);
        painelPrincipal.add(lblCliente);
        
        
         txtCliente = new JTextField();
        txtCliente.setBounds(10, 410, 350, 22);
        painelPrincipal.add(txtCliente);
      
        txtCodCliente = new JTextField();
        txtCodCliente.setBounds(370, 410, 40, 22);
        painelPrincipal.add(txtCodCliente);
        
             
       btnConsultarCliente = new JButton();
       btnConsultarCliente.setBounds(415, 410, 22, 22);       
       btnConsultarCliente.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
       btnConsultarCliente.setToolTipText("Pesquisar Cliente");
       btnConsultarCliente.setHorizontalTextPosition(SwingConstants.CENTER);
        
       painelPrincipal.add(btnConsultarCliente);
        
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
        btnVisualizar.setBounds(550, 470, 105, 35);
        btnVisualizar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/visualizar.png"));
        btnVisualizar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnVisualizar.setFont(new Font("Arial", 1, 13));
        btnVisualizar.addActionListener((java.awt.event.ActionEvent evt)->{
            
        });
        painelPrincipal.add(btnVisualizar);
         
        btnPesquisar = new JButton("Pesquisar");
        btnPesquisar.setBounds(430, 470, 105, 35);
        btnPesquisar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/procurar.png"));
        btnPesquisar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnPesquisar.setFont(new Font("Arial", 1, 13));
        btnPesquisar.addActionListener((java.awt.event.ActionEvent evt) -> {  
           
        });
        painelPrincipal.add(btnPesquisar);
        
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
        modelo.addColumn("Cod Cli");
        modelo.addColumn("Cliente");
        modelo.addColumn("Valor");
        modelo.addColumn("Data Baixa");
         modelo.addColumn("Tipo da Receita");
        modelo.addColumn("Observação");
       
       

        tblReceber = new JTable();
        tblReceber.setModel(modelo);
        tblReceber.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblReceber.getColumnModel().getColumn(1).setPreferredWidth(80);
        tblReceber.getColumnModel().getColumn(2).setPreferredWidth(60);
        tblReceber.getColumnModel().getColumn(3).setPreferredWidth(300);
        tblReceber.getColumnModel().getColumn(4).setPreferredWidth(80);
        tblReceber.getColumnModel().getColumn(5).setPreferredWidth(80);
        tblReceber.getColumnModel().getColumn(6).setPreferredWidth(160);
        tblReceber.getColumnModel().getColumn(7).setPreferredWidth(170);
       

        tblReceber.getTableHeader().setResizingAllowed(false);
        tblReceber.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblReceber.getTableHeader();
        cabecalho.setFont(new Font("Arial", 0, 12));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblReceber.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblReceber.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        tblReceber.getColumnModel().getColumn(2).setCellRenderer(centralizaColunas);
        tblReceber.getColumnModel().getColumn(3).setCellRenderer(centralizaColunas);

        tblReceber.setFont(new Font("Arial", 0, 12));

        scrollTable = new JScrollPane(tblReceber,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(10, 20, 985, 280);
        tblReceber.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
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
        
        lblClienteNovo = new JLabel("Clientes");
        lblClienteNovo.setBounds(10, 60, 80, 22);
        painelNovo.add(lblClienteNovo);
        
        
         txtClienteNovo = new JTextField();
        txtClienteNovo.setBounds(10, 80, 250, 22);
        painelNovo.add(txtClienteNovo);
        
        
          txtCodClienteNovo = new JTextField();
        txtCodClienteNovo.setBounds(265, 80, 40, 22);
        painelNovo.add(txtCodClienteNovo);
        
               
       btnConsultaCliente = new JButton();
       btnConsultaCliente.setBounds(310, 80, 22, 22);       
       btnConsultaCliente.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
       btnConsultaCliente.setToolTipText("Pesquisar Cliente");
       btnConsultaCliente.setHorizontalTextPosition(SwingConstants.CENTER);
        
       painelNovo.add(btnConsultaCliente);
        
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
    
    
    
    

