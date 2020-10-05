package pjt.entité;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import java.io.Serializable;

import javax.persistence.Entity;


@SuppressWarnings("serial")
@Entity
public class Employe implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	private String firstName;
	private String lastName;
	private String emailId;
	@ManyToOne
	@JoinColumn(name="id_Equipe")
	private Equipe equipe;
	public Employe(String firstName, String lastName, String emailId) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;

	}
	//ajoutée
	public Employe(Long id, String firstName, String lastName, String emailId, Equipe equipe) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.equipe = equipe;
	}
	public Equipe getEquipe() {
		return equipe;
	}
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	
}


