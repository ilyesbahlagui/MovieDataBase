import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "film")

public class Film {

	@Override
	public String toString() {
		return "Film [idFilm=" + idFilm +", nom=" + nom + ", url=" + url + ", plot=" + plot
				+ ", langue=" + langue + ", annee=" + annee + ", lieuTournage=" + lieuTournage + ", pays=" + pays
				+ ", role=" + role + ", realisateur=" + realisateur + ", genre=" + genre + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_film")
	private int idFilm;


	@Column(name = "nom", length = 50, nullable = false)
	private String nom;

	@Column(name = "url", length = 150, nullable = false)
	private String url;

	@Column(name = "plot", length = 150, nullable = false)
	private String plot;

	@Column(name = "langue", length = 50, nullable = false)
	private String langue;
	@Column(name = "annee", length = 50, nullable = false)
	private int annee;

	@ManyToOne
	@JoinColumn(name = "id_lieu")
	private Lieu lieuTournage;
	
	@ManyToOne
	@JoinColumn(name = "id_pays")
	private Pays pays;
	
	@OneToMany(mappedBy = "film")
	private Set<Role> role=new HashSet<Role>();

	
	@ManyToMany
	@JoinTable(name = "Realisateur_Film", joinColumns = @JoinColumn(name = "id_film", referencedColumnName = "id_film"), 
	inverseJoinColumns = @JoinColumn(name = "id_realisateur", referencedColumnName = "id_realisateur"))
	private Set<Realisateur> realisateur= new HashSet<Realisateur>();
	
	@ManyToMany
	@JoinTable(name = "Genre_Film", joinColumns = @JoinColumn(name = "id_film", referencedColumnName = "id_film"), 
	inverseJoinColumns = @JoinColumn(name = "id_genre", referencedColumnName = "id_genre"))
	private Set<Genre> genre= new HashSet<Genre>();
	
	public Film() {
		// TODO Auto-generated constructor stub
	}
//
//	public int getId() {
//		return idFilm;
//	}
//
//	public void setId(int id) {
//		this.idFilm = id;
//	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public Lieu getLieuTournage() {
		return lieuTournage;
	}

	public void setLieuTournage(Lieu lieuTournage) {
		this.lieuTournage = lieuTournage;
	}

	public Pays getPays() {
		return pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}

	public Set<Role> getRole() {
		return role;
	}

	public void setRole(Set<Role> role) {
		this.role = role;
	}

	public Set<Realisateur> getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(Set<Realisateur> realisateur) {
		this.realisateur = realisateur;
	}

	public Set<Genre> getGenre() {
		return genre;
	}

	public void setGenre(Set<Genre> genre) {
		this.genre = genre;
	}

}
