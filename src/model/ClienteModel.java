/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Guilherme
 */
public class ClienteModel {

    private int cod_cliente;
    private String nome;
    private String endereco;
    private int cod_cidade;
    private String cep;
    private String telefone;
    private String rg_ie;
    private String cpf_cnpj;
    private String data_cadastro;
    private String obs;
    private String celular;
    private int usuario;
    private String bloqueado;
    private int prazo;
    private String email;
    private String numero;
    private String bairro;
    private String complemento;
    private int tipo_pessoa;
    private float limite_credito;
    private String fantasia;
    private String nfe;
    private int cod_estado;

    //Cliente em Geral
    public ClienteModel(int id, String nome, String endereco, int cidade, String cep, String fone, String rg_ie,
            String cpf_cnpj, String data_cadastro, String obs, String cel, int usuario, String bloqueado,
            int prazo, String email, String numero, String bairro, String complemento, int tipo_pessoa,
            float limite_credito, String fantasia, String nfe) {
        this.cod_cliente = id;
        this.nome = nome;
        this.endereco = endereco;
        this.cod_cidade = cidade;
        this.cep = cep;
        this.telefone = fone;
        this.rg_ie = rg_ie;
        this.cpf_cnpj = cpf_cnpj;
        this.data_cadastro = data_cadastro;
        this.obs = obs;
        this.celular = cel;
        this.usuario = usuario;
        this.bloqueado = bloqueado;
        this.prazo = prazo;
        this.email = email;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.tipo_pessoa = tipo_pessoa;
        this.limite_credito = limite_credito;
        this.fantasia = fantasia;
        this.nfe = nfe;
    }

    //Consulta de cliente especifico
    public ClienteModel(int id, String nome, String endereco, int cidade, String cep, String fone, String rg_ie,
            String cpf_cnpj, String data_cadastro, String obs, String cel, int usuario, String bloqueado,
            int prazo, String email, String numero, String bairro, String complemento, int tipo_pessoa,
            float limite_credito, String fantasia, String nfe, int cod_estado) {
        this.cod_cliente = id;
        this.nome = nome;
        this.endereco = endereco;
        this.cod_cidade = cidade;
        this.cep = cep;
        this.telefone = fone;
        this.rg_ie = rg_ie;
        this.cpf_cnpj = cpf_cnpj;
        this.data_cadastro = data_cadastro;
        this.obs = obs;
        this.celular = cel;
        this.usuario = usuario;
        this.bloqueado = bloqueado;
        this.prazo = prazo;
        this.email = email;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.tipo_pessoa = tipo_pessoa;
        this.limite_credito = limite_credito;
        this.fantasia = fantasia;
        this.nfe = nfe;
        this.cod_estado = cod_estado;
    }

    /**
     * @return the cod_cliente
     */
    public int getCod_cliente() {
        return cod_cliente;
    }

    /**
     * @param cod_cliente the cod_cliente to set
     */
    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the cod_cidade
     */
    public int getCod_cidade() {
        return cod_cidade;
    }

    /**
     * @param cod_cidade the cod_cidade to set
     */
    public void setCod_cidade(int cod_cidade) {
        this.cod_cidade = cod_cidade;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the rg_ie
     */
    public String getRg_ie() {
        return rg_ie;
    }

    /**
     * @param rg_ie the rg_ie to set
     */
    public void setRg_ie(String rg_ie) {
        this.rg_ie = rg_ie;
    }

    /**
     * @return the cpf_cnpj
     */
    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    /**
     * @param cpf_cnpj the cpf_cnpj to set
     */
    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    /**
     * @return the data_cadastro
     */
    public String getData_cadastro() {
        return data_cadastro;
    }

    /**
     * @param data_cadastro the data_cadastro to set
     */
    public void setData_cadastro(String data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    /**
     * @return the obs
     */
    public String getObs() {
        return obs;
    }

    /**
     * @param obs the obs to set
     */
    public void setObs(String obs) {
        this.obs = obs;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the usuario
     */
    public int getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the bloqueado
     */
    public String getBloqueado() {
        return bloqueado;
    }

    /**
     * @param bloqueado the bloqueado to set
     */
    public void setBloqueado(String bloqueado) {
        this.bloqueado = bloqueado;
    }

    /**
     * @return the prazo
     */
    public int getPrazo() {
        return prazo;
    }

    /**
     * @param prazo the prazo to set
     */
    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the tipo_pessoa
     */
    public int getTipo_pessoa() {
        return tipo_pessoa;
    }

    /**
     * @param tipo_pessoa the tipo_pessoa to set
     */
    public void setTipo_pessoa(int tipo_pessoa) {
        this.tipo_pessoa = tipo_pessoa;
    }

    /**
     * @return the limite_credito
     */
    public float getLimite_credito() {
        return limite_credito;
    }

    /**
     * @param limite_credito the limite_credito to set
     */
    public void setLimite_credito(float limite_credito) {
        this.limite_credito = limite_credito;
    }

    /**
     * @return the fantasia
     */
    public String getFantasia() {
        return fantasia;
    }

    /**
     * @param fantasia the fantasia to set
     */
    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    /**
     * @return the nfe
     */
    public String getNfe() {
        return nfe;
    }

    /**
     * @param nfe the nfe to set
     */
    public void setNfe(String nfe) {
        this.nfe = nfe;
    }

    /**
     * @return the cod_estado
     */
    public int getCod_estado() {
        return cod_estado;
    }

    /**
     * @param cod_estado the cod_estado to set
     */
    public void setCod_estado(int cod_estado) {
        this.cod_estado = cod_estado;
    }

}
