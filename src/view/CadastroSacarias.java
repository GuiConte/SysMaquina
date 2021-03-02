
package view;

import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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


public class CadastroSacarias {
    
    private JFrame janela;
    private JPanel  painelPrincipal;
    private JLabel lblCodigo,lblDescricao,lblCusto,lblPreco,lblKG;
    private JTextField txtCodigo, txtDescricao,txtCusto,txtPreco,txtKG;
    private DefaultTableModel modelo;
    private JTable tblSacarias;
    private JScrollPane scrollTable;
    private JButton  btnGravar,btnCancelar,btnSair; 
 
    
    
    public void desenharTela(){
        
        
        janela = new JFrame("Cadastro de Clientes Sacarias");        
        janela.setSize(490,345);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        
        
        
         //-------------- CRIANDO PAINEL --------------------//
         painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setBounds(5,05,470,300);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        
        
        
         //---------------CODIGO-----------------//
         
        lblCodigo = new JLabel("Código ");
        lblCodigo.setBounds(20, 10, 60, 22);
        painelPrincipal.add(lblCodigo);
        
        txtCodigo = new JTextField();
        txtCodigo.setBounds(20, 30, 60, 22);
        painelPrincipal.add(txtCodigo);
        
        
        //---------------DESCRICAO-----------------//
         
        lblDescricao = new JLabel("Descrição ");
        lblDescricao.setBounds(20, 50, 100, 22);
        painelPrincipal.add(lblDescricao);
        
        txtDescricao = new JTextField();
        txtDescricao.setBounds(20, 70, 340, 22);
        painelPrincipal.add(txtDescricao);
        
         //---------------Custo-----------------//
         
        lblCusto = new JLabel("Custo ");
        lblCusto.setBounds(20, 90, 100, 22);
        painelPrincipal.add(lblCusto);
        
        txtCusto = new JTextField();
        txtCusto.setBounds(20, 110, 100, 22);
        painelPrincipal.add(txtCusto);
        
        //---------------Preço-----------------//
         
        lblPreco = new JLabel("Preço ");
        lblPreco.setBounds(140, 90, 100, 22);
        painelPrincipal.add(lblPreco);
        
        txtPreco = new JTextField();
        txtPreco.setBounds(140, 110, 100, 22);
        painelPrincipal.add(txtPreco);
        
        //---------------KG-----------------//
         
        lblKG = new JLabel("KG ");
        lblKG.setBounds(260, 90, 100, 22);
        painelPrincipal.add(lblKG);
        
        txtKG = new JTextField();
        txtKG.setBounds(260, 110, 100, 22);
        painelPrincipal.add(txtKG);
        
        
        // ---------------- BOTAO GRAVAR-----//
        btnGravar = new JButton("Gravar");
       btnGravar.setBounds(370, 190, 90, 30);       
         btnGravar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));
        btnGravar.setFont(new Font("Arial", 1, 13));
        btnGravar.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelPrincipal.add(btnGravar);
        
          // ---------------- BOTAO CANCELAR-----//
       btnCancelar = new JButton("Cancelar");
       btnCancelar.setBounds(370, 225, 90, 30);       
       btnCancelar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));
        btnCancelar.setFont(new Font("Arial", 1, 13));
        btnCancelar.setHorizontalTextPosition(SwingConstants.RIGHT);
       painelPrincipal.add(btnCancelar);
        
         // ---------------- BOTAO SAIR-----//
       btnSair = new JButton("Sair");
       btnSair.setBounds(370, 260, 90, 30);       
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

        modelo.addColumn("Maquina");
        modelo.addColumn("Estoque");
        
    

        tblSacarias = new JTable();
        tblSacarias.setModel(modelo);
        tblSacarias.getColumnModel().getColumn(0).setPreferredWidth(250);
        tblSacarias.getColumnModel().getColumn(1).setPreferredWidth(100);
        
        

        tblSacarias.getTableHeader().setResizingAllowed(false);
        tblSacarias.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblSacarias.getTableHeader();
        cabecalho.setFont(new Font("Arial", 1, 11));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.LEFT);
        tblSacarias.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblSacarias.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        

        tblSacarias.setFont(new Font("Arial", 0, 11));

        scrollTable = new JScrollPane(tblSacarias,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(10, 140, 350, 150);
        tblSacarias.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelPrincipal.add(scrollTable);
}
}