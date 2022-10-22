/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelo.boleto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vuelo.boleto.dto.VueloTripulanteDto;
import vuelo.boleto.model.VueloTripulanteModel;
import vuelo.boleto.repositoryImp.VueloTripulanteRepositoryImp;

/**
 *
 * @author ander
 */
@Service
@Transactional
public class VueloTripulanteService {

    @Autowired
    VueloTripulanteRepositoryImp repositoryImp;

    public boolean postVueloTripulante(VueloTripulanteDto dto) {
        VueloTripulanteModel modelo = new VueloTripulanteModel();

        modelo.setIdtripulante(dto.getIdtripulante());
        modelo.setIdvuelo(dto.getIdvuelo());

        repositoryImp.save(modelo);
        return true;
    }

    public Iterable<VueloTripulanteModel> getListaVueloTripulante() {
        return repositoryImp.findAll();
    }
}
