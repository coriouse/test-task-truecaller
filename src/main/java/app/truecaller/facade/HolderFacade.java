package app.truecaller.facade;

import java.util.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.truecaller.models.History;
import app.truecaller.models.Profile;
import app.truecaller.services.HolderHistory;
import app.truecaller.services.HolderProfile;

/**
 * Class facade
 * 
 * @author Ogarkov.Sergey
 *
 */
@Service
public class HolderFacade {

	@Autowired
	private HolderProfile holderProfile;

	@Autowired
	private HolderHistory holderHistory;

	public Profile getProfile(Integer guest, Integer id) {
		holderHistory.addGuest(guest, id);
		return holderProfile.getProfile(id);
	}

	public Queue<History> getHistory(Integer id) {
		return holderHistory.getHistory(id);
	}

	public Long getCountHistory() {
		return holderHistory.getCountHistory();
	}
}
