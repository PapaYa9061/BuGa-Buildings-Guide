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
@Table(name="Merkliste")
public class Merkliste implements Serializable {
	public Merkliste() {
	}
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DE_HHN_SE_PMT_BUILDINGS_MODEL_MERKLISTE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_SE_PMT_BUILDINGS_MODEL_MERKLISTE_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@OneToOne(optional=false, targetEntity=de.hhn.se.pmt.buildings.model.BuGaBesucher.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="BuGaBesucherID2", referencedColumnName="ID", nullable=false) })	
	private de.hhn.se.pmt.buildings.model.BuGaBesucher besitzer;
	
	@ManyToMany(mappedBy="merklistes", targetEntity=de.hhn.se.pmt.buildings.model.Gebäude.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set gebäudes = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setBesitzer(de.hhn.se.pmt.buildings.model.BuGaBesucher value) {
		this.besitzer = value;
	}
	
	public de.hhn.se.pmt.buildings.model.BuGaBesucher getBesitzer() {
		return besitzer;
	}
	
	public void setGebäudes(java.util.Set value) {
		this.gebäudes = value;
	}
	
	public java.util.Set getGebäudes() {
		return gebäudes;
	}
	
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
