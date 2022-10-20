/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelo.boleto.dto;

import java.time.LocalDateTime;
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
public class AvionDto {

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
}
