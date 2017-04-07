/**
 * DaHua_Logistics_DataExchangeLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.kingdee.eas.henglu.WSInterface.DaHua;

public class DaHua_Logistics_DataExchangeLocator extends org.apache.axis.client.Service implements com.kingdee.eas.henglu.WSInterface.DaHua.DaHua_Logistics_DataExchange {

    public DaHua_Logistics_DataExchangeLocator() {
    }


    public DaHua_Logistics_DataExchangeLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DaHua_Logistics_DataExchangeLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DaHua_Logistics_DataExchangeSoap
    private java.lang.String DaHua_Logistics_DataExchangeSoap_address = "http://60.191.94.115/DH_DataExchangeTest/DaHua_Entry.asmx";

    public java.lang.String getDaHua_Logistics_DataExchangeSoapAddress() {
        return DaHua_Logistics_DataExchangeSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DaHua_Logistics_DataExchangeSoapWSDDServiceName = "DaHua_Logistics_DataExchangeSoap";

    public java.lang.String getDaHua_Logistics_DataExchangeSoapWSDDServiceName() {
        return DaHua_Logistics_DataExchangeSoapWSDDServiceName;
    }

    public void setDaHua_Logistics_DataExchangeSoapWSDDServiceName(java.lang.String name) {
        DaHua_Logistics_DataExchangeSoapWSDDServiceName = name;
    }

    public com.kingdee.eas.henglu.WSInterface.DaHua.DaHua_Logistics_DataExchangeSoap getDaHua_Logistics_DataExchangeSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DaHua_Logistics_DataExchangeSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDaHua_Logistics_DataExchangeSoap(endpoint);
    }

    public com.kingdee.eas.henglu.WSInterface.DaHua.DaHua_Logistics_DataExchangeSoap getDaHua_Logistics_DataExchangeSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.kingdee.eas.henglu.WSInterface.DaHua.DaHua_Logistics_DataExchangeSoapStub _stub = new com.kingdee.eas.henglu.WSInterface.DaHua.DaHua_Logistics_DataExchangeSoapStub(portAddress, this);
            _stub.setPortName(getDaHua_Logistics_DataExchangeSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDaHua_Logistics_DataExchangeSoapEndpointAddress(java.lang.String address) {
        DaHua_Logistics_DataExchangeSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.kingdee.eas.henglu.WSInterface.DaHua.DaHua_Logistics_DataExchangeSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.kingdee.eas.henglu.WSInterface.DaHua.DaHua_Logistics_DataExchangeSoapStub _stub = new com.kingdee.eas.henglu.WSInterface.DaHua.DaHua_Logistics_DataExchangeSoapStub(new java.net.URL(DaHua_Logistics_DataExchangeSoap_address), this);
                _stub.setPortName(getDaHua_Logistics_DataExchangeSoapWSDDServiceName());
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
        if ("DaHua_Logistics_DataExchangeSoap".equals(inputPortName)) {
            return getDaHua_Logistics_DataExchangeSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "DaHua_Logistics_DataExchange");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "DaHua_Logistics_DataExchangeSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DaHua_Logistics_DataExchangeSoap".equals(portName)) {
            setDaHua_Logistics_DataExchangeSoapEndpointAddress(address);
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
