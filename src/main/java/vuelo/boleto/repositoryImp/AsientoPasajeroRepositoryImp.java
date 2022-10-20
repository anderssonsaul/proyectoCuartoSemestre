/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package vuelo.boleto.repositoryImp;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import vuelo.boleto.model.AsientoPasajeroModel;
import vuelo.boleto.projection.AsientoPasajeroProyection;

/**
 *
 * @author ander
 */
public interface AsientoPasajeroRepositoryImp extends CrudRepository<AsientoPasajeroModel, Integer>{
    
    @Query(value= "select idasiento,idavion,idpersona,nombre,codigo,fila,columna,precio,usuariocreacion,fechacreacion,\n"
                + "usuariomodificacion,fechamodificacion,idclase,idestadoregistrotabla from asiento\n"
                + "where idavion=:vIdAvion", nativeQuery = true)
    public AsientoPasajeroProyection SelectAsientoxId (@Param ("vIdAvion") Integer vIdAvion);
}
