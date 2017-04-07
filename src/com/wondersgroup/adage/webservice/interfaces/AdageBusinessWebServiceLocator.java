/**
 * AdageBusinessWebServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.wondersgroup.adage.webservice.interfaces;

public class AdageBusinessWebServiceLocator extends org.apache.axis.client.Service implements com.wondersgroup.adage.webservice.interfaces.AdageBusinessWebService {

    public AdageBusinessWebServiceLocator() {
    }


    public AdageBusinessWebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AdageBusinessWebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AdageBusinessWebServiceHttpPort
    private java.lang.String AdageBusinessWebServiceHttpPort_address = "https://www.adj56pt.com/services/AdageBusinessWebService";

    public java.lang.String getAdageBusinessWebServiceHttpPortAddress() {
        return AdageBusinessWebServiceHttpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AdageBusinessWebServiceHttpPortWSDDServiceName = "AdageBusinessWebServiceHttpPort";

    public java.lang.String getAdageBusinessWebServiceHttpPortWSDDServiceName() {
        return AdageBusinessWebServiceHttpPortWSDDServiceName;
    }

    public void setAdageBusinessWebServiceHttpPortWSDDServiceName(java.lang.String name) {
        AdageBusinessWebServiceHttpPortWSDDServiceName = name;
    }

    public com.wondersgroup.adage.webservice.interfaces.AdageBusinessWebServicePortType getAdageBusinessWebServiceHttpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AdageBusinessWebServiceHttpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAdageBusinessWebServiceHttpPort(endpoint);
    }

    public com.wondersgroup.adage.webservice.interfaces.AdageBusinessWebServicePortType getAdageBusinessWebServiceHttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.wondersgroup.adage.webservice.interfaces.AdageBusinessWebServiceHttpBindingStub _stub = new com.wondersgroup.adage.webservice.interfaces.AdageBusinessWebServiceHttpBindingStub(portAddress, this);
            _stub.setPortName(getAdageBusinessWebServiceHttpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAdageBusinessWebServiceHttpPortEndpointAddress(java.lang.String address) {
        AdageBusinessWebServiceHttpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.wondersgroup.adage.webservice.interfaces.AdageBusinessWebServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.wondersgroup.adage.webservice.interfaces.AdageBusinessWebServiceHttpBindingStub _stub = new com.wondersgroup.adage.webservice.interfaces.AdageBusinessWebServiceHttpBindingStub(new java.net.URL(AdageBusinessWebServiceHttpPort_address), this);
                _stub.setPortName(getAdageBusinessWebServiceHttpPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AdageBusinessWebServiceHttpPort".equals(inputPortName)) {
            return getAdageBusinessWebServiceHttpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://interfaces.webservice.adage.wondersgroup.com", "AdageBusinessWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://interfaces.webservice.adage.wondersgroup.com", "AdageBusinessWebServiceHttpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AdageBusinessWebServiceHttpPort".equals(portName)) {
            setAdageBusinessWebServiceHttpPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
