/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Manuel Cañamaque
 */
public class Asignatura {
    String nombre;
    int codigoNumerico;
    String curso;

    public Asignatura(String nombre, int codigoNumerico, String curso) {
        this.nombre = nombre;
        this.codigoNumerico = codigoNumerico;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigoNumerico() {
        return codigoNumerico;
    }

    public String getCurso() {
        return curso;
    }
    
    
}
