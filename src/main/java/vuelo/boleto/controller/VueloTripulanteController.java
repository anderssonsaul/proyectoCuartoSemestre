/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelo.boleto.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import vuelo.boleto.service.VueloTripulanteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import vuelo.boleto.dto.VueloTripulanteDto;
import vuelo.boleto.model.VueloTripulanteModel;

/**
 *
 * @author ander
 */
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class VueloTripulanteController {

    @Autowired
    VueloTripulanteService servicio;
    
    @PostMapping("api/vuelotripulante/postVueloTripulante")
    public boolean postVueloTripulante(@RequestBody VueloTripulanteDto dto) {   
        return servicio.postVueloTripulante(dto);
    }

    @GetMapping("api/vuelotripulante/getListaVueloTripulante")
    public Iterable<VueloTripulanteModel> getListaVueloTripulante() {
        return servicio.getListaVueloTripulante();
    }

}
