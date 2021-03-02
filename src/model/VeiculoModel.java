
package model;


public class VeiculoModel {
    
    private String placa;
    private String descricao;
    
    
    public VeiculoModel (String placa, String descricao){
        
        this.placa= placa;
        this.descricao=descricao;
    }

    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
