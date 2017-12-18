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

public class MerklisteDAOImpl implements de.hhn.se.pmt.buildings.model.dao.MerklisteDAO {
	public Merkliste loadMerklisteByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return loadMerklisteByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Merkliste getMerklisteByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return getMerklisteByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Merkliste loadMerklisteByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return loadMerklisteByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Merkliste getMerklisteByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return getMerklisteByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Merkliste loadMerklisteByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Merkliste) session.load(de.hhn.se.pmt.buildings.model.Merkliste.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Merkliste getMerklisteByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Merkliste) session.get(de.hhn.se.pmt.buildings.model.Merkliste.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Merkliste loadMerklisteByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Merkliste) session.load(de.hhn.se.pmt.buildings.model.Merkliste.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Merkliste getMerklisteByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Merkliste) session.get(de.hhn.se.pmt.buildings.model.Merkliste.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryMerkliste(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return queryMerkliste(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryMerkliste(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return queryMerkliste(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Merkliste[] listMerklisteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return listMerklisteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Merkliste[] listMerklisteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return listMerklisteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryMerkliste(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.buildings.model.Merkliste as Merkliste");
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
	
	public List queryMerkliste(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.buildings.model.Merkliste as Merkliste");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Merkliste", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Merkliste[] listMerklisteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMerkliste(session, condition, orderBy);
			return (Merkliste[]) list.toArray(new Merkliste[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Merkliste[] listMerklisteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMerkliste(session, condition, orderBy, lockMode);
			return (Merkliste[]) list.toArray(new Merkliste[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Merkliste loadMerklisteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return loadMerklisteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Merkliste loadMerklisteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return loadMerklisteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Merkliste loadMerklisteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Merkliste[] merklistes = listMerklisteByQuery(session, condition, orderBy);
		if (merklistes != null && merklistes.length > 0)
			return merklistes[0];
		else
			return null;
	}
	
	public Merkliste loadMerklisteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Merkliste[] merklistes = listMerklisteByQuery(session, condition, orderBy, lockMode);
		if (merklistes != null && merklistes.length > 0)
			return merklistes[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateMerklisteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return iterateMerklisteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateMerklisteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return iterateMerklisteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateMerklisteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.buildings.model.Merkliste as Merkliste");
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
	
	public java.util.Iterator iterateMerklisteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.buildings.model.Merkliste as Merkliste");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Merkliste", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Merkliste createMerkliste() {
		return new de.hhn.se.pmt.buildings.model.Merkliste();
	}
	
	public boolean save(de.hhn.se.pmt.buildings.model.Merkliste merkliste) throws PersistentException {
		try {
			BuGabuildingsguidePersistentManager.instance().saveObject(merkliste);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(de.hhn.se.pmt.buildings.model.Merkliste merkliste) throws PersistentException {
		try {
			BuGabuildingsguidePersistentManager.instance().deleteObject(merkliste);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(de.hhn.se.pmt.buildings.model.Merkliste merkliste)throws PersistentException {
		try {
			if (merkliste.getBesitzer() != null) {
				merkliste.getBesitzer().setMerkliste(null);
			}
			
			de.hhn.se.pmt.buildings.model.Gebäude[] lGebäudess = (de.hhn.se.pmt.buildings.model.Gebäude[])merkliste.getGebäudes().toArray(new de.hhn.se.pmt.buildings.model.Gebäude[merkliste.getGebäudes().size()]);
			for(int i = 0; i < lGebäudess.length; i++) {
				lGebäudess[i].getMerklistes().remove(merkliste);
			}
			return delete(merkliste);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(de.hhn.se.pmt.buildings.model.Merkliste merkliste, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (merkliste.getBesitzer() != null) {
				merkliste.getBesitzer().setMerkliste(null);
			}
			
			de.hhn.se.pmt.buildings.model.Gebäude[] lGebäudess = (de.hhn.se.pmt.buildings.model.Gebäude[])merkliste.getGebäudes().toArray(new de.hhn.se.pmt.buildings.model.Gebäude[merkliste.getGebäudes().size()]);
			for(int i = 0; i < lGebäudess.length; i++) {
				lGebäudess[i].getMerklistes().remove(merkliste);
			}
			try {
				session.delete(merkliste);
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
	
	public boolean refresh(de.hhn.se.pmt.buildings.model.Merkliste merkliste) throws PersistentException {
		try {
			BuGabuildingsguidePersistentManager.instance().getSession().refresh(merkliste);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(de.hhn.se.pmt.buildings.model.Merkliste merkliste) throws PersistentException {
		try {
			BuGabuildingsguidePersistentManager.instance().getSession().evict(merkliste);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
