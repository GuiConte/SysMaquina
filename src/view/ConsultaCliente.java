/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
public class ConsultaCliente {

    private JFrame janela;
    private JPanel painelConsultaCliente, painelPequisa;
    private JTable tblCliente;
    private JScrollPane scrollTable;
    private DefaultTableModel modelo;
    private JButton btnExcluir, btnAlterar, btnNovo, btnSair;
    private ButtonGroup groupPesquisa;
    private JRadioButton rdInicio, rdParte;
    private JLabel lblConsulta;
    private JTextField txtConsulta;

    public void desenharTela() {

        janela = new JFrame("Clientes");
        janela.setSize(940, 400);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);

        painelConsultaCliente = new JPanel();
        painelConsultaCliente.setLayout(null);
        painelConsultaCliente.setSize(930, 800);
        painelConsultaCliente.setLocation(0, 0);

        criarTabela();

        //-------------------------------------------------------------------------------//  
        painelPequisa = new JPanel();
        painelPequisa.setLayout(null);
        painelPequisa.setBorder(BorderFactory.createTitledBorder("Pesquisa por:"));
        painelPequisa.setSize(140, 70);
        painelPequisa.setLocation(10, 290);

        rdInicio = new JRadioButton("Inicio do Nome");
        rdInicio.setBounds(8, 20, 120, 17);
        rdInicio.setFont(new Font("Arial", 0, 11));
        painelPequisa.add(rdInicio);

        rdParte = new JRadioButton("Parte do Nome");
        rdParte.setBounds(8, 45, 120, 17);
        rdParte.setFont(new Font("Arial", 0, 11));
        painelPequisa.add(rdParte);

        groupPesquisa = new ButtonGroup();
        groupPesquisa.add(rdInicio);
        groupPesquisa.add(rdParte);

        painelConsultaCliente.add(painelPequisa);
        //-------------------------------------------------------------------------------//    

        lblConsulta = new JLabel("Nova Consulta:");
        lblConsulta.setBounds(160, 290, 150, 40);
        lblConsulta.setFont(new Font("Arial", 1, 12));
        painelConsultaCliente.add(lblConsulta);

        txtConsulta = new JTextField();
        txtConsulta.setBounds(160, 320, 325, 25);
        painelConsultaCliente.add(txtConsulta);
        //-------------------------------------------------------------------------------//  

        //-------------------------------------------------------------------------------//   
        btnNovo = new JButton("Novo");
        btnNovo.setBounds(490, 315, 100, 35);
        btnNovo.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/incluir.png"));
        btnNovo.setFont(new Font("Arial", 1, 13));

        painelConsultaCliente.add(btnNovo);

        //-------------------------------------------------------------------------------//  
        //-------------------------------------------------------------------------------//
        btnAlterar = new JButton("Alterar");
        btnAlterar.setBounds(600, 315, 100, 35);
        btnAlterar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/alterar2.png"));
        btnAlterar.setFont(new Font("Arial", 1, 13));

        painelConsultaCliente.add(btnAlterar);

        btnExcluir = new JButton("Excluir");
        btnExcluir.setBounds(710, 315, 100, 35);
        btnExcluir.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/excluir2.png"));
        btnExcluir.setFont(new Font("Arial", 1, 13));

        painelConsultaCliente.add(btnExcluir);

        //-------------------------------------------------------------------------------//   
        btnSair = new JButton("Sair");
        btnSair.setBounds(820, 315, 100, 35);
        btnSair.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/sair.png"));
        btnSair.setHorizontalTextPosition(SwingConstants.RIGHT);

        painelConsultaCliente.add(btnSair);

        janela.add(painelConsultaCliente);
        janela.setVisible(true);

//-------------------------------------------------------------------------------//
    }

    private void criarTabela() {
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        modelo.addColumn("Código");
        modelo.addColumn("Nome");
        modelo.addColumn("Fone");
        modelo.addColumn("CNPJ/CPF");
        modelo.addColumn("RG_IE");
        modelo.addColumn("Endereço");
        modelo.addColumn("Cidade");
        modelo.addColumn("CEP");
        modelo.addColumn("UF");
        modelo.addColumn("Data Cadastro");
        modelo.addColumn("Observação");
        modelo.addColumn("Usuário");
        modelo.addColumn("Celular");
        modelo.addColumn("Email");

        tblCliente = new JTable();
        tblCliente.setModel(modelo);
        tblCliente.getColumnModel().getColumn(0).setPreferredWidth(70);
        tblCliente.getColumnModel().getColumn(1).setPreferredWidth(220);
        tblCliente.getColumnModel().getColumn(2).setPreferredWidth(220);
        tblCliente.getColumnModel().getColumn(3).setPreferredWidth(220);

        tblCliente.getTableHeader().setResizingAllowed(false);
        tblCliente.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblCliente.getTableHeader();
        cabecalho.setFont(new Font("Arial", 1, 14));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblCliente.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblCliente.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        tblCliente.getColumnModel().getColumn(2).setCellRenderer(centralizaColunas);
        tblCliente.getColumnModel().getColumn(3).setCellRenderer(centralizaColunas);

        tblCliente.setFont(new Font("Arial", 0, 14));

        scrollTable = new JScrollPane(tblCliente, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(10, 20, 910, 270);
        tblCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelConsultaCliente.add(scrollTable);
    }

    public void preencherTabela(ResultSet rs) throws SQLException {
        limparTabela();
        if (rs.first()) {
            rs.first();
            do {
                modelo.addRow(new Object[]{rs.getInt("cod_cliente"), rs.getString("nome"), rs.getString("telefone"),
                    rs.getString("cpf_cnpj"), rs.getString("rg_ie"), rs.getString("endereco"),
                    rs.getString("cid.cidade"), rs.getString("cep"), rs.getString("est.estado_abreviado"), rs.getString("data_cadastro"),
                    rs.getString("obs"), rs.getString("usuario"), rs.getString("celular"),
                    rs.getString("email")});
            } while (rs.next());
        }
    }

    private void limparTabela() {
        modelo = (DefaultTableModel) tblCliente.getModel();
        if (modelo.getRowCount() > 0) {
            int rows = modelo.getRowCount();
            for (int i = rows - 1; i >= 0; i--) {
                modelo.removeRow(i);
            }
        }
    }

    public void fecharTela() {
        janela.dispose();
    }

    public int obterIdCliente() {
        int indiceLinha = tblCliente.getSelectedRow();
        if (indiceLinha != -1) {
            int id = Integer.parseInt(tblCliente.getValueAt(indiceLinha, 0).toString());
            return id;
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum cliente foi selecionado", "Selecione o cliente", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    public void addExcluirListener(ActionListener al) {
        btnExcluir.addActionListener(al);
    }

    public void addAlterarListener(ActionListener al) {
        btnAlterar.addActionListener(al);
    }

    public void addNovoListener(ActionListener al) {
        btnNovo.addActionListener(al);
    }

    public void addSairListener(ActionListener al) {
        btnSair.addActionListener(al);
    }
}
