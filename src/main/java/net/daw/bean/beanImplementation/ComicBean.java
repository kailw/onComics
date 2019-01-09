/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.bean.beanImplementation;

import com.google.gson.annotations.Expose;
import net.daw.helper.EncodingHelper;
import java.sql.Connection;
import java.sql.ResultSet;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import net.daw.bean.genericBeanImplementation.GenericBeanImplementation;
import net.daw.bean.publicBeanInterface.BeanInterface;

/**
 *
 * @author a044531896d
 */
public class ComicBean extends GenericBeanImplementation implements BeanInterface {

    @Expose
    private String titulo;

    @Expose
    private String desc;

    @Expose
    private String isbn;

    @Expose
    private Date fechapublicacion;

    @Expose
    private String idioma;

    @Expose
    private int pagina;

    @Expose
    private Boolean color;

    @Expose
    private int existencias;

    @Expose
    private float precio;

    @Expose
    private float descuento;

    @Expose
    private String foto;

    @Expose(serialize = false)
    private int id_tipoProducto;
    @Expose(deserialize = false)
    private TipoproductoBean obj_tipoProducto;

    public TipoproductoBean getObj_tipoProducto() {
        return obj_tipoProducto;
    }

    public void setObj_tipoProducto(TipoproductoBean obj_tipoProducto) {
        this.obj_tipoProducto = obj_tipoProducto;
    }

    public String getisbn() {
        return isbn;
    }

    public void setisbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getId_tipoProducto() {
        return id_tipoProducto;
    }

    public void setId_tipoProducto(int id_tipoProducto) {
        this.id_tipoProducto = id_tipoProducto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getfechapublicacion() {
        return fechapublicacion;
    }

    public void setfechapublicacion(Date fechapublicacion) {
        this.fechapublicacion = fechapublicacion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    public Boolean getColor() {
        return color;
    }

    public void setColor(Boolean color) {
        this.color = color;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    @Override
    public ComicBean fill(ResultSet oResultSet, Connection oConnection, Integer expand, UsuarioBean oUsuarioBeanSession) throws Exception, Exception {
        this.setId(oResultSet.getInt("id"));
        this.setTitulo(oResultSet.getString("titulo"));
        this.setDesc(oResultSet.getString("desc"));
        this.setisbn(oResultSet.getString("isbn"));
        this.setfechapublicacion(oResultSet.getDate("fechapublicacion"));
        this.setIdioma(oResultSet.getString("idioma"));
        this.setPagina(oResultSet.getInt("pagina"));
        this.setColor(oResultSet.getBoolean("color"));
        this.setExistencias(oResultSet.getInt("existencias"));
        this.setPrecio(oResultSet.getFloat("precio"));
        this.setDescuento(oResultSet.getFloat("descuento"));
        this.setFoto(oResultSet.getString("foto"));

        return this;
    }

    @Override
    public String getColumns() {
        String strColumns = "";
        strColumns += "id,";
        strColumns += "titulo,";
        strColumns += "`desc`,";
        strColumns += "isbn,";
        strColumns += "fechapublicacion,";
        strColumns += "idioma,";
        strColumns += "pagina,";
        strColumns += "color,";
        strColumns += "existencias,";
        strColumns += "precio,";
        strColumns += "descuento,";
        strColumns += "foto";
        return strColumns;
    }

    @Override
    public String getValues() {
        ZoneId defaultZoneId = ZoneId.systemDefault();
        Instant instant = fechapublicacion.toInstant();
        LocalDate localDate = instant.atZone(defaultZoneId).toLocalDate();

        String strColumns = "";
        strColumns += "null,";
        strColumns += EncodingHelper.quotate(titulo) + ",";
        strColumns += EncodingHelper.quotate(desc) + ",";
        strColumns += EncodingHelper.quotate(isbn) + ",";
        strColumns += EncodingHelper.quotate(localDate.toString()) + ",";
        strColumns += EncodingHelper.quotate(idioma) + ",";
        strColumns += pagina + ",";
        strColumns += color + ",";
        strColumns += existencias + ",";
        strColumns += precio + ",";
        strColumns += descuento + ",";
        strColumns += EncodingHelper.quotate(foto);
        return strColumns;
    }

    @Override
    public String getPairs() {
        ZoneId defaultZoneId = ZoneId.systemDefault();
        Instant instant = fechapublicacion.toInstant();
        LocalDate localDate = instant.atZone(defaultZoneId).toLocalDate();

        String strPairs = "";
        strPairs += "id=" + id + ",";
        strPairs += "isbn=" + EncodingHelper.quotate(titulo) + ",";
        strPairs += "`desc`=" + EncodingHelper.quotate(desc) + ",";
        strPairs += "isbn=" + EncodingHelper.quotate(isbn) + ",";
        strPairs += "fechapublicacion=" + EncodingHelper.quotate(localDate.toString()) + ",";
        strPairs += "idioma=" + EncodingHelper.quotate(idioma) + ",";
        strPairs += "pagina=" + pagina + ",";
        strPairs += "color=" + color + ",";
        strPairs += "existencias=" + existencias + ",";
        strPairs += "precio=" + precio + ",";
        strPairs += "descuento=" + descuento + ",";
        strPairs += "foto=" + EncodingHelper.quotate(foto) + ",";
        strPairs += " WHERE id=" + id;
        return strPairs;
    }

}
