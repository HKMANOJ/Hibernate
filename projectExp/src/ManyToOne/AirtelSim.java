package ManyToOne;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AirtelSim {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int SimId;
	private String simtype;
	
	
	public int getSimId() {
		return SimId;
	}
	public void setSimId(int simId) {
		SimId = simId;
	}
	public String getSimtype() {
		return simtype;
	}
	public void setSimtype(String simtype) {
		this.simtype = simtype;
	}
	

}
