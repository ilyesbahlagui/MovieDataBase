import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name = "acteur")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Acteur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_acteur;
	
	@Column(name = "identite", length = 70, nullable = false)
	private String identite;
	
	@Column(name = "url", length = 150, nullable = false)
	private String url;
	
	@Column(name = "hauteur", length = 10, nullable = false)
	private String hauteur;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateNaissance", nullable = false)
	private Date dateNaissance;
	
	@ManyToOne
	@JoinColumn(name = "id_lieu")
	private Lieu lieuNaissance;
	
	@OneToMany(mappedBy = "acteur")
	private Set<Role> role=new HashSet<Role>();

	
	public Acteur() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id_acteur;
	}


	public void setId(int id) {
		this.id_acteur = id;
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


	public Lieu getLieuNaissance() {
		return lieuNaissance;
	}


	public void setLieuNaissance(Lieu lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}


	public Set<Role> getRole() {
		return role;
	}


	public void setRole(Set<Role> role) {
		this.role = role;
	}

}
