package todolist.domain.repositories;

import fr.rsi.todos.domain.entities.Statut;
import fr.rsi.todos.domain.entities.Tache;
import fr.rsi.todos.domain.entities.Utilisateur;

public interface Taches extends CrudRepository<Tache, Long>{
	Iterable<Tache> findTachesByStatut(Statut statut);
	Iterable<Tache> findTachesByAssigne(Utilisateur assigne);
	Iterable<Tache> findTachesByCreateur(Utilisateur createur);
	Iterable<Tache> findTachesByTitreOrDescription(String texte);
}
