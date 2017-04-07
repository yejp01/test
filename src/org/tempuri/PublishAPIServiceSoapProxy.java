package org.tempuri;

public class PublishAPIServiceSoapProxy implements org.tempuri.PublishAPIServiceSoap {
  private String _endpoint = null;
  private org.tempuri.PublishAPIServiceSoap publishAPIServiceSoap = null;
  
  public PublishAPIServiceSoapProxy() {
    _initPublishAPIServiceSoapProxy();
  }
  
  public PublishAPIServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initPublishAPIServiceSoapProxy();
  }
  
  private void _initPublishAPIServiceSoapProxy() {
    try {
      publishAPIServiceSoap = (new org.tempuri.PublishAPIServiceLocator()).getPublishAPIServiceSoap();
      if (publishAPIServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)publishAPIServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)publishAPIServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (publishAPIServiceSoap != null)
      ((javax.xml.rpc.Stub)publishAPIServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.PublishAPIServiceSoap getPublishAPIServiceSoap() {
    if (publishAPIServiceSoap == null)
      _initPublishAPIServiceSoapProxy();
    return publishAPIServiceSoap;
  }
  
  public java.lang.String helloWorld() throws java.rmi.RemoteException{
    if (publishAPIServiceSoap == null)
      _initPublishAPIServiceSoapProxy();
    return publishAPIServiceSoap.helloWorld();
  }
  
  public java.lang.String getDNInfo(java.lang.String inputString) throws java.rmi.RemoteException{
    if (publishAPIServiceSoap == null)
      _initPublishAPIServiceSoapProxy();
    return publishAPIServiceSoap.getDNInfo(inputString);
  }
  
  public java.lang.String getTrackingService(java.lang.String dn, java.lang.String startDate, java.lang.String endDate) throws java.rmi.RemoteException{
    if (publishAPIServiceSoap == null)
      _initPublishAPIServiceSoapProxy();
    return publishAPIServiceSoap.getTrackingService(dn, startDate, endDate);
  }
  
  public org.tempuri.CITY_CRM[] getCityForCRM() throws java.rmi.RemoteException{
    if (publishAPIServiceSoap == null)
      _initPublishAPIServiceSoapProxy();
    return publishAPIServiceSoap.getCityForCRM();
  }
  
  public org.tempuri.ListEnShipment getShipment(java.lang.String paraXml) throws java.rmi.RemoteException{
    if (publishAPIServiceSoap == null)
      _initPublishAPIServiceSoapProxy();
    return publishAPIServiceSoap.getShipment(paraXml);
  }
  
  public org.tempuri.EnResultBase sendTrackings(java.lang.String paraXml) throws java.rmi.RemoteException{
    if (publishAPIServiceSoap == null)
      _initPublishAPIServiceSoapProxy();
    return publishAPIServiceSoap.sendTrackings(paraXml);
  }
  
  public org.tempuri.EnResultBase sendBillInfo(java.lang.String paraXml) throws java.rmi.RemoteException{
    if (publishAPIServiceSoap == null)
      _initPublishAPIServiceSoapProxy();
    return publishAPIServiceSoap.sendBillInfo(paraXml);
  }
  
  public org.tempuri.EnResultBase sendOtherCharge(java.lang.String paraXml) throws java.rmi.RemoteException{
    if (publishAPIServiceSoap == null)
      _initPublishAPIServiceSoapProxy();
    return publishAPIServiceSoap.sendOtherCharge(paraXml);
  }
  
  
}