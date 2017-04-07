package com.wondersgroup.adage.webservice.interfaces;

public class AdageBusinessWebServicePortTypeProxy implements com.wondersgroup.adage.webservice.interfaces.AdageBusinessWebServicePortType {
  private String _endpoint = null;
  private com.wondersgroup.adage.webservice.interfaces.AdageBusinessWebServicePortType adageBusinessWebServicePortType = null;
  
  public AdageBusinessWebServicePortTypeProxy() {
    _initAdageBusinessWebServicePortTypeProxy();
  }
  
  public AdageBusinessWebServicePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initAdageBusinessWebServicePortTypeProxy();
  }
  
  private void _initAdageBusinessWebServicePortTypeProxy() {
    try {
      adageBusinessWebServicePortType = (new com.wondersgroup.adage.webservice.interfaces.AdageBusinessWebServiceLocator()).getAdageBusinessWebServiceHttpPort();
      if (adageBusinessWebServicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)adageBusinessWebServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)adageBusinessWebServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (adageBusinessWebServicePortType != null)
      ((javax.xml.rpc.Stub)adageBusinessWebServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.wondersgroup.adage.webservice.interfaces.AdageBusinessWebServicePortType getAdageBusinessWebServicePortType() {
    if (adageBusinessWebServicePortType == null)
      _initAdageBusinessWebServicePortTypeProxy();
    return adageBusinessWebServicePortType;
  }
  
  public java.lang.String dataQueryFeedback(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException{
    if (adageBusinessWebServicePortType == null)
      _initAdageBusinessWebServicePortTypeProxy();
    return adageBusinessWebServicePortType.dataQueryFeedback(in0, in1, in2);
  }
  
  public java.lang.String dataQuery(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException{
    if (adageBusinessWebServicePortType == null)
      _initAdageBusinessWebServicePortTypeProxy();
    return adageBusinessWebServicePortType.dataQuery(in0, in1, in2);
  }
  
  public java.lang.String dataResponseQuery(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException{
    if (adageBusinessWebServicePortType == null)
      _initAdageBusinessWebServicePortTypeProxy();
    return adageBusinessWebServicePortType.dataResponseQuery(in0, in1, in2);
  }
  
  public java.lang.String dataSend(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException{
    if (adageBusinessWebServicePortType == null)
      _initAdageBusinessWebServicePortTypeProxy();
    return adageBusinessWebServicePortType.dataSend(in0, in1, in2);
  }
  
  
}