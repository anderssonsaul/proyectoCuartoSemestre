/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelo.boleto.service;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vuelo.boleto.dto.AvionDto;
import vuelo.boleto.model.AvionModel;
import vuelo.boleto.repository.AvionRepository;
import vuelo.boleto.repositoryImp.AvionRepositoryImp;

/**
 *
 * @author ander
 */
@Service
@Transactional
public class AvionService {

    @Autowired
    AvionRepository repository;

    @Autowired
    AvionRepositoryImp repositoryImp;

    public List<AvionModel> getListadoAvion() {
        return this.repository.getListadoAvion();
    }

    public List<AvionModel> getListadoAvionXId(Integer vIdAvion) {
        return this.repository.getListadoAvionXId(vIdAvion);
    }

    public List<AvionModel> getAsientoAvionxId(Integer vIdAvion) {
        return this.repository.getAsientoAvionxId(vIdAvion);
    }

    public boolean crearAvion(AvionDto dto) {
        AvionModel modelo = new AvionModel();
        modelo.setIdestadoavion(dto.getIdestadoavion());
        modelo.setIdmodelo(dto.getIdmodelo());
        modelo.setNombre(dto.getNombre());
        modelo.setFilas(dto.getFilas());
        modelo.setColumnas(dto.getColumnas());
        modelo.setUsuariocreacion(dto.getUsuariocreacion());
        modelo.setFechacreacion(LocalDateTime.now());
        //modelo.setUsuariomodificacion(dto.getUsuariomodificacion());
        //modelo.setFechamodificacion(LocalDateTime.now());
        modelo.setIdestadoregistrotabla(dto.getIdestadoregistrotabla());

        this.repositoryImp.save(modelo);

        return true;
    }
}
