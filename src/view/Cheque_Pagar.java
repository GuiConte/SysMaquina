
package view;

import java.awt.Font;
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


public class Cheque_Pagar {
    
     private JFrame janela;
    private JPanel painelPrincipal, painelCidade;
    private JLabel lblNumeroCheque, lblCI, lblDescontoTab, lblValorOriginal, lblValorAberto, lblValorCheque, lblDesconto, lblSaldo;
    private JTextField txtNumeroCheque, txtCI, txtDescontoTab, txtValorOriginal, txtValorAberto, txtValorCheque, txtDesconto, txtSaldo;
    private JButton btnPesquisar, btnAdicionar, btnRemover, btnGravar;
    private JRadioButton rdDivinolandia, rdSacramento;
    private ButtonGroup groupCidade;
    private JTable tblCheque, tblDesconto;
    private JScrollPane scrollTable;
    private DefaultTableModel modelo;
    
    
     public void desenharTela() {  
        janela = new JFrame("Cheque a Pagar");
        janela.setSize(990, 585);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);        

        
        
        
        

        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(965, 540);
        painelPrincipal.setLocation(5, 5);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        
        
        
          lblNumeroCheque = new JLabel("Nº Cheque ");
        lblNumeroCheque.setBounds(10, 20, 80, 22);
        painelPrincipal.add(lblNumeroCheque);
        
        txtNumeroCheque = new JTextField();
        txtNumeroCheque.setBounds(80, 20, 100, 22);
        painelPrincipal.add(txtNumeroCheque);
        
   //-----------------------------------------------------------------------//
        
  //-------------------------------------------------------------------------------------------// 
        btnPesquisar = new JButton("Pesquisar");
       btnPesquisar.setBounds(190, 20, 80, 23);       
       btnPesquisar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));      
       btnPesquisar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnPesquisar.setFont(new Font("Arial", 1, 9));
        
       painelPrincipal.add(btnPesquisar);
   //-------------------------------------------------------------------------------------------// 
    
   
        
        //-------------------------------------------------------------------------------------------//
   
      
          lblCI = new JLabel("C.I Compra ");
        lblCI.setBounds(870, 10, 120, 22);
        painelPrincipal.add(lblCI);
        
        txtCI = new JTextField();
        txtCI.setBounds(860, 30, 100, 22);
        painelPrincipal.add(txtCI);
        
        
        //-------------------------------------------------------------------------------------------// 
   
   
       painelCidade = new JPanel();
        painelCidade.setLayout(null);
        painelCidade.setSize(200, 40);
        painelCidade.setLocation(280, 10);
        painelCidade.setBorder(BorderFactory.createTitledBorder(""));
        painelPrincipal.add(painelCidade);
   
   
   //--------------------------------------------------------------------------------------------//
   
   
        rdDivinolandia = new JRadioButton("Divinolândia");
        rdDivinolandia.setBounds(2, 10, 100, 25);
        rdDivinolandia.setFont(new Font("Arial", 0, 11));
        painelCidade.add(rdDivinolandia);
        
        rdSacramento = new JRadioButton("Sacramento");
        rdSacramento.setBounds(100, 10, 90, 25);
        rdSacramento.setFont(new Font("Arial", 0, 11));
        painelCidade.add(rdSacramento);
        
        groupCidade = new ButtonGroup();
        groupCidade.add(rdDivinolandia);
        groupCidade.add(rdSacramento);
   
   
   //-------------------------------------------------------------------------------------------//
   
      
          lblDescontoTab = new JLabel("Desconto ");
        lblDescontoTab.setBounds(10, 280, 80, 22);
        painelPrincipal.add(lblDescontoTab);
        
        txtDescontoTab = new JTextField();
        txtDescontoTab.setBounds(10, 300, 100, 22);
        painelPrincipal.add(txtDescontoTab);
        
        
        //-------------------------------------------------------------------------------------------// 
        btnAdicionar = new JButton("Adicionar");
       btnAdicionar.setBounds(115, 300, 90, 23);       
       btnAdicionar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/incluir.png"));      
       btnAdicionar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnAdicionar.setFont(new Font("Arial", 1, 10));
        
       painelPrincipal.add(btnAdicionar);
   //-------------------------------------------------------------------------------------------// 
   
   
     //-------------------------------------------------------------------------------------------// 
        btnRemover = new JButton("Remover");
       btnRemover.setBounds(230, 300, 90, 23);       
       btnRemover.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/excluir2.png"));      
       btnRemover.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnRemover.setFont(new Font("Arial", 1, 10));
        
       painelPrincipal.add(btnRemover);
   //-------------------------------------------------------------------------------------------// 
        
        
          
   //-------------------------------------------------------------------------------------------//
   
      
          lblValorOriginal = new JLabel("Valor Original ");
        lblValorOriginal.setBounds(870, 280, 120, 22);
        painelPrincipal.add(lblValorOriginal);
        
        txtValorOriginal = new JTextField();
        txtValorOriginal.setBounds(860, 300, 100, 22);
        painelPrincipal.add(txtValorOriginal);
        
        
        //-------------------------------------------------------------------------------------------// 
        
        //-------------------------------------------------------------------------------------------//
   
      
          lblValorAberto = new JLabel("Valor Aberto ");
        lblValorAberto.setBounds(870, 320, 120, 22);
        painelPrincipal.add(lblValorAberto);
        
        txtValorAberto = new JTextField();
        txtValorAberto.setBounds(860, 340, 100, 22);
        painelPrincipal.add(txtValorAberto);
        
        
        //-------------------------------------------------------------------------------------------// 
        
        //-------------------------------------------------------------------------------------------//
   
      
          lblValorCheque = new JLabel("Valor Cheque ");
        lblValorCheque.setBounds(870, 360, 120, 22);
        painelPrincipal.add(lblValorCheque);
        
        txtValorCheque = new JTextField();
        txtValorCheque.setBounds(860, 380, 100, 22);
        painelPrincipal.add(txtValorCheque);
        
        
        //-------------------------------------------------------------------------------------------// 
        
        
        //-------------------------------------------------------------------------------------------//
   
      
          lblDesconto = new JLabel("Desconto ");
        lblDesconto.setBounds(870, 400, 120, 22);
        painelPrincipal.add(lblDesconto);
        
        txtDesconto = new JTextField();
        txtDesconto.setBounds(860, 420, 100, 22);
        painelPrincipal.add(txtDesconto);
        
        
        //-------------------------------------------------------------------------------------------// 
        
        
        
          
        //-------------------------------------------------------------------------------------------//
   
      
          lblSaldo = new JLabel("Saldo ");
        lblSaldo.setBounds(870, 440, 120, 22);
        painelPrincipal.add(lblSaldo);
        
        txtSaldo = new JTextField();
        txtSaldo.setBounds(860, 460, 100, 22);
        painelPrincipal.add(txtSaldo);
        
        
        
          //-------------------------------------------------------------------------------------------// 
        btnGravar = new JButton("Gravar");
       btnGravar.setBounds(840, 500, 120, 33);       
       btnGravar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar.png"));      
       btnGravar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnGravar.setFont(new Font("Arial", 1, 14));
        
       painelPrincipal.add(btnGravar);
   //-------------------------------------------------------------------------------------------// 
        
        //-------------------------------------------------------------------------------------------// 
        
        criarTabela();
        criarTabelaDesconto();
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

        modelo.addColumn("Data");
        modelo.addColumn("N°Seq");
         modelo.addColumn("Bom para");
        modelo.addColumn("N°Cheque");
        modelo.addColumn("N°Conta");
        modelo.addColumn("Valor");
        modelo.addColumn("Saldo");
        modelo.addColumn("Banco");
        modelo.addColumn("Data Destino");
        modelo.addColumn("Destino");
        modelo.addColumn("Referência");
        modelo.addColumn("Verso do Cheque");
         modelo.addColumn("OBS");
        
     

        tblCheque = new JTable();
        tblCheque.setModel(modelo);
        tblCheque.getColumnModel().getColumn(0).setPreferredWidth(80);
        tblCheque.getColumnModel().getColumn(1).setPreferredWidth(80);
        tblCheque.getColumnModel().getColumn(2).setPreferredWidth(80);
        tblCheque.getColumnModel().getColumn(3).setPreferredWidth(80);
        tblCheque.getColumnModel().getColumn(4).setPreferredWidth(80);
        tblCheque.getColumnModel().getColumn(5).setPreferredWidth(80);
        tblCheque.getColumnModel().getColumn(6).setPreferredWidth(80);
        tblCheque.getColumnModel().getColumn(7).setPreferredWidth(200);
        tblCheque.getColumnModel().getColumn(8).setPreferredWidth(80);
        tblCheque.getColumnModel().getColumn(9).setPreferredWidth(200);
        tblCheque.getColumnModel().getColumn(10).setPreferredWidth(200);
        tblCheque.getColumnModel().getColumn(11).setPreferredWidth(200);
        tblCheque.getColumnModel().getColumn(12).setPreferredWidth(200);
        

        tblCheque.getTableHeader().setResizingAllowed(false);
        tblCheque.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblCheque.getTableHeader();
        cabecalho.setFont(new Font("Arial", 1, 11));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.RIGHT);
        tblCheque.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblCheque.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        

        tblCheque.setFont(new Font("Arial", 0, 11));

        scrollTable = new JScrollPane(tblCheque,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(10, 65, 950, 200);
        tblCheque.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelPrincipal.add(scrollTable);
    }
      

 private void criarTabelaDesconto() {
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        modelo.addColumn("N°SeqCheque");
        modelo.addColumn("N°Cheque");
        modelo.addColumn("Valor");
        modelo.addColumn("Valor Utilizado");
        modelo.addColumn("Desconto");
        
        
     

        tblDesconto = new JTable();
        tblDesconto.setModel(modelo);
        tblDesconto.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblDesconto.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblDesconto.getColumnModel().getColumn(2).setPreferredWidth(100);
        tblDesconto.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblDesconto.getColumnModel().getColumn(4).setPreferredWidth(100);
     
        

        tblDesconto.getTableHeader().setResizingAllowed(false);
        tblDesconto.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblDesconto.getTableHeader();
        cabecalho.setFont(new Font("Arial", 1, 11));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.RIGHT);
        tblDesconto.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblDesconto.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        

        tblDesconto.setFont(new Font("Arial", 0, 11));

        scrollTable = new JScrollPane(tblDesconto,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(10, 340, 500, 140);
        tblDesconto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelPrincipal.add(scrollTable);
    }
      

     
}
