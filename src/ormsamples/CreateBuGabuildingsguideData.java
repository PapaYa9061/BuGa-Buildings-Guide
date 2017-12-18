/**
 * Licensee: Yannick Pauler(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateBuGabuildingsguideData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = de.hhn.se.pmt.buildings.model.BuGabuildingsguidePersistentManager.instance().getSession().beginTransaction();
		try {
			de.hhn.se.pmt.buildings.model.DAOFactory lDAOFactory = de.hhn.se.pmt.buildings.model.DAOFactory.getDAOFactory();
			de.hhn.se.pmt.buildings.model.dao.StandortDAO ldehhnsepmtbuildingsmodelStandortDAO = lDAOFactory.getStandortDAO();
			de.hhn.se.pmt.buildings.model.Standort ldehhnsepmtbuildingsmodelStandort = ldehhnsepmtbuildingsmodelStandortDAO.createStandort();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : lon, lat
			ldehhnsepmtbuildingsmodelStandortDAO.save(ldehhnsepmtbuildingsmodelStandort);
			de.hhn.se.pmt.buildings.model.dao.BewertungDAO ldehhnsepmtbuildingsmodelBewertungDAO = lDAOFactory.getBewertungDAO();
			de.hhn.se.pmt.buildings.model.Bewertung ldehhnsepmtbuildingsmodelBewertung = ldehhnsepmtbuildingsmodelBewertungDAO.createBewertung();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : buGaBesucher, bewertung
			ldehhnsepmtbuildingsmodelBewertungDAO.save(ldehhnsepmtbuildingsmodelBewertung);
			de.hhn.se.pmt.buildings.model.dao.BuGaBesucherDAO ldehhnsepmtbuildingsmodelBuGaBesucherDAO = lDAOFactory.getBuGaBesucherDAO();
			de.hhn.se.pmt.buildings.model.BuGaBesucher ldehhnsepmtbuildingsmodelBuGaBesucher = ldehhnsepmtbuildingsmodelBuGaBesucherDAO.createBuGaBesucher();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : merkliste, bewertungs
			ldehhnsepmtbuildingsmodelBuGaBesucherDAO.save(ldehhnsepmtbuildingsmodelBuGaBesucher);
			de.hhn.se.pmt.buildings.model.dao.ArchitektDAO ldehhnsepmtbuildingsmodelArchitektDAO = lDAOFactory.getArchitektDAO();
			de.hhn.se.pmt.buildings.model.Architekt ldehhnsepmtbuildingsmodelArchitekt = ldehhnsepmtbuildingsmodelArchitektDAO.createArchitekt();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : name
			ldehhnsepmtbuildingsmodelArchitektDAO.save(ldehhnsepmtbuildingsmodelArchitekt);
			de.hhn.se.pmt.buildings.model.dao.GebäudeDAO ldehhnsepmtbuildingsmodelGebäudeDAO = lDAOFactory.getGebäudeDAO();
			de.hhn.se.pmt.buildings.model.Gebäude ldehhnsepmtbuildingsmodelGebäude = ldehhnsepmtbuildingsmodelGebäudeDAO.createGebäude();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : merklistes, name
			ldehhnsepmtbuildingsmodelGebäudeDAO.save(ldehhnsepmtbuildingsmodelGebäude);
			de.hhn.se.pmt.buildings.model.dao.MerklisteDAO ldehhnsepmtbuildingsmodelMerklisteDAO = lDAOFactory.getMerklisteDAO();
			de.hhn.se.pmt.buildings.model.Merkliste ldehhnsepmtbuildingsmodelMerkliste = ldehhnsepmtbuildingsmodelMerklisteDAO.createMerkliste();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : gebäudes, besitzer
			ldehhnsepmtbuildingsmodelMerklisteDAO.save(ldehhnsepmtbuildingsmodelMerkliste);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateBuGabuildingsguideData createBuGabuildingsguideData = new CreateBuGabuildingsguideData();
			try {
				createBuGabuildingsguideData.createTestData();
			}
			finally {
				de.hhn.se.pmt.buildings.model.BuGabuildingsguidePersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
