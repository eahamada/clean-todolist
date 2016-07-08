package fr.securite.usecases;

import fr.rsi.securite.domain.Utilisateur;

public interface GetObjectUC {
	Iterable<Utilisateur> getUtilisateursByUserId(String userId);
}
