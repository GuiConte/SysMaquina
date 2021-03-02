/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Font;
import java.text.ParseException;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Guilherme
 */
public class Compras_EntradaProd {
    
    private JFrame janela;
    private JPanel painelPrincipal,painelFornecedor, painelAtualiza,painelTipo, painelParcela;
    private JTable tblCompras_Entrada;
    private JScrollPane scrollTable;
    private DefaultTableModel modelo;
    private JFormattedTextField txtDataEmissao, txtDataEntrada;
    private JLabel lblDocumento, lblNota, lblEstoque,  lblDataEmissao, lblDataEntrada,lblFornecedor,lblProduto,lblCodProduto;
   private JLabel lblQuantidade,lblVlrUnitario,lblVlrTotal;
    private JTextField txtNota,txtFornecedor,txtCodFornecedor,txtProduto,txtCodProduto,txtVlrUnitario,txtVlrTotal, txtQuantidade;
    private JComboBox cbDocumento,  cbEstoque;
    private JRadioButton rdSim,rdNao;
    private ButtonGroup groupAtualiza;
    private JPanel produto, valores;
    private JCheckBox ckCalcular, ckRecalcular, ckFrete;
    private JButton btnConsultarProdudor, btnGravaProduto, btnAlterarProduto, btnExcluirProduto, btnProcurarFornecedor;
    private JLabel lblCalculoICMS, lblValorICMS, lblBaseICMSSubs, lblValorICMSSubs, lblValorIPI, lblValorServico;
    private JLabel  lblValorISS, lblFrete, lblSeguro, lblOutrasDesp, lblDesconto,lblTotalProduto, lblNotaFiscal, lblParcelas;
    private JTextField txtCalculoICMS, txtValorICMS, txtBaseICMSSubs, txtValorICMSSubs, txtValorIPI, txtValorServico, txtParcelas;
    private JTextField  txtValorISS, txtFrete, txtSeguro, txtOutrasDesp, txtDesconto,txtTotalProduto, txtNotaFiscal;
    private JButton btnSair, btnCancelar, btnConsultar, btnGravar;
    

    public void desenharTela() throws ParseException {

        janela = new JFrame("Entrada");
        janela.setSize(960, 610);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);

        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(1000, 10000);
        painelPrincipal.setLocation(5, 5);
       
  //--------------------------------------------------------------------------------------------------//  
  
        painelFornecedor = new JPanel();
        painelFornecedor.setLayout(null);
        painelFornecedor.setSize(930, 100);
        painelFornecedor.setLocation(5, 5);
         painelFornecedor.setBorder(BorderFactory.createTitledBorder(""));
          painelPrincipal.add(painelFornecedor);

  
  
        lblDataEmissao = new JLabel("Data Emissão");
        lblDataEmissao.setBounds(10, 10, 80, 20);
        lblDataEmissao.setFont(new Font("Arial", 1, 12));
        painelFornecedor.add(lblDataEmissao);
        
        txtDataEmissao = new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtDataEmissao.setBounds(10, 30, 80, 22);
        painelFornecedor.add(txtDataEmissao);
        
        //------------------------------------------------------------------------------------//
        
        
        
         lblDataEntrada = new JLabel("Data Entrada");
        lblDataEntrada.setBounds(110, 10, 80, 20);
        lblDataEntrada.setFont(new Font("Arial", 1, 12));
        painelFornecedor.add(lblDataEntrada);
        
        txtDataEntrada = new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtDataEntrada.setBounds(110, 30, 80, 22);
        painelFornecedor.add(txtDataEntrada);
        
    //---------------------------------------------------------------------------------//    
        
        lblFornecedor = new JLabel("Fornecedor");
        lblFornecedor.setBounds(210, 10, 150, 20);
        lblFornecedor.setFont(new Font("Arial", 1, 12));
        painelFornecedor.add(lblFornecedor);
        
        txtFornecedor = new JTextField();
        txtFornecedor.setBounds(210, 30, 255, 22);
        painelFornecedor.add(txtFornecedor);
        
        txtCodFornecedor = new JTextField();
        txtCodFornecedor.setBounds(475, 30, 50, 22);
        painelFornecedor.add(txtCodFornecedor);
        
        btnProcurarFornecedor = new JButton("");
        btnProcurarFornecedor.setBounds(530, 30, 25, 22);
        btnProcurarFornecedor.setFont(new Font("Arial", 0, 8));
        btnProcurarFornecedor.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));      
        btnProcurarFornecedor.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnProcurarFornecedor.setToolTipText("Pesquisar Fornecedor");
        btnProcurarFornecedor.addActionListener((java.awt.event.ActionEvent evt) -> {  
           
           ConsultaFornecedor_Simplificada consult = new ConsultaFornecedor_Simplificada();
           consult.desenharTela();
        });
        painelFornecedor.add(btnProcurarFornecedor);
       //-------------------------------------------------------------------------------------------------------//
       
       
        lblDocumento = new JLabel("Documento");
        lblDocumento.setBounds(565, 10, 150, 20);
        lblDocumento.setFont(new Font("Arial", 1, 12));
        painelFornecedor.add(lblDocumento);
        
        cbDocumento = new JComboBox();
        cbDocumento.setBounds(565, 30, 80, 22);
        painelFornecedor.add(cbDocumento);
        
        
        
         //-------------------------------------------------------------------------------------------------------//
       
       
        lblNota = new JLabel("N° Nota");
        lblNota.setBounds(650, 10, 150, 20);
        lblNota.setFont(new Font("Arial", 1, 12));
        painelFornecedor.add(lblNota);
        
        txtNota = new JTextField();
        txtNota.setBounds(650, 30, 85, 22);
        painelFornecedor.add(txtNota);
       
        
        
        //--------------------------------------------------------------------------------------------------------//
        
         lblEstoque = new JLabel("Estoque");
        lblEstoque.setBounds(565, 50, 150, 20);
        lblEstoque.setFont(new Font("Arial", 1, 12));
        painelFornecedor.add(lblEstoque);
        
        cbEstoque = new JComboBox();
        cbEstoque.setBounds(565, 70, 170, 22);
        painelFornecedor.add(cbEstoque);
        
        
        
       //-----------------------------------------------------------------------------------------------------------//
       
        painelAtualiza = new JPanel();
        painelAtualiza.setLayout(null);
        painelAtualiza.setBorder(BorderFactory.createTitledBorder("Atualiza Estoque"));
        painelAtualiza.setSize(170, 50);
        painelAtualiza.setLocation(750, 5);
        
        rdSim = new JRadioButton("Sim");
        rdSim.setBounds(5, 22, 80, 17);
        rdSim.setFont(new Font("Arial", 1, 12));
        painelAtualiza.add(rdSim);
        
        rdNao = new JRadioButton("Não");
        rdNao.setBounds(85, 22, 80, 17);
        rdNao.setFont(new Font("Arial", 1, 12));
        painelAtualiza.add(rdNao);
        
        groupAtualiza = new ButtonGroup();
        groupAtualiza.add(rdSim);
        groupAtualiza.add(rdNao);
        
        painelFornecedor.add(painelAtualiza);
       
        
        
        //------------------------------------------------------------------------------------//
        
        //------------CRIANDO PAINEL PERMISSAO ----------------//
         painelTipo = new JPanel();
        painelTipo.setLayout(null);        
        painelTipo.setBorder(BorderFactory.createTitledBorder(""));
        painelTipo.setBounds(5, 120, 930, 390);
        painelPrincipal.add(painelTipo);
        
        
        //----------- PAINEL COM ABAS-----------------//
        produto = new JPanel();
        produto.setLayout(null);
        produto.setSize(0, 0);

        valores = new JPanel();
        valores.setLayout(null);
        valores.setSize(0, 0);
       
         JTabbedPane tp = new JTabbedPane();
        tp.setBounds(5, 5, 650, 380);
        tp.add("Produtos", produto);
        tp.add("Valores", valores);
      

        painelTipo.add(tp);
       
       
         ckCalcular = new JCheckBox("Calcular IPI");
        ckCalcular.setBounds(10, 10, 150, 20);
        ckCalcular.setFont(new Font("Arial", 1, 13));
        produto.add(ckCalcular);
        
        
         lblProduto = new JLabel("Produto");
        lblProduto.setBounds(10, 30, 150, 20);
        lblProduto.setFont(new Font("Arial", 1, 12));
        produto.add(lblProduto);
        
        txtProduto = new JTextField();
        txtProduto.setBounds(10, 50, 300, 22);
        produto.add(txtProduto);
        
        lblCodProduto = new JLabel("Cód Pro");
        lblCodProduto.setBounds(320, 30, 150, 20);
        lblCodProduto.setFont(new Font("Arial", 1, 12));
        produto.add(lblCodProduto);
        
        txtCodProduto = new JTextField();
        txtCodProduto.setBounds(320, 50, 50, 22);
        produto.add(txtCodProduto);
        
        
        //--------------------------------------------------------------------------------------//
        
         lblQuantidade = new JLabel("Quantidade");
        lblQuantidade.setBounds(10, 80, 150, 20);
        lblQuantidade.setFont(new Font("Arial", 1, 12));
        produto.add(lblQuantidade);
        
        txtQuantidade = new JTextField();
        txtQuantidade.setBounds(10, 100, 100, 22);
        produto.add(txtQuantidade);
       
        
          
        //--------------------------------------------------------------------------------------//
        
         lblVlrUnitario = new JLabel(" Vlr Unitário");
        lblVlrUnitario.setBounds(130, 80, 150, 20);
        lblVlrUnitario.setFont(new Font("Arial", 1, 12));
        produto.add(lblVlrUnitario);
        
        txtVlrUnitario = new JTextField();
        txtVlrUnitario.setBounds(130, 100, 100, 22);
        produto.add(txtVlrUnitario);
        
        
        
         //--------------------------------------------------------------------------------------//
        
         lblVlrTotal = new JLabel(" Vlr Total");
        lblVlrTotal.setBounds(250, 80, 150, 20);
        lblVlrTotal.setFont(new Font("Arial", 1, 12));
        produto.add(lblVlrTotal);
        
        txtVlrTotal = new JTextField();
        txtVlrTotal.setBounds(250, 100, 100, 22);
        produto.add(txtVlrTotal);
        
        
          //----------------------------------------------------------------------------------//
        
        
             //---------------- BOTAO GRAVAR-----//
       btnConsultarProdudor = new JButton("Consultar");
       btnConsultarProdudor.setBounds(390, 47, 90, 30);       
       btnConsultarProdudor.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
       btnConsultarProdudor.setFont(new Font("Arial", 1, 12));
       btnConsultarProdudor.setToolTipText("Consultar Produto");
       btnConsultarProdudor.setHorizontalTextPosition(SwingConstants.RIGHT);
       
        
       produto.add(btnConsultarProdudor);
       
       
       
        
        
        //----------------------------------------------------------------------------------//
        
        
             //---------------- BOTAO GRAVAR-----//
       btnGravaProduto = new JButton("Gravar");
       btnGravaProduto.setBounds(370, 97, 80, 30);       
       btnGravaProduto.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));
       btnGravaProduto.setFont(new Font("Arial", 1, 12));
       btnGravaProduto.setToolTipText("Gravar Produto");
       btnGravaProduto.setHorizontalTextPosition(SwingConstants.RIGHT);
       
        
       produto.add(btnGravaProduto);
       
       
       
//--------------------------------------------------------------------------------------------------//
       btnAlterarProduto = new JButton("Alterar");
       btnAlterarProduto.setBounds(460, 97, 80, 30);       
       btnAlterarProduto.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/alterar2.png"));
       btnAlterarProduto.setFont(new Font("Arial", 1, 12));
       btnAlterarProduto.setToolTipText("Alterar Produto");
       btnAlterarProduto.setHorizontalTextPosition(SwingConstants.RIGHT);
       
        
       produto.add(btnAlterarProduto);
       
       
//------------------------------------------------------------------------------------------------------//       
       btnExcluirProduto = new JButton("Excluir");
       btnExcluirProduto.setBounds(550, 97, 80, 30);       
       btnExcluirProduto.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/excluir2.png"));
       btnExcluirProduto.setFont(new Font("Arial", 1, 12));
       btnExcluirProduto.setToolTipText("Excluir Produto");
       btnExcluirProduto.setHorizontalTextPosition(SwingConstants.RIGHT);
       
        
       produto.add(btnExcluirProduto);
        
        
     
      
       
       
       //--------------------------------------------------------------------------------------//
        
         lblCalculoICMS = new JLabel(" Base Calculo ICMS ");
        lblCalculoICMS.setBounds(45, 20, 150, 20);
        lblCalculoICMS.setFont(new Font("Arial", 1, 12));
        valores.add(lblCalculoICMS);
        
        txtCalculoICMS = new JTextField();
        txtCalculoICMS.setBounds(170, 20, 100, 22);
        valores.add(txtCalculoICMS);
        
        
          //----------------------------------------------------------------------------------//
       
       
        //--------------------------------------------------------------------------------------//
        
         lblValorICMS = new JLabel(" Valor ICMS ");
        lblValorICMS.setBounds(90, 50, 150, 20);
        lblValorICMS.setFont(new Font("Arial", 1, 12));
        valores.add(lblValorICMS);
        
        txtValorICMS = new JTextField();
        txtValorICMS.setBounds(170, 50, 100, 22);
        valores.add(txtValorICMS);
        
        
          //----------------------------------------------------------------------------------//
       
       
          
          
        //--------------------------------------------------------------------------------------//
        
         lblBaseICMSSubs = new JLabel(" Base ICMS Subst. Trib. ");
        lblBaseICMSSubs.setBounds(20, 95, 150, 20);
        lblBaseICMSSubs.setFont(new Font("Arial", 1, 12));
        valores.add(lblBaseICMSSubs);
        
        txtBaseICMSSubs = new JTextField();
        txtBaseICMSSubs.setBounds(170, 95, 100, 22);
        valores.add(txtBaseICMSSubs);
        
        
          //----------------------------------------------------------------------------------//
          
            //--------------------------------------------------------------------------------------//
        
         lblValorICMSSubs = new JLabel(" Valor ICMS Subst. Trib. ");
        lblValorICMSSubs.setBounds(20, 125, 150, 20);
        lblValorICMSSubs.setFont(new Font("Arial", 1, 12));
        valores.add(lblValorICMSSubs);
        
        txtValorICMSSubs = new JTextField();
        txtValorICMSSubs.setBounds(170, 125, 100, 22);
        valores.add(txtValorICMSSubs);
        
        
          //----------------------------------------------------------------------------------//
       
            //--------------------------------------------------------------------------------------//
        
         lblValorIPI = new JLabel(" Valor IPI ");
        lblValorIPI.setBounds(100, 175, 150, 20);
        lblValorIPI.setFont(new Font("Arial", 1, 12));
        valores.add(lblValorIPI);
        
        txtValorIPI = new JTextField();
        txtValorIPI.setBounds(170, 175, 100, 22);
        valores.add(txtValorIPI);
        
        
          //----------------------------------------------------------------------------------//
          
          
            //--------------------------------------------------------------------------------------//
        
         lblValorServico = new JLabel(" Valor Serviço ");
        lblValorServico.setBounds(75, 220, 150, 20);
        lblValorServico.setFont(new Font("Arial", 1, 12));
        valores.add(lblValorServico);
        
        txtValorServico = new JTextField();
        txtValorServico.setBounds(170, 220, 100, 22);
        valores.add(txtValorServico);
        
        
          //----------------------------------------------------------------------------------//
          
          
             //--------------------------------------------------------------------------------------//
        
         lblValorISS = new JLabel(" Valor ISS ");
        lblValorISS.setBounds(95, 250, 150, 20);
        lblValorISS.setFont(new Font("Arial", 1, 12));
        valores.add(lblValorISS);
        
        txtValorISS = new JTextField();
        txtValorISS.setBounds(170, 250, 100, 22);
        valores.add(txtValorISS);
        
        
          //----------------------------------------------------------------------------------//
          
          
       
          
          
          
          
          
          
           //--------------------------------------------------------------------------------------//
        
         lblFrete = new JLabel(" Frete ");
        lblFrete.setBounds(410, 20, 150, 20);
        lblFrete.setFont(new Font("Arial", 1, 12));
        valores.add(lblFrete);
        
        txtFrete = new JTextField();
        txtFrete.setBounds(460, 20, 100, 22);
        valores.add(txtFrete);
        
        
          //----------------------------------------------------------------------------------//
       
       
        //--------------------------------------------------------------------------------------//
        
         lblSeguro = new JLabel(" Seguro ");
        lblSeguro.setBounds(400, 50, 150, 20);
        lblSeguro.setFont(new Font("Arial", 1, 12));
        valores.add(lblSeguro);
        
        txtSeguro = new JTextField();
        txtSeguro.setBounds(460, 50, 100, 22);
        valores.add(txtSeguro);
        
        
          //----------------------------------------------------------------------------------//
       
       
          
          
        //--------------------------------------------------------------------------------------//
        
         lblOutrasDesp = new JLabel("Outras Despesas ");
        lblOutrasDesp.setBounds(350, 95, 150, 20);
        lblOutrasDesp.setFont(new Font("Arial", 1, 12));
        valores.add(lblOutrasDesp);
        
        txtOutrasDesp = new JTextField();
        txtOutrasDesp.setBounds(460, 95, 100, 22);
        valores.add(txtOutrasDesp);
        
        
          //----------------------------------------------------------------------------------//
          
            //--------------------------------------------------------------------------------------//
        
         lblDesconto = new JLabel(" Desconto ");
        lblDesconto.setBounds(390, 125, 150, 20);
        lblDesconto.setFont(new Font("Arial", 1, 12));
        valores.add(lblDesconto);
        
        txtDesconto = new JTextField();
        txtDesconto.setBounds(460, 125, 100, 22);
        valores.add(txtDesconto);
        
        
          //----------------------------------------------------------------------------------//
       
       
          
          
            //--------------------------------------------------------------------------------------//
        
         lblTotalProduto = new JLabel("Total Produtos ");
        lblTotalProduto.setBounds(360, 220, 150, 20);
        lblTotalProduto.setFont(new Font("Arial", 1, 12));
        valores.add(lblTotalProduto);
        
        txtTotalProduto = new JTextField();
        txtTotalProduto.setBounds(460, 220, 100, 22);
        valores.add(txtTotalProduto);
        
        
          //----------------------------------------------------------------------------------//
          
          
             //--------------------------------------------------------------------------------------//
        
         lblNotaFiscal = new JLabel("Total Nota Físcal ");
        lblNotaFiscal.setBounds(350, 250, 150, 20);
        lblNotaFiscal.setFont(new Font("Arial", 1, 12));
        valores.add(lblNotaFiscal);
        
        txtNotaFiscal = new JTextField();
        txtNotaFiscal.setBounds(460, 250, 100, 22);
        valores.add(txtNotaFiscal);
        
        
        
          //----------------------------------------------------------------------------------//
          
         ckFrete = new JCheckBox(" Calcular Frete");
        ckFrete.setBounds(290, 5, 170, 20);
        ckFrete.setFont(new Font("Arial", 1, 12));
        valores.add(ckFrete);
        
          //----------------------------------------------------------------------------------//
       
       
          
            //------------CRIANDO PAINEL PERMISSAO ----------------//
         painelParcela = new JPanel();
        painelParcela.setLayout(null);        
        painelParcela.setBorder(BorderFactory.createTitledBorder(""));
        painelParcela.setBounds(680, 120, 140, 60);
        painelTipo.add(painelParcela);
          
          
          
       
          //--------------------------------------------------------------------------------------//
        
         lblParcelas = new JLabel(" Parcelas ");
        lblParcelas.setBounds(40, 5, 150, 20);
        lblParcelas.setFont(new Font("Arial", 1, 12));
        painelParcela.add(lblParcelas);
        
        txtParcelas = new JTextField();
        txtParcelas.setBounds(45, 25, 50, 22);
        painelParcela.add(txtParcelas);
        
        
          //----------------------------------------------------------------------------------//
          
         ckRecalcular = new JCheckBox(" Recalcular Parcelas ");
        ckRecalcular.setBounds(675, 185, 170, 20);
        ckRecalcular.setFont(new Font("Arial", 1, 12));
        painelTipo.add(ckRecalcular);
        
        
        
        
        
         //-------------------------------------------------------------------------------------------// 
        btnGravar = new JButton("Gravar");
       btnGravar.setBounds(210, 525, 100, 35);       
       btnGravar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));      
       btnGravar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnGravar.setFont(new Font("Arial", 1, 13));
        
       painelPrincipal.add(btnGravar);
   //-------------------------------------------------------------------------------------------// 
   
   
   //-------------------------------------------------------------------------------------------// 
        btnConsultar = new JButton("Consultar");
       btnConsultar.setBounds(340, 525, 100, 35);       
       btnConsultar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/consulta.png"));      
       btnConsultar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnConsultar.setFont(new Font("Arial", 1, 13));
        
       painelPrincipal.add(btnConsultar);
   //-------------------------------------------------------------------------------------------// 
   
   
   //-------------------------------------------------------------------------------------------// 
        btnCancelar = new JButton("Cancelar");
       btnCancelar.setBounds(450, 525, 100, 35);       
       btnCancelar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));      
       btnCancelar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnCancelar.setFont(new Font("Arial", 1, 13));
        
       painelPrincipal.add(btnCancelar);
   //-------------------------------------------------------------------------------------------// 
   
   
   //-------------------------------------------------------------------------------------------// 
        btnSair = new JButton("Sair");
       btnSair.setBounds(560, 525, 100, 35);       
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

        modelo.addColumn("Cod. Produto");
        modelo.addColumn("Descrição Produto");
        modelo.addColumn("Quantidade");              
        modelo.addColumn("Unitario");
        modelo.addColumn("Total");
       

        tblCompras_Entrada = new JTable();
        tblCompras_Entrada.setModel(modelo);
        tblCompras_Entrada.getColumnModel().getColumn(0).setPreferredWidth(90);
        tblCompras_Entrada.getColumnModel().getColumn(1).setPreferredWidth(240);
        tblCompras_Entrada.getColumnModel().getColumn(2).setPreferredWidth(90);
        tblCompras_Entrada.getColumnModel().getColumn(3).setPreferredWidth(90);
        tblCompras_Entrada.getColumnModel().getColumn(4).setPreferredWidth(90);
       

        tblCompras_Entrada.getTableHeader().setResizingAllowed(false);
        tblCompras_Entrada.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblCompras_Entrada.getTableHeader();
        cabecalho.setFont(new Font("Arial", 0, 12));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblCompras_Entrada.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblCompras_Entrada.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        tblCompras_Entrada.getColumnModel().getColumn(2).setCellRenderer(centralizaColunas);
        tblCompras_Entrada.getColumnModel().getColumn(3).setCellRenderer(centralizaColunas);

        tblCompras_Entrada.setFont(new Font("Arial", 0, 14));

        scrollTable = new JScrollPane(tblCompras_Entrada,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(10, 140, 620, 200);
        tblCompras_Entrada.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        produto.add(scrollTable);
    }
    
    
}
