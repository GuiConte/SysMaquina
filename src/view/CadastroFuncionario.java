package view;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CadastroFuncionario {

    private JFrame janela;
    private JPanel painelCadastro, painelTipo, painelPermissao, painelComissao, painelPrincipal;
    private JLabel lblCodigo, lblFuncionario, lblSenha, lblComissao;
    private JTextField txtCodigo, txtFuncionario, txtSenha, txtComissao;
    private JComboBox cbTipo;    
    private JButton btnOK,btnCancelar;

    //-------------PAINEL COM ABAS-----------//
    private JPanel cadastro, baixa, alteracao, exclusao, visualizacao;

    //----------------ABA CADASTRO---------------//
    private JCheckBox cadProduto, cadCliente, cadProdForn, cadFornecedor, cadMotorista;
    private JCheckBox fluxoCaixa, cadCheque, cadProdutoEst, liberResCaixa, liberFinanceira, libeCaixa, Tabelas;

    //----------------ABA BAIXA---------------//
    private JCheckBox baixaCompra, baixaContasPag, baixaFrete, baixaLavacao, baixaMaquinacao;
    private JCheckBox baixaSaidaSac, baixaEntradaSac, baixaCamaraFria, baixaCompraDiv, baixaVendaDiv;

    //----------------ABA ALTERAÇÃO---------------//
    
    private JCheckBox altVenda, altCompra, altContaPagar, altFrete, altLavacao,altMaquinacao, altAlteracao;
    private JCheckBox altSaidaSac, altEntradaSac,altCamaraFria, altCompraDiv, altVendaDiv, altCaixa;
    //----------------ABA EXCLUSAO---------------//
    
     private JCheckBox exVenda, exCompra, exContaPagar, exFrete, exLavacao, exMaquinacao, extAlteracao;
    private JCheckBox exSaidaSac, exEntradaSac,exCamaraFria, exCompraDiv, exVendaDiv, exCaixa;
    
    //----------------ABA VISUALIZAÇÃO---------------//
    
    private JCheckBox vsVenda, vsCompra, vsContaPagar, vsFrete, vsLavacao, vsMaquinacao, vsSacarias,vsCheque,vsCamaraFria;
    private JCheckBox vsCompraDiv, vsVendaDiv, vsCaixa, vsRespFinanceiro, vsEntradaProd, vsRelatorioViagem, vsMovimentacao,vsCupomFiscal,vsFechamentoSaldo;
    private JCheckBox vsChequeEmitido, vsRastreabilidade, vsRastrearVenda;
    
    
    
    public void desenharTela() {

        janela = new JFrame("Cadastro de Funcionário");
        janela.setSize(540, 560);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        
        //-------------- CRIANDO PAINEL PRINCIAL --------------------//
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(540, 560);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        
        
                

        //-------------- CRIANDO PAINEL --------------------//
        painelCadastro = new JPanel();
        painelCadastro.setLayout(null);
        painelCadastro.setBounds(0, 05, 410, 100);
        
        painelCadastro.setBorder(BorderFactory.createTitledBorder("Cadastro de Funcionário"));
        painelPrincipal.add(painelCadastro);

        
        
        //---------------CODIGO-----------------//
        lblCodigo = new JLabel("Código: ");
        lblCodigo.setBounds(30, 30, 60, 22);
        painelCadastro.add(lblCodigo);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(80, 30, 60, 22);
        painelCadastro.add(txtCodigo);

        //---------------FUNCIONARIO-----------------//
        lblFuncionario = new JLabel("Funcionário: ");
        lblFuncionario.setBounds(160, 30, 80, 22);
        painelCadastro.add(lblFuncionario);

        txtFuncionario = new JTextField();
        txtFuncionario.setBounds(240, 30, 110, 22);
        painelCadastro.add(txtFuncionario);

        //---------------SENHA-----------------//
        lblSenha = new JLabel("Senha: ");
        lblSenha.setBounds(30, 60, 80, 22);
        painelCadastro.add(lblSenha);

        txtSenha = new JTextField();
        txtSenha.setBounds(80, 60, 90, 22);
        painelCadastro.add(txtSenha);

        //------------CRIANDO PAINEL PARAMETRO ----------------//
        painelTipo = new JPanel();
        painelTipo.setLayout(null);
        painelTipo.setBorder(BorderFactory.createTitledBorder("Tipo"));
        painelTipo.setBounds(0, 110, 230, 80);
        painelPrincipal.add(painelTipo);

        //-------------COMBO TIPO---------------//
        cbTipo = new JComboBox();
        cbTipo.setBounds(30, 30, 150, 22);
        painelTipo.add(cbTipo);

        //------------CRIANDO PAINEL COMISSAO ----------------//
        painelComissao = new JPanel();
        painelComissao.setLayout(null);
        painelComissao.setBorder(BorderFactory.createTitledBorder("Comissão %"));        
        painelComissao.setBounds(250, 110, 160, 80);
        painelPrincipal.add(painelComissao);

        //----------------BONIFICAÇÃO---------------//
        txtComissao = new JTextField();
        txtComissao.setBounds(25, 30, 110, 22);
        painelComissao.add(txtComissao);
        
        

        //------------CRIANDO PAINEL PERMISSAO ----------------//
         painelPermissao = new JPanel();
        painelPermissao.setLayout(null);        
        painelPermissao.setBorder(BorderFactory.createTitledBorder("Permissões"));
        painelPermissao.setBounds(0, 200, 410, 310);
        painelPrincipal.add(painelPermissao);
        
        
        //----------- PAINEL COM ABAS-----------------//
        cadastro = new JPanel();
        cadastro.setLayout(null);
        cadastro.setSize(680, 500);

        baixa = new JPanel();
        baixa.setLayout(null);
        baixa.setSize(680, 500);

        alteracao = new JPanel();
        alteracao.setLayout(null);
        alteracao.setSize(680, 500);

        exclusao = new JPanel();
        exclusao.setLayout(null);
        exclusao.setSize(680, 500);

        visualizacao = new JPanel();
        visualizacao.setLayout(null);
        visualizacao.setSize(680, 500);
        
        
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(5, 30, 390, 270);
        tp.add("Cadastro", cadastro);
        tp.add("Baixa", baixa);
        tp.add("Alteração", alteracao);
        tp.add("Exclusão", exclusao);
        tp.add("Visualização", visualizacao);

        painelPermissao.add(tp);

        //----------------ABA CADASTRO---------------//
        //-------------CHECKBOX CADASTRO DE PRODUTO----------//
        cadProduto = new JCheckBox("Cad.Produtos");
        cadProduto.setBounds(10, 10, 120, 22);
        cadastro.add(cadProduto);

        //-------------CHECKBOX CADASTRO DE CLIENTE----------//
        cadCliente = new JCheckBox("Cad.Clientes");
        cadCliente.setBounds(10, 30, 120, 22);
        cadastro.add(cadCliente);

        //-------------CHECKBOX CADASTRO DE PRODUTO/ FORNECEDOR----------//
        cadProdForn = new JCheckBox("Cad.Produto/Fornecedor");
        cadProdForn.setBounds(10, 50, 170, 22);
        cadastro.add(cadProdForn);

        //-------------CHECKBOX CADASTRO FORNECEDOR----------//
        cadFornecedor = new JCheckBox("Cad.Fornecedor");
        cadFornecedor.setBounds(10, 70, 120, 22);
        cadastro.add(cadFornecedor);

        //-------------CHECKBOX CADASTRO MOTORISTA----------//
        cadMotorista = new JCheckBox("Cad.Motorista");
        cadMotorista.setBounds(10, 90, 120, 22);
        cadastro.add(cadMotorista);

        //-------------CHECKBOX CADASTRO CAIXA----------//
        fluxoCaixa = new JCheckBox("Fluxo de Caixa");
        fluxoCaixa.setBounds(10, 110, 120, 22);
        cadastro.add(fluxoCaixa);

        //-------------CHECKBOX CADASTRO CHEQUE----------//
        cadCheque = new JCheckBox("Cad.Cheque");
        cadCheque.setBounds(190, 10, 120, 22);
        cadastro.add(cadCheque);

        //-------------CHECKBOX CADASTRO DE PRODUTO ESTOQUE----------//
        cadProdutoEst = new JCheckBox("Cad.Produ Estoque");
        cadProdutoEst.setBounds(190, 30, 140, 22);
        cadastro.add(cadProdutoEst);

        //-------------CHECKBOX CADASTRO DE RESTRIÇÃO CAIXA----------//
        liberResCaixa = new JCheckBox("Liberação Restrição Caixa");
        liberResCaixa.setBounds(190, 50, 190, 22);
        cadastro.add(liberResCaixa);

        //-------------CHECKBOX LIBERAÇÃO FINANCEIRA----------//
        liberFinanceira = new JCheckBox("Liberação Financeira");
        liberFinanceira.setBounds(190, 70, 160, 22);
        cadastro.add(liberFinanceira);

        //-------------CHECKBOX LIBERAÇÃO CAIXA----------//
        libeCaixa = new JCheckBox("Liberação Caixa");
        libeCaixa.setBounds(190, 90, 160, 22);
        cadastro.add(libeCaixa);

        //-------------CHECKBOX CADASTRO DE TABELAS----------//
        Tabelas = new JCheckBox("Tabelas");
        Tabelas.setBounds(190, 110, 140, 22);
        cadastro.add(Tabelas);

        
        
        
        
         //----------------ABA Baixa---------------//
        
        //-------------CHECKBOX CADASTRO DE PRODUTO/ FORNECEDOR----------//
        baixaCompra = new JCheckBox("baixa Compras");
        baixaCompra.setBounds(10, 10, 170, 22);
        baixa.add(baixaCompra);

        //-------------CHECKBOX BAIXA CONTAS A PAGAR----------//
        baixaContasPag = new JCheckBox("Baixa Contas a Pagar");
        baixaContasPag.setBounds(10, 30, 160, 22);
        baixa.add(baixaContasPag);

        //-------------CHECKBOX CADASTRO MOTORISTA----------//
        baixaFrete = new JCheckBox("Baixa Frete");
        baixaFrete.setBounds(10, 50, 120, 22);
        baixa.add(baixaFrete);

        //-------------CHECKBOX BAIXA LAVACAO----------//
        baixaLavacao = new JCheckBox("Baixa Lavação");
        baixaLavacao.setBounds(10, 70, 120, 22);
        baixa.add(baixaLavacao);

       //-------------CHECKBOX BAIXA MAQUINACAO----------//
        baixaMaquinacao = new JCheckBox("Baixa Maquinação");
        baixaMaquinacao.setBounds(10, 90, 160, 22);
        baixa.add(baixaMaquinacao);

        //-------------CHECKBOX BAIXA SAIDA SAC----------//
        baixaSaidaSac = new JCheckBox("Baixa Saida Sac");
        baixaSaidaSac.setBounds(190, 10, 140, 22);
        baixa.add(baixaSaidaSac);

        //-------------CHECKBOX BAIXA ENTRADA SAC---------//
        baixaEntradaSac = new JCheckBox("Baixa Entrada Sac");
        baixaEntradaSac.setBounds(190, 30, 190, 22);
        baixa.add(baixaEntradaSac);

        //-------------CHECKBOX BAIXA CAMARA FRIA----------//
        baixaCamaraFria = new JCheckBox("Baixa Câmara Fria");
        baixaCamaraFria.setBounds(190, 50, 160, 22);
        baixa.add(baixaCamaraFria);

        //-------------CHECKBOX BAIXA COMPRA DIVERSA ----------//
        baixaCompraDiv = new JCheckBox("Baixa Compra Diversa");
        baixaCompraDiv.setBounds(190, 70, 160, 22);
        baixa.add(baixaCompraDiv);

        //-------------CHECKBOX BAIXA VENDA DIVERSA---------//
        baixaVendaDiv = new JCheckBox("Baixa Venda Diversa");
        baixaVendaDiv.setBounds(190, 90, 160, 22);
        baixa.add(baixaVendaDiv);
        
        
        
        
        
        
        //----------------ABA ALTERAR---------------//
        
        //-------------CHECKBOX CADASTRO DE PRODUTO----------//
        altVenda = new JCheckBox("Alterar Venda");
        altVenda.setBounds(10, 10, 120, 22);
        alteracao.add(altVenda);

        //-------------CHECKBOX ALTERAR COMPRA----------//
        altCompra = new JCheckBox("Alterar Compra");
        altCompra.setBounds(10, 30, 120, 22);
        alteracao.add(altCompra);

        //-------------CHECKBOX ALTERAR CONTAS A PAGAR---------//
        altContaPagar = new JCheckBox("Alterar Contas a Pagar");
        altContaPagar.setBounds(10, 50, 170, 22);
        alteracao.add(altContaPagar);

       
//-------------CHECKBOX ALTERAR FRETE---------//
        altFrete = new JCheckBox("Alterar Frete");
        altFrete.setBounds(10, 70, 140, 22);
        alteracao.add(altFrete);
        
        
        //-------------CHECKBOX ALTERAR LAVACAO----------//
        altLavacao = new JCheckBox("Alterar Lavação");
        altLavacao.setBounds(10, 90, 120, 22);
        alteracao.add(altLavacao);

        //-------------CHECKBOX ALTERAR MAQUINACAO----------//
        altMaquinacao = new JCheckBox("Alterar Maquinação");
        altMaquinacao.setBounds(10, 110, 140, 22);
        alteracao.add(altMaquinacao);
        
        //-------------CHECKBOX LIBERAR ALTERACAO----------//
        altAlteracao = new JCheckBox("Liberar Alteração");
        altAlteracao.setBounds(10, 130, 140, 22);
        alteracao.add(altAlteracao);

        //-------------CHECKBOX ALTERAR SAIDA SAC----------//
        altSaidaSac = new JCheckBox("Alterar Saida Sac");
        altSaidaSac.setBounds(190, 10, 140, 22);
        alteracao.add(altSaidaSac);

        //-------------CHECKBOX ALTERAR ENTRADA SAC----------//
        altEntradaSac = new JCheckBox("Alterar Entrada Sac");
        altEntradaSac.setBounds(190, 30, 140, 22);
        alteracao.add(altEntradaSac);

        //-------------CHECKBOX ALTERAR CAMARA FRIA----------//
        altCamaraFria = new JCheckBox("Alterar Câmara Fria");
        altCamaraFria.setBounds(190, 50, 190, 22);
        alteracao.add(altCamaraFria);

        //-------------CHECKBOX ALTERAR COMPRA DIVERSA----------//
        altCompraDiv = new JCheckBox("Alterar Compra Diversa");
        altCompraDiv.setBounds(190, 70, 180, 22);
        alteracao.add(altCompraDiv);

        //-------------CHECKBOX ALTERAR VENDA DIVERSA----------//
        altVendaDiv = new JCheckBox("Alterar Venda Diversa");
        altVendaDiv.setBounds(190, 90, 180, 22);
        alteracao.add(altVendaDiv);

        //-------------CHECKBOX ALTERAR CAIXA----------//
        altCaixa = new JCheckBox("Alterar Caixa");
        altCaixa.setBounds(190, 110, 140, 22);
        alteracao.add(altCaixa);

        
        
        //----------------ABA EXCLUSAO---------------//
        
        //-------------CHECKBOX EXCLUIR VENDA----------//
        exVenda = new JCheckBox("Excluir Venda");
        exVenda.setBounds(10, 10, 120, 22);
        exclusao.add(exVenda);

        //-------------CHECKBOX EXCLUIR COMPRA----------//
        exCompra = new JCheckBox("Excluir Compra");
        exCompra.setBounds(10, 30, 120, 22);
        exclusao.add(exCompra);

        //-------------CHECKBOX EXCLUIR CONTAS A PAGAR---------//
        exContaPagar = new JCheckBox("Excluir Contas a Pagar");
        exContaPagar.setBounds(10, 50, 170, 22);
        exclusao.add(exContaPagar);

        //-------------CHECKBOX EXCLUIR FRETE----------//
        exFrete = new JCheckBox("Excluir Frete");
        exFrete.setBounds(10, 70, 120, 22);
        exclusao.add(exFrete);

        //-------------CHECKBOX EXCLUIR LAVACAO----------//
        exLavacao = new JCheckBox("Excluir Lavação");
        exLavacao.setBounds(10, 90, 120, 22);
        exclusao.add(exLavacao);

        //-------------CHECKBOX EXCLUIR MAQUINACAO----------//
        exMaquinacao = new JCheckBox("Excluir Maquinação");
        exMaquinacao.setBounds(10, 110, 140, 22);
        exclusao.add(exMaquinacao);        
        

        //-------------CHECKBOX EXCLUIR SAIDA SAC----------//
        exSaidaSac = new JCheckBox("Excluir Saida Sac");
        exSaidaSac.setBounds(190, 10, 140, 22);
        exclusao.add(exSaidaSac);

        //-------------CHECKBOX EXCLUIR ENTRADA SAC----------//
        exEntradaSac = new JCheckBox("Excluir Entrada Sac");
        exEntradaSac.setBounds(190, 30, 140, 22);
        exclusao.add(exEntradaSac);

        //-------------CHECKBOX EXCLUIR CAMARA FRIA----------//
        exCamaraFria = new JCheckBox("Excluir Câmara Fria");
        exCamaraFria.setBounds(190, 50, 190, 22);
        exclusao.add(exCamaraFria);

        //-------------CHECKBOX EXCLUIR COMPRA DIVERSA----------//
        exCompraDiv = new JCheckBox("Excluir Compra Diversa");
        exCompraDiv.setBounds(190, 70, 180, 22);
        exclusao.add(exCompraDiv);

        //-------------CHECKBOX EXCLUIR VENDA DIVERSA----------//
        exVendaDiv = new JCheckBox("Excluir Venda Diversa");
        exVendaDiv.setBounds(190, 90, 180, 22);
        exclusao.add(exVendaDiv);

        //-------------CHECKBOX EXCLUIR CAIXA----------//
        exCaixa = new JCheckBox("Excluir Caixa");
        exCaixa.setBounds(190, 110, 140, 22);
        exclusao.add(exCaixa);
        
        
        
        
        
        
        //----------------ABA EXCLUSAO---------------//
        
        //-------------CHECKBOX VISUALIZAR VENDA----------//
        vsVenda = new JCheckBox("Visualizar Venda");
        vsVenda.setBounds(10, 10, 140, 22);
        visualizacao.add(vsVenda);

        //-------------CHECKBOX VISUALIZAR COMPRA----------//
        vsCompra = new JCheckBox("Visualizar Compra");
        vsCompra.setBounds(10, 30, 140, 22);
        visualizacao.add(vsCompra);

        //-------------CHECKBOX VISUALIZAR CONTAS A PAGAR---------//
        vsContaPagar = new JCheckBox("Visualizar Contas a Pagar");
        vsContaPagar.setBounds(10, 50, 190, 22);
        visualizacao.add(vsContaPagar);

        //-------------CHECKBOX VISUALIZAR FRETE----------//
        vsFrete = new JCheckBox("Visualizar Frete");
        vsFrete.setBounds(10, 70, 120, 22);
        visualizacao.add(vsFrete);

        //-------------CHECKBOX VISUALIZAR LAVACAO----------//
        vsLavacao = new JCheckBox("Visualizar Lavação");
        vsLavacao.setBounds(10, 90, 120, 22);
        visualizacao.add(vsLavacao);

        //-------------CHECKBOX VISUALIZAR MAQUINACAO----------//
        vsMaquinacao = new JCheckBox("Visualizar Maquinação");
        vsMaquinacao.setBounds(10, 110, 140, 22);
        visualizacao.add(vsMaquinacao);     
        
        
        //-------------CHECKBOX VISUALIZAR MAQUINACAO----------//
        vsSacarias = new JCheckBox("Visualizar Sacarias");
        vsSacarias.setBounds(10, 130, 140, 22);
        visualizacao.add(vsSacarias);
        
        
         //-------------CHECKBOX VISUALIZAR MAQUINACAO----------//
        vsCheque = new JCheckBox("Visualizar Cheque");
        vsCheque.setBounds(10, 150, 140, 22);
        visualizacao.add(vsCheque);
        
        
        //-------------CHECKBOX VISUALIZAR CAMARA FRIA----------//
        vsCamaraFria = new JCheckBox("Visualizar Câmara Fria");
        vsCamaraFria.setBounds(10, 170, 190, 22);
        visualizacao.add(vsCamaraFria);

        //-------------CHECKBOX VISUALIZAR COMPRA DIVERSA----------//
        vsCompraDiv = new JCheckBox("Visualizar Compra Diversa");
        vsCompraDiv.setBounds(10, 190, 180, 22);
        visualizacao.add(vsCompraDiv);

        //-------------CHECKBOX VISUALIZAR VENDA DIVERSA----------//
        vsVendaDiv = new JCheckBox("Visualizar Venda Diversa");
        vsVendaDiv.setBounds(10, 210, 180, 22);
        visualizacao.add(vsVendaDiv);

        //-------------CHECKBOX VISUALIZAR CAIXA----------//
        vsCaixa = new JCheckBox("Visualizar Caixa");
        vsCaixa.setBounds(210, 10, 140, 22);
        visualizacao.add(vsCaixa);
        
        
        
         //-------------CHECKBOX RELATORIO RESP/ FINANCEIRO----------//
        vsRespFinanceiro = new JCheckBox("Relatorio Resp/Financeiro");
        vsRespFinanceiro.setBounds(210, 30, 170, 22);
        visualizacao.add(vsRespFinanceiro);
        
          //-------------CHECKBOX ENTRADA DE PRODUTO----------//
        vsEntradaProd = new JCheckBox("Entrada Produto");
        vsEntradaProd.setBounds(210, 50, 140, 22);
        visualizacao.add(vsEntradaProd);
        
          //-------------CHECKBOX RELATORIO DE VIAGENS----------//
        vsRelatorioViagem = new JCheckBox("Relatório de Viagens");
        vsRelatorioViagem.setBounds(210, 70, 170, 22);
        visualizacao.add(vsRelatorioViagem);
        
          //-------------CHECKBOX MOVIMENTACAO----------//
        vsMovimentacao = new JCheckBox("Movimentação");
        vsMovimentacao.setBounds(210, 90, 140, 22);
        visualizacao.add(vsMovimentacao);
        
          //-------------CHECKBOX CUPOM FISCAL----------//
        vsCupomFiscal = new JCheckBox("Cupom Fiscal");
        vsCupomFiscal.setBounds(210, 110, 140, 22);
        visualizacao.add(vsCupomFiscal);
        
          //-------------CHECKBOX FECHAMENTO SALDO----------//
        vsFechamentoSaldo = new JCheckBox("Fechamento Saldo");
        vsFechamentoSaldo.setBounds(210, 130, 140, 22);
        visualizacao.add(vsFechamentoSaldo);
        
        
        //-------------CHECKBOX CHEQUE EMITIDOS SAC---------//
        vsChequeEmitido = new JCheckBox("Cheque Emitidos Sac");
        vsChequeEmitido.setBounds(210, 150, 170, 22);
        visualizacao.add(vsChequeEmitido);
        
        //-------------CHECKBOX RASTREABILIDADE---------//
        vsRastreabilidade = new JCheckBox("Rastreabilidade");
        vsRastreabilidade.setBounds(210, 170, 140, 22);
        visualizacao.add(vsRastreabilidade);
        
         //-------------CHECKBOX RASTREAR TODAS AS VEBDAS---------//
        vsRastrearVenda = new JCheckBox("Rastrear Todos Vendas");
        vsRastrearVenda.setBounds(210, 190, 170, 22);
        visualizacao.add(vsRastrearVenda);
        
        
         // ---------------- BOTAO OK-----//
       btnOK = new JButton("OK");
       btnOK.setBounds(420, 450, 90, 25);       
       btnOK.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelPrincipal.add(btnOK);
        
          // ---------------- BOTAO CANCELAR-----//
       btnCancelar = new JButton("Cancelar");
       btnCancelar.setBounds(420, 483, 90, 25);       
       btnCancelar.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelPrincipal.add(btnCancelar);
        
        
        
        janela.add(painelPrincipal);
        janela.setVisible(true);

    }
}
