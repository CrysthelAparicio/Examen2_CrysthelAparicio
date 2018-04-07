package Examen2;

import java.util.Date;

public class comentarios extends publicaciones {

    private String contenido;

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public comentarios(String contenido, String ID, String mensajes, usuario_normal usuario_autor, String privacidad, Date fecha) {
        super(ID, mensajes, usuario_autor, privacidad, fecha);
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "comentarios{" + contenido + "}";
    }

}
