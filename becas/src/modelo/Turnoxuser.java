package modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the turnoxuser database table.
 * 
 */
@Entity
@NamedQuery(name="Turnoxuser.findAll", query="SELECT t FROM Turnoxuser t")
public class Turnoxuser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idturnouser;

	//bi-directional many-to-one association to Asistencia
	@OneToMany(mappedBy="turnoxuser")
	private List<Asistencia> asistencias;

	//bi-directional many-to-one association to Turno
	@ManyToOne
	@JoinColumn(name="idturno")
	private Turno turno;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idusuario")
	private Usuario usuario;

	public Turnoxuser() {
	}

	public int getIdturnouser() {
		return this.idturnouser;
	}

	public void setIdturnouser(int idturnouser) {
		this.idturnouser = idturnouser;
	}

	public List<Asistencia> getAsistencias() {
		return this.asistencias;
	}

	public void setAsistencias(List<Asistencia> asistencias) {
		this.asistencias = asistencias;
	}

	public Asistencia addAsistencia(Asistencia asistencia) {
		getAsistencias().add(asistencia);
		asistencia.setTurnoxuser(this);

		return asistencia;
	}

	public Asistencia removeAsistencia(Asistencia asistencia) {
		getAsistencias().remove(asistencia);
		asistencia.setTurnoxuser(null);

		return asistencia;
	}

	public Turno getTurno() {
		return this.turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}