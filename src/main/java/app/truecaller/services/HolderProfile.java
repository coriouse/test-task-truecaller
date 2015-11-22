package app.truecaller.services;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.truecaller.dao.ProfileDAOImpl;
import app.truecaller.models.Profile;

/**
 * Class is component for holding profile cache
 * 
 * @author Ogarkov.Sergey
 *
 */
@Service
public class HolderProfile {
	
	final static Logger logger = LoggerFactory.getLogger(HolderProfile.class);

	public static Map<Integer, Profile> CACHE = new ConcurrentHashMap<Integer, Profile>();

	@Autowired
	ProfileDAOImpl profileDAOImpl;

	public void init() {
		load();
	}

	private void load() {
		for (Profile profile : profileDAOImpl.findAll()) {
			CACHE.put(profile.getId(), profile);
		}
	}

	public Profile getProfile(Integer id) {
		return CACHE.get(id);
	}
}
