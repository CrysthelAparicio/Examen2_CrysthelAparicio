/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2;

import java.io.Serializable;
import java.util.Date;
import javax.swing.Icon;

/**
 *
 * @author COPECO -13
 */
public class Usuario implements Serializable {

    private static final long SerialVersionUID = 888L;
    protected String nombre;
    protected String apelido;
    protected Date fecha_nacimiento;
    protected String sexo;
    protected String usuario;
    protected String contraseña;
    protected String correo;
    protected Icon imagen;

    public Usuario() {
    }

    public Usuario(String nombre, String apelido, Date fecha_nacimiento, String sexo, String usuario, String contraseña, String correo, Icon imagen) {
        this.nombre = nombre;
        this.apelido = apelido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.sexo = sexo;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.correo = correo;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Icon getImagen() {
        return imagen;
    }

    public void setImagen(Icon imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return usuario;
    }

}
