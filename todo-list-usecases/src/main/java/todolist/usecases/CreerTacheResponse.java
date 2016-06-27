package fr.rsi.todolist.usecases;

import fr.rsi.todos.domain.entities.Tache;

public class CreerTacheResponse {
	public final Iterable<Violation> violations;
	public final Tache result;

	private CreerTacheResponse(Builder builder) {
		this.violations = builder.violations;
		this.result = builder.result;
	}

	public static class Builder {

		private Iterable<Violation> violations;
		private Tache result;

		public Builder withViolations(Iterable<Violation> violations) {
			this.violations = violations;
			return this;
		}

		public Builder withResult(Tache result) {
			this.result = result;
			return this;
		}

		public CreerTacheResponse build() {
			validate();
			return new CreerTacheResponse(this);
		}

		private void validate() {
		}
	}

	public static Builder builder() {
		return new Builder();
	}
}
