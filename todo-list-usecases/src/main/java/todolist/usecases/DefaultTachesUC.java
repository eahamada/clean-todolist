package fr.rsi.todolist.usecases;

import java.util.Collections;

import javax.inject.Inject;

import fr.rsi.todos.domain.entities.Statut;
import fr.rsi.todos.domain.entities.Tache;
import fr.rsi.todos.domain.entities.Utilisateur;
import fr.rsi.todos.domain.repositories.Taches;
import fr.rsi.todos.domain.repositories.Utilisateurs;

public class DefaultTachesUC implements TachesUC{
	@Inject
	Taches tachesRepository;
	@Inject
	Utilisateurs utilisateursRepository;
	
	@Override
	public CreerTacheResponse creerTache(CreerTacheRequest creerTacheRequest) {
		Validator validator = Validation
				.buildDefaultValidatorFactory().getValidator();

		Set<ConstraintViolation<Utilisateur>> violations = validator
				.validate(user);

		Utilisateur createur = utilisateursRepository.findOne(creerTacheRequest.createurId);
		Tache save = tachesRepository.save(Tache.builder().withCreateur(createur).withTitre(creerTacheRequest.titre).withDescription(creerTacheRequest.description).withStatut(Statut.CREEE).build());
		CreerTacheResponse reponse = CreerTacheResponse.builder().withResult(save).withViolations(Collections.emptyList()).build();
		return null;
	}

	@Override
	public ModifierTacheResponse modifierTache(ModifierTacheRequest modifierTacheRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListerTachesResponse listerTaches(ListerTachesRequest listerTachesRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SupprimerTacheResponse supprimerTache(SupprimerTacheRequest creerTacheRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AssignerTacheResponse assignerTache(AssignerTacheRequest creerTacheRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}
