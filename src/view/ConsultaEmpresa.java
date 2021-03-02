
package view;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class ConsultaEmpresa {
    
    
    
    
   private JFrame janela;
    private JPanel painelConsulta;
    private JTable tblEmpresa;
    private JScrollPane scrollTable;
    private DefaultTableModel modelo;
    private JButton btnExcluir,btnAlterar,btnNovo,btnSair, btnBuscar; 
    private JLabel lblConsulta;
    private JTextField txtConsulta;

    public void desenharTela() {

        janela = new JFrame("Consulta Empresa");
        janela.setSize(600, 355);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
                janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        painelConsulta = new JPanel();
        painelConsulta.setLayout(null);
        painelConsulta.setSize(930, 800);
        painelConsulta.setLocation(0, 0);
        
        criarTabela();
        
     
    
        lblConsulta = new JLabel("Pesquisar:");
        lblConsulta.setBounds(20, 20, 150, 22);
        lblConsulta.setFont(new Font("Arial", 1, 12));
        painelConsulta.add(lblConsulta);
        
        txtConsulta = new JTextField();
        txtConsulta.setBounds(90,20, 350, 22);
        painelConsulta.add(txtConsulta);
        
        
         btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(450, 15, 90, 30);
        btnBuscar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/busca.png"));
        btnBuscar.setFont(new Font("Arial", 1, 13));
        btnBuscar.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelConsulta.add(btnBuscar);
     //-------------------------------------------------------------------------------//  
     
      //-------------------------------------------------------------------------------//   
        btnNovo = new JButton("Novo");
        btnNovo.setBounds(80, 280, 100, 35);
        btnNovo.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/incluir.png"));
        btnNovo.setFont(new Font("Arial", 1, 13));
        btnNovo.addActionListener((java.awt.event.ActionEvent evt)->{
           
        });
        painelConsulta.add(btnNovo);
     
       //-------------------------------------------------------------------------------//  
       
       
       //-------------------------------------------------------------------------------//
        btnAlterar = new JButton("Alterar");
        btnAlterar.setBounds(190, 280, 100, 35);
        btnAlterar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/alterar2.png"));
        btnAlterar.setFont(new Font("Arial", 1, 13));
        btnAlterar.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelConsulta.add(btnAlterar);
        
        
        btnExcluir = new JButton("Excluir");
        btnExcluir.setBounds(300, 280, 100, 35);
        btnExcluir.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/excluir2.png"));
        btnExcluir.setFont(new Font("Arial", 1, 13));
        btnExcluir.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelConsulta.add(btnExcluir);
     
     
        
    
    //-------------------------------------------------------------------------------//   
    
        btnSair = new JButton("Sair");
        btnSair.setBounds(410, 280, 100, 35);
        btnSair.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/sair.png"));      
        btnSair.setHorizontalTextPosition(SwingConstants.RIGHT); 
        btnSair.addActionListener((java.awt.event.ActionEvent evt) -> {  
           
        });
        painelConsulta.add(btnSair);
        
        
        
//-------------------------------------------------------------------------------//
        
        janela.add(painelConsulta);
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
        modelo.addColumn("Empresa");
        modelo.addColumn("Fantasia");
        modelo.addColumn("CNPJ");
       
       

        tblEmpresa = new JTable();
        tblEmpresa.setModel(modelo);
        tblEmpresa.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblEmpresa.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblEmpresa.getColumnModel().getColumn(2).setPreferredWidth(200);
        tblEmpresa.getColumnModel().getColumn(3).setPreferredWidth(120);
        
        tblEmpresa.getTableHeader().setResizingAllowed(false);
        tblEmpresa.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblEmpresa.getTableHeader();
        cabecalho.setFont(new Font("Arial", 1, 12));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.LEFT);
        tblEmpresa.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblEmpresa.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        tblEmpresa.getColumnModel().getColumn(2).setCellRenderer(centralizaColunas);
        

        tblEmpresa.setFont(new Font("Arial", 0, 12));

        scrollTable = new JScrollPane(tblEmpresa,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(10, 60, 575, 200);
        tblEmpresa.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelConsulta.add(scrollTable);
    }
    
    
      public void preencherTabela(ResultSet rs) throws SQLException {
        limparTabela();
        if (rs.first()) {
            rs.first();
            do {
                modelo.addRow(new Object[]{rs.getInt("cod_empresa"), rs.getString("empresa"), rs.getString("fantasia"),
                    rs.getString("cnpj")});
            } while (rs.next());
        }
    }

    private void limparTabela() {
        modelo = (DefaultTableModel) tblEmpresa.getModel();
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

    public int obterIdEmpresa() {
        int indiceLinha = tblEmpresa.getSelectedRow();
        if (indiceLinha != -1) {
            int id = Integer.parseInt(tblEmpresa.getValueAt(indiceLinha, 0).toString());
            return id;
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma empresa foi selecionado", "Selecione a empresa", JOptionPane.ERROR_MESSAGE);
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

    
    
    
    

