package com.tetras;

import java.util.ArrayList;
import java.util.Collection;

public class CircuitDeCourse {

    private SafetyCar LaSafetyCar;
    private Collection<Voiture> LesVoitures;

    public CircuitDeCourse(SafetyCar lasafetycar) {  
        this.LaSafetyCar = lasafetycar ;
        this.LesVoitures = new ArrayList<Voiture>();
   }

}