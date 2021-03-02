
package view;

import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class CadTabela_Operacional {
    
    
     private JFrame janela;
    private JPanel painelPrincipal;
    private JTable tblEstoque;
    private JScrollPane scrollTable;
    private DefaultTableModel modelo;
    private JButton btnNovo,btnAlterar,btnExcluir,btnSair;
    
    
     public void desenharTela() {

        janela = new JFrame("Operacional");
        janela.setSize(435, 350);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);

        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(420, 310);
        painelPrincipal.setLocation(5, 5);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        
        
        
       // ---------------- BOTAO NOVO----//
       btnNovo = new JButton("Novo");
       btnNovo.setBounds(320, 20, 90, 30);       
       btnNovo.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/incluir.png"));
       btnNovo.setFont(new Font("Arial", 1, 13));
       btnNovo.setHorizontalTextPosition(SwingConstants.RIGHT);
       
        btnNovo.addActionListener((java.awt.event.ActionEvent evt)->{
            
        });
        
       painelPrincipal.add(btnNovo);
        
          // ---------------- BOTAO ALTERAR-----//
       btnAlterar = new JButton("Alterar");
       btnAlterar.setBounds(320, 55, 90, 30);       
       btnAlterar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/alterar2.png"));
       btnAlterar.setFont(new Font("Arial", 1, 13));
       btnAlterar.setHorizontalTextPosition(SwingConstants.RIGHT);
       
        
       painelPrincipal.add(btnAlterar);
       
       
        // ---------------- BOTAO EXCLUIR-----//
       btnExcluir = new JButton("Excluir");
       btnExcluir.setBounds(320, 90, 90, 30);       
       btnExcluir.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/excluir2.png"));
       btnExcluir.setFont(new Font("Arial", 1, 13));
       btnExcluir.setHorizontalTextPosition(SwingConstants.RIGHT);
       painelPrincipal.add(btnExcluir);
        
         // ---------------- BOTAO SAIR-----//
       btnSair = new JButton("Sair");
       btnSair.setBounds(320, 125, 90, 30);       
       btnSair.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/sair.png"));
       btnSair.setFont(new Font("Arial", 1, 13));
       btnSair.setHorizontalTextPosition(SwingConstants.RIGHT);
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

        modelo.addColumn("Ano");
        modelo.addColumn("Mês");
        modelo.addColumn("Operacional");
     

        tblEstoque = new JTable();
        tblEstoque.setModel(modelo);
        tblEstoque.getColumnModel().getColumn(0).setPreferredWidth(80);
        tblEstoque.getColumnModel().getColumn(1).setPreferredWidth(80);
        tblEstoque.getColumnModel().getColumn(2).setPreferredWidth(136);
        

        tblEstoque.getTableHeader().setResizingAllowed(false);
        tblEstoque.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblEstoque.getTableHeader();
        cabecalho.setFont(new Font("Arial", 1, 11));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblEstoque.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblEstoque.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        tblEstoque.getColumnModel().getColumn(2).setCellRenderer(centralizaColunas);
        

        tblEstoque.setFont(new Font("Arial", 0, 11));

        scrollTable = new JScrollPane(tblEstoque,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(10, 20, 300, 280);
        tblEstoque.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelPrincipal.add(scrollTable);
    }
    
}
