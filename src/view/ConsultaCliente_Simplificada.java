
package view;

import java.awt.Font;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
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


public class ConsultaCliente_Simplificada {
    
    
     private JFrame janela;
    private JPanel painelPrincipal, painelPequisa;
    private JTable tblCliente;
    private JScrollPane scrollTable;
    private DefaultTableModel modelo;
    private JButton btnCancela,btnOk,btnPrimeiro,btnAnterior,btnProximo,btnUltimo, btnNovo;
    private ButtonGroup groupPesquisa;
    private JRadioButton rdInicio,rdParte;
    private JLabel lblConsulta;
    private JTextField txtConsulta;

    public void desenharTela() {

        janela = new JFrame("Consulta Cliente");        
        janela.setSize(700, 410);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
                


        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(700, 410);
        painelPrincipal.setLocation(0, 0);
        
        criarTabela();     
  //-------------------------------------------------------------------------------//      
        painelPequisa = new JPanel();
        painelPequisa.setLayout(null);
        painelPequisa.setBorder(BorderFactory.createTitledBorder("Pesquisa por:"));
        painelPequisa.setSize(135, 70);
        painelPequisa.setLocation(10, 305);
        
        rdInicio = new JRadioButton("Inicio do Nome");
        rdInicio.setBounds(8, 22, 120, 17);
        rdInicio.setFont(new Font("Arial", 1, 12));
        painelPequisa.add(rdInicio);
  //-------------------------------------------------------------------------------//      
        rdParte = new JRadioButton("Parte do Nome");
        rdParte.setBounds(8, 45, 120, 17);
        rdParte.setFont(new Font("Arial", 1, 12));
        painelPequisa.add(rdParte);
  //-------------------------------------------------------------------------------//      
        groupPesquisa = new ButtonGroup();
        groupPesquisa.add(rdInicio);
        groupPesquisa.add(rdParte);
        
        painelPrincipal.add(painelPequisa);
 //-------------------------------------------------------------------------------//
 
 
        lblConsulta = new JLabel("Nova Consulta:");
        lblConsulta.setBounds(150, 314, 150, 40);
        lblConsulta.setFont(new Font("Arial", 1, 12));
        painelPrincipal.add(lblConsulta);
        
        txtConsulta = new JTextField();
        txtConsulta.setBounds(150, 346, 350, 25);
        painelPrincipal.add(txtConsulta);
 //-------------------------------------------------------------------------------//
 
 
       /* btnPrimeiro = new JButton("|<");
        btnPrimeiro.setBounds(324, 310, 50, 25);
        btnPrimeiro.setFont(new Font("Arial", 0, 8));
        btnPrimeiro.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelPrincipal.add(btnPrimeiro);
 //-------------------------------------------------------------------------------//
 
 
        btnAnterior = new JButton("<");
        btnAnterior.setBounds(374, 310, 50, 25);
        btnAnterior.setFont(new Font("Arial", 0, 8));
        btnAnterior.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelPrincipal.add(btnAnterior);
  //-------------------------------------------------------------------------------//
  
  
        btnProximo = new JButton(">");
        btnProximo.setBounds(424, 310, 50, 25);
        btnProximo.setFont(new Font("Arial", 0, 8));
        btnProximo.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelPrincipal.add(btnProximo);
  //-------------------------------------------------------------------------------//
  
  
        btnUltimo = new JButton(">|");
        btnUltimo.setBounds(474, 310, 50, 25);
        btnUltimo.setFont(new Font("Arial", 0, 8));
        btnUltimo.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelPrincipal.add(btnUltimo);*/
 //-------------------------------------------------------------------------------//
 
 
        btnCancela = new JButton("Cancelar");
        btnCancela.setBounds(600, 340, 80, 30);
        btnCancela.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));       
        btnCancela.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnCancela.setFont(new Font("Arial", 1, 11));
        btnCancela.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelPrincipal.add(btnCancela);
  //-------------------------------------------------------------------------------//
  
  
        btnOk = new JButton("Ok");
        btnOk.setBounds(600, 305, 80, 30);
        btnOk.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));       
        btnOk.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnOk.setFont(new Font("Arial", 1, 11));
        btnOk.addActionListener((java.awt.event.ActionEvent evt)->{
             
        });
        painelPrincipal.add(btnOk);
        
        
          //-------------------------------------------------------------------------------//
  
  
        btnNovo = new JButton("Novo");
        btnNovo.setBounds(510, 342, 70, 30);
        btnNovo.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/incluir.png"));       
        btnNovo.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnNovo.setFont(new Font("Arial", 1, 11));
        btnNovo.addActionListener((java.awt.event.ActionEvent evt)->{
             CadastroCliente cadCliente = new CadastroCliente();
            try {
                cadCliente.desenharTela();
            } catch (ParseException ex) {
                Logger.getLogger(ConsultaCliente_Simplificada.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        painelPrincipal.add(btnNovo);
        
        
        
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
        modelo.addColumn("Cliente");
        modelo.addColumn("Fone");

        tblCliente = new JTable();
        tblCliente.setModel(modelo);
        tblCliente.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(1).setPreferredWidth(350);
        tblCliente.getColumnModel().getColumn(2).setPreferredWidth(220);

        tblCliente.getTableHeader().setResizingAllowed(false);
        tblCliente.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblCliente.getTableHeader();
        cabecalho.setFont(new Font("Arial", 1, 14));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblCliente.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblCliente.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        tblCliente.getColumnModel().getColumn(2).setCellRenderer(centralizaColunas);

        tblCliente.setFont(new Font("Arial", 0, 14));

        scrollTable = new JScrollPane(tblCliente,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(10, 20, 675, 280);
        tblCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelPrincipal.add(scrollTable);
    }
}

    
    
    
    
    

