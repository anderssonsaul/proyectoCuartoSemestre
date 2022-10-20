/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelo.boleto.controller;

import java.util.List;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vuelo.boleto.dto.AvionDto;
import vuelo.boleto.model.AvionModel;
import vuelo.boleto.service.AvionService;

/**
 *
 * @author ander
 */
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class AvionController {

    String url = "api/avion/";

    @Autowired
    AvionService avionService;

    @GetMapping("api/avion/getListadoAvion")
    public List<AvionModel> getListadoAvion() {
        return avionService.getListadoAvion();
    }

    @GetMapping("api/avion/getListadoAvionXId")
    public List<AvionModel> getListadoAvionXId(
            @RequestParam(required = true) Integer IdAvion) {
        return avionService.getListadoAvionXId(IdAvion);
    }

    @PostMapping("api/asientopasajero/crearAvion")
    public boolean crearAvion(@RequestBody AvionDto dto) {
        return avionService.crearAvion(dto);
    }

}
