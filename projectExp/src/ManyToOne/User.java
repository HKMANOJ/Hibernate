package ManyToOne;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String UrName;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private AirtelSim sim;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUrName() {
		return UrName;
	}

	public void setUrName(String urName) {
		UrName = urName;
	}

	public AirtelSim getSim() {
		return sim;
	}

	public void setSim(AirtelSim sim) {
		this.sim = sim;
	}
	

	

}
