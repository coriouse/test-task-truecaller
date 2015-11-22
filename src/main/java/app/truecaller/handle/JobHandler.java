package app.truecaller.handle;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;*/

/**
 * Class handle of the jobs
 * 
 * @author Ogarkov.Sergey
 *
 */
public class JobHandler {
	final static Logger logger = LoggerFactory.getLogger(JobHandler.class);

	/*@Autowired
	private JobLauncher jobLauncher;

	public void run() {
		try {
			String dateParam = new Date().toString();
			JobParameters param = new JobParametersBuilder().addString("date",
					dateParam).toJobParameters();
			jobLauncher.run(new HistoryCleaner(), param);
		} catch (Exception e) {

		}
	}*/
}
