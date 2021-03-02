
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
import javax.swing.SwingConstants;


public class RelatorioEstoque {
    
    
    
      private JFrame janela;
    private JPanel painelPrincipal, painelEstoque;
    private ButtonGroup groupPesquisa;
    private JRadioButton rdEstoqueGeral,rdEstoque, rdEstoqueBaixo;
    private JLabel lblEstoque;
    private JComboBox cbEstoque;
     private JButton  btnVisualizar, btnSair;
    
    
     public void desenharTela() {

        janela = new JFrame("Relatório Estoque");
        janela.setSize(280, 255);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
//------------------------------------------------------------------//
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(230, 215);
        painelPrincipal.setLocation(23, 5);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        
        
       //------------------------------------------------------------------// 
        
        painelEstoque = new JPanel();
        painelEstoque.setLayout(null);
        painelEstoque.setSize(160, 90);
        painelEstoque.setLocation(35, 20);
        painelEstoque.setBorder(BorderFactory.createTitledBorder(""));
        painelPrincipal.add(painelEstoque);
    
       
         //------------------------------------------------------------------// 
         rdEstoqueGeral = new JRadioButton("Estoque Geral");
        rdEstoqueGeral.setBounds(5, 10, 100, 16);
        rdEstoqueGeral.setFont(new Font("Arial", 0, 11));
        painelEstoque.add(rdEstoqueGeral);
        
        rdEstoque = new JRadioButton("Estoque <=0");
        rdEstoque.setBounds(5, 35, 150, 16);
        rdEstoque.setFont(new Font("Arial", 0, 11));
        painelEstoque.add(rdEstoque);
        
         rdEstoqueBaixo = new JRadioButton("Estoque Abaixo Minimo");
        rdEstoqueBaixo.setBounds(5, 60, 150, 16);
        rdEstoqueBaixo.setFont(new Font("Arial", 0, 11));
        painelEstoque.add(rdEstoqueBaixo);
        
        groupPesquisa = new ButtonGroup();
        groupPesquisa.add(rdEstoqueGeral);
        groupPesquisa.add(rdEstoque);
        groupPesquisa.add(rdEstoqueBaixo);
        
        
           //------------------------------------------------------------------//
        lblEstoque = new JLabel("Estoque ");
        lblEstoque.setBounds(35, 120, 120, 22);
        painelPrincipal.add(lblEstoque);
        
        cbEstoque = new JComboBox();
        cbEstoque.setBounds(35, 140, 170, 22);
        painelPrincipal.add(cbEstoque);
        
        
        
        //------------------------------------------------------------------// 
       
          // ---------------- BOTAO-----//
       btnVisualizar = new JButton("Visualizar");
       btnVisualizar.setBounds(20, 180, 95, 30);       
       btnVisualizar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/imprimir.png"));
       btnVisualizar.setHorizontalTextPosition(SwingConstants.RIGHT);
       btnVisualizar.addActionListener((java.awt.event.ActionEvent evt) -> {  
          
        });
        
       painelPrincipal.add(btnVisualizar);
       
         // ---------------- BOTAO SAIR-----//
       btnSair = new JButton("Sair");
       btnSair.setBounds(130, 180, 95, 30);       
       btnSair.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/sair.png"));
        btnSair.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnSair.addActionListener((java.awt.event.ActionEvent evt) -> {  
           janela.dispose();
        });

       painelPrincipal.add(btnSair);
        
        
   janela.add(painelPrincipal);
   janela.setVisible(true);
   }
    
}
