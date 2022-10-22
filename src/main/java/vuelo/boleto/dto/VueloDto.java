/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelo.boleto.dto;

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
public class VueloDto {

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
}
