/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Font;
import java.text.ParseException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Patrik
 */
public class CadastroEstado {
    
    private JFrame janela;
    private JPanel painelPrincipal;
    private JLabel lblCodigo, lblEstado, lblNome, lblICMSInterna, lblST, lblICMSEstadual, lblFundo,a;
    private JTextField txtCodigo, txtEstado,txtNome, txtICMSInterna, txtST, txtICMSEstadual,txtFundo;
    private JButton btnGravar, btnCancelar;
    
    
   
    
    
    public void desenharTela() throws ParseException {  
        janela = new JFrame("Cadastro de Estados");
        janela.setSize(375, 375);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        
             

               

        
        
        
        

        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(350, 330);
        painelPrincipal.setLocation(7, 5);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
    
    
         //---------------CODIGO-----------------//
        lblCodigo = new JLabel("Código ");
        lblCodigo.setBounds(10, 20, 60, 22);
        painelPrincipal.add(lblCodigo);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(10, 40, 60, 22);
        txtCodigo.setEditable(false);
        painelPrincipal.add(txtCodigo);
        
        
        
          //---------------CODIGO-----------------//
        lblEstado = new JLabel("Estado ");
        lblEstado.setBounds(10, 70, 120, 22);
        painelPrincipal.add(lblEstado);

        txtEstado = new JTextField();
        txtEstado.setBounds(10, 90, 100, 22);
        painelPrincipal.add(txtEstado);
        
        
         //---------------CODIGO-----------------//
        lblNome = new JLabel("Nome ");
        lblNome.setBounds(10, 120, 100, 22);
        painelPrincipal.add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(10, 140, 320, 22);
        painelPrincipal.add(txtNome);
        
        
      
        
        
        
        
        
        
         //---------------CODIGO-----------------//
        lblICMSInterna = new JLabel("Alíq. ICMS Interna ");
        lblICMSInterna.setBounds(10, 170, 200, 22);
        painelPrincipal.add(lblICMSInterna);

        txtICMSInterna =new JTextField();
        txtICMSInterna.setBounds(10, 190, 130, 22);
        painelPrincipal.add(txtICMSInterna);
         
        a = new JLabel(" % ");
        a.setBounds(140, 190, 20, 22);
        painelPrincipal.add(a);
        
        
        
         //---------------CODIGO-----------------//
        lblST = new JLabel("Margem ST (IVA)");
        lblST.setBounds(10, 220, 200, 22);
        painelPrincipal.add(lblST);

        txtST =new JTextField();
        txtST.setBounds(10, 240, 130, 22);
        painelPrincipal.add(txtST);
        
          a = new JLabel(" % ");
        a.setBounds(140, 240, 20, 22);
        painelPrincipal.add(a);
        
        
         //---------------CODIGO-----------------//
        lblICMSEstadual = new JLabel("Alíq. ICMS Interestadual ");
        lblICMSEstadual.setBounds(180, 170, 200, 22);
        painelPrincipal.add(lblICMSEstadual);

        txtICMSEstadual =new JTextField();
        txtICMSEstadual.setBounds(180, 190, 130, 22);
        painelPrincipal.add(txtICMSEstadual);
        
         a = new JLabel(" % ");
        a.setBounds(310, 190, 20, 22);
        painelPrincipal.add(a);
        
        
        
         //---------------CODIGO-----------------//
        lblFundo = new JLabel("Fundo Combate Pobreza");
        lblFundo.setBounds(180, 220, 200, 22);
        painelPrincipal.add(lblFundo);

        txtFundo =new JTextField();
        txtFundo.setBounds(180, 240, 130, 22);
        painelPrincipal.add(txtFundo);

        a = new JLabel(" % ");
        a.setBounds(310, 240, 20, 22);
        painelPrincipal.add(a);
        
        
          //-------------------------------------------------------------------------------------------// 
        btnGravar = new JButton("Gravar");
       btnGravar.setBounds(50, 290, 100, 35);       
       btnGravar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));      
       btnGravar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnGravar.setFont(new Font("Arial", 1, 13));
        
       painelPrincipal.add(btnGravar);
       
       
        //-------------------------------------------------------------------------------------------// 
        btnCancelar = new JButton("Cancelar");
       btnCancelar.setBounds(180, 290, 100, 35);       
       btnCancelar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));    
       btnCancelar.setFont(new Font("Arial", 1, 13));
       btnCancelar.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelPrincipal.add(btnCancelar);
   //-------------------------------------------------------------------------------------------// 
        
    janela.add(painelPrincipal);
    janela.setVisible(true);

        
        
        
    }
    
} 
    
    
    
    
    
    

