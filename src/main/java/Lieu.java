import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "lieu")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Lieu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_lieu;
	@Column(name = "region", length = 70, nullable = false)
	private String region;
	@Column(name = "ville", length = 70, nullable = false)
	private String ville;

	@OneToMany(mappedBy = "lieuTournage")
	private Set<Film> film=new HashSet<Film>();
	
	@ManyToOne
	@JoinColumn(name = "id_pays")
	private Pays pays;

	@OneToMany(mappedBy = "lieuNaissance")
	private Set<Acteur> acteur=new HashSet<Acteur>();
	
	
	
	public Lieu() {
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id_lieu;
	}



	public void setId(int id) {
		this.id_lieu = id;
	}



	public String getRegion() {
		return region;
	}



	public void setRegion(String region) {
		this.region = region;
	}



	public String getVille() {
		return ville;
	}



	public void setVille(String ville) {
		this.ville = ville;
	}



	public Set<Film> getFilm() {
		return film;
	}



	public void setFilm(Set<Film> film) {
		this.film = film;
	}



	public Pays getPays() {
		return pays;
	}



	public void setPays(Pays pays) {
		this.pays = pays;
	}



	public Set<Acteur> getActeur() {
		return acteur;
	}



	public void setActeur(Set<Acteur> acteur) {
		this.acteur = acteur;
	}

}
