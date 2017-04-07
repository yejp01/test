package com.kingdee.eas.henglu.WSInterface.DaHua;

public class DaHua_Logistics_DataExchangeSoapProxy implements com.kingdee.eas.henglu.WSInterface.DaHua.DaHua_Logistics_DataExchangeSoap {
  private String _endpoint = null;
  private com.kingdee.eas.henglu.WSInterface.DaHua.DaHua_Logistics_DataExchangeSoap daHua_Logistics_DataExchangeSoap = null;
  
  public DaHua_Logistics_DataExchangeSoapProxy() {
    _initDaHua_Logistics_DataExchangeSoapProxy();
  }
  
  public DaHua_Logistics_DataExchangeSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initDaHua_Logistics_DataExchangeSoapProxy();
  }
  
  private void _initDaHua_Logistics_DataExchangeSoapProxy() {
    try {
      daHua_Logistics_DataExchangeSoap = (new com.kingdee.eas.henglu.WSInterface.DaHua.DaHua_Logistics_DataExchangeLocator()).getDaHua_Logistics_DataExchangeSoap();
      if (daHua_Logistics_DataExchangeSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)daHua_Logistics_DataExchangeSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)daHua_Logistics_DataExchangeSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (daHua_Logistics_DataExchangeSoap != null)
      ((javax.xml.rpc.Stub)daHua_Logistics_DataExchangeSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.kingdee.eas.henglu.WSInterface.DaHua.DaHua_Logistics_DataExchangeSoap getDaHua_Logistics_DataExchangeSoap() {
    if (daHua_Logistics_DataExchangeSoap == null)
      _initDaHua_Logistics_DataExchangeSoapProxy();
    return daHua_Logistics_DataExchangeSoap;
  }
  
  public java.lang.String helloWorld() throws java.rmi.RemoteException{
    if (daHua_Logistics_DataExchangeSoap == null)
      _initDaHua_Logistics_DataExchangeSoapProxy();
    return daHua_Logistics_DataExchangeSoap.helloWorld();
  }
  
  public java.lang.String daHuaDataExchange(java.lang.String xmlInfo) throws java.rmi.RemoteException{
    if (daHua_Logistics_DataExchangeSoap == null)
      _initDaHua_Logistics_DataExchangeSoapProxy();
    return daHua_Logistics_DataExchangeSoap.daHuaDataExchange(xmlInfo);
  }
  
  public java.lang.String getVisitorIP() throws java.rmi.RemoteException{
    if (daHua_Logistics_DataExchangeSoap == null)
      _initDaHua_Logistics_DataExchangeSoapProxy();
    return daHua_Logistics_DataExchangeSoap.getVisitorIP();
  }
  
  
}