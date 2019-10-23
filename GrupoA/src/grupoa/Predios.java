
package grupoa;


public class Predios extends Empresa {
    
    
    private int Ano_De_Compra;
    private float Valor_Comprado;
    final private int Depreciacao = 4;
    
    void setAnoDeCompra(int ano_de_compra){
        
        this.Ano_De_Compra = ano_de_compra;
    }
    void setValorComprado(float ValorComprado){
        
        this.Valor_Comprado = ValorComprado;
    }
    public int getDepreciacao(){
        
        return Depreciacao;
    }
    public float getValorComprado(){
        
        return Valor_Comprado;
    }
    public int getAnoDeCompra(){
        
        return Ano_De_Compra;
    }
}
