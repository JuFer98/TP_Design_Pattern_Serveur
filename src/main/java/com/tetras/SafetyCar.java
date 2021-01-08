package com.tetras;

public class SafetyCar {
    private static SafetyCar instance = new SafetyCar();

    private SafetyCar() {
    }

    public static SafetyCar getInstance() {
        return instance;
    }
}