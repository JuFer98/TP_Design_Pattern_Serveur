package com.tetras;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircuitTest {

    @Test
    public void testSingleton() {
            SafetyCar maSafetyCar1 = SafetyCar.getInstance();
            SafetyCar maSafetyCar2 = SafetyCar.getInstance();
            assertEquals(maSafetyCar1, maSafetyCar2);
        }
        
    private void assertExecutor(Voiture executor) {

        executor.accelerer();
        executor.tourner();
        executor.freiner();
    }

    @Test
    public void testMercedes() {
        Voiture executor = VoitureDuChampionnatDeFormuleUnFactory.getVoiture(VoitureType.mercedes);
        assertTrue(executor instanceof mercedes);
        assertExecutor(executor);
        assertEquals("noir", executor.getcouleur());
    }

    @Test
    public void testFerrari() {
        Voiture executor = VoitureDuChampionnatDeFormuleUnFactory.getVoiture(VoitureType.ferrari);
        assertTrue(executor instanceof ferrari);
        assertExecutor(executor);
        assertEquals("rouge", executor.getcouleur());
    }
    
    @Test
    public void testRenault() {
        Voiture executor = VoitureDuChampionnatDeFormuleUnFactory.getVoiture(VoitureType.renault);
        assertTrue(executor instanceof renault);
        assertExecutor(executor);
        assertEquals("bleu", executor.getcouleur());
    }

    
}
