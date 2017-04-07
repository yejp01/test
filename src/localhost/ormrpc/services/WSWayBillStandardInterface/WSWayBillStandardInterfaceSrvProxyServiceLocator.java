/**
 * WSWayBillStandardInterfaceSrvProxyServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.ormrpc.services.WSWayBillStandardInterface;

public class WSWayBillStandardInterfaceSrvProxyServiceLocator extends org.apache.axis.client.Service implements localhost.ormrpc.services.WSWayBillStandardInterface.WSWayBillStandardInterfaceSrvProxyService {

    public WSWayBillStandardInterfaceSrvProxyServiceLocator() {
    }


    public WSWayBillStandardInterfaceSrvProxyServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSWayBillStandardInterfaceSrvProxyServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSWayBillStandardInterface
    private java.lang.String WSWayBillStandardInterface_address = "http://localhost:56898/ormrpc/services/WSWayBillStandardInterface";

    public java.lang.String getWSWayBillStandardInterfaceAddress() {
        return WSWayBillStandardInterface_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSWayBillStandardInterfaceWSDDServiceName = "WSWayBillStandardInterface";

    public java.lang.String getWSWayBillStandardInterfaceWSDDServiceName() {
        return WSWayBillStandardInterfaceWSDDServiceName;
    }

    public void setWSWayBillStandardInterfaceWSDDServiceName(java.lang.String name) {
        WSWayBillStandardInterfaceWSDDServiceName = name;
    }

    public localhost.ormrpc.services.WSWayBillStandardInterface.WSWayBillStandardInterfaceSrvProxy getWSWayBillStandardInterface() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSWayBillStandardInterface_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSWayBillStandardInterface(endpoint);
    }

    public localhost.ormrpc.services.WSWayBillStandardInterface.WSWayBillStandardInterfaceSrvProxy getWSWayBillStandardInterface(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            localhost.ormrpc.services.WSWayBillStandardInterface.WSWayBillStandardInterfaceSoapBindingStub _stub = new localhost.ormrpc.services.WSWayBillStandardInterface.WSWayBillStandardInterfaceSoapBindingStub(portAddress, this);
            _stub.setPortName(getWSWayBillStandardInterfaceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSWayBillStandardInterfaceEndpointAddress(java.lang.String address) {
        WSWayBillStandardInterface_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (localhost.ormrpc.services.WSWayBillStandardInterface.WSWayBillStandardInterfaceSrvProxy.class.isAssignableFrom(serviceEndpointInterface)) {
                localhost.ormrpc.services.WSWayBillStandardInterface.WSWayBillStandardInterfaceSoapBindingStub _stub = new localhost.ormrpc.services.WSWayBillStandardInterface.WSWayBillStandardInterfaceSoapBindingStub(new java.net.URL(WSWayBillStandardInterface_address), this);
                _stub.setPortName(getWSWayBillStandardInterfaceWSDDServiceName());
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
        if ("WSWayBillStandardInterface".equals(inputPortName)) {
            return getWSWayBillStandardInterface();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://192.168.3.138:56898/ormrpc/services/WSWayBillStandardInterface", "WSWayBillStandardInterfaceSrvProxyService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://192.168.3.138:56898/ormrpc/services/WSWayBillStandardInterface", "WSWayBillStandardInterface"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSWayBillStandardInterface".equals(portName)) {
            setWSWayBillStandardInterfaceEndpointAddress(address);
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
