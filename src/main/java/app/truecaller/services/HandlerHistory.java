package app.truecaller.services;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import app.truecaller.dao.HistoryDAOImpl;
import app.truecaller.handle.FactoryHandler;
import app.truecaller.models.History;

/**
 * Class handle history queue
 * 
 * @author Ogarkov.Sergey
 *
 */
@Service
public class HandlerHistory {
	
	final static Logger logger = LoggerFactory.getLogger(HandlerHistory.class);
	
	private static final Queue<History> HISTORY = new ConcurrentLinkedQueue<History>();

	@Autowired
	private HistoryDAOImpl historyDAO;	
	
	@Value("${typeStore}")
	private String typeStore;
	
	@Autowired
	private FactoryHandler factoryHandler;
	
	public void init() {
		factoryHandler.handler(typeStore).handle();
	}
	
	public void addVisit(History history) {
		HISTORY.add(history);
	}
	
	public Queue<History> getQueueHistories() {
		return HISTORY;
	}
}
