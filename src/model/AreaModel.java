
package model;


public class AreaModel {
    
    private String descricao;
    private String ativo;
    
    
    
    public AreaModel( String descricao, String ativo){
        
        this.descricao= descricao;
        this.ativo=ativo;
        
        
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

    public void setAtivo(String Ativo) {
        this.ativo = Ativo;
    }
    
    
}
