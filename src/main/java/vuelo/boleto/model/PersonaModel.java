/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelo.boleto.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author ander
 */
@Entity
@Table(name = "persona", schema = "public")
public class PersonaModel {

    private Integer idpersona;
    private String numeropasaporte;
    private String nombre;
    private String apellido;
    private Date fechanacimiento;
    private String nacionalidad;
    private String segundanacionalidad;
    private String correoelectronico;
    private String codigoareatelpais;
    private String numerotelefono;
    private String numerotelefonoemergencia;
    private String direccion;
    private String usuario;
    private String contrasenia;
    private String preguntaseguridaduno;
    private String respuestaseguridaduno;
    private String preguntaseguridaddos;
    private String respuestaseguridaddos;
    private String usuariocreacion;
    private Date fechacreacion;
    private String usuariomodificacion;
    private Date fechamodificacion;
    private Integer idestadoregistrotabla;

    @Id
    @Column(name = "idpersona")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Integer idpersona) {
        this.idpersona = idpersona;
    }

    @Column(name = "numeropasaporte", length = 100)
    public String getNumeropasaporte() {
        return numeropasaporte;
    }

    public void setNumeropasaporte(String numeropasaporte) {
        this.numeropasaporte = numeropasaporte;
    }

    @Column(name = "nombre", length = 100)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column(name = "apellido", length = 100)
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Column(name = "fechanacimiento", length = 19)
    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    @Column(name = "nacionalidad", length = 50)
    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

     @Column(name = "segundanacionalidad", length =50 )
    public String getSegundanacionalidad() {
        return segundanacionalidad;
    }

    public void setSegundanacionalidad(String segundanacionalidad) {
        this.segundanacionalidad = segundanacionalidad;
    }

     @Column(name = "correoelectronico", length =150 )
    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    @Column(name = "codigoareatelpais", length = 20)
    public String getCodigoareatelpais() {
        return codigoareatelpais;
    }

    public void setCodigoareatelpais(String codigoareatelpais) {
        this.codigoareatelpais = codigoareatelpais;
    }

    @Column(name = "numerotelefono", length =50 )
    public String getNumerotelefono() {
        return numerotelefono;
    }

    public void setNumerotelefono(String numerotelefono) {
        this.numerotelefono = numerotelefono;
    }

    @Column(name = "numerotelefonoemergencia", length = 50)
    public String getNumerotelefonoemergencia() {
        return numerotelefonoemergencia;
    }

    public void setNumerotelefonoemergencia(String numerotelefonoemergencia) {
        this.numerotelefonoemergencia = numerotelefonoemergencia;
    }

    @Column(name = "direccion", length =500 )
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Column(name = "usuario", length = 20)
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Column(name = "contrasenia", length = 250)
    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Column(name = "preguntaseguridaduno", length = 250)
    public String getPreguntaseguridaduno() {
        return preguntaseguridaduno;
    }

    public void setPreguntaseguridaduno(String preguntaseguridaduno) {
        this.preguntaseguridaduno = preguntaseguridaduno;
    }

    @Column(name = "respuestaseguridaduno", length = 250)
    public String getRespuestaseguridaduno() {
        return respuestaseguridaduno;
    }

    public void setRespuestaseguridaduno(String respuestaseguridaduno) {
        this.respuestaseguridaduno = respuestaseguridaduno;
    }

    @Column(name = "preguntaseguridaddos", length = 250)
    public String getPreguntaseguridaddos() {
        return preguntaseguridaddos;
    }

    public void setPreguntaseguridaddos(String preguntaseguridaddos) {
        this.preguntaseguridaddos = preguntaseguridaddos;
    }

    @Column(name = "respuestaseguridaddos", length = 250)
    public String getRespuestaseguridaddos() {
        return respuestaseguridaddos;
    }

    public void setRespuestaseguridaddos(String respuestaseguridaddos) {
        this.respuestaseguridaddos = respuestaseguridaddos;
    }

    @Column(name = "usuariocreacion", length = 20)
    public String getUsuariocreacion() {
        return usuariocreacion;
    }

    public void setUsuariocreacion(String usuariocreacion) {
        this.usuariocreacion = usuariocreacion;
    }

    @Column(name = "fechacreacion", length = 19)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    @Column(name = "usuariomodificacion", length = 20)
    public String getUsuariomodificacion() {
        return usuariomodificacion;
    }

    public void setUsuariomodificacion(String usuariomodificacion) {
        this.usuariomodificacion = usuariomodificacion;
    }

    @Column(name = "fechamodificacion", length = 19)

    public Date getFechamodificacion() {
        return fechamodificacion;
    }

    public void setFechamodificacion(Date fechamodificacion) {
        this.fechamodificacion = fechamodificacion;
    }

    @Column(name = "idestadoregistrotabla")
    public Integer getIdestadoregistrotabla() {
        return idestadoregistrotabla;
    }

    public void setIdestadoregistrotabla(Integer idestadoregistrotabla) {
        this.idestadoregistrotabla = idestadoregistrotabla;
    }

    public PersonaModel() {
    }

    public PersonaModel(String numeropasaporte, String nombre, String apellido, Date fechanacimiento, String nacionalidad, String segundanacionalidad, String correoelectronico, String codigoareatelpais, String numerotelefono, String numerotelefonoemergencia, String direccion, String usuario, String contrasenia, String preguntaseguridaduno, String respuestaseguridaduno, String preguntaseguridaddos, String respuestaseguridaddos, String usuariocreacion, Date fechacreacion, String usuariomodificacion, Date fechamodificacion, Integer idestadoregistrotabla) {
        this.numeropasaporte = numeropasaporte;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechanacimiento = fechanacimiento;
        this.nacionalidad = nacionalidad;
        this.segundanacionalidad = segundanacionalidad;
        this.correoelectronico = correoelectronico;
        this.codigoareatelpais = codigoareatelpais;
        this.numerotelefono = numerotelefono;
        this.numerotelefonoemergencia = numerotelefonoemergencia;
        this.direccion = direccion;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.preguntaseguridaduno = preguntaseguridaduno;
        this.respuestaseguridaduno = respuestaseguridaduno;
        this.preguntaseguridaddos = preguntaseguridaddos;
        this.respuestaseguridaddos = respuestaseguridaddos;
        this.usuariocreacion = usuariocreacion;
        this.fechacreacion = fechacreacion;
        this.usuariomodificacion = usuariomodificacion;
        this.fechamodificacion = fechamodificacion;
        this.idestadoregistrotabla = idestadoregistrotabla;
    }

}
