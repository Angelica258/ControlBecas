package modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int codigo;

	private String apellido;

	private String carrera;

	private String correo;

	private String nombre;

	private String promedio;

	private String telefono;

	//bi-directional many-to-one association to Turnoxuser
	@OneToMany(mappedBy="usuario")
	private List<Turnoxuser> turnoxusers;

	public Usuario() {
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCarrera() {
		return this.carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPromedio() {
		return this.promedio;
	}

	public void setPromedio(String promedio) {
		this.promedio = promedio;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Turnoxuser> getTurnoxusers() {
		return this.turnoxusers;
	}

	public void setTurnoxusers(List<Turnoxuser> turnoxusers) {
		this.turnoxusers = turnoxusers;
	}

	public Turnoxuser addTurnoxuser(Turnoxuser turnoxuser) {
		getTurnoxusers().add(turnoxuser);
		turnoxuser.setUsuario(this);

		return turnoxuser;
	}

	public Turnoxuser removeTurnoxuser(Turnoxuser turnoxuser) {
		getTurnoxusers().remove(turnoxuser);
		turnoxuser.setUsuario(null);

		return turnoxuser;
	}

}