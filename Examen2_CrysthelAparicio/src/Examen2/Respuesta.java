/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author COPECO -13
 */
public class Respuesta extends Publicacion implements Serializable {

    private static final long SerialVersionUID = 888L;
    private ArrayList<Integer> calificaciones = new ArrayList();
    private int calificacionGeneral;
    private ArrayList<Integer> comentarios = new ArrayList();

    public Respuesta() {
    }

    public Respuesta(int calificacionGeneral, int id, String mensaje, String usuarioAutor, String privacidad, Date fecha) {
        super(id, mensaje, usuarioAutor, privacidad, fecha);
        this.calificacionGeneral = calificacionGeneral;
    }

    public ArrayList<Integer> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<Integer> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public int getCalificacionGeneral() {
        return calificacionGeneral;
    }

    public void setCalificacionGeneral(int calificacionGeneral) {
        this.calificacionGeneral = calificacionGeneral;
    }

    public ArrayList<Integer> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<Integer> comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "Respuesta{" + "calificaciones=" + calificaciones + ", calificacionGeneral=" + calificacionGeneral + ", comentarios=" + comentarios + '}';
    }

}
