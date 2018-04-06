/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author COPECO -13
 */
public class Comentario extends Publicacion implements Serializable {

    private static final long SerialVersionUID = 888L;
    private String contenido;

    public Comentario() {
    }

    public Comentario(String contenido, int id, String mensaje, String usuarioAutor, String privacidad, Date fecha) {
        super(id, mensaje, usuarioAutor, privacidad, fecha);
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Comentario{" + "contenido=" + contenido + '}';
    }

}
