package app.truecaller.dao;

import java.sql.Types;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

import app.truecaller.models.History;

/**
 * Class implementation of DAO history
 * 
 * @author Ogarkov.Sergey
 *
 */
public class HistoryDAOImpl implements HistoryDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Resource
	@Qualifier("query")
	private Map<String, String> query;

	public long count() {
		return jdbcTemplate.queryForObject(query.get("countHistory"),
				Long.class);
	}

	public void save(History history) {
		if (history != null) {
			Object[] params = new Object[] { history.getGuest(),
					history.getId(), history.getVisit() };
			int[] types = new int[] { Types.INTEGER, Types.INTEGER,
					Types.TIMESTAMP };
			jdbcTemplate.update(query.get("addVisitToHistory"), params, types);
		}
	}

}
