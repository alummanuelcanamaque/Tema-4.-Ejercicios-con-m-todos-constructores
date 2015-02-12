/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Manuel Cañamaque
 */
public class Reloj {
    private int horas = 0;
    private int minutos = 0;
    private int segundos = 0;    
    private String formato = "";
    private boolean PM = false;
    private boolean Am = false;
    private String hora = horas+":"+minutos+":"+segundos+" "+formato;

    public Reloj() {
        this.horas=0;
        this.minutos=0;
        this.segundos=0;
        this.hora = horas+":"+minutos+":"+segundos;
    }

    public Reloj(int horas, int minutos, int segundos) {
        if(horas>24 || horas<0){
            System.out.println("Hora incorrecta");
        }else{
            if(minutos>59 || minutos<0){
                System.out.println("Minutos incorrectos");
            }else{
                if(segundos>59 || segundos<0){
                    System.out.println("Segundos incorrectos");
                }else{
                    this.horas = horas;
                    this.minutos = minutos;
                    this.segundos = segundos;
                    this.hora = horas+":"+minutos+":"+segundos;                    
                }
            }
        } 
    }

    public String getHora() {        
        return hora;
    }

    public void setHora(int horas, int minutos) {
        if(horas>24 || horas<0){
            System.out.println("Hora incorrecta");
        }else{
            if(minutos>59 || minutos<0){
                System.out.println("Minutos incorrectos");
            }else{                
                this.horas = horas;
                this.minutos = minutos;
                this.segundos = 0;
                this.hora = horas+":"+minutos+":"+segundos; 
            }
        }
    }
    
    public void setHora(int horas, int minutos, int segundos) {
        if(horas>24 || horas<0){
            System.out.println("Hora incorrecta");
        }else{
            if(minutos>59 || minutos<0){
                System.out.println("Minutos incorrectos");
            }else{
                if(segundos>59 || segundos<0){
                    System.out.println("Segundos incorrectos");
                }else{
                    this.horas = horas;
                    this.minutos = minutos;
                    this.segundos = segundos;
                    this.hora = horas+":"+minutos+":"+segundos;                    
                }
            }
        }
    }
    
    public void setHora(int horas, int minutos, int segundos, String formato) {
        if(horas>24 || horas<0){
            System.out.println("Hora incorrecta");
        }else{
            if(minutos>59 || minutos<0){
                System.out.println("Minutos incorrectos");
            }else{
                if(segundos>59 || segundos<0){
                    System.out.println("Segundos incorrectos");
                }else{
                    while(horas>12){
                        horas=horas-12;
                    }
                    this.horas = horas;
                    this.minutos = minutos;
                    this.segundos = segundos;
                    if(formato.contains("AM") || formato.contains("am")){
                        this.hora = horas+":"+minutos+":"+segundos+" AM"; 
                    }else{
                        if(formato.contains("PM") || formato.contains("pm")){
                            this.hora = horas+":"+minutos+":"+segundos+" PM"; 
                        }else{
                            System.out.println("Formato incorrecto");
                        }
                    }                 
                }
            }
        }
    }
}
