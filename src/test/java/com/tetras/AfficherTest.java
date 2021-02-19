package com.tetras;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class AfficherTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

        @Test
        void testAffichage() {
            RequeteHttp requete = new RequeteHttp();
            requete.ajouter(new URL("/le"));
            requete.ajouter(new Header("gateau","est"));
            requete.ajouter(new Body("servi"));
            //
            StringWriter out = new StringWriter();
            PrintWriter writer = new PrintWriter(out);
            writer.println("/le");
            writer.println("gateau est");
            writer.println("servi");
            requete.afficher();
            //
            assertEquals(out.toString(), outContent.toString());
        }
    }