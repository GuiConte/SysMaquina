
package view;

import java.awt.Font;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;


public class CadastroCidade {
    private JFrame janela;
    private JPanel painelPrincipal;
    private JLabel lblCodigo, lblCidade, lblEstado, lblCEP, lblIBGE;
    private JTextField txtCodigo, txtCidade,txtIBGE;
    private JComboBox cbEStado;
    private JButton btnGravar, btnCancelar, btnNovo;
    private JFormattedTextField txtCEP;
    
    
    public void desenharTela() throws ParseException {  
        janela = new JFrame("Cadastro Cidades");
        janela.setSize(285, 325);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        
             

               

        
        
        
        

        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(260, 280);
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
        lblCidade = new JLabel("Nome Cidade ");
        lblCidade.setBounds(10, 70, 120, 22);
        painelPrincipal.add(lblCidade);

        txtCidade = new JTextField();
        txtCidade.setBounds(10, 90, 240, 22);
        painelPrincipal.add(txtCidade);
        
        
         //---------------CODIGO-----------------//
        lblEstado = new JLabel("Estado ");
        lblEstado.setBounds(10, 120, 100, 22);
        painelPrincipal.add(lblEstado);

        cbEStado = new JComboBox();
        cbEStado.setBounds(10, 140, 210, 22);
        painelPrincipal.add(cbEStado);
        
        
        //----------------------------------------------------------------------------------//
    
       btnNovo = new JButton();
       btnNovo.setBounds(230, 140, 24, 24);       
       btnNovo.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/incluir.png"));
       btnNovo.setToolTipText("Novo Estado");
       btnNovo.setHorizontalTextPosition(SwingConstants.CENTER);
        btnNovo.addActionListener((java.awt.event.ActionEvent evt) -> { 
           
            CadastroEstado cadEstado= new CadastroEstado();
            try {
                cadEstado.desenharTela();
            } catch (ParseException ex) {
                Logger.getLogger(CadastroCidade.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        });   
        
       painelPrincipal.add(btnNovo);
   //----------------------------------------------------------------------------------//
        
        
        
        
        
        
         //---------------CODIGO-----------------//
        lblCEP = new JLabel("CEP Padrão ");
        lblCEP.setBounds(10, 170, 100, 22);
        painelPrincipal.add(lblCEP);

        txtCEP =new JFormattedTextField(new MaskFormatter("#####-### "));
        txtCEP.setBounds(10, 190, 100, 22);
        painelPrincipal.add(txtCEP);
        
        
        
         //---------------CODIGO-----------------//
        lblIBGE = new JLabel("Cód IBGE");
        lblIBGE.setBounds(150, 170, 100, 22);
        painelPrincipal.add(lblIBGE);

        txtIBGE =new JTextField();
        txtIBGE.setBounds(150, 190, 100, 22);
        painelPrincipal.add(txtIBGE);

        
        
          //-------------------------------------------------------------------------------------------// 
        btnGravar = new JButton("Gravar");
       btnGravar.setBounds(20, 240, 100, 35);       
       btnGravar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));      
       btnGravar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnGravar.setFont(new Font("Arial", 1, 13));
        
       painelPrincipal.add(btnGravar);
       
       
        //-------------------------------------------------------------------------------------------// 
        btnCancelar = new JButton("Cancelar");
       btnCancelar.setBounds(130, 240, 100, 35);       
       btnCancelar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));    
       btnCancelar.setFont(new Font("Arial", 1, 13));
       btnCancelar.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelPrincipal.add(btnCancelar);
   //-------------------------------------------------------------------------------------------// 
        
    janela.add(painelPrincipal);
    janela.setVisible(true);

        
        
        
    }
    
}
