/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Manuel Cañamaque
 */
public class MainReloj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Reloj reloj = new Reloj();
        reloj.setHora(23, 23, 23, "pm");
        System.out.println(""+reloj.getHora());
        
    }
    
}
