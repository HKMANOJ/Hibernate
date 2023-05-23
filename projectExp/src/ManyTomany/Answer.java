package ManyTomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ansID;
	
	private String ans;
	
	

	public int getAnsID() {
		return ansID;
	}

	public void setAnsID(int ansID) {
		this.ansID = ansID;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	
	

}
