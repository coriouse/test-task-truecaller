package app.truecaller.handle;

/**
 * Factory types stored variants or DB or REST or something else
 * 
 * @author Ogarkov.Sergey
 *
 */
public interface FactoryHandler {

	/**
	 * Method choose handle type store and accept history queue in case DB
	 * history will forward to database in case rest on any rest destination
	 * 
	 * @param typeStore
	 *            - type of store DB or REST
	 * 
	 * @return
	 */
	public Handler handler(String typeStore);
}
