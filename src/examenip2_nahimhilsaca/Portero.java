/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenip2_nahimhilsaca;

import java.util.Random;

/**
 *
 * @author nahim
 */

public class Portero extends Jugador {
    static Random rng= new Random();
    private int Agarre;
    private int lanzamieno_portero;// me equivoque en la variable jaja
    private int passing;
    private int random_pos = rng.nextInt(12)+1;
    private int random_nopos= rng.nextInt(5)+1;
    
   
    public Portero() {
        super();
    }

    public Portero( String nombre, int edad, String nacionalidad, String pie_habil, Equipo equipo_jugador) {
        super(nombre, edad, nacionalidad, pie_habil, equipo_jugador);
        setAgarre(agarre);
        setDisparo(disparo);
        setFisico(fisico);
        setLanzamieno_portero(lanzamieno_portero);
        setRitmo(ritmo);
        setEntrada(entrada);
        setVision(vision);
        setPassing(passing);
        setRegate(regate);
        
    }

    public int getAgarre() {
        return Agarre;
    }

    public void setAgarre(int Agarre) {
        
        while (Agarre<70) {            
            Agarre=random_pos*12;
        }
        this.Agarre = Agarre;
        
    }

    public int getLanzamieno_portero() {
        return lanzamieno_portero;
    }

    public void setLanzamieno_portero(int lanzamieno_portero) {
        
         while (lanzamieno_portero<70) {            
            lanzamieno_portero=random_pos*12;
        }
        this.lanzamieno_portero = lanzamieno_portero;
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        
         while (passing<70) {            
            passing=random_pos*12;
        }
        this.passing = passing;
    }

    public int getFisico() {
        return fisico;
    }

    public void setFisico(int fisico) {
            fisico= random_nopos*13;
        this.fisico = fisico;
    }

    public int getRitmo() {
        return ritmo;
    }

    public void setRitmo(int ritmo) {
        ritmo=random_nopos*13;
        this.ritmo = ritmo;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        entrada=random_nopos*13;
        this.entrada = entrada;
    }

    public int getVision() {
        return vision;
    }

    public void setVision(int vision) {
        vision=random_nopos*13;
        this.vision = vision;
    }

    public int getRegate() {
        return regate;
    }

    public void setRegate(int regate) {
        regate=random_nopos*13;
        this.regate = regate;
    }

    public int getDisparo() {
        
        return disparo;
    }

    public void setDisparo(int disparo) {
        disparo=random_nopos*13;
        this.disparo = disparo;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int Rating) {
        this.Rating = Rating;
    }
    
    

    @Override
    public String toString() {
        return super.toString();
    }

    @Override   
    public int rating() {
        
        int ratio;
        Portero p= new Portero();
        ratio=(p.getAgarre()+p.getDisparo()+p.getLanzamieno_portero()+p.getFisico()+p.getRitmo()+p.getEntrada()+p.getVision()+p.getPassing()+p.getRegate())/9;
        
        setRating(ratio);
        return ratio;
        
    }
}


    
    
  
   
    
    


    
    
    
    

