package fr.rsi.securite.domain;

public interface Roles {
	Iterable<Role> getRolesByUidAndAppli(String userDn, String applicationDn);
}
