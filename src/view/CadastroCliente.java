package view;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.MaskFormatter;
import model.CidadeModel;
import model.ClienteModel;

public class CadastroCliente {

    ClienteModel cliente;

    private JFrame janela;
    private JPanel painelCadastro, painelPrincipal, painelPessoa;
    private JLabel lblCodigo, lblNome, lblCPF_CNPJ, lblFantasia, lblEstado, lblCidade;
    private JLabel lblRG_IE, lblEndereco, lblNumero, lblBairro, lblComplemento, lblCEP, lblCadastro, lblCelular, lblTelefone, lblObservacao;
    private JLabel lblPrazo, lblEmail, lblCredito;
    private JTextField txtCodigo, txtNome, txtFantasia, txtEndereco, txtNumero, txtBairro, txtComplemento;
    private JTextField txtPrazo, txtEmail, txtCredito;
    private JFormattedTextField txtCPF_CNPJ, txtDataCadastro, txtCEP, txtCelular, txtTelefone, txtRG_IE;
    private JComboBox cbEstado, cbCidade;
    private JButton btnGravar, btnCancelar, btnSair;
    private JCheckBox cbBloqueado, cbNFE;
    private JRadioButton rdFisica, rdJuridica;
    private ButtonGroup groupPessoa;
    private JScrollPane scrollObs;
    private JTextArea txtObservacao;

    private int id;
    private String bloqueado, nfe;
    private ArrayList<String> idCidades;

    public void desenharTela() throws ParseException {

        janela = new JFrame("Cadastro de Clientes");
        janela.setSize(560, 645);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //-------------- CRIANDO PAINEL --------------------//
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setBounds(0, 05, 560, 645);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        janela.add(painelPrincipal);

        //-------------- CRIANDO PAINEL --------------------//
        painelCadastro = new JPanel();
        painelCadastro.setLayout(null);
        painelCadastro.setBounds(0, 03, 540, 595);
        painelCadastro.setBorder(BorderFactory.createTitledBorder("Cadastro de Clientes"));
        painelPrincipal.add(painelCadastro);

        //---------------CODIGO-----------------//
        lblCodigo = new JLabel("Código ");
        lblCodigo.setBounds(30, 30, 60, 22);
        painelCadastro.add(lblCodigo);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(30, 50, 60, 22);
        txtCodigo.setEditable(false);
        painelCadastro.add(txtCodigo);

        //-------------- CRIANDO PAINEL --------------------//
        painelPessoa = new JPanel();
        painelPessoa.setLayout(null);
        painelPessoa.setBounds(150, 25, 190, 50);
        painelPessoa.setBorder(BorderFactory.createTitledBorder(""));
        painelCadastro.add(painelPessoa);

        rdFisica = new JRadioButton("Fisica");
        rdFisica.setBounds(5, 20, 80, 17);
        rdFisica.setFont(new Font("Arial", 0, 13));
        painelPessoa.add(rdFisica);

        rdJuridica = new JRadioButton("Juridica");
        rdJuridica.setBounds(90, 20, 80, 17);
        rdJuridica.setSelected(true);
        rdJuridica.setFont(new Font("Arial", 0, 13));
        painelPessoa.add(rdJuridica);

        groupPessoa = new ButtonGroup();
        groupPessoa.add(rdFisica);
        groupPessoa.add(rdJuridica);

        painelCadastro.add(painelPessoa);

        //------------------------------------------------------------------------//
        cbNFE = new JCheckBox("NFE");
        cbNFE.setBounds(350, 23, 80, 22);
        painelCadastro.add(cbNFE);

        cbBloqueado = new JCheckBox("Bloqueado");
        cbBloqueado.setBounds(350, 53, 100, 22);
        painelCadastro.add(cbBloqueado);

        //---------------CNPJ / CPF-----------------//
        lblCPF_CNPJ = new JLabel("C.N.P.J.");
        lblCPF_CNPJ.setBounds(30, 80, 120, 22);
        painelCadastro.add(lblCPF_CNPJ);

        txtCPF_CNPJ = new JFormattedTextField(new MaskFormatter("##.###.###/####-##"));
        txtCPF_CNPJ.setFocusLostBehavior(JFormattedTextField.COMMIT);
        txtCPF_CNPJ.setBounds(30, 100, 150, 22);
        painelCadastro.add(txtCPF_CNPJ);

        lblRG_IE = new JLabel("I.E");
        lblRG_IE.setBounds(375, 80, 120, 22);
        painelCadastro.add(lblRG_IE);

        txtRG_IE = new JFormattedTextField(new MaskFormatter("###.###.###.###"));
        txtRG_IE.setFocusLostBehavior(JFormattedTextField.COMMIT);
        txtRG_IE.setBounds(370, 100, 150, 22);
        painelCadastro.add(txtRG_IE);

        //---------------NOME-----------------//
        lblNome = new JLabel("Nome ");
        lblNome.setBounds(30, 130, 120, 22);
        painelCadastro.add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(30, 150, 320, 22);
        painelCadastro.add(txtNome);

        //---------------NOME FANTASIA-----------------//
        lblFantasia = new JLabel("Fantasia ");
        lblFantasia.setBounds(30, 180, 120, 22);
        painelCadastro.add(lblFantasia);

        txtFantasia = new JTextField();
        txtFantasia.setBounds(30, 200, 320, 22);
        painelCadastro.add(txtFantasia);

        //----------------ENDERECO---------------//
        lblEndereco = new JLabel("Endereço ");
        lblEndereco.setBounds(30, 230, 70, 22);
        painelCadastro.add(lblEndereco);

        txtEndereco = new JTextField();
        txtEndereco.setBounds(30, 250, 320, 22);
        painelCadastro.add(txtEndereco);

        //----------------NUMERO---------------//
        lblNumero = new JLabel("Número: ");
        lblNumero.setBounds(370, 230, 125, 22);
        painelCadastro.add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(370, 250, 50, 22);
        painelCadastro.add(txtNumero);

        //----------------COMPLEMENTO---------------//
        lblComplemento = new JLabel("Complemento: ");
        lblComplemento.setBounds(30, 280, 125, 22);
        painelCadastro.add(lblComplemento);

        txtComplemento = new JTextField();
        txtComplemento.setBounds(30, 300, 230, 22);
        painelCadastro.add(txtComplemento);

        //----------------BAIRRO---------------//
        lblBairro = new JLabel("Bairro: ");
        lblBairro.setBounds(280, 280, 125, 22);
        painelCadastro.add(lblBairro);

        txtBairro = new JTextField();
        txtBairro.setBounds(280, 300, 150, 22);
        painelCadastro.add(txtBairro);

        //----------------ESTADO---------------//
        lblEstado = new JLabel("UF ");
        lblEstado.setBounds(30, 330, 120, 22);
        painelCadastro.add(lblEstado);

        cbEstado = new JComboBox();
        cbEstado.setBounds(30, 350, 80, 20);
        painelCadastro.add(cbEstado);

        //----------------CIDADE ---------------//
        lblCidade = new JLabel("Cidade ");
        lblCidade.setBounds(125, 330, 150, 22);
        painelCadastro.add(lblCidade);

        cbCidade = new JComboBox();
        cbCidade.setBounds(120, 350, 170, 20);
        painelCadastro.add(cbCidade);

        //----------------CEP---------------//
        lblCEP = new JLabel("CEP: ");
        lblCEP.setBounds(300, 330, 70, 22);
        painelCadastro.add(lblCEP);

        txtCEP = new JFormattedTextField(new MaskFormatter("#####-###"));
        txtCEP.setFocusLostBehavior(JFormattedTextField.COMMIT);
        txtCEP.setBounds(300, 350, 100, 22);
        painelCadastro.add(txtCEP);

        //----------------TELEFONE---------------//
        lblTelefone = new JLabel("Telefone ");
        lblTelefone.setBounds(30, 380, 80, 22);
        painelCadastro.add(lblTelefone);

        txtTelefone = new JFormattedTextField(new MaskFormatter("(##)####-####"));
        txtTelefone.setFocusLostBehavior(JFormattedTextField.COMMIT);
        txtTelefone.setBounds(30, 400, 120, 22);
        painelCadastro.add(txtTelefone);

        //----------------CELULAR---------------//
        lblCelular = new JLabel("Celular ");
        lblCelular.setBounds(160, 380, 80, 22);
        painelCadastro.add(lblCelular);

        txtCelular = new JFormattedTextField(new MaskFormatter("(##)#####-####"));
        txtCelular.setFocusLostBehavior(JFormattedTextField.COMMIT);
        txtCelular.setBounds(160, 400, 120, 22);
        painelCadastro.add(txtCelular);

        //----------------DATA DE CADASTRO---------------//
        lblCadastro = new JLabel("Data de Cadastro ");
        lblCadastro.setBounds(295, 380, 120, 22);
        painelCadastro.add(lblCadastro);

        txtDataCadastro = new JFormattedTextField(new MaskFormatter("##/##/####"));
        txtDataCadastro.setFocusLostBehavior(JFormattedTextField.COMMIT);
        txtDataCadastro.setBounds(295, 400, 100, 22);
        painelCadastro.add(txtDataCadastro);

        //----------------PRAZO---------------//
        lblPrazo = new JLabel("Prazo ");
        lblPrazo.setBounds(410, 380, 120, 22);
        painelCadastro.add(lblPrazo);

        txtPrazo = new JTextField();
        txtPrazo.setBounds(410, 400, 50, 22);
        txtPrazo.setText("0");
        painelCadastro.add(txtPrazo);

        //----------------EMAIL---------------//
        lblEmail = new JLabel("Email: ");
        lblEmail.setBounds(30, 430, 125, 22);
        painelCadastro.add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(30, 450, 300, 22);
        painelCadastro.add(txtEmail);

        //----------------LIMITE DE CREDITO---------------//
        lblCredito = new JLabel("Limite de Crédito ");
        lblCredito.setBounds(350, 430, 120, 22);
        painelCadastro.add(lblCredito);

        txtCredito = new JTextField();
        txtCredito.setBounds(350, 450, 80, 22);
        txtCredito.setText("0");
        painelCadastro.add(txtCredito);

        //----------------OBSERVACAO---------------//
        lblObservacao = new JLabel("Observação: ");
        lblObservacao.setBounds(30, 480, 125, 22);
        painelCadastro.add(lblObservacao);

        txtObservacao = new JTextArea();
        txtObservacao.setLineWrap(true);
        txtObservacao.setWrapStyleWord(true);

        scrollObs = new JScrollPane(txtObservacao, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollObs.setBounds(115, 480, 308, 100);
        painelCadastro.add(scrollObs);

        // ---------------- BOTAO GRAVAR-----//
        btnGravar = new JButton("Gravar");
        btnGravar.setBounds(430, 480, 90, 30);
        btnGravar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));
        btnGravar.setFont(new Font("Arial", 1, 13));
        btnGravar.setHorizontalTextPosition(SwingConstants.RIGHT);
        painelCadastro.add(btnGravar);

        // ---------------- BOTAO CANCELAR-----//
        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(430, 515, 90, 30);
        btnCancelar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));
        btnCancelar.setFont(new Font("Arial", 1, 13));
        btnCancelar.setHorizontalTextPosition(SwingConstants.RIGHT);

        painelCadastro.add(btnCancelar);

        // ---------------- BOTAO SAIR-----//
        btnSair = new JButton("Sair");
        btnSair.setBounds(430, 550, 90, 30);
        btnSair.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/sair.png"));
        btnSair.setFont(new Font("Arial", 1, 13));
        btnSair.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnSair.addActionListener((java.awt.event.ActionEvent evt) -> {
            janela.dispose();
        });
        painelCadastro.add(btnSair);

        janela.add(painelPrincipal);
        janela.setVisible(true);

        txtCodigo.grabFocus();

    }

    public ClienteModel getCadastroCliente() throws ParseException {
        DateFormat conversor = new SimpleDateFormat("dd/MM/yyyy");
        Date data = conversor.parse(txtDataCadastro.getText());
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if (txtCodigo.getText().equals("")) {
            id = -1;
        } else {
            id = Integer.parseInt(txtCodigo.getText());
        }

        if (cbBloqueado.isSelected()) {
            bloqueado = "T";
        } else {
            bloqueado = "F";
        }

        if (cbNFE.isSelected()) {
            nfe = "T";
        } else {
            nfe = "F";
        }

        cliente = new ClienteModel(id,
                txtNome.getText(),
                txtEndereco.getText(),
                idCidadeSelecionada(),
                txtCEP.getText(),
                txtTelefone.getText(),
                txtRG_IE.getText(),
                txtCPF_CNPJ.getText(),
                dateFormat.format(data),
                txtObservacao.getText(),
                txtCelular.getText(),
                1,//usuario por id
                bloqueado,
                Integer.parseInt(txtPrazo.getText()),
                txtEmail.getText(),
                txtNumero.getText(),
                txtBairro.getText(),
                txtComplemento.getText(),
                SelecionarTipoPessoa(),
                Float.parseFloat(txtCredito.getText()),
                txtFantasia.getText(),
                nfe);

        return cliente;
    }

    public void fecharJanela() {
        janela.dispose();
    }

    public void limparTXT() {
        txtNome.setText("");
        txtEndereco.setText("");
        cbCidade.setSelectedItem(0);
        cbEstado.setSelectedItem(0);
        txtCEP.setText("");
        txtTelefone.setText("");
        txtRG_IE.setText("");
        txtCPF_CNPJ.setText("");
        txtObservacao.setText("");
        txtCelular.setText("");
        txtPrazo.setText("0");
        txtEmail.setText("");
        txtNumero.setText("");
        txtBairro.setText("");
        txtComplemento.setText("");
        txtCredito.setText("0");
        txtFantasia.setText("");
    }

    public int SelecionarTipoPessoa() {
        if (rdJuridica.isSelected()) {
            return 1;
        } else if (rdFisica.isSelected()) {
            return 0;
        }

        return 1;
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

    public void preencherDataCadastro(String data) {
        txtDataCadastro.setText(data);
    }

    public void PessoaFisica() throws ParseException {
        painelCadastro.remove(txtCPF_CNPJ);
        painelCadastro.revalidate();
        txtCPF_CNPJ = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
        txtCPF_CNPJ.setFocusLostBehavior(JFormattedTextField.COMMIT);
        txtCPF_CNPJ.setBounds(30, 100, 150, 22);
        painelCadastro.add(txtCPF_CNPJ);
        painelCadastro.revalidate();
        lblCPF_CNPJ.setText("C.P.F.");

        painelCadastro.remove(txtRG_IE);
        painelCadastro.revalidate();
        txtRG_IE = new JFormattedTextField(new MaskFormatter("##.###.###-#"));
        txtRG_IE.setFocusLostBehavior(JFormattedTextField.COMMIT);
        txtRG_IE.setBounds(370, 100, 150, 22);
        painelCadastro.add(txtRG_IE);
        painelCadastro.revalidate();
        lblRG_IE.setText("R.G.");
    }

    public void PessoaJuridica() throws ParseException {
        painelCadastro.remove(txtCPF_CNPJ);
        painelCadastro.revalidate();
        txtCPF_CNPJ = new JFormattedTextField(new MaskFormatter("##.###.###/####-##"));
        txtCPF_CNPJ.setFocusLostBehavior(JFormattedTextField.COMMIT);
        txtCPF_CNPJ.setBounds(30, 100, 150, 22);
        painelCadastro.add(txtCPF_CNPJ);
        painelCadastro.revalidate();
        lblCPF_CNPJ.setText("C.N.P.J.");

        painelCadastro.remove(txtRG_IE);
        painelCadastro.revalidate();
        txtRG_IE = new JFormattedTextField(new MaskFormatter("###.###.###.###"));
        txtRG_IE.setFocusLostBehavior(JFormattedTextField.COMMIT);
        txtRG_IE.setBounds(370, 100, 150, 22);
        painelCadastro.add(txtRG_IE);
        painelCadastro.revalidate();
        lblRG_IE.setText("I.E.");
    }

    public void preencheTxts(model.ClienteModel cliente) throws ParseException {
        DateFormat conversor = new SimpleDateFormat("yyyy-MM-dd");
        Date data = conversor.parse(cliente.getData_cadastro());
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        if (cliente.getTipo_pessoa() == 1) {
            rdJuridica.setSelected(true);
            PessoaJuridica();
        } else if (cliente.getTipo_pessoa() == 0) {
            rdFisica.setSelected(true);
            PessoaFisica();
        }

        if (cliente.getBloqueado().equals("T")) {
            cbBloqueado.setSelected(true);
        }

        if (cliente.getNfe().equals("T")) {
            cbNFE.setSelected(true);
        }

        txtCodigo.setText("" + cliente.getCod_cliente());
        txtNome.setText(cliente.getNome());
        txtCPF_CNPJ.setText(cliente.getCpf_cnpj());
        txtRG_IE.setText(cliente.getRg_ie());
        txtFantasia.setText(cliente.getFantasia());
        txtEndereco.setText(cliente.getEndereco());
        txtNumero.setText(cliente.getNumero());
        txtComplemento.setText(cliente.getComplemento());
        txtBairro.setText(cliente.getBairro());
        txtCEP.setText(cliente.getCep());
        txtTelefone.setText(cliente.getTelefone());
        txtCelular.setText(cliente.getCelular());
        txtDataCadastro.setText(dateFormat.format(data));
        txtPrazo.setText("" + cliente.getPrazo());
        txtEmail.setText(cliente.getEmail());
        txtCredito.setText("" + cliente.getLimite_credito());
        txtObservacao.setText(cliente.getObs());

    }

    public int retornaIndiceComboEstado() {
        return cbEstado.getSelectedIndex() + 1;
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

    public void selecionaEstadoCliente(int index) {
        cbEstado.setSelectedIndex(index - 1);
    }

    public int idCidadeSelecionada() {
        return Integer.parseInt(idCidades.get(cbCidade.getSelectedIndex()));
    }

    public void addGravarListener(ActionListener al) {
        btnGravar.addActionListener(al);
    }

    public void addCancelarListener(ActionListener al) {
        btnCancelar.addActionListener(al);
    }

    public void addSairListener(ActionListener al) {
        btnSair.addActionListener(al);
    }

    public void addSelecionarTipoPessoaListener(ActionListener al) {
        rdFisica.addActionListener(al);
        rdJuridica.addActionListener(al);
    }

    public void addSelecionarEstadoListener(ItemListener it) {
        cbEstado.addItemListener(it);
    }

}
