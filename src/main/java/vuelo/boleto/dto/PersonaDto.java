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
public class PersonaDto {

    private Integer idpersona;
    private String numeropasaporte;
    private String nombre;
    private String apellido;
    private Date fechanacimiento;
    private String nacionalidad;
    private String segundanacionalidad;
    private String correoelectronico;
    private String codigoareatelpais;
    private String numerotelefono;
    private String numerotelefonoemergencia;
    private String direccion;
    private String usuario;
    private String contrasenia;
    private String preguntaseguridaduno;
    private String respuestaseguridaduno;
    private String preguntaseguridaddos;
    private String respuestaseguridaddos;
    private String usuariocreacion;
    private Date fechacreacion;
    private String usuariomodificacion;
    private Date fechamodificacion;
    private Integer idestadoregistrotabla;
}
