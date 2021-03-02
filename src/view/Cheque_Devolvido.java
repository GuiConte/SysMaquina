
package view;

import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

public class Cheque_Devolvido {
 
    
    private JFrame janela;
    private JPanel painelPrincipal, painelCliente, PainelDestino;
    private JLabel lblData, lblBom, lblNumeroCheque, lblNumeroAgencia, lblValor, lblNomeBanco, lblNumeroConta,lblNomeTitular;
    private JTextField txtNumeroCheque, txtNumeroAgencia,txtNumeroConta, txtValor, txtNomeBanco, txtNomeTitular;
    private JLabel lblCliente, lblDataDestino, lblStatus, lblReferencia,lblSequencia, lblVersoCheque, lblObservacao;
    private JTextField txtCliente, txtCodCliente, txtReferencia,txtSequencia;
    private JButton btnConsultaCliente, btnGravar, btnConsultar, btnSair, btnCancelar;
    private JComboBox  cbStatus;
    private JCheckBox cbCliente;
    private JFormattedTextField txtData, txtBom, txtDataDestino;
     private JTextArea  txtVersoCheque, txtObservacao;
     private JScrollPane scrollObs;
    
      public void desenharTela() throws ParseException {  
        janela = new JFrame("Cadastro de Cheque(s) Devolvidos");
        janela.setSize(725, 480);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        
        
        

        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(700, 435);
        painelPrincipal.setLocation(5, 5);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        
     //----------------------------------------------------------------------------------//   
        
         lblData = new JLabel("Data ");
        lblData.setBounds(13, 10, 60, 22);
        painelPrincipal.add(lblData);
        
        txtData = new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtData.setBounds(10, 30, 80, 22);
        painelPrincipal.add(txtData);
    //----------------------------------------------------------------------------------//
    
   //----------------------------------------------------------------------------------//  
    
         lblBom = new JLabel("Bom para ");
        lblBom.setBounds(100, 10, 100, 22);
        painelPrincipal.add(lblBom);
        
        txtBom = new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtBom.setBounds(100, 30, 80, 22);
        painelPrincipal.add(txtBom);
   
   //----------------------------------------------------------------------------------//
   
   
   
    //----------------------------------------------------------------------------------//  
    
         lblNumeroCheque = new JLabel("Número do Cheque ");
        lblNumeroCheque.setBounds(190, 10, 120, 22);
        painelPrincipal.add(lblNumeroCheque);
        
        txtNumeroCheque = new JTextField();
        txtNumeroCheque.setBounds(190, 30, 110, 22);
        painelPrincipal.add(txtNumeroCheque);
   
   //----------------------------------------------------------------------------------//
   
   
      //----------------------------------------------------------------------------------//  
    
         lblNumeroAgencia = new JLabel("Número da Agência ");
        lblNumeroAgencia.setBounds(320, 10, 120, 22);
        painelPrincipal.add(lblNumeroAgencia);
        
        txtNumeroAgencia = new JTextField();
        txtNumeroAgencia.setBounds(320, 30, 110, 22);
        painelPrincipal.add(txtNumeroAgencia);
   
   //----------------------------------------------------------------------------------//
   
   
   
     //----------------------------------------------------------------------------------//  
    
         lblNumeroConta = new JLabel("Número da Conta ");
        lblNumeroConta.setBounds(450, 10, 120, 22);
        painelPrincipal.add(lblNumeroConta);
        
        txtNumeroConta = new JTextField();
        txtNumeroConta.setBounds(450, 30, 110, 22);
        painelPrincipal.add(txtNumeroConta);
   
   //----------------------------------------------------------------------------------//
   
   
   
    //----------------------------------------------------------------------------------//  
    
         lblValor = new JLabel("Valor ");
        lblValor.setBounds(580, 10, 120, 22);
        painelPrincipal.add(lblValor);
        
        txtValor = new JTextField();
        txtValor.setBounds(580, 30, 110, 22);
        painelPrincipal.add(txtValor);
   
   //----------------------------------------------------------------------------------//
   
    //----------------------------------------------------------------------------------//  
    
         lblNomeBanco = new JLabel("Nome do Banco ");
        lblNomeBanco.setBounds(10, 60, 120, 22);
        painelPrincipal.add(lblNomeBanco);
        
        txtNomeBanco = new JTextField();
        txtNomeBanco.setBounds(10, 80, 280, 22);
        painelPrincipal.add(txtNomeBanco);
   
   //----------------------------------------------------------------------------------//
   
   
   //----------------------------------------------------------------------------------//  
    
         lblNomeTitular = new JLabel("Nome do Titular ");
        lblNomeTitular.setBounds(300, 60, 120, 22);
        painelPrincipal.add(lblNomeTitular);
        
        txtNomeTitular = new JTextField();
        txtNomeTitular.setBounds(300, 80, 280, 22);
        painelPrincipal.add(txtNomeTitular);
   
        //---------------------------------------------------------------------------//
        
          lblSequencia = new JLabel("N° Sequencia ");
        lblSequencia.setBounds(590, 60, 120, 22);
        lblSequencia.setFont(new Font("Arial", 1, 14));
        lblSequencia.setForeground(Color.blue);
        painelPrincipal.add(lblSequencia);
        
         
          txtSequencia = new JTextField();
        txtSequencia.setBounds(590, 80, 100, 22);
        txtSequencia.setFont(new Font("Arial", 1, 14));
        txtSequencia.setForeground(Color.red);
        painelPrincipal.add(txtSequencia);
        
   //----------------------------------------------------------------------------------//
   
   
   
      painelCliente = new JPanel();
        painelCliente.setLayout(null);
        painelCliente.setSize(350, 80);
        painelCliente.setLocation(10, 110);
        painelCliente.setBorder(BorderFactory.createTitledBorder("Dados Cliente"));
        painelPrincipal.add(painelCliente);
   
   //----------------------------------------------------------------------------------//
   
   
     //----------------------------------------------------------------------------------//  
    
         lblCliente = new JLabel("Cliente");
        lblCliente.setBounds(10, 20, 100, 22);
        painelCliente.add(lblCliente);
        
        txtCliente = new JTextField();
        txtCliente.setBounds(10, 40, 240, 22);
        painelCliente.add(txtCliente);
        
         txtCodCliente = new JTextField();
        txtCodCliente.setBounds(260, 40, 40, 22);
        painelCliente.add(txtCodCliente);
   
        
           cbCliente = new JCheckBox("Cliente não Cadastrado");
        cbCliente.setBounds(80, 20, 180, 20);
        painelCliente.add(cbCliente);
   //----------------------------------------------------------------------------------//
   
    //----------------------------------------------------------------------------------//
    
       btnConsultaCliente = new JButton();
       btnConsultaCliente.setBounds(305, 40, 24, 24);       
       btnConsultaCliente.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
       btnConsultaCliente.setToolTipText("Pesquisar Cliente");
       btnConsultaCliente.setHorizontalTextPosition(SwingConstants.CENTER);
       btnConsultaCliente.addActionListener((java.awt.event.ActionEvent evt) -> {  
           
           ConsultaCliente_Simplificada consult = new ConsultaCliente_Simplificada();
           consult.desenharTela();
        });
        
       painelCliente.add(btnConsultaCliente);
   //----------------------------------------------------------------------------------//
   
  
   
    //----------------------------------------------------------------------------------//
   
   
   
      PainelDestino = new JPanel();
        PainelDestino.setLayout(null);
        PainelDestino.setSize(350, 180);
        PainelDestino.setLocation(10, 200);
        PainelDestino.setBorder(BorderFactory.createTitledBorder("Destino/Baixa"));
        painelPrincipal.add(PainelDestino);
   
   //----------------------------------------------------------------------------------//
   
   
     
         lblDataDestino = new JLabel("Data Destino ");
        lblDataDestino.setBounds(10, 20, 120, 22);
        PainelDestino.add(lblDataDestino);
        
        txtDataDestino = new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtDataDestino.setBounds(10, 40, 80, 22);
        PainelDestino.add(txtDataDestino);
        
        
          //----------------------------------------------------------------------------------//
   
   
     
         lblStatus = new JLabel("Status ");
        lblStatus.setBounds(10, 70, 120, 22);
        PainelDestino.add(lblStatus);
        
        cbStatus = new JComboBox();
        cbStatus.setBounds(10, 90, 280, 22);
        PainelDestino.add(cbStatus);
        
        
          
          //----------------------------------------------------------------------------------//
   
   
     
         lblReferencia = new JLabel("Referencia ");
        lblReferencia.setBounds(10, 120, 120, 22);
        PainelDestino.add(lblReferencia);
        
        txtReferencia = new JTextField();
        txtReferencia.setBounds(10, 140, 280, 22);
        PainelDestino.add(txtReferencia);
        
        
        
            
          
          //----------------------------------------------------------------------------------//
   
        //----------------------------------------------------------------------------------//
   
         lblVersoCheque = new JLabel("Verso Cheque ");
        lblVersoCheque.setBounds(370, 200, 120, 22);
        painelPrincipal.add(lblVersoCheque);
        
         txtVersoCheque = new JTextArea();
        txtVersoCheque.setLineWrap(true);
        txtVersoCheque.setWrapStyleWord(true);

        scrollObs = new JScrollPane(txtVersoCheque, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollObs.setBounds(370, 220, 300, 67);
        painelPrincipal.add(scrollObs);
        
        
           //----------------------------------------------------------------------------------//
   
   
     
         
         lblObservacao = new JLabel("Observação ");
        lblObservacao.setBounds(370, 290, 120, 22);
        painelPrincipal.add(lblObservacao);
        
        
        
        txtObservacao = new JTextArea();
        txtObservacao.setLineWrap(true);
        txtVersoCheque.setWrapStyleWord(true);

        scrollObs = new JScrollPane(txtObservacao, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollObs.setBounds(370, 310, 300, 67);
        painelPrincipal.add(scrollObs);
        
        
          //-------------------------------------------------------------------------------------------// 
        btnGravar = new JButton("Gravar");
       btnGravar.setBounds(150, 390, 100, 35);       
       btnGravar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));      
       btnGravar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnGravar.setFont(new Font("Arial", 1, 13));
        
       painelPrincipal.add(btnGravar);
   //-------------------------------------------------------------------------------------------// 
   
   
   //-------------------------------------------------------------------------------------------// 
        btnConsultar = new JButton("Consultar");
       btnConsultar.setBounds(260, 390, 100, 35);       
       btnConsultar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/consulta.png"));
        btnConsultar.setFont(new Font("Arial", 1, 13));
        btnConsultar.setHorizontalTextPosition(SwingConstants.RIGHT);
       painelPrincipal.add(btnConsultar);
   //-------------------------------------------------------------------------------------------// 
   
   
   //-------------------------------------------------------------------------------------------// 
        btnCancelar = new JButton("Cancelar");
       btnCancelar.setBounds(370, 390, 100, 35);       
       btnCancelar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));    
       btnCancelar.setFont(new Font("Arial", 1, 13));
       btnCancelar.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelPrincipal.add(btnCancelar);
   //-------------------------------------------------------------------------------------------// 
   
   
   //-------------------------------------------------------------------------------------------// 
        btnSair = new JButton("Sair");
       btnSair.setBounds(480, 390, 100, 35);       
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


