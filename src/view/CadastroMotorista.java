
 
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.text.MaskFormatter;


public class CadastroMotorista {
    
    
      private JFrame janela;
    private JPanel  painelPrincipal, painelBancario, painelPessoa;
    private JLabel lblCodigo,lblNome,lblEndereco,lblBairro, lblCidade,lblEstado,lblCEP;
    private JLabel lblTelefone,lblRG,lblCPF,lblEmail,lblIE,lblCNPJ,lblApelido,lblCNH,lblPlaca,lblCelular;
    private JLabel lblBanco,lblAgencia,lblCorrente,lblTitular,lblCPFBANCO,lblObservacao,lblDataCadastro;
    private JTextField txtBanco, txtAgencia,txtCorrente,txtTitular;
    private JTextField txtCodigo,txtNome, txtEndereco, txtBairro;
    private JTextField  txtRG, txtCPF, txtEmail,txtObservacao,txtIE,txtCNPJ,txtApelido, txtCNH,txtPlaca;
    private JButton btnGravarBanco,btnCancelarBanco,btnAlterarBanco,btnExcluirBanco, btnGravar,btnCancelar,btnSair; 
   private DefaultTableModel modelo;
    private JTable tblBanco;
    private JScrollPane scrollTable;
    private JCheckBox bloqueado;
    private JRadioButton rdFisica, rdJuridica;
    private ButtonGroup groupPessoa;
    private JFormattedTextField txtCPFBANCO,txtDataCadastro,txtTelefone, txtCEP,txtCelular;
    private JComboBox cbCidade ,cbEstado;
    
    
    public void desenharTela() throws ParseException{
        
        
        janela = new JFrame("Cadastro de Motorista"); 
        janela.setSize(635,700);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        
        
         //-------------- CRIANDO PAINEL --------------------//
         painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setBounds(5,5,620,660);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        
        
        
         //---------------CODIGO-----------------//
         
        lblCodigo = new JLabel("Código ");
        lblCodigo.setBounds(20, 10, 60, 22);
        painelPrincipal.add(lblCodigo);
        
        txtCodigo = new JTextField();
        txtCodigo.setBounds(20, 30, 60, 22);
        painelPrincipal.add(txtCodigo);
        
        
            //-------------- CRIANDO PAINEL --------------------//
        painelPessoa = new JPanel();
        painelPessoa.setLayout(null);
        painelPessoa.setBounds(110, 10, 190, 50);
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
        
        groupPessoa = new ButtonGroup();
        groupPessoa.add(rdFisica);
        groupPessoa.add(rdJuridica);
        
        painelPrincipal.add(painelPessoa);
        
        
        
        
        
        
         //---------------Nome-----------------//
         
        lblNome = new JLabel("Nome ");
        lblNome.setBounds(20, 50, 100, 22);
        painelPrincipal.add(lblNome);
        
        txtNome = new JTextField();
        txtNome.setBounds(20, 70, 280, 22);
        painelPrincipal.add(txtNome);
        
        
          //---------------Nome-----------------//
         
        lblApelido = new JLabel("Apelido ");
        lblApelido.setBounds(320, 50, 100, 22);
        painelPrincipal.add(lblApelido);
        
        txtApelido = new JTextField();
        txtApelido.setBounds(320, 70, 280, 22);
        painelPrincipal.add(txtApelido);
        
        
        //---------------CNPJ-----------------//
         
        lblCNPJ = new JLabel("CNPJ");
        lblCNPJ.setBounds(20, 90, 100, 22);
        painelPrincipal.add(lblCNPJ);
        
        txtCNPJ = new JTextField();
        txtCNPJ.setBounds(20, 110, 140, 22);
        painelPrincipal.add(txtCNPJ);
        
        //---------------IE-----------------//
         
        lblIE = new JLabel("IE");
        lblIE.setBounds(170, 90, 100, 22);
        painelPrincipal.add(lblIE);
        
        txtIE = new JTextField();
        txtIE.setBounds(170, 110, 140, 22);
        painelPrincipal.add(txtIE);
        
      
        
         //---------------ENDERECO-----------------//
         
        lblEndereco = new JLabel("Endereço ");
        lblEndereco.setBounds(20, 130, 100, 22);
        painelPrincipal.add(lblEndereco);
        
        txtEndereco = new JTextField();
        txtEndereco.setBounds(20, 150, 200, 22);
        painelPrincipal.add(txtEndereco);
        
        //---------------BAIRRO-----------------//
         
        lblBairro = new JLabel("Bairro ");
        lblBairro.setBounds(230, 130, 100, 22);
        painelPrincipal.add(lblBairro);
        
        txtBairro = new JTextField();
        txtBairro.setBounds(230, 150, 130, 22);
        painelPrincipal.add(txtBairro);
        
        
         //---------------CIDADE-----------------//
         
        lblCidade = new JLabel("Cidade ");
        lblCidade.setBounds(370, 130, 100, 22);
        painelPrincipal.add(lblCidade);
        
        cbCidade = new JComboBox();
        cbCidade.setBounds(370, 150, 180, 22);
        painelPrincipal.add(cbCidade);
        
        //---------------ESTADO-----------------//
         
        lblEstado = new JLabel("UF");
        lblEstado.setBounds(560, 130, 100, 22);
        painelPrincipal.add(lblEstado);
        
        cbEstado = new JComboBox();
        cbEstado.setBounds(560, 150, 50, 22);
        painelPrincipal.add(cbEstado);
        
        //---------------CEP-----------------//
         
        lblCEP = new JLabel("CEP");
        lblCEP.setBounds(20, 170, 100, 22);
        painelPrincipal.add(lblCEP);
        
        txtCEP = new JFormattedTextField(new MaskFormatter("#####-###"));
        txtCEP.setBounds(20, 190, 120, 22);
        painelPrincipal.add(txtCEP);
        
        
        //---------------TELEFONE-----------------//
         
        lblTelefone = new JLabel("Telefone");
        lblTelefone.setBounds(150, 170, 100, 22);
        painelPrincipal.add(lblTelefone);
        
        txtTelefone = new JFormattedTextField(new MaskFormatter("(##)####-####"));
        txtTelefone.setBounds(150, 190, 120, 22);
        painelPrincipal.add(txtTelefone);
        
        
         //---------------CELULAR-----------------//
         
        lblCelular = new JLabel("Celular");
        lblCelular.setBounds(280, 170, 100, 22);
        painelPrincipal.add(lblCelular);
        
        txtCelular = new JFormattedTextField(new MaskFormatter("(##)#####-####"));
        txtCelular.setBounds(280, 190, 120, 22);
        painelPrincipal.add(txtCelular);
        
        //---------------DATA CADASTRO-----------------//
         
        lblDataCadastro = new JLabel("Data de Cadastro");
        lblDataCadastro.setBounds(410, 170, 140, 22);
        painelPrincipal.add(lblDataCadastro);
        
        txtDataCadastro =new JFormattedTextField(new MaskFormatter(" ##/##/20##"));
        txtDataCadastro.setBounds(410, 190, 100, 22);
        painelPrincipal.add(txtDataCadastro);
        
         //---------------Email-----------------//
         
        lblEmail = new JLabel("Email");
        lblEmail.setBounds(280, 210, 100, 22);
        painelPrincipal.add(lblEmail);
        
        txtEmail = new JTextField();
        txtEmail.setBounds(280, 230, 320, 22);
        painelPrincipal.add(txtEmail);
        
        
         //---------------CNH-----------------//
         
        lblCNH = new JLabel("CNH");
        lblCNH.setBounds(20, 210, 170, 22);
        painelPrincipal.add(lblCNH);
        
        txtCNH = new JTextField();
        txtCNH.setBounds(20, 230, 140, 22);
        painelPrincipal.add(txtCNH);
        
 //------------------------------------------------------------------------------------------//       
        //---------------PLACA-----------------//
         
        lblPlaca = new JLabel("Placa");
        lblPlaca.setBounds(170, 210, 170, 22);
        painelPrincipal.add(lblPlaca);
        
        txtPlaca = new JTextField();
        txtPlaca.setBounds(170, 230, 100, 22);
        painelPrincipal.add(txtPlaca);
        
        
        
        
 //------------------------------------------------------------------------------------------//       
        
        //-------------------------------------------//
        bloqueado = new JCheckBox("Bloqueado");
        bloqueado.setBounds(420, 25, 120, 22);
        painelPrincipal.add(bloqueado);
 //------------------------------------------------------------------------------------------//       
         //-----------------OBSERVACAO--------------------------//
        lblObservacao = new JLabel("Observação:");
        lblObservacao.setBounds(20, 550, 100, 22);
        painelPrincipal.add(lblObservacao);
        
        txtObservacao = new JTextField();
        txtObservacao.setBounds(100, 550, 320, 100);
        painelPrincipal.add(txtObservacao);
        
        
 //------------------------------------------------------------------------------------------//     
        
        //-------------- CRIANDO PAINEL  BANCARIO--------------------//
         painelBancario = new JPanel();
        painelBancario.setLayout(null);
        painelBancario.setBounds(5,260,600,280);
        painelBancario.setBorder(BorderFactory.createTitledBorder("Dados Bancários"));
        painelPrincipal.add(painelBancario);
        
//------------------------------------------------------------------------------------------//        
        //--------------BANCO-------------------//
        lblBanco = new JLabel("Banco");
        lblBanco.setBounds(10, 20, 80, 22);
        painelBancario.add(lblBanco);
        
        txtBanco = new JTextField();
        txtBanco.setBounds(10, 40, 80, 22);
        painelBancario.add(txtBanco);
 //------------------------------------------------------------------------------------------//       
        
        //--------------AGENCIA-------------------//
        lblAgencia = new JLabel("Agência");
        lblAgencia.setBounds(100, 20, 100, 22);
        painelBancario.add(lblAgencia);
        
        txtAgencia = new JTextField();
        txtAgencia.setBounds(100, 40, 50, 22);
        painelBancario.add(txtAgencia);
 //------------------------------------------------------------------------------------------//       
        //--------------CONTA CORRENTE-------------------//
        lblCorrente = new JLabel("Conta Corrente");
        lblCorrente.setBounds(160, 20, 100, 22);
        painelBancario.add(lblCorrente);
        
        txtCorrente = new JTextField();
        txtCorrente.setBounds(160, 40, 80, 22);
        painelBancario.add(txtCorrente);
        
 //------------------------------------------------------------------------------------------//       
         //--------------TITULAR-------------------//
        lblTitular = new JLabel("Titular");
        lblTitular.setBounds(260, 20, 100, 22);
        painelBancario.add(lblTitular);
        
        txtTitular = new JTextField();
        txtTitular.setBounds(260, 40, 200, 22);
        painelBancario.add(txtTitular);
        
 //------------------------------------------------------------------------------------------//       
         //--------------CPF BANCO-------------------//
        lblCPFBANCO = new JLabel("C.P.F");
        lblCPFBANCO.setBounds(470, 20, 100, 22);
        painelBancario.add(lblCPFBANCO);
        
        txtCPFBANCO = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
        txtCPFBANCO.setBounds(470, 40, 120, 22);
        painelBancario.add(txtCPFBANCO);
  //------------------------------------------------------------------------------------------//      
        
         // ---------------- BOTAO OK-----//
       btnGravarBanco = new JButton("Gravar");
       btnGravarBanco.setBounds(20, 70, 90, 30);       
       btnGravarBanco.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));       
       btnGravarBanco.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnGravarBanco.setFont(new Font("Arial", 1, 13));
        
       painelBancario.add(btnGravarBanco);
 //------------------------------------------------------------------------------------------//       
          // ---------------- BOTAO CANCELAR-----//
       btnCancelarBanco = new JButton("Cancelar");
       btnCancelarBanco.setBounds(120, 70, 90, 30);       
       btnCancelarBanco.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));       
       btnCancelarBanco.setHorizontalTextPosition(SwingConstants.RIGHT);
       btnCancelarBanco.setFont(new Font("Arial", 1, 13));
        
       painelBancario.add(btnCancelarBanco);
 //------------------------------------------------------------------------------------------//      
       
        // ---------------- BOTAO CANCELAR-----//
       btnAlterarBanco = new JButton("Alterar");
       btnAlterarBanco.setBounds(220, 70, 90, 30);       
       btnAlterarBanco.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/alterar2.png"));       
       btnAlterarBanco.setHorizontalTextPosition(SwingConstants.RIGHT);
       btnAlterarBanco.setFont(new Font("Arial", 1, 13));
        
       painelBancario.add(btnAlterarBanco);
       
 //------------------------------------------------------------------------------------------//      
        // ---------------- BOTAO CANCELAR-----//
       btnExcluirBanco = new JButton("Excluir");
       btnExcluirBanco.setBounds(320, 70, 90, 30);       
       btnExcluirBanco.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/excluir2.png"));       
       btnExcluirBanco.setHorizontalTextPosition(SwingConstants.RIGHT);
       btnExcluirBanco.setFont(new Font("Arial", 1, 13));
        
       painelBancario.add(btnExcluirBanco);
       
        
  //------------------------------------------------------------------------------------------//   


//------------------------------------------------------------------------------------------//  
       
          // ---------------- BOTAO GRAVAR-----//
       btnGravar = new JButton("Gravar");
       btnGravar.setBounds(450, 550, 90, 30);       
       btnGravar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));
       btnGravar.setFont(new Font("Arial", 1, 13));
       btnGravar.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelPrincipal.add(btnGravar);
        
          // ---------------- BOTAO CANCELAR-----//
       btnCancelar = new JButton("Cancelar");
       btnCancelar.setBounds(450, 587, 90, 30);       
       btnCancelar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));
       btnCancelar.setFont(new Font("Arial", 1, 13));
       btnCancelar.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelPrincipal.add(btnCancelar);
        
         // ---------------- BOTAO SAIR-----//
       btnSair = new JButton("Sair");
       btnSair.setBounds(450, 625, 90, 30);       
       btnSair.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/sair.png"));
       btnSair.setFont(new Font("Arial", 1, 13));
       btnSair.setHorizontalTextPosition(SwingConstants.RIGHT);
       btnSair.addActionListener((java.awt.event.ActionEvent evt) -> {  
           janela.dispose();
        });
       painelPrincipal.add(btnSair);
       
       
       
       
       
       
       
       
       
        
       criarTabela();
       janela.add(painelPrincipal);
        janela.setVisible(true); 
        
    }
    
     private void criarTabela() {
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        modelo.addColumn("Banco");
        modelo.addColumn("Agência");
        modelo.addColumn("C/C");
        modelo.addColumn("Titular");
        modelo.addColumn("C.P.F");
    

        tblBanco = new JTable();
        tblBanco.setModel(modelo);
        tblBanco.getColumnModel().getColumn(0).setPreferredWidth(103);
        tblBanco.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblBanco.getColumnModel().getColumn(2).setPreferredWidth(105);
        tblBanco.getColumnModel().getColumn(3).setPreferredWidth(140);
        tblBanco.getColumnModel().getColumn(4).setPreferredWidth(130);
        

        tblBanco.getTableHeader().setResizingAllowed(false);
        tblBanco.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblBanco.getTableHeader();
        cabecalho.setFont(new Font("Arial", 1, 11));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblBanco.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblBanco.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        tblBanco.getColumnModel().getColumn(2).setCellRenderer(centralizaColunas);
        tblBanco.getColumnModel().getColumn(3).setCellRenderer(centralizaColunas);
      

        tblBanco.setFont(new Font("Arial", 0, 11));

        scrollTable = new JScrollPane(tblBanco,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(10, 110, 580, 150);
        tblBanco.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelBancario.add(scrollTable);
        
    }
    
    
}
