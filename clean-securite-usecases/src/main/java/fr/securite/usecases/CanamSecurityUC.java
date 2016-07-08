package fr.securite.usecases;

import fr.rsi.securite.domain.Role;

public interface CanamSecurityUC {
	Iterable<Role> getRolesByUidAndAppli(String userDn, String applicationDn);
}
