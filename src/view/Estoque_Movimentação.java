
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


public class Estoque_Movimentação {
    
    private JFrame janela;
    private JPanel painelPrincipal;
    private JLabel lblData, lblMovimentacao, lblProduto, lblQuantidade, lblEstoqueOrigem;
    private JTextField  txtProduto, txtCodProduto, txtQuantidade;
    private JComboBox cbMovimentacao, cbEstoqueOrigem;
    private JButton btnGravar, btnCancelar, btnSair, btnConsultar;
    private JFormattedTextField txtData;
    
    private JTable tblLocal;
    private JScrollPane scrollTable;
    private DefaultTableModel modelo;
    
       public void desenharTela() throws ParseException {

        janela = new JFrame("Movimentação");
        janela.setSize(485, 370);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);


        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(465, 330);
        painelPrincipal.setLocation(5, 5);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        
    
        
             //------------------------------------------//
   
        
        lblData = new JLabel("Data");
        lblData.setBounds(20, 10, 40, 22);
        painelPrincipal.add(lblData);
        
        txtData = new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtData.setBounds(20, 30, 80, 22);
        painelPrincipal.add(txtData);
        
           //------------------------------------------//
     
        
        lblMovimentacao = new JLabel("Movimentação");
        lblMovimentacao.setBounds(120, 10, 100, 22);
        painelPrincipal.add(lblMovimentacao);
        
        cbMovimentacao = new JComboBox();
        cbMovimentacao.setBounds(120, 30, 150, 21);
        painelPrincipal.add(cbMovimentacao);

        //------------------------------------------//


  
        lblProduto = new JLabel("Produto");
        lblProduto.setBounds(20, 60, 100, 22);
        painelPrincipal.add(lblProduto);
        
        txtProduto = new JTextField();
        txtProduto.setBounds(20, 80, 335, 22);
        painelPrincipal.add(txtProduto);
        
       
        
       //------------------------------------------//
  
        txtCodProduto = new JTextField();
        txtCodProduto.setBounds(365, 80, 40, 22);
        painelPrincipal.add(txtCodProduto);
        //------------------------------------------//

        
         lblQuantidade = new JLabel("Quantidade");
        lblQuantidade.setBounds(20, 110, 100, 22);
        painelPrincipal.add(lblQuantidade);
        
        txtQuantidade = new JTextField();
        txtQuantidade.setBounds(20, 130, 140, 22);
        painelPrincipal.add(txtQuantidade);
        
        
         //------------------------------------------//

        
         lblEstoqueOrigem = new JLabel("Estoque Origem");
        lblEstoqueOrigem.setBounds(20, 160, 100, 22);
        painelPrincipal.add(lblEstoqueOrigem);
        
        cbEstoqueOrigem = new JComboBox();
        cbEstoqueOrigem.setBounds(20, 180, 140, 22);
        painelPrincipal.add(cbEstoqueOrigem);
        
        
              //-------------------------------------------------------------------------------------------// 
        btnGravar = new JButton("Gravar");
       btnGravar.setBounds(20, 290, 100, 30);       
       btnGravar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));      
       btnGravar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnGravar.setFont(new Font("Arial", 1, 13));
        
       painelPrincipal.add(btnGravar);
   //-------------------------------------------------------------------------------------------// 
   
   
   //-------------------------------------------------------------------------------------------// 
        btnConsultar = new JButton("Consultar");
       btnConsultar.setBounds(130, 290, 100, 30);       
       btnConsultar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/consulta.png"));
        btnConsultar.setFont(new Font("Arial", 1, 13));
        btnConsultar.setHorizontalTextPosition(SwingConstants.RIGHT);
       painelPrincipal.add(btnConsultar);
   //-------------------------------------------------------------------------------------------// 
   
   
   //-------------------------------------------------------------------------------------------// 
        btnCancelar = new JButton("Cancelar");
       btnCancelar.setBounds(240, 290, 100, 30);       
       btnCancelar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));    
       btnCancelar.setFont(new Font("Arial", 1, 13));
       btnCancelar.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelPrincipal.add(btnCancelar);
   //-------------------------------------------------------------------------------------------// 
   
   
   //-------------------------------------------------------------------------------------------// 
        btnSair = new JButton("Sair");
       btnSair.setBounds(350, 290, 100, 30);       
       btnSair.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/sair.png"));      
       btnSair.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnSair.setFont(new Font("Arial", 1, 13));
        btnSair.addActionListener((java.awt.event.ActionEvent evt) -> { 
           
                        janela.dispose();
        });  
        
       painelPrincipal.add(btnSair);
   //-------------------------------------------------------------------------------------------// 
         
        
        
        
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

        modelo.addColumn("Local");
        modelo.addColumn("Estoque");
        modelo.addColumn("Custo");
       
     

        tblLocal = new JTable();
        tblLocal.setModel(modelo);
        tblLocal.getColumnModel().getColumn(0).setPreferredWidth(150);
        tblLocal.getColumnModel().getColumn(1).setPreferredWidth(70);
        tblLocal.getColumnModel().getColumn(2).setPreferredWidth(70);
        

        tblLocal.getTableHeader().setResizingAllowed(false);
        tblLocal.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblLocal.getTableHeader();
        cabecalho.setFont(new Font("Arial", 1, 11));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblLocal.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblLocal.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        

        tblLocal.setFont(new Font("Arial", 0, 11));

        scrollTable = new JScrollPane(tblLocal,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(170, 130, 290, 140);
        tblLocal.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelPrincipal.add(scrollTable);
    }
     
       
       
}
