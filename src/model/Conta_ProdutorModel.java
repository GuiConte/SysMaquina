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
public class Conta_ProdutorModel {

    private int cod_produtor_conta;
    private int cod_produtor;
    private String banco;
    private String agencia;
    private String conta_corrente;
    private String titular;
    private String cpf;

    public Conta_ProdutorModel(int cod_produtor_conta, int cod_produtor, String banco, String agencia, String conta_corrente,
            String titular, String cpf) {
        this.cod_produtor_conta = cod_produtor_conta;
        this.cod_produtor = cod_produtor;
        this.banco = banco;
        this.agencia = agencia;
        this.conta_corrente = conta_corrente;
        this.titular = titular;
        this.cpf = cpf;
    }

    public Conta_ProdutorModel(String banco, String agencia, String conta_corrente, String titular, String cpf) {
        this.banco = banco;
        this.agencia = agencia;
        this.conta_corrente = conta_corrente;
        this.titular = titular;
        this.cpf = cpf;
    }

    /**
     * @return the cod_produtor_conta
     */
    public int getCod_produtor_conta() {
        return cod_produtor_conta;
    }

    /**
     * @param cod_produtor_conta the cod_produtor_conta to set
     */
    public void setCod_produtor_conta(int cod_produtor_conta) {
        this.cod_produtor_conta = cod_produtor_conta;
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
     * @return the banco
     */
    public String getBanco() {
        return banco;
    }

    /**
     * @param banco the banco to set
     */
    public void setBanco(String banco) {
        this.banco = banco;
    }

    /**
     * @return the agencia
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    /**
     * @return the conta_corrente
     */
    public String getConta_corrente() {
        return conta_corrente;
    }

    /**
     * @param conta_corrente the conta_corrente to set
     */
    public void setConta_corrente(String conta_corrente) {
        this.conta_corrente = conta_corrente;
    }

    /**
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
