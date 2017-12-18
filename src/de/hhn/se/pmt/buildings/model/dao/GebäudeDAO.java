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

public interface GebäudeDAO {
	public Gebäude loadGebäudeByORMID(String name) throws PersistentException;
	public Gebäude getGebäudeByORMID(String name) throws PersistentException;
	public Gebäude loadGebäudeByORMID(String name, org.hibernate.LockMode lockMode) throws PersistentException;
	public Gebäude getGebäudeByORMID(String name, org.hibernate.LockMode lockMode) throws PersistentException;
	public Gebäude loadGebäudeByORMID(PersistentSession session, String name) throws PersistentException;
	public Gebäude getGebäudeByORMID(PersistentSession session, String name) throws PersistentException;
	public Gebäude loadGebäudeByORMID(PersistentSession session, String name, org.hibernate.LockMode lockMode) throws PersistentException;
	public Gebäude getGebäudeByORMID(PersistentSession session, String name, org.hibernate.LockMode lockMode) throws PersistentException;
	public Gebäude[] listGebäudeByQuery(String condition, String orderBy) throws PersistentException;
	public Gebäude[] listGebäudeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryGebäude(String condition, String orderBy) throws PersistentException;
	public java.util.List queryGebäude(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateGebäudeByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateGebäudeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Gebäude[] listGebäudeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Gebäude[] listGebäudeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryGebäude(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryGebäude(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateGebäudeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateGebäudeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Gebäude loadGebäudeByQuery(String condition, String orderBy) throws PersistentException;
	public Gebäude loadGebäudeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Gebäude loadGebäudeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Gebäude loadGebäudeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Gebäude createGebäude();
	public boolean save(de.hhn.se.pmt.buildings.model.Gebäude gebäude) throws PersistentException;
	public boolean delete(de.hhn.se.pmt.buildings.model.Gebäude gebäude) throws PersistentException;
	public boolean deleteAndDissociate(de.hhn.se.pmt.buildings.model.Gebäude gebäude) throws PersistentException;
	public boolean deleteAndDissociate(de.hhn.se.pmt.buildings.model.Gebäude gebäude, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(de.hhn.se.pmt.buildings.model.Gebäude gebäude) throws PersistentException;
	public boolean evict(de.hhn.se.pmt.buildings.model.Gebäude gebäude) throws PersistentException;
}
