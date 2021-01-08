package com.tetras;

public class VoitureDuChampionnatDeFormuleUnFactory {

    public static Voiture getVoiture(VoitureType type) {
        if (VoitureType.mercedes.equals(type))
            return new mercedes("noir");
        else if (VoitureType.ferrari.equals(type))
            return new ferrari("rouge");
        else if (VoitureType.renault.equals(type))
            return new renault("bleu");
        else
            throw new IllegalArgumentException();
    }
}