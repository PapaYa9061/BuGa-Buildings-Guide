/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Yannick Pauler(Hochschule Heilbronn)
 * License Type: Academic
 */
package de.hhn.se.pmt.buildings.model;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Bewertung")
public class Bewertung implements Serializable {
	public Bewertung() {
	}
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DE_HHN_SE_PMT_BUILDINGS_MODEL_BEWERTUNG_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_SE_PMT_BUILDINGS_MODEL_BEWERTUNG_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Bewertung", nullable=false, length=10)	
	private int bewertung;
	
	@ManyToOne(targetEntity=de.hhn.se.pmt.buildings.model.Gebäude.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="GebäudeName", referencedColumnName="Name") })	
	private de.hhn.se.pmt.buildings.model.Gebäude gebäude;
	
	@ManyToOne(targetEntity=de.hhn.se.pmt.buildings.model.BuGaBesucher.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="BuGaBesucherID", referencedColumnName="ID", nullable=false) })	
	private de.hhn.se.pmt.buildings.model.BuGaBesucher buGaBesucher;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setBewertung(int value) {
		this.bewertung = value;
	}
	
	public int getBewertung() {
		return bewertung;
	}
	
	public void setBuGaBesucher(de.hhn.se.pmt.buildings.model.BuGaBesucher value) {
		this.buGaBesucher = value;
	}
	
	public de.hhn.se.pmt.buildings.model.BuGaBesucher getBuGaBesucher() {
		return buGaBesucher;
	}
	
	public void setGebäude(de.hhn.se.pmt.buildings.model.Gebäude value) {
		this.gebäude = value;
	}
	
	public de.hhn.se.pmt.buildings.model.Gebäude getGebäude() {
		return gebäude;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
