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
@Table(name="BuGaBesucher")
public class BuGaBesucher implements Serializable {
	public BuGaBesucher() {
	}
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DE_HHN_SE_PMT_BUILDINGS_MODEL_BUGABESUCHER_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_SE_PMT_BUILDINGS_MODEL_BUGABESUCHER_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Name", nullable=true, length=255)	
	private String name;
	
	@Column(name="Vorname", nullable=true, length=255)	
	private String vorname;
	
	@OneToMany(mappedBy="buGaBesucher", targetEntity=de.hhn.se.pmt.buildings.model.Bewertung.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set bewertungs = new java.util.HashSet();
	
	@OneToOne(mappedBy="besitzer", targetEntity=de.hhn.se.pmt.buildings.model.Merkliste.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private de.hhn.se.pmt.buildings.model.Merkliste merkliste;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setVorname(String value) {
		this.vorname = value;
	}
	
	public String getVorname() {
		return vorname;
	}
	
	public de.hhn.se.pmt.buildings.model.Gebäude[] getGebäudes() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = bewertungs.iterator();lIter.hasNext();) {
			lValues.add(((de.hhn.se.pmt.buildings.model.Bewertung)lIter.next()).getGebäude());
		}
		return (de.hhn.se.pmt.buildings.model.Gebäude[])lValues.toArray(new de.hhn.se.pmt.buildings.model.Gebäude[lValues.size()]);
	}
	
	public void removeGebäude(de.hhn.se.pmt.buildings.model.Gebäude aGebäude) {
		de.hhn.se.pmt.buildings.model.Bewertung[] lBewertungs = (de.hhn.se.pmt.buildings.model.Bewertung[])bewertungs.toArray(new de.hhn.se.pmt.buildings.model.Bewertung[bewertungs.size()]);
		for(int i = 0; i < lBewertungs.length; i++) {
			if(lBewertungs[i].getGebäude().equals(aGebäude)) {
				bewertungs.remove(lBewertungs[i]);
			}
		}
	}
	
	public void addGebäude(de.hhn.se.pmt.buildings.model.Bewertung aBewertung, de.hhn.se.pmt.buildings.model.Gebäude aGebäude) {
		aBewertung.setGebäude(aGebäude);
		bewertungs.add(aBewertung);
	}
	
	public de.hhn.se.pmt.buildings.model.Bewertung getBewertungByGebäude(de.hhn.se.pmt.buildings.model.Gebäude aGebäude) {
		de.hhn.se.pmt.buildings.model.Bewertung[] lBewertungs = (de.hhn.se.pmt.buildings.model.Bewertung[])bewertungs.toArray(new de.hhn.se.pmt.buildings.model.Bewertung[bewertungs.size()]);
		for(int i = 0; i < lBewertungs.length; i++) {
			if(lBewertungs[i].getGebäude().equals(aGebäude)) {
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
	
	
	public void setMerkliste(de.hhn.se.pmt.buildings.model.Merkliste value) {
		this.merkliste = value;
	}
	
	public de.hhn.se.pmt.buildings.model.Merkliste getMerkliste() {
		return merkliste;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
