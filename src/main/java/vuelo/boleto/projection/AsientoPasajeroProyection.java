/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package vuelo.boleto.projection;

/**
 *
 * @author ander
 */
public interface AsientoPasajeroProyection {
     Integer getidAsiento();
     Integer getidAvion();
     Integer getidPersona();
     String getnombre();
     String getCodigo();
     String getfila();
     String getcolumna();
     Double getprecio();
     String getusuarioCreacion();
     String getfechaCreacion();
     String getusuarioModificacion();
     String getfechaModificacion();
     Integer getidClase();
     Integer getidEstadoRegistroTabla();
}
