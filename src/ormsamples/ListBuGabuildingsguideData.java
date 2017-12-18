/**
 * Licensee: Yannick Pauler(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListBuGabuildingsguideData {
	private static final int ROW_COUNT = 100;
	
public void listTestData() throws PersistentException {
		de.hhn.se.pmt.buildings.model.DAOFactory lDAOFactory = de.hhn.se.pmt.buildings.model.DAOFactory.getDAOFactory();
		System.out.println("Listing Standort...");
		de.hhn.se.pmt.buildings.model.Standort[] dehhnsepmtbuildingsmodelStandorts = lDAOFactory.getStandortDAO().listStandortByQuery(null, null);
		int length = Math.min(dehhnsepmtbuildingsmodelStandorts.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnsepmtbuildingsmodelStandorts[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Bewertung...");
		de.hhn.se.pmt.buildings.model.Bewertung[] dehhnsepmtbuildingsmodelBewertungs = lDAOFactory.getBewertungDAO().listBewertungByQuery(null, null);
		length = Math.min(dehhnsepmtbuildingsmodelBewertungs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnsepmtbuildingsmodelBewertungs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing BuGaBesucher...");
		de.hhn.se.pmt.buildings.model.BuGaBesucher[] dehhnsepmtbuildingsmodelBuGaBesuchers = lDAOFactory.getBuGaBesucherDAO().listBuGaBesucherByQuery(null, null);
		length = Math.min(dehhnsepmtbuildingsmodelBuGaBesuchers.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnsepmtbuildingsmodelBuGaBesuchers[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Architekt...");
		de.hhn.se.pmt.buildings.model.Architekt[] dehhnsepmtbuildingsmodelArchitekts = lDAOFactory.getArchitektDAO().listArchitektByQuery(null, null);
		length = Math.min(dehhnsepmtbuildingsmodelArchitekts.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnsepmtbuildingsmodelArchitekts[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Gebäude...");
		de.hhn.se.pmt.buildings.model.Gebäude[] dehhnsepmtbuildingsmodelGebäudes = lDAOFactory.getGebäudeDAO().listGebäudeByQuery(null, null);
		length = Math.min(dehhnsepmtbuildingsmodelGebäudes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnsepmtbuildingsmodelGebäudes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Merkliste...");
		de.hhn.se.pmt.buildings.model.Merkliste[] dehhnsepmtbuildingsmodelMerklistes = lDAOFactory.getMerklisteDAO().listMerklisteByQuery(null, null);
		length = Math.min(dehhnsepmtbuildingsmodelMerklistes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnsepmtbuildingsmodelMerklistes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public static void main(String[] args) {
		try {
			ListBuGabuildingsguideData listBuGabuildingsguideData = new ListBuGabuildingsguideData();
			try {
				listBuGabuildingsguideData.listTestData();
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
