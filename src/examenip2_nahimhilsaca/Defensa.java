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
public class Defensa extends Jugador {
    private int fisico;
    private int ritmo;
    private int entrada;
    private int random_pos = rng.nextInt(12)+1;
    private int random_nopos= rng.nextInt(5)+1;

    public Defensa() {
        super();
    }

    public Defensa(int fisico, int ritmo, int entrada, String nombre, int edad, String nacionalidad, String pie_habil, Equipo equipo_jugador) {
        super(nombre, edad, nacionalidad, pie_habil, equipo_jugador);
        this.fisico = fisico;
        this.ritmo = ritmo;
        this.entrada = entrada;
    }

    public int getFisico() {
        return fisico;
    }

    public void setFisico(int fisico) {
        while (fisico<70) {            
            fisico=random_pos*12;
        }
        this.fisico = fisico;
    }

    public int getRitmo() {
        return ritmo;
    }

    public void setRitmo(int ritmo) {
        while (ritmo<70) {            
            ritmo=random_pos*12;
        }
        this.ritmo = ritmo;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        while (entrada<70) {            
            entrada=random_pos*12;
        }
        this.entrada = entrada;
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

    public int getVision() {
        return vision;
    }

    public void setVision(int vision) {
        vision= random_nopos*13;
        this.vision = vision;
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        passing= random_nopos*13;
        this.passing = passing;
    }

    public int getRegate() {
        return regate;
    }

    public void setRegate(int regate) {
        regate= random_nopos*13;
        this.regate = regate;
    }

    public int getDisparo() {
        return disparo;
    }

    public void setDisparo(int disparo) {
        disparo= random_nopos*13;
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
        Defensa p = new Defensa();
        ratio=(p.getAgarre()+p.getDisparo()+p.getLanzamiento()+p.getFisico()+p.getRitmo()+p.getEntrada()+p.getVision()+p.getPassing()+p.getRegate())/9;
        
        setRating(ratio);
        return ratio;
    
    
    }
    
}
