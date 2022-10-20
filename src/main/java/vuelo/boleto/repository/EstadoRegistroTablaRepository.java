/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package vuelo.boleto.repository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import vuelo.boleto.model.EstadoRegistroTablaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
/**
 *
 * @author ander
 */
public interface EstadoRegistroTablaRepository extends CrudRepository<EstadoRegistroTablaModel, Integer>{
    
}
