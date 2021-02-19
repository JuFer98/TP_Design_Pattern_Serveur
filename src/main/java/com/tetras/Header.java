package com.tetras;


import java.util.HashMap;
import java.util.Map;

public class Header implements Requete{
    
    Map<String, String> headers = new HashMap<>();

    public Header(String string1, String string2) {
        headers.put(string1, string2);
    }

    public void afficher() {
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key +" "+ value);
        }
    }

}