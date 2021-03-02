
package view;

import java.awt.Font;
import java.text.ParseException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.text.MaskFormatter;


public class CadastroProduto {
    
    private JFrame janela;
    private JPanel painelPrincipal,painelProduto,painelFiscal, painelSTV;
    private JLabel lblCodigo,lblDescricao, lblReferencia, lblUnidade, lblKG, lblTipo, lblObservacao,lblCusto;
    private JLabel lblPreco, lblCompra,lblVenda,lblCodFornecedor,lblFornecedor, lbltributo, lblCFFiscal,lblMarkup,lblIVA;
    private JTextField txtCodigo, txtDescricao, txtReferencia, txtUnidade, txtKG, txtObservacao, txtCusto, txtPreco,  txtCodFornecedor, txtFornecedor;
    private JTextField txtCFFiscal,txtMarkup, txtIVA,txtSP;
    private JComboBox cbTipo,cbTributo;
    private JCheckBox ckRastrear, ckControlar;
    private DefaultTableModel modelo;
    private JTable tblProduto;
    private JScrollPane scrollTable;
    private JTextField n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12;
    private JButton btnGravar, btnCancelar, btnSair, btnFornecedor;
    private JFormattedTextField txtCompra, txtVenda;
    
    
    
    public void desenharTela() throws ParseException {

        janela = new JFrame("Cadastro de Produto");
        janela.setSize(535, 585);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
                janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     
        
        //-------------- CRIANDO PAINEL PRINCIAL --------------------//
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(520, 550);
        painelPrincipal.setLocation(05, 05);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        
        
        
         //----------- PAINEL COM ABAS-----------------//
        painelProduto = new JPanel();
        painelProduto.setLayout(null);
        painelProduto.setSize(680, 500);

        painelFiscal = new JPanel();
        painelFiscal.setLayout(null);
        painelFiscal.setSize(680, 500);

       
        
        
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(5, 5, 500, 500);
        tp.add("Produto", painelProduto);
        tp.add("Fiscal", painelFiscal);
        
        
        
         //---------------CODIGO-----------------//
        lblCodigo = new JLabel("Código");
        lblCodigo.setBounds(20, 20, 60, 22);
        painelProduto.add(lblCodigo);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(20, 40, 60, 22);
        painelProduto.add(txtCodigo);
        
        
        
         //---------------RASTREAR-----------------//
        ckRastrear = new JCheckBox("Rastrear");
        ckRastrear.setBounds(170, 20, 140, 22);
        painelProduto.add(ckRastrear);

        ckControlar = new JCheckBox("Controlar Estoque");
        ckControlar.setBounds(170, 40, 140, 22);
        painelProduto.add(ckControlar);

        //---------------PRODUTO-----------------//
        lblDescricao = new JLabel("Descrição do Produto");
        lblDescricao.setBounds(20, 70, 140, 22);
        painelProduto.add(lblDescricao);

        txtDescricao = new JTextField();
        txtDescricao.setBounds(20, 90, 350, 22);
        painelProduto.add(txtDescricao);
        
        
        //---------------REFERENCIA-----------------//
        lblReferencia = new JLabel("Referencia ");
        lblReferencia.setBounds(20, 120, 140, 22);
        painelProduto.add(lblReferencia);

        txtReferencia = new JTextField();
        txtReferencia.setBounds(20, 140, 160, 22);
        painelProduto.add(txtReferencia);
        
        
        //---------------UNIDADE-----------------//
        lblUnidade = new JLabel("Unidade ");
        lblUnidade.setBounds(190, 120, 140, 22);
        painelProduto.add(lblUnidade);

        txtUnidade = new JTextField();
        txtUnidade.setBounds(190, 140, 60, 22);
        painelProduto.add(txtUnidade);
        
          //---------------KG-----------------//
        lblKG = new JLabel("KG ");
        lblKG.setBounds(260, 120, 140, 22);
        painelProduto.add(lblKG);

        txtKG = new JTextField();
        txtKG.setBounds(260, 140, 60, 22);
        painelProduto.add(txtKG);
        
          //---------------TIPO-----------------//
        lblTipo = new JLabel("Tipo ");
        lblTipo.setBounds(330, 120, 140, 22);
        painelProduto.add(lblTipo);

        cbTipo = new JComboBox();
        cbTipo.setBounds(330, 140, 150, 22);
        painelProduto.add(cbTipo);
        
         //---------------TIPO-----------------//
        lblObservacao = new JLabel("Observação ");
        lblObservacao.setBounds(20, 170, 140, 22);
        painelProduto.add(lblObservacao);

        txtObservacao = new JTextField();
        txtObservacao.setBounds(20, 190, 420, 22);
        painelProduto.add(txtObservacao);
        
        
        
        //---------------CUSTO-----------------//
        lblCusto = new JLabel("Custo ");
        lblCusto.setBounds(20, 220, 140, 22);
        painelProduto.add(lblCusto);

        txtCusto = new JTextField();
        txtCusto.setBounds(20, 240, 100, 22);
        painelProduto.add(txtCusto);
        
        
          //---------------PRECO-----------------//
        lblPreco = new JLabel("Preço ");
        lblPreco.setBounds(20, 270, 140, 22);
        painelProduto.add(lblPreco);

        txtPreco = new JTextField();
        txtPreco.setBounds(20, 290, 100, 22);
        painelProduto.add(txtPreco);
        
        
        
        //---------------ULTIMA COMPRA-----------------//
        lblCompra = new JLabel("Ultima Compra ");
        lblCompra.setBounds(150, 220, 140, 22);
        painelProduto.add(lblCompra);

        txtCompra = new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtCompra.setBounds(150, 240, 100, 22);
        painelProduto.add(txtCompra);
        
        
          //---------------ULTIMA VENDA-----------------//
        lblVenda = new JLabel("Ultima Venda ");
        lblVenda.setBounds(150, 270, 140, 22);
        painelProduto.add(lblVenda);

        txtVenda = new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtVenda.setBounds(150, 290, 100, 22);
        painelProduto.add(txtVenda);
        
        
         //---------------CODIGO FORNECEDOR-----------------//
        lblCodFornecedor = new JLabel("Cod.Forn ");
        lblCodFornecedor.setBounds(20, 320, 140, 22);
        painelProduto.add(lblCodFornecedor);

        txtCodFornecedor = new JTextField();
        txtCodFornecedor.setBounds(20, 340, 70, 22);
        painelProduto.add(txtCodFornecedor);
        
        
        //---------------CODIGO FORNECEDOR-----------------//
        lblFornecedor = new JLabel("Fornecedor ");
        lblFornecedor.setBounds(100, 320, 140, 22);
        painelProduto.add(lblFornecedor);

        txtFornecedor = new JTextField();
        txtFornecedor.setBounds(100, 340, 300, 22);
        painelProduto.add(txtFornecedor);
        
        // ---------------- BOTAO FORNECEDOR-----//
        btnFornecedor = new JButton("");
       btnFornecedor.setBounds(405, 340, 30, 20);       
       btnFornecedor.setHorizontalTextPosition(SwingConstants.RIGHT);
       btnFornecedor.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
       btnFornecedor.addActionListener((java.awt.event.ActionEvent evt)->{
             ConsultaFornecedorProdutor_Simplificado consultProF = new ConsultaFornecedorProdutor_Simplificado();
             consultProF.desenharTela();
       });
       painelProduto.add(btnFornecedor);
        
        //---------------ABA FISCAL TRIBUTO-----------------//
        lbltributo = new JLabel("Tributário:");
        lbltributo.setBounds(25, 20, 140, 22);
        painelFiscal.add(lbltributo);

        cbTributo = new JComboBox();
        cbTributo.setBounds(90, 20, 200, 22);
        painelFiscal.add(cbTributo);
        
        
        //---------------ABA FISCAL Classif-----------------//
        lblCFFiscal = new JLabel("Classif.Fiscal:");
        lblCFFiscal.setBounds(3, 60, 140, 22);
        painelFiscal.add(lblCFFiscal);

        txtCFFiscal = new JTextField();
        txtCFFiscal.setBounds(90, 60, 100, 22);
        painelFiscal.add(txtCFFiscal);
        
        
        //---------------ABA FISCAL MARKUP-----------------//
        lblMarkup = new JLabel("Markup MG:");
        lblMarkup.setBounds(15, 90, 140, 22);
        painelFiscal.add(lblMarkup);

        txtMarkup = new JTextField();
        txtMarkup.setBounds(90, 90, 100, 22);
        painelFiscal.add(txtMarkup);
        
        
         //---------------ABA FISCAL IVA SP-----------------//
        lblIVA = new JLabel("IVA SP:");
        lblIVA.setBounds(40, 120, 140, 22);
        painelFiscal.add(lblIVA);

        txtIVA = new JTextField();
        txtIVA.setBounds(90, 120, 100, 22);
        painelFiscal.add(txtIVA);
        
        
        
          //-------------- CRIANDO PAINEL STV --------------------//
        painelSTV = new JPanel();
        painelSTV.setLayout(null);
        painelSTV.setSize(310, 80);
        painelSTV.setLocation(10, 160);
        painelSTV.setBorder(BorderFactory.createTitledBorder("Situação Tributária Venda"));
        painelFiscal.add(painelSTV);
        
      
        n1 = new JTextField();
        n1.setBounds(05, 20, 30, 22);
        painelSTV.add(n1);
        
        n2 = new JTextField();
        n2.setBounds(40, 20, 60, 22);
        painelSTV.add(n2);
        
        n3 = new JTextField();
        n3.setBounds(105, 20, 30, 22);
        painelSTV.add(n3);
        
        n4 = new JTextField();
        n4.setBounds(140, 20, 60, 22);
        painelSTV.add(n4);
        
        n5 = new JTextField();
        n5.setBounds(205, 20, 30, 22);
        painelSTV.add(n5);
        
        n6 = new JTextField();
        n6.setBounds(240, 20, 60, 22);
        painelSTV.add(n6);
        
        n7 = new JTextField();
        n7.setBounds(05, 50, 30, 22);
        painelSTV.add(n7);
        
        n8 = new JTextField();
        n8.setBounds(40, 50, 60, 22);
        painelSTV.add(n8);
        
        n9 = new JTextField();
        n9.setBounds(105, 50, 30, 22);
        painelSTV.add(n9);
        
        n10 = new JTextField();
        n10.setBounds(140, 50, 60, 22);
        painelSTV.add(n10);
        
        n11 = new JTextField();
        n11.setBounds(205, 50, 30, 22);
        painelSTV.add(n11);
        
        n12 = new JTextField();
        n12.setBounds(240, 50, 60, 22);
        painelSTV.add(n12);
        
        // ---------------- BOTAO GRAVAR-----//
        btnGravar = new JButton("Gravar");
       btnGravar.setBounds(100, 510, 90, 30);       
      btnGravar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));
       btnGravar.setFont(new Font("Arial", 1, 13));
       btnGravar.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelPrincipal.add(btnGravar);
        
          // ---------------- BOTAO CANCELAR-----//
       btnCancelar = new JButton("Cancelar");
       btnCancelar.setBounds(200, 510, 90, 30);       
       btnCancelar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));
       btnCancelar.setFont(new Font("Arial", 1, 13));
       btnCancelar.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelPrincipal.add(btnCancelar);
        
         // ---------------- BOTAO SAIR-----//
       btnSair = new JButton("Sair");
       btnSair.setBounds(300, 510, 90, 30);       
       btnSair.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/sair.png"));
       btnSair.setFont(new Font("Arial", 1, 13));
       btnSair.setHorizontalTextPosition(SwingConstants.RIGHT);
       btnSair.addActionListener((java.awt.event.ActionEvent evt) -> {  
           janela.dispose();
        });
       painelPrincipal.add(btnSair);
        
        
        
        criarTabela();
       painelPrincipal.add(tp);
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

        modelo.addColumn("local");
        modelo.addColumn("Estoque");
        modelo.addColumn("Custo Médio");
        modelo.addColumn("Minimo");
        
    

        tblProduto = new JTable();
        tblProduto.setModel(modelo);
        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(185);
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblProduto.getColumnModel().getColumn(2).setPreferredWidth(100);
        tblProduto.getColumnModel().getColumn(3).setPreferredWidth(100);
        
        

        tblProduto.getTableHeader().setResizingAllowed(false);
        tblProduto.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblProduto.getTableHeader();
        cabecalho.setFont(new Font("Arial", 1, 11));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblProduto.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblProduto.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        tblProduto.getColumnModel().getColumn(2).setCellRenderer(centralizaColunas);
        tblProduto.getColumnModel().getColumn(3).setCellRenderer(centralizaColunas);
      

        tblProduto.setFont(new Font("Arial", 0, 11));

        scrollTable = new JScrollPane(tblProduto,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(3, 370, 490, 100);
        tblProduto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelProduto.add(scrollTable);
        
    }
}
