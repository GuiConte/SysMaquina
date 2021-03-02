
package view;

import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class RelatorioProduto {
    
    private JFrame janela;
    private JPanel painelPrincipal, painelSelecao,painelImprimir;
    private  JLabel lblInicial, lblFinal;
    private JTextField txtInicial, txtFinal;
    private JButton btnVisualizar, btnSair;
    private ButtonGroup groupPesquisa;
    private JRadioButton rdCodigo,rdNome;
    private JCheckBox cbImprimir;
    
    
    public void desenharTela() {

        janela = new JFrame("Relatório de Produto(s)");
        janela.setSize(310, 250);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);

        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(290, 210);
        painelPrincipal.setLocation(7, 5);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        
        
        
       //-----------PAINEL SELECAO--------------// 
        painelSelecao = new JPanel();
        painelSelecao.setLayout(null);
        painelSelecao.setSize(100, 100);
        painelSelecao.setLocation(15, 10);
        painelSelecao.setBorder(BorderFactory.createTitledBorder("Seleção"));
        
        rdCodigo = new JRadioButton("Codigo");
        rdCodigo.setBounds(12, 30, 70, 16);
        rdCodigo.setFont(new Font("Arial", 0, 12));
        painelSelecao.add(rdCodigo);
        
        rdNome = new JRadioButton("Nome");
        rdNome.setBounds(12, 60, 70, 16);
        rdNome.setFont(new Font("Arial", 0, 12));
        painelSelecao.add(rdNome);
        
        groupPesquisa = new ButtonGroup();
        groupPesquisa.add(rdCodigo);
        groupPesquisa.add(rdNome);
        
         painelPrincipal.add(painelSelecao);
         
         
         
         
         lblInicial = new JLabel("Inicial");
        lblInicial.setBounds(140, 15, 50, 23);
        painelPrincipal.add(lblInicial);
         
        
        
        txtInicial = new JTextField();
        txtInicial.setBounds(140, 35, 140, 23);
        painelPrincipal.add(txtInicial);
        
        
        
          
         lblFinal = new JLabel("Final");
        lblFinal.setBounds(140, 60, 50, 23);
        painelPrincipal.add(lblFinal);
         
        
        
        txtFinal = new JTextField();
        txtFinal.setBounds(140, 80, 140, 23);
        painelPrincipal.add(txtFinal);
        
         
        
        
         painelImprimir = new JPanel();
        painelImprimir.setLayout(null);
        painelImprimir.setSize(265, 40);
        painelImprimir.setLocation(15, 120);
        painelImprimir.setBorder(BorderFactory.createTitledBorder(""));
        painelPrincipal.add(painelImprimir);
        
        
        cbImprimir = new JCheckBox("Imprimir Todos os Produtos");
        cbImprimir.setBounds(5, 7, 190, 23);
        painelImprimir.add(cbImprimir);
        
          
        // ---------------- BOTAO VISUALIZAR-----//
       btnVisualizar = new JButton("Visualizar");
       btnVisualizar.setBounds(35, 175, 95, 30);       
      btnVisualizar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/imprimir.png"));
       btnVisualizar.setHorizontalTextPosition(SwingConstants.RIGHT);
       btnVisualizar.addActionListener((java.awt.event.ActionEvent evt) -> {  
          
        });
        
       painelPrincipal.add(btnVisualizar);
       
       
         // ---------------- BOTAO SAIR-----//
       btnSair = new JButton("Sair");
       btnSair.setBounds(145, 175, 95, 30);       
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
