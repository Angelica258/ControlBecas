package modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the turno database table.
 * 
 */
@Entity
@NamedQuery(name="Turno.findAll", query="SELECT t FROM Turno t")
public class Turno implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idturno;

	private String dia;

	@Temporal(TemporalType.TIMESTAMP)
	private Date horafin;

	@Temporal(TemporalType.TIMESTAMP)
	private Date horaini;

	//bi-directional many-to-one association to Turnoxuser
	@OneToMany(mappedBy="turno")
	private List<Turnoxuser> turnoxusers;

	public Turno() {
	}

	public int getIdturno() {
		return this.idturno;
	}

	public void setIdturno(int idturno) {
		this.idturno = idturno;
	}

	public String getDia() {
		return this.dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public Date getHorafin() {
		return this.horafin;
	}

	public void setHorafin(Date horafin) {
		this.horafin = horafin;
	}

	public Date getHoraini() {
		return this.horaini;
	}

	public void setHoraini(Date horaini) {
		this.horaini = horaini;
	}

	public List<Turnoxuser> getTurnoxusers() {
		return this.turnoxusers;
	}

	public void setTurnoxusers(List<Turnoxuser> turnoxusers) {
		this.turnoxusers = turnoxusers;
	}

	public Turnoxuser addTurnoxuser(Turnoxuser turnoxuser) {
		getTurnoxusers().add(turnoxuser);
		turnoxuser.setTurno(this);

		return turnoxuser;
	}

	public Turnoxuser removeTurnoxuser(Turnoxuser turnoxuser) {
		getTurnoxusers().remove(turnoxuser);
		turnoxuser.setTurno(null);

		return turnoxuser;
	}

}