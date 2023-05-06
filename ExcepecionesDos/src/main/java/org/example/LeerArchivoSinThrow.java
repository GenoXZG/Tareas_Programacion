package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivoSinThrow {
    public void leer (String ruta){
       try {
           BufferedReader reader = new BufferedReader(new FileReader(ruta));
           String line = "";
           while ((line = reader.readLine()) != null){
               System.out.println(line);
           }
       }
       catch (IOException e){
              e.printStackTrace();
       }

    }

}
