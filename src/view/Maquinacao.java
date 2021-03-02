
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


public class Maquinacao {
    
  
      private JFrame janela, janelaSetor;
    private JPanel painelPrincipal, painelTabela, painelTipo1, painelTipo2, painelSetor;
    private JLabel lblData,lblCliente,lblCodCliente, lblMaquinacao, lblPrazo, lblDataVencimento,lblTipo,lblTotalParcial, lblMotorista, lblPlaca,  lblQtdRoca, lblEscritorio, lblAdiantamento, lblTotalGeral;
    private JTextField txtCliente, txtCodCliente, txtMaquinacao, txtPrazo, txtTotalParcial, txtMotorista, txtCodMotorista, txtPlaca, txtAdiantamento, txtTotalGeral;
    private JButton btnConsultaCliente,btnConsultaMotorista,btnCancelaTabela,btnAlterarTabela,btnExcluirTabela,btnGravaTabela, btnGravar, btnCancelar, btnConsultar, btnSair;
    private JComboBox cbEscritorio, cbTipo, cbSetor;
    private JRadioButton rdCom, rdTerceiro, rdPagar, rdReceber;
    private ButtonGroup groupTipo1, groupTipo2;
    private JTable tblProduto, tblSetor, tblSet;
    private JScrollPane scrollTable;
    private DefaultTableModel modelo;
    private JFormattedTextField txtData, txtDataVencimento;
    private JLabel lblSetor, lblQtd, lblPrecoUnit, lblValorTotal;
    private JTextField  txtQtd, txtPrecoUnit, txtValorTotal;
    private JButton btnAdicionarSet, btnAlterarSet, btnExcluirSet, btnGravarSet, btnCancelarSet, btnSairSet;
    
  public void desenharTela() throws ParseException {  
     janela = new JFrame("Maquinação Venda");
        janela.setSize(880, 625);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);       

        
        

        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(860, 580);
        painelPrincipal.setLocation(5, 5);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        
        
        
         lblData = new JLabel("Data ");
        lblData.setBounds(13, 10, 60, 22);
        painelPrincipal.add(lblData);
        
        txtData = new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtData.setBounds(10, 30, 80, 22);
        painelPrincipal.add(txtData);
        
     //--------------------------------------------------------------   
         lblCliente = new JLabel("Cliente ");
        lblCliente.setBounds(100, 10, 60, 22);
        painelPrincipal.add(lblCliente);
        
        txtCliente = new JTextField();
        txtCliente.setBounds(100, 30, 250, 22);
        painelPrincipal.add(txtCliente);
      //--------------------------------------------------------------  
         lblCodCliente = new JLabel("Cod.Cliente");
        lblCodCliente.setBounds(360, 10, 120, 22);
        painelPrincipal.add(lblCodCliente);
        
        txtCodCliente = new JTextField();
        txtCodCliente.setBounds(360, 30, 60, 22);
        painelPrincipal.add(txtCodCliente);
      //--------------------------------------------------------------
      
          
          //------------BOTAO PESQUISAR PRODUTO ---------------------//
       
       btnConsultaCliente = new JButton();
       btnConsultaCliente.setBounds(425, 30, 20, 20);       
       btnConsultaCliente.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
       btnConsultaCliente.setToolTipText("Pesquisar Cliente");
       btnConsultaCliente.setHorizontalTextPosition(SwingConstants.CENTER);
        btnConsultaCliente.addActionListener((java.awt.event.ActionEvent evt) -> {  
           
           ConsultaCliente_Simplificada consult = new ConsultaCliente_Simplificada();
           consult.desenharTela();
        });
        
       painelPrincipal.add(btnConsultaCliente);
      
      //--------------------------------------------------------------  
         lblMaquinacao = new JLabel("Maquinação");
        lblMaquinacao.setBounds(450, 10, 120, 22);
        painelPrincipal.add(lblMaquinacao);
        
        txtMaquinacao = new JTextField();
        txtMaquinacao.setBounds(450, 30, 70, 22);
        painelPrincipal.add(txtMaquinacao);
      //----------------------------------------------------
        
          lblPrazo = new JLabel("Prazo");
        lblPrazo.setBounds(530, 10, 120, 22);
        painelPrincipal.add(lblPrazo);
        
        txtPrazo = new JTextField();
        txtPrazo.setBounds(530, 30, 40, 22);
        painelPrincipal.add(txtPrazo);
      //----------------------------------------------------
      
         lblDataVencimento = new JLabel("Data Vencimento");
        lblDataVencimento.setBounds(580, 10, 120, 22);
        painelPrincipal.add(lblDataVencimento);
        
        txtDataVencimento = new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtDataVencimento.setBounds(580, 30, 80, 22);
        painelPrincipal.add(txtDataVencimento);
      //----------------------------------------------------
        
      
      
        lblMotorista = new JLabel("Motorista ");
        lblMotorista.setBounds(10, 60, 60, 22);
        painelPrincipal.add(lblMotorista);
        
        txtMotorista = new JTextField();
        txtMotorista.setBounds(10, 80, 250, 22);
        painelPrincipal.add(txtMotorista);
      //--------------------------------------------------------------  
         
        txtCodMotorista = new JTextField();
        txtCodMotorista.setBounds(265, 80, 40, 22);
        painelPrincipal.add(txtCodMotorista);
      //--------------------------------------------------------------
      
          
          //------------BOTAO PESQUISAR PRODUTO ---------------------//
       
       btnConsultaMotorista = new JButton();
       btnConsultaMotorista.setBounds(310, 80, 20, 22);       
       btnConsultaMotorista.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
       btnConsultaMotorista.setToolTipText("Pesquisar Motorista");
       btnConsultaMotorista.setHorizontalTextPosition(SwingConstants.CENTER);
        
       painelPrincipal.add(btnConsultaMotorista);
       
       
       
        lblPlaca = new JLabel("Placa ");
        lblPlaca.setBounds(340, 60, 60, 22);
        painelPrincipal.add(lblPlaca);
        
        txtPlaca = new JTextField();
        txtPlaca.setBounds(340, 80, 80, 22);
        painelPrincipal.add(txtPlaca);
       
      
     
        //----------------------------------------------------------------------------//
        
          lblEscritorio = new JLabel("Escritorio ");
        lblEscritorio.setBounds(10, 110, 80, 22);
        painelPrincipal.add(lblEscritorio);
        
        cbEscritorio = new JComboBox();
        cbEscritorio.setBounds(10, 130, 150, 22);
        painelPrincipal.add(cbEscritorio);
        
        
        //-------------------------------------------------------------------------------------//
        
        painelTabela = new JPanel();
        painelTabela.setLayout(null);
        painelTabela.setSize(840, 240);
        painelTabela.setLocation(10, 170);
        painelTabela.setBorder(BorderFactory.createTitledBorder(""));
        painelPrincipal.add(painelTabela);
        
        
        
          lblTipo = new JLabel("Tipo ");
        lblTipo.setBounds(10, 190, 80, 22);
        painelTabela.add(lblTipo);
        
        cbTipo = new JComboBox();
        cbTipo.setBounds(10, 210, 200, 22);
        painelTabela.add(cbTipo);
        //----------------------------------------------------------------------//
        
          lblTotalParcial = new JLabel("Total Parcial ");
        lblTotalParcial.setBounds(720, 190, 80, 22);
        painelTabela.add(lblTotalParcial);
        
        txtTotalParcial = new JTextField();
        txtTotalParcial.setBounds(720, 210, 100, 22);
        painelTabela.add(txtTotalParcial);
        
        
        
           //---------------- BOTAO GRAVAR-----//
       btnGravaTabela = new JButton("Gravar");
       btnGravaTabela.setBounds(250, 205, 100, 30);       
       btnGravaTabela.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));       
       btnGravaTabela.setHorizontalTextPosition(SwingConstants.RIGHT);            
       btnGravaTabela.setFont(new Font("Arial", 1, 13));
       btnGravaTabela.addActionListener((java.awt.event.ActionEvent evt) -> { 
           
                        criarDadosSetor();
        });   
       
        
       painelTabela.add(btnGravaTabela);
       
       
        // ---------------- BOTAO GRAVAR-----//
       btnCancelaTabela = new JButton("Cancelar");
       btnCancelaTabela.setBounds(360, 205, 100, 30);       
        btnCancelaTabela.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));      
       btnCancelaTabela.setFont(new Font("Arial", 1, 13));
       btnCancelaTabela.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelTabela.add(btnCancelaTabela);
       
       
      
       
       
        // ---------------- BOTAO GRAVAR-----//
       btnAlterarTabela = new JButton("Alterar");
       btnAlterarTabela.setBounds(470, 205, 100, 30);       
       btnAlterarTabela.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/alterar2.png"));      
       btnAlterarTabela.setFont(new Font("Arial", 1, 13));
       btnAlterarTabela.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelTabela.add(btnAlterarTabela);
       
        btnExcluirTabela = new JButton("Excluir");
       btnExcluirTabela.setBounds(580, 205, 100, 30);       
       btnExcluirTabela.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/excluir2.png"));
        btnExcluirTabela.setFont(new Font("Arial", 1, 13));
       btnExcluirTabela.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelTabela.add(btnExcluirTabela);
        
        
        
        
        
          painelTipo1 = new JPanel();
        painelTipo1.setLayout(null);
        painelTipo1.setSize(175, 50);
        painelTipo1.setLocation(680, 10);
        painelTipo1.setBorder(BorderFactory.createTitledBorder("Tipo"));
        painelPrincipal.add(painelTipo1);
        
          rdCom = new JRadioButton("COM/SAC");
        rdCom.setBounds(10, 20, 80, 20);
        rdCom.setFont(new Font("Arial", 0, 10));
        painelTipo1.add(rdCom);
        
        rdTerceiro = new JRadioButton("Terceiros");
        rdTerceiro.setBounds(90, 20, 80, 20);
        rdTerceiro.setFont(new Font("Arial", 0, 10));
        painelTipo1.add(rdTerceiro);
        
        groupTipo1 = new ButtonGroup();
        groupTipo1.add(rdCom);
        groupTipo1.add(rdTerceiro);
        
        //-----------------------------------------------------------------------//
        
         painelTipo2 = new JPanel();
        painelTipo2.setLayout(null);
        painelTipo2.setSize(175, 50);
        painelTipo2.setLocation(680, 60);
        painelTipo2.setBorder(BorderFactory.createTitledBorder("Tipo"));
        painelPrincipal.add(painelTipo2);
        
          rdReceber = new JRadioButton("A Receber");
        rdReceber.setBounds(10, 20, 80, 20);
        rdReceber.setFont(new Font("Arial", 0, 10));
        painelTipo2.add(rdReceber);
        
        rdPagar = new JRadioButton("A Pagar");
        rdPagar.setBounds(90, 20, 80, 20);
        rdPagar.setFont(new Font("Arial", 0, 10));
        painelTipo2.add(rdPagar);
        
        groupTipo2 = new ButtonGroup();
        groupTipo2.add(rdReceber);
        groupTipo2.add(rdPagar);
        
        //-------------------------------------------------------//
        
          lblAdiantamento = new JLabel("Adiantamento ");
        lblAdiantamento.setBounds(720, 430, 130, 22);
        lblAdiantamento.setFont(new Font("Arial", 1, 18));
        lblAdiantamento.setForeground(Color.blue);
        painelPrincipal.add(lblAdiantamento);
        
        txtAdiantamento = new JTextField();
        txtAdiantamento.setBounds(720, 450, 120, 22);
        painelPrincipal.add(txtAdiantamento);
        
        
          //-------------------------------------------------------//
        
          lblTotalGeral = new JLabel("Total Geral ");
        lblTotalGeral.setBounds(720, 490, 100, 22);
         lblTotalGeral.setFont(new Font("Arial", 1, 18));
         lblTotalGeral.setForeground(Color.red);
        painelPrincipal.add(lblTotalGeral);
        
        txtTotalGeral = new JTextField();
        txtTotalGeral.setBounds(720, 510, 120, 22);
        painelPrincipal.add(txtTotalGeral);
        
        //------------------------------------------------------------------//
        
             // ---------------- BOTAO GRAVAR-----//
        btnGravar = new JButton("Gravar");
        btnGravar.setBounds(200, 535, 100, 35);  
        btnGravar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));
         btnGravar.setFont(new Font("Arial", 1, 13));
       btnGravar.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelPrincipal.add(btnGravar);
        
       
         // ---------------- BOTAO CANCELAR-----//
       btnConsultar = new JButton("Consultar");
       btnConsultar.setBounds(310, 535, 100, 35); 
       btnConsultar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/consulta.png"));
        btnConsultar.setFont(new Font("Arial", 1, 13));
       btnConsultar.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelPrincipal.add(btnConsultar);
       
       
          // ---------------- BOTAO CANCELAR-----//
       btnCancelar = new JButton("Cancelar");
       btnCancelar.setBounds(420, 535, 100, 35); 
       btnCancelar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));    
       btnCancelar.setFont(new Font("Arial", 1, 13));
       btnCancelar.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelPrincipal.add(btnCancelar);
       
       
      
        
         // ---------------- BOTAO SAIR-----//
       btnSair = new JButton("Sair");
       btnSair.setBounds(530, 535, 100, 35);    
       btnSair.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/sair.png"));
       btnSair.setFont(new Font("Arial", 1, 13));
       btnSair.setHorizontalTextPosition(SwingConstants.RIGHT); 
       btnSair.addActionListener((java.awt.event.ActionEvent evt) -> { 
           
                        janela.dispose();
        });       
       painelPrincipal.add(btnSair);
        
        criarTabela();
        criarTabelaSetor();
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

        modelo.addColumn("Tipo da Batata");
        modelo.addColumn("Qtd Total");
         modelo.addColumn("Total");
        
     

        tblProduto = new JTable();
        tblProduto.setModel(modelo);
        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(200);
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(80);
        tblProduto.getColumnModel().getColumn(2).setPreferredWidth(80);
        

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
        scrollTable.setBounds(10, 10, 370, 170);
        tblProduto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelTabela.add(scrollTable);
    }
     
     private void criarTabelaSetor() {
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        modelo.addColumn("Setor");
        modelo.addColumn("Qtd");
         modelo.addColumn("Preço UN");
         modelo.addColumn("Vlr Total");
        
     

        tblSetor = new JTable();
        tblSetor.setModel(modelo);
        tblSetor.getColumnModel().getColumn(0).setPreferredWidth(180);
        tblSetor.getColumnModel().getColumn(1).setPreferredWidth(80);
        tblSetor.getColumnModel().getColumn(2).setPreferredWidth(80);
        

        tblSetor.getTableHeader().setResizingAllowed(false);
        tblSetor.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblProduto.getTableHeader();
        cabecalho.setFont(new Font("Arial", 1, 11));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblSetor.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblSetor.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        

        tblSetor.setFont(new Font("Arial", 0, 11));

        scrollTable = new JScrollPane(tblSetor,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(400, 10, 420, 170);
        tblSetor.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelTabela.add(scrollTable);
    }
     
        private void criarDadosSetor() {
            
            
        janelaSetor = new JFrame("");
        janelaSetor.setSize(455, 380);
        janelaSetor.setLayout(null);
        janelaSetor.setResizable(false);
        janelaSetor.setLocationRelativeTo(null);
        
              


        painelSetor = new JPanel();
        painelSetor.setLayout(null);
        painelSetor.setSize(435, 290);
        painelSetor.setLocation(5, 5);
        painelSetor.setBorder(BorderFactory.createTitledBorder(""));
            
            
        
           //------------------------------------------------------------------------//
      
        lblSetor = new JLabel("Setor:");
        lblSetor.setBounds(10, 210, 80, 22);
        painelSetor.add(lblSetor);
        
       
        cbSetor = new JComboBox();
        cbSetor.setBounds(10, 230, 150, 22);
        painelSetor.add(cbSetor);
        
         //-------------------------------------------------------------------------------------------//  
        
         
         //------------------------------------------------------------------------//
      
        lblQtd = new JLabel("QTD:");
        lblQtd.setBounds(170, 210, 80, 22);
        painelSetor.add(lblQtd);
        
       
        txtQtd = new JTextField();
        txtQtd.setBounds(170, 230, 80, 22);
        painelSetor.add(txtQtd);
        
         //-------------------------------------------------------------------------------------------//  
         
         
            //------------------------------------------------------------------------//
      
        lblPrecoUnit = new JLabel("Preço Unit:");
        lblPrecoUnit.setBounds(260, 210, 80, 22);
        painelSetor.add(lblPrecoUnit);
        
       
        txtPrecoUnit = new JTextField();
        txtPrecoUnit.setBounds(260, 230, 80, 22);
        painelSetor.add(txtPrecoUnit);
        
         //-------------------------------------------------------------------------------------------// 
         
         
              //------------------------------------------------------------------------//
      
        lblValorTotal = new JLabel("Valor Total:");
        lblValorTotal.setBounds(350, 210, 80, 22);
        painelSetor.add(lblValorTotal);
        
       
        txtValorTotal = new JTextField();
        txtValorTotal.setBounds(350, 230, 80, 22);
        painelSetor.add(txtValorTotal);
        
         //-------------------------------------------------------------------------------------------//  
        
        
         
         
              // ---------------- BOTAO GRAVAR-----//
       btnAdicionarSet = new JButton("Adicionar");
       btnAdicionarSet.setBounds(10, 260, 85, 27);  
       btnAdicionarSet.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/incluir.png"));       
       btnAdicionarSet.setHorizontalTextPosition(SwingConstants.RIGHT);
       btnAdicionarSet.setFont(new Font("Arial", 1, 12));
        
       painelSetor.add(btnAdicionarSet);
       
   //-------------------------------------------------------------------------------------------------------------------//
   
   
        // ---------------- BOTAO GRAVAR-----//
       btnAlterarSet = new JButton("Alterar");
       btnAlterarSet.setBounds(100, 260, 85, 27);  
       btnAlterarSet.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/alterar2.png"));       
       btnAlterarSet.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnAlterarSet.setFont(new Font("Arial", 1, 13));
        
       painelSetor.add(btnAlterarSet);
    //-------------------------------------------------------------------------------------------------------------------//
    
    
        btnExcluirSet = new JButton("Excluir");
       btnExcluirSet.setBounds(190, 260, 85, 27);  
       btnExcluirSet.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/excluir2.png"));       
       btnExcluirSet.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnExcluirSet.setFont(new Font("Arial", 1, 13));
        
       painelSetor.add(btnExcluirSet);
         
         
       
       
       
       
        //-------------------------------------------------------------------------------------------------------------------//
    
    
        btnGravarSet = new JButton("Gravar");
       btnGravarSet.setBounds(120, 305, 90, 30);  
       btnGravarSet.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));       
       btnGravarSet.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnGravarSet.setFont(new Font("Arial", 1, 13));
        
       janelaSetor.add(btnGravarSet);
        
         
         //---------------------------------------------------------------------------------------------------------------//
         
         
       btnCancelarSet = new JButton("Cancelar");
       btnCancelarSet.setBounds(220, 305, 90, 30);  
       btnCancelarSet.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));       
       btnCancelarSet.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnCancelarSet.setFont(new Font("Arial", 1, 13));
        
       janelaSetor.add(btnCancelarSet);
   
        
        
            
            criarTabelaSet();
           janelaSetor.add(painelSetor);
           janelaSetor.setVisible(true);
     
      }
        
        
         private void criarTabelaSet() {
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        modelo.addColumn("Setor");
        modelo.addColumn("QTD");
        modelo.addColumn("Preço Unit");
        modelo.addColumn("Vl Total");
     

        tblSet = new JTable();
        tblSet.setModel(modelo);
        tblSet.getColumnModel().getColumn(0).setPreferredWidth(175);
        tblSet.getColumnModel().getColumn(1).setPreferredWidth(85);
        tblSet.getColumnModel().getColumn(2).setPreferredWidth(85);
        tblSet.getColumnModel().getColumn(3).setPreferredWidth(80);
        

        tblSet.getTableHeader().setResizingAllowed(false);
        tblSet.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblSet.getTableHeader();
        cabecalho.setFont(new Font("Arial", 1, 11));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblSet.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblSet.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        

        tblSet.setFont(new Font("Arial", 0, 11));

        scrollTable = new JScrollPane(tblSet,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(5, 5, 425, 200);
        tblSet.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelSetor.add(scrollTable);
    }
        
        
      
     
}


