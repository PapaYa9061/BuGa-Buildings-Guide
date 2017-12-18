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

public interface ArchitektDAO {
	public Architekt loadArchitektByORMID(String name) throws PersistentException;
	public Architekt getArchitektByORMID(String name) throws PersistentException;
	public Architekt loadArchitektByORMID(String name, org.hibernate.LockMode lockMode) throws PersistentException;
	public Architekt getArchitektByORMID(String name, org.hibernate.LockMode lockMode) throws PersistentException;
	public Architekt loadArchitektByORMID(PersistentSession session, String name) throws PersistentException;
	public Architekt getArchitektByORMID(PersistentSession session, String name) throws PersistentException;
	public Architekt loadArchitektByORMID(PersistentSession session, String name, org.hibernate.LockMode lockMode) throws PersistentException;
	public Architekt getArchitektByORMID(PersistentSession session, String name, org.hibernate.LockMode lockMode) throws PersistentException;
	public Architekt[] listArchitektByQuery(String condition, String orderBy) throws PersistentException;
	public Architekt[] listArchitektByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryArchitekt(String condition, String orderBy) throws PersistentException;
	public java.util.List queryArchitekt(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateArchitektByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateArchitektByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Architekt[] listArchitektByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Architekt[] listArchitektByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryArchitekt(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryArchitekt(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateArchitektByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateArchitektByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Architekt loadArchitektByQuery(String condition, String orderBy) throws PersistentException;
	public Architekt loadArchitektByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Architekt loadArchitektByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Architekt loadArchitektByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Architekt createArchitekt();
	public boolean save(de.hhn.se.pmt.buildings.model.Architekt architekt) throws PersistentException;
	public boolean delete(de.hhn.se.pmt.buildings.model.Architekt architekt) throws PersistentException;
	public boolean deleteAndDissociate(de.hhn.se.pmt.buildings.model.Architekt architekt) throws PersistentException;
	public boolean deleteAndDissociate(de.hhn.se.pmt.buildings.model.Architekt architekt, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(de.hhn.se.pmt.buildings.model.Architekt architekt) throws PersistentException;
	public boolean evict(de.hhn.se.pmt.buildings.model.Architekt architekt) throws PersistentException;
}
