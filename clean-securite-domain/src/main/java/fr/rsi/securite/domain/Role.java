package fr.rsi.securite.domain;

import java.util.List;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

public class Role {
	public final String roleDn;
	public final String libelle;
	public final String roleCode;
	public final List<String> listeCmrCodes;
	public final List<Portee> portee;

	private Role(Builder builder) {
		this.portee = builder.portee;
		this.roleDn = builder.roleDn;
		this.libelle = builder.libelle;
		this.roleCode = builder.roleCode;
		this.listeCmrCodes = builder.listeCmrCodes;
	}

	public static class Builder {

		private List<Portee> portee;
		private String roleDn;
		private String libelle;
		private String roleCode;
		private List<String> listeCmrCodes;

		public Builder withPortee(List<Portee> portee) {
			this.portee = portee;
			return this;
		}

		public Builder withRoleDn(String roleDn) {
			this.roleDn = roleDn;
			return this;
		}

		public Builder withLibelle(String libelle) {
			this.libelle = libelle;
			return this;
		}

		public Builder withRoleCode(String roleCode) {
			this.roleCode = roleCode;
			return this;
		}

		public Builder withListeCmrCodes(List<String> listeCmrCodes) {
			this.listeCmrCodes = listeCmrCodes;
			return this;
		}

		public Role build() {
			Role role = new Role(this);
			validate(role);
			return role;
		}

		private void validate(Role role) {
		}
	}

	public static Builder builder() {
		return new Builder();
	}
}
