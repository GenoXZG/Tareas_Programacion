package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivoConThrow {
    public void leer (String ruta) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(ruta));
        String line = "";
        while ((line = reader.readLine()) != null){
            System.out.println(line);
    }
    }
    public void m1(String ruta) throws  IOException{
        this.m2(ruta);
    }
    public void m2 (String ruta) throws IOException{
        this.leer(ruta);
    }
}
