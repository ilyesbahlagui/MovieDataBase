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
import javax.persistence.Table;

@Entity
@Table(name = "genre")
public class Genre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_genre;

	@Column(name = "nom", length = 70, nullable = false)
	private String nom;
	
	@ManyToMany
	@JoinTable(name = "Genre_Film", joinColumns = @JoinColumn(name = "id_genre", referencedColumnName = "id_genre"), inverseJoinColumns = @JoinColumn(name = "id_film", referencedColumnName = "id_film"))
	private Set<Film> film = new HashSet<Film>();

	public Genre() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id_genre;
	}

	public void setId(int id) {
		this.id_genre = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Set<Film> getFilm() {
		return film;
	}

	public void setFilm(Set<Film> film) {
		this.film = film;
	}

}
