package dto;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ActeurDto {

	
	private String identite;
	
	private String url;
	
@JsonProperty("height")
	private String hauteur;
	
	private Date dateNaissance;
	
	private LieuDto lieuNaissance;
	
	private Set<RoleDto> role = new HashSet<RoleDto>();

	
	public ActeurDto() {
		// TODO Auto-generated constructor stub
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


	public String getHauteur() {
		return hauteur;
	}


	public void setHauteur(String hauteur) {
		this.hauteur = hauteur;
	}


	public Date getDateNaissance() {
		return dateNaissance;
	}


	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}


	public LieuDto getLieuNaissance() {
		return lieuNaissance;
	}


	public void setLieuNaissance(LieuDto lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}


	public Set<RoleDto> getRole() {
		return role;
	}


	public void setRole(Set<RoleDto> role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "ActeurDto [id_acteur= identite=" + identite + ", url=" + url + ", hauteur=" + hauteur
				+ ", dateNaissance=" + dateNaissance + ", lieuNaissance=" + lieuNaissance + ", role=" + role + "]";
	}

}
