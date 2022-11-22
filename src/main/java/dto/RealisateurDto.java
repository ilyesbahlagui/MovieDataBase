package dto;

import java.util.HashSet;
import java.util.Set;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class RealisateurDto {
	private int id_realisateur;

	private String identite;

	private String url;

	private Set<FilmDto> film= new HashSet<FilmDto>();

	public RealisateurDto() {
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

	public Set<FilmDto> getFilm() {
		return film;
	}

	public void setFilm(Set<FilmDto> film) {
		this.film = film;
	}

	@Override
	public String toString() {
		return "RealisateurDto [id_realisateur=" + id_realisateur + ", identite=" + identite + ", url=" + url
				+ ", film=" + film + "]";
	}

}
