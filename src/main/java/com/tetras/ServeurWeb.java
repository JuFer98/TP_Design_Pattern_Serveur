package com.tetras;

public class ServeurWeb {
    
    public int repondre(RequeteHttp req) {
        req.exceptions();
        return req.getnum();
    }
}