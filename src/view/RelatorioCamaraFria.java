/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Patrik
 */
public class RelatorioCamaraFria {
     
    private JFrame janela;
    private JPanel painelPrincipal;
    private JButton btnVisualizar, btnSair;
    
    
    
     public void desenharTela() {

        janela = new JFrame("Relatório Camara Fria");
        janela.setSize(280, 125);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        

        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(260, 80);
        painelPrincipal.setLocation(7, 5);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));

        
        
      // ---------------- BOTAO VISUALIZAR-----//
      btnVisualizar = new JButton("Visualizar");
       btnVisualizar.setBounds(20, 30, 105, 35);       
        btnVisualizar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/imprimir.png"));
        btnVisualizar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnVisualizar.setFont(new Font("Arial", 1, 13));
        btnVisualizar.addActionListener((java.awt.event.ActionEvent evt)->{
            
        });
        painelPrincipal.add(btnVisualizar);
        
        //------------------------------------------------------//
        
           // ---------------- BOTAO SAIR-----//
       btnSair = new JButton("Sair");
       btnSair.setBounds(130, 30, 105, 35);       
       btnSair.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/sair.png"));
        btnSair.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnSair.setFont(new Font("Arial", 1, 13));
       btnSair.addActionListener((java.awt.event.ActionEvent evt) -> { 
           
                        janela.dispose();
        });       
       painelPrincipal.add(btnSair);
        
    
    janela.add(painelPrincipal);
    janela.setVisible(true);
    
    
     }
    
}
