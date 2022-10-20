/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelo.boleto.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vuelo.boleto.service.ClaseService;

/**
 *
 * @author ander
 */
@RestController
public class ClaseController {

    String url = "api/clase/";

    @Autowired
    ClaseService claseService;
}
