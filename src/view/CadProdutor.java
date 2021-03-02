package view;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import model.CidadeModel;
import model.Conta_ProdutorModel;
import model.ProdutorModel;

public class CadProdutor {

    ProdutorModel produtor;
    model.Conta_ProdutorModel conta;

    private JFrame janela;
    private JPanel painelPrincipal, painelPesssoa, painelBancario;
    private JLabel lblCodigo, lblRazao, lblEndereco, lblBairro, lblCidade, lblEstado, lblCEP, lblTelefone, lblRG_IE, lblCPF_CNPJ, lblEmail;
    private JLabel lblBanco, lblAgencia, lblCorrente, lblTitular, lblCPFBANCO, lblObservacao;
    private JTextField txtBanco, txtAgencia, txtCorrente, txtTitular;
    private JTextField txtCodigo, txtRazao, txtEndereco, txtBairro, txtEmail, txtObservacao;
    private JButton btnGravarBanco, btnCancelarBanco, btnAlterarBanco, btnExcluirBanco, btnGravar, btnCancelar, btnSair;
    private DefaultTableModel modelo;
    private JTable tblBanco;
    private JScrollPane scrollTable;
    private ButtonGroup groupPessoa;
    private JRadioButton rdFisica, rdJuridica;
    private JCheckBox cbBloqueado;
    private JComboBox cbCidade, cbEstado;
    private JFormattedTextField txtCEP, txtTelefone, txtCPFBANCO, txtRG_IE, txtCPF_CNPJ;

    private int id;
    private String bloqueado;
    private ArrayList<String> idCidades;
    private ArrayList<model.Conta_ProdutorModel> contasBancarias;

    public void desenharTela() throws ParseException {

        janela = new JFrame("Cadastro de Produtor/Fornecedor");
        janela.setSize(625, 670);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);

        //-------------- CRIANDO PAINEL --------------------//
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setBounds(5, 05, 610, 630);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));

        //---------------CODIGO-----------------//
        lblCodigo = new JLabel("Código ");
        lblCodigo.setBounds(20, 10, 60, 22);
        painelPrincipal.add(lblCodigo);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(20, 30, 60, 22);
        txtCodigo.setEnabled(false);
        painelPrincipal.add(txtCodigo);

        //---------------RAZAO SOCIAL-----------------//
        lblRazao = new JLabel("Razão Social ");
        lblRazao.setBounds(20, 50, 100, 22);
        painelPrincipal.add(lblRazao);

        txtRazao = new JTextField();
        txtRazao.setBounds(20, 70, 340, 22);
        painelPrincipal.add(txtRazao);

        //---------------RG_IE-----------------//
        lblRG_IE = new JLabel("I.E. ");
        lblRG_IE.setBounds(20, 90, 100, 22);
        painelPrincipal.add(lblRG_IE);

        txtRG_IE = new JFormattedTextField(new MaskFormatter("###.###.###.###"));
        txtRG_IE.setFocusLostBehavior(JFormattedTextField.COMMIT);
        txtRG_IE.setBounds(20, 110, 140, 22);
        painelPrincipal.add(txtRG_IE);

        //---------------CPF_CNPJ-----------------//
        lblCPF_CNPJ = new JLabel("C.N.P.J.");
        lblCPF_CNPJ.setBounds(180, 90, 100, 22);
        painelPrincipal.add(lblCPF_CNPJ);

        txtCPF_CNPJ = new JFormattedTextField(new MaskFormatter("##.###.###/####-##"));
        txtCPF_CNPJ.setFocusLostBehavior(JFormattedTextField.COMMIT);
        txtCPF_CNPJ.setBounds(180, 110, 140, 22);
        painelPrincipal.add(txtCPF_CNPJ);

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
        cbEstado.setBounds(555, 150, 50, 22);
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

        //---------------Email-----------------//
        lblEmail = new JLabel("Email");
        lblEmail.setBounds(280, 170, 100, 22);
        painelPrincipal.add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(280, 190, 320, 22);
        painelPrincipal.add(txtEmail);

        cbBloqueado = new JCheckBox("Bloqueado");
        cbBloqueado.setBounds(420, 25, 120, 22);
        painelPrincipal.add(cbBloqueado);

        lblObservacao = new JLabel("Observação:");
        lblObservacao.setBounds(20, 520, 100, 22);
        painelPrincipal.add(lblObservacao);

        txtObservacao = new JTextField();
        txtObservacao.setBounds(100, 520, 320, 100);
        painelPrincipal.add(txtObservacao);

        //-------------- CRIANDO PAINEL  BANCARIO--------------------//
        painelBancario = new JPanel();
        painelBancario.setLayout(null);
        painelBancario.setBounds(5, 220, 600, 280);
        painelBancario.setBorder(BorderFactory.createTitledBorder("Dados Bancários"));

        //--------------BANCO-------------------//
        lblBanco = new JLabel("Banco");
        lblBanco.setBounds(10, 20, 80, 22);
        painelBancario.add(lblBanco);

        txtBanco = new JTextField();
        txtBanco.setBounds(10, 40, 80, 22);
        painelBancario.add(txtBanco);

        //--------------AGENCIA-------------------//
        lblAgencia = new JLabel("Agência");
        lblAgencia.setBounds(100, 20, 100, 22);
        painelBancario.add(lblAgencia);

        txtAgencia = new JTextField();
        txtAgencia.setBounds(100, 40, 50, 22);
        painelBancario.add(txtAgencia);

        //--------------CONTA CORRENTE-------------------//
        lblCorrente = new JLabel("Conta Corrente");
        lblCorrente.setBounds(160, 20, 100, 22);
        painelBancario.add(lblCorrente);

        txtCorrente = new JTextField();
        txtCorrente.setBounds(160, 40, 80, 22);
        painelBancario.add(txtCorrente);

        //--------------TITULAR-------------------//
        lblTitular = new JLabel("Titular");
        lblTitular.setBounds(260, 20, 100, 22);
        painelBancario.add(lblTitular);

        txtTitular = new JTextField();
        txtTitular.setBounds(260, 40, 200, 22);
        painelBancario.add(txtTitular);

        //--------------CPF BANCO-------------------//
        lblCPFBANCO = new JLabel("C.P.F");
        lblCPFBANCO.setBounds(470, 20, 100, 22);
        painelBancario.add(lblCPFBANCO);

        txtCPFBANCO = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
        txtCPFBANCO.setBounds(470, 40, 120, 22);
        painelBancario.add(txtCPFBANCO);

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

        painelPrincipal.add(painelBancario);
        //-------------------------------------------------------------------------------------------//

        //-------------- CRIANDO PAINEL  PESSOA--------------------//
        painelPesssoa = new JPanel();
        painelPesssoa.setLayout(null);
        painelPesssoa.setBounds(200, 10, 200, 50);
        painelPesssoa.setBorder(BorderFactory.createTitledBorder("Pessoa"));

        rdFisica = new JRadioButton("Física");
        rdFisica.setBounds(5, 22, 80, 17);
        rdFisica.setFont(new Font("ArialBlack", 0, 12));
        painelPesssoa.add(rdFisica);

        rdJuridica = new JRadioButton("Juridica");
        rdJuridica.setBounds(90, 22, 80, 17);
        rdJuridica.setFont(new Font("ArialBlack", 0, 12));
        rdJuridica.setSelected(true);
        painelPesssoa.add(rdJuridica);

        groupPessoa = new ButtonGroup();
        groupPessoa.add(rdFisica);
        groupPessoa.add(rdJuridica);

        painelPrincipal.add(painelPesssoa);
        //---------------------------------------------------------------------------------------//

        //-------------------------------------------------------------------------------------------//
        // ---------------- BOTAO GRAVAR-----//
        btnGravar = new JButton("Gravar");
        btnGravar.setBounds(450, 520, 90, 30);
        btnGravar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));
        btnGravar.setFont(new Font("Arial", 1, 13));
        btnGravar.setHorizontalTextPosition(SwingConstants.RIGHT);

        painelPrincipal.add(btnGravar);

        // ---------------- BOTAO CANCELAR-----//
        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(450, 555, 90, 30);
        btnCancelar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));
        btnCancelar.setFont(new Font("Arial", 1, 13));
        btnCancelar.setHorizontalTextPosition(SwingConstants.RIGHT);

        painelPrincipal.add(btnCancelar);

        // ---------------- BOTAO SAIR-----//
        btnSair = new JButton("Sair");
        btnSair.setBounds(450, 590, 90, 30);
        btnSair.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/sair.png"));
        btnSair.setFont(new Font("Arial", 1, 13));
        btnSair.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnSair.addActionListener((java.awt.event.ActionEvent evt) -> {
            janela.dispose();
        });
        painelPrincipal.add(btnSair);
        //-------------------------------------------------------------------------------------------//

        //-------------------------------------------------------------------------------------------//
        criarTabela();
        janela.add(painelPrincipal);
        janela.setVisible(true);

        txtCodigo.grabFocus();

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

        scrollTable = new JScrollPane(tblBanco, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(10, 110, 580, 150);
        tblBanco.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelBancario.add(scrollTable);

    }

    public ProdutorModel getCadastroProdutor() throws ParseException {
        idCidadeSelecionada();
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

        produtor = new ProdutorModel(id,
                txtRazao.getText(),
                "",//txtFantasia.getText(),
                SelecionarTipoPessoa(),
                txtEndereco.getText(),
                txtBairro.getText(),
                idCidadeSelecionada(),
                txtCEP.getText(),
                txtTelefone.getText(),
                txtCPF_CNPJ.getText(),
                txtRG_IE.getText(),
                txtObservacao.getText(),
                1,
                bloqueado);

        return produtor;
    }

    public ArrayList<model.Conta_ProdutorModel> getContasBancarias() {
        return contasBancarias;
    }

    public void fecharJanela() {
        janela.dispose();
    }

    public void limparTXT() {
        txtRazao.setText("");
        txtEndereco.setText("");
        cbCidade.setSelectedItem(0);
        cbEstado.setSelectedItem(0);
        txtCEP.setText("");
        txtTelefone.setText("");
        txtRG_IE.setText("");
        txtCPF_CNPJ.setText("");
        txtObservacao.setText("");
        txtEmail.setText("");
        txtBairro.setText("");
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

    public void PessoaFisica() throws ParseException {
        painelPrincipal.remove(txtCPF_CNPJ);
        painelPrincipal.revalidate();
        txtCPF_CNPJ = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
        txtCPF_CNPJ.setFocusLostBehavior(JFormattedTextField.COMMIT);
        txtCPF_CNPJ.setBounds(180, 110, 140, 22);
        painelPrincipal.add(txtCPF_CNPJ);
        painelPrincipal.revalidate();
        lblCPF_CNPJ.setText("C.P.F.");

        painelPrincipal.remove(txtRG_IE);
        painelPrincipal.revalidate();
        txtRG_IE = new JFormattedTextField(new MaskFormatter("##.###.###-#"));
        txtRG_IE.setFocusLostBehavior(JFormattedTextField.COMMIT);
        txtRG_IE.setBounds(20, 110, 140, 22);
        painelPrincipal.add(txtRG_IE);
        painelPrincipal.revalidate();
        lblRG_IE.setText("R.G.");
    }

    public void PessoaJuridica() throws ParseException {
        painelPrincipal.remove(txtCPF_CNPJ);
        painelPrincipal.revalidate();
        txtCPF_CNPJ = new JFormattedTextField(new MaskFormatter("##.###.###/####-##"));
        txtCPF_CNPJ.setFocusLostBehavior(JFormattedTextField.COMMIT);
        txtCPF_CNPJ.setBounds(180, 110, 140, 22);
        painelPrincipal.add(txtCPF_CNPJ);
        painelPrincipal.revalidate();
        lblCPF_CNPJ.setText("C.N.P.J.");

        painelPrincipal.remove(txtRG_IE);
        painelPrincipal.revalidate();
        txtRG_IE = new JFormattedTextField(new MaskFormatter("###.###.###.###"));
        txtRG_IE.setFocusLostBehavior(JFormattedTextField.COMMIT);
        txtRG_IE.setBounds(20, 110, 140, 22);
        painelPrincipal.add(txtRG_IE);
        painelPrincipal.revalidate();
        lblRG_IE.setText("I.E.");
    }

    public void preencheTxts(model.ProdutorModel produtor) throws ParseException {

        if (produtor.getTipo_pessoa() == 1) {
            rdJuridica.setSelected(true);
            PessoaJuridica();
        } else if (produtor.getTipo_pessoa() == 0) {
            rdFisica.setSelected(true);
            PessoaFisica();
        }

        if (produtor.getBloqueado().equals("T")) {
            cbBloqueado.setSelected(true);
        }

        txtCodigo.setText("" + produtor.getCod_produtor());
        txtRazao.setText(produtor.getNome());
        txtCPF_CNPJ.setText(produtor.getCpf_cnpj());
        txtRG_IE.setText(produtor.getRg_ie());
        //txtFantasia.setText(produtor.getFantasia());
        txtEndereco.setText(produtor.getEndereco());
        txtBairro.setText(produtor.getBairro());
        txtCEP.setText(produtor.getCep());
        txtTelefone.setText(produtor.getTelefone());
        // txtEmail.setText(produtor.getEmail());
        txtObservacao.setText(produtor.getObs());

    }

    public int retornaIndiceComboEstado() {
        return cbEstado.getSelectedIndex() + 1;
    }

    public void alteraCidadeProdutor(int cod_cidade) {
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

    public void selecionaEstadoProdutor(int index) {
        cbEstado.setSelectedIndex(index - 1);
    }

    public int idCidadeSelecionada() {
        return Integer.parseInt(idCidades.get(cbCidade.getSelectedIndex()));
    }

    public void iniciarListaContasBancarias() {
        contasBancarias = new ArrayList<model.Conta_ProdutorModel>();
    }

    public void adicionarContaBancaria() {
        contasBancarias.add(new Conta_ProdutorModel(txtBanco.getText(), txtAgencia.getText(), txtCorrente.getText(),
                txtTitular.getText(), txtCPFBANCO.getText()));
        modelo.addRow(new Object[]{txtBanco.getText(), txtAgencia.getText(), txtCorrente.getText(),
            txtTitular.getText(), txtCPFBANCO.getText()});

    }

    public model.Conta_ProdutorModel getConta_Produtor() {
        conta = new Conta_ProdutorModel(txtBanco.getText(), txtAgencia.getText(), txtCorrente.getText(),
                txtTitular.getText(), txtCPFBANCO.getText());
        return conta;
    }

    public void alterarContaBancaria(int index) {
        if (tblBanco.getSelectedRow() != -1) {
            contasBancarias.set(index, new Conta_ProdutorModel(txtBanco.getText(), txtAgencia.getText(), txtCorrente.getText(),
                    txtTitular.getText(), txtCPFBANCO.getText()));
        }
    }

    public void limpaTxtContasBancos() {
        txtBanco.setText("");
        txtAgencia.setText("");
        txtCorrente.setText("");
        txtTitular.setText("");
        txtCPFBANCO.setText("");
    }

    public void removerContaBancaria() {
        if (tblBanco.getSelectedRow() != -1) {
            contasBancarias.remove(tblBanco.getSelectedRow());
            modelo.removeRow(tblBanco.getSelectedRow());
        }
    }

    public ArrayList<model.Conta_ProdutorModel> retornarContasBancarias() {
        return contasBancarias;
    }

    public void preencherTabela(ArrayList<model.Conta_ProdutorModel> contas) throws SQLException {
        limparTabela();
        Iterator<model.Conta_ProdutorModel> it = contas.iterator();
        while (it.hasNext()) {
            model.Conta_ProdutorModel conta = it.next();
            modelo.addRow(new Object[]{conta.getBanco(), conta.getAgencia(), conta.getConta_corrente(),
                conta.getTitular(), conta.getCpf()});
        }
    }

    public void limparTabela() {
        modelo = (DefaultTableModel) tblBanco.getModel();
        if (modelo.getRowCount() > 0) {
            int rows = modelo.getRowCount();
            for (int i = rows - 1; i >= 0; i--) {
                modelo.removeRow(i);
            }
        }
    }

    public int obterIndiceLinhaBanco() {
        int indiceLinha = tblBanco.getSelectedRow();
        if (indiceLinha != -1) {
            return indiceLinha;
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum produtor foi selecionado", "Selecione o produtor", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    public int obterIdProdutor() {
        return Integer.parseInt(txtCodigo.getText());
    }

    public void preencherTxtsBancos() {
        int indiceLinha = tblBanco.getSelectedRow();
        if (indiceLinha != -1) {
            txtBanco.setText(tblBanco.getValueAt(indiceLinha, 0).toString());
            txtAgencia.setText(tblBanco.getValueAt(indiceLinha, 1).toString());
            txtCorrente.setText(tblBanco.getValueAt(indiceLinha, 2).toString());
            txtTitular.setText(tblBanco.getValueAt(indiceLinha, 3).toString());
            txtCPFBANCO.setText(tblBanco.getValueAt(indiceLinha, 4).toString());

        }
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

    public void addGravarBancoListener(ActionListener al) {
        btnGravarBanco.addActionListener(al);
    }

    public void addCancelarBancoListener(ActionListener al) {
        btnCancelarBanco.addActionListener(al);
    }

    public void addAlterarBancoListener(ActionListener al) {
        btnAlterarBanco.addActionListener(al);
    }

    public void addExcluirBancoListener(ActionListener al) {
        btnExcluirBanco.addActionListener(al);
    }

    public void addClickTableListener(MouseListener ml) {
        tblBanco.addMouseListener(ml);
    }

}
