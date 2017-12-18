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
package de.hhn.se.pmt.buildings.model;

import de.hhn.se.pmt.buildings.model.dao.*;

public abstract class DAOFactory {
	private static DAOFactory _factory = new DAOFactoryImpl();
	
	public static DAOFactory getDAOFactory() {
		return _factory;
	}
	
	public abstract StandortDAO getStandortDAO();
	public abstract BewertungDAO getBewertungDAO();
	public abstract BuGaBesucherDAO getBuGaBesucherDAO();
	public abstract ArchitektDAO getArchitektDAO();
	public abstract GebäudeDAO getGebäudeDAO();
	public abstract MerklisteDAO getMerklisteDAO();
}

