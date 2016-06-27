package fr.rsi.todolist.usecases;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

public class CreerTacheRequest {
	public final String titre;
	public final String description;
	public final long createurId;
	private CreerTacheRequest(Builder builder) {
	  this.titre = builder.titre;
	  this.description = builder.description;
	  this.createurId = builder.createurId;
	}
	public static class Builder{

		private String titre;
		private String description;
		private long createurId;
		public Builder withTitre(String titre) {
		  this.titre = titre;
		  return this;
		}
		public Builder withDescription(String description) {
		  this.description = description;
		  return this;
		}
		public Builder withCreateurId(long createurId) {
		  this.createurId = createurId;
		  return this;
		}
		public CreerTacheRequest build() {
		  validate();
		  return new CreerTacheRequest(this);
		}
		private void validate() {
		  Preconditions.checkArgument(!Strings.isNullOrEmpty(titre), "titre may not be blank");
		  Preconditions.checkArgument(!Strings.isNullOrEmpty(description), "description may not be blank");
		  Preconditions.checkArgument(createurId > 0L, "createurId should be set");
		}
	}
	public static Builder builder(){
		return new Builder();
	}
}
