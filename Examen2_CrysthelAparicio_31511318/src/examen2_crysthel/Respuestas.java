/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_crysthel;

import java.util.ArrayList;
import java.util.Date;

public class Respuestas extends Publicaciones {

    private ArrayList calificaciones = new ArrayList();
    private ArrayList comentarios = new ArrayList();
    private int calificacion_general;

    public Respuestas(int calificacion_general, String ID, String mensaje, Usuarios user, String privacidad, Date fecha) {
        super(ID, mensaje, user, privacidad, fecha);
        this.calificacion_general = calificacion_general;
    }

    public ArrayList getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList calificaciones) {
        this.calificaciones = calificaciones;
    }

    public ArrayList getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList comentarios) {
        this.comentarios = comentarios;
    }

    public int getCalificacion_general() {
        return calificacion_general;
    }

    public void setCalificacion_general(int calificacion_general) {
        this.calificacion_general = calificacion_general;
    }

    @Override
    public String toString() {
        return "Respuestas{" + "calificaciones=" + calificaciones + ", comentarios=" + comentarios + ", calificacion_general=" + calificacion_general + '}';
    }
}
