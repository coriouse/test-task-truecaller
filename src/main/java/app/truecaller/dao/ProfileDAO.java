package app.truecaller.dao;

import java.util.List;

import app.truecaller.models.Profile;

/**
 * Class DAO for profile entiry
 * 
 * @author Ogarkov.Sergey
 *
 */
public interface ProfileDAO {
	/**
	 * Method return all record Profile
	 * 
	 * @return list of profiles
	 */
	public List<Profile> findAll();

}
