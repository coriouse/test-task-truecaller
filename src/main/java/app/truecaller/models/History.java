package app.truecaller.models;

import java.util.Date;

/**
 * Class model of history guests
 * 
 * @author Ogarkov.Sergey
 *
 */
public class History {

	private Integer guest;
	private Integer id;
	private Date visit;

	public History(Integer guest, Integer id, Date visit) {
		super();
		this.guest = guest;
		this.id = id;
		this.visit = visit;
	}

	public Integer getGuest() {
		return guest;
	}

	public void setGuest(Integer guest) {
		this.guest = guest;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getVisit() {
		return visit;
	}

	public void setVisit(Date visit) {
		this.visit = visit;
	}

	@Override
	public String toString() {
		return "History [guest=" + guest + ", id=" + id + ", visit=" + visit
				+ "]";
	}
}
