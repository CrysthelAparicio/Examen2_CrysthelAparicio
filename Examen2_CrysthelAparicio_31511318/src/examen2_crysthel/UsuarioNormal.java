/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_crysthel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Icon;

public class UsuarioNormal extends Usuarios {

    ArrayList<Publicaciones> publicaciones = new ArrayList();
    ArrayList<UsuarioNormal> amigoNormal = new ArrayList();
    ArrayList<Object> solicitudes = new ArrayList();

    public UsuarioNormal(String nombreCompleto, String correoElectronico, Date fecha, String nombreUsuario, String contraseña, Icon foto, boolean bloqueado) {
        super(nombreCompleto, correoElectronico, fecha, nombreUsuario, contraseña, foto, bloqueado);
    }

    public ArrayList<Publicaciones> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(ArrayList<Publicaciones> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public ArrayList<UsuarioNormal> getAmigoNormal() {
        return amigoNormal;
    }

    public void setAmigoNormal(ArrayList<UsuarioNormal> amigoNormal) {
        this.amigoNormal = amigoNormal;
    }

    public ArrayList<Object> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList<Object> solicitudes) {
        this.solicitudes = solicitudes;
    }

    void add(UsuarioNormal usuarioNormal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
