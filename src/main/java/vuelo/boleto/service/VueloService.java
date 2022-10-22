/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelo.boleto.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vuelo.boleto.dto.VueloDto;
import vuelo.boleto.model.VueloModel;
import vuelo.boleto.repositoryImp.VueloRepositoryImp;
import java.util.Optional;
import vuelo.boleto.projection.VueloProjection;

/**
 *
 * @author ander
 */
@Service
@Transactional
public class VueloService {

    @Autowired
    VueloRepositoryImp repositoryImp;
    
    public boolean postVuelo(VueloDto dto){
    VueloModel modelo = new VueloModel();
    
    modelo.setIdavion(dto.getIdavion());
    modelo.setIdaerolinea(dto.getIdaerolinea());
    modelo.setFechasalida(dto.getFechasalida());
    modelo.setHorasalida(dto.getHorasalida());
    modelo.setFechallegada(dto.getFechallegada());
    modelo.setHorallegada(dto.getHorallegada());
    modelo.setPrecio(dto.getPrecio());
    modelo.setAeropuetosalida(dto.getAeropuetosalida());
    modelo.setAeropuertollegada(dto.getAeropuertollegada());
    
    modelo.setUsuariocreacion(dto.getUsuariocreacion());
    modelo.setFechamodificacion(dto.getFechamodificacion());
    modelo.setUsuariomodificacion(dto.getUsuariomodificacion());
    modelo.setFechamodificacion(dto.getFechamodificacion());
    modelo.setIdestadoregistrotabla(dto.getIdestadoregistrotabla());
    
    repositoryImp.save(modelo);
    return true;
    }
    
    public Iterable<VueloModel> getListaVuelo() {
        return repositoryImp.findAll();
    }
}
