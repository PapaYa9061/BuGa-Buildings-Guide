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

public class GebäudeDAOImpl implements de.hhn.se.pmt.buildings.model.dao.GebäudeDAO {
	public Gebäude loadGebäudeByORMID(String name) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return loadGebäudeByORMID(session, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Gebäude getGebäudeByORMID(String name) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return getGebäudeByORMID(session, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Gebäude loadGebäudeByORMID(String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return loadGebäudeByORMID(session, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Gebäude getGebäudeByORMID(String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return getGebäudeByORMID(session, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Gebäude loadGebäudeByORMID(PersistentSession session, String name) throws PersistentException {
		try {
			return (Gebäude) session.load(de.hhn.se.pmt.buildings.model.Gebäude.class, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Gebäude getGebäudeByORMID(PersistentSession session, String name) throws PersistentException {
		try {
			return (Gebäude) session.get(de.hhn.se.pmt.buildings.model.Gebäude.class, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Gebäude loadGebäudeByORMID(PersistentSession session, String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Gebäude) session.load(de.hhn.se.pmt.buildings.model.Gebäude.class, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Gebäude getGebäudeByORMID(PersistentSession session, String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Gebäude) session.get(de.hhn.se.pmt.buildings.model.Gebäude.class, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryGebäude(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return queryGebäude(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryGebäude(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return queryGebäude(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Gebäude[] listGebäudeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return listGebäudeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Gebäude[] listGebäudeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return listGebäudeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryGebäude(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.buildings.model.Gebäude as Gebäude");
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
	
	public List queryGebäude(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.buildings.model.Gebäude as Gebäude");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Gebäude", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Gebäude[] listGebäudeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryGebäude(session, condition, orderBy);
			return (Gebäude[]) list.toArray(new Gebäude[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Gebäude[] listGebäudeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryGebäude(session, condition, orderBy, lockMode);
			return (Gebäude[]) list.toArray(new Gebäude[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Gebäude loadGebäudeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return loadGebäudeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Gebäude loadGebäudeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return loadGebäudeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Gebäude loadGebäudeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Gebäude[] gebäudes = listGebäudeByQuery(session, condition, orderBy);
		if (gebäudes != null && gebäudes.length > 0)
			return gebäudes[0];
		else
			return null;
	}
	
	public Gebäude loadGebäudeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Gebäude[] gebäudes = listGebäudeByQuery(session, condition, orderBy, lockMode);
		if (gebäudes != null && gebäudes.length > 0)
			return gebäudes[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateGebäudeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return iterateGebäudeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateGebäudeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return iterateGebäudeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateGebäudeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.buildings.model.Gebäude as Gebäude");
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
	
	public java.util.Iterator iterateGebäudeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.buildings.model.Gebäude as Gebäude");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Gebäude", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Gebäude createGebäude() {
		return new de.hhn.se.pmt.buildings.model.Gebäude();
	}
	
	public boolean save(de.hhn.se.pmt.buildings.model.Gebäude gebäude) throws PersistentException {
		try {
			BuGabuildingsguidePersistentManager.instance().saveObject(gebäude);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(de.hhn.se.pmt.buildings.model.Gebäude gebäude) throws PersistentException {
		try {
			BuGabuildingsguidePersistentManager.instance().deleteObject(gebäude);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(de.hhn.se.pmt.buildings.model.Gebäude gebäude)throws PersistentException {
		try {
			if (gebäude.getArchitekt() != null) {
				gebäude.getArchitekt().getBauwerk().remove(gebäude);
			}
			
			de.hhn.se.pmt.buildings.model.Bewertung[] lBewertungss = (de.hhn.se.pmt.buildings.model.Bewertung[])gebäude.getBewertungs().toArray(new de.hhn.se.pmt.buildings.model.Bewertung[gebäude.getBewertungs().size()]);
			for(int i = 0; i < lBewertungss.length; i++) {
				lBewertungss[i].setGebäude(null);
			}
			de.hhn.se.pmt.buildings.model.Merkliste[] lMerklistess = (de.hhn.se.pmt.buildings.model.Merkliste[])gebäude.getMerklistes().toArray(new de.hhn.se.pmt.buildings.model.Merkliste[gebäude.getMerklistes().size()]);
			for(int i = 0; i < lMerklistess.length; i++) {
				lMerklistess[i].getGebäudes().remove(gebäude);
			}
			if (gebäude.getStandort() != null) {
				gebäude.getStandort().setGebäude(null);
			}
			
			return delete(gebäude);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(de.hhn.se.pmt.buildings.model.Gebäude gebäude, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (gebäude.getArchitekt() != null) {
				gebäude.getArchitekt().getBauwerk().remove(gebäude);
			}
			
			de.hhn.se.pmt.buildings.model.Bewertung[] lBewertungss = (de.hhn.se.pmt.buildings.model.Bewertung[])gebäude.getBewertungs().toArray(new de.hhn.se.pmt.buildings.model.Bewertung[gebäude.getBewertungs().size()]);
			for(int i = 0; i < lBewertungss.length; i++) {
				lBewertungss[i].setGebäude(null);
			}
			de.hhn.se.pmt.buildings.model.Merkliste[] lMerklistess = (de.hhn.se.pmt.buildings.model.Merkliste[])gebäude.getMerklistes().toArray(new de.hhn.se.pmt.buildings.model.Merkliste[gebäude.getMerklistes().size()]);
			for(int i = 0; i < lMerklistess.length; i++) {
				lMerklistess[i].getGebäudes().remove(gebäude);
			}
			if (gebäude.getStandort() != null) {
				gebäude.getStandort().setGebäude(null);
			}
			
			try {
				session.delete(gebäude);
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
	
	public boolean refresh(de.hhn.se.pmt.buildings.model.Gebäude gebäude) throws PersistentException {
		try {
			BuGabuildingsguidePersistentManager.instance().getSession().refresh(gebäude);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(de.hhn.se.pmt.buildings.model.Gebäude gebäude) throws PersistentException {
		try {
			BuGabuildingsguidePersistentManager.instance().getSession().evict(gebäude);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
