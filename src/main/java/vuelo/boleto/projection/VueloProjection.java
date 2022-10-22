/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package vuelo.boleto.projection;

/**
 *
 * @author ander
 */
public interface VueloProjection {

    Integer getIdvuelo();

    Integer getIdavion();

    Integer getIdaerolinea();

    String getFechasalida();

    String getHorasalida();

    String getFechallegada();

    String getHorallegada();

    String getEstado();

    Double getPrecio();

    Integer getAeropuetosalida();

    Integer getAeropuertollegada();

    String getUsuariocreacion();

    String getFechacreacion();

    String getUsuariomodificacion();

    String getFechamodificacion();

    Integer getIdestadoregistrotabla();
}
