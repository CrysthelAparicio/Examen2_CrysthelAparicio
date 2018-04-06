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
public class Publicacion implements Serializable {

    private static final long SerialVersionUID = 888L;
    private int id;
    private String mensaje;
    private String usuarioAutor;
    private String privacidad;
    private Date fecha;

    public Publicacion() {
    }

    public Publicacion(int id, String mensaje, String usuarioAutor, String privacidad, Date fecha) {
        this.id = id;
        this.mensaje = mensaje;
        this.usuarioAutor = usuarioAutor;
        this.privacidad = privacidad;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getUsuarioAutor() {
        return usuarioAutor;
    }

    public void setUsuarioAutor(String usuarioAutor) {
        this.usuarioAutor = usuarioAutor;
    }

    public String getPrivacidad() {
        return privacidad;
    }

    public void setPrivacidad(String privacidad) {
        this.privacidad = privacidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "id=" + id + ", mensaje=" + mensaje + ", usuarioAutor=" + usuarioAutor + ", privacidad=" + privacidad + ", fecha=" + fecha + '}';
    }

}
