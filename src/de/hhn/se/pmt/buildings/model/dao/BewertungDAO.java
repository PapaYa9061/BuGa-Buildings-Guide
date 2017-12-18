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
package de.hhn.se.pmt.buildings.model.dao;

import org.orm.*;
import org.hibernate.LockMode;
import de.hhn.se.pmt.buildings.model.*;

public interface BewertungDAO {
	public Bewertung loadBewertungByORMID(int ID) throws PersistentException;
	public Bewertung getBewertungByORMID(int ID) throws PersistentException;
	public Bewertung loadBewertungByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Bewertung getBewertungByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Bewertung loadBewertungByORMID(PersistentSession session, int ID) throws PersistentException;
	public Bewertung getBewertungByORMID(PersistentSession session, int ID) throws PersistentException;
	public Bewertung loadBewertungByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Bewertung getBewertungByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Bewertung[] listBewertungByQuery(String condition, String orderBy) throws PersistentException;
	public Bewertung[] listBewertungByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryBewertung(String condition, String orderBy) throws PersistentException;
	public java.util.List queryBewertung(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateBewertungByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateBewertungByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Bewertung[] listBewertungByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Bewertung[] listBewertungByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryBewertung(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryBewertung(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateBewertungByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateBewertungByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Bewertung loadBewertungByQuery(String condition, String orderBy) throws PersistentException;
	public Bewertung loadBewertungByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Bewertung loadBewertungByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Bewertung loadBewertungByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Bewertung createBewertung();
	public boolean save(de.hhn.se.pmt.buildings.model.Bewertung bewertung) throws PersistentException;
	public boolean delete(de.hhn.se.pmt.buildings.model.Bewertung bewertung) throws PersistentException;
	public boolean deleteAndDissociate(de.hhn.se.pmt.buildings.model.Bewertung bewertung) throws PersistentException;
	public boolean deleteAndDissociate(de.hhn.se.pmt.buildings.model.Bewertung bewertung, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(de.hhn.se.pmt.buildings.model.Bewertung bewertung) throws PersistentException;
	public boolean evict(de.hhn.se.pmt.buildings.model.Bewertung bewertung) throws PersistentException;
}
