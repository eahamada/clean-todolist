package fr.rsi.todolist.usecases;

public interface TachesUC {
	public CreerTacheResponse creerTache(CreerTacheRequest creerTacheRequest );
	public ModifierTacheResponse modifierTache(ModifierTacheRequest modifierTacheRequest );
	public ListerTachesResponse listerTaches(ListerTachesRequest listerTachesRequest );
	public SupprimerTacheResponse supprimerTache(SupprimerTacheRequest creerTacheRequest );
	public AssignerTacheResponse assignerTache(AssignerTacheRequest creerTacheRequest );
}
