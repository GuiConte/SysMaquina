/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
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
public class ConsultaSacaria {

    private JFrame janela;
    private JPanel painelConsultaSacaria, painelPequisa;
    private JTable tblSacaria,tblSacaria2;
    private JScrollPane scrollTable,scrollTable2;
    private DefaultTableModel modelo,modelo2;
    private JButton btnExcluir,btnAlterar,btnNovo,btnSair;
    private ButtonGroup groupPesquisa;
    private JRadioButton rdInicio,rdParte;
    private JLabel lblConsulta;
    private JTextField txtConsulta;

    public void desenharTela() {

        janela = new JFrame("Cadastro de Sacarias");
        janela.setSize(800, 470);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);

        painelConsultaSacaria = new JPanel();
        painelConsultaSacaria.setLayout(null);
        painelConsultaSacaria.setSize(800, 470);
        painelConsultaSacaria.setLocation(0, 0);
        
        criarTabela();
        
        btnExcluir = new JButton("Excluir");
        btnExcluir.setBounds(10, 380, 60, 53);
        btnExcluir.setFont(new Font("Arial", 0, 8));
        btnExcluir.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelConsultaSacaria.add(btnExcluir);
        
        
        painelPequisa = new JPanel();
        painelPequisa.setLayout(null);
        painelPequisa.setBorder(BorderFactory.createTitledBorder("Pesquisa por:"));
        painelPequisa.setSize(120, 65);
        painelPequisa.setLocation(10, 307);
        
        rdInicio = new JRadioButton("Inicio do Nome");
        rdInicio.setBounds(8, 22, 100, 13);
        rdInicio.setFont(new Font("Arial", 0, 10));
        painelPequisa.add(rdInicio);
        
        rdParte = new JRadioButton("Parte do Nome");
        rdParte.setBounds(8, 40, 100, 13);
        rdParte.setFont(new Font("Arial", 0, 10));
        painelPequisa.add(rdParte);
        
        groupPesquisa = new ButtonGroup();
        groupPesquisa.add(rdInicio);
        groupPesquisa.add(rdParte);
        
        painelConsultaSacaria.add(painelPequisa);
        
        lblConsulta = new JLabel("Nova Consulta:");
        lblConsulta.setBounds(145, 305, 150, 40);
        lblConsulta.setFont(new Font("Arial", 1, 12));
        painelConsultaSacaria.add(lblConsulta);
        
        txtConsulta = new JTextField();
        txtConsulta.setBounds(145, 337, 310, 25);
        painelConsultaSacaria.add(txtConsulta);
        
        btnAlterar = new JButton("Alterar");
        btnAlterar.setBounds(235, 380, 60, 53);
        btnAlterar.setFont(new Font("Arial", 0, 8));
        btnAlterar.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelConsultaSacaria.add(btnAlterar);
        
        btnNovo = new JButton("Novo");
        btnNovo.setBounds(315, 380, 60, 53);
        btnNovo.setFont(new Font("Arial", 0, 8)); 
        btnNovo.addActionListener((java.awt.event.ActionEvent evt)->{
             CadastroSacarias cadSacaria = new CadastroSacarias();
             cadSacaria.desenharTela(); 
             janela.dispose();
        });
        painelConsultaSacaria.add(btnNovo);
        
        btnSair = new JButton("Sair");
        btnSair.setBounds(395, 380, 60, 53);
        btnSair.setFont(new Font("Arial", 0, 8));
        btnSair.addActionListener((java.awt.event.ActionEvent evt) -> {  
           janela.dispose();
        });
        painelConsultaSacaria.add(btnSair);
        
        criarTabela2();
        
        janela.add(painelConsultaSacaria);
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
        modelo.addColumn("Preço");
        modelo.addColumn("Custo");
        modelo.addColumn("KG");
        modelo.addColumn("Data Custo");
        modelo.addColumn("Usuário");

        tblSacaria = new JTable();
        tblSacaria.setModel(modelo);
        tblSacaria.getColumnModel().getColumn(0).setPreferredWidth(70);
        tblSacaria.getColumnModel().getColumn(1).setPreferredWidth(220);
        tblSacaria.getColumnModel().getColumn(2).setPreferredWidth(220);
        tblSacaria.getColumnModel().getColumn(3).setPreferredWidth(220);

        tblSacaria.getTableHeader().setResizingAllowed(false);
        tblSacaria.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblSacaria.getTableHeader();
        cabecalho.setFont(new Font("Arial", 1, 14));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblSacaria.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblSacaria.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        tblSacaria.getColumnModel().getColumn(2).setCellRenderer(centralizaColunas);
        tblSacaria.getColumnModel().getColumn(3).setCellRenderer(centralizaColunas);

        tblSacaria.setFont(new Font("Arial", 0, 14));

        scrollTable = new JScrollPane(tblSacaria,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(10, 20, 775, 280);
        tblSacaria.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelConsultaSacaria.add(scrollTable);
    }
    
    private void criarTabela2() {
        modelo2 = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        modelo2.addColumn("Maquina");
        modelo2.addColumn("Estoque Atual");

        tblSacaria2 = new JTable();
        tblSacaria2.setModel(modelo2);
        tblSacaria2.getColumnModel().getColumn(0).setPreferredWidth(70);
        tblSacaria2.getColumnModel().getColumn(1).setPreferredWidth(220);

        tblSacaria2.getTableHeader().setResizingAllowed(false);
        tblSacaria2.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho2 = tblSacaria2.getTableHeader();
        cabecalho2.setFont(new Font("Arial", 1, 14));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblSacaria2.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblSacaria2.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);

        tblSacaria2.setFont(new Font("Arial", 0, 14));

        scrollTable2 = new JScrollPane(tblSacaria2,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable2.setBounds(475, 307, 310, 126);
        tblSacaria2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelConsultaSacaria.add(scrollTable2);
    }
}
