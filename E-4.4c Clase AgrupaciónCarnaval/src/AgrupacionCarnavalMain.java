/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Manuel Cañamaque
 */
public class AgrupacionCarnavalMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AgrupacionCarnaval carnaval = new AgrupacionCarnaval("Nombre", 1, "yo", 8);
        if(carnaval.isCorrecto()){
            System.out.println("Correcto");
        }else{
            System.out.println("No Correcto");
        }
        carnaval.puntuar(100);
        System.out.println(""+carnaval.toString());
        carnaval.puntuar( 10,20,10,10);
        System.out.println(""+carnaval.toString());    
        
    }
    
}
