/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package vuelo.boleto.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import vuelo.boleto.model.RolModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import vuelo.boleto.projection.RolProjection;

/**
 *
 * @author ander
 */
public interface RolRepository extends CrudRepository<RolModel, Integer> {

    @Override
    public List<RolModel> findAll();

    @Override
    public long count();

    @Query(value = "select idrol, nombre from rol", nativeQuery = true)
    public List<RolProjection> IdNombreRol();

}
