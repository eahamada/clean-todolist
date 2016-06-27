package todolist.domain.entities;


import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
public class Utilisateur {
	private long id;
	private String nom;
	private String prenom;
	public Utilisateur() {
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	private Utilisateur(Builder builder) {
	  this.nom = builder.nom;
	  this.prenom = builder.prenom;
	}
	public static class Builder{

		private String nom;
		private String prenom;
		public Builder withNom(String nom) {
		  this.nom = nom;
		  return this;
		}
		public Builder withPrenom(String prenom) {
		  this.prenom = prenom;
		  return this;
		}
		public Utilisateur build() {
		  validate();
		  return new Utilisateur(this);
		}
		private void validate() {
		  Preconditions.checkArgument(!Strings.isNullOrEmpty(nom), "nom may not be blank");
		  Preconditions.checkArgument(!Strings.isNullOrEmpty(prenom), "prenom may not be blank");
		}
	}
	public static Builder builder(){
		return new Builder();
	}
}
