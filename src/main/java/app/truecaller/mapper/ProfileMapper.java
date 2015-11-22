package app.truecaller.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import app.truecaller.models.Profile;
/**
 * Class uril RowMapper for Profile entity
 * 
 * @author Ogarkov.Sergey
 *
 */
public class ProfileMapper  implements RowMapper<Profile>{
	
	public Profile mapRow(ResultSet resultSet, int i) throws SQLException {
			Profile profile = new Profile();
			profile.setId(resultSet.getInt("id"));
			profile.setName(resultSet.getString("name"));
		return profile;
	}
}
