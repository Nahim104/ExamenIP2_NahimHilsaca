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
public class Delantero extends Jugador {
    
    private int ritmo_d;
    private int disparo_d;
    private int regate_d;
     private int random_pos = rng.nextInt(12)+1;
    private int random_nopos= rng.nextInt(5)+1;

    public Delantero() {
        super();
    }

    public Delantero( String nombre, int edad, String nacionalidad, String pie_habil, Equipo equipo_jugador) {
        super(nombre, edad, nacionalidad, pie_habil, equipo_jugador);
        setAgarre(agarre);
        setDisparo(disparo);
        setFisico(fisico);
        setLanzamiento(lanzamiento);
        setRitmo(ritmo);
        setEntrada(entrada);
        setVision(vision);
        setPassing(passing);
        setRegate(regate);
    }

    public int getRitmo_d() {
        return ritmo_d;
    }

    public void setRitmo_d(int ritmo_d) {
          while (ritmo_d<70) {            
            ritmo_d=random_pos*12;
        }
        this.ritmo_d = ritmo_d;
    }

    public int getDisparo_d() {
        return disparo_d;
    }

    public void setDisparo_d(int disparo_d) {
          while (disparo_d<70) {            
            disparo_d=random_pos*12;
        }
        this.disparo_d = disparo_d;
    }

    public int getRegate_d() {
        return regate_d;
    }

    public void setRegate_d(int regate_d) {
        while (regate_d<70) {            
            regate_d=random_pos*12;
        }
        this.regate_d = regate_d;
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

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
          entrada= random_nopos*13;
        this.entrada = entrada;
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
            Delantero p = new Delantero();
        ratio=(p.getAgarre()+p.getDisparo()+p.getLanzamiento()+p.getFisico()+p.getRitmo()+p.getEntrada()+p.getVision()+p.getPassing()+p.getRegate())/9;
        
        setRating(ratio);
        return ratio;
    }
    
    

   
    
    
    
    
    
    
    
}
