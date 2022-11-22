package dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RoleDto {
	
	@JsonProperty("characterName")
	private String nom;
	
	private ActeurDto acteur;
	
	
	
	
	public RoleDto() {
		// TODO Auto-generated constructor stub
	}



	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public ActeurDto getActeur() {
		return acteur;
	}


	public void setActeur(ActeurDto acteur) {
		this.acteur = acteur;
	}




	@Override
	public String toString() {
		return "RoleDto, nom=" + nom + ", acteur=" + acteur + "]";
	}

}
