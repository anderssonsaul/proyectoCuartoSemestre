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
 * @author Axuliar desarrollo
 */
@Entity
@Table(name = "tripulante", schema = "public")
public class TripulacionModel {

    private Integer idtripulante;
    private String puesto;
    private String estado;
    private String nombre;

    @Id
    @Column(name = "idtripulante")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIdtripulante() {
        return idtripulante;
    }

    public void setIdtripulante(Integer idtripulante) {
        this.idtripulante = idtripulante;
    }

    @Column(name = "puesto", length = 250)
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Column(name = "estado", length = 10)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Column(name = "nombre", length = 250)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TripulacionModel() {
    }

    public TripulacionModel(String puesto, String estado, String nombre) {
        this.puesto = puesto;
        this.estado = estado;
        this.nombre = nombre;
    }

}
