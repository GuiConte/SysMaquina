
package view;

import com.sun.prism.MaskTextureGraphics;
import com.sun.prism.impl.shape.MaskData;
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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;


public class CadCliente_Sacaria {
    private JFrame janela;
    private JPanel  painelPrincipal, painelPessoa;
    private JLabel lblCodigo,lblNome,lblEndereco, lblCidade,lblEstado,lblCEP,lblTelefone,lblRG,lblCPF,lblEmail,lblCelular,lblObservacao,lblDataCadastro;
    private JTextField txtCodigo,txtNome, txtEndereco,  txtRG, txtCPF, txtEmail,txtObservacao;
    private JButton  btnGravar,btnCancelar,btnSair; 
    private JRadioButton rdFisica, rdJuridica;
    private ButtonGroup groupTipo;
    private JFormattedTextField txtCelular,txtCEP, txtTelefone,txtDataCadastro;
    private JComboBox cbCidade, cbEstado;
    
    
    
    public void desenharTela() throws ParseException{
        
        
        janela = new JFrame("Cadastro de Clientes Sacarias");        
        janela.setSize(620,380);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);

        
        
         //-------------- CRIANDO PAINEL --------------------//
         painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setBounds(5,05,590,330);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        
        
        
         //---------------CODIGO-----------------//
         
        lblCodigo = new JLabel("Código ");
        lblCodigo.setBounds(20, 10, 60, 22);
        painelPrincipal.add(lblCodigo);
        
        txtCodigo = new JTextField();
        txtCodigo.setBounds(20, 30, 60, 22);
        painelPrincipal.add(txtCodigo);
        
        
        //---------------DATA CADASTRO-----------------//
         
        lblDataCadastro = new JLabel("Data Cadastro ");
        lblDataCadastro.setBounds(120, 10, 100, 22);
        painelPrincipal.add(lblDataCadastro);
        
        txtDataCadastro = new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtDataCadastro.setBounds(120, 30, 80, 22);
        painelPrincipal.add(txtDataCadastro);
        
        //-----------------------------------------------------------------------//
        
        
        painelPessoa = new JPanel();
        painelPessoa.setLayout(null);
        painelPessoa.setBounds(250, 10, 190, 50);
        painelPessoa.setBorder(BorderFactory.createTitledBorder(""));
        painelPrincipal.add(painelPessoa);
        
        
        
           rdFisica = new JRadioButton("Fisica");
        rdFisica.setBounds(5, 20, 80, 17);
        rdFisica.setFont(new Font("Arial", 0, 13));
        painelPessoa.add(rdFisica);
        
        rdJuridica = new JRadioButton("Juridica");
        rdJuridica.setBounds(90, 20, 80, 17);
        rdJuridica.setFont(new Font("Arial", 0, 13));
        painelPessoa.add(rdJuridica);
        
        groupTipo = new ButtonGroup();
        groupTipo.add(rdFisica);
        groupTipo.add(rdJuridica);
        
        painelPrincipal.add(painelPessoa);
        
        
        
        
        
         //---------------RAZAO SOCIAL-----------------//
         
        lblNome = new JLabel("Nome ");
        lblNome.setBounds(20, 50, 100, 22);
        painelPrincipal.add(lblNome);
        
        txtNome = new JTextField();
        txtNome.setBounds(20, 70, 340, 22);
        painelPrincipal.add(txtNome);
        
        
        //---------------CNPJ-----------------//
         
        lblRG = new JLabel("RG / CNPJ ");
        lblRG.setBounds(20, 90, 100, 22);
        painelPrincipal.add(lblRG);
        
        txtRG = new JTextField();
        txtRG.setBounds(20, 110, 140, 22);
        painelPrincipal.add(txtRG);
        
        //---------------CPF-----------------//
         
        lblCPF = new JLabel("CPF / IE ");
        lblCPF.setBounds(180, 90, 100, 22);
        painelPrincipal.add(lblCPF);
        
        txtCPF = new JTextField();
        txtCPF.setBounds(180, 110, 140, 22);
        painelPrincipal.add(txtCPF);
        
        
         //---------------ENDERECO-----------------//
         
        lblEndereco = new JLabel("Endereço ");
        lblEndereco.setBounds(20, 130, 100, 22);
        painelPrincipal.add(lblEndereco);
        
        txtEndereco = new JTextField();
        txtEndereco.setBounds(20, 150, 200, 22);
        painelPrincipal.add(txtEndereco);
        
               
        
         //---------------CIDADE-----------------//
         
        lblCidade = new JLabel("Cidade ");
        lblCidade.setBounds(230, 130, 100, 22);
        painelPrincipal.add(lblCidade);
        
        cbCidade = new JComboBox();
        cbCidade.setBounds(230, 150, 180, 22);
        painelPrincipal.add(cbCidade);
        
        //---------------ESTADO-----------------//
         
        lblEstado = new JLabel("UF");
        lblEstado.setBounds(415, 130, 100, 22);
        painelPrincipal.add(lblEstado);
        
        cbEstado  = new JComboBox();
        cbEstado.setBounds(415, 150, 60, 22);
        painelPrincipal.add(cbEstado);
        
        //---------------CEP-----------------//
         
        lblCEP = new JLabel("CEP");
        lblCEP.setBounds(480, 130, 100, 22);
        painelPrincipal.add(lblCEP);
        
        txtCEP = new JFormattedTextField(new MaskFormatter("#####-###"));
        txtCEP.setBounds(480, 150, 100, 22);
        painelPrincipal.add(txtCEP);
        
        
        
        //---------------CELULAR-----------------//
         
        lblCelular = new JLabel("Celular");
        lblCelular.setBounds(20, 170, 100, 22);
        painelPrincipal.add(lblCelular);
        
        txtCelular =  new JFormattedTextField(new MaskFormatter("(##)#####-####"));
        txtCelular.setBounds(20, 190, 120, 22);
        painelPrincipal.add(txtCelular);
        
        
        //---------------TELEFONE-----------------//
         
        lblTelefone = new JLabel("Telefone");
        lblTelefone.setBounds(150, 170, 100, 22);
        painelPrincipal.add(lblTelefone);
        
        txtTelefone = new JFormattedTextField(new MaskFormatter("(##)####-####"));
        txtTelefone.setBounds(150, 190, 120, 22);
        painelPrincipal.add(txtTelefone);
        
         //---------------Email-----------------//
         
        lblEmail = new JLabel("Email");
        lblEmail.setBounds(280, 170, 100, 22);
        painelPrincipal.add(lblEmail);
        
        txtEmail = new JTextField();
        txtEmail.setBounds(280, 190, 300, 22);
        painelPrincipal.add(txtEmail);
        
        
        
        lblObservacao = new JLabel("Observação:");
        lblObservacao.setBounds(20, 220, 100, 22);
        painelPrincipal.add(lblObservacao);
        
        txtObservacao = new JTextField();
        txtObservacao.setBounds(100, 220, 320, 100);
        painelPrincipal.add(txtObservacao);
        
        
         // ---------------- BOTAO GRAVAR-----//
       btnGravar = new JButton("Gravar");
       btnGravar.setBounds(450, 220, 90, 30);       
       btnGravar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));
       btnGravar.setFont(new Font("Arial", 1, 13));
       btnGravar.setHorizontalTextPosition(SwingConstants.RIGHT);
       btnGravar.addActionListener((java.awt.event.ActionEvent evt) -> {  
                    
        });
        
       painelPrincipal.add(btnGravar);
        
          // ---------------- BOTAO CANCELAR-----//
       btnCancelar = new JButton("Cancelar");
       btnCancelar.setBounds(450, 257, 90, 30);       
       btnCancelar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));
       btnCancelar.setFont(new Font("Arial", 1, 13));
       btnCancelar.setHorizontalTextPosition(SwingConstants.RIGHT);
       btnCancelar.addActionListener((java.awt.event.ActionEvent evt) -> {  
                    
        });
        
       painelPrincipal.add(btnCancelar);
        
         // ---------------- BOTAO SAIR-----//
       btnSair = new JButton("Sair");
       btnSair.setBounds(450, 295, 90, 30);       
       btnSair.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/sair.png"));
       btnSair.setFont(new Font("Arial", 1, 13));
       btnSair.setHorizontalTextPosition(SwingConstants.RIGHT); 
       btnSair.addActionListener((java.awt.event.ActionEvent evt) -> {  
                    janela.dispose();
        });
       
       painelPrincipal.add(btnSair);
        
    
      
       janela.add(painelPrincipal);
        janela.setVisible(true); 
        
    }
    
     
}
