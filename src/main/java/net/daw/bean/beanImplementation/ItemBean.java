/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.bean.beanImplementation;

/**
 *
 * @author kevin
 */
public class ItemBean {
    int cantidad;
    ComicBean obj_Producto;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ComicBean getObj_Producto() {
        return obj_Producto;
    }

    public void setObj_Producto(ComicBean obj_Producto) {
        this.obj_Producto = obj_Producto;
    }
    
}
