
package view;

import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.text.MaskFormatter;


public class Caixa {
    
    private JFrame janela, janelaFechamento, janelaInicial, janelaNovo, janelaVisualizar;
    private JPanel painelPrincipal, painelPesquisa, painelSaldo, painelTipo, painelFechamento, painelInicial, painelTipoInicio, painelVisualizar;
    private JLabel lblSaldoAnt,e, lblPeriodo,lblContas,lblCentro, lblDespesa, lblTipoEntrada,lblCI, lblFornecedor, lblEntrada, lblSaida, lblSaldo;
    private JTextField txtSaldoAnt, txtTipo, txtCodTipo, txtEntrada, txtSaida, txtSaldo, txtCI;
    private JTable tblCaixa;
    private JScrollPane scrollTable;
    private DefaultTableModel modelo;
    private JButton btnFecharSaldo, btnSaldoInicial, btnNovo,btnAlterar, btnPesquisar, btnVisualizar, btnExcluir, btnTipo, btnCI;
    private JComboBox cbDataInicio, cbDataFinal , cbContas, cbCentro, cbDespesa, cbEntrada, cbFornecedor;
    private JCheckBox ckContas, ckCentro, ckDespesas, ckEntradas, ckFixar;
    private JRadioButton rdAmbas, rdEntrada, rdSaida, rdEntradaIncial, rdSaidaInicial;
    private ButtonGroup groupTipo, groupInicial, groupLocalizar, groupEntrada, groupVisualizar;    
    private JLabel lblFechamento, lblDataFechamento,lblDia, lblDataInicial, lblValorInicial;
    private JTextField  txtDia, txtValorInicial;
    private JButton btnGravarFechamento, btnCancelarFechamento,btnGravarInicial, btnCancelarInicial;
    private JFormattedTextField txtDataFechamento, txtDataInicial, txtDataNovo;
    
    private JLabel lblDataNovo, lblHistorico, lblNumeroDoc,lblEntradaNovo, lblSaidaNovo, lblDespesaNovo, lblTipoEntradaNovo;
    private JLabel lblCentroNovo, lblCINovo, lblOrigemNovo, lblFornecedorNovo, lblObservacao;
    private JTextField txtHistoricoNovo, txtNumeroDoc, txtEntradaNovo, txtSaidaNovo, txtCINovo, txtFornNovo, txtCodFornNovo;
    private JTextArea txtObservacao;
    private JComboBox cbDespesaNovo, cbEntradaNovo, cbCentroNovo,cbOrigemNovo, cbFornecedorNovo;
    private JPanel painelNovo, painelTipoNovo, painelLocalizar;
    private JRadioButton rdContaPagar, rdCompraBatata, rdCompraCebola, rdCompraDiversas, rdFrete, rdCamaraFria, rdVendaBatata, rdVendaCebola, rdVendaDiversas, rdLavacao, rdMaquinacao, rdTotal, rdParcial;
    private JButton btnPesquisarForn, btnPesquisarLoc, btnGravarNovo, btnSairNovo, btnOKVisualizar;
    private JRadioButton rdDetalhado, rdConsolidado;

    public Caixa() {
    }
   
    
    
    
      public void desenharTela() {  
        janela = new JFrame("Caixa");
        janela.setSize(1130, 730);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);

//---------------------------------------------------------------------------//


        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(1115, 690);
        painelPrincipal.setLocation(7, 5);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        
//-----------------------------------------------------------------------//

lblSaldoAnt= new JLabel("Saldo Anterior:");
lblSaldoAnt.setBounds(400, 10, 100, 22);
painelPrincipal.add(lblSaldoAnt);

txtSaldoAnt = new JTextField();
txtSaldoAnt.setBounds(490, 10, 100, 22);
painelPrincipal.add(txtSaldoAnt);


//-------------------------------------------------------------------------//

btnFecharSaldo= new JButton("Fechamento Saldo");
btnFecharSaldo.setBounds(10, 440, 125, 27);
btnFecharSaldo.addActionListener((java.awt.event.ActionEvent evt) -> { 
           
            try {
                FechamentoSaldo();
            } catch (ParseException ex) {
                Logger.getLogger(Caixa.class.getName()).log(Level.SEVERE, null, ex);
            }
        });       
painelPrincipal.add(btnFecharSaldo);


//---------------------------------------------------------------------------//


        painelPesquisa = new JPanel();
        painelPesquisa.setLayout(null);
        painelPesquisa.setSize(930, 215);
        painelPesquisa.setLocation(10, 470);
        painelPesquisa.setBorder(BorderFactory.createTitledBorder("Pesquisa por"));
        painelPrincipal.add(painelPesquisa);
        
//-----------------------------------------------------------------------//



//-----------------------------------------------------------------------//

lblPeriodo= new JLabel("Periodo");
lblPeriodo.setBounds(10, 20, 100, 22);
painelPesquisa.add(lblPeriodo);

cbDataInicio = new JComboBox();
cbDataInicio.setBounds(10, 40, 100, 22);
painelPesquisa.add(cbDataInicio);



//-----------------------------------------------------------------------//

e= new JLabel("e");
e.setBounds(120, 40, 100, 22);
painelPesquisa.add(e);

cbDataFinal = new JComboBox();
cbDataFinal.setBounds(140, 40, 100, 22);
painelPesquisa.add(cbDataFinal);


//-------------------------------------------------------------------------//


//-----------------------------------------------------------------------//

lblContas= new JLabel("Contas");
lblContas.setBounds(10, 70, 100, 22);
painelPesquisa.add(lblContas);

cbContas = new JComboBox();
cbContas.setBounds(10, 90, 230, 22);
painelPesquisa.add(cbContas);


ckContas = new JCheckBox("Todas as Contas");
ckContas.setBounds(60, 70, 150, 20);
painelPesquisa.add(ckContas);


//-------------------------------------------------------------------------//


//-----------------------------------------------------------------------//

lblCentro= new JLabel("Centros");
lblCentro.setBounds(260, 20, 100, 22);
painelPesquisa.add(lblCentro);

cbCentro = new JComboBox();
cbCentro.setBounds(260, 40, 230, 22);
painelPesquisa.add(cbCentro);


ckCentro = new JCheckBox("Todas os Centros");
ckCentro.setBounds(340, 20, 150, 20);
painelPesquisa.add(ckCentro);


//-------------------------------------------------------------------------//

//-----------------------------------------------------------------------//

lblDespesa= new JLabel("Despesa");
lblDespesa.setBounds(260, 65, 100, 22);
painelPesquisa.add(lblDespesa);

cbDespesa = new JComboBox();
cbDespesa.setBounds(260, 85, 230, 22);
painelPesquisa.add(cbDespesa);


ckDespesas = new JCheckBox("Todas as Despesas");
ckDespesas.setBounds(340, 65, 180, 20);
painelPesquisa.add(ckDespesas);


//-------------------------------------------------------------------------//


//-----------------------------------------------------------------------//

lblEntrada= new JLabel("Tipo de Entrada");
lblEntrada.setBounds(260, 110, 160, 22);
painelPesquisa.add(lblEntrada);

cbEntrada = new JComboBox();
cbEntrada.setBounds(260, 130, 230, 22);
painelPesquisa.add(cbEntrada);


ckEntradas = new JCheckBox("Todas as Entradas");
ckEntradas.setBounds(360, 110, 160, 20);
painelPesquisa.add(ckDespesas);


//-------------------------------------------------------------------------//

lblFornecedor= new JLabel("Fornecedor/Cliente");
lblFornecedor.setBounds(520, 20, 160, 22);
painelPesquisa.add(lblFornecedor);

cbFornecedor = new JComboBox();
cbFornecedor.setBounds(520, 40, 230, 22);
painelPesquisa.add(cbFornecedor);

txtTipo = new JTextField();
txtTipo.setBounds(520, 70, 230, 22);
painelPesquisa.add(txtTipo);

txtCodTipo = new JTextField();
txtCodTipo.setBounds(760, 70, 50, 22);
painelPesquisa.add(txtCodTipo);


btnTipo = new JButton();
btnTipo.setBounds(760, 40, 22, 25);
btnTipo.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
btnTipo.setToolTipText("Pesquisar");
btnTipo.setHorizontalTextPosition(SwingConstants.CENTER);
painelPesquisa.add(btnTipo);


lblCI= new JLabel("Pesq. Nº CI");
lblCI.setBounds(550, 110, 160, 22);
painelPesquisa.add(lblCI);

txtCI = new JTextField();
txtCI.setBounds(550, 130, 100, 22);
painelPesquisa.add(txtCI);


btnCI = new JButton();
btnCI.setBounds(660, 130, 22, 22);
btnCI.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
btnCI.setToolTipText("Pesquisar ");
btnCI.setHorizontalTextPosition(SwingConstants.CENTER);
painelPesquisa.add(btnCI);


//-------------------------------------------------------------------------//

btnSaldoInicial= new JButton("Saldo Inicial");
btnSaldoInicial.setBounds(680, 440, 80, 27);
btnSaldoInicial.setFont(new Font("Arial", 1,12));
btnSaldoInicial.addActionListener((java.awt.event.ActionEvent evt) -> { 
           
            try {
                SaldoInicial();
            } catch (ParseException ex) {
                Logger.getLogger(Caixa.class.getName()).log(Level.SEVERE, null, ex);
            }
        });       
painelPrincipal.add(btnSaldoInicial);


//---------------------------------------------------------------------------//


//-------------------------------------------------------------------------//

btnNovo= new JButton("Novo");
btnNovo.setBounds(770, 440, 80, 27);
btnNovo.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/incluir.png"));
btnNovo.setHorizontalTextPosition(SwingConstants.RIGHT);
btnNovo.setFont(new Font("Arial", 1,12));

 btnNovo.addActionListener((java.awt.event.ActionEvent evt) -> { 
            try {
                CadastroNovo();
            } catch (ParseException ex) {
                Logger.getLogger(Caixa.class.getName()).log(Level.SEVERE, null, ex);
            }
                        
        });       
painelPrincipal.add(btnNovo);


//---------------------------------------------------------------------------//


//-------------------------------------------------------------------------//

btnAlterar= new JButton("Alterar");
btnAlterar.setBounds(855, 440, 80, 27);
btnAlterar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/alterar2.png"));
btnAlterar.setHorizontalTextPosition(SwingConstants.RIGHT);
btnAlterar.setFont(new Font("Arial", 1,12));
painelPrincipal.add(btnAlterar);


//---------------------------------------------------------------------------//



//-------------------------------------------------------------------------//

btnPesquisar= new JButton("Pesquisar");
btnPesquisar.setBounds(20, 170, 100, 35);
btnPesquisar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/procurar.png"));
btnPesquisar.setHorizontalTextPosition(SwingConstants.RIGHT);
btnPesquisar.setFont(new Font("Arial", 1,12));
painelPesquisa.add(btnPesquisar);


//---------------------------------------------------------------------------//


//-------------------------------------------------------------------------//

btnVisualizar= new JButton("Visualizar");
btnVisualizar.setBounds(140, 170, 100, 35);
btnVisualizar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/visualizar.png"));
btnVisualizar.setHorizontalTextPosition(SwingConstants.RIGHT);
btnVisualizar.setFont(new Font("Arial", 1,12));
btnVisualizar.addActionListener((java.awt.event.ActionEvent evt) -> {
   CriarVisualizar();
    
});
 
painelPesquisa.add(btnVisualizar);


//---------------------------------------------------------------------------//



//-------------------------------------------------------------------------//

btnExcluir= new JButton("Excluir");
btnExcluir.setBounds(260, 170, 100, 35);
btnExcluir.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/excluir2.png"));
btnExcluir.setHorizontalTextPosition(SwingConstants.RIGHT);
btnExcluir.setFont(new Font("Arial", 1,12));
painelPesquisa.add(btnExcluir);


//---------------------------------------------------------------------------//


//-----------------------------------------------------------------------------------------------//

  //-------------- CRIANDO PAINEL --------------------//
        painelTipo = new JPanel();
        painelTipo.setLayout(null);
        painelTipo.setBounds(830, 25, 90, 85);
        painelTipo.setBorder(BorderFactory.createTitledBorder(""));
        painelPesquisa.add(painelTipo);

        rdAmbas = new JRadioButton("Ambas");
        rdAmbas.setBounds(5, 5, 80, 17);
        rdAmbas.setFont(new Font("Arial", 0, 13));
        painelTipo.add(rdAmbas);

        rdEntrada = new JRadioButton("Entrada");
        rdEntrada.setBounds(5, 30, 80, 17);
        rdEntrada.setFont(new Font("Arial", 0, 13));
        painelTipo.add(rdEntrada);
        
        rdSaida = new JRadioButton("Saida");
        rdSaida.setBounds(5, 55, 80, 17);
        rdSaida.setFont(new Font("Arial", 0, 13));
        painelTipo.add(rdSaida);
        
        

        groupTipo = new ButtonGroup();
        groupTipo.add(rdAmbas);
        groupTipo.add(rdEntrada);
        groupTipo.add(rdSaida);

        painelPesquisa.add(painelTipo);


//--------------------------------------------------------------//

 //-------------- CRIANDO PAINEL --------------------//
        painelSaldo = new JPanel();
        painelSaldo.setLayout(null);
        painelSaldo.setBounds(950, 430, 150, 200);
        painelSaldo.setBorder(BorderFactory.createTitledBorder(""));
        painelPrincipal.add(painelSaldo);

//--------------------------------------------------------------------------------------//
lblEntrada = new JLabel("Entrada");
lblEntrada.setBounds(10, 10, 100, 22);
lblEntrada.setFont( new Font("Aria", 1,13));
lblEntrada.setForeground(Color.blue);
painelSaldo.add(lblEntrada);

txtEntrada = new JTextField();
txtEntrada.setBounds(10, 30, 100, 22);
painelSaldo.add(txtEntrada);



//--------------------------------------------------------------------------------------//
lblSaida = new JLabel("Saida");
lblSaida.setBounds(10, 70, 100, 22);
lblSaida.setFont( new Font("Aria", 1,13));
lblSaida.setForeground(Color.red);
painelSaldo.add(lblSaida);

txtSaida = new JTextField();
txtSaida.setBounds(10, 90, 100, 22);
painelSaldo.add(txtSaida);




//--------------------------------------------------------------------------------------//
lblSaldo = new JLabel("Saldo");
lblSaldo.setBounds(10, 130, 100, 22);
lblSaldo.setFont( new Font("Aria", 1,13));
lblSaldo.setForeground(Color.BLACK);
painelSaldo.add(lblSaldo);

txtSaldo = new JTextField();
txtSaldo.setBounds(10, 150, 100, 22);
painelSaldo.add(txtSaldo);





//---------------------------------------------------------------///
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

        modelo.addColumn("Data");
        modelo.addColumn("Histórico");
        modelo.addColumn("C.I");
        modelo.addColumn("N° Doc");
        modelo.addColumn("Entrada");
        modelo.addColumn("Saida");
        modelo.addColumn("Centro");
        modelo.addColumn("Despesa");
        modelo.addColumn("Tipo de Entrada");
        modelo.addColumn("Observação");
        modelo.addColumn("Conta");
        modelo.addColumn("Usuário Criador");
        modelo.addColumn("Data Criação");
        modelo.addColumn("Usuário Alterou");
        modelo.addColumn("Usuário Alt.Data");
        modelo.addColumn("Usuário Alt.Obs");
        modelo.addColumn("Placa");
        modelo.addColumn("Tipo");
       

        tblCaixa = new JTable();
        tblCaixa.setModel(modelo);
        tblCaixa.getColumnModel().getColumn(0).setPreferredWidth(80);
        tblCaixa.getColumnModel().getColumn(1).setPreferredWidth(300);
        tblCaixa.getColumnModel().getColumn(2).setPreferredWidth(60);
        tblCaixa.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblCaixa.getColumnModel().getColumn(4).setPreferredWidth(100);        
        tblCaixa.getColumnModel().getColumn(5).setPreferredWidth(100);
        tblCaixa.getColumnModel().getColumn(6).setPreferredWidth(200);
        tblCaixa.getColumnModel().getColumn(7).setPreferredWidth(200);
        tblCaixa.getColumnModel().getColumn(8).setPreferredWidth(200);
         tblCaixa.getColumnModel().getColumn(9).setPreferredWidth(200);
        tblCaixa.getColumnModel().getColumn(10).setPreferredWidth(200);
        tblCaixa.getColumnModel().getColumn(11).setPreferredWidth(100);
        tblCaixa.getColumnModel().getColumn(12).setPreferredWidth(100);
        tblCaixa.getColumnModel().getColumn(13).setPreferredWidth(100);        
        tblCaixa.getColumnModel().getColumn(14).setPreferredWidth(100);
        tblCaixa.getColumnModel().getColumn(15).setPreferredWidth(100);
        tblCaixa.getColumnModel().getColumn(16).setPreferredWidth(100);
        tblCaixa.getColumnModel().getColumn(17).setPreferredWidth(100);
        

        tblCaixa.getTableHeader().setResizingAllowed(false);
        tblCaixa.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblCaixa.getTableHeader();
        cabecalho.setFont(new Font("Arial", 0, 12));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblCaixa.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblCaixa.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        tblCaixa.getColumnModel().getColumn(2).setCellRenderer(centralizaColunas);
        tblCaixa.getColumnModel().getColumn(3).setCellRenderer(centralizaColunas);
        tblCaixa.getColumnModel().getColumn(4).setCellRenderer(centralizaColunas);

        tblCaixa.setFont(new Font("Arial", 0, 12));
        
         

        scrollTable = new JScrollPane(tblCaixa,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(10, 40, 1100, 385);
        tblCaixa.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelPrincipal.add(scrollTable);
    }
      
      
       public void FechamentoSaldo() throws ParseException {  
        
        janelaFechamento = new JFrame("");
        janelaFechamento.setSize(225, 255);
        janelaFechamento.setLayout(null);
        janelaFechamento.setResizable(false);
        janelaFechamento.setLocationRelativeTo(null);

//---------------------------------------------------------------------------//


        painelFechamento = new JPanel();
        painelFechamento.setLayout(null);
        painelFechamento.setSize(200, 210);
        painelFechamento.setLocation(7, 5);
        painelFechamento.setBorder(BorderFactory.createTitledBorder(""));
        
        
          //--------------------------------------------------------------------------------------//
       lblFechamento = new JLabel("Fechamento Saldo");
       lblFechamento.setBounds(30, 20, 130, 22);
       lblFechamento.setFont( new Font("Aria", 1,13)); 
       painelFechamento.add(lblFechamento);
        
        
        //--------------------------------------------------------------------------------------//
       lblDataFechamento = new JLabel("Data");
       lblDataFechamento.setBounds(50, 60, 100, 22);
       lblDataFechamento.setFont( new Font("Aria", 1,13)); 
       painelFechamento.add(lblDataFechamento);
       
       
       txtDataFechamento = new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
       txtDataFechamento.setBounds(50, 80, 80, 22);
       painelFechamento.add(txtDataFechamento);
       
       
        //--------------------------------------------------------------------------------------//
       lblDia = new JLabel("Dia");
       lblDia.setBounds(50, 110, 100, 22);
       lblDia.setFont( new Font("Aria", 1,13)); 
       painelFechamento.add(lblDia);
       
       
       txtDia = new JTextField();
       txtDia.setBounds(50, 130, 80, 22);
       painelFechamento.add(txtDia);

//---------------------------------------------------------------------------------------------------
              //-------------------------------------------------------------------------//

              btnGravarFechamento= new JButton("Gravar");
              btnGravarFechamento.setBounds(10, 170, 85, 30);
              btnGravarFechamento.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));
              btnGravarFechamento.setHorizontalTextPosition(SwingConstants.RIGHT);
              btnGravarFechamento.setFont(new Font("Arial", 1,12));    
              btnGravarFechamento.addActionListener((java.awt.event.ActionEvent evt) -> { 
           
                    
        }); 
              painelFechamento.add(btnGravarFechamento);


//---------------------------------------------------------------------------//


//-------------------------------------------------------------------------//

             btnCancelarFechamento= new JButton("Cancelar");
             btnCancelarFechamento.setBounds(105, 170, 85, 30);
             btnCancelarFechamento.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));
             btnCancelarFechamento.setHorizontalTextPosition(SwingConstants.RIGHT);
             btnCancelarFechamento.setFont(new Font("Arial", 1,12));
             painelFechamento.add(btnCancelarFechamento);

        
        
        
        
        janelaFechamento.add(painelFechamento);
        janelaFechamento.setVisible(true);
        
      
       }
       
       
        public void SaldoInicial() throws ParseException {  
        
        janelaInicial = new JFrame("");
        janelaInicial.setSize(285, 215);
        janelaInicial.setLayout(null);
        janelaInicial.setResizable(false);
        janelaInicial.setLocationRelativeTo(null);

//---------------------------------------------------------------------------//


        painelInicial = new JPanel();
        painelInicial.setLayout(null);
        painelInicial.setSize(260, 170);
        painelInicial.setLocation(7, 5);
        painelInicial.setBorder(BorderFactory.createTitledBorder(""));
        
        
        
        
        
        //--------------------------------------------------------------------------------------//
       lblDataInicial = new JLabel("Data");
       lblDataInicial.setBounds(20, 20, 100, 22);
       lblDataInicial.setFont( new Font("Aria", 1,13)); 
       painelInicial.add(lblDataInicial);
       
       
       txtDataInicial = new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
       txtDataInicial.setBounds(20, 40, 80, 22);
       painelInicial.add(txtDataInicial);
       
       
        //--------------------------------------------------------------------------------------//
       lblValorInicial = new JLabel("Valor");
       lblValorInicial.setBounds(20, 60, 100, 22);
       lblValorInicial.setFont( new Font("Aria", 1,13)); 
       painelInicial.add(lblValorInicial);
       
       
       txtValorInicial = new JTextField();
       txtValorInicial.setBounds(20, 80, 110, 22);
       painelInicial.add(txtValorInicial);
       
       
       
       //------------------------------------------------------------------------------------------///
       
       
       //-------------- CRIANDO PAINEL --------------------//
        painelTipoInicio = new JPanel();
        painelTipoInicio.setLayout(null);
        painelTipoInicio.setBounds(150, 20, 90, 85);
        painelTipoInicio.setBorder(BorderFactory.createTitledBorder("Tipo"));
        painelInicial.add(painelTipoInicio);

        rdEntradaIncial = new JRadioButton("Entrada");
        rdEntradaIncial.setBounds(5, 15, 80, 17);
        rdEntradaIncial.setFont(new Font("Arial", 0, 13));
        painelTipoInicio.add(rdEntradaIncial);

        
        rdSaidaInicial = new JRadioButton("Saida");
        rdSaidaInicial.setBounds(5, 55, 80, 17);
        rdSaidaInicial.setFont(new Font("Arial", 0, 13));
        painelTipoInicio.add(rdSaidaInicial);
        
        

        groupInicial = new ButtonGroup();
        groupInicial.add(rdEntradaIncial);
        groupInicial.add(rdSaidaInicial);
       

        painelInicial.add(painelTipoInicio);

//---------------------------------------------------------------------------------------------------
              //-------------------------------------------------------------------------//

              btnGravarFechamento= new JButton("Gravar");
              btnGravarFechamento.setBounds(30, 130, 85, 30);
              btnGravarFechamento.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));
              btnGravarFechamento.setHorizontalTextPosition(SwingConstants.RIGHT);
              btnGravarFechamento.setFont(new Font("Arial", 1,12));    
              btnGravarFechamento.addActionListener((java.awt.event.ActionEvent evt) -> { 
           
                    
        }); 
              painelInicial.add(btnGravarFechamento);


//---------------------------------------------------------------------------//


//-------------------------------------------------------------------------//

             btnCancelarFechamento= new JButton("Cancelar");
             btnCancelarFechamento.setBounds(135, 130, 85, 30);
             btnCancelarFechamento.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));
             btnCancelarFechamento.setHorizontalTextPosition(SwingConstants.RIGHT);
             btnCancelarFechamento.setFont(new Font("Arial", 1,12));
             painelInicial.add(btnCancelarFechamento);

        
 //-----------------------------------------------------------------------------------------------------//       
        
        
        
        janelaInicial.add(painelInicial);
        janelaInicial.setVisible(true);
        
      
       }
        
        
        
        
          public void CadastroNovo() throws ParseException {  
        
        janelaNovo = new JFrame("");
        janelaNovo.setSize(735, 535);
        janelaNovo.setLayout(null);
        janelaNovo.setResizable(false);
        janelaNovo.setLocationRelativeTo(null);


//---------------------------------------------------------------------------//


        painelNovo = new JPanel();
        painelNovo.setLayout(null);
        painelNovo.setSize(710, 490);
        painelNovo.setLocation(7, 5);
        painelNovo.setBorder(BorderFactory.createTitledBorder(""));
        
        
        
        
        
        //--------------------------------------------------------------------------------------//
       lblDataNovo = new JLabel("Data");
       lblDataNovo.setBounds(10, 10, 100, 22);
       lblDataNovo.setFont( new Font("Aria", 1,13)); 
       painelNovo.add(lblDataNovo);
       
       
       txtDataNovo = new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
       txtDataNovo.setBounds(10, 30, 80, 22);
       painelNovo.add(txtDataNovo);
       
        ckFixar = new JCheckBox("Fixar");
       ckFixar.setBounds(80, 5, 100, 22);
       ckFixar.setFont( new Font("Aria", 1,11)); 
       painelNovo.add(ckFixar);
       
          
        //--------------------------------------------------------------------------------------//
       lblHistorico = new JLabel("Historico");
       lblHistorico.setBounds(105, 10, 100, 22);
       lblHistorico.setFont( new Font("Aria", 1,13)); 
       painelNovo.add(lblHistorico);
       
       
       txtHistoricoNovo = new JTextField();
       txtHistoricoNovo.setBounds(105, 30, 290, 22);
       painelNovo.add(txtHistoricoNovo);
       
       
         //--------------------------------------------------------------------------------------//
       lblNumeroDoc = new JLabel("N° Documento");
       lblNumeroDoc.setBounds(10, 60, 100, 22);
       lblNumeroDoc.setFont( new Font("Aria", 1,13)); 
       painelNovo.add(lblNumeroDoc);
       
       
       txtNumeroDoc = new JTextField();
       txtNumeroDoc.setBounds(10, 80, 120, 22);
       painelNovo.add(txtNumeroDoc);
       
       
       
          //--------------------------------------------------------------------------------------//
       lblEntradaNovo= new JLabel("Entrada");
       lblEntradaNovo.setBounds(140, 60, 100, 22);
       lblEntradaNovo.setFont( new Font("Aria", 1,13)); 
       painelNovo.add(lblEntradaNovo);
       
       
       txtEntradaNovo = new JTextField();
       txtEntradaNovo.setBounds(140, 80, 120, 22);
       painelNovo.add(txtEntradaNovo);
       
       
       
       //--------------------------------------------------------------------------------------//
       lblSaidaNovo= new JLabel("Saida");
       lblSaidaNovo.setBounds(270, 60, 100, 22);
       lblSaidaNovo.setFont( new Font("Aria", 1,13)); 
       painelNovo.add(lblSaidaNovo);
       
       
       txtSaidaNovo = new JTextField();
       txtSaidaNovo.setBounds(270, 80, 120, 22);
       painelNovo.add(txtSaidaNovo);
       
       
       
       
        //--------------------------------------------------------------------------------------//
       lblDespesaNovo= new JLabel("Despesa");
       lblDespesaNovo.setBounds(10, 110, 100, 22);
       lblDespesaNovo.setFont( new Font("Aria", 1,13)); 
       painelNovo.add(lblDespesaNovo);
       
       
       cbDespesaNovo = new JComboBox();
       cbDespesaNovo.setBounds(10, 130, 185, 22);
       painelNovo.add(cbDespesaNovo);
       
       
          //--------------------------------------------------------------------------------------//
       lblEntradaNovo= new JLabel("Tipo de Entrada");
       lblEntradaNovo.setBounds(205, 110, 140, 22);
       lblEntradaNovo.setFont( new Font("Aria", 1,13)); 
       painelNovo.add(lblEntradaNovo);
       
       
       cbEntradaNovo = new JComboBox();
       cbEntradaNovo.setBounds(205, 130, 185, 22);
       painelNovo.add(cbEntradaNovo);
       
       
       
          //--------------------------------------------------------------------------------------//
       lblCentroNovo= new JLabel("Centro");
       lblCentroNovo.setBounds(10, 160, 140, 22);
       lblCentroNovo.setFont( new Font("Aria", 1,13)); 
       painelNovo.add(lblCentroNovo);
       
       
       cbCentroNovo = new JComboBox();
       cbCentroNovo.setBounds(10, 180, 185, 22);
       painelNovo.add(cbCentroNovo);
       
   //-------------------------------------------------------------------//    
       
       lblCINovo= new JLabel("C.I");
       lblCINovo.setBounds(210, 160, 140, 22);
       lblCINovo.setFont( new Font("Aria", 1,13)); 
       painelNovo.add(lblCINovo);
       
       txtCINovo = new JTextField();
       txtCINovo.setBounds(210, 180, 80, 22);
       painelNovo.add(txtCINovo);
       
       
       
       
       
       
          //--------------------------------------------------------------------------------------//
       lblOrigemNovo= new JLabel("Origem");
       lblOrigemNovo.setBounds(10, 210, 140, 22);
       lblOrigemNovo.setFont( new Font("Aria", 1,13)); 
       painelNovo.add(lblOrigemNovo);
       
       
       cbOrigemNovo = new JComboBox();
       cbOrigemNovo.setBounds(10, 230, 185, 22);
       painelNovo.add(cbOrigemNovo);
       
       
       
         //--------------------------------------------------------------------------------------//
       lblFornecedorNovo= new JLabel("Fornecedores/Clientes");
       lblFornecedorNovo.setBounds(10, 260, 160, 22);
       lblFornecedorNovo.setFont( new Font("Aria", 1,13)); 
       painelNovo.add(lblFornecedorNovo);
       
       
       cbFornecedorNovo = new JComboBox();
       cbFornecedorNovo.setBounds(10, 280, 185, 22);
       painelNovo.add(cbFornecedorNovo);
       
       txtFornNovo = new JTextField();
       txtFornNovo.setBounds(10, 310, 185, 22);
       painelNovo.add(txtFornNovo);
       
       txtCodFornNovo = new JTextField();
       txtCodFornNovo.setBounds(210, 310, 40, 22);
       painelNovo.add(txtCodFornNovo);
       
       btnPesquisarForn = new JButton();
       btnPesquisarForn.setBounds(255, 310, 22, 22);
       btnPesquisarForn.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
       btnPesquisarForn.setToolTipText("Pesquisar");
       btnPesquisarForn.setHorizontalTextPosition(SwingConstants.CENTER);
        btnPesquisarForn.addActionListener((java.awt.event.ActionEvent evt) -> {  
           
           ConsultaFornecedor_Simplificada consult = new ConsultaFornecedor_Simplificada();
           consult.desenharTela();
        });
       painelNovo.add(btnPesquisarForn);
       
       
       
       
        lblObservacao= new JLabel("Observação");
       lblObservacao.setBounds(10, 340, 160, 22);
       lblObservacao.setFont( new Font("Aria", 1,13)); 
       painelNovo.add(lblObservacao);
       
       
       txtObservacao = new JTextArea();
       txtObservacao.setBounds(10, 360, 380, 80);
       txtObservacao.setBorder(BorderFactory.createTitledBorder(""));
          
       painelNovo.add(txtObservacao);
       
   //--------------------------------------------------------------------------------//    
       
        painelLocalizar = new JPanel();
        painelLocalizar.setLayout(null);
        painelLocalizar.setSize(300, 200);
        painelLocalizar.setLocation(405, 20);
        painelLocalizar.setBorder(BorderFactory.createTitledBorder("Localizar"));
         
         
         
         
          rdContaPagar = new JRadioButton("Contas a Pagar");
        rdContaPagar.setBounds(5, 20, 120, 17);
        rdContaPagar.setFont(new Font("Arial", 0, 12));
        painelLocalizar.add(rdContaPagar);

        
        rdCompraBatata = new JRadioButton("Compra Batata");
        rdCompraBatata.setBounds(5, 50, 120, 17);
        rdCompraBatata.setFont(new Font("Arial", 0, 12));
        painelLocalizar.add(rdCompraBatata);
        
        
        
          
          rdCompraCebola = new JRadioButton("Compra Cebola");
        rdCompraCebola.setBounds(5, 80, 120, 17);
        rdCompraCebola.setFont(new Font("Arial", 0, 12));
        painelLocalizar.add(rdCompraCebola);

        
        rdCompraDiversas = new JRadioButton("Compra Diversas");
        rdCompraDiversas.setBounds(5, 110, 130, 17);
        rdCompraDiversas.setFont(new Font("Arial", 0, 12));
        painelLocalizar.add(rdCompraDiversas);
        
        
           rdFrete = new JRadioButton("Frete");
        rdFrete.setBounds(5, 140, 120, 17);
        rdFrete.setFont(new Font("Arial", 0, 12));
        painelLocalizar.add(rdFrete);

        
        rdCamaraFria = new JRadioButton("Camara Fria");
        rdCamaraFria.setBounds(5, 170, 120, 17);
        rdCamaraFria.setFont(new Font("Arial", 0, 12));
        painelLocalizar.add(rdCamaraFria);
        
        
        
        
        
           
          rdVendaBatata = new JRadioButton("Venda Batata");
        rdVendaBatata.setBounds(160, 20, 120, 17);
        rdVendaBatata.setFont(new Font("Arial", 0, 12));
        painelLocalizar.add(rdVendaBatata);

        
        rdVendaCebola = new JRadioButton("Venda Cebola");
        rdVendaCebola.setBounds(160, 50, 120, 17);
        rdVendaCebola.setFont(new Font("Arial", 0, 12));
        painelLocalizar.add(rdVendaCebola);
        
        
        
          
          rdVendaDiversas = new JRadioButton("Venda Diversas");
        rdVendaDiversas.setBounds(160, 80, 130, 17);
        rdVendaDiversas.setFont(new Font("Arial", 0, 12));
        painelLocalizar.add(rdVendaDiversas);

        
        rdLavacao = new JRadioButton("Lavação");
        rdLavacao.setBounds(160, 110, 100, 17);
        rdLavacao.setFont(new Font("Arial", 0, 12));
        painelLocalizar.add(rdLavacao);
        
        
           rdMaquinacao = new JRadioButton("Maquinação");
        rdMaquinacao.setBounds(160, 140, 120, 17);
        rdMaquinacao.setFont(new Font("Arial", 0, 12));
        painelLocalizar.add(rdMaquinacao);

        
       btnPesquisarLoc = new JButton("Buscar");
       btnPesquisarLoc.setBounds(160, 170, 80, 25);
       btnPesquisarLoc.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
       btnPesquisarLoc.setToolTipText("Pesquisar");
       btnPesquisarLoc.setHorizontalTextPosition(SwingConstants.RIGHT);
       painelLocalizar.add(btnPesquisarLoc);
        
        
       
       painelTipoNovo = new JPanel();
        painelTipoNovo.setLayout(null);
        painelTipoNovo.setSize(300, 200);
        painelTipoNovo.setLocation(405, 20);
        painelTipoNovo.setBorder(BorderFactory.createTitledBorder("Localizar"));
        
        
        
        

        groupLocalizar = new ButtonGroup();
        groupLocalizar.add(rdContaPagar);
        groupLocalizar.add(rdCompraBatata);
        groupLocalizar.add(rdCompraCebola);
        groupLocalizar.add(rdCompraDiversas);        
        groupLocalizar.add(rdFrete);
        groupLocalizar.add(rdCamaraFria);
        groupLocalizar.add(rdVendaBatata);
        groupLocalizar.add(rdVendaCebola);        
        groupLocalizar.add(rdVendaDiversas);
        groupLocalizar.add(rdLavacao);
        groupLocalizar.add(rdMaquinacao);
        
       
         
                  painelNovo.add(painelLocalizar);

       
       painelTipoNovo = new JPanel();
        painelTipoNovo.setLayout(null);
        painelTipoNovo.setSize(235, 55);
        painelTipoNovo.setLocation(405, 240);
        painelTipoNovo.setBorder(BorderFactory.createTitledBorder("Tipo Entrada/Saida"));
       
       painelNovo.add(painelTipoNovo);
       
       
       
        rdTotal = new JRadioButton("Total");
        rdTotal.setBounds(20, 25, 80, 17);
        rdTotal.setFont(new Font("Arial", 0, 13));
        painelTipoNovo.add(rdTotal);

        
        rdParcial = new JRadioButton("Parcial");
        rdParcial.setBounds(110, 25, 100, 17);
        rdParcial.setFont(new Font("Arial", 0, 13));
        painelTipoNovo.add(rdParcial);
       
       
       
      
//---------------------------------------------------------------------------------------------------
              //-------------------------------------------------------------------------//

             btnGravarNovo= new JButton("Gravar");
              btnGravarNovo.setBounds(130, 450, 100, 35);
              btnGravarNovo.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));
              btnGravarNovo.setHorizontalTextPosition(SwingConstants.RIGHT);
              btnGravarNovo.setFont(new Font("Arial", 1,12));    
              btnGravarNovo.addActionListener((java.awt.event.ActionEvent evt) -> { 
           
                    
        }); 
              painelNovo.add(btnGravarNovo);


//---------------------------------------------------------------------------//


//-------------------------------------------------------------------------//

             btnSairNovo= new JButton("Sair");
             btnSairNovo.setBounds(250, 450, 100, 35);
             btnSairNovo.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/sair.png"));
             btnSairNovo.setHorizontalTextPosition(SwingConstants.RIGHT);
             btnSairNovo.setFont(new Font("Arial", 1,12));
             btnSairNovo.addActionListener((java.awt.event.ActionEvent evt) -> {
            janelaNovo.dispose();
        });
             painelNovo.add(btnSairNovo);

        
 //-----------------------------------------------------------------------------------------------------//       
        
        
        
        janelaNovo.add(painelNovo);
        janelaNovo.setVisible(true);
        
      
       }
      
      public void CriarVisualizar(){
          
          janelaVisualizar = new JFrame("");
        janelaVisualizar.setSize(170, 195);
        janelaVisualizar.setLayout(null);
        janelaVisualizar.setResizable(false);
        janelaVisualizar.setLocationRelativeTo(null);

//---------------------------------------------------------------------------//


        painelVisualizar = new JPanel();
        painelVisualizar.setLayout(null);
        painelVisualizar.setSize(150, 110);
        painelVisualizar.setLocation(7, 5);
        painelVisualizar.setBorder(BorderFactory.createTitledBorder("Relatório"));
        
        
         rdDetalhado = new JRadioButton("Detalhado");
        rdDetalhado.setBounds(5, 30, 120, 17);
        rdDetalhado.setFont(new Font("Arial", 1, 13));
        painelVisualizar.add(rdDetalhado);
        
        rdConsolidado = new JRadioButton("Consolidado");
        rdConsolidado.setBounds(5, 70, 120, 17);
        rdConsolidado.setFont(new Font("Arial", 1, 13));
        painelVisualizar.add(rdConsolidado);
        
        

        groupVisualizar = new ButtonGroup();
        groupVisualizar.add(rdDetalhado);
        groupVisualizar.add(rdConsolidado);
        
        
               btnOKVisualizar= new JButton("OK");
              btnOKVisualizar.setBounds(30, 120, 100, 35);
              btnOKVisualizar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));
              btnOKVisualizar.setHorizontalTextPosition(SwingConstants.RIGHT);
              btnOKVisualizar.setFont(new Font("Arial", 1,12));    
              btnOKVisualizar.addActionListener((java.awt.event.ActionEvent evt) -> { 
           
                    
        }); 
              janelaVisualizar.add(btnOKVisualizar);
          
          
        janelaVisualizar.add(painelVisualizar);
        janelaVisualizar.setVisible(true);
          
      }
}
               
      

      
      
      
      
      

