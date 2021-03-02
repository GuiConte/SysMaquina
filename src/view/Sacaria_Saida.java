

package view;

import java.awt.Color;
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


public class Sacaria_Saida {
       
    private JFrame janela;
    private JPanel painelPrincipal, painelEstoque;
    private JLabel lblData,  lblCliente,lblSaidaNun,  lblEstoque;
    private JTextField  txtCliente, txtCodCliente, txtSaidaNun, txtQTDEstoque;
    private JButton btnConsultaCliente, btnGravarSacaria, btnAlterarSacaria, btnCancelarSacaria, btnExcluir;
     private JButton btnSair, btnCancelar, btnGravar, btnConsultar;
    private JComboBox cbEstoque;
    private JTable tblEstoque;
    private JScrollPane scrollTable;
    private DefaultTableModel modelo;    
    private JLabel lblDescricao, lblQuantidade, lblVlrUnitario, lblValorTotal, lblCodigo, lblTotalGeral;
    private JTextField txtDescricao, txtCodigo, txtQuantidade, txtVlrUnitario, txtValorTotal, txtTotalGeral;
    private JFormattedTextField txtData;

 public void desenharTela() throws ParseException {

        janela = new JFrame("Venda/ Saida de Sacaria");
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
        
         lblData = new JLabel("Data ");
        lblData.setBounds(10, 20, 60, 22);
        painelPrincipal.add(lblData);
        
        txtData = new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtData.setBounds(10, 40, 80, 22);
        painelPrincipal.add(txtData);
        
        
        
         //-------------------------------------------------------------------------------------------//   
   
        
         //-------------------------------------------------------------------------------------------//   
        
         lblCliente = new JLabel("Cliente");
        lblCliente.setBounds(100, 20, 120, 22);
        painelPrincipal.add(lblCliente);
        
        txtCliente = new JTextField();
        txtCliente.setBounds(100, 40, 320, 22);
        painelPrincipal.add(txtCliente);
        
        txtCodCliente = new JTextField();
        txtCodCliente.setBounds(425, 40, 40, 22);
        painelPrincipal.add(txtCodCliente);
      //----------------------------------------------//  
        
      btnConsultaCliente = new JButton();
       btnConsultaCliente.setBounds(470, 40, 20, 20);       
       btnConsultaCliente.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
       btnConsultaCliente.setToolTipText("Pesquisar Cliente");
       btnConsultaCliente.setHorizontalTextPosition(SwingConstants.CENTER);
        btnConsultaCliente.addActionListener((java.awt.event.ActionEvent evt) -> {  
           
           ConsultaCliente_Simplificada consult = new ConsultaCliente_Simplificada();
           consult.desenharTela();
        });
        
       painelPrincipal.add(btnConsultaCliente);

       
        //-------------------------------------------------------------------------------------------//   
        
         lblSaidaNun = new JLabel("Saida N°");
        lblSaidaNun.setBounds(500, 20, 120, 22);
        painelPrincipal.add(lblSaidaNun);
        
        txtSaidaNun = new JTextField();
        txtSaidaNun.setBounds(500, 40, 100, 22);
        painelPrincipal.add(txtSaidaNun);
        
        
       
       
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
       btnCancelarSacaria.setFont(new Font("Arial", 1, 13));
        btnCancelarSacaria.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelEstoque.add(btnCancelarSacaria);
   //-------------------------------------------------------------------------------------------//  
   
   
    //-------------------------------------------------------------------------------------------// 
        btnAlterarSacaria = new JButton("Alterar");
       btnAlterarSacaria.setBounds(230, 320, 100, 27);       
       btnAlterarSacaria.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/alterar2.png"));      
        btnAlterarSacaria.setFont(new Font("Arial", 1, 13));
        btnAlterarSacaria.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelEstoque.add(btnAlterarSacaria);
   //-------------------------------------------------------------------------------------------//  
       
        //-------------------------------------------------------------------------------------------// 
        btnExcluir = new JButton("Excluir");
       btnExcluir.setBounds(340, 320, 100, 27);       
       btnExcluir.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/excluir2.png"));
        btnExcluir.setFont(new Font("Arial", 1, 13));
        btnExcluir.setHorizontalTextPosition(SwingConstants.RIGHT);
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
        btnConsultar.setFont(new Font("Arial", 1, 13));
        btnConsultar.setHorizontalTextPosition(SwingConstants.RIGHT);
       painelPrincipal.add(btnConsultar);
   //-------------------------------------------------------------------------------------------// 
   
   
   //-------------------------------------------------------------------------------------------// 
        btnCancelar = new JButton("Cancelar");
       btnCancelar.setBounds(420, 490, 100, 35);       
       btnCancelar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));    
       btnCancelar.setFont(new Font("Arial", 1, 13));
       btnCancelar.setHorizontalTextPosition(SwingConstants.RIGHT);
        
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
        modelo.addColumn("Setor");
        modelo.addColumn("Cod Produto");
     

        tblEstoque = new JTable();
        tblEstoque.setModel(modelo);
        tblEstoque.getColumnModel().getColumn(0).setPreferredWidth(90);
        tblEstoque.getColumnModel().getColumn(1).setPreferredWidth(300);
        tblEstoque.getColumnModel().getColumn(2).setPreferredWidth(90);
        tblEstoque.getColumnModel().getColumn(3).setPreferredWidth(90);
        tblEstoque.getColumnModel().getColumn(4).setPreferredWidth(90);
        tblEstoque.getColumnModel().getColumn(5).setPreferredWidth(170);
        

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
    

