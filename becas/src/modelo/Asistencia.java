package modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the asistencia database table.
 * 
 */
@Entity
@NamedQuery(name="Asistencia.findAll", query="SELECT a FROM Asistencia a")
public class Asistencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idAsistencia; 

	private String estado;

	@Temporal(TemporalType.DATE)
	private Date fehca;

	//bi-directional many-to-one association to Turnoxuser
	@ManyToOne
	@JoinColumn(name="idturnobeca")
	private Turnoxuser turnoxuser;

	public Asistencia() {
	}

	public int getIdAsistencia() {
		return this.idAsistencia;
	}

	public void setIdAsistencia(int idAsistencia) {
		this.idAsistencia = idAsistencia;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFehca() {
		return this.fehca;
	}

	public void setFehca(Date fehca) {
		this.fehca = fehca;
	}

	public Turnoxuser getTurnoxuser() {
		return this.turnoxuser;
	}

	public void setTurnoxuser(Turnoxuser turnoxuser) {
		this.turnoxuser = turnoxuser;
	}

}