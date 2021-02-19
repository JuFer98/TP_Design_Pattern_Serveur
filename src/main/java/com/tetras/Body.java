package com.tetras;

public class Body implements Requete {
    String content;
    
    public Body(String content){
        this.content = content;
    }

    public void afficher() {
        System.out.println(content);
    }
}