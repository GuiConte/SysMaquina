
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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.text.MaskFormatter;


public class Consulta_NFE {
    
    private JFrame janela, janelaParcela, janelaProduto;
    private JPanel painelPrincipal, painelSelecao, painelParcela, painelProduto;
    private JLabel lblData, Motorista, lblEmpresa, lblSaida, lblMotorista, lblParcela, lblProdutos;
    private JTextField txtNota, txtCliente, txtMotorista, txtSaida;
    private JFormattedTextField txtData;
    private JRadioButton rdData, rdNota, rdCliente;
    private JComboBox cbEmpresa;
     private JTable tblNota, tblParcela, tblProduto;
    private JScrollPane scrollTable;
    private DefaultTableModel modelo;
    private ButtonGroup groupSelecao;
    private JButton btnParcelas, btnAlterar, btnConsultarProduto, btnImprimir, btnExcluir, btnSair, btnSairParcela, btnSairProduto;
    
      public void desenharTela() throws ParseException {

        janela = new JFrame("Consultar Nota Fiscal");
        janela.setSize(940, 495);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
                
//----------------------------------------------------------------------------//


        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(920, 450);
        painelPrincipal.setLocation(5, 5);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        
        
        
        //----------------------------------------------------------------------------//


        painelSelecao = new JPanel();
        painelSelecao.setLayout(null);
        painelSelecao.setSize(180, 140);
        painelSelecao.setLocation(5, 300);
        painelSelecao.setBorder(BorderFactory.createTitledBorder("Seleção"));
       
        
     //--------------------------------------------------------------------------------------//   
        rdData= new JRadioButton("Data");
        rdData.setBounds(5,20,80,22);
        painelSelecao.add(rdData);
        
         txtData =new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
         txtData.setBounds(90, 20, 80, 22);
         painelSelecao.add(txtData);
        
   //--------------------------------------------------------------------------------------//     
        
        rdNota= new JRadioButton("Nota");
        rdNota.setBounds(5,60,80,22);
        painelSelecao.add(rdNota);
        
         txtNota =new JTextField();
         txtNota.setBounds(90, 60, 80, 22);
         painelSelecao.add(txtNota);
  //--------------------------------------------------------------------------------------//      
         rdCliente= new JRadioButton("Cliente");
        rdCliente.setBounds(5,100,80,22);
        painelSelecao.add(rdCliente);
      
          
         txtCliente =new JTextField();
         txtCliente.setBounds(90, 100, 80, 22);
         painelSelecao.add(txtCliente);
         
         groupSelecao = new ButtonGroup();
         groupSelecao.add(rdData);
         groupSelecao.add(rdNota);
         groupSelecao.add(rdCliente);
          painelPrincipal.add(painelSelecao);
//--------------------------------------------------------------------------------------//


        lblEmpresa = new JLabel("Empresa");
        lblEmpresa.setBounds(200, 300, 120, 22);
        painelPrincipal.add(lblEmpresa);

       cbEmpresa = new JComboBox();
       cbEmpresa.setBounds(200, 320, 240, 22);
       painelPrincipal.add(cbEmpresa);



//--------------------------------------------------------------------------------------//


        lblMotorista = new JLabel("Motorista/Placa");
        lblMotorista.setBounds(460, 300, 120, 22);
        painelPrincipal.add(lblMotorista);

       txtMotorista = new JTextField();
       txtMotorista.setBounds(460, 320, 120, 22);
       painelPrincipal.add(txtMotorista);


       
       //--------------------------------------------------------------------------------------//


        lblSaida = new JLabel("Saida:");
        lblSaida.setBounds(620, 300, 120, 22);
        lblSaida.setFont( new Font("Arial", 1, 15));
        lblSaida.setForeground(Color.blue);
        painelPrincipal.add(lblSaida);

       txtSaida = new JTextField();
       txtSaida.setBounds(620, 320, 100, 22);
       txtSaida.setForeground(Color.blue);
       painelPrincipal.add(txtSaida);


   //--------------------------------------------------------------------------------------//    
       
       
          // ---------------- BOTAO -----//
        btnParcelas = new JButton("Ver Parcelas");
        btnParcelas.setBounds(780, 290, 120, 27);
        btnParcelas.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/visualizar.png"));
        btnParcelas.setFont(new Font("Arial", 1, 11));
        btnParcelas.setHorizontalTextPosition(SwingConstants.RIGHT);
         btnParcelas.addActionListener((java.awt.event.ActionEvent evt) -> {
           
            CriarParcela();
            
        });
        painelPrincipal.add(btnParcelas);
        
        
          
        // ---------------- BOTAO -----//
        btnAlterar = new JButton("Alterar");
        btnAlterar.setBounds(250, 410, 120, 35);
        btnAlterar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/alterar2.png"));
        btnAlterar.setFont(new Font("Arial", 1, 13));
        btnAlterar.setHorizontalTextPosition(SwingConstants.RIGHT);
         btnAlterar.addActionListener((java.awt.event.ActionEvent evt) -> {
           
            
        });
        
        
        painelPrincipal.add(btnAlterar);

        // ---------------- BOTAO -----//
        btnConsultarProduto = new JButton("Ver Prod(F3)");
        btnConsultarProduto.setBounds(380, 410, 120, 35);
        btnConsultarProduto.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/visualizar.png"));
        btnConsultarProduto.setFont(new Font("Arial", 1, 13));
        btnConsultarProduto.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnConsultarProduto.addActionListener((java.awt.event.ActionEvent evt) -> {
            
            CriarProduto();
        });

        painelPrincipal.add(btnConsultarProduto);
        
        
         // ---------------- BOTAO -----//
        btnImprimir = new JButton("Imprimir");
        btnImprimir.setBounds(510, 410, 120, 35);
        btnImprimir.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/Imprimir.png"));
        btnImprimir.setFont(new Font("Arial", 1, 13));
        btnImprimir.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnImprimir.addActionListener((java.awt.event.ActionEvent evt) -> {
           
            
        });
        

        painelPrincipal.add(btnImprimir);
        
        
        
           // ---------------- BOTAO -----//
        btnExcluir = new JButton("Excluir");
        btnExcluir.setBounds(640, 410, 120, 35);
        btnExcluir.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/excluir2.png"));
        btnExcluir.setFont(new Font("Arial", 1, 13));
        btnExcluir.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnExcluir.addActionListener((java.awt.event.ActionEvent evt) -> {
           
            
        });
        

        painelPrincipal.add(btnExcluir);

        // ---------------- BOTAO SAIR-----//
        btnSair = new JButton("Sair");
        btnSair.setBounds(770, 410, 120, 35);
        btnSair.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/sair.png"));
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

        modelo.addColumn("NF");
        modelo.addColumn("Emissão");
        modelo.addColumn("Cod.Cliente");
        modelo.addColumn("Cliente");
        modelo.addColumn("Total Nota");
        modelo.addColumn("Parcela");
        modelo.addColumn("Protocolo");
        modelo.addColumn("Chave NFE");
        modelo.addColumn("Recebimento");
        modelo.addColumn("Justificativa");
        modelo.addColumn("Cidade");
      
        
        
       

        tblNota = new JTable();
        tblNota.setModel(modelo);
        tblNota.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblNota.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblNota.getColumnModel().getColumn(2).setPreferredWidth(100);
        tblNota.getColumnModel().getColumn(3).setPreferredWidth(350);
        tblNota.getColumnModel().getColumn(4).setPreferredWidth(130);
        tblNota.getColumnModel().getColumn(5).setPreferredWidth(100);
        tblNota.getColumnModel().getColumn(6).setPreferredWidth(200);
        tblNota.getColumnModel().getColumn(7).setPreferredWidth(350);
        tblNota.getColumnModel().getColumn(8).setPreferredWidth(250);
        tblNota.getColumnModel().getColumn(9).setPreferredWidth(350);
        tblNota.getColumnModel().getColumn(10).setPreferredWidth(200);
        

        tblNota.getTableHeader().setResizingAllowed(false);
        tblNota.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblNota.getTableHeader();
        cabecalho.setFont(new Font("Arial", 0, 12));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblNota.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblNota.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        tblNota.getColumnModel().getColumn(2).setCellRenderer(centralizaColunas);
        tblNota.getColumnModel().getColumn(3).setCellRenderer(centralizaColunas);

        tblNota.setFont(new Font("Arial", 0, 12));

        scrollTable = new JScrollPane(tblNota,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(5, 5, 900, 280);
        tblNota.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelPrincipal.add(scrollTable);
    }
    
   private void CriarParcela(){
       
       
       
       
       
       janelaParcela = new JFrame("Parcelas");
        janelaParcela.setSize(460, 320);
        janelaParcela.setLayout(null);
        janelaParcela.setResizable(false);
        janelaParcela.setLocationRelativeTo(null);
               
//----------------------------------------------------------------------------//


        painelParcela = new JPanel();
        painelParcela.setLayout(null);
        painelParcela.setSize(440, 280);
        painelParcela.setLocation(5, 5);
        painelParcela.setBorder(BorderFactory.createTitledBorder(""));
        
        
        
        
        lblParcela = new JLabel("Parcelas");
        lblParcela.setBounds(180, 5, 120, 22);
        lblParcela.setFont(new Font("Arial", 1, 20));
        painelParcela.add(lblParcela);
        
        
           // ---------------- BOTAO SAIR-----//
        btnSairParcela = new JButton("Sair");
        btnSairParcela.setBounds(170, 240, 80, 35);
        btnSairParcela.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/sair.png"));
        btnSairParcela.setFont(new Font("Arial", 1, 13));
        btnSairParcela.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnSairParcela.addActionListener((java.awt.event.ActionEvent evt) -> {
            janelaParcela.dispose();
        });
        painelParcela.add(btnSairParcela);
        
        
       CriarTabelaParcela();
       janelaParcela.add(painelParcela);
       janelaParcela.setVisible(true);
       
       
   }
   
   
   private void CriarTabelaParcela() {
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        
        

        modelo.addColumn("Parcela");
        modelo.addColumn("Dia(s)");
        modelo.addColumn("Data Vencimento");
        modelo.addColumn("Valor");
        
      
        
        
       

        tblParcela = new JTable();
        tblParcela.setModel(modelo);
        tblParcela.getColumnModel().getColumn(0).setPreferredWidth(90);
        tblParcela.getColumnModel().getColumn(1).setPreferredWidth(90);
        tblParcela.getColumnModel().getColumn(2).setPreferredWidth(120);
        tblParcela.getColumnModel().getColumn(3).setPreferredWidth(120);
      
        

        tblParcela.getTableHeader().setResizingAllowed(false);
        tblParcela.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblParcela.getTableHeader();
        cabecalho.setFont(new Font("Arial", 0, 12));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblParcela.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblParcela.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        tblParcela.getColumnModel().getColumn(2).setCellRenderer(centralizaColunas);
        tblParcela.getColumnModel().getColumn(3).setCellRenderer(centralizaColunas);

        tblParcela.setFont(new Font("Arial", 0, 12));

        scrollTable = new JScrollPane(tblParcela,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(5, 30, 423, 200);
        tblParcela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelParcela.add(scrollTable);
    }
   
    private void CriarProduto(){
        
        
        janelaProduto = new JFrame("Parcelas");
        janelaProduto.setSize(835, 320);
        janelaProduto.setLayout(null);
        janelaProduto.setResizable(false);
        janelaProduto.setLocationRelativeTo(null);
                
        
        
        painelProduto = new JPanel();
        painelProduto.setLayout(null);
        painelProduto.setSize(820, 280);
        painelProduto.setLocation(5, 5);
        painelProduto.setBorder(BorderFactory.createTitledBorder(""));
        
        
        
        
        lblProdutos = new JLabel("PRODUTOS DA NOTA");
        lblProdutos.setBounds(320, 5, 250, 22);
        lblProdutos.setFont(new Font("Arial", 1, 18));
        painelProduto.add(lblProdutos);
        
        
           // ---------------- BOTAO SAIR-----//
        btnSairParcela = new JButton("Sair");
        btnSairParcela.setBounds(380, 240, 100, 35);
        btnSairParcela.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/sair.png"));
        btnSairParcela.setFont(new Font("Arial", 1, 13));
        btnSairParcela.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnSairParcela.addActionListener((java.awt.event.ActionEvent evt) -> {
            janelaProduto.dispose();
        });
        painelProduto.add(btnSairParcela);
        
        
       CriarTabelaProduto();
       janelaProduto.add(painelProduto);
       janelaProduto.setVisible(true);
      
  }
  
   
   
    private void CriarTabelaProduto() {
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        
        

        modelo.addColumn("Produto");
        modelo.addColumn("Descrição Produto");
        modelo.addColumn("Quantidade");
        modelo.addColumn("Vlr Unitário");
         modelo.addColumn("Vlr Total");
          modelo.addColumn("Sit.Trib");
        
      
        
        
       

        tblProduto = new JTable();
        tblProduto.setModel(modelo);
        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(300);
        tblProduto.getColumnModel().getColumn(2).setPreferredWidth(100);
        tblProduto.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblProduto.getColumnModel().getColumn(4).setPreferredWidth(100);
        tblProduto.getColumnModel().getColumn(5).setPreferredWidth(100);
      
        

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
        scrollTable.setBounds(5, 30, 805,200);
        tblProduto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelProduto.add(scrollTable);
    }
  
 
}
