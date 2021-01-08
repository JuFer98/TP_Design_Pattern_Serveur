package com.tetras;

import java.util.ArrayList;

public class CircuitDeCourse {

    private SafetyCar LaSafetyCar;
    private ArrayList<Voiture> LesVoitures;

    public CircuitDeCourse(SafetyCar lasafetycar) {  
        this.LaSafetyCar = lasafetycar ;
        this.LesVoitures = new ArrayList<Voiture>();
   }

   public SafetyCar getSafetyCar(){
       return this.LaSafetyCar;
   }

   public ArrayList<Voiture> getVoitures(){
    return this.LesVoitures;
}

}