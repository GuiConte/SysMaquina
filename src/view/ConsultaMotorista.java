/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Font;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
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
public class ConsultaMotorista {

    private JFrame janela;
    private JPanel painelConsultaMotorista, painelPequisa;
    private JTable tblMotorista,tblMotorista2;
    private JScrollPane scrollTable,scrollTable2;
    private DefaultTableModel modelo,modelo2;
    private JButton btnExcluir,btnAlterar,btnNovo,btnSair;
    private ButtonGroup groupPesquisa;
    private JRadioButton rdInicio,rdParte;
    private JLabel lblConsulta;
    private JTextField txtConsulta;
    private JCheckBox chkBloqueados;

    public void desenharTela() {

        janela = new JFrame("Consulta de Motorista");
        janela.setSize(930, 510);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);

        painelConsultaMotorista = new JPanel();
        painelConsultaMotorista.setLayout(null);
        painelConsultaMotorista.setSize(930, 600);
        painelConsultaMotorista.setLocation(0, 0);
        
        criarTabela();
        criarTabela2();
        
       
        
        
        painelPequisa = new JPanel();
        painelPequisa.setLayout(null);
        painelPequisa.setBorder(BorderFactory.createTitledBorder("Pesquisa por:"));
        painelPequisa.setSize(160, 80);
        painelPequisa.setLocation(5, 390);
        
        rdInicio = new JRadioButton("Inicio do Nome");
        rdInicio.setBounds(8, 25, 130, 16);
        rdInicio.setFont(new Font("Arial", 0, 13));
        painelPequisa.add(rdInicio);
        
        rdParte = new JRadioButton("Parte do Nome");
        rdParte.setBounds(8, 50, 130, 16);
        rdParte.setFont(new Font("Arial", 0, 13));
        painelPequisa.add(rdParte);
        
        groupPesquisa = new ButtonGroup();
        groupPesquisa.add(rdInicio);
        groupPesquisa.add(rdParte);
        
        painelConsultaMotorista.add(painelPequisa);
        
        lblConsulta = new JLabel("Nova Consulta:");
        lblConsulta.setBounds(180, 425, 100, 22);
        lblConsulta.setFont(new Font("Arial", 1, 13));
        painelConsultaMotorista.add(lblConsulta);
        
        txtConsulta = new JTextField();
        txtConsulta.setBounds(180, 445, 325, 22);
        painelConsultaMotorista.add(txtConsulta);
        
        chkBloqueados = new JCheckBox("Mostrar Bloqueados");
        chkBloqueados.setBounds(330, 420, 160, 20);
        chkBloqueados.setFont(new Font("Arial", 1, 12));
        painelConsultaMotorista.add(chkBloqueados);
        
        
        
           
        btnNovo = new JButton("Novo");
        btnNovo.setBounds(515, 435, 90, 35);
        btnNovo.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/incluir.png"));
        btnNovo.setFont(new Font("Arial", 1, 13));
        btnNovo.addActionListener((java.awt.event.ActionEvent evt)->{
             CadastroMotorista cadMotorista = new CadastroMotorista();
            try { 
                cadMotorista.desenharTela();
            } catch (ParseException ex) {
                Logger.getLogger(ConsultaMotorista.class.getName()).log(Level.SEVERE, null, ex);
            }
             janela.dispose();
        });
        painelConsultaMotorista.add(btnNovo);
        
        
        btnAlterar = new JButton("Alterar");
        btnAlterar.setBounds(615, 435, 90, 35);
       btnAlterar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/alterar2.png"));
        btnAlterar.setFont(new Font("Arial", 1, 13));
        btnAlterar.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelConsultaMotorista.add(btnAlterar);
        
        
           btnExcluir = new JButton("Excluir");
        btnExcluir.setBounds(715, 435, 90, 35);
        btnExcluir.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/excluir2.png"));
        btnExcluir.setFont(new Font("Arial", 1, 13));
        btnExcluir.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelConsultaMotorista.add(btnExcluir);
        
     
        
        btnSair = new JButton("Sair");
        btnSair.setBounds(815, 435, 90, 35);
        btnSair.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/sair.png"));
        btnSair.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnSair.addActionListener((java.awt.event.ActionEvent evt) -> {  
           janela.dispose();
        });
        painelConsultaMotorista.add(btnSair);
        
        janela.add(painelConsultaMotorista);
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
        modelo.addColumn("Motorista");
        modelo.addColumn("Apelido");
        modelo.addColumn("Placa");
        modelo.addColumn("Fone");
        modelo.addColumn("R.G");
        modelo.addColumn("C.P.F");
        modelo.addColumn("C.N.H");
        modelo.addColumn("Endereço");
        modelo.addColumn("Cidade");
        modelo.addColumn("CEP");
        modelo.addColumn("UF");
        modelo.addColumn("Data Cadastro");
        modelo.addColumn("Usuário");

        tblMotorista = new JTable();
        tblMotorista.setModel(modelo);
        tblMotorista.getColumnModel().getColumn(0).setPreferredWidth(70);
        tblMotorista.getColumnModel().getColumn(1).setPreferredWidth(220);
        tblMotorista.getColumnModel().getColumn(2).setPreferredWidth(220);
        tblMotorista.getColumnModel().getColumn(3).setPreferredWidth(220);

        tblMotorista.getTableHeader().setResizingAllowed(false);
        tblMotorista.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblMotorista.getTableHeader();
        cabecalho.setFont(new Font("Arial", 1, 14));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblMotorista.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblMotorista.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        tblMotorista.getColumnModel().getColumn(2).setCellRenderer(centralizaColunas);
        tblMotorista.getColumnModel().getColumn(3).setCellRenderer(centralizaColunas);

        tblMotorista.setFont(new Font("Arial", 0, 14));

        scrollTable = new JScrollPane(tblMotorista,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(10, 20, 900, 250);
        tblMotorista.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelConsultaMotorista.add(scrollTable);
    }
    
    private void criarTabela2() {
        modelo2 = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        modelo2.addColumn("Banco");
        modelo2.addColumn("Agência");
        modelo2.addColumn("C/C");
        modelo2.addColumn("Titular");
        modelo2.addColumn("C.P.F");

        tblMotorista2 = new JTable();
        tblMotorista2.setModel(modelo2);
        tblMotorista2.getColumnModel().getColumn(0).setPreferredWidth(70);
        tblMotorista2.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblMotorista2.getColumnModel().getColumn(2).setPreferredWidth(200);
        tblMotorista2.getColumnModel().getColumn(3).setPreferredWidth(200);
        tblMotorista2.getColumnModel().getColumn(4).setPreferredWidth(200);

        tblMotorista2.getTableHeader().setResizingAllowed(false);
        tblMotorista2.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho2 = tblMotorista2.getTableHeader();
        cabecalho2.setFont(new Font("Arial", 1, 14));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblMotorista2.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblMotorista2.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        tblMotorista2.getColumnModel().getColumn(2).setCellRenderer(centralizaColunas);
        tblMotorista2.getColumnModel().getColumn(3).setCellRenderer(centralizaColunas);

        tblMotorista2.setFont(new Font("Arial", 0, 14));

        scrollTable2 = new JScrollPane(tblMotorista2,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable2.setBounds(10, 287, 840, 100);
        tblMotorista2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelConsultaMotorista.add(scrollTable2);
    }
}
