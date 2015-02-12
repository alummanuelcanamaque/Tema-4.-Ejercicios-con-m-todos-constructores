/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Manuel Cañamaque
 */
public class MainAsignatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Asignatura matematicas = new Asignatura("Matematicas", 1017, "Curso 1");
        System.out.println(""+matematicas.getNombre());
        System.out.println(""+matematicas.getCodigoNumerico());
        System.out.println(""+matematicas.getCurso());
    }
    
}
