/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelo.boleto.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ander
 */
@Entity
@Table(name = "asiento", schema = "public")
public class AsientoPasajeroModel {

    private Integer idAsiento;
    private Integer idAvion;
    private Integer idPersona;
    private String nombre;
    private String Codigo;
    private String fila;
    private String columna;
    private Double precio;
    private String usuarioCreacion;
    private String fechaCreacion;
    private String usuarioModificacion;
    private String fechaModificacion;
    private Integer idClase;
    private Integer idEstadoRegistroTabla;

    @Id
    @Column(name = "idasiento")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(Integer idAsiento) {
        this.idAsiento = idAsiento;
    }

    @Column(name = "idavion")
    public Integer getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(Integer idAvion) {
        this.idAvion = idAvion;
    }

    @Column(name = "idpersona")
    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    @Column(name = "nombre", length = 250)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column(name = "codigo", length = 250)
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    @Column(name = "fila", length = 50)
    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    @Column(name = "columna", length = 50)
    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

    @Column(name = "precio")
    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Column(name = "usuariocreacion", length = 20)
    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    @Column(name = "fechacreacion", length = 19)
    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Column(name = "usuariomodificacion", length = 20)
    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    @Column(name = "fechamodificacion", length = 19)
    public String getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(String fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    @Column(name = "idclase")
    public Integer getIdClase() {
        return idClase;
    }

    public void setIdClase(Integer idClase) {
        this.idClase = idClase;
    }

    @Column(name = "idestadoregistrotabla")
    public Integer getIdEstadoRegistroTabla() {
        return idEstadoRegistroTabla;
    }

    public void setIdEstadoRegistroTabla(Integer idEstadoRegistroTabla) {
        this.idEstadoRegistroTabla = idEstadoRegistroTabla;
    }

    public AsientoPasajeroModel() {
    }

    public AsientoPasajeroModel(Integer idAvion, Integer idPersona, String nombre, String Codigo, String fila, String columna, Double precio, String usuarioCreacion, String fechaCreacion, String usuarioModificacion, String fechaModificacion, Integer idClase, Integer idEstadoRegistroTabla) {
        this.idAvion = idAvion;
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.Codigo = Codigo;
        this.fila = fila;
        this.columna = columna;
        this.precio = precio;
        this.usuarioCreacion = usuarioCreacion;
        this.fechaCreacion = fechaCreacion;
        this.usuarioModificacion = usuarioModificacion;
        this.fechaModificacion = fechaModificacion;
        this.idClase = idClase;
        this.idEstadoRegistroTabla = idEstadoRegistroTabla;
    }

}
