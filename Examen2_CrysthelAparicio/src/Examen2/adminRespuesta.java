/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author COPECO -13
 */
public class adminRespuesta {

    private ArrayList<Respuesta> listas_respuesta = new ArrayList();
    private File archivo = null;
    
     public adminRespuesta(String path) {
        archivo = new File(path);
    }

    public ArrayList<Respuesta> getListas_respuesta() {
        return listas_respuesta;
    }

    public void setListas_respuesta(ArrayList<Respuesta> listas_respuesta) {
        this.listas_respuesta = listas_respuesta;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

     public void cargarArchivo() {
        try {
            listas_respuesta = new ArrayList();
            Respuesta temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Respuesta) objeto.readObject()) != null) {
                        listas_respuesta.add(temp);
                    }
                } catch (EOFException e) {
                    //ENCONTRO EL FINAL DEL ARCHIVO
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;

        try {

            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Respuesta t : listas_respuesta) {
                bw.writeObject(t);

            }
            bw.flush();

        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
