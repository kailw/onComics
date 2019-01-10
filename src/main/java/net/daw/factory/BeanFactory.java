/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.factory;

import com.google.gson.Gson;
import net.daw.bean.beanImplementation.AutorBean;
import net.daw.bean.beanImplementation.ColeccionBean;
import net.daw.bean.beanImplementation.FacturaBean;
import net.daw.bean.beanImplementation.LineaBean;
import net.daw.bean.beanImplementation.ComicBean;
import net.daw.bean.beanImplementation.ComicGeneroBean;
import net.daw.bean.beanImplementation.EditorialBean;
import net.daw.bean.beanImplementation.GeneroBean;
import net.daw.bean.beanImplementation.TipoproductoBean;
import net.daw.bean.beanImplementation.TipousuarioBean;
import net.daw.bean.beanImplementation.UsuarioBean;
import net.daw.bean.publicBeanInterface.BeanInterface;

/**
 *
 * @author a024465169t
 */
public class BeanFactory {

    public static BeanInterface getBean(String ob) {
        BeanInterface oBean = null;
        switch (ob) {
            case "usuario":
                oBean = new UsuarioBean();
                break;
            case "tipousuario":
                oBean = new TipousuarioBean();
                break;
            case "comic":
                oBean = new ComicBean();
                break;
            case "genero":
                oBean = new GeneroBean();
                break;
            case "editorial":
                oBean = new EditorialBean();
                break;
            case "coleccion":
                oBean = new ColeccionBean();
                break;
            case "autor":
                oBean = new AutorBean();
                break;
            case "comicgenero":
                oBean = new ComicGeneroBean();
                break;
            case "tipoproducto":
                oBean = new TipoproductoBean();
                break;
            case "factura":
                oBean = new FacturaBean();
                break;
            case "linea":
                oBean = new LineaBean();
                break;
        }
        return oBean;
    }

    public static BeanInterface getBeanFromJson(String ob, Gson oGson, String strJsonFromClient) {
        BeanInterface oBean = null;
        switch (ob) {
            case "usuario":
                oBean = oGson.fromJson(strJsonFromClient, UsuarioBean.class);
                break;
            case "tipousuario":
                oBean = oGson.fromJson(strJsonFromClient, TipousuarioBean.class);
                break;
            case "tipoproducto":
                oBean = oGson.fromJson(strJsonFromClient, TipoproductoBean.class);
                break;
            case "comic":
                oBean = oGson.fromJson(strJsonFromClient, ComicBean.class);
                break;
            case "genero":
                oBean = oGson.fromJson(strJsonFromClient, GeneroBean.class);
                break;
            case "editorial":
                oBean = oGson.fromJson(strJsonFromClient, EditorialBean.class);
                break;
            case "coleccion":
                oBean = oGson.fromJson(strJsonFromClient, ColeccionBean.class);
                break;
            case "autor":
                oBean = oGson.fromJson(strJsonFromClient, AutorBean.class);
                break;
            case "comicgenero":
                oBean = oGson.fromJson(strJsonFromClient, ComicGeneroBean.class);
                break;
            case "factura":
                oBean = oGson.fromJson(strJsonFromClient, FacturaBean.class);
                break;
            case "linea":
                oBean = oGson.fromJson(strJsonFromClient, LineaBean.class);
                break;
        }
        return oBean;
    }
}
