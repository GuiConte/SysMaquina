
package model;


public class TabProdutorModel {
    
    private String produtor;
    private String ativo;

    
    public TabProdutorModel (String produtor, String ativo){
        
        this.produtor=produtor;
        this.ativo=ativo;
        
        
    }
    
    
    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }
    
    
    
}
