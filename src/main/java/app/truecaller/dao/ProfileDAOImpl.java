package app.truecaller.dao;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import app.truecaller.mapper.ProfileMapper;
import app.truecaller.models.Profile;

/**
 * Class implementation of profile history
 * 
 * @author Ogarkov.Sergey
 *
 */
public class ProfileDAOImpl implements ProfileDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Resource
	@Qualifier("query")
	private Map<String, String> query;

	public List<Profile> findAll() {
		return jdbcTemplate.query(query.get("profiles"), new ProfileMapper());
	}

}
