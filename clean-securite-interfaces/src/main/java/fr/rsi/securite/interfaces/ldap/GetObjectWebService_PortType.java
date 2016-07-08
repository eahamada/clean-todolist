/**
 * GetObjectWebService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.rsi.securite.interfaces.ldap;

public interface GetObjectWebService_PortType extends java.rmi.Remote {
    public java.lang.Object[] getObject(java.lang.String mappingResource, java.lang.String searchString, java.lang.String attributes) throws java.rmi.RemoteException, MapperException;
    public java.lang.Object[] getManagerByService(java.lang.String serviceDn, java.lang.String attributes) throws java.rmi.RemoteException, MapperException;
}
