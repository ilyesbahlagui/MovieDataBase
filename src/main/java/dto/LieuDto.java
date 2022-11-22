package dto;
import java.util.HashSet;
import java.util.Set;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class LieuDto {
	
	@JsonProperty("etatDept")
	private String region;
	private String ville;

	private Set<FilmDto> film=new HashSet<FilmDto>();
	
	private PaysDto pays;

	private Set<ActeurDto> acteur=new HashSet<ActeurDto>();
	
	
	
	public LieuDto() {
		// TODO Auto-generated constructor stub
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



	public Set<FilmDto> getFilm() {
		return film;
	}



	public void setFilm(Set<FilmDto> film) {
		this.film = film;
	}



	public PaysDto getPays() {
		return pays;
	}



	public void setPays(PaysDto pays) {
		this.pays = pays;
	}



	public Set<ActeurDto> getActeur() {
		return acteur;
	}



	public void setActeur(Set<ActeurDto> acteur) {
		this.acteur = acteur;
	}



	@Override
	public String toString() {
		return "LieuDto  region=" + region + ", ville=" + ville + ", film=" + film + ", pays="
				+ pays + ", acteur=" + acteur + "]";
	}
	

}
