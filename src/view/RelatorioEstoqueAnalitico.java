
package view;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class RelatorioEstoqueAnalitico {
    
    private JFrame janela;
    private JPanel painelPrincipal;
    private JLabel lblDataInicial, lblDataFinal, lblProduto;
    private JTextField txtDataInicial, txtDataFinal, txtProduto, txtCodProduto;
    private JButton btnConsultaProduto, btnVisualizar, btnSair;
    
     public void desenharTela() {

        janela = new JFrame("Relatório Analitico");
        janela.setSize(325, 210);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);

        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(310, 170);
        painelPrincipal.setLocation(5, 5);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        
        
        
         lblDataInicial = new JLabel("Data Inicial ");
        lblDataInicial.setBounds(10, 20, 100, 22);
        painelPrincipal.add(lblDataInicial);
        
        txtDataInicial = new JTextField();
        txtDataInicial.setBounds(10, 40, 90, 22);
        painelPrincipal.add(txtDataInicial);
        
        
        
        lblDataFinal = new JLabel("Data Final ");
        lblDataFinal.setBounds(160, 20, 120, 22);
        painelPrincipal.add(lblDataFinal);
        
        txtDataFinal = new JTextField();
        txtDataFinal.setBounds(130, 40, 90, 22);
        painelPrincipal.add(txtDataFinal);
        
        
          lblProduto = new JLabel("Produto ");
        lblProduto.setBounds(10, 70, 120, 22);
        painelPrincipal.add(lblProduto);
        
        txtProduto = new JTextField();
        txtProduto.setBounds(10, 90, 230, 22);
        painelPrincipal.add(txtProduto);
        
        
         txtCodProduto = new JTextField();
        txtCodProduto.setBounds(245, 90, 30, 22);
        painelPrincipal.add(txtCodProduto);
        
        
         
          //------------BOTAO PESQUISAR PRODUTO ---------------------//
       
       btnConsultaProduto = new JButton();
       btnConsultaProduto.setBounds(280, 90, 20, 20);       
       btnConsultaProduto.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
       btnConsultaProduto.setToolTipText("Pesquisar Produto");
       btnConsultaProduto.setHorizontalTextPosition(SwingConstants.CENTER);
        
       painelPrincipal.add(btnConsultaProduto);
        
       
       
          // ---------------- BOTAO-----//
       btnVisualizar = new JButton("Visualizar");
       btnVisualizar.setBounds(40, 130, 90, 25);       
       btnVisualizar.setHorizontalTextPosition(SwingConstants.RIGHT); 
       btnVisualizar.addActionListener((java.awt.event.ActionEvent evt) -> { 
           
                        
        });       
       painelPrincipal.add(btnVisualizar);
       
       
         // ---------------- BOTAO SAIR-----//
       btnSair = new JButton("Sair");
       btnSair.setBounds(160, 130, 90, 25);       
       btnSair.setHorizontalTextPosition(SwingConstants.RIGHT); 
       btnSair.addActionListener((java.awt.event.ActionEvent evt) -> { 
           
                        janela.dispose();
        });       
       painelPrincipal.add(btnSair);
        
    
   janela.add(painelPrincipal);
   janela.setVisible(true);
   }
}
