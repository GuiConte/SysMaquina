
package view;

import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
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


public class CadTabela_Contas {
    
     private JFrame janela, janelaNovo;
    private JPanel painelPrincipal, painelNovo;
    private JTable tblContas;
    private JScrollPane scrollTable;
    private DefaultTableModel modelo;
    private JButton btnNovo,btnAlterar,btnExcluir,btnSair, btnPermissoes;
    
     private JLabel lblCodigo, lblDescricao, lblAgencia, lblConta,lblBanco;
    private JTextField txtCodigo, txtDescricao, txtAgencia, txtConta;
    private JComboBox cbConta;
    private JButton btnGravar,btnCancelar, btnPermissoesNovo;
    
    
     public void desenharTela() {

        janela = new JFrame("Cadastro de Contas");
        janela.setSize(450, 350);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);

        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(430, 310);
        painelPrincipal.setLocation(5, 5);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        
        
      // ---------------- BOTAO NOVO----//
       btnNovo = new JButton("Novo");
       btnNovo.setBounds(312, 20, 115, 30);       
       btnNovo.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/incluir.png"));
       btnNovo.setFont(new Font("Arial", 1, 13));
       btnNovo.setHorizontalTextPosition(SwingConstants.RIGHT);
       
        btnNovo.addActionListener((java.awt.event.ActionEvent evt)->{
             desenharTelaNovo();
        });
        
       painelPrincipal.add(btnNovo);
        
          // ---------------- BOTAO ALTERAR-----//
       btnAlterar = new JButton("Alterar");
       btnAlterar.setBounds(312, 55, 115, 30);       
       btnAlterar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/alterar2.png"));
       btnAlterar.setFont(new Font("Arial", 1, 13));
       btnAlterar.setHorizontalTextPosition(SwingConstants.RIGHT);
       
        
       painelPrincipal.add(btnAlterar);
       
       
        // ---------------- BOTAO EXCLUIR-----//
       btnExcluir = new JButton("Excluir");
       btnExcluir.setBounds(312, 90, 115, 30);       
       btnExcluir.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/excluir2.png"));
       btnExcluir.setFont(new Font("Arial", 1, 13));
       btnExcluir.setHorizontalTextPosition(SwingConstants.RIGHT);
       painelPrincipal.add(btnExcluir);
        
         // ---------------- BOTAO SAIR-----//
       btnSair = new JButton("Sair");
       btnSair.setBounds(312, 125, 115, 30);       
       btnSair.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/sair.png"));
       btnSair.setFont(new Font("Arial", 1, 13));
       btnSair.setHorizontalTextPosition(SwingConstants.RIGHT);
       btnSair.addActionListener((java.awt.event.ActionEvent evt) -> {  
           janela.dispose();
        });
       painelPrincipal.add(btnSair);
       
       
       // ---------------- BOTAO PERMISSOES-----//
       btnPermissoes = new JButton("Permissões");
       btnPermissoes.setBounds(312, 160, 115, 30);       
       btnPermissoes.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/permissao.png"));
       btnPermissoes.setFont(new Font("Arial", 1, 13));
       btnPermissoes.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnPermissoes.addActionListener((java.awt.event.ActionEvent evt)->{
             CadastroPermissoesConta cadPermissoes = new CadastroPermissoesConta();
             cadPermissoes.desenharTela();   
           
        });
       painelPrincipal.add(btnPermissoes);
       
        
        
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

        modelo.addColumn("Código");
        modelo.addColumn("Descrição");
     

        tblContas = new JTable();
        tblContas.setModel(modelo);
        tblContas.getColumnModel().getColumn(0).setPreferredWidth(60);
        tblContas.getColumnModel().getColumn(1).setPreferredWidth(237);
        

        tblContas.getTableHeader().setResizingAllowed(false);
        tblContas.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblContas.getTableHeader();
        cabecalho.setFont(new Font("Arial", 1, 11));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblContas.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblContas.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        

        tblContas.setFont(new Font("Arial", 0, 11));

        scrollTable = new JScrollPane(tblContas,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(10, 20, 300, 280);
        tblContas.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelPrincipal.add(scrollTable);
    }
    
     public void desenharTelaNovo(){
        
        
        janelaNovo = new JFrame("");
        janelaNovo.setSize(300,255);
        janelaNovo.setLayout(null);
        janelaNovo.setLocationRelativeTo(null);
        
        
         //-------------- CRIANDO PAINEL --------------------//
         painelNovo = new JPanel();
        painelNovo.setLayout(null);
        painelNovo.setBounds(5,05,280,210);
        painelNovo.setBorder(BorderFactory.createTitledBorder(""));
        
        
        
         //---------------CODIGO-----------------//
         
        lblCodigo = new JLabel("Código ");
        lblCodigo.setBounds(20, 10, 60, 22);
        painelNovo.add(lblCodigo);
        
        txtCodigo = new JTextField();
        txtCodigo.setBounds(20, 30, 60, 22);
        txtCodigo.setEditable(false);
        painelNovo.add(txtCodigo);
        
         //---------------Categoria-----------------//
         
        lblDescricao = new JLabel("Descrição ");
        lblDescricao.setBounds(90, 10, 180, 22);
        painelNovo.add(lblDescricao);
        
        txtDescricao = new JTextField();
        txtDescricao.setBounds(90, 30, 180, 22);
        painelNovo.add(txtDescricao);
        
        
        //---------------Categoria-----------------//
         
        lblAgencia = new JLabel("N° Agência ");
        lblAgencia.setBounds(20, 60, 100, 22);
        painelNovo.add(lblAgencia);
        
        txtAgencia = new JTextField();
        txtAgencia.setBounds(20, 80, 100, 22);
        painelNovo.add(txtAgencia);
        
        
        //---------------Categoria-----------------//
         
        lblConta = new JLabel("N° Conta ");
        lblConta.setBounds(140, 60, 180, 22);
        painelNovo.add(lblConta);
        
        txtConta = new JTextField();
        txtConta.setBounds(140, 80, 130, 22);
        painelNovo.add(txtConta);
        
        
           //---------------Categoria-----------------//
         
        lblBanco = new JLabel("Banco ");
        lblBanco.setBounds(20, 110, 180, 22);
        painelNovo.add(lblBanco);
        
        cbConta = new JComboBox();
         cbConta.setBounds(20, 130, 250, 22);
        painelNovo.add(cbConta);
        
       
        
        
        
        
        
        // ---------------- BOTAO GRAVAR-----//
        btnGravar = new JButton("Gravar");
       btnGravar.setBounds(40, 170, 90, 30);       
       btnGravar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));
       btnGravar.setFont(new Font("Arial", 1, 13));
       btnGravar.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelNovo.add(btnGravar);
        
          // ---------------- BOTAO CANCELAR-----//
       btnCancelar = new JButton("Cancelar");
       btnCancelar.setBounds(140, 170, 90, 30);       
       btnCancelar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));
       btnCancelar.setFont(new Font("Arial", 1, 13));
       btnCancelar.setHorizontalTextPosition(SwingConstants.RIGHT);
       btnCancelar.addActionListener((java.awt.event.ActionEvent evt) -> {  
           janelaNovo.dispose();
       });
       
       
       painelNovo.add(btnCancelar);
       
     
        janelaNovo.add(painelNovo);
        janelaNovo.setVisible(true); 
    }
    
}
