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
 * @author Axuliar desarrollo
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TripulanteDTO {
    
    
    private Integer idtripulante;
    private String puesto;
    private String estado;
    private String nombre;
}
