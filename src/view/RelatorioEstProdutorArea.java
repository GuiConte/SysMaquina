
package view;

import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class RelatorioEstProdutorArea {
   
     private JFrame janela;
    private JPanel painelPrincipal, painelConsolidado;
    private JLabel lblDataInicial, lblDataFinal, lblProdutor, lblCentro, lblEstoque, lblArea;
    private JComboBox cbCentro, cbEstoque, cbProdutor, cbArea;
    private JTextField txtDataInicial, txtDataFinal;
     private ButtonGroup groupPesquisa;
    private JRadioButton rdConsolidado,rdConsolidadoProduto;
    
    private JButton  btnVisualizar, btnSair;
    
     public void desenharTela() {

        janela = new JFrame("Relatório Produtor / Area");
        janela.setSize(415, 255);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
//------------------------------------------------------------------//
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(400, 215);
        painelPrincipal.setLocation(5, 5);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        
        
       //------------------------------------------------------------------// 
        
        painelConsolidado = new JPanel();
        painelConsolidado.setLayout(null);
        painelConsolidado.setSize(160, 50);
        painelConsolidado.setLocation(230, 20);
        painelConsolidado.setBorder(BorderFactory.createTitledBorder(""));
        painelPrincipal.add(painelConsolidado);
        
       //------------------------------------------------------------------// 
         rdConsolidado = new JRadioButton("Consolidado");
        rdConsolidado.setBounds(5, 10, 100, 13);
        rdConsolidado.setFont(new Font("Arial", 0, 11));
        painelConsolidado.add(rdConsolidado);
        
        rdConsolidadoProduto = new JRadioButton("Consolidado por Produto");
        rdConsolidadoProduto.setBounds(5, 30, 150, 13);
        rdConsolidadoProduto.setFont(new Font("Arial", 0, 11));
        painelConsolidado.add(rdConsolidadoProduto);
        
        groupPesquisa = new ButtonGroup();
        groupPesquisa.add(rdConsolidado);
        groupPesquisa.add(rdConsolidadoProduto);
        
        
        //------------------------------------------------------------------//
         lblDataInicial = new JLabel("Data Inicial ");
        lblDataInicial.setBounds(10, 20, 100, 22);
        painelPrincipal.add(lblDataInicial);
        
        txtDataInicial = new JTextField();
        txtDataInicial.setBounds(10, 40, 90, 22);
        painelPrincipal.add(txtDataInicial);
        
        //------------------------------------------------------------------//
        
        lblDataFinal = new JLabel("Data Final ");
        lblDataFinal.setBounds(160, 20, 120, 22);
        painelPrincipal.add(lblDataFinal);
        
        txtDataFinal = new JTextField();
        txtDataFinal.setBounds(130, 40, 90, 22);
        painelPrincipal.add(txtDataFinal);
        
        //------------------------------------------------------------------//
        
         lblCentro = new JLabel("Centro ");
        lblCentro.setBounds(10, 70, 120, 22);
        painelPrincipal.add(lblCentro);
        
        cbCentro = new JComboBox();
        cbCentro.setBounds(10, 90, 180, 22);
        painelPrincipal.add(cbCentro);
        
        //------------------------------------------------------------------//
        lblEstoque = new JLabel("Estoque ");
        lblEstoque.setBounds(210, 70, 120, 22);
        painelPrincipal.add(lblEstoque);
        
        cbEstoque = new JComboBox();
        cbEstoque.setBounds(210, 90, 180, 22);
        painelPrincipal.add(cbEstoque);
      //------------------------------------------------------------------//  
        
         
        lblProdutor = new JLabel("Produtor ");
        lblProdutor.setBounds(10, 120, 120, 22);
        painelPrincipal.add(lblProdutor);
        
        cbProdutor = new JComboBox();
        cbProdutor.setBounds(10, 140, 180, 22);
        painelPrincipal.add(cbProdutor);
       //------------------------------------------------------------------// 
        
        lblArea = new JLabel("Area ");
        lblArea.setBounds(210, 120, 120, 22);
        painelPrincipal.add(lblArea);
        
        cbArea = new JComboBox();
        cbArea.setBounds(210, 140, 180, 22);
        painelPrincipal.add(cbArea);
     //------------------------------------------------------------------// 
       
          // ---------------- BOTAO-----//
       btnVisualizar = new JButton("Visualizar");
       btnVisualizar.setBounds(80, 180, 90, 25);       
       btnVisualizar.setHorizontalTextPosition(SwingConstants.RIGHT); 
       btnVisualizar.addActionListener((java.awt.event.ActionEvent evt) -> { 
           
                        
        });       
       painelPrincipal.add(btnVisualizar);
       
       
         // ---------------- BOTAO SAIR-----//
       btnSair = new JButton("Sair");
       btnSair.setBounds(200, 180, 90, 25);       
       btnSair.setHorizontalTextPosition(SwingConstants.RIGHT); 
       btnSair.addActionListener((java.awt.event.ActionEvent evt) -> { 
           
                        janela.dispose();
        });       
       painelPrincipal.add(btnSair);
        
    
   janela.add(painelPrincipal);
   janela.setVisible(true);
   }
    
    
    
}
