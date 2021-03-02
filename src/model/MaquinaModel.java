
package model;


public class MaquinaModel {
    
    private int cod_maquina;
    private String maquina;
    

    
    public MaquinaModel (String maquina){
        
       
        this.maquina= maquina;
        
    }

  
     public MaquinaModel (int cod_maquina,String maquina){
        
        this.cod_maquina=cod_maquina;
        this.maquina= maquina;
        
    }   

     
    public int getCod_maquina() {
        return cod_maquina;
    }

    /**
     *
     * @param cod_maquina
     */
    public void setCod_maquina(int cod_maquina) {
        this.cod_maquina = cod_maquina;
    }
    
    /**
     *
     * @return
     */
    public String getMaquina() {
        return maquina;
    }

    /**
     *
     * @param maquina
     */
    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }
    
    
    
}
