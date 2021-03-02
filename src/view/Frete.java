
package view;

import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Frete {
    
    private JFrame janela;
    private JPanel painelPrincipal, painelOrigem, painelFrete, painelVincular, painelVenda, painelBatata;
    private JLabel lblData, lblMotorista, lblDataVencimento, lblProdutor, lblCI, lblReferencia, lblVeiculo ,lblOrigem, lblDestino, lblDescricao, lblObservacao;
    private JTextField txtData, txtMotorista, txtCodMotorista , txtDataVencimento, txtProdutor, txtCodProdutor, txtCI, txtOrigem, txtDestino, txtDescricao, txtObservacao;
    private JComboBox cbReferencia,cbVeiculo;
    private JRadioButton rdReceber, rdPagar, rdDiversos, rdComercializacao, rdVenda, rdCompra, rdBatata, rdCebola;
     private ButtonGroup groupOrigem, groupFrete, groupVenda, groupBatata;
     private JLabel lblBAG, lblSacos, lblCaixas, lblPreco, lblAdiantamento, lblDesconto, lblISS, lblTotal;
     private JTextField txtBAG, txtSacos, txtCaixas, txtPreco, txtAdiantamento, txtDesconto, txtISS, txtTotal, txtTotalVincular;
     private JButton btnConsultaMotorista, btnConsultaProdutor, btnConsultaVinculo,btnGravar, btnCancelar, btnConsultar, btnSair;
    
     
     public void desenharTela() {

        janela = new JFrame("Frete");
        janela.setSize(585, 605);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        
        
       

        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setSize(560, 560);
        painelPrincipal.setLocation(7, 5);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        
     //-------------------------------------------------------------------------------------------//   
        
         lblData = new JLabel("Data ");
        lblData.setBounds(10, 20, 60, 22);
        painelPrincipal.add(lblData);
        
        txtData = new JTextField();
        txtData.setBounds(10, 40, 80, 22);
        painelPrincipal.add(txtData);
    
   //-------------------------------------------------------------------------------------------//
   
        lblMotorista = new JLabel("Motorista ");
        lblMotorista.setBounds(100, 20, 60, 22);
        painelPrincipal.add(lblMotorista);
        
        txtMotorista = new JTextField();
        txtMotorista.setBounds(100, 40, 240, 22);
        painelPrincipal.add(txtMotorista);
        
         
        txtCodMotorista = new JTextField();
        txtCodMotorista.setBounds(345, 40, 40, 22);
        painelPrincipal.add(txtCodMotorista);
   
   
        
          //-------------------------------------------------------------------------------------------//   
        
         lblDataVencimento = new JLabel("Vencimento ");
        lblDataVencimento.setBounds(10, 70, 80, 22);
        painelPrincipal.add(lblDataVencimento);
        
        txtDataVencimento = new JTextField();
        txtDataVencimento.setBounds(10, 90, 80, 22);
        painelPrincipal.add(txtDataVencimento);
    
   //-------------------------------------------------------------------------------------------//
   
        lblProdutor = new JLabel("Produtor");
        lblProdutor.setBounds(100, 70, 60, 22);
        painelPrincipal.add(lblProdutor);
        
        txtProdutor = new JTextField();
        txtProdutor.setBounds(100, 90, 240, 22);
        painelPrincipal.add(txtProdutor);
        
         
        txtCodProdutor = new JTextField();
        txtCodProdutor.setBounds(345, 90, 40, 22);
        painelPrincipal.add(txtCodProdutor);
   
   
   //-------------------------------------------------------------------------------------------//
   
        lblCI = new JLabel("C.I FR");
        lblCI.setBounds(10, 120, 100, 22);
        painelPrincipal.add(lblCI);
        
        txtCI = new JTextField();
        txtCI.setBounds(10, 140, 80, 22);
        painelPrincipal.add(txtCI);
        
   
   //-------------------------------------------------------------------------------------------//
   
   
        lblReferencia = new JLabel("Referencia");
        lblReferencia.setBounds(100, 120, 100, 22);
        painelPrincipal.add(lblReferencia);
        
        cbReferencia = new JComboBox();
        cbReferencia.setBounds(100, 140, 120, 22);
        painelPrincipal.add(cbReferencia);
   
   //-------------------------------------------------------------------------------------------//
   
        painelOrigem = new JPanel();
        painelOrigem.setLayout(null);
        painelOrigem.setSize(145, 95);
        painelOrigem.setLocation(410, 20);
        painelOrigem.setBorder(BorderFactory.createTitledBorder("Origem"));
        painelPrincipal.add(painelOrigem);
   
   
   //-------------------------------------------------------------------------------------------//
   
   
        rdComercializacao = new JRadioButton("Comercialização");
        rdComercializacao.setBounds(5, 25, 130, 18);
        rdComercializacao.setFont(new Font("Arial", 0, 12));
        painelOrigem.add(rdComercializacao);
        
        
        
         rdDiversos = new JRadioButton("Diversos");
        rdDiversos.setBounds(5, 60, 100, 18);
        rdDiversos.setFont(new Font("Arial", 0, 12));
        painelOrigem.add(rdDiversos);
        
        
        
        groupOrigem = new ButtonGroup();
        groupOrigem.add(rdComercializacao);
        groupOrigem.add(rdDiversos);
   
   
   //-------------------------------------------------------------------------------------------//
   
   
   
        painelFrete = new JPanel();
        painelFrete.setLayout(null);
        painelFrete.setSize(180, 50);
        painelFrete.setLocation(230,120);
        painelFrete.setBorder(BorderFactory.createTitledBorder("Tipo Frete"));
        painelPrincipal.add(painelFrete);
   
   
   //-------------------------------------------------------------------------------------------//
   
   
        rdReceber = new JRadioButton("A Receber");
        rdReceber.setBounds(5, 20, 90, 18);
        rdReceber.setFont(new Font("Arial", 0, 12));
        painelFrete.add(rdReceber);
        
        
        
         rdPagar = new JRadioButton("A Pagar");
        rdPagar.setBounds(95, 20, 80, 18);
        rdPagar.setFont(new Font("Arial", 0, 12));
        painelFrete.add(rdPagar);
        
        
        
        groupOrigem = new ButtonGroup();
        groupOrigem.add(rdComercializacao);
        groupOrigem.add(rdDiversos);
   
   
   
   //-------------------------------------------------------------------------------------------//
   
   
        lblVeiculo = new JLabel("Veiculo");
        lblVeiculo.setBounds(425, 120, 100, 22);
        painelPrincipal.add(lblVeiculo);
        
        cbVeiculo = new JComboBox();
        cbVeiculo.setBounds(425, 140, 120, 22);
        painelPrincipal.add(cbVeiculo);
   //-------------------------------------------------------------------------------------------//
   
   
        lblOrigem = new JLabel("Origem");
        lblOrigem.setBounds(10, 180, 60, 22);
        painelPrincipal.add(lblOrigem);
        
        txtOrigem = new JTextField();
        txtOrigem.setBounds(10, 200, 240, 22);
        painelPrincipal.add(txtOrigem);
   
   
   //-------------------------------------------------------------------------------------------//
        lblDestino = new JLabel("Destino");
        lblDestino.setBounds(10, 230, 60, 22);
        painelPrincipal.add(lblDestino);
        
        txtDestino = new JTextField();
        txtDestino.setBounds(10, 250, 240, 22);
        painelPrincipal.add(txtDestino);
   //-------------------------------------------------------------------------------------------//
   
       lblDescricao = new JLabel("Descrição da Mercadoria");
        lblDescricao.setBounds(10, 280, 200, 22);
        painelPrincipal.add(lblDescricao);
        
        txtDescricao = new JTextField();
        txtDescricao.setBounds(10, 300, 240, 22);
        painelPrincipal.add(txtDescricao);
   //-------------------------------------------------------------------------------------------//
   
        lblObservacao = new JLabel("Observação");
        lblObservacao.setBounds(10, 330, 120, 22);
        painelPrincipal.add(lblObservacao);
        
        txtObservacao = new JTextField();
        txtObservacao.setBounds(10, 350, 240, 50);
        painelPrincipal.add(txtObservacao);
   //-------------------------------------------------------------------------------------------//
   
   
   
        lblBAG = new JLabel("BAG");
        lblBAG.setBounds(440, 180, 60, 22);
        painelPrincipal.add(lblBAG);
        
        txtBAG = new JTextField();
        txtBAG.setBounds(440, 200, 115, 22);
        painelPrincipal.add(txtBAG);
   
   
   //-------------------------------------------------------------------------------------------//
        lblSacos = new JLabel("Quantidade/Sacos");
        lblSacos.setBounds(440, 220, 200, 22);
        painelPrincipal.add(lblSacos);
        
        txtSacos = new JTextField();
        txtSacos.setBounds(440, 240, 115, 22);
        painelPrincipal.add(txtSacos);
   //-------------------------------------------------------------------------------------------//
   
       lblCaixas = new JLabel("Quantidade/Caixas");
        lblCaixas.setBounds(440, 260, 200, 22);
        painelPrincipal.add(lblCaixas);
        
        txtCaixas = new JTextField();
        txtCaixas.setBounds(440, 280, 115, 22);
        painelPrincipal.add(txtCaixas);
   //-------------------------------------------------------------------------------------------//
   
        lblPreco = new JLabel("Preço");
        lblPreco.setBounds(440, 300, 120, 22);
        painelPrincipal.add(lblPreco);
        
        txtPreco = new JTextField();
        txtPreco.setBounds(440, 320, 115, 22);
        painelPrincipal.add(txtPreco);
   //-------------------------------------------------------------------------------------------//
   
   
        lblAdiantamento = new JLabel("Adiantamento");
        lblAdiantamento.setBounds(440, 340, 80, 22);
        painelPrincipal.add(lblAdiantamento);
        
        txtAdiantamento = new JTextField();
        txtAdiantamento.setBounds(440, 360, 115, 22);
        painelPrincipal.add(txtAdiantamento);
   
   
   //-------------------------------------------------------------------------------------------//
        lblDesconto = new JLabel("Desconto");
        lblDesconto.setBounds(440, 380, 200, 22);
        painelPrincipal.add(lblDesconto);
        
        txtSacos = new JTextField();
        txtSacos.setBounds(440, 400, 115, 22);
        painelPrincipal.add(txtSacos);
   //-------------------------------------------------------------------------------------------//
   
       lblISS = new JLabel("ISS");
        lblISS.setBounds(440, 420, 200, 22);
        painelPrincipal.add(lblISS);
        
        txtISS = new JTextField();
        txtISS.setBounds(440, 440, 115, 22);
        painelPrincipal.add(txtISS);
   //-------------------------------------------------------------------------------------------//
   
        lblTotal = new JLabel("Total");
        lblTotal.setBounds(440, 460, 120, 22);
        painelPrincipal.add(lblTotal);
        
        txtTotal = new JTextField();
        txtTotal.setBounds(440, 480, 115, 22);
        painelPrincipal.add(txtTotal);
   //-------------------------------------------------------------------------------------------//
   
      painelVincular = new JPanel();
        painelVincular.setLayout(null);
        painelVincular.setSize(320, 100);
        painelVincular.setLocation(10, 410);
        painelVincular.setBorder(BorderFactory.createTitledBorder("Vincular"));
        painelPrincipal.add(painelVincular);
   //-------------------------------------------------------------------------------------------//
   
        painelVenda = new JPanel();
        painelVenda.setLayout(null);
        painelVenda.setSize(100, 70);
        painelVenda.setLocation(10, 20);
        painelVenda.setBorder(BorderFactory.createTitledBorder(""));
        painelVincular.add(painelVenda);
   
   
   //-------------------------------------------------------------------------------------------//
   
   
        rdVenda = new JRadioButton("Venda");
        rdVenda.setBounds(5, 10, 80, 18);
        rdVenda.setFont(new Font("Arial", 0, 12));
        painelVenda.add(rdVenda);
        
        
        
         rdCompra = new JRadioButton("Batata");
        rdCompra.setBounds(5, 40, 80, 18);
        rdCompra.setFont(new Font("Arial", 0, 12));
        painelVenda.add(rdCompra);
        
        
        
        groupVenda = new ButtonGroup();
        groupVenda.add(rdVenda);
        groupVenda.add(rdCompra);
   //-------------------------------------------------------------------------------------------//
   
   
        painelBatata = new JPanel();
        painelBatata.setLayout(null);
        painelBatata.setSize(100, 70);
        painelBatata.setLocation(120, 20);
        painelBatata.setBorder(BorderFactory.createTitledBorder(""));
        painelVincular.add(painelBatata);
   
   
   //-------------------------------------------------------------------------------------------//
   
   
        rdBatata = new JRadioButton("Batata");
        rdBatata.setBounds(5, 10, 80, 18);
        rdBatata.setFont(new Font("Arial", 0, 12));
        painelBatata.add(rdBatata);
        
        
        
         rdCebola = new JRadioButton("Cebola");
        rdCebola.setBounds(5, 40, 80, 18);
        rdCebola.setFont(new Font("Arial", 0, 12));
        painelBatata.add(rdCebola);
        
        
        
        groupBatata = new ButtonGroup();
        groupBatata.add(rdBatata);
        groupBatata.add(rdCebola);
   //-------------------------------------------------------------------------------------------//
   
   
      
       btnConsultaMotorista = new JButton();
       btnConsultaMotorista.setBounds(390, 40, 20, 20);       
       btnConsultaMotorista.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
       btnConsultaMotorista.setToolTipText("Pesquisar Motorista");
       btnConsultaMotorista.setHorizontalTextPosition(SwingConstants.CENTER);
        
       painelPrincipal.add(btnConsultaMotorista);
   //-------------------------------------------------------------------------------------------//
   
       btnConsultaProdutor = new JButton();
       btnConsultaProdutor.setBounds(390, 90, 20, 20);       
       btnConsultaProdutor.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
       btnConsultaProdutor.setToolTipText("Pesquisar Produtor");
       btnConsultaProdutor.setHorizontalTextPosition(SwingConstants.CENTER);
       btnConsultaProdutor.addActionListener((java.awt.event.ActionEvent evt) -> {  
           
           ConsultaFornecedorProdutor_Simplificado consult = new ConsultaFornecedorProdutor_Simplificado();
           consult.desenharTela();
        });
        
       painelPrincipal.add(btnConsultaProdutor);
   //-------------------------------------------------------------------------------------------//
   
       btnConsultaVinculo = new JButton();
       btnConsultaVinculo.setBounds(230, 70, 22, 22);       
       btnConsultaVinculo.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/pesquisa.png"));
       btnConsultaVinculo.setToolTipText("Consulta Venda");
       btnConsultaVinculo.setHorizontalTextPosition(SwingConstants.CENTER);
        
       painelVincular.add(btnConsultaVinculo);
   //-------------------------------------------------------------------------------------------//
   
        txtTotalVincular= new JTextField();
        txtTotalVincular.setBounds(260, 70, 50, 22);
        painelVincular.add(txtTotalVincular);
   
        
         
             // ---------------- BOTAO GRAVAR-----//
        btnGravar = new JButton("Gravar");
       btnGravar.setBounds(60, 520, 100, 35);     
        btnGravar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/salvar2.png"));
         btnGravar.setFont(new Font("Arial", 1, 13));
       btnGravar.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelPrincipal.add(btnGravar);
       
        // ---------------- BOTAO CANCELAR-----//
       btnConsultar = new JButton("Consultar");
       btnConsultar.setBounds(170, 520, 100, 35);    
       btnConsultar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/consulta.png"));
        btnConsultar.setFont(new Font("Arial", 1, 13));
       btnConsultar.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelPrincipal.add(btnConsultar);
        
          // ---------------- BOTAO CANCELAR-----//
       btnCancelar = new JButton("Cancelar");
       btnCancelar.setBounds(280, 520, 100, 35);  
       btnCancelar.setIcon(new ImageIcon("/Workspace/Maquina/src/Sistema/cancelar2.png"));    
       btnCancelar.setFont(new Font("Arial", 1, 13));
       btnCancelar.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelPrincipal.add(btnCancelar);
       
       
        
         // ---------------- BOTAO SAIR-----//
       btnSair = new JButton("Sair");
       btnSair.setBounds(390, 520, 100, 35);   
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
