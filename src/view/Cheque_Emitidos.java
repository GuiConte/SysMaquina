
package view;

import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;


public class Cheque_Emitidos {
 private JFrame janela;
    private JPanel painelPrincipal, PainelDestino, painelCidade, painelPagamento;
    private JLabel lblData, lblBom, lblNumeroCheque, lblValor, lblNomeBanco, lblNumeroConta;
    private JTextField  txtNumeroCheque, txtValor, txtNomeBanco;
    private JLabel  lblDataDestino, lblStatus, lblReferencia,lblSequencia, lblVersoCheque, lblObservacao;
    private JTextField txtReferencia,txtSequencia;
    private JButton  btnGravar, btnConsultar, btnSair, btnCancelar;
    private JComboBox cbNumeroConta, cbStatus;
    private JRadioButton rdDivinolandia, rdSacramento, rdPagamento, rdFucionario, rdOutros;
    private ButtonGroup groupCidade, groupPagamento;
    private JFormattedTextField txtData,txtDataDestino, txtBom;
    private JTextArea  txtVersoCheque, txtObservacao;
     private JScrollPane scrollObs;
   
    
      public void desenharTela() throws ParseException {  
     janela = new JFrame("Cadastro de Cheque(s) Emitidos");
        janela.setSize(740, 450);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);

        
        

        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(720, 405);
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
    
         lblNumeroConta = new JLabel("Número da Conta ");
        lblNumeroConta.setBounds(320, 10, 120, 22);
        painelPrincipal.add(lblNumeroConta);
        
        cbNumeroConta = new JComboBox();
        cbNumeroConta.setBounds(320, 30, 150, 22);
        painelPrincipal.add(cbNumeroConta);
   
   //----------------------------------------------------------------------------------//
   
   
   
    //----------------------------------------------------------------------------------//  
    
         lblValor = new JLabel("Valor ");
        lblValor.setBounds(480, 10, 120, 22);
        painelPrincipal.add(lblValor);
        
        txtValor = new JTextField();
        txtValor.setBounds(480, 30, 110, 22);
        painelPrincipal.add(txtValor);
   
   //----------------------------------------------------------------------------------//
   
   
   
   
       painelCidade = new JPanel();
        painelCidade.setLayout(null);
        painelCidade.setSize(110, 65);
        painelCidade.setLocation(600, 5);
        painelCidade.setBorder(BorderFactory.createTitledBorder(""));
        painelPrincipal.add(painelCidade);
   
   
   //--------------------------------------------------------------------------------------------//
   
   
        rdDivinolandia = new JRadioButton("Divinolândia");
        rdDivinolandia.setBounds(2, 5, 100, 25);
        rdDivinolandia.setFont(new Font("Arial", 0, 11));
        painelCidade.add(rdDivinolandia);
        
        rdSacramento = new JRadioButton("Sacramento");
        rdSacramento.setBounds(2, 35, 100, 25);
        rdSacramento.setFont(new Font("Arial", 0, 11));
        painelCidade.add(rdSacramento);
        
        groupCidade = new ButtonGroup();
        groupCidade.add(rdDivinolandia);
        groupCidade.add(rdSacramento);
   
        //-----------------------------------------------------------------------//
        
        painelPagamento = new JPanel();
        painelPagamento.setLayout(null);
        painelPagamento.setSize(110, 95);
        painelPagamento.setLocation(600, 80);
        painelPagamento.setBorder(BorderFactory.createTitledBorder(""));
        painelPrincipal.add(painelPagamento);
   
   
   //--------------------------------------------------------------------------------------------//
   
   
        rdPagamento = new JRadioButton("Pagamentos");
        rdPagamento.setBounds(2, 5, 100, 25);
        rdPagamento.setFont(new Font("Arial", 0, 11));
        painelPagamento.add(rdPagamento);
        
        rdFucionario = new JRadioButton("Funcionário");
        rdFucionario.setBounds(2, 35, 100, 25);
        rdFucionario.setFont(new Font("Arial", 0, 11));
        painelPagamento.add(rdFucionario);
        
         rdOutros = new JRadioButton("Outros");
        rdOutros.setBounds(2, 65, 100, 25);
        rdOutros.setFont(new Font("Arial", 0, 11));
        painelPagamento.add(rdOutros);
        
        groupCidade = new ButtonGroup();
        groupCidade.add(rdPagamento);
        groupCidade.add(rdFucionario);
        groupCidade.add(rdOutros);
    //----------------------------------------------------------------------------------//  
    
         lblNomeBanco = new JLabel("Nome do Banco ");
        lblNomeBanco.setBounds(10, 60, 120, 22);
        painelPrincipal.add(lblNomeBanco);
        
        txtNomeBanco = new JTextField();
        txtNomeBanco.setBounds(10, 80, 280, 22);
        painelPrincipal.add(txtNomeBanco);
   
   //----------------------------------------------------------------------------------//
   
   
   //----------------------------------------------------------------------------------//  
    
   
        //---------------------------------------------------------------------------//
        
          lblSequencia = new JLabel("N° Sequencia ");
        lblSequencia.setBounds(480, 60, 120, 22);
        lblSequencia.setFont(new Font("Arial", 1, 14));
        lblSequencia.setForeground(Color.blue);
        painelPrincipal.add(lblSequencia);
        
         
          txtSequencia = new JTextField();
        txtSequencia.setBounds(480, 80, 110, 22);
        txtSequencia.setFont(new Font("Arial", 1, 14));
        txtSequencia.setForeground(Color.red);
        painelPrincipal.add(txtSequencia);
        
   //----------------------------------------------------------------------------------//
   
   
  
   
 
   //----------------------------------------------------------------------------------//
   
  
   
    //----------------------------------------------------------------------------------//
   
   
   
      PainelDestino = new JPanel();
        PainelDestino.setLayout(null);
        PainelDestino.setSize(350, 180);
        PainelDestino.setLocation(10, 170);
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
   
   
     
         lblVersoCheque = new JLabel("Verso Cheque ");
        lblVersoCheque.setBounds(370, 170, 120, 22);
        painelPrincipal.add(lblVersoCheque);
        
         txtVersoCheque = new JTextArea();
        txtVersoCheque.setLineWrap(true);
        txtVersoCheque.setWrapStyleWord(true);

        scrollObs = new JScrollPane(txtVersoCheque, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollObs.setBounds(370, 190, 340, 67);
        painelPrincipal.add(scrollObs);
        
        
           //----------------------------------------------------------------------------------//
   
   
     
         lblObservacao = new JLabel("Observação ");
        lblObservacao.setBounds(370, 260, 120, 22);
        painelPrincipal.add(lblObservacao);
        
        
        
        txtObservacao = new JTextArea();
        txtObservacao.setLineWrap(true);
        txtVersoCheque.setWrapStyleWord(true);

        scrollObs = new JScrollPane(txtObservacao, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollObs.setBounds(370, 280, 340, 67);
        painelPrincipal.add(scrollObs);
        
          //-------------------------------------------------------------------------------------------// 
        btnGravar = new JButton("Gravar");
       btnGravar.setBounds(150, 360, 100, 35);       
       btnGravar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));      
       btnGravar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnGravar.setFont(new Font("Arial", 1, 13));
        
       painelPrincipal.add(btnGravar);
   //-------------------------------------------------------------------------------------------// 
   
   
   //-------------------------------------------------------------------------------------------// 
        btnConsultar = new JButton("Consultar");
       btnConsultar.setBounds(260, 360, 100, 35);       
       btnConsultar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/consulta.png"));
        btnConsultar.setFont(new Font("Arial", 1, 13));
        btnConsultar.setHorizontalTextPosition(SwingConstants.RIGHT);
       painelPrincipal.add(btnConsultar);
   //-------------------------------------------------------------------------------------------// 
   
   
   //-------------------------------------------------------------------------------------------// 
        btnCancelar = new JButton("Cancelar");
       btnCancelar.setBounds(370, 360, 100, 35);       
       btnCancelar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));    
       btnCancelar.setFont(new Font("Arial", 1, 13));
       btnCancelar.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelPrincipal.add(btnCancelar);
   //-------------------------------------------------------------------------------------------// 
   
   
   //-------------------------------------------------------------------------------------------// 
        btnSair = new JButton("Sair");
       btnSair.setBounds(480, 360, 100, 35);       
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
