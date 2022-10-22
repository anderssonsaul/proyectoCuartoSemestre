/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelo.boleto.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vuelo.boleto.dto.TripulanteDTO;
import vuelo.boleto.model.AvionModel;
import vuelo.boleto.model.TripulacionModel;
import vuelo.boleto.service.TripulacionService;

/**
 *
 * @author Axuliar desarrollo
 */

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class TripulacionController {
    @Autowired
    TripulacionService tripulacionService;

    @PostMapping("api/tripulacion/crearTripulacion")
    public boolean crearAvion(@RequestBody TripulanteDTO dto) {
        return tripulacionService.CrearTripulacion(dto);
    }
    
    
    @GetMapping("api/tripulacion/getListaTripulacion")
    public Iterable<TripulacionModel> getListaTripulacion() {
        return tripulacionService.getListaTripulacion();
    }
}
