/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelo.boleto.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vuelo.boleto.projection.RolProjection;
import vuelo.boleto.repository.RolRepository;

/**
 *
 * @author ander
 */
@Service
@Transactional
public class RolService {

    @Autowired
    RolRepository repository;

    @Transactional(readOnly = true)
    public List<RolProjection> IdNombreRol() {
        return repository.IdNombreRol();
    }

}
