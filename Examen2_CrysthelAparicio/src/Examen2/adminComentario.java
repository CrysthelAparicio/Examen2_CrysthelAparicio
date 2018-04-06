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
public class adminComentario {

    private ArrayList<Comentario> listas_comentarios = new ArrayList();
    private File archivo = null;

    public adminComentario(String path) {
        archivo = new File(path);
    }

    public ArrayList<Comentario> getListas_comentarios() {
        return listas_comentarios;
    }

    public void setListas_comentarios(ArrayList<Comentario> listas_comentarios) {
        this.listas_comentarios = listas_comentarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
  
    public void cargarArchivo() {
        try {
            listas_comentarios = new ArrayList();
            Comentario temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Comentario) objeto.readObject()) != null) {
                        listas_comentarios.add(temp);
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
            for (Comentario t : listas_comentarios) {
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
