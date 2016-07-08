package fr.securite.usecases;

import javax.inject.Inject;

import fr.rsi.securite.domain.Role;
import fr.rsi.securite.domain.Roles;
import fr.rsi.securite.domain.Utilisateur;
import fr.rsi.securite.domain.Utilisateurs;

public class GetObject implements GetObjectUC {
	@Inject
	private Utilisateurs utilisateurs;

	@Override
	public Iterable<Utilisateur> getUtilisateursByUserId(String userId) {
		return utilisateurs.getUtilisateursByUserId(userId);
	}
	
}
