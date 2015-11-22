package app.truecaller.handle;

import java.util.Queue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import app.truecaller.models.History;
import app.truecaller.services.HandlerHistory;
import app.truecaller.services.HolderHistory;

/**
 * Class implementation of DB sending History
 * 
 * @author Ogarkov.Sergey
 *
 */
@Component("DB")
public class DbHandler implements Handler {

	final static Logger logger = LoggerFactory.getLogger(DbHandler.class);

	@Value("${handlerThreads}")
	public Integer handlerThreads;

	@Autowired
	HolderHistory holderHistory;
	
	@Autowired
	HandlerHistory handlerHistory;

	public void handle() {
		ScheduledExecutorService executor = Executors
				.newScheduledThreadPool(handlerThreads);
		for (int i = 0; i < handlerThreads; i++) {
			executor.scheduleAtFixedRate(new Task(this.handlerHistory.getQueueHistories(), this.holderHistory),
					1, 1, TimeUnit.SECONDS);
		}
	}

	/**
	 * Class take history from queue and save to DB
	 * 
	 * @author Ogarkov.Sergey
	 *
	 */
	public class Task implements Runnable {
		Queue<History> history;
		HolderHistory holderHistory;
		public Task(Queue<History> history, HolderHistory holderHistory) {
			this.history = history;
			this.holderHistory = holderHistory;
		}
		//TODO use multi insert
		public void run() {
				while (!this.history.isEmpty()) {				
					this.holderHistory.save(this.history.poll());
			}

		}

	}

}
