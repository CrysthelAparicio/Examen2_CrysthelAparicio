package Examen2;

import java.util.ArrayList;
import java.util.Date;

public class Respuestas extends publicaciones {

    private ArrayList calificaciones = new ArrayList();
    private ArrayList comentarios = new ArrayList();
    private int calificacion_general;

    public Respuestas(int calificacion_general, String ID, String mensajes, usuario_normal usuario_autor, String privacidad, Date fecha) {
        super(ID, mensajes, usuario_autor, privacidad, fecha);
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
