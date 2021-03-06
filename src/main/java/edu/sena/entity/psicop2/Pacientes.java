/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.psicop2;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "pacientes")
@NamedQueries({
    @NamedQuery(name = "Pacientes.findAll", query = "SELECT p FROM Pacientes p")})
public class Pacientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDUsuario")
    private Integer iDUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Apellido_Paterno")
    private String apellidoPaterno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Apellido_Materno")
    private String apellidoMaterno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Tipo_Identificaci\u00f3n")
    private String tipoIdentificaci??n;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Identificaci\u00f3n")
    private int identificaci??n;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Direcci\u00f3n")
    private String direcci??n;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Departamento")
    private String departamento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Ciudad")
    private String ciudad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "Genero")
    private String genero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Profesi\u00f3n")
    private String profesi??n;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Ocupaci\u00f3n")
    private String ocupaci??n;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Nivel_Escolaridad")
    private String nivelEscolaridad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Estado_Civil")
    private String estadoCivil;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha_Nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Edad")
    private int edad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Tel\u00e9fono")
    private String tel??fono;
    @Column(name = "Estado")
    private Short estado;
    @Column(name = "fk_usuatiende")
    private Integer fkUsuatiende;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private Collection<Acudientes> acudientesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private Collection<Programaci??nCitas> programaci??nCitasCollection;
    @JoinColumns({
        @JoinColumn(name = "fk_usuasigna", referencedColumnName = "use_usuariosid"),
        @JoinColumn(name = "fk_usuasigna", referencedColumnName = "use_usuariosid")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuarios usuarios;
    @JoinColumns({
        @JoinColumn(name = "fk_usucrea", referencedColumnName = "use_usuariosid"),
        @JoinColumn(name = "fk_usucrea", referencedColumnName = "use_usuariosid")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuarios usuarios1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private Collection<HistoriasClinicas> historiasClinicasCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private Collection<Atenci??nConsultas> atenci??nConsultasCollection;

    public Pacientes() {
    }

    public Pacientes(Integer iDUsuario) {
        this.iDUsuario = iDUsuario;
    }

    public Pacientes(Integer iDUsuario, String nombre, String apellidoPaterno, String apellidoMaterno, String tipoIdentificaci??n, int identificaci??n, String direcci??n, String departamento, String ciudad, String genero, String profesi??n, String ocupaci??n, String nivelEscolaridad, String estadoCivil, String email, Date fechaNacimiento, int edad, String tel??fono) {
        this.iDUsuario = iDUsuario;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.tipoIdentificaci??n = tipoIdentificaci??n;
        this.identificaci??n = identificaci??n;
        this.direcci??n = direcci??n;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.genero = genero;
        this.profesi??n = profesi??n;
        this.ocupaci??n = ocupaci??n;
        this.nivelEscolaridad = nivelEscolaridad;
        this.estadoCivil = estadoCivil;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.tel??fono = tel??fono;
    }

    public Integer getIDUsuario() {
        return iDUsuario;
    }

    public void setIDUsuario(Integer iDUsuario) {
        this.iDUsuario = iDUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getTipoIdentificaci??n() {
        return tipoIdentificaci??n;
    }

    public void setTipoIdentificaci??n(String tipoIdentificaci??n) {
        this.tipoIdentificaci??n = tipoIdentificaci??n;
    }

    public int getIdentificaci??n() {
        return identificaci??n;
    }

    public void setIdentificaci??n(int identificaci??n) {
        this.identificaci??n = identificaci??n;
    }

    public String getDirecci??n() {
        return direcci??n;
    }

    public void setDirecci??n(String direcci??n) {
        this.direcci??n = direcci??n;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProfesi??n() {
        return profesi??n;
    }

    public void setProfesi??n(String profesi??n) {
        this.profesi??n = profesi??n;
    }

    public String getOcupaci??n() {
        return ocupaci??n;
    }

    public void setOcupaci??n(String ocupaci??n) {
        this.ocupaci??n = ocupaci??n;
    }

    public String getNivelEscolaridad() {
        return nivelEscolaridad;
    }

    public void setNivelEscolaridad(String nivelEscolaridad) {
        this.nivelEscolaridad = nivelEscolaridad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTel??fono() {
        return tel??fono;
    }

    public void setTel??fono(String tel??fono) {
        this.tel??fono = tel??fono;
    }

    public Short getEstado() {
        return estado;
    }

    public void setEstado(Short estado) {
        this.estado = estado;
    }

    public Integer getFkUsuatiende() {
        return fkUsuatiende;
    }

    public void setFkUsuatiende(Integer fkUsuatiende) {
        this.fkUsuatiende = fkUsuatiende;
    }

    public Collection<Acudientes> getAcudientesCollection() {
        return acudientesCollection;
    }

    public void setAcudientesCollection(Collection<Acudientes> acudientesCollection) {
        this.acudientesCollection = acudientesCollection;
    }

    public Collection<Programaci??nCitas> getProgramaci??nCitasCollection() {
        return programaci??nCitasCollection;
    }

    public void setProgramaci??nCitasCollection(Collection<Programaci??nCitas> programaci??nCitasCollection) {
        this.programaci??nCitasCollection = programaci??nCitasCollection;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public Usuarios getUsuarios1() {
        return usuarios1;
    }

    public void setUsuarios1(Usuarios usuarios1) {
        this.usuarios1 = usuarios1;
    }

    public Collection<HistoriasClinicas> getHistoriasClinicasCollection() {
        return historiasClinicasCollection;
    }

    public void setHistoriasClinicasCollection(Collection<HistoriasClinicas> historiasClinicasCollection) {
        this.historiasClinicasCollection = historiasClinicasCollection;
    }

    public Collection<Atenci??nConsultas> getAtenci??nConsultasCollection() {
        return atenci??nConsultasCollection;
    }

    public void setAtenci??nConsultasCollection(Collection<Atenci??nConsultas> atenci??nConsultasCollection) {
        this.atenci??nConsultasCollection = atenci??nConsultasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDUsuario != null ? iDUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pacientes)) {
            return false;
        }
        Pacientes other = (Pacientes) object;
        if ((this.iDUsuario == null && other.iDUsuario != null) || (this.iDUsuario != null && !this.iDUsuario.equals(other.iDUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sena.psicop2.Pacientes[ iDUsuario=" + iDUsuario + " ]";
    }
    
}
