package Examen2;

import java.io.Serializable;
import java.util.Date;
import javax.swing.Icon;

public class Usuario implements Serializable {

    private String nombre;
    private String correo;
    private Date fecha;
    private String usuario;
    private String contraseña;
    private Icon imagen;
    private static final long SerialVersionUID = 777L;

    public Usuario(String nombre, String correo, Date fecha, String usuario, String contraseña, Icon imagen) {
        this.nombre = nombre;
        this.correo = correo;
        this.fecha = fecha;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Icon getImagen() {
        return imagen;
    }

    public void setImagen(Icon imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", correo=" + correo + ", fecha=" + fecha + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", imagen=" + imagen + '}';
    }

}
