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
public class CidadeModel {

    private int cod_cidade;
    private int cod_estado;
    private String cidade;
    private int cod_IBGE;

    public CidadeModel(int id, String cidade) {
        this.cod_cidade = id;
        this.cidade = cidade;
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

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the cod_IBGE
     */
    public int getCod_IBGE() {
        return cod_IBGE;
    }

    /**
     * @param cod_IBGE the cod_IBGE to set
     */
    public void setCod_IBGE(int cod_IBGE) {
        this.cod_IBGE = cod_IBGE;
    }

}
