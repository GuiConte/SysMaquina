
package view;


import control.CadastroAreaController;
import control.CadastroFormaPagamentoController;
import control.CadastroHistChequeController;
import control.CadastroSetorController;
import control.CadastroCamaraFriaController;
import control.ConsultaClienteController;
import control.ConsultaEmpresaController;
import control.ConsultaProdutorController;
import control.CadastroEstoqueController;
import control.CadastroHistDepesaController;
import control.CadastroTabProdutorController;
import control.CadastroVeiculoController;
import control.CadastroVendedorController;
import control.ConsultaMaquinaController;
import control.ViagemCategoriaController;
import control.ViagemSubController;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class Principal {
    
    private JFrame janela;
    private JMenuBar barra;
    //-------------------COMPONENTE DO MENU PRINCIPAL----------------//
    private JMenu Mcadastro, Mvendas, Mcompras, Mlavacao,Mmaquinacao,Mfrete,Msacarias,Mcheque,Mbalanco,Mcontapagar,Mcaixa,Mfluxo,Mfinanceiro,Mestoque,Mviagem,Mconfiguracao,Mnfe,Msobre,Msair; 
    
    //----------------COMPONENTES DO SUB MENU COM MAIS COMPONENTES CADASTROS
    private JMenu cliente,produtoforn, fornecedor, produtos,motorista,sacarias,camarafria,tabela,SCcadastro;
    private JMenuItem Cclientes,Crelatorio, CrelatorioCred, ProdForn, relatProdForn,funcionarios,empresa,CdCidade, cdEstado,sair;
    
    private JMenuItem Ffornecedor, Frelatorio, Fcategoria;
    
    private JMenuItem Pproduto,Prelatorio;
    
    private JMenuItem MTmotorista,MTrelatorio;
    
    private JMenuItem SCroduto,SCrelatorio, SCcliente,SCsacarias;
    
     private JMenuItem CFestoque,CFrelatorio;
     
     private JMenu VGCadastro;
     private JMenuItem VGCategoria,VGSubCategoria, VGDespesaViagem;
     
     private JMenuItem TCadastroMaquina,THistoricoDespesa,THistorioCheque,TContas,TSetores,TFormPagamento,TVendedor,TCadVeiculo,TCadCentros,Tlocal,TOperacional,TCamaraFria,TCadProdutor,TCadArea;
     
     //------------------ MENUS DE BARRA ESTOQUE ------------------------------//
     private JMenu ERelatorio;
     private JMenuItem EMovimentacao, ESaida, ERelEstoque, ERelProdutor,ERelAnalitico;
     
     //------------------ MENUS DE BARRA VENDAS ------------------------------//
     private JMenu VRelatorio, VCebola, VDiversas,Vbalanca, VCombustivel;
     private JMenuItem VDSaida, VDMovimentacao,VDRelatorioEstoque, VDCebola, VDDiversas,VDBalanca, VDCombustivel;
     
   //------------------ MENUS DE BARRA COMPRAS ------------------------------//
     private JMenu  CRelatorio, CCebola, CDiversas;
     private JMenuItem CPEntrada, CPCebola, CPDiversas, CPEntradaProdutos;
     
     
             //------------------ MENUS DE BARRA LAVAÇÃO------------------------------//

     
     private JMenuItem LLavacao, LRelatorioLavacao;
     
     
      //------------------ MENUS DE BARRA MAQUINACAO------------------------------//

     
     private JMenuItem MqMaquinacao, MqRelatorio;
     
     
     
      //------------------ MENUS DE BARRA CAIXA------------------------------//

     
     private JMenuItem CXcaixa, CXRelatorio;
     
     
       //------------------ MENUS DE BARRA FRETE ------------------------------//
     
     private JMenuItem FFrete ,FRelatorio;;
     

        //------------------ MENUS DE BARRA SACARIAS------------------------------//

    private JMenu SEntradaSacaria, SSaidaSacaria;
    private JMenuItem SSEntradaSacaria, SSRelatorioEntradaS, SSSaidaSacaria, SSRelatorioSaidaS;


 //------------------ MENUS DE BARRA CHEQUE------------------------------//

private JMenu CHChequeEntrada, CHChequeDevolvido, CHChequeEmitido,CHBlocoCheque;
private JMenuItem CHCCheque, CHCRelatorioCheque, CHCChequeDevolvido, CHCRelatioChequeDevolvido,CHCChequeEmitido, CHCRelatorioChequeEmitido,CHCCriarBloco, CHCConsultaBloco, CHCChequePagar;

 //------------------ MENUS DE BARRA BALANCO------------------------------//

private JMenuItem Balanco;

//------------------ MENUS DE BARRA FINANCEIRO ------------------------------//
     
     private JMenuItem FResponsabilidade, FRelatorioVendas, FRelatorioCompras,FRelatorioCheque, FRelatorioFrete,FMaquinacao,FRelatorioLimiteCredito;
     
     
     //------------------ MENUS DE BARRA FLUXO ------------------------------//
     
     private JMenuItem FLPagar, FLReceber;
     
     private JMenuItem NFE, GerenciadoNfe;
     
     
    private JPanel painelIcon;
    
   
    
    public void desenharTela(){
        
        
        janela = new JFrame("JPSYSTEM");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        janela.setLayout(null);
        janela.setLocationRelativeTo(null);
        
       
        // ---------------CRIANDO BARRA DO MENU--------------// 
        barra = new JMenuBar();
        
        // ---------------CRIANDO O MENU --------------//
        
        
        Mcadastro = new JMenu("Cadastros");       
        Mvendas = new JMenu("Vendas");
        Mcompras = new JMenu("Compras");
        Mlavacao = new JMenu("Lavação");        
        Mmaquinacao = new JMenu("Maquinação");       
        Mfrete = new JMenu("Frete");
        Msacarias = new JMenu("Sacarias");
        Mcheque = new JMenu("Cheque");        
        Mbalanco = new JMenu("Balanço");       
        Mcontapagar = new JMenu("Contas a Pagar");
        Mcaixa = new JMenu("Caixa");
        Mfluxo = new JMenu("Fluxo");  
        Mfinanceiro = new JMenu("Financeiro");       
        Mestoque = new JMenu("Estoque");
        Mviagem = new JMenu("Viagem");
        Mconfiguracao = new JMenu("Configuração");
        Mnfe = new JMenu("NF-e");       
        Msobre = new JMenu("Sobre");
        Msair = new JMenu("Sair");
       
        
        //----------- CRIANDO PAINEL ICONES -----------------------//
        
        painelIcon = new JPanel();
        painelIcon.setLayout(null);
        painelIcon.setSize(1500,45);
        painelIcon.setBorder(BorderFactory.createTitledBorder(""));
        janela.add(painelIcon);
        
        painelIcon.setVisible(true);
            
        // ---------------CRIANDO O SUB MENU CLIENTE--------------//
         cliente = new JMenu("Cliente");      
         Cclientes = new JMenuItem("Clientes");
         Cclientes.addActionListener((java.awt.event.ActionEvent evt)->{
            try {
                control.ConsultaClienteController cliente = new ConsultaClienteController();
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
         });
         
         // ---------------CRIANDO O SUB MENU CLIENTE RELATORIO--------------//
         Crelatorio = new JMenuItem("Relatório");
         Crelatorio.addActionListener((java.awt.event.ActionEvent evt)->{
             RelatorioCliente relCliente = new RelatorioCliente();
             relCliente.desenharTela(); 
             
         });
         // ---------------CRIANDO O SUB MENU CLIENTE RELATORIO CREDITO--------------//
         CrelatorioCred= new JMenuItem("Relatório Limite de Crédito");
         CrelatorioCred.addActionListener((java.awt.event.ActionEvent evt)->{
             FinanceiroRelatorioClienteLimite relatClienteL = new FinanceiroRelatorioClienteLimite();
             relatClienteL.desenharTela();
         });
         
         cliente.add(Cclientes);
         cliente.add(Crelatorio);
         cliente.add(CrelatorioCred);
         
          
         
        // ---------------CRIANDO O SUB MENU  PRODUTOR FORNECEDOR--------------//
         produtoforn = new JMenu("Produtor");
         
         ProdForn= new JMenuItem("Produtor"); 
         ProdForn.addActionListener((java.awt.event.ActionEvent evt)->{
            try {
                ConsultaProdutorController cadProdutoForn = new ConsultaProdutorController();
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
         });
         
         // ---------------CRIANDO O SUB MENU PRODUTOR FORNECEDOR RELATORIO--------------//
         relatProdForn = new JMenuItem("Relatório");
        
         relatProdForn.addActionListener((java.awt.event.ActionEvent evt)->{
             RelatorioProdutor relProdutoForn = new RelatorioProdutor();
             relProdutoForn.desenharTela();
         });
         
          produtoforn.add(ProdForn);
         produtoforn.add(relatProdForn);
         
    
        // ---------------CRIANDO O SUB MENU FORNECEDOR--------------//
          fornecedor = new JMenu("Fornecedor");
          
          Ffornecedor = new JMenuItem("Fornecedores"); 
         Ffornecedor.addActionListener((java.awt.event.ActionEvent evt)->{
             ConsultaFornecedor cadForn = new ConsultaFornecedor();
             cadForn.desenharTela();
         });
         
          // ---------------CRIANDO O SUB MENU FORNECEDOR RELATORIO--------------//
          Frelatorio = new JMenuItem("Relatório");
         Frelatorio.addActionListener((java.awt.event.ActionEvent evt)->{
             RelatorioFornecedor relForn = new RelatorioFornecedor();
             relForn.desenharTela();
         });
         
         // ---------------CRIANDO O SUB MENU  FORNECEDOR CATEGORIA--------------//
          Fcategoria = new JMenuItem("Categoria/Ramo Atividade");
          
          Fcategoria.addActionListener((java.awt.event.ActionEvent evt)->{
             CadTabela_RamoAtividade cadNovo = new CadTabela_RamoAtividade();
             cadNovo.desenharTela(); 
          
          });
          fornecedor.add(Ffornecedor);
          fornecedor.add(Frelatorio);
          fornecedor.add(Fcategoria);
          
          
          // ---------------CRIANDO O SUB MENU PRODUTOS--------------//
         produtos = new JMenu("Produtos");
         
         Pproduto = new JMenuItem("Produtos");
         Pproduto.addActionListener((java.awt.event.ActionEvent evt)->{
             ConsultaProduto cadProduto = new ConsultaProduto();
             cadProduto.desenharTela();
         });
         
         // ---------------CRIANDO O SUB MENU PRODUTOS RELATORIO--------------//
         Prelatorio = new JMenuItem("Relatório");
         Prelatorio.addActionListener((java.awt.event.ActionEvent evt)->{
             RelatorioProduto relatProd = new RelatorioProduto();
             relatProd.desenharTela();
         });
         
         produtos.add(Pproduto);
         produtos.add(Prelatorio);
         
         
         // ---------------CRIANDO O SUB MENU MOTORISTA--------------//
         motorista = new JMenu("Motorista");
         
         MTmotorista = new JMenuItem("Motorista");
         MTmotorista.addActionListener((java.awt.event.ActionEvent evt)->{
             ConsultaMotorista consMotorista = new ConsultaMotorista();
             consMotorista.desenharTela();
          });
         
          // ---------------CRIANDO O SUB MENU MOTORISTA RELATORIO--------------//
         MTrelatorio = new JMenuItem("Relatório");
         MTrelatorio.addActionListener((java.awt.event.ActionEvent evt)->{
             RelatorioMotorista relMotorista = new RelatorioMotorista();
             relMotorista.desenharTela();
          });
         
         
         motorista.add(MTmotorista);
         motorista.add(MTrelatorio);
         
          // ---------------CRIANDO O SUB MENU SACARIA--------------//
         
         sacarias = new JMenu("Sacarias");
         
         SCcadastro = new JMenu("Cadastro");
         SCcliente= new JMenuItem("Cliente");
          SCcliente.addActionListener((java.awt.event.ActionEvent evt)->{
             ConsultaClienteSacaria consCLSacaria = new ConsultaClienteSacaria();
             consCLSacaria.desenharTela();
          });
          
         // ---------------CRIANDO O SUB MENU SACARIA--------------//
          SCsacarias = new JMenuItem("Sacarias");
         SCsacarias.addActionListener((java.awt.event.ActionEvent evt)->{
             ConsultaSacaria consSacaria = new ConsultaSacaria();
             consSacaria.desenharTela();
         });
         
         // ---------------CRIANDO O SUB MENU SACARIA RELATORIO--------------//
         SCrelatorio = new JMenuItem("Relatório de Estoque");
         SCrelatorio.addActionListener((java.awt.event.ActionEvent evt)->{
             RelatorioSacarias relSac = new RelatorioSacarias();
             relSac.desenharTela();
         });
         
         
         
         sacarias.add(SCcadastro);
         sacarias.add(SCrelatorio);
         SCcadastro.add(SCcliente);
         SCcadastro.add(SCsacarias);
         
         
         // ---------------CRIANDO O SUB CAMARA FRIA--------------//
         camarafria = new JMenu("Câmara Fria");
         CFestoque = new JMenuItem("Estocagem");
          CFestoque.addActionListener((java.awt.event.ActionEvent evt)->{
             CadastroCamaraFria_Estocagem cadCamaraFriaEstocagem = new CadastroCamaraFria_Estocagem();
             cadCamaraFriaEstocagem.desenharTela();
         
          });
     ////--------------------------------------------------------------------//    
         CFrelatorio = new JMenuItem("Relatório");
         CFrelatorio.addActionListener((java.awt.event.ActionEvent evt)->{
             RelatorioCamaraFria relCamara = new RelatorioCamaraFria();
             relCamara.desenharTela();
         
          });
         
         
         camarafria.add(CFestoque);
          camarafria.add(CFrelatorio);
         
        // ---------------CRIANDO O SUB TABELA--------------//
         
         tabela = new JMenu("Tabelas");
         
         TCadastroMaquina=new JMenuItem("Cadastro Maquina");
          TCadastroMaquina.addActionListener((java.awt.event.ActionEvent evt)->{
            try {
                ConsultaMaquinaController cadMaquina = new ConsultaMaquinaController();
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
         });
          
          // ---------------CRIANDO O SUB TABELA HISTORICO DESPESA--------------//
         THistoricoDespesa=new JMenuItem("Histórico Despesas");
         THistoricoDespesa.addActionListener((java.awt.event.ActionEvent evt)->{
            try {
                CadastroHistDepesaController cadDespesa = new CadastroHistDepesaController();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
         });
         
         // ---------------CRIANDO O SUB TABELA HISTORICO CHEQUE--------------//
         THistorioCheque=new JMenuItem("Histórico Cheque");
         THistorioCheque.addActionListener((java.awt.event.ActionEvent evt)->{
            try {
                CadastroHistChequeController cadCheque = new CadastroHistChequeController();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
         });
           // ---------------CRIANDO O SUB TABELA CONTAS--------------//
         TContas=new JMenuItem("Contas");
         TContas.addActionListener((java.awt.event.ActionEvent evt)->{
             CadTabela_Contas CadConta = new CadTabela_Contas();
             CadConta.desenharTela();
             });
          
         // ---------------CRIANDO O SUB TABELA SETORES--------------//
         TSetores=new JMenuItem("Setores");
         TSetores.addActionListener((java.awt.event.ActionEvent evt)->{
            try {
                CadastroSetorController cadSetor = new CadastroSetorController();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
         });
         
         // ---------------CRIANDO O SUB TABELA PAGAMENTO--------------//
         TFormPagamento=new JMenuItem("Forma de pagamento");
          TFormPagamento.addActionListener((java.awt.event.ActionEvent evt)->{
            try {
                CadastroFormaPagamentoController cadPagamento = new CadastroFormaPagamentoController();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
         });
          
         // ---------------CRIANDO O SUB TABELA VENDEDOR--------------//
         TVendedor=new JMenuItem("Vendedor");
         TVendedor.addActionListener((java.awt.event.ActionEvent evt)->{
            try {
                CadastroVendedorController cadVendedor = new CadastroVendedorController();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
         });
         
         // ---------------CRIANDO O SUB TABELA VEICULOS--------------//
         TCadVeiculo=new JMenuItem("Cadastro Veiculos");
         TCadVeiculo.addActionListener((java.awt.event.ActionEvent evt)->{
            try {
                CadastroVeiculoController cadVeiculo = new CadastroVeiculoController();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
         });
         
         // ---------------CRIANDO O SUB TABELA ESTOQUE --------------//
         Tlocal=new JMenuItem("Local de Estoque");
         Tlocal.addActionListener((java.awt.event.ActionEvent evt)->{
            try {
                CadastroEstoqueController cadEstoque = new CadastroEstoqueController();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
         });
         
         // ---------------CRIANDO O SUB TABELA OPERACIONAL--------------//
         TOperacional=new JMenuItem("Operacional");
         TOperacional.addActionListener((java.awt.event.ActionEvent evt)->{
             CadTabela_Operacional CadOperacional = new CadTabela_Operacional();
             CadOperacional.desenharTela();
             });
         
         // ---------------CRIANDO O SUB TABELA CAMARA FRIA--------------//
         TCamaraFria=new JMenuItem("Cadastro Camara Fria");
          TCamaraFria.addActionListener((java.awt.event.ActionEvent evt)->{
            try {
                CadastroCamaraFriaController cadCamaraFria = new CadastroCamaraFriaController();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
         });
         
         // ---------------CRIANDO O SUB TABELA PRODUTOR--------------//
         TCadProdutor=new JMenuItem("Cadastro Produtor");
          TCadProdutor.addActionListener((java.awt.event.ActionEvent evt)->{
            try {
                CadastroTabProdutorController cadProdutor = new CadastroTabProdutorController();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
         });
         
         // ---------------CRIANDO O SUB TABELA AREA--------------//
         TCadArea=new JMenuItem("Cadastro Área");
         TCadArea.addActionListener((java.awt.event.ActionEvent evt)->{
            try {
                CadastroAreaController cadArea = new CadastroAreaController();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
         });
              
         
         
           tabela.add(TCadastroMaquina);
           tabela.add(THistoricoDespesa);
           tabela.add(THistorioCheque);
           tabela.add(TContas);
           tabela.add(TSetores);
           tabela.add(TFormPagamento);
           tabela.add(TVendedor);
           tabela.add(TCadVeiculo);
           tabela.add(Tlocal);
           tabela.add(TOperacional);
           tabela.add(TCamaraFria);
            tabela.add(TCadProdutor);
           tabela.add(TCadArea);
           
           
           
           
           
           CdCidade = new JMenuItem("Cidade");  
         
          //----------CHAMANDO CADASTRO DE FUNCIONARIO----------------//
         CdCidade.addActionListener((java.awt.event.ActionEvent evt)->{
             CadastroCidade cadCidade = new CadastroCidade();
            try {   
                cadCidade.desenharTela();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
          });
           
           
         //------------CADASTRO DE TABELAS-----------------//
        cdEstado = new JMenuItem("Estado");  
         
          //----------CHAMANDO CADASTRO DE FUNCIONARIO----------------//
         cdEstado.addActionListener((java.awt.event.ActionEvent evt)->{
             CadastroEstado cadEstado = new CadastroEstado();
            try {   
                cadEstado.desenharTela();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
          });
         
         
         
         funcionarios = new JMenuItem("Funcionários");  
         
          //----------CHAMANDO CADASTRO DE FUNCIONARIO----------------//
         funcionarios.addActionListener((java.awt.event.ActionEvent evt)->{
             ConsultaFuncionario consFuncionario = new ConsultaFuncionario();
             consFuncionario.desenharTela();   
          });
         
         
         empresa = new JMenuItem("Empresa"); 
         
         //----------CHAMANDO CADASTRO DE EMPRESA----------------//
         empresa.addActionListener((java.awt.event.ActionEvent evt)->{
             try {
                ConsultaEmpresaController cadEmpresa = new ConsultaEmpresaController();
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        
           
         });
         sair = new JMenuItem("Sair");
         
         VGCadastro = new JMenu("Cadastro");
         VGCategoria = new JMenuItem("Cadastro Categoria");        
         VGCategoria.addActionListener((java.awt.event.ActionEvent evt)->{
             try {
                ViagemCategoriaController cadViagem = new ViagemCategoriaController();
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
         });
         
         VGSubCategoria = new JMenuItem("Cadastro SubCategoria");        
          VGSubCategoria.addActionListener((java.awt.event.ActionEvent evt)->{
             try {
                ViagemSubController cadSubViagem = new ViagemSubController();
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
         });
         
         
          VGDespesaViagem = new JMenuItem("Despesa Viagem");
          //----------CHAMANDO CADASTRO SUBCATEGORIA VIAGEM----------------//
         VGDespesaViagem.addActionListener((java.awt.event.ActionEvent evt)->{
             Viagem_Despesa cadDespe = new Viagem_Despesa();
            try {   
                cadDespe.desenharTela();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
         });
         
         Mviagem.add(VGCadastro);
         Mviagem.add(VGDespesaViagem);
         VGCadastro.add(VGCategoria);
         VGCadastro.add(VGSubCategoria);
         
        
         
         
          //------------CADASTRO DE ESTOQUE-----------------//
       
         
         
         EMovimentacao = new JMenuItem("Movimentação");  
         
          //----------CHAMANDO CADASTRO DE FUNCIONARIO----------------//
         EMovimentacao.addActionListener((java.awt.event.ActionEvent evt)->{
             Estoque_Movimentação cadMovimentacao = new Estoque_Movimentação();
            try {   
                cadMovimentacao.desenharTela();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
          });
         
         ESaida = new JMenuItem("Saida (Requisição)");  
         
          //----------CHAMANDO CADASTRO DE FUNCIONARIO----------------//
         ESaida.addActionListener((java.awt.event.ActionEvent evt)->{
             Estoque_Saida cadEstoqueSaida = new Estoque_Saida();
            try {   
                cadEstoqueSaida.desenharTela();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
          });
         
         
         ERelatorio = new JMenu("Relatório");
         
           ERelEstoque = new JMenuItem("Estoque");  
         
          //----------CHAMANDO CADASTRO DE FUNCIONARIO----------------//
         ERelEstoque.addActionListener((java.awt.event.ActionEvent evt)->{
             RelatorioEstoque relatorioEstoque = new RelatorioEstoque();
             relatorioEstoque.desenharTela();   
          });
         
         
          ERelProdutor = new JMenuItem("Produtor / Area");  
         
          //----------CHAMANDO CADASTRO DE FUNCIONARIO----------------//
         ERelProdutor.addActionListener((java.awt.event.ActionEvent evt)->{
             RelatorioEstProdutorArea RelatorioProdutor = new RelatorioEstProdutorArea();
             RelatorioProdutor.desenharTela();   
          });
         
         
          ERelAnalitico = new JMenuItem("Analitico");  
         
          //----------CHAMANDO CADASTRO DE FUNCIONARIO----------------//
         ERelAnalitico.addActionListener((java.awt.event.ActionEvent evt)->{
             RelatorioEstoqueAnalitico RelatorioAnalitico = new RelatorioEstoqueAnalitico();
             RelatorioAnalitico.desenharTela();   
          });
        
         
         Mestoque.add(EMovimentacao);
         Mestoque.add(ESaida);
         Mestoque.add(ERelatorio);
         ERelatorio.add(ERelEstoque);
         ERelatorio.add(ERelProdutor);
         ERelatorio.add(ERelAnalitico);
         
         
          //------------------ MENUS DE BARRA VENDAS //------------------------------//
         
            
         VDSaida = new JMenuItem("Saida");  
         VDSaida.addActionListener((java.awt.event.ActionEvent evt)->{
             Venda_Saida cadVendas = new Venda_Saida();
            try {   
                cadVendas.desenharTela();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
          });
      //------------------------------------------------------------------//   
         VRelatorio = new JMenu("relatório");
     //------------------------------------------------------------------//    
         VCebola= new JMenu("Cebola");
         VDCebola= new JMenuItem("Cebolas");
         VDCebola.addActionListener((java.awt.event.ActionEvent evt)->{
             Venda_Cebola cadVendaCebola = new Venda_Cebola();
            try {   
                cadVendaCebola.desenharTela();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
          });
         
         //------------------------------------------------------------//
         VDiversas= new JMenu("Diversas");
         VDDiversas = new JMenuItem("Diversas");
         VDDiversas.addActionListener((java.awt.event.ActionEvent evt)->{
             Venda_Diversas cadVendaDiversas = new Venda_Diversas();
            try {
                cadVendaDiversas.desenharTela();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
         });
         
         
        //---------------------------------------------------------------// 
         VDMovimentacao = new JMenuItem("Movimentação"); 
         VDMovimentacao.addActionListener((java.awt.event.ActionEvent evt)->{
             Estoque_Movimentação cadMovimentacao = new Estoque_Movimentação();
            try {
                cadMovimentacao.desenharTela();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
         });
         
        //-----------------------------------------------------------------// 
         VDRelatorioEstoque = new JMenuItem("Relatório de Estoque"); 
         
          Vbalanca = new JMenu("Balança");
          VDBalanca = new JMenuItem("Balança");
          VDBalanca.addActionListener((java.awt.event.ActionEvent evt)->{
             Venda_Balanca cadVendaBalanca = new Venda_Balanca();
            try {
                cadVendaBalanca.desenharTela();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
          
          });
     //---------------------------------------------------------------------//
     
       VCombustivel = new JMenu("Combustivel");
       VDCombustivel = new JMenuItem("Combustivel");
       VDCombustivel.addActionListener((java.awt.event.ActionEvent evt)->{
             Venda_Combustivel cadVendaCombustivel = new Venda_Combustivel();
            try {
                cadVendaCombustivel.desenharTela();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
       });
          
         Mvendas.add(VDSaida);
         Mvendas.add(VRelatorio);
         Mvendas.add(VCebola);
         Mvendas.add(VDiversas);
         Mvendas.add(VDMovimentacao);
         Mvendas.add(VDRelatorioEstoque);
         Mvendas.add(Vbalanca);
         Mvendas.add(VCombustivel);
         
         
         VCebola.add(VDCebola);
         VDiversas.add(VDDiversas);
         VCombustivel.add(VDCombustivel);
         Vbalanca.add(VDBalanca);
         //----------------------------------------------------------------------------------------//
         
               
         CPEntrada = new JMenuItem("Entrada");  
         CPEntrada.addActionListener((java.awt.event.ActionEvent evt)->{
             Compra_Entrada CPEntradas = new Compra_Entrada();
            try {   
                CPEntradas.desenharTela();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
          });
         
           CRelatorio = new JMenu("Relatório");  
         //VDSaida.addActionListener((java.awt.event.ActionEvent evt)->{
            // Venda_Saida cadVendas = new Venda_Saida();
           //  cadVendas.desenharTela();   
          //});
         
          
            CCebola = new JMenu("Cebola");  
            CPCebola = new JMenuItem("Cebola");  
             CPCebola.addActionListener((java.awt.event.ActionEvent evt)->{
             Compra_Cebola CompraCebola = new Compra_Cebola();
            try {   
                CompraCebola.desenharTela();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
          });
          
            CDiversas = new JMenu("Diversas");  
            CPDiversas= new JMenuItem("Diversas");
            CPDiversas.addActionListener((java.awt.event.ActionEvent evt)->{
                Compra_Diversas CompraDiversas = new Compra_Diversas();
            try {   
                CompraDiversas.desenharTela();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
          });
            
            
            CPEntradaProdutos= new JMenuItem("Entrada Produtos");
            CPEntradaProdutos.addActionListener((java.awt.event.ActionEvent evt)->{
             Compras_EntradaProd CPEntradaProduto = new Compras_EntradaProd();
            try {   
                CPEntradaProduto.desenharTela();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
          });
         
         Mcompras.add(CPEntrada);
         Mcompras.add(CRelatorio);
         Mcompras.add(CCebola);
         Mcompras.add(CDiversas);
         Mcompras.add(CPEntradaProdutos);
         
         CDiversas.add(CPDiversas);
         CCebola.add(CPCebola);
         CDiversas.add(CPDiversas);
         
         
         
         //------------------------------------------------------------------------------------//
         
          FResponsabilidade = new JMenuItem("Responsabilidade");  
          FResponsabilidade.addActionListener((java.awt.event.ActionEvent evt)->{
             FinanceiroResponsabilidade FinanResponsabilidade = new FinanceiroResponsabilidade();
             FinanResponsabilidade.desenharTela();   
          });
         
         
         
         
           //------------------------------------------------------------------------------------//
         
          FRelatorioVendas = new JMenuItem("Relatório de Vendas");  
          FRelatorioVendas.addActionListener((java.awt.event.ActionEvent evt)->{
             FinanceiroRelatorioVendas FinanReltVendas = new FinanceiroRelatorioVendas();
            try {   
                FinanReltVendas.desenharTela();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
          });
         
          
             //------------------------------------------------------------------------------------//
         
          FRelatorioCompras = new JMenuItem("Relatório de Compras");  
          FRelatorioCompras.addActionListener((java.awt.event.ActionEvent evt)->{
             FinanceiroRelatorioCompra FinanReltCompras = new FinanceiroRelatorioCompra();
            try {   
                FinanReltCompras.desenharTela();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
          });
          
          
             //------------------------------------------------------------------------------------//
         
          FRelatorioCheque = new JMenuItem("Relatório de Cheques");  
          FRelatorioCheque.addActionListener((java.awt.event.ActionEvent evt)->{
             FinanceiroRelatorioCheque FinanReltCheque = new FinanceiroRelatorioCheque();
             FinanReltCheque.desenharTela();   
          });
          
              //------------------------------------------------------------------------------------//
         
          FRelatorioFrete = new JMenuItem("Relatório de Fretes");  
          FRelatorioFrete.addActionListener((java.awt.event.ActionEvent evt)->{
             FinanceiroRelatorioFrete FinanReltFrete = new FinanceiroRelatorioFrete();
            try {   
                FinanReltFrete.desenharTela();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
          });
         
           //------------------------------------------------------------------------------------//
         
          FMaquinacao = new JMenuItem("Maquinação/Lavação");  
          FMaquinacao.addActionListener((java.awt.event.ActionEvent evt)->{
             FinanceiroRelatorioMaquinacao FinanReltMaquinacao = new FinanceiroRelatorioMaquinacao();
            try {   
                FinanReltMaquinacao.desenharTela();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
          });
         
            //------------------------------------------------------------------------------------//
         
          FRelatorioLimiteCredito = new JMenuItem("Relatório Limite Crédito");  
          FRelatorioLimiteCredito.addActionListener((java.awt.event.ActionEvent evt)->{
              FinanceiroRelatorioClienteLimite FinanReltLimite = new FinanceiroRelatorioClienteLimite();
             FinanReltLimite.desenharTela();   
          });
          
          
          
         
         
         
         Mfinanceiro.add(FResponsabilidade);
         Mfinanceiro.add(FRelatorioVendas);
         Mfinanceiro.add(FRelatorioCompras);
         Mfinanceiro.add(FRelatorioCheque);
         Mfinanceiro.add(FRelatorioFrete);
         Mfinanceiro.add(FMaquinacao);
         Mfinanceiro.add(FRelatorioLimiteCredito);
         
         
         //------------------------------------------------------------------------------------//
         
         
            //------------------------------------------------------------------------------------//
         
          FLReceber = new JMenuItem("Fluxo Receber");  
          FLReceber.addActionListener((java.awt.event.ActionEvent evt)->{
              FluxoReceber FLXReceber = new FluxoReceber();
             FLXReceber.desenharTela();   
          });
         
          
           //------------------------------------------------------------------------------------// 
           
          FLPagar = new JMenuItem("Fluxo Pagar");  
          FLPagar.addActionListener((java.awt.event.ActionEvent evt)->{
              FluxoPagar FLXPagar = new FluxoPagar();
             FLXPagar.desenharTela();   
          });
          
          
          Mfluxo.add(FLReceber);
          Mfluxo.add(FLPagar);
          
          
            //------------------------------------------------------------------------------------// 
           
          SEntradaSacaria = new JMenu("Entrada Sacaira");  
          SSEntradaSacaria = new JMenuItem("Entrada Sacaira"); 
          SSEntradaSacaria.addActionListener((java.awt.event.ActionEvent evt)->{
              Sacaria_Entrada SEntrada = new Sacaria_Entrada();
            try {   
                SEntrada.desenharTela();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
          });
          
      //-------------------------------------------------------------------------------------------------//    
            SSaidaSacaria = new JMenu("Saida Sacaira");  
          SSSaidaSacaria = new JMenuItem("Saida Sacaira"); 
          SSSaidaSacaria.addActionListener((java.awt.event.ActionEvent evt)->{
              Sacaria_Saida SSaida = new Sacaria_Saida();
            try {   
                SSaida.desenharTela();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
          });
          
          
          Msacarias.add(SEntradaSacaria);
          Msacarias.add(SSaidaSacaria);
          
          SEntradaSacaria.add(SSEntradaSacaria);
          SSaidaSacaria.add(SSSaidaSacaria);
          
          
        //-------------------------------------------------------------------------------------------------//

        //-------------------------------------------------------------------------------------------------//
        
          FFrete = new JMenuItem("Frete"); 
          FFrete.addActionListener((java.awt.event.ActionEvent evt)->{
              Frete FFFrete = new Frete();
             FFFrete.desenharTela();   
          });
        
          Mfrete.add(FFrete);
          
            //-------------------------------------------------------------------------------------------------//

        //-------------------------------------------------------------------------------------------------//
        
          LLavacao = new JMenuItem("Lavacao"); 
          LLavacao.addActionListener((java.awt.event.ActionEvent evt)->{
              Lavacao LLava = new Lavacao();
            try {   
                LLava.desenharTela();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
          });
        
          Mlavacao.add(LLavacao);
          
          
          MqMaquinacao = new JMenuItem("Maquinação");
          MqMaquinacao.addActionListener((java.awt.event.ActionEvent evt)->{
              Maquinacao Mmq = new Maquinacao();
            try {   
                Mmq.desenharTela();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
          });
          
          Mmaquinacao.add(MqMaquinacao);
        //---------------------------------------------------------------------------------------------------------//
        
        
          CXcaixa = new JMenuItem("Caixa");
          CXcaixa.addActionListener((java.awt.event.ActionEvent evt)->{
              Caixa cx = new Caixa();               
                cx.desenharTela();
            
          });
          Mcaixa.add(CXcaixa);
        
        
        
        //----------------------------------------------------------------------------------------------------------//
          
        //-------------------------------------------------------------------------------------------------//
        
          CHChequeEntrada = new JMenu("Cheque Entrada"); 
          CHCCheque = new JMenuItem("Cheques"); 
          CHCCheque.addActionListener((java.awt.event.ActionEvent evt)->{
              Cheque_Entrada CHEntrada = new Cheque_Entrada();
            try {   
                CHEntrada.desenharTela();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
          });
        
          
           //-------------------------------------------------------------------------------------------------//
        
          /*CHChequeEntrada = new JMenu("Cheque Entrada"); 
          CHCCheque = new JMenu("Cheques"); 
          CHCCheque.addActionListener((java.awt.event.ActionEvent evt)->{
              Cheque_Entrada CHEntrada = new Cheque_Entrada();
             CHEntrada.desenharTela();   
          });*/
          
       //-------------------------------------------------------------------------------------------------//
        
          CHChequeDevolvido = new JMenu("Cheque Devolvidos"); 
          CHCChequeDevolvido = new JMenuItem("Cheques Devolvidos"); 
          CHCChequeDevolvido.addActionListener((java.awt.event.ActionEvent evt)->{
              Cheque_Devolvido CHDevolvido = new Cheque_Devolvido();
            try {   
                CHDevolvido.desenharTela();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
          });
          
          //-------------------------------------------------------------------------------------------------//
        
         /* CHChequeDevolvido = new JMenu("Cheque Devolvido"); 
          CHCChequeDevolvido = new JMenu("Cheques Desvolvidos"); 
          CHCChequeDevolvido.addActionListener((java.awt.event.ActionEvent evt)->{
              Cheque_Devolvido CHDevolvido = new Cheque_Devolvido();
             CHDevolvido.desenharTela();   
          });*/
         
         
         //-------------------------------------------------------------------------------------------------//
        
          CHChequeEmitido = new JMenu("Cheque Emitidos"); 
          CHCChequeEmitido = new JMenuItem("Cheques Emitidos"); 
          CHCChequeEmitido.addActionListener((java.awt.event.ActionEvent evt)->{
              Cheque_Emitidos CHEmitidos = new Cheque_Emitidos();
            try {   
                CHEmitidos.desenharTela();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
          });
         
           //-------------------------------------------------------------------------------------------------//
        
          /*CHChequeEmitido = new JMenu("Cheque Emitidos"); 
          CHCChequeEmitido = new JMenu("Cheques Emitidos"); 
          CHCChequeEmitido.addActionListener((java.awt.event.ActionEvent evt)->{
              Cheque_Emitidos CHEmitidos = new Cheque_Emitidos();
             CHEmitidos.desenharTela();   
          });*/
          
           //-------------------------------------------------------------------------------------------------//
        
          CHBlocoCheque = new JMenu("Bloco de Cheques"); 
          CHCCriarBloco = new JMenuItem("Criar Bloco"); 
          CHCCriarBloco.addActionListener((java.awt.event.ActionEvent evt)->{
              Cheque_BlocoCheque CHBloco = new Cheque_BlocoCheque();
             CHBloco.desenharTela();   
          });
          
               //-------------------------------------------------------------------------------------------------//
        
         /* CHBlocoCheque = new JMenu("Bloco de Cheques"); 
          CHCCriarBloco = new JMenu("Criar Bloco"); 
          CHCCriarBloco.addActionListener((java.awt.event.ActionEvent evt)->{
              Cheque_BlocoCheque CHBloco = new Cheque_BlocoCheque();
             CHBloco.desenharTela();   
          });*/
         
         
         
              //-------------------------------------------------------------------------------------------------//
        
          CHCChequePagar = new JMenuItem("Cheques Pagar"); 
          CHCChequePagar.addActionListener((java.awt.event.ActionEvent evt)->{
              Cheque_Pagar CHPagar = new Cheque_Pagar();
             CHPagar.desenharTela();   
          });
          
          
          Mcheque.add(CHChequeEntrada);
          Mcheque.add(CHChequeDevolvido);
          Mcheque.add(CHChequeEmitido);
          Mcheque.add(CHBlocoCheque);
          Mcheque.add(CHCChequePagar);
          
          CHChequeEntrada.add(CHCCheque); 
          //CHChequeEntrada.add(CHCRelatorioCheque);
          CHChequeDevolvido.add(CHCChequeDevolvido);
         // CHChequeDevolvido.add(CHCRelatioChequeDevolvido); 
          CHChequeEmitido.add(CHCChequeEmitido);
         // CHChequeDevolvido.add(CHCRelatorioChequeEmitido);
          CHBlocoCheque.add(CHCCriarBloco);
         // CHBlocoCheque.add(CHCConsultaBloco);
          
          
          
       //---------------------------------------------------//
       
       Balanco = new JMenuItem("Balanço");
        Balanco.addActionListener((java.awt.event.ActionEvent evt)->{
              Balanco bl = new Balanco();
             bl.desenharTela();   
          });
               
          
         Mbalanco.add(Balanco);
          
        //---------------------------------------------------------------------------------------------------//
        
        
          NFE = new JMenuItem("NF-e"); 
          NFE.addActionListener((java.awt.event.ActionEvent evt)->{
              NFE_Venda NFEV = new NFE_Venda();
            try {   
                NFEV.desenharTela();
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
          });
        
        Mnfe.add(NFE);
        
        //------ MENU BARRA ----------------// 
        barra.add(Mcadastro);
        barra.add(Mvendas);
        barra.add(Mcompras);
        barra.add(Mlavacao);
        barra.add(Mmaquinacao);
        barra.add(Mfrete);
        barra.add(Msacarias);
        barra.add(Mcheque); 
        barra.add(Mbalanco);
        barra.add(Mcontapagar);
        barra.add(Mcaixa);
        barra.add(Mfluxo);
        barra.add(Mfinanceiro);
        barra.add(Mestoque);
        barra.add(Mviagem);
        barra.add(Mconfiguracao);
        barra.add(Mnfe);
        barra.add(Msobre);
        barra.add(Msair);
        
        
        
        
        
        //------------------- ADICIONANDO OS COMPONENTES AO SUB MENU  ------------------//
        
        Mcadastro.add(cliente);        
        Mcadastro.add(produtoforn);
        Mcadastro.add(fornecedor);
        Mcadastro.add(produtos);
        Mcadastro.add(motorista);
        Mcadastro.add(sacarias);
        Mcadastro.add(camarafria);
        Mcadastro.add(tabela);
        Mcadastro.add(CdCidade);
        Mcadastro.add(cdEstado);
        Mcadastro.add(funcionarios);
        Mcadastro.add(empresa);
        Mcadastro.add(sair);
        
       
        
        
        janela.setJMenuBar(  barra );
        janela.setVisible(true);
    }
    
}
