/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelo.boleto.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vuelo.boleto.dto.AsientoPasajeroDto;
import vuelo.boleto.model.AsientoPasajeroModel;
import vuelo.boleto.projection.AsientoPasajeroProyection;
import vuelo.boleto.repository.AsientoPasajeroRepository;
import vuelo.boleto.repositoryImp.AsientoPasajeroRepositoryImp;
import java.util.Optional;

/**
 *
 * @author ander
 */
@Service
@Transactional
public class AsientoPasajeroService {

    @Autowired
    AsientoPasajeroRepository repository;

    @Autowired
    AsientoPasajeroRepositoryImp repositoryImp;

    public List<AsientoPasajeroModel> getAsientoPasajeroxAvion(Integer vidAvion) {
        return repository.getAsientoPasajeroxAvion(vidAvion);
    }

    public boolean crearAsientoPasajero(AsientoPasajeroModel asientoPasajero) {
        return repository.crearAsientoPasajero(asientoPasajero);
    }

    public boolean crearAsiento(AsientoPasajeroDto dto) {
        AsientoPasajeroModel modelo = new AsientoPasajeroModel();
        modelo.setIdAvion(dto.getIdAvion());
        modelo.setIdPersona(dto.getIdPersona());
        modelo.setNombre(dto.getNombre());
        modelo.setCodigo(dto.getCodigo());
        modelo.setFila(dto.getFila());
        modelo.setColumna(dto.getColumna());
        modelo.setPrecio(dto.getPrecio());
        modelo.setUsuarioCreacion(dto.getUsuarioCreacion());
        modelo.setFechaCreacion(dto.getFechaCreacion());
        modelo.setFechaModificacion(dto.getFechaModificacion());
        modelo.setIdClase(dto.getIdClase());
        modelo.setIdEstadoRegistroTabla(dto.getIdEstadoRegistroTabla());

        repositoryImp.save(modelo);
        return true;
    }

    public AsientoPasajeroProyection seleccionarAsiento(Integer idAvion) {
        return repositoryImp.SelectAsientoxId(idAvion);
    }
    
    public void ActualizarIdeRegistroTabla(Integer idAsiento, AsientoPasajeroDto dto){
        Optional<AsientoPasajeroModel>modelo= repositoryImp.findById(idAsiento);
        
        //is present me indica si el modelo trajo modificaciones, es decir si existe el registro del id en esta tabla
         if (modelo.isPresent()) {
            AsientoPasajeroModel actualizador = modelo.get();
            actualizador.setIdEstadoRegistroTabla(dto.getIdEstadoRegistroTabla());
            repositoryImp.save(actualizador);
        }
         
    }

}
