
package view;

import java.awt.Font;
import java.text.ParseException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;


public class Venda_Balanca {
     
    private JFrame janela;
    private JPanel painelPrincipal;
    private JLabel lblData, lblCliente, lblCI, lblCodCliente, lblPeso, lblPrazo, lblDataVencimento, lblObservacao , lblDesconto, lblTotal;
    private JTextField  txtCliente, txtCodCliente, txtCI, txtPeso, txtPrazo,  txtObservacao, txtDesconto, txtTotal;
    private JButton btnConsultaCliente, btnGravar, btnSair, btnCancelar, btnConsultar;
    private JFormattedTextField txtData ,txtDataVencimento;
      public void desenharTela() throws ParseException {

        janela = new JFrame("Balança");
        janela.setSize(535, 300);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);

       
       //---------------------------------------------//

        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(515, 260);
        painelPrincipal.setLocation(7, 5);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        
        //---------------------------------------------//
        
         lblData = new JLabel("Data ");
        lblData.setBounds(13, 20, 60, 22);
        painelPrincipal.add(lblData);
        
        txtData = new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtData.setBounds(10, 40, 80, 22);
        painelPrincipal.add(txtData);
        
       //---------------------------------------------// 
       
         lblCliente = new JLabel("Cliente ");
        lblCliente.setBounds(100, 20, 60, 22);
        painelPrincipal.add(lblCliente);
        
        txtCliente = new JTextField();
        txtCliente.setBounds(100, 40, 250, 22);
        painelPrincipal.add(txtCliente);
       //---------------------------------------------//
       
         lblCodCliente = new JLabel("Cod.Cliente");
        lblCodCliente.setBounds(350, 20, 120, 22);
        painelPrincipal.add(lblCodCliente);
        
        txtCodCliente = new JTextField();
        txtCodCliente.setBounds(355, 40, 60, 22);
        painelPrincipal.add(txtCodCliente);
        
        
        
          //------------BOTAO PESQUISAR PRODUTO ---------------------//
       
       btnConsultaCliente = new JButton();
       btnConsultaCliente.setBounds(420, 40, 20, 20);       
       btnConsultaCliente.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
       btnConsultaCliente.setToolTipText("Pesquisar Cliente");
       btnConsultaCliente.setHorizontalTextPosition(SwingConstants.CENTER);
       btnConsultaCliente.addActionListener((java.awt.event.ActionEvent evt) -> {  
           
           ConsultaCliente_Simplificada consult = new ConsultaCliente_Simplificada();
           consult.desenharTela();
        });
        
       painelPrincipal.add(btnConsultaCliente);
        
       //-------------------------------------------------------------------//
       
         lblCI = new JLabel("C.I");
        lblCI.setBounds(450, 20, 120, 22);
        painelPrincipal.add(lblCI);
        
        txtCI = new JTextField();
        txtCI.setBounds(450, 40, 60, 22);
        painelPrincipal.add(txtCI);
        
        
        
          //-------------------------------------------------------------------//
       
         lblPeso = new JLabel("Peso");
        lblPeso.setBounds(10, 70, 120, 22);
        painelPrincipal.add(lblPeso);
        
        txtPeso = new JTextField();
        txtPeso.setBounds(10, 90, 100, 22);
        painelPrincipal.add(txtPeso);
        
        
       //------------------------------------------------------------------// 
         lblPrazo = new JLabel("Prazo");
        lblPrazo.setBounds(120, 70, 120, 22);
        painelPrincipal.add(lblPrazo);
        
        txtPrazo = new JTextField();
        txtPrazo.setBounds(120, 90, 50, 22);
        painelPrincipal.add(txtPrazo);
    //---------------------------------------------------------------------------//
    
    
       lblDataVencimento = new JLabel("Data Vencimento");
        lblDataVencimento.setBounds(180, 70, 120, 22);
        painelPrincipal.add(lblDataVencimento);
        
        txtDataVencimento = new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtDataVencimento.setBounds(180, 90, 80, 22);
        painelPrincipal.add(txtDataVencimento);
        
         //---------------------------------------------------------------------------//
    
    
       lblObservacao = new JLabel("Observação");
        lblObservacao.setBounds(10, 120, 120, 22);
        painelPrincipal.add(lblObservacao);
        
        txtObservacao = new JTextField();
        txtObservacao.setBounds(10, 140, 400, 73);
        painelPrincipal.add(txtObservacao);
        
        //-----------------------------//
         lblDesconto = new JLabel("Desconto");
        lblDesconto.setBounds(420, 120, 120, 22);
        painelPrincipal.add(lblDesconto);
        
        txtDesconto = new JTextField();
        txtDesconto.setBounds(420, 140, 80, 22);
        painelPrincipal.add(txtDesconto);
        
          //-----------------------------//
         lblTotal = new JLabel("Total");
        lblTotal.setBounds(420, 170, 120, 22);
        painelPrincipal.add(lblTotal);
        
        txtTotal = new JTextField();
        txtTotal.setBounds(420, 190, 80, 22);
        painelPrincipal.add(txtTotal);
        
        
           // ---------------- BOTAO GRAVAR-----//
        btnGravar = new JButton("Gravar");
       btnGravar.setBounds(50, 220, 100, 35);       
        btnGravar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));       
       btnGravar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnGravar.setFont(new Font("Arial", 1, 13));
        
       painelPrincipal.add(btnGravar);
        
          // ---------------- BOTAO CANCELAR-----//
       btnCancelar = new JButton("Cancelar");
       btnCancelar.setBounds(160, 220, 100, 35);       
       btnCancelar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));       
       btnCancelar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnCancelar.setFont(new Font("Arial", 1, 13));
        
       painelPrincipal.add(btnCancelar);
       
       
        // ---------------- BOTAO CANCELAR-----//
       btnConsultar = new JButton("Consultar");
       btnConsultar.setBounds(270, 220, 100, 35);       
       btnConsultar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/consulta.png"));       
       btnConsultar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnConsultar.setFont(new Font("Arial", 1, 13));
        
       painelPrincipal.add(btnConsultar);
        
         // ---------------- BOTAO SAIR-----//
       btnSair = new JButton("Sair");
       btnSair.setBounds(380, 220, 100, 35);       
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
