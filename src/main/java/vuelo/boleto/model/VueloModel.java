/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelo.boleto.model;

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
@Table(name = "vuelo", schema = "public")
public class VueloModel {
     private Integer idvuelo;
    private Integer idavion;
    private Integer idaerolinea;
    private String fechasalida;
    private String horasalida;
    private String fechallegada;
    private String horallegada;
    private String estado;
    private Double precio;
    private Integer aeropuetosalida;
    private Integer aeropuertollegada;
    private String usuariocreacion;
    private String fechacreacion;
    private String usuariomodificacion;
    private String fechamodificacion;
    private Integer idestadoregistrotabla;

    @Id
    @Column(name = "idvuelo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIdvuelo() {
        return idvuelo;
    }

    public void setIdvuelo(Integer idvuelo) {
        this.idvuelo = idvuelo;
    }

    @Column(name = "idavion")
    public Integer getIdavion() {
        return idavion;
    }

    public void setIdavion(Integer idavion) {
        this.idavion = idavion;
    }

    @Column(name = "idaerolinea")
    public Integer getIdaerolinea() {
        return idaerolinea;
    }

    public void setIdaerolinea(Integer idaerolinea) {
        this.idaerolinea = idaerolinea;
    }

    @Column(name = "fechasalida", length = 10)
    public String getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(String fechasalida) {
        this.fechasalida = fechasalida;
    }

    @Column(name = "horasalida", length = 8)
    public String getHorasalida() {
        return horasalida;
    }

    public void setHorasalida(String horasalida) {
        this.horasalida = horasalida;
    }

    @Column(name = "fechallegada", length = 10)
    public String getFechallegada() {
        return fechallegada;
    }

    public void setFechallegada(String fechallegada) {
        this.fechallegada = fechallegada;
    }

    @Column(name = "horallegada", length = 8)
    public String getHorallegada() {
        return horallegada;
    }

    public void setHorallegada(String horallegada) {
        this.horallegada = horallegada;
    }

    @Column(name = "estado", length = 10)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Column(name = "precio")
    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Column(name = "aeropuetosalida")
    public Integer getAeropuetosalida() {
        return aeropuetosalida;
    }

    public void setAeropuetosalida(Integer aeropuetosalida) {
        this.aeropuetosalida = aeropuetosalida;
    }

    @Column(name = "aeropuertollegada")
    public Integer getAeropuertollegada() {
        return aeropuertollegada;
    }

    public void setAeropuertollegada(Integer aeropuertollegada) {
        this.aeropuertollegada = aeropuertollegada;
    }

    @Column(name = "usuariocreacion", length = 20)
    public String getUsuariocreacion() {
        return usuariocreacion;
    }

    public void setUsuariocreacion(String usuariocreacion) {
        this.usuariocreacion = usuariocreacion;
    }

    @Column(name = "fechacreacion", length = 19)
    public String getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(String fechacreacion) {
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
    public String getFechamodificacion() {
        return fechamodificacion;
    }

    public void setFechamodificacion(String fechamodificacion) {
        this.fechamodificacion = fechamodificacion;
    }

    @Column(name = "idestadoregistrotabla")
    public Integer getIdestadoregistrotabla() {
        return idestadoregistrotabla;
    }

    public void setIdestadoregistrotabla(Integer idestadoregistrotabla) {
        this.idestadoregistrotabla = idestadoregistrotabla;
    }

    public VueloModel() {
    }

    public VueloModel(Integer idavion, Integer idaerolinea, String fechasalida, String horasalida, String fechallegada, String horallegada, String estado, Double precio, Integer aeropuetosalida, Integer aeropuertollegada, String usuariocreacion, String fechacreacion, String usuariomodificacion, String fechamodificacion, Integer idestadoregistrotabla) {
        this.idavion = idavion;
        this.idaerolinea = idaerolinea;
        this.fechasalida = fechasalida;
        this.horasalida = horasalida;
        this.fechallegada = fechallegada;
        this.horallegada = horallegada;
        this.estado = estado;
        this.precio = precio;
        this.aeropuetosalida = aeropuetosalida;
        this.aeropuertollegada = aeropuertollegada;
        this.usuariocreacion = usuariocreacion;
        this.fechacreacion = fechacreacion;
        this.usuariomodificacion = usuariomodificacion;
        this.fechamodificacion = fechamodificacion;
        this.idestadoregistrotabla = idestadoregistrotabla;
    }

   

    @Override
    public String toString() {
        return "Vuelo{" + "idvuelo=" + idvuelo + ", idavion=" + idavion + ", idaerolinea=" + idaerolinea + ", fechasalida=" + fechasalida + ", horasalida=" + horasalida + ", fechallegada=" + fechallegada + ", horallegada=" + horallegada + ", estado=" + estado + ", precio=" + precio + ", aeropuetosalida=" + aeropuetosalida + ", aeropuertollegada=" + aeropuertollegada + ", usuariocreacion=" + usuariocreacion + ", fechacreacion=" + fechacreacion + ", usuariomodificacion=" + usuariomodificacion + ", fechamodificacion=" + fechamodificacion + ", idestadoregistrotabla=" + idestadoregistrotabla + '}';
    }
}
