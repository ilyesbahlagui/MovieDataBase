import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.result.NoMoreReturnsException;
@Entity
@Table(name = "pays")
public class Pays {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_pays;
	@Column(name = "nom", length = 70, nullable = false)
	private String nom;
	
	@Column(name = "url", length = 70, nullable = false)
	private String url;

	@OneToMany(mappedBy = "pays")
	private Set<Film> film=new HashSet<Film>();
	
	@OneToMany(mappedBy = "pays")
	private Set<Lieu> lieu=new HashSet<Lieu>();
	
	
	public Pays() {
		// TODO Auto-generated constructor stub
	}
	public Pays(String nom) {
		// TODO Auto-generated constructor stub
		this.nom=nom;
	}

	public int getId() {
		return id_pays;
	}


	public void setId(int id) {
		this.id_pays = id;
	}


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


	public Set<Film> getFilm() {
		return film;
	}


	public void setFilm(Set<Film> film) {
		this.film = film;
	}


	public Set<Lieu> getLieu() {
		return lieu;
	}


	public void setLieu(Set<Lieu> lieu) {
		this.lieu = lieu;
	}

}
