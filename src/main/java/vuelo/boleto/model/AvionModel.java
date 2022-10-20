/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelo.boleto.model;

import java.time.LocalDateTime;
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
@Table(name = "avion", schema = "public")
public class AvionModel {

    private Integer idavion;
    private Integer idestadoavion;
    private Integer idmodelo;
    private String nombre;
    private String filas;
    private String columnas;
    private String usuariocreacion;
    private LocalDateTime  fechacreacion;
    private String usuariomodificacion;
    private LocalDateTime  fechamodificacion;
    private Integer idestadoregistrotabla;

    @Id
    @Column(name = "idavion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIdavion() {
        return idavion;
    }

    public void setIdavion(Integer idavion) {
        this.idavion = idavion;
    }

    @Column(name = "idestadoavion")
    public Integer getIdestadoavion() {
        return idestadoavion;
    }

    public void setIdestadoavion(Integer idestadoavion) {
        this.idestadoavion = idestadoavion;
    }

    @Column(name = "idmodelo")
    public Integer getIdmodelo() {
        return idmodelo;
    }

    public void setIdmodelo(Integer idmodelo) {
        this.idmodelo = idmodelo;
    }

    @Column(name = "nombre", length = 50)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column(name = "filas", length = 50)
    public String getFilas() {
        return filas;
    }

    public void setFilas(String filas) {
        this.filas = filas;
    }

    @Column(name = "columnas", length = 50)
    public String getColumnas() {
        return columnas;
    }

    public void setColumnas(String columnas) {
        this.columnas = columnas;
    }

    @Column(name = "usuariocreacion", length = 20)
    public String getUsuariocreacion() {
        return usuariocreacion;
    }

    public void setUsuariocreacion(String usuariocreacion) {
        this.usuariocreacion = usuariocreacion;
    }

    @Column(name = "fechacreacion", length = 19)
    public LocalDateTime  getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(LocalDateTime  fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    @Column(name = "usuariomodificacion", length = 20)
    public String getUsuariomodificacion() {
        return usuariomodificacion;
    }

    public void setUsuariomodificacion(String usuariomodificacion) {
        this.usuariomodificacion = usuariomodificacion;
    }

    @Column(name = "fechamodificacion", length = 19)
    public LocalDateTime  getFechamodificacion() {
        return fechamodificacion;
    }

    public void setFechamodificacion(LocalDateTime  fechamodificacion) {
        this.fechamodificacion = fechamodificacion;
    }

    @Column(name = "idestadoregistrotabla")
    public Integer getIdestadoregistrotabla() {
        return idestadoregistrotabla;
    }

    public void setIdestadoregistrotabla(Integer idestadoregistrotabla) {
        this.idestadoregistrotabla = idestadoregistrotabla;
    }

    public AvionModel() {
    }

    public AvionModel(Integer idestadoavion, Integer idmodelo, String nombre, String filas, String columnas, String usuariocreacion, LocalDateTime  fechacreacion, String usuariomodificacion, LocalDateTime  fechamodificacion, Integer idestadoregistrotabla) {
        this.idestadoavion = idestadoavion;
        this.idmodelo = idmodelo;
        this.nombre = nombre;
        this.filas = filas;
        this.columnas = columnas;
        this.usuariocreacion = usuariocreacion;
        this.fechacreacion = fechacreacion;
        this.usuariomodificacion = usuariomodificacion;
        this.fechamodificacion = fechamodificacion;
        this.idestadoregistrotabla = idestadoregistrotabla;
    }

}
