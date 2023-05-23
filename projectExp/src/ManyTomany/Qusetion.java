package ManyTomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Qusetion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int qusetionId;
	private String question;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Answer> ans;
	
	public List<Answer> getAns() {
		return ans;
	}
	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}
	public int getQusetionId() {
		return qusetionId;
	}
	public void setQusetionId(int qusetionId) {
		this.qusetionId = qusetionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	

}
