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
public class ComicEditorialBean extends GenericBeanImplementation implements BeanInterface {

    private EditorialBean obj_editorial;

    private ComicBean obj_comic;

    public EditorialBean getObj_editorial() {
        return obj_editorial;
    }

    public void setObj_editorial(EditorialBean obj_editorial) {
        this.obj_editorial = obj_editorial;
    }

    public ComicBean getObj_comic() {
        return obj_comic;
    }

    public void setObj_comic(ComicBean obj_comic) {
        this.obj_comic = obj_comic;
    }
}
