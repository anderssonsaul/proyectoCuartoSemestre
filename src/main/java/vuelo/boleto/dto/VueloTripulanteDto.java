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
public class VueloTripulanteDto {

    private Integer idvuelotripulante;
    private Integer idvuelo;
    private Integer idtripulante;
}
