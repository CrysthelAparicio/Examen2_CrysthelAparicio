/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Icon;

/**
 *
 * @author COPECO -13
 */
public class UsuarioNormal extends Usuario implements Serializable {

    private static final long SerialVersionUID = 888L;
    private ArrayList<Publicacion> listaPublicaciones;
    private ArrayList<Amigo> listaAmigos;
    private ArrayList<Solicitud> listaSolicitudes;

    public UsuarioNormal() {
    }
    
    public UsuarioNormal( String nombre, String apelido, Date fecha_nacimiento, String sexo, String usuario, String contraseña, String correo, Icon imagen) {
        super(nombre, apelido, fecha_nacimiento, sexo, usuario, contraseña, correo, imagen);
    }

    public ArrayList<Publicacion> getListaPublicaciones() {
        return listaPublicaciones;
    }

    public void setListaPublicaciones(ArrayList<Publicacion> listaPublicaciones) {
        this.listaPublicaciones = listaPublicaciones;
    }

    public ArrayList<Amigo> getListaAmigos() {
        return listaAmigos;
    }

    public void setListaAmigos(ArrayList<Amigo> listaAmigos) {
        this.listaAmigos = listaAmigos;
    }

    public ArrayList<Solicitud> getListaSolicitudes() {
        return listaSolicitudes;
    }

    public void setListaSolicitudes(ArrayList<Solicitud> listaSolicitudes) {
        this.listaSolicitudes = listaSolicitudes;
    }

    @Override
    public String toString() {
        return "UsuarioNormal{" + "listaPublicaciones=" + listaPublicaciones + ", listaAmigos=" + listaAmigos + ", listaSolicitudes=" + listaSolicitudes + '}';
    }

}
