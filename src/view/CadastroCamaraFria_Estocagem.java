/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
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

/**
 *
 * @author Guilherme
  */

public class CadastroCamaraFria_Estocagem {

    private JFrame janela;
    private JPanel painelCamaraFria_Estocagem, painelEstocagem,painelSaida;
    private JTable tblEntradaEstocagem,tblSaidaEstocagem;
    private JScrollPane scrollTable,scrollTable2;
    private DefaultTableModel modelo,modelo2;
    private JButton btnProcurarCliente,btnBuscar,btnProcurarProduto,btnInserir,btnExcluir,btnAdiantamento;
    private JButton btnInserirSaida,btnExcluirSaida,btnPagamento,btnSair,btnCancelar,btnImprimir;
    private ButtonGroup groupEstocagem;
    private JRadioButton rdTodos,rdAberto;
    private JLabel lblCliente,lblCodCliente,lblDataEntrada,lblCamara,lblProduto,lblCodProduto,lblQuantidade;
    private JLabel lblLote,lblAla,lblBloco,lblObservacao,lblSaida,lblDataSaida,lblDias,lblQtd,lblUnitario,lblTotal;
    private JLabel lblTotalAberto, lblAdiantAberto;
    private JTextField txtCliente,txtCodCliente,txtDataEntrada,txtProduto,txtCodProduto,txtQuantidade;
    private JTextField txtLote,txtAla,txtBloco,txtObservacao,txtDataSaida,txtDias,txtQtd,txtUnitario,txtTotal;
    private JTextField txtTotalAberto,txtAdiantAberto;
    private JComboBox cbCamara;

    public void desenharTela() {

        janela = new JFrame("Camara Fria - Estocagem");
        janela.setSize(730, 695);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        

//--------------------------------------------------------------------------------------------//
       
        painelCamaraFria_Estocagem = new JPanel();
        painelCamaraFria_Estocagem.setLayout(null);
        painelCamaraFria_Estocagem.setSize(900, 900);
        painelCamaraFria_Estocagem.setLocation(0, 0);
 //--------------------------------------------------------------------------------------------//
 
 
        lblCliente = new JLabel("Cliente:");
        lblCliente.setBounds(10, 5, 150, 20);
        lblCliente.setFont(new Font("Arial", 0, 13));
        painelCamaraFria_Estocagem.add(lblCliente);
        
        txtCliente = new JTextField();
        txtCliente.setBounds(10, 25, 300, 22);
        painelCamaraFria_Estocagem.add(txtCliente);
   //--------------------------------------------------------------------------------------------//
   
   
        lblCodCliente = new JLabel("Cód Cli:");
        lblCodCliente.setBounds(315, 5, 150, 20);
        //lblCodCliente.setFont(new Font("Arial", 0, 13));
        painelCamaraFria_Estocagem.add(lblCodCliente);
        
        txtCodCliente = new JTextField();
        txtCodCliente.setBounds(315, 25, 50, 22);
        painelCamaraFria_Estocagem.add(txtCodCliente);
 //--------------------------------------------------------------------------------------------//
 
 
        btnProcurarCliente = new JButton("");
        btnProcurarCliente.setBounds(370, 25, 25, 21);
        btnProcurarCliente.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
        btnProcurarCliente.setFont(new Font("Arial", 1, 13));
        btnProcurarCliente.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelCamaraFria_Estocagem.add(btnProcurarCliente);
 //--------------------------------------------------------------------------------------------//
 
 
        btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(400, 20, 90, 30);
        btnBuscar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/procurar.png"));
        btnBuscar.setFont(new Font("Arial", 1, 13));
        btnBuscar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnBuscar.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelCamaraFria_Estocagem.add(btnBuscar);
//--------------------------------------------------------------------------------------------//


        painelEstocagem = new JPanel();
        painelEstocagem.setLayout(null);
        painelEstocagem.setBorder(BorderFactory.createTitledBorder("Estocagem:"));
        painelEstocagem.setSize(200, 50);
        painelEstocagem.setLocation(510, 5);
 //--------------------------------------------------------------------------------------------//
 
        rdTodos = new JRadioButton("Aberto");
        rdTodos.setBounds(20, 22, 80, 17);
        rdTodos.setFont(new Font("Arial", 0, 12));
        painelEstocagem.add(rdTodos);
        
        rdAberto = new JRadioButton("Todos");
        rdAberto.setBounds(100, 22, 80, 17);
        rdAberto.setFont(new Font("Arial", 0, 12));
        painelEstocagem.add(rdAberto);
        
        groupEstocagem = new ButtonGroup();
        groupEstocagem.add(rdTodos);
        groupEstocagem.add(rdAberto);
        
        painelCamaraFria_Estocagem.add(painelEstocagem);
 //--------------------------------------------------------------------------------------------//
 
 
        criarTabela();
        
        lblDataEntrada = new JLabel("Data Entrada:");
        lblDataEntrada.setBounds(10, 190, 80, 22);
        lblDataEntrada.setFont(new Font("Arial", 0, 12));
        painelCamaraFria_Estocagem.add(lblDataEntrada);
        
        txtDataEntrada = new JTextField();
        txtDataEntrada.setBounds(10, 210, 80, 22);
        painelCamaraFria_Estocagem.add(txtDataEntrada);
 //--------------------------------------------------------------------------------------------//
 
 
        lblCamara = new JLabel("Câmara:");
        lblCamara.setBounds(100, 190, 150, 22);
        lblCamara.setFont(new Font("Arial", 0, 12));
        painelCamaraFria_Estocagem.add(lblCamara);
        
        cbCamara = new JComboBox();
        cbCamara.setBounds(100, 210, 160, 21);
        painelCamaraFria_Estocagem.add(cbCamara);
//--------------------------------------------------------------------------------------------//


        lblProduto = new JLabel("Produto:");
        lblProduto.setBounds(270, 190, 150, 22);
        lblProduto.setFont(new Font("Arial", 0, 12));
        painelCamaraFria_Estocagem.add(lblProduto);
        
        txtProduto = new JTextField();
        txtProduto.setBounds(270, 210, 270, 22);
        painelCamaraFria_Estocagem.add(txtProduto);
 //--------------------------------------------------------------------------------------------//
 
 
        lblCodProduto = new JLabel("Código:");
        lblCodProduto.setBounds(545, 190, 150, 22);
        lblCodProduto.setFont(new Font("Arial", 0, 12));
        painelCamaraFria_Estocagem.add(lblCodProduto);
        
        txtCodProduto = new JTextField();
        txtCodProduto.setBounds(545, 210, 50, 22);
        painelCamaraFria_Estocagem.add(txtCodProduto);
 //--------------------------------------------------------------------------------------------//
 
 
        btnProcurarProduto = new JButton("");
        btnProcurarProduto.setBounds(600, 210, 25, 22);
        btnProcurarProduto.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
        btnProcurarProduto.setFont(new Font("Arial", 1, 13));
        btnProcurarProduto.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelCamaraFria_Estocagem.add(btnProcurarProduto);
 //--------------------------------------------------------------------------------------------//
 
 
        lblQuantidade = new JLabel("Quantidade:");
        lblQuantidade.setBounds(640, 190, 80, 22);
        lblQuantidade.setFont(new Font("Arial", 0, 12));
        painelCamaraFria_Estocagem.add(lblQuantidade);
        
        txtQuantidade = new JTextField();
        txtQuantidade.setBounds(630, 210, 85, 22);
        painelCamaraFria_Estocagem.add(txtQuantidade);
 //--------------------------------------------------------------------------------------------//
 
 
       lblLote = new JLabel("Lote:");
        lblLote.setBounds(10, 230,50, 22);
        lblLote.setFont(new Font("Arial", 0, 12));
        painelCamaraFria_Estocagem.add(lblLote);
        
        txtLote = new JTextField();
        txtLote.setBounds(10, 250, 40, 22);
        painelCamaraFria_Estocagem.add(txtLote);
 //--------------------------------------------------------------------------------------------//
 
 
        lblAla = new JLabel("Ala:");
        lblAla.setBounds(70, 230,50, 22);
        lblAla.setFont(new Font("Arial", 0, 12));
        painelCamaraFria_Estocagem.add(lblAla);
        
        txtAla = new JTextField();
        txtAla.setBounds(70, 250, 100, 22);
        painelCamaraFria_Estocagem.add(txtAla);
 //--------------------------------------------------------------------------------------------//
 
 
        lblBloco = new JLabel("Bloco:");
        lblBloco.setBounds(180, 230,50, 22);
        lblBloco.setFont(new Font("Arial", 0, 12));
        painelCamaraFria_Estocagem.add(lblBloco);
        
        txtBloco = new JTextField();
        txtBloco.setBounds(180, 250, 100, 22);
        painelCamaraFria_Estocagem.add(txtBloco);
//--------------------------------------------------------------------------------------------//


        lblObservacao = new JLabel("Observação:");
        lblObservacao.setBounds(300, 230,80, 22);
        lblObservacao.setFont(new Font("Arial", 0, 12));
        painelCamaraFria_Estocagem.add(lblObservacao);
        
        txtObservacao = new JTextField();
        txtObservacao.setBounds(300, 250, 260, 60);
        painelCamaraFria_Estocagem.add(txtObservacao);
//--------------------------------------------------------------------------------------------//


        btnInserir = new JButton("Inserir");
        btnInserir.setBounds(10, 280, 80, 30);
        btnInserir.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/incluir.png"));
        btnInserir.setFont(new Font("Arial", 1, 13));
        btnInserir.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnInserir.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelCamaraFria_Estocagem.add(btnInserir);
//--------------------------------------------------------------------------------------------//


        btnExcluir = new JButton("Excluir");
        btnExcluir.setBounds(100, 280, 80, 30);
        btnExcluir.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/excluir2.png"));
        btnExcluir.setFont(new Font("Arial", 1, 13));
        btnExcluir.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnExcluir.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelCamaraFria_Estocagem.add(btnExcluir);
//--------------------------------------------------------------------------------------------//


        btnAdiantamento = new JButton("Adiantamento");
        btnAdiantamento.setBounds(585, 270, 128, 35);
        btnAdiantamento.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/adiantamento.png"));
        btnAdiantamento.setFont(new Font("Arial", 1, 13));
        btnAdiantamento.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnAdiantamento.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelCamaraFria_Estocagem.add(btnAdiantamento); 
 //--------------------------------------------------------------------------------------------//
 
 
       painelSaida = new JPanel();
        painelSaida.setLayout(null);
        painelSaida.setBorder(BorderFactory.createTitledBorder(""));
        painelSaida.setBounds(10, 320, 705, 275);
 
        painelCamaraFria_Estocagem.add(painelSaida);
    //--------------------------------------------------------------------------------------------//


    
        lblSaida = new JLabel("SAIDA");
        lblSaida.setBounds(300, 10,120, 20);
        lblSaida.setFont(new Font("Arial", 1, 25));
        lblSaida.setForeground(Color.red);
        painelSaida.add(lblSaida);
        
        criarTabela2();
        
        lblDataSaida = new JLabel("Data Saida:");
        lblDataSaida.setBounds(10, 190, 80, 22);
        lblDataSaida.setFont(new Font("Arial", 0, 13));
        painelSaida.add(lblDataSaida);
    
        txtDataSaida = new JTextField();
        txtDataSaida.setBounds(10, 210, 100, 22);
        painelSaida.add(txtDataSaida);
  //--------------------------------------------------------------------------------------------//      
        lblDias = new JLabel("Dias:");
        lblDias.setBounds(130, 190, 80, 22);
        lblDias.setFont(new Font("Arial", 0, 13));
        painelSaida.add(lblDias);
        
        txtDias = new JTextField();
        txtDias.setBounds(130, 210, 100, 22);
        painelSaida.add(txtDias);
//--------------------------------------------------------------------------------------------//


        lblQtd = new JLabel("Qtd:");
        lblQtd.setBounds(250, 190, 80, 22);
        lblQtd.setFont(new Font("Arial", 0, 13));
        painelSaida.add(lblQtd);
        
        txtQtd = new JTextField();
        txtQtd.setBounds(250, 210, 100, 22);
        painelSaida.add(txtQtd);
 //--------------------------------------------------------------------------------------------//
 
 
        lblUnitario = new JLabel("Unitario:");
        lblUnitario.setBounds(370, 190, 80, 22);
        lblUnitario.setFont(new Font("Arial", 0, 13));
        painelSaida.add(lblUnitario);
        
        txtUnitario = new JTextField();
        txtUnitario.setBounds(370, 210, 100, 22);
        painelSaida.add(txtUnitario);
   //--------------------------------------------------------------------------------------------//
   
   
        lblTotal = new JLabel("Total:");
        lblTotal.setBounds(490, 190, 80, 22);
        lblTotal.setFont(new Font("Arial", 0, 13));
        painelSaida.add(lblTotal);
        
        txtTotal = new JTextField();
        txtTotal.setBounds(490, 210, 100, 22);
        painelSaida.add(txtTotal);
  //--------------------------------------------------------------------------------------------//
  
  
        btnInserirSaida = new JButton("Inserir Saida");
        btnInserirSaida.setBounds(10, 240, 105, 30);
        btnInserirSaida.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/incluir.png"));
        btnInserirSaida.setFont(new Font("Arial", 1, 11));
        btnInserirSaida.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnInserirSaida.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelSaida.add(btnInserirSaida);
  //--------------------------------------------------------------------------------------------//
  
  
        btnExcluirSaida = new JButton("Excluir");
        btnExcluirSaida.setBounds(120, 240, 105, 30);
        btnExcluirSaida.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/excluir2.png"));
        btnExcluirSaida.setFont(new Font("Arial", 1, 11));
        btnExcluirSaida.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnExcluirSaida.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelSaida.add(btnExcluirSaida);
 //--------------------------------------------------------------------------------------------//
 
 
        btnPagamento = new JButton("Pagamento");
        btnPagamento.setBounds(490, 240, 100, 30);
        btnPagamento.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/dinheiro.png"));
        btnPagamento.setFont(new Font("Arial", 1, 11));
        btnPagamento.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnPagamento.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelSaida.add(btnPagamento);
 //--------------------------------------------------------------------------------------------//
 
 
        btnSair = new JButton("Sair");
        btnSair.setBounds(10, 617, 100, 30);
        btnSair.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/sair.png"));
        btnSair.setFont(new Font("Arial", 1, 11));
        btnSair.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnSair.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelCamaraFria_Estocagem.add(btnSair);
//--------------------------------------------------------------------------------------------//


        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(130, 617, 100, 30);
        btnCancelar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));
        btnCancelar.setFont(new Font("Arial", 1, 11));
        btnCancelar.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelCamaraFria_Estocagem.add(btnCancelar);
  //--------------------------------------------------------------------------------------------//
  
  
        lblTotalAberto = new JLabel("TOTAL ABERTO");
        lblTotalAberto.setBounds(255, 600,160, 20);
        lblTotalAberto.setFont(new Font("Arial", 1, 17));
        lblTotalAberto.setForeground(Color.blue);
        painelCamaraFria_Estocagem.add(lblTotalAberto);
        
        txtTotalAberto = new JTextField();
        txtTotalAberto.setBounds(255, 620, 160, 25);
        painelCamaraFria_Estocagem.add(txtTotalAberto);
 //--------------------------------------------------------------------------------------------//
 
 
        lblAdiantAberto = new JLabel("Adiant. Aberto");
        lblAdiantAberto.setBounds(435, 600,160, 20);
        lblAdiantAberto.setFont(new Font("Arial", 1, 17));
        lblAdiantAberto.setForeground(Color.blue);
        painelCamaraFria_Estocagem.add(lblAdiantAberto);
        
        txtAdiantAberto = new JTextField();
        txtAdiantAberto.setBounds(435, 620, 160, 25);
        painelCamaraFria_Estocagem.add(txtAdiantAberto);        
  //--------------------------------------------------------------------------------------------//
  
  
        btnImprimir = new JButton("Imprimir");
        btnImprimir.setBounds(615, 617, 100, 30);
        btnImprimir.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/visualizar.png"));
        btnImprimir.setFont(new Font("Arial", 1, 11));
        btnImprimir.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelCamaraFria_Estocagem.add(btnImprimir);
        
        janela.add(painelCamaraFria_Estocagem);
        janela.setVisible(true);

    }
    
    private void criarTabela() {
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        modelo.addColumn("Controle");
        modelo.addColumn("Data Entrada");
        modelo.addColumn("Cod Prod");
        modelo.addColumn("Descrição Produto");
        modelo.addColumn("Qtd");
        modelo.addColumn("Dias");
        modelo.addColumn("Unitario");
        modelo.addColumn("Total");
        modelo.addColumn("Ala");
        modelo.addColumn("Bloco");
        modelo.addColumn("Lote");
        modelo.addColumn("Cod Camara");
        modelo.addColumn("Obs");

        tblEntradaEstocagem = new JTable();
        tblEntradaEstocagem.setModel(modelo);
        tblEntradaEstocagem.getColumnModel().getColumn(0).setPreferredWidth(70);
        tblEntradaEstocagem.getColumnModel().getColumn(1).setPreferredWidth(220);
        tblEntradaEstocagem.getColumnModel().getColumn(2).setPreferredWidth(220);
        tblEntradaEstocagem.getColumnModel().getColumn(3).setPreferredWidth(220);

        tblEntradaEstocagem.getTableHeader().setResizingAllowed(false);
        tblEntradaEstocagem.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblEntradaEstocagem.getTableHeader();
        cabecalho.setFont(new Font("Arial", 1, 12));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblEntradaEstocagem.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblEntradaEstocagem.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        tblEntradaEstocagem.getColumnModel().getColumn(2).setCellRenderer(centralizaColunas);
        tblEntradaEstocagem.getColumnModel().getColumn(3).setCellRenderer(centralizaColunas);

        tblEntradaEstocagem.setFont(new Font("Arial", 0, 14));

        scrollTable = new JScrollPane(tblEntradaEstocagem,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(10, 70, 700, 115);
        tblEntradaEstocagem.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelCamaraFria_Estocagem.add(scrollTable);
    }
    
    private void criarTabela2() {
        modelo2 = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        modelo2.addColumn("Cl_Estocagem");
        modelo2.addColumn("C.I");
        modelo2.addColumn("Data Saida");
        modelo2.addColumn("Qtd");
        modelo2.addColumn("Unitario");
        modelo2.addColumn("Total");
        modelo2.addColumn("Valor Aberto");
        modelo2.addColumn("Baixa");
        modelo2.addColumn("Adiantamento");

        tblSaidaEstocagem = new JTable();
        tblSaidaEstocagem.setModel(modelo2);
        tblSaidaEstocagem.getColumnModel().getColumn(0).setPreferredWidth(70);
        tblSaidaEstocagem.getColumnModel().getColumn(1).setPreferredWidth(220);
        tblSaidaEstocagem.getColumnModel().getColumn(2).setPreferredWidth(220);
        tblSaidaEstocagem.getColumnModel().getColumn(3).setPreferredWidth(220);

        tblSaidaEstocagem.getTableHeader().setResizingAllowed(false);
        tblSaidaEstocagem.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblSaidaEstocagem.getTableHeader();
        cabecalho.setFont(new Font("Arial", 1, 12));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblSaidaEstocagem.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblSaidaEstocagem.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        tblSaidaEstocagem.getColumnModel().getColumn(2).setCellRenderer(centralizaColunas);
        tblSaidaEstocagem.getColumnModel().getColumn(3).setCellRenderer(centralizaColunas);

        tblSaidaEstocagem.setFont(new Font("Arial", 0, 12));

        scrollTable2 = new JScrollPane(tblSaidaEstocagem,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable2.setBounds(10, 40, 690, 150);
        tblSaidaEstocagem.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelSaida.add(scrollTable2);
    }
}