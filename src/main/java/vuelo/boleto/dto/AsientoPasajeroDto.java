/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelo.boleto.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author ander
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AsientoPasajeroDto {

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
}
