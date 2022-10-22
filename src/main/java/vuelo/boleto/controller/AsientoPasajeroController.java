/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelo.boleto.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vuelo.boleto.dto.AsientoPasajeroDto;
import vuelo.boleto.model.AsientoPasajeroModel;
import vuelo.boleto.projection.AsientoPasajeroProyection;
import vuelo.boleto.service.AsientoPasajeroService;
import java.util.Date;

/**
 *
 * @author ander
 */
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class AsientoPasajeroController {

    @Autowired
    AsientoPasajeroService servicio;

    @GetMapping("api/asientopasajero/getAsientoPasajeroxAvion")
    public List<AsientoPasajeroModel> getAsientoPasajeroxAvion(@RequestParam(required = true) Integer IdAvion) {
        return servicio.getAsientoPasajeroxAvion(IdAvion);
    }

    /* @PostMapping("api/asientopasajero/crearAsientoPasajero")
    public boolean crearAsientoPasajero(@RequestBody AsientoPasajeroModel modelo) {
        return servicio.crearAsientoPasajero(modelo);
    }*/
    
    @PostMapping("api/asientopasajero/crearAsiento")
    public boolean crearAsiento(@RequestBody AsientoPasajeroDto dto) {

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

        dto.setIdEstadoRegistroTabla(1);
        dto.setFechaCreacion(dateFormat.format(date));
        return servicio.crearAsiento(dto);
    }

    @GetMapping("api/asientopasajero/seleccionarAsiento")
    public AsientoPasajeroProyection seleccionarAsiento(Integer idAvion) {
        return servicio.seleccionarAsiento(idAvion);
    }

    @PutMapping("api/asientopasajero/ActualizarIdeRegistroTabla/{idAsiento}")
    public void ActualizarIdeRegistroTabla(@PathVariable Integer idAsiento, @RequestBody AsientoPasajeroDto dto) {
        servicio.ActualizarIdeRegistroTabla(idAsiento, dto);
    }

}
