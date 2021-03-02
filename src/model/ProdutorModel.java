
package model;


public class ProdutorModel {

    private int cod_produtor;
    private String nome;
    private String fantasia;
    private int tipo_pessoa;
    private String endereco;
    private String bairro;
    private int cod_cidade;
    private String cep;
    private String telefone;
    private String cpf_cnpj;
    private String rg_ie;
    private String obs;
    private int usuario;
    private String bloqueado;
    private int cod_estado;

    public ProdutorModel(int cod_produtor, String nome, String fantasia, int tipo_pessoa, String endereco, String bairro,
            int cod_cidade, String cep, String telefone, String cpf_cnpj, String rg_ie, String obs,
            int usuario, String bloqueado) {
        this.cod_produtor = cod_produtor;
        this.nome = nome;
        this.fantasia = fantasia;
        this.tipo_pessoa = tipo_pessoa;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cod_cidade = cod_cidade;
        this.cep = cep;
        this.telefone = telefone;
        this.cpf_cnpj = cpf_cnpj;
        this.rg_ie = rg_ie;
        this.obs = obs;
        this.usuario = usuario;
        this.bloqueado = bloqueado;
    }

    public ProdutorModel(int cod_produtor, String nome, String fantasia, int tipo_pessoa, String endereco, String bairro,
            int cod_cidade, String cep, String telefone, String cpf_cnpj, String rg_ie, String obs,
            int usuario, String bloqueado, int cod_estado) {
        this.cod_produtor = cod_produtor;
        this.nome = nome;
        this.fantasia = fantasia;
        this.tipo_pessoa = tipo_pessoa;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cod_cidade = cod_cidade;
        this.cep = cep;
        this.telefone = telefone;
        this.cpf_cnpj = cpf_cnpj;
        this.rg_ie = rg_ie;
        this.obs = obs;
        this.usuario = usuario;
        this.bloqueado = bloqueado;
        this.cod_estado = cod_estado;
    }

    /**
     * @return the cod_produtor
     */
    public int getCod_produtor() {
        return cod_produtor;
    }

    /**
     * @param cod_produtor the cod_produtor to set
     */
    public void setCod_produtor(int cod_produtor) {
        this.cod_produtor = cod_produtor;
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
