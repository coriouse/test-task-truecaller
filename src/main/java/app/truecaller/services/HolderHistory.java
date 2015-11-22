package app.truecaller.services;

import java.util.Date;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.truecaller.dao.HistoryDAOImpl;
import app.truecaller.models.History;

/**
 * Class is component for holding history cache
 * 
 * @author Ogarkov.Sergey
 *
 */
@Service
public class HolderHistory {
	
	final static Logger logger = LoggerFactory.getLogger(HolderHistory.class);

	@Autowired
	private HandlerHistory handlerHistory;

	@Autowired
	private HistoryDAOImpl historyDAO;

	/*
	 * cache of history
	 */
	private static Map<Integer, Queue<History>> CACHE = new ConcurrentHashMap<Integer, Queue<History>>();

	public void init() {
		//TODO Load history to cache
	}

	/**
	 *
	 * Methos add new visit to cahce and sent to queue store
	 * 
	 * @param guest - is guest
	 * @param id - id profile
	 */
	public void addGuest(Integer guest, Integer id) {
		History visit = new History(guest, id, new Date());
		if (!CACHE.containsKey(id)) {
			Queue<History> history = new LinkedList<History>();
			history.add(visit);
			CACHE.put(id, history);
		} else {
			CACHE.get(id).add(visit);
			if (CACHE.get(id).size() == 11) {
				CACHE.get(id).poll();
			}
		}
		handlerHistory.addVisit(visit);
	}

	/**
	 * Method return 10 last visits
	 * 
	 * @param id - user
	 * @return last 10 visits like from cache
	 */
	public Queue<History> getHistory(Integer id) {
		return CACHE.get(id);
	}

	/**
	 * Save history to DB
	 * 
	 * @param history
	 */
	public void save(History history) {
		historyDAO.save(history);
	}

	/**
	 * Methos return all resord of the history from DB
	 * 
	 * @return count records
	 */
	public Long getCountHistory() {
		return historyDAO.count();
	}

}
