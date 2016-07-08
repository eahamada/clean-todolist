package fr.rsi.securite.domain;

public interface Utilisateurs {
	Iterable<Utilisateur> getUtilisateursByUserId(String userId);
}
