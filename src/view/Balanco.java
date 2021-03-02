
package view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Balanco {
    
    private JFrame janela;
    private JPanel painelPrincipal;
    private JLabel lblDataInicio, lblDataFinal, lblBalanco;
    private JTextField txtDataInicio, txtDataFinal;
    private JButton btnVisualizar, btnSair;
    
    
    
    public void desenharTela() {  
        janela = new JFrame("Balanço");
        janela.setSize(285, 205);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        
        
        
        

        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(260, 160);
        painelPrincipal.setLocation(7, 5);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        
        
           lblBalanco = new JLabel("BALANÇO ");
        lblBalanco.setBounds(90, 20, 150,22);
        lblBalanco.setFont(new Font("Arial", 1, 20));
        lblBalanco.setForeground(Color.BLUE);
        painelPrincipal.add(lblBalanco);
        
 //--------------------------------------------------------------------//
 
       lblDataInicio = new JLabel("Data Inicial: ");
        lblDataInicio.setBounds(50, 60, 150,22);       
        painelPrincipal.add(lblDataInicio);
        
        txtDataInicio = new JTextField();
        txtDataInicio.setBounds(50, 80, 80,22);       
        painelPrincipal.add(txtDataInicio);
        
        
        //--------------------------------------------------------------------//
 
       lblDataFinal = new JLabel("Data Final: ");
        lblDataFinal.setBounds(140, 60, 150,22);       
        painelPrincipal.add(lblDataFinal);
        
        txtDataFinal = new JTextField();
        txtDataFinal.setBounds(140, 80, 80,22);       
        painelPrincipal.add(txtDataFinal);
    
        //-------------------------------------------------------------------------------------------// 
        btnVisualizar = new JButton("Visualizar");
       btnVisualizar.setBounds(25, 120, 105, 30);       
       btnVisualizar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/visualizar.png"));    
       btnVisualizar.setFont(new Font("Arial", 1, 13));
       btnVisualizar.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelPrincipal.add(btnVisualizar);
   //-------------------------------------------------------------------------------------------// 
   
   
   //-------------------------------------------------------------------------------------------// 
        btnSair = new JButton("Sair");
       btnSair.setBounds(140, 120, 105, 30);       
       btnSair.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/sair.png"));      
       btnSair.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnSair.setFont(new Font("Arial", 1, 13));
        btnSair.addActionListener((java.awt.event.ActionEvent evt) -> {
            janela.dispose();
        });
        
       painelPrincipal.add(btnSair);
   //-------------------------------------------------------------------------------------------// 
    
    
    janela.add(painelPrincipal);
    janela.setVisible(true);
}
}