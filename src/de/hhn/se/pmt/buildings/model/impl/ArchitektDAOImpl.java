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

public class ArchitektDAOImpl implements de.hhn.se.pmt.buildings.model.dao.ArchitektDAO {
	public Architekt loadArchitektByORMID(String name) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return loadArchitektByORMID(session, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Architekt getArchitektByORMID(String name) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return getArchitektByORMID(session, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Architekt loadArchitektByORMID(String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return loadArchitektByORMID(session, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Architekt getArchitektByORMID(String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return getArchitektByORMID(session, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Architekt loadArchitektByORMID(PersistentSession session, String name) throws PersistentException {
		try {
			return (Architekt) session.load(de.hhn.se.pmt.buildings.model.Architekt.class, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Architekt getArchitektByORMID(PersistentSession session, String name) throws PersistentException {
		try {
			return (Architekt) session.get(de.hhn.se.pmt.buildings.model.Architekt.class, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Architekt loadArchitektByORMID(PersistentSession session, String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Architekt) session.load(de.hhn.se.pmt.buildings.model.Architekt.class, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Architekt getArchitektByORMID(PersistentSession session, String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Architekt) session.get(de.hhn.se.pmt.buildings.model.Architekt.class, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryArchitekt(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return queryArchitekt(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryArchitekt(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return queryArchitekt(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Architekt[] listArchitektByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return listArchitektByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Architekt[] listArchitektByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return listArchitektByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryArchitekt(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.buildings.model.Architekt as Architekt");
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
	
	public List queryArchitekt(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.buildings.model.Architekt as Architekt");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Architekt", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Architekt[] listArchitektByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryArchitekt(session, condition, orderBy);
			return (Architekt[]) list.toArray(new Architekt[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Architekt[] listArchitektByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryArchitekt(session, condition, orderBy, lockMode);
			return (Architekt[]) list.toArray(new Architekt[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Architekt loadArchitektByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return loadArchitektByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Architekt loadArchitektByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return loadArchitektByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Architekt loadArchitektByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Architekt[] architekts = listArchitektByQuery(session, condition, orderBy);
		if (architekts != null && architekts.length > 0)
			return architekts[0];
		else
			return null;
	}
	
	public Architekt loadArchitektByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Architekt[] architekts = listArchitektByQuery(session, condition, orderBy, lockMode);
		if (architekts != null && architekts.length > 0)
			return architekts[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateArchitektByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return iterateArchitektByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateArchitektByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BuGabuildingsguidePersistentManager.instance().getSession();
			return iterateArchitektByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateArchitektByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.buildings.model.Architekt as Architekt");
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
	
	public java.util.Iterator iterateArchitektByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.buildings.model.Architekt as Architekt");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Architekt", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Architekt createArchitekt() {
		return new de.hhn.se.pmt.buildings.model.Architekt();
	}
	
	public boolean save(de.hhn.se.pmt.buildings.model.Architekt architekt) throws PersistentException {
		try {
			BuGabuildingsguidePersistentManager.instance().saveObject(architekt);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(de.hhn.se.pmt.buildings.model.Architekt architekt) throws PersistentException {
		try {
			BuGabuildingsguidePersistentManager.instance().deleteObject(architekt);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(de.hhn.se.pmt.buildings.model.Architekt architekt)throws PersistentException {
		try {
			de.hhn.se.pmt.buildings.model.Gebäude[] lBauwerks = (de.hhn.se.pmt.buildings.model.Gebäude[])architekt.getBauwerk().toArray(new de.hhn.se.pmt.buildings.model.Gebäude[architekt.getBauwerk().size()]);
			for(int i = 0; i < lBauwerks.length; i++) {
				lBauwerks[i].setArchitekt(null);
			}
			return delete(architekt);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(de.hhn.se.pmt.buildings.model.Architekt architekt, org.orm.PersistentSession session)throws PersistentException {
		try {
			de.hhn.se.pmt.buildings.model.Gebäude[] lBauwerks = (de.hhn.se.pmt.buildings.model.Gebäude[])architekt.getBauwerk().toArray(new de.hhn.se.pmt.buildings.model.Gebäude[architekt.getBauwerk().size()]);
			for(int i = 0; i < lBauwerks.length; i++) {
				lBauwerks[i].setArchitekt(null);
			}
			try {
				session.delete(architekt);
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
	
	public boolean refresh(de.hhn.se.pmt.buildings.model.Architekt architekt) throws PersistentException {
		try {
			BuGabuildingsguidePersistentManager.instance().getSession().refresh(architekt);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(de.hhn.se.pmt.buildings.model.Architekt architekt) throws PersistentException {
		try {
			BuGabuildingsguidePersistentManager.instance().getSession().evict(architekt);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
