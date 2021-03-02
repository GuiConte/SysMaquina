
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


public class Estoque_Saida {
    
    private JFrame janela;
    private JPanel painelPrincipal, painelProduto;
    private JLabel lblData, lblEstoque, lblDespesa, lblCentro, lblCI,lblEscritorio, lblProdutor, lblArea, lblRequisitou, lblRetirada;
    private JLabel lblProduto, lblQuantidade, lblCusto, lblValorTotal;
    private JComboBox cbEstoque, cbDespesa, cbCentro, cbEscritorio, cbProdutor, cbArea;
    private JTextField  txtRequisitou, txtRetirou,txtCI, txtProduto, txtCodProduto, txtQuantidade, txtCusto, txtValorTotal;
    private JTable tblProduto;
    private JScrollPane scrollTable;
    private DefaultTableModel modelo;
    private JButton btnConsultaProduto, btnGravarProduto, btnExcluirProduto, btnAlteraProduto, btnGravar, btnSair, btnConsultar, btnCancelar;
        private JFormattedTextField txtData;

    
    
     public void desenharTela() throws ParseException {

        janela = new JFrame("Requisição");
        janela.setSize(670, 570);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);


        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(650, 530);
        painelPrincipal.setLocation(5, 5);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        
        
        
         lblData = new JLabel("Data ");
        lblData.setBounds(13, 10, 60, 22);
        painelPrincipal.add(lblData);
        
        txtData = new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtData.setBounds(10, 30, 60, 22);
        painelPrincipal.add(txtData);
        
        //-----------------------------------//
        
        lblEstoque = new JLabel("Estoque ");
        lblEstoque.setBounds(80, 10, 60, 22);
        painelPrincipal.add(lblEstoque);
        
        cbEstoque = new JComboBox();
        cbEstoque.setBounds(80, 30, 160, 22);
        painelPrincipal.add(cbEstoque);
        
        
        
         //-----------------------------------//
        
        lblDespesa = new JLabel("Despesa ");
        lblDespesa.setBounds(250, 10, 60, 22);
        painelPrincipal.add(lblDespesa);
        
        cbDespesa = new JComboBox();
        cbDespesa.setBounds(250, 30, 200, 22);
        painelPrincipal.add(cbDespesa);
        
        
         //-----------------------------------//
        
        lblCentro = new JLabel("Centro ");
        lblCentro.setBounds(460, 10, 60, 22);
        painelPrincipal.add(lblCentro);
        
        cbCentro = new JComboBox();
        cbCentro.setBounds(460, 30, 160, 22);
        painelPrincipal.add(cbCentro);
        
        
        
          //-----------------------------------//
        
        lblEscritorio = new JLabel("Escritório ");
        lblEscritorio.setBounds(10, 60, 60, 22);
        painelPrincipal.add(lblEscritorio);
        
        cbEscritorio = new JComboBox();
        cbEscritorio.setBounds(10, 80, 160, 22);
        painelPrincipal.add(cbEscritorio);
        
        
         
          //-----------------------------------//
        
        lblProdutor = new JLabel("Produtor ");
        lblProdutor.setBounds(180, 60, 60, 22);
        painelPrincipal.add(lblProdutor);
        
        cbProdutor = new JComboBox();
        cbProdutor.setBounds(180, 80, 220, 22);
        painelPrincipal.add(cbProdutor);
        
        
        
           //-----------------------------------//
        
        lblArea = new JLabel("Area ");
        lblArea.setBounds(410, 60, 60, 22);
        painelPrincipal.add(lblArea);
        
        cbArea = new JComboBox();
        cbArea.setBounds(410, 80, 210, 22);
        painelPrincipal.add(cbArea);
        
        //---------------------------------------------------------------//
         
         lblRequisitou = new JLabel("Quem Requisitou: ");
        lblRequisitou.setBounds(13, 110, 140, 22);
        painelPrincipal.add(lblRequisitou);
        
        txtRequisitou = new JTextField();
        txtRequisitou.setBounds(10, 130, 200, 22);
        painelPrincipal.add(txtRequisitou);
        
        
        
        
         //---------------------------------------------------------------//
         
         lblRequisitou = new JLabel("Quem Requisitou: ");
        lblRequisitou.setBounds(13, 110, 140, 22);
        painelPrincipal.add(lblRequisitou);
        
        txtRequisitou = new JTextField();
        txtRequisitou.setBounds(10, 130, 200, 22);
        painelPrincipal.add(txtRequisitou);
        
        
        
         //---------------------------------------------------------------//
         
         lblRetirada = new JLabel("Quem fez Retirada: ");
        lblRetirada.setBounds(220, 110, 140, 22);
        painelPrincipal.add(lblRetirada);
        
        txtRetirou = new JTextField();
        txtRetirou.setBounds(220, 130, 200, 22);
        painelPrincipal.add(txtRetirou);
        
        
     //-----------------------------------------------------------//   
         lblCI = new JLabel("C.I");
        lblCI.setBounds(450, 110, 140, 22);
        lblCI.setFont(new Font("Arial",1,15));
        lblCI.setForeground(Color.red);
        painelPrincipal.add(lblCI);
        
        txtCI = new JTextField();
        txtCI.setBounds(450, 130, 80, 22);
        txtCI.setForeground(Color.blue);
        painelPrincipal.add(txtCI);
        
        
   //----------------------------------------------------------------------//     
        
        painelProduto = new JPanel();
        painelProduto.setLayout(null);
        painelProduto.setSize(630, 320);
        painelProduto.setLocation(5, 160);
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
       
       
         
           
          // ---------------- BOTAO GRAVAR-----//
       btnGravarProduto = new JButton("Novo");
       btnGravarProduto.setBounds(10, 110, 90, 27);  
       btnGravarProduto.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));       
       btnGravarProduto.setHorizontalTextPosition(SwingConstants.RIGHT);
       btnGravarProduto.setFont(new Font("Arial", 1, 13));
        
       
        
       painelProduto.add(btnGravarProduto);
        
       
       
       
        //------------BOTAO PESQUISAR  ---------------------//
       
       btnAlteraProduto = new JButton("Alterar");
       btnAlteraProduto.setBounds(110, 110, 90, 27);       
       btnAlteraProduto.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/alterar2.png"));
       btnAlteraProduto.setHorizontalTextPosition(SwingConstants.RIGHT);
       btnAlteraProduto.setFont(new Font("Arial", 1, 13));
        
       painelProduto.add(btnAlteraProduto);
       
       
          //------------BOTAO PESQUISAR  ---------------------//
       
       btnExcluirProduto = new JButton("Excluir");
       btnExcluirProduto.setBounds(210, 110, 90, 27);       
       btnExcluirProduto.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/excluir2.png"));
      btnExcluirProduto.setHorizontalTextPosition(SwingConstants.RIGHT);
       btnExcluirProduto.setFont(new Font("Arial", 1, 13));
        
       painelProduto.add(btnExcluirProduto);
        
       
       
       
                 //-------------------------------------------------------------------------------------------// 
        btnGravar = new JButton("Gravar");
       btnGravar.setBounds(110, 490, 100, 30);       
       btnGravar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));      
       btnGravar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnGravar.setFont(new Font("Arial", 1, 13));
        
       painelPrincipal.add(btnGravar);
   //-------------------------------------------------------------------------------------------// 
   
   
   //-------------------------------------------------------------------------------------------// 
        btnConsultar = new JButton("Consultar");
       btnConsultar.setBounds(220, 490, 100, 30);       
       btnConsultar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/consulta.png"));
        btnConsultar.setFont(new Font("Arial", 1, 13));
        btnConsultar.setHorizontalTextPosition(SwingConstants.RIGHT);
       painelPrincipal.add(btnConsultar);
   //-------------------------------------------------------------------------------------------// 
   
   
   //-------------------------------------------------------------------------------------------// 
        btnCancelar = new JButton("Cancelar");
       btnCancelar.setBounds(330, 490, 100, 30);       
       btnCancelar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));    
       btnCancelar.setFont(new Font("Arial", 1, 13));
       btnCancelar.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelPrincipal.add(btnCancelar);
   //-------------------------------------------------------------------------------------------// 
   
   
   //-------------------------------------------------------------------------------------------// 
        btnSair = new JButton("Sair");
       btnSair.setBounds(440, 490, 100, 30);       
       btnSair.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/sair.png"));      
       btnSair.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnSair.setFont(new Font("Arial", 1, 13));
        
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
