
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
      
      predio.setNome("Burj Khalifa");
      predio.setDescricao("Edifícil mais alto do mundo");
      predio.setAnoDeCompra(2010);
      predio.setValorComprado(999.000f);
      predio.getDepreciacao();
      predio.getAnoDeCompra();
      predio.getValorComprado();
      
      sala.setNome("Sala 40");
      sala.setDescricao("Sala de video");
      sala.setAnoDeCompra(2016);
      sala.setValorComprado(15.000f);
      sala.getAnoDeCompra();
      sala.getValorComprado();
      sala.getDepreciacao();
      
      mesa.setNome("beauty mesa");
      mesa.setDescricao("Madeira");
      mesa.setAnoDeCompra(2014);
      mesa.setValorComprado(1.000f);
      mesa.getAnoDeCompra();
      mesa.getValorComprado();
      mesa.getDepreciacao();  
      
      computador.setNome("Asus");
      computador.setDescricao("gamer");
      computador.setAnoDeCompra(2018);
      computador.setValorComprado(9.000f);
      computador.getAnoDeCompra();
      computador.getValorComprado();
      computador.getDepreciacao(); 
      
      monitor.setNome("DELL");
      monitor.setDescricao("LED");
      monitor.setAnoDeCompra(2014);
      monitor.setValorComprado(250);
      monitor.getAnoDeCompra();
      monitor.getValorComprado();
      monitor.getDepreciacao();  
      
      periferico.setNome("Fone");
      periferico.setDescricao("Estéreo");
      periferico.setAnoDeCompra(2016);
      periferico.setValorComprado(150);
      periferico.getAnoDeCompra();
      periferico.getValorComprado();
      periferico.getDepreciacao();  
       
    }
    
    
    
    
    
}
