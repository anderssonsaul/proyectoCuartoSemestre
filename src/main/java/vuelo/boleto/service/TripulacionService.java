/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelo.boleto.service;

/**
 *
 * @author Axuliar desarrollo
 */
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vuelo.boleto.dto.TripulanteDTO;
import vuelo.boleto.model.AvionModel;
import vuelo.boleto.model.TripulacionModel;
import vuelo.boleto.repositoryImp.TripulacionRepositoryImp;

@Service
@Transactional
public class TripulacionService {

    @Autowired
    TripulacionRepositoryImp repositoryImp;

    public Iterable<TripulacionModel> getListaTripulacion() {
        return this.repositoryImp.findAll();
    }

    public boolean CrearTripulacion(TripulanteDTO dto) {
        TripulacionModel modelo = new TripulacionModel();
        modelo.setEstado(dto.getEstado());
        modelo.setPuesto(dto.getPuesto());
        modelo.setNombre(dto.getNombre());

        this.repositoryImp.save(modelo);
        return true;
    }

}
