
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.JoinColumn;

@Entity
@Table(name = "realisateur")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Realisateur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_realisateur;

	@Column(name = "identite", length = 70, nullable = false)
	private String identite;

	@Column(name = "url", length = 150, nullable = false)
	private String url;

	@ManyToMany
	@JoinTable(name = "Realisateur_Film", joinColumns = @JoinColumn(name = "id_realisateur", referencedColumnName = "id_realisateur"), 
	inverseJoinColumns = @JoinColumn(name = "id_film", referencedColumnName = "id_film"))
	private Set<Film> film= new HashSet<Film>();

	public Realisateur() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id_realisateur;
	}

	public void setId(int id) {
		this.id_realisateur = id;
	}

	public String getIdentite() {
		return identite;
	}

	public void setIdentite(String identite) {
		this.identite = identite;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Set<Film> getFilm() {
		return film;
	}

	public void setFilm(Set<Film> film) {
		this.film = film;
	}

}
