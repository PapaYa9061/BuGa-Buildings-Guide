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
@Table(name="Gebäude")
public class Gebäude implements Serializable {
	public Gebäude() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Gebäude))
			return false;
		Gebäude gebäude = (Gebäude)aObj;
		if ((getName() != null && !getName().equals(gebäude.getName())) || (getName() == null && gebäude.getName() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getName() == null ? 0 : getName().hashCode());
		return hashcode;
	}
	
	@Column(name="Name", nullable=false, length=255)	
	@Id	
	private String name;
	
	@ManyToOne(targetEntity=de.hhn.se.pmt.buildings.model.Architekt.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ArchitektName", referencedColumnName="Name") })	
	de.hhn.se.pmt.buildings.model.Architekt architekt;
	
	@Column(name="Fertigstellung", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date fertigstellung;
	
	@Column(name="Spatenstich", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date spatenstich;
	
	@Column(name="Infotext", nullable=true)	
	private String infotext;
	
	@Column(name="Bild", nullable=true)	
	private byte[] bild;
	
	@OneToMany(mappedBy="gebäude", targetEntity=de.hhn.se.pmt.buildings.model.Bewertung.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set bewertungs = new java.util.HashSet();
	
	@ManyToMany(targetEntity=de.hhn.se.pmt.buildings.model.Merkliste.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Merkliste_Gebäude", joinColumns={ @JoinColumn(name="GebäudeName") }, inverseJoinColumns={ @JoinColumn(name="MerklisteID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set merklistes = new java.util.HashSet();
	
	@OneToOne(mappedBy="gebäude", targetEntity=de.hhn.se.pmt.buildings.model.Standort.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	de.hhn.se.pmt.buildings.model.Standort standort;
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public String getORMID() {
		return getName();
	}
	
	public void setSpatenstich(java.util.Date value) {
		this.spatenstich = value;
	}
	
	public java.util.Date getSpatenstich() {
		return spatenstich;
	}
	
	public void setFertigstellung(java.util.Date value) {
		this.fertigstellung = value;
	}
	
	public java.util.Date getFertigstellung() {
		return fertigstellung;
	}
	
	public void setInfotext(String value) {
		this.infotext = value;
	}
	
	public String getInfotext() {
		return infotext;
	}
	
	public void setBild(byte[] value) {
		this.bild = value;
	}
	
	public byte[] getBild() {
		return bild;
	}
	
	public void setArchitekt(de.hhn.se.pmt.buildings.model.Architekt value) {
		this.architekt = value;
	}
	
	public de.hhn.se.pmt.buildings.model.Architekt getArchitekt() {
		return architekt;
	}
	
	public de.hhn.se.pmt.buildings.model.BuGaBesucher[] getBuGaBesuchers() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = bewertungs.iterator();lIter.hasNext();) {
			lValues.add(((de.hhn.se.pmt.buildings.model.Bewertung)lIter.next()).getBuGaBesucher());
		}
		return (de.hhn.se.pmt.buildings.model.BuGaBesucher[])lValues.toArray(new de.hhn.se.pmt.buildings.model.BuGaBesucher[lValues.size()]);
	}
	
	public void removeBuGaBesucher(de.hhn.se.pmt.buildings.model.BuGaBesucher aBuGaBesucher) {
		de.hhn.se.pmt.buildings.model.Bewertung[] lBewertungs = (de.hhn.se.pmt.buildings.model.Bewertung[])bewertungs.toArray(new de.hhn.se.pmt.buildings.model.Bewertung[bewertungs.size()]);
		for(int i = 0; i < lBewertungs.length; i++) {
			if(lBewertungs[i].getBuGaBesucher().equals(aBuGaBesucher)) {
				bewertungs.remove(lBewertungs[i]);
			}
		}
	}
	
	public void addBuGaBesucher(de.hhn.se.pmt.buildings.model.Bewertung aBewertung, de.hhn.se.pmt.buildings.model.BuGaBesucher aBuGaBesucher) {
		aBewertung.setBuGaBesucher(aBuGaBesucher);
		bewertungs.add(aBewertung);
	}
	
	public de.hhn.se.pmt.buildings.model.Bewertung getBewertungByBuGaBesucher(de.hhn.se.pmt.buildings.model.BuGaBesucher aBuGaBesucher) {
		de.hhn.se.pmt.buildings.model.Bewertung[] lBewertungs = (de.hhn.se.pmt.buildings.model.Bewertung[])bewertungs.toArray(new de.hhn.se.pmt.buildings.model.Bewertung[bewertungs.size()]);
		for(int i = 0; i < lBewertungs.length; i++) {
			if(lBewertungs[i].getBuGaBesucher().equals(aBuGaBesucher)) {
				return lBewertungs[i];
			}
		}
		return null;
	}
	
	public void setBewertungs(java.util.Set value) {
		this.bewertungs = value;
	}
	
	public java.util.Set getBewertungs() {
		return bewertungs;
	}
	
	
	public void setMerklistes(java.util.Set value) {
		this.merklistes = value;
	}
	
	public java.util.Set getMerklistes() {
		return merklistes;
	}
	
	
	public void setStandort(de.hhn.se.pmt.buildings.model.Standort value) {
		this.standort = value;
	}
	
	public de.hhn.se.pmt.buildings.model.Standort getStandort() {
		return standort;
	}
	
	public String toString() {
		return String.valueOf(getName());
	}
	
	@Transient	
	private boolean _saved = false;
	
	public void onSave() {
		_saved=true;
	}
	
	
	public void onLoad() {
		_saved=true;
	}
	
	
	public boolean isSaved() {
		return _saved;
	}
	
	
}
