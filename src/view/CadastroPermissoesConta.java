
package view;

import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class CadastroPermissoesConta {
    

  private JFrame janela;
    private JPanel painelPrincipal;
    private JTable tblFucionario, tblPermitidos;
    private JScrollPane scrollTable;
    private DefaultTableModel modelo;
    private JButton btnPermitir,btnExcluir, btnFechar;
    private JCheckBox cbTodos;
    private JLabel lblFuncionario, lblFunPermitidos;
    
    
     public void desenharTela() {

        janela = new JFrame("Cadastro de Contas");
        janela.setSize(330, 462);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
         
        
         
         
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(315, 425);
        painelPrincipal.setLocation(5, 5);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        
        
        lblFuncionario = new JLabel("Funcionários");
        lblFuncionario.setBounds(10, 10, 130, 22);
        lblFuncionario.setFont(new Font("Arial", 1, 13));
        painelPrincipal.add(lblFuncionario);
        
        
        lblFunPermitidos = new JLabel("Funcionários Permitidos");
        lblFunPermitidos.setBounds(10, 220, 230, 22);
        lblFunPermitidos.setFont(new Font("Arial", 1, 13));
        painelPrincipal.add(lblFunPermitidos);
        
        
        
         // ---------------- BOTAO PERMITIR-----//
        btnPermitir = new JButton("Permitir");
       btnPermitir.setBounds(10, 185, 85, 25);       
       btnPermitir.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelPrincipal.add(btnPermitir);
       
        // ---------------- BOTAO Excluir-----//
        btnExcluir = new JButton("Excluir");
       btnExcluir.setBounds(100, 185, 85, 25);       
       btnExcluir.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelPrincipal.add(btnExcluir);
       
       
        // ----------------TODOS---------//
        cbTodos = new JCheckBox("Todos");
       cbTodos.setBounds(210, 185, 85, 25);       
       cbTodos.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelPrincipal.add(cbTodos);
        
       
         // ---------------- BOTAO FECHAR-----//
        btnFechar = new JButton("Fechar");
       btnFechar.setBounds(100, 395, 85, 25);       
       btnFechar.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelPrincipal.add(btnFechar);
        
        criarTabela();
        criarTabelaPermitidos();
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

        modelo.addColumn("Código");
        modelo.addColumn("Funcionário");
     

        tblFucionario = new JTable();
        tblFucionario.setModel(modelo);
        tblFucionario.getColumnModel().getColumn(0).setPreferredWidth(60);
        tblFucionario.getColumnModel().getColumn(1).setPreferredWidth(237);
        

        tblFucionario.getTableHeader().setResizingAllowed(false);
        tblFucionario.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblFucionario.getTableHeader();
        cabecalho.setFont(new Font("Arial", 1, 11));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblFucionario.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblFucionario.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        

        tblFucionario.setFont(new Font("Arial", 0, 11));

        scrollTable = new JScrollPane(tblFucionario,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(10, 30, 300, 150);
        tblFucionario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelPrincipal.add(scrollTable);
    }
     
     
     private void criarTabelaPermitidos() {
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        modelo.addColumn("Código");
        modelo.addColumn("Funcionário");
     

        tblFucionario = new JTable();
        tblFucionario.setModel(modelo);
        tblFucionario.getColumnModel().getColumn(0).setPreferredWidth(60);
        tblFucionario.getColumnModel().getColumn(1).setPreferredWidth(237);
        

        tblFucionario.getTableHeader().setResizingAllowed(false);
        tblFucionario.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblFucionario.getTableHeader();
        cabecalho.setFont(new Font("Arial", 1, 11));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblFucionario.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblFucionario.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        

        tblFucionario.setFont(new Font("Arial", 0, 11));

        scrollTable = new JScrollPane(tblFucionario,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(10, 240, 300, 150);
        tblFucionario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelPrincipal.add(scrollTable);
    }
    
}