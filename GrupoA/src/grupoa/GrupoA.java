
package grupoa;

import java.util.Scanner;


public class GrupoA {

   
    public static void main(String[] args) {
        
      Scanner ler = new Scanner(System.in);
      
      Empresa empresa = new Empresa();
      Predios predio = new Predios();
      Salas sala = new Salas();
      Mesa mesa = new Mesa();
      Computador computador = new Computador();
      Monitor monitor = new Monitor();
      Perifericos periferico = new Perifericos();
      
      String resp = "";
      
      
      empresa.setNome("Janize jóias");
      empresa.setDescricao("Empresa de jóias");
      empresa.setAnoDeCompra(2019);
      empresa.setValorComprado(950.000f);
      empresa.getDepreciacao();
      
      
      
      
        
        
       
    }
    
    
    
    
    
}
