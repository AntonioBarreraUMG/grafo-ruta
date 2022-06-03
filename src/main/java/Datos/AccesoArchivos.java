/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeant
 */
public class AccesoArchivos implements IAccesoDatos {
    
    @Override
    public String[] leerDatos(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        BufferedReader entrada = null;
        List<String> aux = null;
        String[] datos = null;
        int lineas = 0;
        try {
            entrada = new BufferedReader(new FileReader(archivo));
            
            aux = new ArrayList<>();
            String lectura = entrada.readLine();
            while (lectura != null) {
                lineas++;
                aux.add(lectura);
                lectura = entrada.readLine();
            }
            if (aux.size() > 0) {
                datos = new String[aux.size()];
                for (int i = 0; i < aux.size(); i++) {
                    datos[i] = aux.get(i);
                }
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        } 
        return datos;
    }
}
