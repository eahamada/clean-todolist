package todolist.domain.entities;

import javax.persistence.Entity;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
@Entity
public class Tache {
	private long id;
	private Utilisateur createur;
	private Utilisateur assigne;
	private String titre;
	private String description;
	private Statut statut;
	public Tache() {
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Utilisateur getCreateur() {
		return createur;
	}

	public void setCreateur(Utilisateur createur) {
		this.createur = createur;
	}

	public Utilisateur getAssigne() {
		return assigne;
	}

	public void setAssigne(Utilisateur assigne) {
		this.assigne = assigne;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Statut getStatut() {
		return statut;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}

	private Tache(Builder builder) {
	  this.createur = builder.createur;
	  this.assigne = builder.assigne;
	  this.titre = builder.titre;
	  this.description = builder.description;
	  this.statut = builder.statut;
	}
	public static class Builder{

		private Utilisateur createur;
		private Utilisateur assigne;
		private String titre;
		private String description;
		private Statut statut;
		public Builder withCreateur(Utilisateur createur) {
		  this.createur = createur;
		  return this;
		}
		public Builder withAssigne(Utilisateur assigne) {
		  this.assigne = assigne;
		  return this;
		}
		public Builder withTitre(String titre) {
		  this.titre = titre;
		  return this;
		}
		public Builder withDescription(String description) {
		  this.description = description;
		  return this;
		}
		public Builder withStatut(Statut statut) {
		  this.statut = statut;
		  return this;
		}
		public Tache build() {
		  validate();
		  return new Tache(this);
		}
		private void validate() {
		  Preconditions.checkNotNull(createur, "createur may not be null");
		  Preconditions.checkArgument(!Strings.isNullOrEmpty(titre), "titre may not be blank");
		  Preconditions.checkArgument(!Strings.isNullOrEmpty(description), "description may not be blank");
		  Preconditions.checkNotNull(statut, "statut may not be null");
		}
	}
	public static Builder builder(){
		return new Builder();
	}

}
