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

public interface BuGaBesucherDAO {
	public BuGaBesucher loadBuGaBesucherByORMID(int ID) throws PersistentException;
	public BuGaBesucher getBuGaBesucherByORMID(int ID) throws PersistentException;
	public BuGaBesucher loadBuGaBesucherByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public BuGaBesucher getBuGaBesucherByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public BuGaBesucher loadBuGaBesucherByORMID(PersistentSession session, int ID) throws PersistentException;
	public BuGaBesucher getBuGaBesucherByORMID(PersistentSession session, int ID) throws PersistentException;
	public BuGaBesucher loadBuGaBesucherByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public BuGaBesucher getBuGaBesucherByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public BuGaBesucher[] listBuGaBesucherByQuery(String condition, String orderBy) throws PersistentException;
	public BuGaBesucher[] listBuGaBesucherByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryBuGaBesucher(String condition, String orderBy) throws PersistentException;
	public java.util.List queryBuGaBesucher(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateBuGaBesucherByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateBuGaBesucherByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public BuGaBesucher[] listBuGaBesucherByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public BuGaBesucher[] listBuGaBesucherByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryBuGaBesucher(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryBuGaBesucher(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateBuGaBesucherByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateBuGaBesucherByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public BuGaBesucher loadBuGaBesucherByQuery(String condition, String orderBy) throws PersistentException;
	public BuGaBesucher loadBuGaBesucherByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public BuGaBesucher loadBuGaBesucherByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public BuGaBesucher loadBuGaBesucherByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public BuGaBesucher createBuGaBesucher();
	public boolean save(de.hhn.se.pmt.buildings.model.BuGaBesucher buGaBesucher) throws PersistentException;
	public boolean delete(de.hhn.se.pmt.buildings.model.BuGaBesucher buGaBesucher) throws PersistentException;
	public boolean deleteAndDissociate(de.hhn.se.pmt.buildings.model.BuGaBesucher buGaBesucher) throws PersistentException;
	public boolean deleteAndDissociate(de.hhn.se.pmt.buildings.model.BuGaBesucher buGaBesucher, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(de.hhn.se.pmt.buildings.model.BuGaBesucher buGaBesucher) throws PersistentException;
	public boolean evict(de.hhn.se.pmt.buildings.model.BuGaBesucher buGaBesucher) throws PersistentException;
}
