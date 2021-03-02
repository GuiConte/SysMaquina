
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


public class FinanceiroRelatorioClienteLimite {
    
    private JFrame janela;
    private JTable tblCliente;
    private JScrollPane scrollTable;
    private DefaultTableModel modelo;
    private JPanel painelPrincipal;
    private JButton btnVisualizar, btnImprimir;
    
     public void desenharTela() {

        janela = new JFrame("Relatorio Limite Cliente");
        janela.setSize(1015, 390);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);

        

        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(1000, 350);
        painelPrincipal.setLocation(5, 5);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        
          // ---------------- BOTAO VISUALIZAR-----//
        btnVisualizar = new JButton("Visualizar");
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
        painelPrincipal.add(btnImprimir);
        
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

        modelo.addColumn("Cod Cliente");
        modelo.addColumn("Nome Cliente");
        modelo.addColumn("Limite Cred");
        modelo.addColumn("Limite Cred -20%");
        modelo.addColumn("Venda Batata");
        modelo.addColumn("Venda Cebola");
        modelo.addColumn("Cheque");
        modelo.addColumn("Limite Restante");
       

        tblCliente = new JTable();
        tblCliente.setModel(modelo);
        tblCliente.getColumnModel().getColumn(0).setPreferredWidth(80);
        tblCliente.getColumnModel().getColumn(1).setPreferredWidth(300);
        tblCliente.getColumnModel().getColumn(2).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(4).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(5).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(6).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(7).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(7).setPreferredWidth(100);

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
        scrollTable.setBounds(10, 20, 985, 280);
        tblCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelPrincipal.add(scrollTable);
    }
}
