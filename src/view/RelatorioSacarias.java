
package view;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class RelatorioSacarias {
    
    private JPanel painelPrincipal;
    private JComboBox cbEstoque;
    private JTextField txtCodigo;
    private JButton btnVisualizar, btnSair;
    private JLabel lblEstoque;
    private JFrame janela;



public void desenharTela() {

        janela = new JFrame("Relatório Estoque Sacarias");
        janela.setSize(365, 220);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);

        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(350, 180);
        painelPrincipal.setLocation(5, 5);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        
         //---------------ESTOQUE-----------------//
         
        lblEstoque = new JLabel("Estoque ");
        lblEstoque.setBounds(40, 40, 60, 22);
        painelPrincipal.add(lblEstoque);
        
        cbEstoque = new JComboBox();
        cbEstoque.setBounds(40, 60, 200, 22);
        painelPrincipal.add(cbEstoque);
        
         //---------------CODIGO-----------------//
         
        txtCodigo = new JTextField();
        txtCodigo.setBounds(260, 60, 50, 23);
        painelPrincipal.add(txtCodigo);
        
        
         // ---------------- BOTAO VISUALIZAR-----//
       btnVisualizar = new JButton("Visualizar");
       btnVisualizar.setBounds(80, 130, 95, 30);       
       btnVisualizar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/imprimir.png"));
       btnVisualizar.setHorizontalTextPosition(SwingConstants.RIGHT);
       btnVisualizar.addActionListener((java.awt.event.ActionEvent evt) -> {  
          
        });
        
       painelPrincipal.add(btnVisualizar);
       
       
         // ---------------- BOTAO SAIR-----//
       btnSair = new JButton("Sair");
       btnSair.setBounds(180, 130, 95, 30);       
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
