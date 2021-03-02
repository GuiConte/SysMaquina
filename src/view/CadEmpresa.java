package view;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
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
import model.EmpresaModel;
import model.CidadeModel;
import model.ProdutorModel;

public class CadEmpresa {

    model.EmpresaModel empresa;

    private JFrame janela;
    private JPanel painelCadastro, painelParametro, painelPrincipal;
    private JLabel lblEmpresa, lblFantasia, lblIE, lblEndereco, lblMensagem, lblCNPJ, lblEstado, lblBairro, lblCidade, lblCEP, lblTelefone, lblBonificacao;
    private JTextField txtEmpresa, txtFantasia, txtIE, txtMensagem, txtEndereco, txtBairro, txtbonificacao,txtCod;
    private JButton btnGravar, btnCancelar, btnSair, btnAlterar;
    private JFormattedTextField txtCEP, txtTelefone, txtCNPJ;
    private JComboBox cbCidade, cbEstado;
    //painel com abas//

    private JPanel cadastro, baixa, alteracao, exclusao, vizualizao;

    private int id;
    private ArrayList<String> idCidades;

    public void desenharTela() throws ParseException {

        janela = new JFrame("Cadastro de Empresa");
        janela.setSize(525, 350);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //-------------- CRIANDO PAINEL PRINCIAL --------------------//
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setBounds(0, 02, 510, 310);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        janela.add(painelPrincipal);

        //-------------- CRIANDO PAINEL --------------------//
        painelCadastro = new JPanel();
        painelCadastro.setLayout(null);
        painelCadastro.setBounds(0, 05, 380, 300);
        painelCadastro.setBorder(BorderFactory.createTitledBorder("Cadastro de Empresa"));
        painelPrincipal.add(painelCadastro);

        //-----------------NOME EMPRESA--------------//
        lblEmpresa = new JLabel("Empresa: ");
        lblEmpresa.setBounds(30, 30, 120, 22);
        painelCadastro.add(lblEmpresa);

        txtEmpresa = new JTextField();
        txtEmpresa.setBounds(90, 30, 280, 22);
        painelCadastro.add(txtEmpresa);
        
         txtCod = new JTextField();
        txtCod.setBounds(90, 30, 280, 22);
        painelCadastro.add(txtCod);

        //---------------NOME FANTASIA-----------------//
        lblFantasia = new JLabel("Fantasia: ");
        lblFantasia.setBounds(30, 60, 120, 22);
        painelCadastro.add(lblFantasia);

        txtFantasia = new JTextField();
        txtFantasia.setBounds(90, 60, 280, 22);
        painelCadastro.add(txtFantasia);

        //---------------CNPJ / CPF-----------------//
        lblCNPJ = new JLabel("CNPJ:");
        lblCNPJ.setBounds(50, 90, 120, 22);
        painelCadastro.add(lblCNPJ);

        txtCNPJ = new JFormattedTextField(new MaskFormatter("##.###.###/###-##"));
        txtCNPJ.setBounds(90, 90, 280, 22);
        painelCadastro.add(txtCNPJ);

        //---------------INSCRIÇÃO ESTADUAL-----------------//
        lblIE = new JLabel("I.E: ");
        lblIE.setBounds(70, 120, 120, 22);
        painelCadastro.add(lblIE);

        txtIE = new JTextField();
        txtIE.setBounds(90, 120, 280, 22);
        painelCadastro.add(txtIE);

        //----------------ENDERECO---------------//
        lblEndereco = new JLabel("Endereço: ");
        lblEndereco.setBounds(25, 150, 70, 22);
        painelCadastro.add(lblEndereco);

        txtEndereco = new JTextField();
        txtEndereco.setBounds(90, 150, 280, 22);
        painelCadastro.add(txtEndereco);

        //----------------BAIRRO---------------//
        lblBairro = new JLabel("Bairro: ");
        lblBairro.setBounds(45, 180, 125, 22);
        painelCadastro.add(lblBairro);

        txtBairro = new JTextField();
        txtBairro.setBounds(90, 180, 170, 22);
        painelCadastro.add(txtBairro);

        //----------------CIDADE ---------------//
        lblCidade = new JLabel("Cidade: ");
        lblCidade.setBounds(40, 210, 150, 22);
        painelCadastro.add(lblCidade);

        cbCidade = new JComboBox();
        cbCidade.setBounds(90, 210, 170, 22);
        painelCadastro.add(cbCidade);

        //----------------ESTADO---------------//
        lblEstado = new JLabel("UF: ");
        lblEstado.setBounds(270, 210, 50, 22);
        painelCadastro.add(lblEstado);

        cbEstado = new JComboBox();
        cbEstado.setBounds(295, 210, 60, 22);
        painelCadastro.add(cbEstado);

        //----------------CEP---------------//
        lblCEP = new JLabel("CEP: ");
        lblCEP.setBounds(55, 240, 70, 22);
        painelCadastro.add(lblCEP);

        txtCEP = new JFormattedTextField(new MaskFormatter("#####-###"));
        txtCEP.setBounds(90, 240, 90, 22);
        painelCadastro.add(txtCEP);

        //----------------TELEFONE---------------//
        lblTelefone = new JLabel("Telefone:");
        lblTelefone.setBounds(190, 240, 80, 22);
        painelCadastro.add(lblTelefone);

        txtTelefone = new JFormattedTextField(new MaskFormatter("(##)####-####"));
        txtTelefone.setBounds(245, 240, 100, 22);
        painelCadastro.add(txtTelefone);

        lblMensagem = new JLabel("Mensagem:");
        lblMensagem.setBounds(20, 270, 80, 22);
        painelCadastro.add(lblMensagem);

        txtMensagem = new JTextField();
        txtMensagem.setBounds(90, 270, 280, 22);
        painelCadastro.add(txtMensagem);

        //------------CRIANDO PAINEL PARAMETRO ----------------//
        painelParametro = new JPanel();
        painelParametro.setLayout(null);
        painelParametro.setBorder(BorderFactory.createTitledBorder("Parametro"));
        painelParametro.setBounds(390, 05, 110, 80);
        janela.add(painelParametro);

        //----------------BONIFICAÇÃO---------------//
        lblBonificacao = new JLabel("Bonificação ");
        lblBonificacao.setBounds(20, 20, 100, 22);
        painelParametro.add(lblBonificacao);

        txtbonificacao = new JTextField();
        txtbonificacao.setBounds(20, 45, 70, 22);
        painelParametro.add(txtbonificacao);

        // ---------------- BOTAO GRAVAR-----//
        btnGravar = new JButton("Gravar");
        btnGravar.setBounds(400, 170, 100, 30);
        btnGravar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));
        btnGravar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnGravar.setFont(new Font("Arial", 1, 13));
        painelPrincipal.add(btnGravar);

        // ---------------- BOTAO ALTERAR-----//
        btnAlterar = new JButton("Alterar");
        btnAlterar.setBounds(400, 205, 100, 30);
        btnAlterar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/alterar2.png"));
        btnAlterar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnAlterar.setFont(new Font("Arial", 1, 13));
        painelPrincipal.add(btnAlterar);

        // ---------------- BOTAO CANCELAR-----//
        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(400, 240, 100, 30);
        btnCancelar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));
        btnCancelar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnCancelar.setFont(new Font("Arial", 1, 13));

        painelPrincipal.add(btnCancelar);

        // ---------------- BOTAO SAIR-----//
        btnSair = new JButton("Sair");
        btnSair.setBounds(400, 275, 100, 30);
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

    public void preencheComboBoxEstado(ArrayList<String> listaEstados) {
        Iterator<String> it = listaEstados.iterator();
        while (it.hasNext()) {
            String estado = it.next();
            cbEstado.addItem(estado);
        }
    }

    public void preencheComboBoxCidade(ArrayList<model.CidadeModel> listaCidades) {
        cbCidade.removeAllItems();
        idCidades = new ArrayList<String>();
        Iterator<model.CidadeModel> it = listaCidades.iterator();
        while (it.hasNext()) {
            CidadeModel cidade = it.next();
            idCidades.add("" + cidade.getCod_cidade());
            cbCidade.addItem(cidade.getCidade());
        }
    }

    public int retornaIndiceComboEstado() {
        return cbEstado.getSelectedIndex() + 1;
    }

    public int idCidadeSelecionada() {
        return Integer.parseInt(idCidades.get(cbCidade.getSelectedIndex()));
    }

    public model.EmpresaModel getCadastroEmpresa() {
        
        empresa = new EmpresaModel(txtEmpresa.getText(),
                txtFantasia.getText(),
                txtCNPJ.getText(),
                txtIE.getText(),
                txtEndereco.getText(),
                txtBairro.getText(),
                idCidadeSelecionada(),
                txtCEP.getText(),
                txtTelefone.getText(),
                txtMensagem.getText());

        return empresa;
    }
    
     public void preencheTxts(model.EmpresaModel empresa) throws ParseException {
       
       
        txtEmpresa.setText(empresa.getEmpresa());
        txtFantasia.setText(empresa.getFantasia());
        txtCNPJ.setText(empresa.getCnpj());
        txtIE.setText(empresa.getIe());
        txtEndereco.setText(empresa.getEndereco());
        txtBairro.setText(empresa.getBairro());
        txtCEP.setText(empresa.getCep());
        txtTelefone.setText(empresa.getTelefone());
        txtMensagem.setText(empresa.getMensagem());
        
    }
     

    public void alteraCidadeCliente(int cod_cidade) {
        Iterator<String> it = idCidades.iterator();
        int index = 0, i = 0;
        while (it.hasNext()) {
            int aux = Integer.parseInt(it.next());
            if (aux == cod_cidade) {
                index = i;
                break;
            }
            i++;
        }
        cbCidade.setSelectedIndex(index);
    }
    

    public void addSelecionarEstadoListener(ItemListener it) {
        cbEstado.addItemListener(it);
    }

    public void addGravarListener(ActionListener al) {
        btnGravar.addActionListener(al);
    }

}
