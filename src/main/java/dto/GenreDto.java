package dto;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GenreDto {
	

	private String nom;
	


	public GenreDto() {
		// TODO Auto-generated constructor stub
	}
	public GenreDto(String nom) {
		// TODO Auto-generated constructor stub
		this.nom=nom;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}



}
