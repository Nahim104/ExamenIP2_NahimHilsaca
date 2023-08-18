/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenip2_nahimhilsaca;

import static examenip2_nahimhilsaca.Portero.rng;

/**
 *
 * @author nahim
 */
public class Mediocampista extends Jugador {
    private int vision;
    private int passing;
    private int regate;
    private int random_pos = rng.nextInt(12)+1;
    private int random_nopos= rng.nextInt(5)+1;

    public Mediocampista() {
        super();
    }

    public Mediocampista(int vision, int passing, int regate, String nombre, int edad, String nacionalidad, String pie_habil, Equipo equipo_jugador) {
        super(nombre, edad, nacionalidad, pie_habil, equipo_jugador);
        this.vision = vision;
        this.passing = passing;
        this.regate = regate;
    }

    public int getVision() {
        
        return vision;
    }

    public void setVision(int vision) {
                while (vision<70) {            
            vision=random_pos*12;
        }
        this.vision = vision;
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

    public int getRegate() {
        return regate;
    }

    public void setRegate(int regate) {
                while (regate<70) {            
            regate=random_pos*12;
        }
        this.regate = regate;
    }

    public int getAgarre() {
        return agarre;
    }

    public void setAgarre(int agarre) {
         agarre= random_nopos*13;
        this.agarre = agarre;
    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(int lanzamiento) {
         lanzamiento= random_nopos*13;
        this.lanzamiento = lanzamiento;
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
         ritmo= random_nopos*13;
        this.ritmo = ritmo;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
         entrada= random_nopos*13;
        this.entrada = entrada;
    }

    public int getDisparo() {
        return disparo;
    }

    public void setDisparo(int disparo) {
         disparo= random_nopos*13;
        this.disparo = disparo;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int Rating) {
        this.Rating = Rating;
    }
    
    


    @Override
    public int rating() {
      int ratio;
            Mediocampista p = new Mediocampista();
        ratio=(p.getAgarre()+p.getDisparo()+p.getLanzamiento()+p.getFisico()+p.getRitmo()+p.getEntrada()+p.getVision()+p.getPassing()+p.getRegate())/9;
        
        setRating(ratio);
        return ratio;
    }
    
    
    
    
}
