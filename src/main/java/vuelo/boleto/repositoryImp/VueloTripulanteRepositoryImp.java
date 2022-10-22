/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package vuelo.boleto.repositoryImp;

import org.springframework.data.repository.CrudRepository;
import vuelo.boleto.model.VueloTripulanteModel;

/**
 *
 * @author ander
 */
public interface VueloTripulanteRepositoryImp extends CrudRepository<VueloTripulanteModel, Integer> {
    
}
