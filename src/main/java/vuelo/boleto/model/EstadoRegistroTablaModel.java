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
@Table(name = "estadoregistrotabla", schema = "public")
public class EstadoRegistroTablaModel {
    
    private Integer  idestadoregistrotabla;
    private String nombre;
    private String descripcion ;
    private String usuariocreacion ;
    private Date fechacreacion ;
    private String usuariomodificacion ;
    private Date fechamodificacion ;

    @Id
    @Column(name = "idestadoregistrotabla")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIdestadoregistrotabla() {
        return idestadoregistrotabla;
    }

    public void setIdestadoregistrotabla(Integer idestadoregistrotabla) {
        this.idestadoregistrotabla = idestadoregistrotabla;
    }

    @Column(name = "nombre", length = 50)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column(name = "descripcion", length = 20)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Column(name = "usuariocreacion", length = 20)
    public String getUsuariocreacion() {
        return usuariocreacion;
    }

    public void setUsuariocreacion(String usuariocreacion) {
        this.usuariocreacion = usuariocreacion;
    }

     @Column(name = "fechacreacion", length = 19)
    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

        @Column(name = "usuariomodificacion", length =20 )
    public String getUsuariomodificacion() {
        return usuariomodificacion;
    }

    public void setUsuariomodificacion(String usuariomodificacion) {
        this.usuariomodificacion = usuariomodificacion;
    }

     @Column(name = "fechamodificacion", length = 19)
    public Date getFechamodificacion() {
        return fechamodificacion;
    }

    public void setFechamodificacion(Date fechamodificacion) {
        this.fechamodificacion = fechamodificacion;
    }

    public EstadoRegistroTablaModel() {
    }

    public EstadoRegistroTablaModel(Integer idestadoregistrotabla, String nombre, String descripcion, String usuariocreacion, Date fechacreacion, String usuariomodificacion, Date fechamodificacion) {
        this.idestadoregistrotabla = idestadoregistrotabla;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.usuariocreacion = usuariocreacion;
        this.fechacreacion = fechacreacion;
        this.usuariomodificacion = usuariomodificacion;
        this.fechamodificacion = fechamodificacion;
    }
    
    
}
