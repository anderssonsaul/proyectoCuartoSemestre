/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelo.boleto.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import vuelo.boleto.model.AvionModel;

/**
 *
 * @author ander
 */
@Repository
public class AvionRepository {

    @PersistenceContext
    EntityManager entityManager;

    public List<AvionModel> getListadoAvion() {
        String query = "select idavion,idestadoavion,idmodelo,nombre,\n"
                + "filas,columnas,usuariocreacion,fechacreacion,usuariomodificacion,\n"
                + "fechamodificacion,idestadoregistrotabla  from avion";
        Query q = entityManager.createNativeQuery(query, AvionModel.class);

        return q.getResultList();
    }

    public List<AvionModel> getListadoAvionXId(Integer vIdAvion) {
        String query = "select idavion,idestadoavion,idmodelo,nombre,\n"
                + "filas,columnas,usuariocreacion,fechacreacion,usuariomodificacion,\n"
                + "fechamodificacion,idestadoregistrotabla  from avion\n"
                + "where idavion=:vIdAvion";
        Query q = entityManager.createNativeQuery(query, AvionModel.class);
        q.setParameter("vIdAvion", vIdAvion);

        return q.getResultList();
    }

    public List<AvionModel> getAsientoAvionxId(Integer vIdAvion) {
        String query = "select filas, columnas from avion	\n"
                + "where idavion=:vIdAvion";
        Query q = entityManager.createNativeQuery(query, AvionModel.class);
        q.setParameter("vIdAvion", vIdAvion);

        return q.getResultList();
    }
}
