 package com.tetras;

import java.util.ArrayList;
import java.util.List;

public class RequeteHttp implements Requete {

    private List<Requete> reqs = new ArrayList<>();
    private int num;

    public RequeteHttp() {
	}

	public void ajouter(Requete req) {
        reqs.add(req);
    } 

    public void afficher() {
        reqs.stream().forEach(t -> t.afficher());
    }
    
    public int getnum() {
        return num;
    }

    public void exceptions() {
        for (Requete lurl : reqs) {
                if (lurl instanceof URLDangereux)
                    num = 403;
                else 
                if (lurl instanceof URLNull)
                    num = 500;
                else
                    num = 200;
            }
    }
}