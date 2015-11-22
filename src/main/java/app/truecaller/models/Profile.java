package app.truecaller.models;

/**
 * Class model hold profile of users
 * 
 * @author Ogarkov.Sergey
 *
 */
public class Profile {

	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Profile [id=" + id + ", name=" + name + "]";
	}
}
