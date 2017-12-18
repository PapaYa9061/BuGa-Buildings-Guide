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
package de.hhn.se.pmt.buildings.model.impl;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;
import de.hhn.se.pmt.buildings.model.*;

public class BewertungDAOImpl implements de.hhn.se.pmt.buildings.model.dao.BewertungDAO {
	public Bewertung loadBewertungByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return loadBewertungByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Bewertung getBewertungByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return getBewertungByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Bewertung loadBewertungByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return loadBewertungByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Bewertung getBewertungByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return getBewertungByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Bewertung loadBewertungByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Bewertung) session.load(de.hhn.se.pmt.buildings.model.Bewertung.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Bewertung getBewertungByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Bewertung) session.get(de.hhn.se.pmt.buildings.model.Bewertung.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Bewertung loadBewertungByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Bewertung) session.load(de.hhn.se.pmt.buildings.model.Bewertung.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Bewertung getBewertungByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Bewertung) session.get(de.hhn.se.pmt.buildings.model.Bewertung.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryBewertung(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return queryBewertung(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryBewertung(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return queryBewertung(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Bewertung[] listBewertungByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return listBewertungByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Bewertung[] listBewertungByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return listBewertungByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryBewertung(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.buildings.model.Bewertung as Bewertung");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryBewertung(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.buildings.model.Bewertung as Bewertung");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Bewertung", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Bewertung[] listBewertungByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryBewertung(session, condition, orderBy);
			return (Bewertung[]) list.toArray(new Bewertung[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Bewertung[] listBewertungByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryBewertung(session, condition, orderBy, lockMode);
			return (Bewertung[]) list.toArray(new Bewertung[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Bewertung loadBewertungByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return loadBewertungByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Bewertung loadBewertungByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return loadBewertungByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Bewertung loadBewertungByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Bewertung[] bewertungs = listBewertungByQuery(session, condition, orderBy);
		if (bewertungs != null && bewertungs.length > 0)
			return bewertungs[0];
		else
			return null;
	}
	
	public Bewertung loadBewertungByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Bewertung[] bewertungs = listBewertungByQuery(session, condition, orderBy, lockMode);
		if (bewertungs != null && bewertungs.length > 0)
			return bewertungs[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateBewertungByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return iterateBewertungByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateBewertungByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return iterateBewertungByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateBewertungByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.buildings.model.Bewertung as Bewertung");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateBewertungByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.buildings.model.Bewertung as Bewertung");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Bewertung", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Bewertung createBewertung() {
		return new de.hhn.se.pmt.buildings.model.Bewertung();
	}
	
	public boolean save(de.hhn.se.pmt.buildings.model.Bewertung bewertung) throws PersistentException {
		try {
			BuGabuildingsguidePersistentManager.instance().saveObject(bewertung);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(de.hhn.se.pmt.buildings.model.Bewertung bewertung) throws PersistentException {
		try {
			BuGabuildingsguidePersistentManager.instance().deleteObject(bewertung);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(de.hhn.se.pmt.buildings.model.Bewertung bewertung)throws PersistentException {
		try {
			if (bewertung.getGebäude() != null) {
				bewertung.getGebäude().getBewertungs().remove(bewertung);
			}
			
			if (bewertung.getBuGaBesucher() != null) {
				bewertung.getBuGaBesucher().getBewertungs().remove(bewertung);
			}
			
			return delete(bewertung);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(de.hhn.se.pmt.buildings.model.Bewertung bewertung, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (bewertung.getGebäude() != null) {
				bewertung.getGebäude().getBewertungs().remove(bewertung);
			}
			
			if (bewertung.getBuGaBesucher() != null) {
				bewertung.getBuGaBesucher().getBewertungs().remove(bewertung);
			}
			
			try {
				session.delete(bewertung);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh(de.hhn.se.pmt.buildings.model.Bewertung bewertung) throws PersistentException {
		try {
			BuGabuildingsguidePersistentManager.instance().getSession().refresh(bewertung);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(de.hhn.se.pmt.buildings.model.Bewertung bewertung) throws PersistentException {
		try {
			BuGabuildingsguidePersistentManager.instance().getSession().evict(bewertung);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
