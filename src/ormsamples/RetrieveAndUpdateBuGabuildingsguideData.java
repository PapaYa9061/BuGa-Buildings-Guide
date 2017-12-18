/**
 * Licensee: Yannick Pauler(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateBuGabuildingsguideData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = de.hhn.se.pmt.buildings.model.BuGabuildingsguidePersistentManager.instance().getSession().beginTransaction();
		try {
			de.hhn.se.pmt.buildings.model.DAOFactory lDAOFactory = de.hhn.se.pmt.buildings.model.DAOFactory.getDAOFactory();
			de.hhn.se.pmt.buildings.model.dao.StandortDAO ldehhnsepmtbuildingsmodelStandortDAO = lDAOFactory.getStandortDAO();
			de.hhn.se.pmt.buildings.model.Standort ldehhnsepmtbuildingsmodelStandort = ldehhnsepmtbuildingsmodelStandortDAO.loadStandortByQuery(null, null);
			// Update the properties of the persistent object
			ldehhnsepmtbuildingsmodelStandortDAO.save(ldehhnsepmtbuildingsmodelStandort);
			de.hhn.se.pmt.buildings.model.dao.BewertungDAO ldehhnsepmtbuildingsmodelBewertungDAO = lDAOFactory.getBewertungDAO();
			de.hhn.se.pmt.buildings.model.Bewertung ldehhnsepmtbuildingsmodelBewertung = ldehhnsepmtbuildingsmodelBewertungDAO.loadBewertungByQuery(null, null);
			// Update the properties of the persistent object
			ldehhnsepmtbuildingsmodelBewertungDAO.save(ldehhnsepmtbuildingsmodelBewertung);
			de.hhn.se.pmt.buildings.model.dao.BuGaBesucherDAO ldehhnsepmtbuildingsmodelBuGaBesucherDAO = lDAOFactory.getBuGaBesucherDAO();
			de.hhn.se.pmt.buildings.model.BuGaBesucher ldehhnsepmtbuildingsmodelBuGaBesucher = ldehhnsepmtbuildingsmodelBuGaBesucherDAO.loadBuGaBesucherByQuery(null, null);
			// Update the properties of the persistent object
			ldehhnsepmtbuildingsmodelBuGaBesucherDAO.save(ldehhnsepmtbuildingsmodelBuGaBesucher);
			de.hhn.se.pmt.buildings.model.dao.ArchitektDAO ldehhnsepmtbuildingsmodelArchitektDAO = lDAOFactory.getArchitektDAO();
			de.hhn.se.pmt.buildings.model.Architekt ldehhnsepmtbuildingsmodelArchitekt = ldehhnsepmtbuildingsmodelArchitektDAO.loadArchitektByQuery(null, null);
			// Update the properties of the persistent object
			ldehhnsepmtbuildingsmodelArchitektDAO.save(ldehhnsepmtbuildingsmodelArchitekt);
			de.hhn.se.pmt.buildings.model.dao.GebäudeDAO ldehhnsepmtbuildingsmodelGebäudeDAO = lDAOFactory.getGebäudeDAO();
			de.hhn.se.pmt.buildings.model.Gebäude ldehhnsepmtbuildingsmodelGebäude = ldehhnsepmtbuildingsmodelGebäudeDAO.loadGebäudeByQuery(null, null);
			// Update the properties of the persistent object
			ldehhnsepmtbuildingsmodelGebäudeDAO.save(ldehhnsepmtbuildingsmodelGebäude);
			de.hhn.se.pmt.buildings.model.dao.MerklisteDAO ldehhnsepmtbuildingsmodelMerklisteDAO = lDAOFactory.getMerklisteDAO();
			de.hhn.se.pmt.buildings.model.Merkliste ldehhnsepmtbuildingsmodelMerkliste = ldehhnsepmtbuildingsmodelMerklisteDAO.loadMerklisteByQuery(null, null);
			// Update the properties of the persistent object
			ldehhnsepmtbuildingsmodelMerklisteDAO.save(ldehhnsepmtbuildingsmodelMerkliste);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateBuGabuildingsguideData retrieveAndUpdateBuGabuildingsguideData = new RetrieveAndUpdateBuGabuildingsguideData();
			try {
				retrieveAndUpdateBuGabuildingsguideData.retrieveAndUpdateTestData();
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
