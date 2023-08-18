/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenip2_nahimhilsaca;

/**
 *
 * @author nahim
 */
public class Delantero extends Jugador {
    
    private int ritmo_d;
    private int disparo_d;
    private int regate_d;

    public Delantero() {
        super();
    }

    public Delantero(int ritmo_d, int disparo_d, int regate_d, String nombre, int edad, String nacionalidad, String pie_habil, Equipo equipo_jugador) {
        super(nombre, edad, nacionalidad, pie_habil, equipo_jugador);
        this.ritmo_d = ritmo_d;
        this.disparo_d = disparo_d;
        this.regate_d = regate_d;
    }

    public int getRitmo_d() {
        return ritmo_d;
    }

    public void setRitmo_d(int ritmo_d) {
        this.ritmo_d = ritmo_d;
    }

    public int getDisparo_d() {
        return disparo_d;
    }

    public void setDisparo_d(int disparo_d) {
        this.disparo_d = disparo_d;
    }

    public int getRegate_d() {
        return regate_d;
    }

    public void setRegate_d(int regate_d) {
        this.regate_d = regate_d;
    }

    public int getAgarre() {
        return agarre;
    }

    public void setAgarre(int agarre) {
        this.agarre = agarre;
    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public int getFisico() {
        return fisico;
    }

    public void setFisico(int fisico) {
        this.fisico = fisico;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public int getVision() {
        return vision;
    }

    public void setVision(int vision) {
        this.vision = vision;
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
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
    public void poscion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void no_posicion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

   
    
    
    
    
    
    
    
}
