package dto;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PaysDto {
	private int id_pays;
	private String nom;

	private String url;

	private Set<FilmDto> film = new HashSet<FilmDto>();

	private Set<LieuDto> lieu = new HashSet<LieuDto>();

	public PaysDto() {
		// TODO Auto-generated constructor stub
	}

	public PaysDto(String nom) {
		// TODO Auto-generated constructor stub
		this.nom = nom;
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

	public Set<FilmDto> getFilm() {
		return film;
	}

	public void setFilm(Set<FilmDto> film) {
		this.film = film;
	}

	public Set<LieuDto> getLieu() {
		return lieu;
	}

	public void setLieu(Set<LieuDto> lieu) {
		this.lieu = lieu;
	}

	@Override
	public String toString() {
		return "PaysDto [id_pays=" + id_pays + ", nom=" + nom + ", url=" + url + ", film=" + film + ", lieu=" + lieu
				+ "]";
	}
	

}
