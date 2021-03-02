/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Patrik
 */
public class Viagem_Despesa {
    
    
    
       private JFrame janela, janelaNovo, janelaRelat, janelaSub;
    private JTable tblCliente, tblAdiantamento;
    private JScrollPane scrollTable;
    private DefaultTableModel modelo;
    private JPanel painelPrincipal,painelNovo, painelRelat, painelSub;
    private JButton btnVisualizar, btnImprimir;
    private JLabel lblVeiculo, lblRendimento, lblDespesas, lblRendiDesp, lblAdiantamento, lblCategoria, lblPeriodo,e;
    private JTextField txtRendimento, txtDespesas, txtRendiDesp, txtValorNovo;
    private JFormattedTextField txtDataInicio, txtDadaFinal, txtDataNovo, txtDataInicioRel,txtDataFimRel;
    private JComboBox cbVeiculos, cbDespesa, cbCategoria, cbSubCategoria;    
    private JLabel lblDataNovo, lblDespesaNovo, txtCategoriaNovo, lblSubCategoriaNovo, lblValorNovo;    
    private JButton btnInserir, btnAlterar, btnExcluir, btnConsultar, btnCaixaRelt, btnReltDesp, btnReltSub;
    private JButton btnSalvarNovo, btnCancelarNovo, btnVisualizarRel, btnFecharRel, btnVisualizarSub;
    private JCheckBox ckConsolidado;
    
    
    
    
    
     public void desenharTela() throws ParseException {

        janela = new JFrame("Despesa Viagem");
        janela.setSize(1025, 565);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
                


        

        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(1000, 520);
        painelPrincipal.setLocation(5, 5);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        
        
    //------------------------------------------------------------------------//
    
        lblVeiculo = new JLabel("Veiculo ");
        lblVeiculo.setBounds(13, 10, 60, 22);
        painelPrincipal.add(lblVeiculo);
        
        cbVeiculos = new JComboBox();
        cbVeiculos.setBounds(10, 30, 120, 22);
        painelPrincipal.add(cbVeiculos);
    
    
   
    
    

    txtDataInicio =new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtDataInicio.setBounds(140, 30, 80, 22);
        painelPrincipal.add(txtDataInicio);
        
        txtDadaFinal = new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtDadaFinal.setBounds(250, 30, 80, 22);
        painelPrincipal.add(txtDadaFinal);    
        
        
        
       btnConsultar = new JButton("Consultar");
       btnConsultar.setBounds(350, 20, 103, 35);       
       btnConsultar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/busca.png"));
       btnConsultar.setFont(new Font("Arial", 1, 13));
       btnConsultar.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelPrincipal.add(btnConsultar);
        
        
          
        // ---------------- BOTAO GRAVAR-----//
       btnInserir = new JButton("Inserir");
       btnInserir.setBounds(10, 350, 80, 25);       
       btnInserir.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/incluir.png"));      
       btnInserir.setFont(new Font("Arial", 1, 13));
       btnInserir.setHorizontalTextPosition(SwingConstants.RIGHT);
       btnInserir.addActionListener((java.awt.event.ActionEvent evt)->{
           
            try {
                CriarNovo();
            } catch (ParseException ex) {
                Logger.getLogger(Viagem_Despesa.class.getName()).log(Level.SEVERE, null, ex);
            }
       });
       
        
       painelPrincipal.add(btnInserir);
       
        btnAlterar = new JButton("Alterar");
       btnAlterar.setBounds(100, 350, 80, 25);       
       btnAlterar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/alterar2.png"));
        btnAlterar.setFont(new Font("Arial", 1, 13));
       btnAlterar.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelPrincipal.add(btnAlterar);
       
       
       
        btnExcluir = new JButton("Excluir");
       btnExcluir.setBounds(190, 350, 80, 25);       
       btnExcluir.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/excluir2.png"));
        btnExcluir.setFont(new Font("Arial", 1, 13));
       btnExcluir.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelPrincipal.add(btnExcluir);
        
       //------------------------------------------------------------------------------------// 
        lblAdiantamento = new JLabel("Adiantamento ");
        lblAdiantamento.setBounds(10, 390, 120, 22);
        lblAdiantamento.setFont(new Font("Arial", 1, 13));
        painelPrincipal.add(lblAdiantamento);
        
        
        
          //------------------------------------------------------------------------------------// 
        lblRendimento = new JLabel("Rendimento ");
        lblRendimento.setBounds(530, 340, 120, 22);
        lblRendimento.setFont(new Font("Arial", 1, 13));
        lblRendimento.setForeground(Color.blue);
        painelPrincipal.add(lblRendimento);
        
        txtRendimento= new JTextField();
        txtRendimento.setBounds(530, 360, 120, 22);
        txtRendimento.setForeground(Color.blue);
        painelPrincipal.add(txtRendimento);
        
        
        
           //------------------------------------------------------------------------------------// 
        lblDespesas = new JLabel("Despesas ");
        lblDespesas.setBounds(670, 340, 120, 22);
        lblDespesas.setFont(new Font("Arial", 1, 13));
        lblDespesas.setForeground(Color.red);
        painelPrincipal.add(lblDespesas);
        
        txtDespesas= new JTextField();
        txtDespesas.setBounds(670, 360, 120, 22);
        txtDespesas.setForeground(Color.red);
        painelPrincipal.add(txtDespesas);
        
        
        
           //------------------------------------------------------------------------------------// 
        lblRendiDesp = new JLabel("Rendimentos - Despesas ");
        lblRendiDesp.setBounds(820, 340, 160, 22);
        lblRendiDesp.setFont(new Font("Arial", 1, 13));
        lblRendiDesp.setForeground(Color.black);
        painelPrincipal.add(lblRendiDesp);
        
        txtRendiDesp= new JTextField();
        txtRendiDesp.setBounds(820, 360, 160, 22);
        txtRendiDesp.setForeground(Color.black);
        painelPrincipal.add(txtRendiDesp);
        
        
        
        
        
        btnCaixaRelt = new JButton("Caixa Relatório");
       btnCaixaRelt.setBounds(810, 400, 170, 25);       
       btnCaixaRelt.setFont(new Font("Arial", 1, 12));
       btnCaixaRelt.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnCaixaRelt.addActionListener((java.awt.event.ActionEvent evt)->{
           
            try {
                CriarCaixaRelatorio();
            } catch (ParseException ex) {
                Logger.getLogger(Viagem_Despesa.class.getName()).log(Level.SEVERE, null, ex);
            }
       });
        
       painelPrincipal.add(btnCaixaRelt);
        
        
        btnReltDesp = new JButton("Relatório Despesas");
       btnReltDesp.setBounds(810, 430, 170, 30);       
       btnReltDesp.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/relatorio.png"));
        btnReltDesp.setFont(new Font("Arial", 1, 12));
       btnReltDesp.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelPrincipal.add(btnReltDesp);
       
       
        
       btnReltSub = new JButton("Relatório SubCategoria");
       btnReltSub.setBounds(810, 465, 170, 30);       
       btnReltSub.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/relatorio.png"));
       btnReltSub.setFont(new Font("Arial", 1, 12));
       btnReltSub.setHorizontalTextPosition(SwingConstants.RIGHT);
       btnReltSub.addActionListener((java.awt.event.ActionEvent evt)->{
           CriarRelatorioSub();
       });
       
        
       painelPrincipal.add(btnReltSub);
        
        
      //-------------------------------------------------------------------------------------//
      
      
      
      
        
        
        
        
        
        
        
        
          // ---------------- BOTAO VISUALIZAR-----//
        /*btnVisualizar = new JButton("Visualizar");
         btnVisualizar.setBounds(20, 310, 105, 35);       
        btnVisualizar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/busca.png"));
        btnVisualizar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnVisualizar.setFont(new Font("Arial", 1, 13));
        btnVisualizar.addActionListener((java.awt.event.ActionEvent evt)->{
            
        });
        painelPrincipal.add(btnVisualizar);
        
        btnImprimir = new JButton("Imprimir");
        btnImprimir.setBounds(135, 310, 105, 35);
        btnImprimir.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/visualizar.png"));
        btnImprimir.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnImprimir.setFont(new Font("Arial", 1, 13));
        btnImprimir.addActionListener((java.awt.event.ActionEvent evt) -> {  
           
        });
        painelPrincipal.add(btnImprimir);*/
        
        criarTabela();
        criarTabelaAdiantamento();
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
        modelo.addColumn("C.I");
        modelo.addColumn("Crédito");
        modelo.addColumn("Débito");
        modelo.addColumn("Despesa/Origem");
        modelo.addColumn("Despesa/Destino");
        modelo.addColumn("Sub Categoria");
        modelo.addColumn("Local de Origem");
       

        tblCliente = new JTable();
        tblCliente.setModel(modelo);
        tblCliente.getColumnModel().getColumn(0).setPreferredWidth(80);
        tblCliente.getColumnModel().getColumn(1).setPreferredWidth(80);
        tblCliente.getColumnModel().getColumn(2).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(4).setPreferredWidth(250);
        tblCliente.getColumnModel().getColumn(5).setPreferredWidth(250);
        tblCliente.getColumnModel().getColumn(6).setPreferredWidth(250);
        tblCliente.getColumnModel().getColumn(7).setPreferredWidth(250);
        tblCliente.getColumnModel().getColumn(7).setPreferredWidth(250);

        tblCliente.getTableHeader().setResizingAllowed(false);
        tblCliente.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblCliente.getTableHeader();
        cabecalho.setFont(new Font("Arial", 0, 12));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblCliente.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblCliente.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        tblCliente.getColumnModel().getColumn(2).setCellRenderer(centralizaColunas);
        tblCliente.getColumnModel().getColumn(3).setCellRenderer(centralizaColunas);

        tblCliente.setFont(new Font("Arial", 0, 12));

        scrollTable = new JScrollPane(tblCliente,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(10, 60, 985, 280);
        tblCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelPrincipal.add(scrollTable);
    }
    
    
     private void criarTabelaAdiantamento() {
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

       
        modelo.addColumn("C.I");
        modelo.addColumn("Data");
        modelo.addColumn("Valor");
       
       

        tblAdiantamento = new JTable();
        tblAdiantamento.setModel(modelo);
        tblAdiantamento.getColumnModel().getColumn(0).setPreferredWidth(105);
        tblAdiantamento.getColumnModel().getColumn(1).setPreferredWidth(105);
        tblAdiantamento.getColumnModel().getColumn(2).setPreferredWidth(105);
       

        tblAdiantamento.getTableHeader().setResizingAllowed(false);
        tblAdiantamento.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblAdiantamento.getTableHeader();
        cabecalho.setFont(new Font("Arial", 0, 12));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblAdiantamento.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblAdiantamento.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        tblAdiantamento.getColumnModel().getColumn(2).setCellRenderer(centralizaColunas);
        

        tblAdiantamento.setFont(new Font("Arial", 0, 12));

        scrollTable = new JScrollPane(tblAdiantamento,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(10, 410, 320, 100);
        tblAdiantamento.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelPrincipal.add(scrollTable);
    }
    
    
    
     private void CriarNovo() throws ParseException {
     
      janelaNovo = new JFrame("");
        janelaNovo.setSize(418, 290);
        janelaNovo.setLayout(null);
        janelaNovo.setResizable(false);
        janelaNovo.setLocationRelativeTo(null);
                
                
                
                  painelNovo = new JPanel();
        painelNovo.setLayout(null);
        painelNovo.setSize(400, 250);
        painelNovo.setLocation(5, 5);
        painelNovo.setBorder(BorderFactory.createTitledBorder(""));
        
        
        
        
        lblDataNovo =new JLabel("Data");
        lblDataNovo.setBounds(10, 10, 80, 22);
        painelNovo.add(lblDataNovo);
        
        txtDataNovo = new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtDataNovo.setBounds(10, 30, 80, 22);
        painelNovo.add(txtDataNovo);    
        
        
        //-------------------------------------------------------------------------------//
        
          lblDespesaNovo =new JLabel("Despesa");
        lblDespesaNovo.setBounds(110, 10, 80, 22);
        painelNovo.add(lblDespesaNovo);
        
        cbDespesa = new JComboBox();
        cbDespesa.setBounds(110, 30, 280, 22);
        painelNovo.add(cbDespesa);    
        
        
        
          //-------------------------------------------------------------------------------//
        
          lblCategoria =new JLabel("Categoria");
        lblCategoria.setBounds(10, 60, 80, 22);
        painelNovo.add(lblCategoria);
        
        cbCategoria = new JComboBox();
        cbCategoria.setBounds(10, 80, 280, 22);
        painelNovo.add(cbCategoria);    
        
        
        
        
          //-------------------------------------------------------------------------------//
        
          lblSubCategoriaNovo =new JLabel("SubCategoria");
        lblSubCategoriaNovo.setBounds(10, 110, 80, 22);
        painelNovo.add(lblSubCategoriaNovo);
        
        cbSubCategoria = new JComboBox();
        cbSubCategoria.setBounds(10, 130, 280, 22);
        painelNovo.add(cbSubCategoria);    
        
        
        
          //-------------------------------------------------------------------------------//
        
          lblValorNovo =new JLabel("Valor");
        lblValorNovo.setBounds(10, 160, 80, 22);
        painelNovo.add(lblValorNovo);
        
        txtValorNovo = new JTextField();
        txtValorNovo.setBounds(10, 180, 120, 22);
        painelNovo.add(txtValorNovo);    
        
        
            btnSalvarNovo = new JButton("Salvar");
       btnSalvarNovo.setBounds(20, 215, 90, 30);       
       btnSalvarNovo.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));
        btnSalvarNovo.setFont(new Font("Arial", 1, 13));
       btnSalvarNovo.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelNovo.add(btnSalvarNovo);
       
       
       
        btnCancelarNovo = new JButton("Cancelar");
       btnCancelarNovo.setBounds(120, 215, 90, 30);       
       btnCancelarNovo.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));
        btnCancelarNovo.setFont(new Font("Arial", 1, 13));
       btnCancelarNovo.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelNovo.add(btnCancelarNovo);
        
        janelaNovo.add(painelNovo);
        janelaNovo.setVisible(true);
                
                
     
     }
     
     
       
     private void CriarCaixaRelatorio() throws ParseException {
     
      janelaRelat = new JFrame("");
        janelaRelat.setSize(280, 160);
        janelaRelat.setLayout(null);
        janelaRelat.setResizable(false);
        janelaRelat.setLocationRelativeTo(null);
               
                
                
                  painelRelat = new JPanel();
        painelRelat.setLayout(null);
        painelRelat.setSize(260, 120);
        painelRelat.setLocation(5, 5);
        painelRelat.setBorder(BorderFactory.createTitledBorder(""));
        
        
        
        
        lblPeriodo =new JLabel("Periodo");
        lblPeriodo.setBounds(30, 10, 80, 22);
        painelRelat.add(lblPeriodo);
        
        txtDataInicioRel = new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtDataInicioRel.setBounds(30, 30, 80, 22);
        painelRelat.add(txtDataInicioRel);
        
        
         e =new JLabel("e");
        e.setBounds(120, 30, 80, 22);
        painelRelat.add(e);
        
        txtDataFimRel = new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtDataFimRel.setBounds(140, 30, 80, 22);
        painelRelat.add(txtDataFimRel);
        
        
        
       btnVisualizarRel = new JButton("Visualizar");
       btnVisualizarRel.setBounds(5, 70, 105, 30);       
       btnVisualizarRel.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/visualizar.png"));
        btnVisualizarRel.setFont(new Font("Arial", 1, 13));
       btnVisualizarRel.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelRelat.add(btnVisualizarRel);
       
       
       
        btnFecharRel = new JButton("Fechar");
       btnFecharRel.setBounds(140, 70, 100, 30);       
       btnFecharRel.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/Sair.png"));
        btnFecharRel.setFont(new Font("Arial", 1, 13));
       btnFecharRel.setHorizontalTextPosition(SwingConstants.RIGHT);
       btnFecharRel.addActionListener((java.awt.event.ActionEvent evt) -> {  
           janelaRelat.dispose();
        });
        
       painelRelat.add(btnFecharRel);
        
        
        
        
     
        janelaRelat.add(painelRelat);
        janelaRelat.setVisible(true);
        
        
     }
     
     
      private void CriarRelatorioSub()  {
     
        janelaSub = new JFrame("");
        janelaSub.setSize(280, 160);
        janelaSub.setLayout(null);
        janelaSub.setResizable(false);
        janelaSub.setLocationRelativeTo(null);
      
                
                
         painelSub = new JPanel();
        painelSub.setLayout(null);
        painelSub.setSize(260, 120);
        painelSub.setLocation(5, 5);
        painelSub.setBorder(BorderFactory.createTitledBorder(""));
        
        
        
        ckConsolidado= new JCheckBox("Consolidado");
        ckConsolidado.setBounds(75, 20, 120, 25);
        ckConsolidado.setFont(new Font("Arial", 1, 13));
        painelSub.add(ckConsolidado);
        
        
        
         btnVisualizarSub = new JButton("Visualizar");
       btnVisualizarSub.setBounds(75, 60, 105, 30);       
       btnVisualizarSub.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/visualizar.png"));
        btnVisualizarSub.setFont(new Font("Arial", 1, 13));
       btnVisualizarSub.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelSub.add(btnVisualizarSub);
        
        
        
        janelaSub.add(painelSub);
        janelaSub.setVisible(true);
     
      }
}
    

