package model;

public class EmpresaModel {

        
    private String empresa;
    private String fantasia;
    private String cnpj;
    private String ie;
    private String endereco;
    private String bairro;
    private int cod_cidade;
    private int cod_estado;
    private String cep;
    private String telefone;
    private String mensagem;

    public EmpresaModel(String empresa, String fantasia, String cnpj, String ie, String endereco, String bairro,
            int cod_cidade, String cep, String telefone, String mensagem) {

        this.empresa = empresa;
        this.fantasia = fantasia;
        this.cnpj = cnpj;
        this.ie = ie;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cod_cidade = cod_cidade;
        this.cep = cep;
        this.telefone = telefone;
        this.mensagem = mensagem;

    }

    public EmpresaModel(int aInt, String string, String string0, String string1, String string2, int aInt0, String string3, int aInt1, String string4, String string5, String string6) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCod_cidade() {
        return cod_cidade;
    }

    public void setCod_cidade(int cod_cidade) {
        this.cod_cidade = cod_cidade;
    }

    public int getCod_estado() {
        return cod_estado;
    }

    public void setCod_estado(int cod_estado) {
        this.cod_estado = cod_estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
   
