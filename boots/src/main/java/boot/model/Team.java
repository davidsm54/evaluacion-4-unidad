package boot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "teams")
public class Team implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(length=50)
	private String name;
	
	@Column(length = 50)
	private String country; 
	
	@Column(length = 50)
	private String ligue;

	public Team(String name, String country, String ligue) {
		super();
		this.name = name;
		this.country = country;
		this.ligue = ligue;
	}

	public Team() {
		this("", "", "");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLigue() {
		return ligue;
	}

	public void setLigue(String ligue) {
		this.ligue = ligue;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", country=" + country + ", ligue=" + ligue + "]";
	}
	
		
}
