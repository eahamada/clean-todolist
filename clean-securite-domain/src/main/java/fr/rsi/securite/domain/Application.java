package fr.rsi.securite.domain;

public class Application {
	public final String description;
	public final String ou;
	public final String url;
	public final String dn;
	public final String icon;

	private Application(Builder builder) {
		this.description = builder.description;
		this.ou = builder.ou;
		this.url = builder.url;
		this.dn = builder.dn;
		this.icon = builder.icon;
	}

	public static class Builder {

		private String description;
		private String ou;
		private String url;
		private String dn;
		private String icon;

		public Builder withDescription(String description) {
			this.description = description;
			return this;
		}

		public Builder withOu(String ou) {
			this.ou = ou;
			return this;
		}

		public Builder withUrl(String url) {
			this.url = url;
			return this;
		}

		public Builder withDn(String dn) {
			this.dn = dn;
			return this;
		}

		public Builder withIcon(String icon) {
			this.icon = icon;
			return this;
		}

		public Application build() {
			Application application = new Application(this);
			validate(application);
			return application;
		}

		private void validate(Application application) {

		}
	}

	public static Builder builder() {
		return new Builder();
	}
}
