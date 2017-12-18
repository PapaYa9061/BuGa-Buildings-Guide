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

public interface MerklisteDAO {
	public Merkliste loadMerklisteByORMID(int ID) throws PersistentException;
	public Merkliste getMerklisteByORMID(int ID) throws PersistentException;
	public Merkliste loadMerklisteByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Merkliste getMerklisteByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Merkliste loadMerklisteByORMID(PersistentSession session, int ID) throws PersistentException;
	public Merkliste getMerklisteByORMID(PersistentSession session, int ID) throws PersistentException;
	public Merkliste loadMerklisteByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Merkliste getMerklisteByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Merkliste[] listMerklisteByQuery(String condition, String orderBy) throws PersistentException;
	public Merkliste[] listMerklisteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryMerkliste(String condition, String orderBy) throws PersistentException;
	public java.util.List queryMerkliste(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateMerklisteByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateMerklisteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Merkliste[] listMerklisteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Merkliste[] listMerklisteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryMerkliste(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryMerkliste(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateMerklisteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateMerklisteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Merkliste loadMerklisteByQuery(String condition, String orderBy) throws PersistentException;
	public Merkliste loadMerklisteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Merkliste loadMerklisteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Merkliste loadMerklisteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Merkliste createMerkliste();
	public boolean save(de.hhn.se.pmt.buildings.model.Merkliste merkliste) throws PersistentException;
	public boolean delete(de.hhn.se.pmt.buildings.model.Merkliste merkliste) throws PersistentException;
	public boolean deleteAndDissociate(de.hhn.se.pmt.buildings.model.Merkliste merkliste) throws PersistentException;
	public boolean deleteAndDissociate(de.hhn.se.pmt.buildings.model.Merkliste merkliste, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(de.hhn.se.pmt.buildings.model.Merkliste merkliste) throws PersistentException;
	public boolean evict(de.hhn.se.pmt.buildings.model.Merkliste merkliste) throws PersistentException;
}
