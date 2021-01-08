package com.tetras;

public class renault implements Voiture{
    private String couleur;
      
    public renault(String color) {  
         this.couleur = color ;
    }
    
    public String getcouleur(){
        return couleur;
    }

    public void accelerer() {
    }

    public void tourner() {

    }

    public void freiner() {

    }
}