
package view;

import java.awt.Font;
import java.text.ParseException;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;


public class FinanceiroRelatorioMaquinacao {
    
      
    private JFrame janela;
    private JPanel painelPrincipal, painelCliente, painelOrigem, painelBaixa, painelOrdenar;
    private JRadioButton rdMaquinacao,rdLavacao, rdPago, rdReceber, rdEmissao, rdVencimento, rdBaixa;
    private JTextField txtCliente, txtCodCliente;
    private ButtonGroup groupOrigem, groupBaixa ,groupOrdenar;
    private JCheckBox cbCliente;
    private JButton btnVisualizar, btnConsultarCliente, btnSair;
    private JLabel lblDataInicial, lblDataFinal;
     private JFormattedTextField  txtDataInicial, txtDataFinal;
    
    
     public void desenharTela() throws ParseException {

         janela = new JFrame("Financeiro Maquinação - Lavação");
        janela.setSize(485, 385);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        

        

        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(460, 340);
        painelPrincipal.setLocation(7, 5);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        //----------------------------------------------------------------------------------//
        
        
         lblDataInicial = new JLabel("Data Inicial");
        lblDataInicial.setBounds(140, 20, 300, 22);
        painelPrincipal.add(lblDataInicial);
        
         txtDataInicial =new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtDataInicial.setBounds(140, 40, 80, 22);
        painelPrincipal.add(txtDataInicial);
        
        
        
         lblDataFinal = new JLabel("Data Final");
        lblDataFinal.setBounds(240, 20, 300, 22);
        painelPrincipal.add(lblDataFinal);
        
        
          txtDataFinal = new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtDataFinal.setBounds(240, 40, 80, 22);
        painelPrincipal.add(txtDataFinal);
        
        //----------------------------------------------------------------------------//
          painelOrigem = new JPanel();
        painelOrigem.setLayout(null);
        painelOrigem.setSize(140, 130);
        painelOrigem.setLocation(10, 80);
        painelOrigem.setBorder(BorderFactory.createTitledBorder("Origem"));
        painelPrincipal.add(painelOrigem);
        
        
        
     //------------------------------------------------------------------------------------//   
        
        rdMaquinacao = new JRadioButton("Maquinação");
        rdMaquinacao.setBounds(20, 30, 100, 22);
        rdMaquinacao.setFont(new Font("Arial", 0, 13));
        painelOrigem.add(rdMaquinacao);
        
        
         rdLavacao = new JRadioButton("Lavação");
        rdLavacao.setBounds(20, 70, 80, 22);
        rdLavacao.setFont(new Font("Arial", 0, 13));
        painelOrigem.add(rdLavacao);
        
        groupOrigem = new ButtonGroup();
        groupOrigem.add(rdMaquinacao);
        groupOrigem.add(rdLavacao); 
        
        
        //------------------------------------------------------------------------------------//
        
        painelBaixa = new JPanel();
        painelBaixa.setLayout(null);
        painelBaixa.setSize(140, 130);
        painelBaixa.setLocation(160, 80);
        painelBaixa.setBorder(BorderFactory.createTitledBorder("Baixa"));
        painelPrincipal.add(painelBaixa);
        
        
        
     //------------------------------------------------------------------------------------//   
        
        rdPago = new JRadioButton("Pagas");
        rdPago.setBounds(20, 30, 80, 22);
        rdPago.setFont(new Font("Arial", 0, 13));
        painelBaixa.add(rdPago);
        
        
         rdReceber = new JRadioButton("A Receber");
        rdReceber.setBounds(20, 70, 100, 22);
        rdReceber.setFont(new Font("Arial", 0, 13));
        painelBaixa.add(rdReceber);
        
        groupBaixa = new ButtonGroup();
        groupBaixa.add(rdPago);
        groupBaixa.add(rdReceber); 
        
        
          //------------------------------------------------------------------------------------//
        
        painelOrdenar = new JPanel();
        painelOrdenar.setLayout(null);
        painelOrdenar.setSize(140, 130);
        painelOrdenar.setLocation(310, 80);
        painelOrdenar.setBorder(BorderFactory.createTitledBorder("Ordenar por"));
        painelPrincipal.add(painelOrdenar);
        
        
        
     //------------------------------------------------------------------------------------//   
        
        rdEmissao = new JRadioButton("Emissão");
        rdEmissao.setBounds(20, 30, 100, 22);
        rdEmissao.setFont(new Font("Arial", 0, 13));
        painelOrdenar.add(rdEmissao);
        
        
         rdVencimento = new JRadioButton("Vencimento");
        rdVencimento.setBounds(20, 60, 100, 22);
        rdVencimento.setFont(new Font("Arial", 0, 13));
        painelOrdenar.add(rdVencimento);
        
        rdBaixa = new JRadioButton("Data Baixa");
        rdBaixa.setBounds(20, 90, 100, 22);
        rdBaixa.setFont(new Font("Arial", 0, 13));
        painelOrdenar.add(rdBaixa);
        
        groupOrdenar = new ButtonGroup();
        groupOrdenar.add(rdEmissao);
        groupOrdenar.add(rdVencimento); 
         groupOrdenar.add(rdBaixa); 
       //------------------------------------------------------------------------------------// 
       
       
       
       
          
        painelCliente = new JPanel();
        painelCliente.setLayout(null);
        painelCliente.setSize(435, 70);
        painelCliente.setLocation(12, 210);
        painelCliente.setBorder(BorderFactory.createTitledBorder(""));
        painelPrincipal.add(painelCliente);
       
        cbCliente = new JCheckBox("Por Cliente");
        cbCliente.setBounds(10, 10, 100, 22);
        painelCliente.add(cbCliente);
        
        
         txtCliente = new JTextField();
        txtCliente.setBounds(10, 40, 300, 22);
        painelCliente.add(txtCliente);
        
        
         txtCodCliente = new JTextField();
        txtCodCliente.setBounds(315, 40, 40, 22);
        painelCliente.add(txtCodCliente);
        
          
       btnConsultarCliente = new JButton();
       btnConsultarCliente.setBounds(360, 40, 22, 22);       
       btnConsultarCliente.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
       btnConsultarCliente.setToolTipText("Pesquisar Cliente");
       btnConsultarCliente.setHorizontalTextPosition(SwingConstants.CENTER);
        btnConsultarCliente.addActionListener((java.awt.event.ActionEvent evt) -> {  
           
            ConsultaCliente_Simplificada consult = new ConsultaCliente_Simplificada();
           consult.desenharTela();
        });
        
       painelCliente.add(btnConsultarCliente);
        
        //--------------------------------------------------------------------------------------------//
        
       
        
        
          //--------------------------------------------------------------------------------------------//
       
        
   // ---------------- BOTAO VISUALIZAR-----//
      btnVisualizar = new JButton("Visualizar");
       btnVisualizar.setBounds(120, 300, 105, 35);       
        btnVisualizar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/visualizar.png"));
        btnVisualizar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnVisualizar.setFont(new Font("Arial", 1, 13));
        btnVisualizar.addActionListener((java.awt.event.ActionEvent evt)->{
            
        });
        painelPrincipal.add(btnVisualizar);
        
        //------------------------------------------------------//
        
           // ---------------- BOTAO SAIR-----//
       btnSair = new JButton("Sair");
       btnSair.setBounds(230, 300, 105, 35);       
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
