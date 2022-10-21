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
import vuelo.boleto.model.AsientoPasajeroModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author ander
 */
@Repository
public class AsientoPasajeroRepository {

    @PersistenceContext
    EntityManager entityManager;

    public List<AsientoPasajeroModel> getAsientoPasajeroxAvion(Integer vidAvion) {
        String query = "select idasiento,idavion,idpersona,nombre,codigo,fila,columna,precio,usuariocreacion,fechacreacion,\n"
                + "usuariomodificacion,fechamodificacion,idclase,idestadoregistrotabla from asiento\n"
                + "where idavion=:vIdAvion"
                + " and idestadoregistrotabla=1 ";
        Query q = entityManager.createNativeQuery(query, AsientoPasajeroModel.class);
        q.setParameter("vIdAvion", vidAvion);
        return q.getResultList();
    }

    public boolean crearAsientoPasajero(AsientoPasajeroModel asientoPasajero) {
        String query = "INSERT INTO asiento(\n"
                + "	 idavion, nombre, codigo, \n"
                + "	fila, columna, idpersona, \n"
                + "	precio, usuariocreacion, \n"
                + "	fechacreacion, usuariomodificacion, fechamodificacion, \n"
                + "	idclase, idestadoregistrotabla)\n"
                + "	VALUES (" + asientoPasajero.getIdAvion()
                + ",'" + asientoPasajero.getNombre()
                + "', '" + asientoPasajero.getCodigo()
                + "', '" + asientoPasajero.getFila()
                + "', '" + asientoPasajero.getColumna()
                + "', " + asientoPasajero.getIdPersona()
                + ", " + asientoPasajero.getPrecio()
                + ", '" + asientoPasajero.getUsuarioCreacion()
                + "', '" + asientoPasajero.getFechaCreacion()
                + "', '" + asientoPasajero.getUsuarioModificacion()
                + "', '" + asientoPasajero.getFechaModificacion()
                + "', " + asientoPasajero.getIdClase()
                + ", :IdEstadoRegistroTabla);";
        
        Query q = entityManager.createNativeQuery(query);
        q.setParameter("IdEstadoRegistroTabla", asientoPasajero.getIdEstadoRegistroTabla());
        try {
            q.getResultList();
            return true;
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
            return true;
        }
        
    }
    
  

}
