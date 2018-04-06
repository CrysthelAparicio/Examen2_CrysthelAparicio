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
public class Problema extends Publicacion implements Serializable {

    private static final long SerialVersionUID = 888L;
    private ArrayList<Integer> listaResp = new ArrayList();
    private String estado;
    private int categoria;

    public Problema() {
    }

    public Problema(String estado, int categoria, int id, String mensaje, String usuarioAutor, String privacidad, Date fecha) {
        super(id, mensaje, usuarioAutor, privacidad, fecha);
        this.estado = estado;
        this.categoria = categoria;
    }

    public ArrayList<Integer> getListaResp() {
        return listaResp;
    }

    public void setListaResp(ArrayList<Integer> listaResp) {
        this.listaResp = listaResp;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Problema{" + "listaResp=" + listaResp + ", estado=" + estado + ", categoria=" + categoria + '}';
    }

}
