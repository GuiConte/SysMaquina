
package view;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
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
import model.HistoricoDespesaModel;


public class CadTabela_HistoricoDespesa {
    
    HistoricoDespesaModel descricao;
    
    
      private JFrame janela, janelaNovo;
    private JPanel painelPrincipal, painelNovo;
    private JTable tblHistorico;
    private JScrollPane scrollTable;
    private DefaultTableModel modelo;
    private JButton btnNovo,btnAlterar,btnExcluir,btnSair;
    
     private JLabel lblCodigo, lblDescricao;
    private JTextField txtCodigo, txtDescricao;
    private JButton btnGravar,btnCancelar;
     private JCheckBox cbAtivo;
     private String ativo;
    
     public void desenharTela() {

        janela = new JFrame("Histórico de Despesas");
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
             desenharTelaNovo();
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

        modelo.addColumn("Código");
        modelo.addColumn("Descrição");
         modelo.addColumn("Ativo");
     

        tblHistorico = new JTable();
        tblHistorico.setModel(modelo);
        tblHistorico.getColumnModel().getColumn(0).setPreferredWidth(60);
        tblHistorico.getColumnModel().getColumn(1).setPreferredWidth(196);
        tblHistorico.getColumnModel().getColumn(2).setPreferredWidth(40);
        

        tblHistorico.getTableHeader().setResizingAllowed(false);
        tblHistorico.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblHistorico.getTableHeader();
        cabecalho.setFont(new Font("Arial", 1, 11));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblHistorico.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblHistorico.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        

        tblHistorico.setFont(new Font("Arial", 0, 11));

        scrollTable = new JScrollPane(tblHistorico,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(10, 20, 300, 280);
        tblHistorico.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelPrincipal.add(scrollTable);
    }
    
     
      public void desenharTelaNovo(){
        
        
        janelaNovo = new JFrame("");
        janelaNovo.setSize(300,165);
        janelaNovo.setLayout(null);
        janelaNovo.setLocationRelativeTo(null);
        
        
         //-------------- CRIANDO PAINEL --------------------//
         painelNovo = new JPanel();
        painelNovo.setLayout(null);
        painelNovo.setBounds(2,05,280,120);
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
        txtDescricao.setBounds(90, 30, 170, 22);
        painelNovo.add(txtDescricao);
        
        //---------------ATIVO-----------------//
         
        cbAtivo = new JCheckBox("Ativa ");
        cbAtivo.setBounds(20, 53, 180, 22);
        painelNovo.add(cbAtivo);
        
       // ---------------- BOTAO GRAVAR-----//
        btnGravar = new JButton("Gravar");
       btnGravar.setBounds(40, 80, 90, 30);       
       btnGravar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));
       btnGravar.setFont(new Font("Arial", 1, 13));
       btnGravar.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelNovo.add(btnGravar);
        
          // ---------------- BOTAO CANCELAR-----//
       btnCancelar = new JButton("Cancelar");
       btnCancelar.setBounds(140, 80, 90, 30);       
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
    
     
        public HistoricoDespesaModel getCadTabela_HistDespesa(){
        
             if (cbAtivo.isSelected()) {
            ativo = "1";
        } else {
            ativo = "0";
        }
           descricao= new HistoricoDespesaModel(txtDescricao.getText(),
           ativo);
           
           
       return descricao;
        }
        
           public void addGravarListener(ActionListener al){
          btnGravar.addActionListener(al);
      } 
               
    } 
     
    

