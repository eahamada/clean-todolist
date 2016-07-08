package fr.rsi.securite.domain;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

public class Utilisateur {

	public final String smUser;
	public final String userId;
	public final String userDn;
	public final String userCmr;
	public final String nom;
	public final String prenom;
	public final String mail;
	public final String civilite;

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()).append(": ");
		sb.append("smUser: ").append(this.smUser).append("; ");
		sb.append("userId: ").append(this.userId).append("; ");
		sb.append("userDn: ").append(this.userDn).append("; ");
		sb.append("userCmr: ").append(this.userCmr).append("; ");
		sb.append("nom: ").append(this.nom).append("; ");
		sb.append("prenom: ").append(this.prenom).append("; ");
		sb.append("email: ").append(this.mail).append("; ");
		sb.append("civilite: ").append(this.civilite).append("; ");
		return sb.toString();
	}

	private Utilisateur(Builder builder) {
		this.smUser = builder.smUser;
		this.userId = builder.userId;
		this.userDn = builder.userDn;
		this.userCmr = builder.userCmr;

		this.nom = builder.nom;
		this.prenom = builder.prenom;
		this.mail = builder.mail;
		this.civilite = builder.civilite;

	}

	public static class Builder {
		private String smUser;
		private String userId;
		private String userDn;
		private String userCmr;
		private String nom;
		private String prenom;
		private String mail;
		private String civilite;

		public Builder withSmUser(String smUser) {
			this.smUser = smUser;
			return this;
		}

		public Builder withUserId(String userId) {
			this.userId = userId;
			return this;
		}

		public Builder withUserDn(String userDn) {
			this.userDn = userDn;
			return this;
		}

		public Builder withUserCmr(String userCmr) {
			this.userCmr = userCmr;
			return this;
		}

		public Builder withNom(String nom) {
			this.nom = nom;
			return this;
		}

		public Builder withPrenom(String prenom) {
			this.prenom = prenom;
			return this;
		}

		public Builder withMail(String mail) {
			this.mail = mail;
			return this;
		}

		public Builder withCivilite(String civilite) {
			this.civilite = civilite;
			return this;
		}

		public Utilisateur build() {
			Utilisateur utilisateur = new Utilisateur(this);
			validate(utilisateur);
			return utilisateur;
		}

		private void validate(Utilisateur utilisateur) {
		}
	}
};