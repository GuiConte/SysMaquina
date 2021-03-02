
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


public class Venda_Combustivel {
    
        
    private JFrame janela;
    private JPanel painelPrincipal, painelProduto;
    private JLabel lblData, lblEstoque, lblDespesa, lblCentro, lblMotorista, lblDataVencimento, lblPrazo;
    private JLabel lblProduto, lblQuantidade, lblCusto, lblValorTotal;
    private JComboBox cbEstoque, cbDespesa, cbCentro;
    private JTextField   txtProduto, txtCodProduto, txtQuantidade, txtCusto, txtValorTotal, txtMotorista, txtCodMotorista, txtPrazo ;
    private JTable tblProduto;
    private JScrollPane scrollTable;
    private DefaultTableModel modelo;
    private JButton btnConsultaProduto, btnGravarProduto, btnExcluirProduto, btnAlteraProduto, btnGravar, btnSair, btnConsultar, btnCancelar, btnConsultaMotorista;
    private JFormattedTextField txtData,txtDataVencimento;
    
    
     public void desenharTela() throws ParseException {

        janela = new JFrame("Combustível");
        janela.setSize(670, 520);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);

        

        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(650, 480);
        painelPrincipal.setLocation(5, 5);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        
        
    //-----------------------------------------------------------------------//    
         lblData = new JLabel("Data ");
        lblData.setBounds(13, 10, 60, 22);
        painelPrincipal.add(lblData);
        
        txtData = new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtData.setBounds(10, 30, 80, 22);
        painelPrincipal.add(txtData);
        
  //-----------------------------------------------------------------------//    
         lblMotorista = new JLabel("Motorista ");
        lblMotorista.setBounds(100, 10, 60, 22);
        painelPrincipal.add(lblMotorista);
        
        txtMotorista = new JTextField();
        txtMotorista.setBounds(100, 30, 290, 22);
        painelPrincipal.add(txtMotorista);
        
        
        
   //-----------------------------------------------------------------------//    
       
        txtCodMotorista = new JTextField();
        txtCodMotorista.setBounds(395, 30, 40, 22);
        painelPrincipal.add(txtCodMotorista);
        
        
        
    //------------BOTAO PESQUISAR MOTORISTA ---------------------//
       
       btnConsultaMotorista = new JButton();
       btnConsultaMotorista.setBounds(440, 30, 20, 20);       
       btnConsultaMotorista.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
       btnConsultaMotorista.setToolTipText("Pesquisar Motorista");
       btnConsultaMotorista.setHorizontalTextPosition(SwingConstants.CENTER);
        
       painelPrincipal.add(btnConsultaMotorista);
        
    //-----------------------------------------------------------------------//   
    
         lblDataVencimento = new JLabel(" Vencimento");
        lblDataVencimento.setBounds(10, 60, 80, 22);
        painelPrincipal.add(lblDataVencimento);
        
        txtDataVencimento =new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtDataVencimento.setBounds(10, 80, 80, 22);
        painelPrincipal.add(txtDataVencimento);
        
  //-----------------------------------------------------------------------//   
  
  
        lblPrazo = new JLabel(" Prazo");
        lblPrazo.setBounds(100, 60, 80, 22);
        painelPrincipal.add(lblPrazo);
        
        txtPrazo = new JTextField();
        txtPrazo.setBounds(100, 80, 50, 22);
        painelPrincipal.add(txtPrazo);
        
  //-----------------------------------------------------------------------
  
  
  
        lblEstoque = new JLabel("Estoque ");
        lblEstoque.setBounds(160,60 ,60, 22);
        painelPrincipal.add(lblEstoque);
        
        cbEstoque = new JComboBox();
        cbEstoque.setBounds(160, 80, 160, 22);
        painelPrincipal.add(cbEstoque);
        
        
  //-----------------------------------------------------------------------//      
     
        
        lblDespesa = new JLabel("Despesa ");
        lblDespesa.setBounds(330, 60, 60, 22);
        painelPrincipal.add(lblDespesa);
        
        cbDespesa = new JComboBox();
        cbDespesa.setBounds(330, 80, 160, 22);
        painelPrincipal.add(cbDespesa);
        
        
     //-----------------------------------------------------------------------//
        
        lblCentro = new JLabel("Centro ");
        lblCentro.setBounds(500, 60, 60, 22);
        painelPrincipal.add(lblCentro);
        
        cbCentro = new JComboBox();
        cbCentro.setBounds(500, 80, 130, 22);
        painelPrincipal.add(cbCentro);
        
        
     
        
        
        
       
        
        
   //----------------------------------------------------------------------//     
        
        painelProduto = new JPanel();
        painelProduto.setLayout(null);
        painelProduto.setSize(630, 320);
        painelProduto.setLocation(5, 110);
        painelProduto.setBorder(BorderFactory.createTitledBorder(""));
        painelPrincipal.add(painelProduto);
        
        
         //---------------------------------------------------------------//
         
         lblProduto = new JLabel("Produto ");
        lblProduto.setBounds(10, 10, 140, 22);
        painelProduto.add(lblProduto);
        
        txtProduto = new JTextField();
        txtProduto.setBounds(10, 30, 370, 22);
        painelProduto.add(txtProduto);
        
        
          //---------------------------------------------------------------//
        
        txtCodProduto = new JTextField();
        txtCodProduto.setBounds(390, 30, 40, 22);
        painelProduto.add(txtCodProduto);
        
        
        
        
        
         //---------------------------------------------------------------//
         
         lblQuantidade = new JLabel("Quantidade ");
        lblQuantidade.setBounds(10, 60, 140, 22);
        painelProduto.add(lblQuantidade);
        
        txtQuantidade = new JTextField();
        txtQuantidade.setBounds(10, 80, 120, 22);
        painelProduto.add(txtQuantidade);
        
        
        
        
         //---------------------------------------------------------------//
         
         lblCusto = new JLabel("Custo ");
        lblCusto.setBounds(140, 60, 140, 22);
        painelProduto.add(lblCusto);
        
        txtCusto = new JTextField();
        txtCusto.setBounds(140, 80, 120, 22);
        painelProduto.add(txtCusto);
        
       
        
         //---------------------------------------------------------------//
         
         lblValorTotal = new JLabel("Valor Total ");
        lblValorTotal.setBounds(270, 60, 140, 22);
        painelProduto.add(lblValorTotal);
        
        txtValorTotal = new JTextField();
        txtValorTotal.setBounds(270, 80, 120, 22);
        painelProduto.add(txtValorTotal);
        
        
        
          //------------BOTAO PESQUISAR PRODUTO ---------------------//
       
       btnConsultaProduto = new JButton();
       btnConsultaProduto.setBounds(440, 30, 20, 20);       
       btnConsultaProduto.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
       btnConsultaProduto.setToolTipText("Pesquisar Produto");
       btnConsultaProduto.setHorizontalTextPosition(SwingConstants.CENTER);
        
       painelProduto.add(btnConsultaProduto);
       
       
         
          //------------BOTAO PESQUISAR PRODUTO ---------------------//
       
          // ---------------- BOTAO GRAVAR-----//
       btnGravarProduto = new JButton("Gravar");
       btnGravarProduto.setBounds(10, 110, 90, 30);  
      btnGravarProduto.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));       
       btnGravarProduto.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnGravarProduto.setFont(new Font("Arial", 1, 13));
        btnGravarProduto.addActionListener((java.awt.event.ActionEvent evt) -> { 
           
                       //criarDadosSetor();
        });       
      
        
       painelProduto.add(btnGravarProduto);
       
 //-------------------------------------------------------------------------------------------------------------------//
 
  
     
       
   //-------------------------------------------------------------------------------------------------------------------//
   
   
        // ---------------- BOTAO GRAVAR-----//
       btnAlteraProduto = new JButton("Alterar");
       btnAlteraProduto.setBounds(105, 110, 90, 30);  
       btnAlteraProduto.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/alterar2.png"));       
       btnAlteraProduto.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnAlteraProduto.setFont(new Font("Arial", 1, 13));
        
       painelProduto.add(btnAlteraProduto);
    //-------------------------------------------------------------------------------------------------------------------//
    
    
        btnExcluirProduto = new JButton("Excluir");
       btnExcluirProduto.setBounds(200, 110, 90, 30);  
       btnExcluirProduto.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/excluir2.png"));       
       btnExcluirProduto.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnExcluirProduto.setFont(new Font("Arial", 1, 13));
        
       painelProduto.add(btnExcluirProduto);
        
       
       
       
         // ---------------- BOTAO GRAVAR-----//
        btnGravar = new JButton("Gravar");
       btnGravar.setBounds(110, 440, 100, 35);       
        btnGravar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));       
       btnGravar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnGravar.setFont(new Font("Arial", 1, 13));
        
       painelPrincipal.add(btnGravar);
        
          // ---------------- BOTAO CANCELAR-----//
       btnCancelar = new JButton("Cancelar");
       btnCancelar.setBounds(220, 440, 100, 35);       
       btnCancelar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));       
       btnCancelar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnCancelar.setFont(new Font("Arial", 1, 13));
        
       painelPrincipal.add(btnCancelar);
       
       
        // ---------------- BOTAO CANCELAR-----//
       btnConsultar = new JButton("Consultar");
       btnConsultar.setBounds(330, 440, 100, 35);       
       btnConsultar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/consulta.png"));       
       btnConsultar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnConsultar.setFont(new Font("Arial", 1, 13));
        
       painelPrincipal.add(btnConsultar);
        
         // ---------------- BOTAO SAIR-----//
       btnSair = new JButton("Sair");
       btnSair.setBounds(440, 440, 100, 35);       
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
        modelo.addColumn("Custo");
        modelo.addColumn("Total");
     

        tblProduto = new JTable();
        tblProduto.setModel(modelo);
        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(60);
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(280);
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
        scrollTable.setBounds(10, 160, 600, 150);
        tblProduto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelProduto.add(scrollTable);
    }
     
    
    
    
    
    
}
