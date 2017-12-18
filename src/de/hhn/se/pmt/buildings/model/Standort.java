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
@Table(name="Standort")
public class Standort implements Serializable {
	public Standort() {
	}
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DE_HHN_SE_PMT_BUILDINGS_MODEL_STANDORT_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_SE_PMT_BUILDINGS_MODEL_STANDORT_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@OneToOne(targetEntity=de.hhn.se.pmt.buildings.model.Gebäude.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="GebäudeName", referencedColumnName="Name") })	
	private de.hhn.se.pmt.buildings.model.Gebäude gebäude;
	
	@Column(name="Lat", nullable=false)	
	private double lat;
	
	@Column(name="Lon", nullable=false)	
	private double lon;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setLat(double value) {
		this.lat = value;
	}
	
	public double getLat() {
		return lat;
	}
	
	public void setLon(double value) {
		this.lon = value;
	}
	
	public double getLon() {
		return lon;
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
