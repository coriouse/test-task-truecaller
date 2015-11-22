package app.truecaller.dao;

import app.truecaller.models.History;

/**
 * Class DAO for history entity
 * 
 * @author Ogarkov.Sergey
 *
 */
public interface HistoryDAO {

	/**
	 * Method return count of all record history
	 * 
	 * @return count of history
	 */
	public long count();

	/**
	 * Method save record to history table
	 * 
	 * @param history
	 */
	public void save(History history);

}
