
package model;


public class HistoricoDespesaModel {
    
    private String descricao;
    private String ativo;

    
    
    public HistoricoDespesaModel (String descricao, String ativo){
        
        this.descricao= descricao;
        this.ativo= ativo;
                
    } 

    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }
    
    
    
    
    
    
    
    
    
}
