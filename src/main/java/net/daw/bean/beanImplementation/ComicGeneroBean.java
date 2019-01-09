/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.bean.beanImplementation;

import net.daw.bean.genericBeanImplementation.GenericBeanImplementation;
import net.daw.bean.publicBeanInterface.BeanInterface;

/**
 *
 * @author kevin
 */
public class ComicGeneroBean extends GenericBeanImplementation implements BeanInterface {

    private GeneroBean obj_genero;

    private ComicBean obj_comic;

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
    
    
    

}
