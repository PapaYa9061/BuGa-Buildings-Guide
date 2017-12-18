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

public class BuGaBesucherDAOImpl implements de.hhn.se.pmt.buildings.model.dao.BuGaBesucherDAO {
	public BuGaBesucher loadBuGaBesucherByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return loadBuGaBesucherByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public BuGaBesucher getBuGaBesucherByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return getBuGaBesucherByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public BuGaBesucher loadBuGaBesucherByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return loadBuGaBesucherByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public BuGaBesucher getBuGaBesucherByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return getBuGaBesucherByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public BuGaBesucher loadBuGaBesucherByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (BuGaBesucher) session.load(de.hhn.se.pmt.buildings.model.BuGaBesucher.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public BuGaBesucher getBuGaBesucherByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (BuGaBesucher) session.get(de.hhn.se.pmt.buildings.model.BuGaBesucher.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public BuGaBesucher loadBuGaBesucherByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (BuGaBesucher) session.load(de.hhn.se.pmt.buildings.model.BuGaBesucher.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public BuGaBesucher getBuGaBesucherByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (BuGaBesucher) session.get(de.hhn.se.pmt.buildings.model.BuGaBesucher.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryBuGaBesucher(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return queryBuGaBesucher(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryBuGaBesucher(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return queryBuGaBesucher(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public BuGaBesucher[] listBuGaBesucherByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return listBuGaBesucherByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public BuGaBesucher[] listBuGaBesucherByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return listBuGaBesucherByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryBuGaBesucher(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.buildings.model.BuGaBesucher as BuGaBesucher");
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
	
	public List queryBuGaBesucher(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.buildings.model.BuGaBesucher as BuGaBesucher");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("BuGaBesucher", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public BuGaBesucher[] listBuGaBesucherByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryBuGaBesucher(session, condition, orderBy);
			return (BuGaBesucher[]) list.toArray(new BuGaBesucher[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public BuGaBesucher[] listBuGaBesucherByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryBuGaBesucher(session, condition, orderBy, lockMode);
			return (BuGaBesucher[]) list.toArray(new BuGaBesucher[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public BuGaBesucher loadBuGaBesucherByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return loadBuGaBesucherByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public BuGaBesucher loadBuGaBesucherByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return loadBuGaBesucherByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public BuGaBesucher loadBuGaBesucherByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		BuGaBesucher[] buGaBesuchers = listBuGaBesucherByQuery(session, condition, orderBy);
		if (buGaBesuchers != null && buGaBesuchers.length > 0)
			return buGaBesuchers[0];
		else
			return null;
	}
	
	public BuGaBesucher loadBuGaBesucherByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		BuGaBesucher[] buGaBesuchers = listBuGaBesucherByQuery(session, condition, orderBy, lockMode);
		if (buGaBesuchers != null && buGaBesuchers.length > 0)
			return buGaBesuchers[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateBuGaBesucherByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return iterateBuGaBesucherByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateBuGaBesucherByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return iterateBuGaBesucherByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateBuGaBesucherByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.buildings.model.BuGaBesucher as BuGaBesucher");
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
	
	public java.util.Iterator iterateBuGaBesucherByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.buildings.model.BuGaBesucher as BuGaBesucher");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("BuGaBesucher", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public BuGaBesucher createBuGaBesucher() {
		return new de.hhn.se.pmt.buildings.model.BuGaBesucher();
	}
	
	public boolean save(de.hhn.se.pmt.buildings.model.BuGaBesucher buGaBesucher) throws PersistentException {
		try {
			BuGabuildingsguidePersistentManager.instance().saveObject(buGaBesucher);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(de.hhn.se.pmt.buildings.model.BuGaBesucher buGaBesucher) throws PersistentException {
		try {
			BuGabuildingsguidePersistentManager.instance().deleteObject(buGaBesucher);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(de.hhn.se.pmt.buildings.model.BuGaBesucher buGaBesucher)throws PersistentException {
		try {
			de.hhn.se.pmt.buildings.model.Bewertung[] lBewertungss = (de.hhn.se.pmt.buildings.model.Bewertung[])buGaBesucher.getBewertungs().toArray(new de.hhn.se.pmt.buildings.model.Bewertung[buGaBesucher.getBewertungs().size()]);
			for(int i = 0; i < lBewertungss.length; i++) {
				lBewertungss[i].setBuGaBesucher(null);
			}
			if (buGaBesucher.getMerkliste() != null) {
				buGaBesucher.getMerkliste().setBesitzer(null);
			}
			
			return delete(buGaBesucher);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(de.hhn.se.pmt.buildings.model.BuGaBesucher buGaBesucher, org.orm.PersistentSession session)throws PersistentException {
		try {
			de.hhn.se.pmt.buildings.model.Bewertung[] lBewertungss = (de.hhn.se.pmt.buildings.model.Bewertung[])buGaBesucher.getBewertungs().toArray(new de.hhn.se.pmt.buildings.model.Bewertung[buGaBesucher.getBewertungs().size()]);
			for(int i = 0; i < lBewertungss.length; i++) {
				lBewertungss[i].setBuGaBesucher(null);
			}
			if (buGaBesucher.getMerkliste() != null) {
				buGaBesucher.getMerkliste().setBesitzer(null);
			}
			
			try {
				session.delete(buGaBesucher);
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
	
	public boolean refresh(de.hhn.se.pmt.buildings.model.BuGaBesucher buGaBesucher) throws PersistentException {
		try {
			BuGabuildingsguidePersistentManager.instance().getSession().refresh(buGaBesucher);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(de.hhn.se.pmt.buildings.model.BuGaBesucher buGaBesucher) throws PersistentException {
		try {
			BuGabuildingsguidePersistentManager.instance().getSession().evict(buGaBesucher);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
