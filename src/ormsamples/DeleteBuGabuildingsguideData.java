/**
 * Licensee: Yannick Pauler(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteBuGabuildingsguideData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = de.hhn.se.pmt.buildings.model.BuGabuildingsguidePersistentManager.instance().getSession().beginTransaction();
		try {
			de.hhn.se.pmt.buildings.model.DAOFactory lDAOFactory = de.hhn.se.pmt.buildings.model.DAOFactory.getDAOFactory();
			de.hhn.se.pmt.buildings.model.dao.StandortDAO ldehhnsepmtbuildingsmodelStandortDAO = lDAOFactory.getStandortDAO();
			de.hhn.se.pmt.buildings.model.Standort ldehhnsepmtbuildingsmodelStandort = ldehhnsepmtbuildingsmodelStandortDAO.loadStandortByQuery(null, null);
			// Delete the persistent object
			ldehhnsepmtbuildingsmodelStandortDAO.delete(ldehhnsepmtbuildingsmodelStandort);
			de.hhn.se.pmt.buildings.model.dao.BewertungDAO ldehhnsepmtbuildingsmodelBewertungDAO = lDAOFactory.getBewertungDAO();
			de.hhn.se.pmt.buildings.model.Bewertung ldehhnsepmtbuildingsmodelBewertung = ldehhnsepmtbuildingsmodelBewertungDAO.loadBewertungByQuery(null, null);
			// Delete the persistent object
			ldehhnsepmtbuildingsmodelBewertungDAO.delete(ldehhnsepmtbuildingsmodelBewertung);
			de.hhn.se.pmt.buildings.model.dao.BuGaBesucherDAO ldehhnsepmtbuildingsmodelBuGaBesucherDAO = lDAOFactory.getBuGaBesucherDAO();
			de.hhn.se.pmt.buildings.model.BuGaBesucher ldehhnsepmtbuildingsmodelBuGaBesucher = ldehhnsepmtbuildingsmodelBuGaBesucherDAO.loadBuGaBesucherByQuery(null, null);
			// Delete the persistent object
			ldehhnsepmtbuildingsmodelBuGaBesucherDAO.delete(ldehhnsepmtbuildingsmodelBuGaBesucher);
			de.hhn.se.pmt.buildings.model.dao.ArchitektDAO ldehhnsepmtbuildingsmodelArchitektDAO = lDAOFactory.getArchitektDAO();
			de.hhn.se.pmt.buildings.model.Architekt ldehhnsepmtbuildingsmodelArchitekt = ldehhnsepmtbuildingsmodelArchitektDAO.loadArchitektByQuery(null, null);
			// Delete the persistent object
			ldehhnsepmtbuildingsmodelArchitektDAO.delete(ldehhnsepmtbuildingsmodelArchitekt);
			de.hhn.se.pmt.buildings.model.dao.GebäudeDAO ldehhnsepmtbuildingsmodelGebäudeDAO = lDAOFactory.getGebäudeDAO();
			de.hhn.se.pmt.buildings.model.Gebäude ldehhnsepmtbuildingsmodelGebäude = ldehhnsepmtbuildingsmodelGebäudeDAO.loadGebäudeByQuery(null, null);
			// Delete the persistent object
			ldehhnsepmtbuildingsmodelGebäudeDAO.delete(ldehhnsepmtbuildingsmodelGebäude);
			de.hhn.se.pmt.buildings.model.dao.MerklisteDAO ldehhnsepmtbuildingsmodelMerklisteDAO = lDAOFactory.getMerklisteDAO();
			de.hhn.se.pmt.buildings.model.Merkliste ldehhnsepmtbuildingsmodelMerkliste = ldehhnsepmtbuildingsmodelMerklisteDAO.loadMerklisteByQuery(null, null);
			// Delete the persistent object
			ldehhnsepmtbuildingsmodelMerklisteDAO.delete(ldehhnsepmtbuildingsmodelMerkliste);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteBuGabuildingsguideData deleteBuGabuildingsguideData = new DeleteBuGabuildingsguideData();
			try {
				deleteBuGabuildingsguideData.deleteTestData();
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
