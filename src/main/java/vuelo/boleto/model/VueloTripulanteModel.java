/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelo.boleto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ander
 */
@Entity
@Table(name = "vuelotripulante", schema = "public")
public class VueloTripulanteModel {

    private Integer idvuelotripulante;
    private Integer idvuelo;
    private Integer idtripulante;

    @Id
    @Column(name = "idvuelotripulante")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIdvuelotripulante() {
        return idvuelotripulante;
    }

    public void setIdvuelotripulante(Integer idvuelotripulante) {
        this.idvuelotripulante = idvuelotripulante;
    }

    @Column(name = "idvuelo")
    public Integer getIdvuelo() {
        return idvuelo;
    }

    public void setIdvuelo(Integer idvuelo) {
        this.idvuelo = idvuelo;
    }

    @Column(name = "idtripulante")
    public Integer getIdtripulante() {
        return idtripulante;
    }

    public void setIdtripulante(Integer idtripulante) {
        this.idtripulante = idtripulante;
    }

    public VueloTripulanteModel() {
    }

    public VueloTripulanteModel(Integer idvuelo, Integer idtripulante) {

        this.idvuelo = idvuelo;
        this.idtripulante = idtripulante;
    }

}
