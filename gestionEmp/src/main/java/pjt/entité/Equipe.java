package pjt.entité;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@SuppressWarnings("serial")
@Entity
public class Equipe implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEquipe;
	private String NomEquipe;
	
	public Equipe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Equipe(Long idEquipe, String nomEquipe) {
		super();
		this.idEquipe = idEquipe;
		NomEquipe = nomEquipe;
	}
	public Long getIdEquipe() {
		return idEquipe;
	}
	
	public void setIdEquipe(Long idEquipe) {
		this.idEquipe = idEquipe;
	}
	public String getNomEquipe() {
		return NomEquipe;
	}
	public void setNomEquipe(String nomEquipe) {
		NomEquipe = nomEquipe;
	}
	

}
