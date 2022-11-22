package dto;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class FilmDto {




	@JsonProperty("id")
	private String idFilm;
	
	
	private String nom;


	private String url;


	private String plot;

	private String langue;

	private int annee;


	private LieuDto lieuTournage;
	

	private PaysDto pays;
	
	@JsonProperty("roles")
	private Set<RoleDto> roles=new HashSet<RoleDto>();

	
	@JsonProperty("realisateurs")
	private Set<RealisateurDto> realisateur= new HashSet<RealisateurDto>();

	@JsonProperty("roles")
	private Set<GenreDto> genre= new HashSet<GenreDto>();
	
	@JsonProperty("castingPrincipal")
	private Set<ActeurDto> acteur= new HashSet<ActeurDto>();
	
	
	public FilmDto() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return idFilm;
	}

	public void setId(String id) {
		this.idFilm = id;
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

	public LieuDto getLieuTournage() {
		return lieuTournage;
	}

	public void setLieuTournage(LieuDto lieuTournage) {
		this.lieuTournage = lieuTournage;
	}

	public PaysDto getPays() {
		return pays;
	}

	public void setPays(PaysDto pays) {
		this.pays = pays;
	}

	public Set<RoleDto> getRole() {
		return roles;
	}

	public void setRole(Set<RoleDto> role) {
		this.roles = role;
	}

	public Set<RealisateurDto> getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(Set<RealisateurDto> realisateur) {
		this.realisateur = realisateur;
	}

	public Set<GenreDto> getGenre() {
		return genre;
	}

	public void setGenre(Set<GenreDto> genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "FilmDto [idFilm=" + idFilm + ", nom=" + nom + ", url=" + url + ", plot=" + plot + ", langue=" + langue
				+ ", annee=" + annee + ", lieuTournage=" + lieuTournage + ", pays=" + pays + ", roles=" + roles
				+ ", realisateur=" + realisateur + ", genre=" + genre + ", acteur=" + acteur + ", getId()=" + getId()
				+ ", getNom()=" + getNom() + ", getUrl()=" + getUrl() + ", getPlot()=" + getPlot() + ", getLangue()="
				+ getLangue() + ", getAnnee()=" + getAnnee() + ", getLieuTournage()=" + getLieuTournage()
				+ ", getPays()=" + getPays() + ", getRole()=" + getRole() + ", getRealisateur()=" + getRealisateur()
				+ ", getGenre()=" + getGenre() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}



}
