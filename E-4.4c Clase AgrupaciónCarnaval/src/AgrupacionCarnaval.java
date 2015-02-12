/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Manuel Cañamaque
 */
public class AgrupacionCarnaval {
    private String nombre;
    private int categoria;
    private String autorLetra;
    private String autorMusica;
    private int numComponentes;
    private int puntuacion = 0;
    
    private final int CHIRIGOTA = 1;
    private final int COMPARSA = 2;
    private final int CORO = 3;
    private final int CUARTETO = 4;


    public AgrupacionCarnaval(String nombre, int categoria, String autorLetra, String autorMusica, int numComponentes) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.autorLetra = autorLetra;
        this.autorMusica = autorMusica;
        this.numComponentes = numComponentes;
    }
    
    public AgrupacionCarnaval(String nombre, int categoria, String autorLetraYMusica, int numComponentes) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.autorLetra = autorLetraYMusica;
        this.autorMusica = autorLetraYMusica;
        this.numComponentes = numComponentes;
    }
    
    public boolean isCorrecto(){
        boolean correcto = true;
        if(nombre.equals("")){
            correcto=false;
        }
        if(categoria>4 || categoria<1){
            correcto=false;
        }
        if(categoria==1 && (numComponentes<7 || numComponentes>12)){
            correcto=false;
        }
        if(categoria==2 && (numComponentes<10 || numComponentes>15)){
            correcto=false;
        }
        if(categoria==3 && (numComponentes<16 || numComponentes>45)){
            correcto=false;
        }
        if(categoria==4 && (numComponentes<3 || numComponentes>5)){
            correcto=false;
        }        
        return correcto;
    }
    
    public boolean puntuar(int puntuacion){
        if(puntuacion>=0 && puntuacion<=100){
            this.puntuacion += puntuacion;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean puntuar(int puntPresentacion, int puntPasodobles, int puntCuples, int puntPopurri){
        boolean correcto = true;
        if(puntPresentacion<0 || puntPresentacion>10){
            correcto=false;            
        }
        if(puntPasodobles<0 || puntPasodobles>40){
            correcto=false;            
        }
        if(puntCuples<0 || puntCuples>30){
            correcto=false;            
        }
        if(puntPopurri<0 || puntPopurri>20){
            correcto=false;            
        }
        if(correcto){
            this.puntuacion += (puntPresentacion+puntPasodobles+puntCuples+puntPopurri);
        }
        return correcto;
    }
    
    public int getPuntuacion(){
        return puntuacion;
    }
    
    public String toString(){
        String datos = "Nombre: "+this.nombre+"\nCategoria: "+this.categoria+"\nPuntuacion: "+this.puntuacion;
        return datos;
    }
}
