
package view;

import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;


public class FinanceiroResponsabilidade {
    
    
    private JFrame janela;
    private JPanel painelPrincipal, painelTipo;
    private JRadioButton rdCompraBatata,rdCompraCebola, rdVendaBatata, rdVendaCebola, rdVendaDiversas, rdContasPagar;
    private ButtonGroup groupTipo;
    private JButton btnVisualizar;

    
    
     public void desenharTela() {

        janela = new JFrame("Responsabilidade");
        janela.setSize(530, 190);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);


        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(510, 150);
        painelPrincipal.setLocation(7, 5);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        
        
        
          painelTipo = new JPanel();
        painelTipo.setLayout(null);
        painelTipo.setSize(490, 100);
        painelTipo.setLocation(7, 5);
        painelTipo.setBorder(BorderFactory.createTitledBorder("Tipo"));
        painelPrincipal.add(painelTipo);
        
        
        
     //------------------------------------------------------------------------------------//   
        
        rdCompraBatata = new JRadioButton("Compras Batata");
        rdCompraBatata.setBounds(10, 20, 140, 22);
        rdCompraBatata.setFont(new Font("Arial", 0, 13));
        painelTipo.add(rdCompraBatata);
        
        
         rdCompraCebola = new JRadioButton("Compras Cebola");
        rdCompraCebola.setBounds(10, 50, 140, 22);
        rdCompraCebola.setFont(new Font("Arial", 0, 13));
        painelTipo.add(rdCompraCebola);
        
        
       //------------------------------------------------------------------------------------// 
        
         rdVendaBatata = new JRadioButton("Vendas Batata");
        rdVendaBatata.setBounds(180, 20, 140, 22);
        rdVendaBatata.setFont(new Font("Arial", 0, 13));
        painelTipo.add(rdVendaBatata);
        
        
         rdVendaCebola = new JRadioButton("Vendas  Cebola");
        rdVendaCebola.setBounds(180, 50, 140, 22);
        rdVendaCebola.setFont(new Font("Arial", 0, 13));
        painelTipo.add(rdVendaCebola);
        
    //------------------------------------------------------------------------------------//
    
         rdVendaDiversas = new JRadioButton("Vendas Diversas");
        rdVendaDiversas.setBounds(340, 20, 140, 22);
        rdVendaDiversas.setFont(new Font("Arial", 0, 13));
        painelTipo.add(rdVendaDiversas);
        
        
         rdContasPagar = new JRadioButton("Contas a Pagar");
        rdContasPagar.setBounds(340, 50, 140, 22);
        rdContasPagar.setFont(new Font("Arial", 0, 13));
        painelTipo.add(rdContasPagar);
        
        
        
        groupTipo = new ButtonGroup();
        groupTipo.add(rdCompraBatata);
        groupTipo.add(rdCompraCebola);        
        groupTipo.add(rdVendaBatata);
        groupTipo.add(rdVendaCebola);
        groupTipo.add(rdVendaDiversas);
        groupTipo.add(rdContasPagar);
   //------------------------------------------------------------------------------//
   
     // ---------------- BOTAO VISUALIZAR-----//
       btnVisualizar = new JButton("Visualizar");
       btnVisualizar.setBounds(390, 110, 105, 35);       
       btnVisualizar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/visualizar.png"));
        btnVisualizar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnVisualizar.setFont(new Font("Arial", 1, 13));
        btnVisualizar.addActionListener((java.awt.event.ActionEvent evt)->{
            
        });
        painelPrincipal.add(btnVisualizar);
        
        
        
    
    janela.add(painelPrincipal);
    janela.setVisible(true);
    
    
     }
}
