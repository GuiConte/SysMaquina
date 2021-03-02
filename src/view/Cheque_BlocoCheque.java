
package view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Cheque_BlocoCheque {
    
    private JFrame janela;
    private JPanel painelPrincipal,painelCliente, PainelDestino, painelBloco;
    private JLabel lblNumeroControle, lblData;
    private JTextField txtNumeroControle, txtData;
    private JButton btnCriar, btnSair;
    private JLabel lblDataBloco, lblBom, lblNumeroCheque, lblNumeroAgencia, lblValor, lblNomeBanco, lblNumeroConta,lblNomeTitular;
    private JTextField txtDataBloco, txtBom, txtNumeroCheque, txtNumeroAgencia,txtNumeroConta, txtValor, txtNomeBanco, txtNomeTitular;
    private JLabel lblCliente, lblControleNun,  lblDataDestino,lblControleData, lblStatus, lblReferencia,lblSequencia, lblVersoCheque, lblObservacao;
    private JTextField txtCliente, txtCodCliente, txtControleNum,txtControleData, txtDataDestino, txtReferencia,txtSequencia, txtVersoCheque, txtObservacao;
    private JButton btnConsultaCliente, btnGravar, btnConsultar, btnSairBloco, btnCancelar;
    private JComboBox  cbStatus;
    private JCheckBox cbCliente;
    
      public void desenharTela() {  
     janela = new JFrame("Bloco de Cheque");
        janela.setSize(200, 205);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        
        
        
        

        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(180, 160);
        painelPrincipal.setLocation(5, 5);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        
    
        
        
        
          lblNumeroControle = new JLabel("N° Controle ");
        lblNumeroControle.setBounds(50, 20, 120, 22);
        lblNumeroControle.setFont(new Font("arial", 1, 15));
        painelPrincipal.add(lblNumeroControle);
        
        txtNumeroControle = new JTextField();
        txtNumeroControle.setBounds(50, 40, 80, 22);
        painelPrincipal.add(txtNumeroControle);
        
         
        
          lblDataBloco = new JLabel("Data ");
        lblDataBloco.setBounds(50, 70, 60, 22);
        lblDataBloco.setFont(new Font("arial", 1, 15));
        painelPrincipal.add(lblDataBloco);
        
        txtDataBloco = new JTextField();
        txtDataBloco.setBounds(50, 90, 80, 22);
        painelPrincipal.add(txtDataBloco);
        
        
        
          //-------------------------------------------------------------------------------------------// 
        btnCriar = new JButton("Criar");
       btnCriar.setBounds(10, 130, 70, 27);       
       btnCriar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/incluir.png"));      
       btnCriar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnCriar.setFont(new Font("Arial", 1, 13));
        btnCriar.addActionListener((java.awt.event.ActionEvent evt) -> {  
           criarPaginaCadBloco();
        });
      
          
        
       painelPrincipal.add(btnCriar);
   //-------------------------------------------------------------------------------------------// 
        
        
         //-------------------------------------------------------------------------------------------// 
        btnSairBloco = new JButton("Sair");
       btnSairBloco.setBounds(100, 130, 70, 27);       
       btnSairBloco.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/sair.png"));      
       btnSairBloco.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnSairBloco.setFont(new Font("Arial", 1, 13));
        btnSairBloco.addActionListener((java.awt.event.ActionEvent evt) -> {  
           janela.dispose();
        });
       painelPrincipal.add(btnSairBloco);
   //-------------------------------------------------------------------------------------------// 
        
        
        
        janela.add(painelPrincipal);
        janela.setVisible(true);
        
      }  
      
      
     private void criarPaginaCadBloco(){
         
         janela = new JFrame("Cadastro de Cheque(s)- Bloco de Cheques");
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
        
        txtData = new JTextField();
        txtData.setBounds(10, 30, 80, 22);
        painelPrincipal.add(txtData);
    //----------------------------------------------------------------------------------//
    
   //----------------------------------------------------------------------------------//  
    
         lblBom = new JLabel("Bom para ");
        lblBom.setBounds(100, 10, 100, 22);
        painelPrincipal.add(lblBom);
        
        txtBom = new JTextField();
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
        
       painelCliente.add(btnConsultaCliente);
   //----------------------------------------------------------------------------------//
   
  
        painelBloco = new JPanel();
        painelBloco.setLayout(null);
        painelBloco.setSize(300, 80);
        painelBloco.setLocation(370, 110);
        painelBloco.setBorder(BorderFactory.createTitledBorder("Bloco Cheque"));
        
        
        painelPrincipal.add(painelBloco);
   
   //-----------------------------------------------------------------------------------//
   
   
   
         lblControleNun = new JLabel("N° Controle ");
        lblControleNun.setBounds(20, 20, 120, 22);
        lblControleNun.setFont(new Font("arial", 1, 14));
        painelBloco.add(lblControleNun);
        
        txtControleNum = new JTextField();
        txtControleNum.setBounds(20, 40, 110, 22);
        painelBloco.add(txtControleNum);
   
   
    //----------------------------------------------------------------------------------//
   
   
          lblControleData = new JLabel("Data ");
        lblControleData.setBounds(150, 20, 60, 22);
        lblControleData.setFont(new Font("arial", 1, 14));
        painelBloco.add(lblControleData);
        
        txtControleData = new JTextField();
        txtControleData.setBounds(150, 40, 80, 22);
        painelBloco.add(txtControleData);
   //----------------------------------------------------------------------------------------------//
   
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
        
        txtDataDestino = new JTextField();
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
   
   
     
         lblVersoCheque = new JLabel("Verso Cheque ");
        lblVersoCheque.setBounds(370, 200, 120, 22);
        painelPrincipal.add(lblVersoCheque);
        
        txtVersoCheque = new JTextField();
        txtVersoCheque.setBounds(370, 220, 300, 67);
        painelPrincipal.add(txtVersoCheque);
        
        
           //----------------------------------------------------------------------------------//
   
   
     
         lblObservacao = new JLabel("Observação ");
        lblObservacao.setBounds(370, 290, 120, 22);
        painelPrincipal.add(lblObservacao);
        
        txtObservacao = new JTextField();
        txtObservacao.setBounds(370, 310, 300, 67);
        painelPrincipal.add(txtObservacao);
        
        
          //-------------------------------------------------------------------------------------------// 
        btnGravar = new JButton("Gravar");
       btnGravar.setBounds(200, 400, 100, 27);       
       btnGravar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));      
       btnGravar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnGravar.setFont(new Font("Arial", 1, 13));
        
       painelPrincipal.add(btnGravar);
   //-------------------------------------------------------------------------------------------// 
   
   
 
   
   
   //-------------------------------------------------------------------------------------------// 
        btnCancelar = new JButton("Cancelar");
       btnCancelar.setBounds(310, 400, 100, 27);       
       btnCancelar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));    
       btnCancelar.setFont(new Font("Arial", 1, 13));
       btnCancelar.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelPrincipal.add(btnCancelar);
   //-------------------------------------------------------------------------------------------// 
   
   
   //-------------------------------------------------------------------------------------------// 
        btnSair = new JButton("Sair");
       btnSair.setBounds(420, 400, 100, 27);       
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
      
      
      
      

