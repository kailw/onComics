/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.bean.beanImplementation;

import java.sql.Connection;
import java.sql.ResultSet;
import net.daw.bean.genericBeanImplementation.GenericBeanImplementation;
import net.daw.bean.publicBeanInterface.BeanInterface;

/**
 *
 * @author kevin
 */
public class ComicGeneroBean extends GenericBeanImplementation implements BeanInterface {

    private int id_genero;

    private int id_comic;

    private GeneroBean obj_genero;

    private ComicBean obj_comic;

    public int getId_genero() {
        return id_genero;
    }

    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }

    public int getId_comic() {
        return id_comic;
    }

    public void setId_comic(int id_comic) {
        this.id_comic = id_comic;
    }

    public GeneroBean getObj_genero() {
        return obj_genero;
    }

    public void setObj_genero(GeneroBean obj_genero) {
        this.obj_genero = obj_genero;
    }

    public ComicBean getObj_comic() {
        return obj_comic;
    }

    public void setObj_comic(ComicBean obj_comic) {
        this.obj_comic = obj_comic;
    }

    @Override
    public ComicGeneroBean fill(ResultSet oResultSet, Connection oConnection, Integer expand, UsuarioBean oUsuarioBeanSession) throws Exception, Exception {
        this.setId(oResultSet.getInt("id"));
        this.setId_genero(oResultSet.getInt("id_genero"));
        this.setId_comic(oResultSet.getInt("id_comic"));

        return this;
    }

    @Override
    public String getColumns() {
        String strColumns = "";
        strColumns += "id,";
        strColumns += "id_genero,";
        strColumns += "id_comic";

        return strColumns;
    }

    @Override
    public String getValues() {
        String strColumns = "";
        strColumns += "null,";
        strColumns += id_genero + ",";
        strColumns += id_comic;

        return strColumns;
    }

    @Override
    public String getPairs() {
        String strPairs = "";
        strPairs += "id=" + id + ",";
        strPairs += "id_genero=" + id_genero + ",";
        strPairs += "id_comic=" + id_comic;
        strPairs += " WHERE id=" + id;

        return strPairs;
    }

}
