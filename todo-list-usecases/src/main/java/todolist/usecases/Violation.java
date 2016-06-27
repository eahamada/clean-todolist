package fr.rsi.todolist.usecases;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

public class Violation {
	public final String message;

	private Violation(Builder builder) {
	  this.message = builder.message;
	}

	public static class Builder{

		private String message;

		public Builder withMessage(String message) {
		  this.message = message;
		  return this;
		}

		public Violation build() {
		  validate();
		  return new Violation(this);
		}

		private void validate() {
		  Preconditions.checkArgument(!Strings.isNullOrEmpty(message), "message may not be blank");
		}
	}
	
}
