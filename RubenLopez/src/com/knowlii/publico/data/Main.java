package com.knowlii.publico.data;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.util.FileManager;

import java.io.InputStream;


/**
 * Created by Rubén López Díez on 02/04/2018.
 */
public class Main {

    private String fichero = "touristPlaces.ttl";
    private Model model;

    public void leer() {
        model = ModelFactory.createDefaultModel();
        InputStream in = FileManager.get().open(fichero);

        if (in == null) {
            throw new IllegalArgumentException("Fichero " + this.fichero + " no encontrado");
        }
        model.read(in, null, "TTL");
    }





    public static void main(String[] args){
        Main main = new Main();
        main.leer();
        System.out.println();
    }
}
