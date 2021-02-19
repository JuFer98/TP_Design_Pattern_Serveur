package com.tetras;

public class URL implements Requete {
    String path;
    
    public URL(String path){
        this.path = path;
    }

    public void afficher() {
        System.out.println(path);
    }
}