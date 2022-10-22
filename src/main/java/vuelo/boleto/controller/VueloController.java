/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelo.boleto.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import vuelo.boleto.dto.VueloDto;
import vuelo.boleto.service.VueloService;
import java.util.Date;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import vuelo.boleto.model.VueloModel;

/**
 *
 * @author ander
 */
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class VueloController {

    @Autowired
    VueloService servicio;

    @PostMapping("api/vuelo/postVuelo")
    public boolean postVuelo(@RequestBody VueloDto dto) {

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

        dto.setIdestadoregistrotabla(1);
        dto.setFechacreacion(dateFormat.format(date));
        return servicio.postVuelo(dto);
    }

    @GetMapping("api/vuelo/getListaVuelo")
    public Iterable<VueloModel> getListaVuelo() {
        return servicio.getListaVuelo();
    }
}
