

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "role")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nom", length = 70, nullable = false)
	private String nom;
	
	

	@ManyToOne
	@JoinColumn(name = "id_acteur")
	private Acteur acteur;
	
	@ManyToOne
	@JoinColumn(name = "id_film")
	private Film film;
	
	
	public Role() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public Acteur getActeur() {
		return acteur;
	}


	public void setActeur(Acteur acteur) {
		this.acteur = acteur;
	}


	public Film getFilm() {
		return film;
	}


	public void setFilm(Film film) {
		this.film = film;
	}

}
