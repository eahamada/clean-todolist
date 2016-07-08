package fr.securite.usecases;

import javax.inject.Inject;

import fr.rsi.securite.domain.Role;
import fr.rsi.securite.domain.Roles;

public class CanamSecurity implements CanamSecurityUC {
	@Inject
	private Roles roles;
	
	@Override
	public Iterable<Role> getRolesByUidAndAppli(String userDn, String applicationDn) {
		return roles.getRolesByUidAndAppli(userDn, applicationDn);
	}
}
