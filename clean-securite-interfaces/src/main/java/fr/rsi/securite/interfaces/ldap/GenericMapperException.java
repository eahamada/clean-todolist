package fr.rsi.securite.interfaces.ldap;

public interface GenericMapperException {

	/**
	 * Writes the exception data to the faultDetails
	 */
	void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context)
			throws java.io.IOException;

}