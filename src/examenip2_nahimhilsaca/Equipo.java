/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenip2_nahimhilsaca;

import java.util.ArrayList;

/**
 *
 * @author nahim
 */
public class Equipo {
    
    private String nombre_equipo;
    private String pais;
    private int Rating;
    private ArrayList <Jugador> plantilla= new ArrayList<>();

    public Equipo() {
        
    }

    public Equipo(String nombre_equipo, String pais, int Rating) {
        this.nombre_equipo = nombre_equipo;
        this.pais = pais;
        this.Rating = Rating;
    }

    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public void setNombre_equipo(String nombre_equipo) {
        this.nombre_equipo = nombre_equipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int Rating) {
        this.Rating = Rating;
    }

    public ArrayList<Jugador> getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(ArrayList<Jugador> plantilla) {
        this.plantilla = plantilla;
    }

    @Override
    public String toString() {
        return "Equipo" + "nombre_equipo=" + nombre_equipo + ", pais=" + pais + ", Rating=" + Rating + ", plantilla=" + plantilla;
    }
    
    public int Rating(){
    
    int promedio=0;
    
        for (int i = 0; i < plantilla.size(); i++) {
            
            promedio+= plantilla.get(i).getRating();
            
        }
    
    return promedio;
    
    }
    
    
}//Fin de la clase
