/**
 * CANAMSecurityWebService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.rsi.securite.interfaces.ldap;

public interface CANAMSecurityWebService_PortType extends java.rmi.Remote {
    public java.lang.Object[] getRolesByUidAndAppli(java.lang.String userDn, java.lang.String applicationDn) throws java.rmi.RemoteException, MapperException;
    public java.lang.Object[] getUsersByAppli(java.lang.String applicationCode, java.lang.String attributs) throws java.rmi.RemoteException, MapperException;
    public java.lang.Object[] getUsersByRoleAndCmr(java.lang.String roleCode, java.lang.String siteCode, java.lang.String applicationCode) throws java.rmi.RemoteException, MapperException;
    public java.lang.Object[] getUsersByDirection(java.lang.String serviceDn, java.lang.String attributes) throws java.rmi.RemoteException, MapperException;
}
