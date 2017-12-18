/**
 * Licensee: Yannick Pauler(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateBuGabuildingsguideDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(de.hhn.se.pmt.buildings.model.BuGabuildingsguidePersistentManager.instance());
			de.hhn.se.pmt.buildings.model.BuGabuildingsguidePersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
