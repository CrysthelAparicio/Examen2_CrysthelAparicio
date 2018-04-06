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
public class UsuarioAdministrador extends Usuario implements Serializable {

    private static final long SerialVersionUID = 888L;
    private ArrayList<Publicacion> listaPublicacionBloqueada;
    private ArrayList<Usuario> listaUsuariosBloqueados;

    public UsuarioAdministrador() {
    }

    public UsuarioAdministrador(String nombre, String apelido, Date fecha_nacimiento, String sexo, String usuario, String contraseña, String correo, Icon imagen) {
        super(nombre, apelido, fecha_nacimiento, sexo, usuario, contraseña, correo, imagen);
    }

    public ArrayList<Publicacion> getListaPublicacionBloqueada() {
        return listaPublicacionBloqueada;
    }

    public void setListaPublicacionBloqueada(ArrayList<Publicacion> listaPublicacionBloqueada) {
        this.listaPublicacionBloqueada = listaPublicacionBloqueada;
    }

    public ArrayList<Usuario> getListaUsuariosBloqueados() {
        return listaUsuariosBloqueados;
    }

    public void setListaUsuariosBloqueados(ArrayList<Usuario> listaUsuariosBloqueados) {
        this.listaUsuariosBloqueados = listaUsuariosBloqueados;
    }

    @Override
    public String toString() {
        return "UsuarioAdministrador{" + "listaPublicacionBloqueada=" + listaPublicacionBloqueada + ", listaUsuariosBloqueados=" + listaUsuariosBloqueados + '}';
    }

}
