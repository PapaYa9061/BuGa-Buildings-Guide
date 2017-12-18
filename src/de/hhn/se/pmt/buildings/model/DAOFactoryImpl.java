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

import de.hhn.se.pmt.buildings.model.impl.*;
import de.hhn.se.pmt.buildings.model.dao.*;

public class DAOFactoryImpl extends DAOFactory {
	private StandortDAO _standortDAO = new StandortDAOImpl();
	public StandortDAO getStandortDAO() {
		return _standortDAO;
	}
	
	private BewertungDAO _bewertungDAO = new BewertungDAOImpl();
	public BewertungDAO getBewertungDAO() {
		return _bewertungDAO;
	}
	
	private BuGaBesucherDAO _buGaBesucherDAO = new BuGaBesucherDAOImpl();
	public BuGaBesucherDAO getBuGaBesucherDAO() {
		return _buGaBesucherDAO;
	}
	
	private ArchitektDAO _architektDAO = new ArchitektDAOImpl();
	public ArchitektDAO getArchitektDAO() {
		return _architektDAO;
	}
	
	private GebäudeDAO _gebäudeDAO = new GebäudeDAOImpl();
	public GebäudeDAO getGebäudeDAO() {
		return _gebäudeDAO;
	}
	
	private MerklisteDAO _merklisteDAO = new MerklisteDAOImpl();
	public MerklisteDAO getMerklisteDAO() {
		return _merklisteDAO;
	}
	
}

