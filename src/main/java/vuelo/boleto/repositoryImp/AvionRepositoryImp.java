/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package vuelo.boleto.repositoryImp;

import org.springframework.data.repository.CrudRepository;
import vuelo.boleto.model.AvionModel;

/**
 *
 * @author ander
 */
public interface AvionRepositoryImp extends CrudRepository<AvionModel, Integer>{
    
   /* @Override
    public save(Vuelo v){
        
    }*/
}
