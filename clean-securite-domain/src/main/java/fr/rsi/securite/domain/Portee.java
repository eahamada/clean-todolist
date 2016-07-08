package fr.rsi.securite.domain;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

public class Portee {
	/*
	 * [{code=081, code-rsi=099, cn=si081, __DN__=cn=si081,ou=Sites,o=canam}]
	 */
	public final String code;
	public final String codeRsi;
	public final String dn;
	public final String cn;
	public final String libelleCaisse;

	private Portee(Builder builder) {
		this.code = builder.code;
		this.codeRsi = builder.codeRsi;
		this.dn = builder.dn;
		this.libelleCaisse = builder.libelleCaisse;

		this.cn = builder.cn;
	}

	public static class Builder {

		private String code;
		private String codeRsi;
		private String dn;
		private String libelleCaisse;
		private String cn;

		public Builder withCode(String code) {
			this.code = code;
			return this;
		}

		public Builder withCodeRsi(String codeRsi) {
			this.codeRsi = codeRsi;
			return this;
		}

		public Builder withDn(String dn) {
			this.dn = dn;
			return this;
		}

		public Builder withLibelleCaisse(String libelleCaisse) {
			this.libelleCaisse = libelleCaisse;
			return this;
		}

		public Builder withCn(String cn) {
			this.cn = cn;
			return this;
		}

		public Portee build() {
			Portee portee = new Portee(this);
			validate(portee);
			return portee;
		}

		private void validate(Portee portee) {
		}
	}

	public static Builder builder() {
		return new Builder();
	}
}
