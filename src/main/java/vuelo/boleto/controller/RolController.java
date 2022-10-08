/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelo.boleto.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vuelo.boleto.projection.RolProjection;
import vuelo.boleto.service.RolService;

/**
 *
 * @author ander
 */
@RestController
public class RolController {

    @Autowired
    RolService rolService;

    @GetMapping("api/rol/idNombreRol")
    public List<RolProjection> IdNombreRol() {
        return rolService.IdNombreRol();
    }
}
