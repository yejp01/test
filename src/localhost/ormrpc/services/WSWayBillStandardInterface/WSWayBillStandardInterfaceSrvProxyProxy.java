package localhost.ormrpc.services.WSWayBillStandardInterface;

public class WSWayBillStandardInterfaceSrvProxyProxy implements localhost.ormrpc.services.WSWayBillStandardInterface.WSWayBillStandardInterfaceSrvProxy {
  private String _endpoint = null;
  private localhost.ormrpc.services.WSWayBillStandardInterface.WSWayBillStandardInterfaceSrvProxy wSWayBillStandardInterfaceSrvProxy = null;
  
  public WSWayBillStandardInterfaceSrvProxyProxy() {
    _initWSWayBillStandardInterfaceSrvProxyProxy();
  }
  
  public WSWayBillStandardInterfaceSrvProxyProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSWayBillStandardInterfaceSrvProxyProxy();
  }
  
  private void _initWSWayBillStandardInterfaceSrvProxyProxy() {
    try {
      wSWayBillStandardInterfaceSrvProxy = (new localhost.ormrpc.services.WSWayBillStandardInterface.WSWayBillStandardInterfaceSrvProxyServiceLocator()).getWSWayBillStandardInterface();
      if (wSWayBillStandardInterfaceSrvProxy != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSWayBillStandardInterfaceSrvProxy)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSWayBillStandardInterfaceSrvProxy)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSWayBillStandardInterfaceSrvProxy != null)
      ((javax.xml.rpc.Stub)wSWayBillStandardInterfaceSrvProxy)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public localhost.ormrpc.services.WSWayBillStandardInterface.WSWayBillStandardInterfaceSrvProxy getWSWayBillStandardInterfaceSrvProxy() {
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy;
  }
  
  public java.lang.String[] login(java.lang.String userName, java.lang.String userPassword) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.login(userName, userPassword);
  }
  
  public java.lang.String[] importData(java.lang.String xml) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.importData(xml);
  }
  
  public java.lang.String[] saveCMDeliveryInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.saveCMDeliveryInfo(param);
  }
  
  public void deleteAppDeliveryInfo(java.lang.String[] filterParam) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    wSWayBillStandardInterfaceSrvProxy.deleteAppDeliveryInfo(filterParam);
  }
  
  public java.lang.String[] saveCMGoodsInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.saveCMGoodsInfo(param);
  }
  
  public java.lang.String[] saveAppDeliveryInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.saveAppDeliveryInfo(param);
  }
  
  public void updateCMGoodsInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    wSWayBillStandardInterfaceSrvProxy.updateCMGoodsInfo(param);
  }
  
  public java.lang.String[] saveCMCollectionInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.saveCMCollectionInfo(param);
  }
  
  public java.lang.String[] getAppDelivery(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.getAppDelivery(param);
  }
  
  public java.lang.String[] getAppDeliveryInfo(java.lang.String[] filterParam) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.getAppDeliveryInfo(filterParam);
  }
  
  public java.lang.String[] getTranTypeInfo() throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.getTranTypeInfo();
  }
  
  public void deleteCMDeliveryInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    wSWayBillStandardInterfaceSrvProxy.deleteCMDeliveryInfo(param);
  }
  
  public java.lang.String[] getCMCollectionInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.getCMCollectionInfo(param);
  }
  
  public void deleteCMCollectionInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    wSWayBillStandardInterfaceSrvProxy.deleteCMCollectionInfo(param);
  }
  
  public java.lang.String[] getCMGoodsInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.getCMGoodsInfo(param);
  }
  
  public boolean getIsWaitNotice(java.lang.String customerID) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.getIsWaitNotice(customerID);
  }
  
  public void updateAppDeliveryInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    wSWayBillStandardInterfaceSrvProxy.updateAppDeliveryInfo(param);
  }
  
  public void updateCMDeliveryInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    wSWayBillStandardInterfaceSrvProxy.updateCMDeliveryInfo(param);
  }
  
  public java.lang.String[] saveRecordWaybill(java.lang.String[][] recordWaybillParm) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.saveRecordWaybill(recordWaybillParm);
  }
  
  public java.lang.String[] getModelInfo() throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.getModelInfo();
  }
  
  public java.lang.String[] saveModeInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.saveModeInfo(param);
  }
  
  public java.lang.String[] getCMReceiveInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.getCMReceiveInfo(param);
  }
  
  public java.lang.String[] getAreaAddressInfo(java.lang.String cityID) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.getAreaAddressInfo(cityID);
  }
  
  public java.lang.String[] getSpecimensInfo() throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.getSpecimensInfo();
  }
  
  public java.lang.String[] getCustomerInfo() throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.getCustomerInfo();
  }
  
  public void setModelIsEnable(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    wSWayBillStandardInterfaceSrvProxy.setModelIsEnable(param);
  }
  
  public void updateRecordWaybill(java.lang.String[][] recordWaybillParm) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    wSWayBillStandardInterfaceSrvProxy.updateRecordWaybill(recordWaybillParm);
  }
  
  public java.lang.String[] selectModelInfo(java.lang.String customerID) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.selectModelInfo(customerID);
  }
  
  public void updateCMCollectionInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    wSWayBillStandardInterfaceSrvProxy.updateCMCollectionInfo(param);
  }
  
  public java.lang.String[] getGoodsNameInfo() throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.getGoodsNameInfo();
  }
  
  public void setCustomerManagerInfo(java.lang.String[] customerManParam) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    wSWayBillStandardInterfaceSrvProxy.setCustomerManagerInfo(customerManParam);
  }
  
  public java.lang.String[] getCMDeliveryInfo(java.lang.String[] filterParam) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.getCMDeliveryInfo(filterParam);
  }
  
  public java.lang.String[] getGPSInfo(java.lang.String struckNo) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.getGPSInfo(struckNo);
  }
  
  public java.lang.String[] getStreetInfo(java.lang.String areaAddressID) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.getStreetInfo(areaAddressID);
  }
  
  public java.lang.String[] getBizPersonInfo() throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.getBizPersonInfo();
  }
  
  public java.lang.String[] getOldPackTypeInfo() throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.getOldPackTypeInfo();
  }
  
  public java.lang.String[] getProvinceInfo() throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.getProvinceInfo();
  }
  
  public java.lang.String[] getSignatureInfo() throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.getSignatureInfo();
  }
  
  public java.lang.String[] getReturnRequirInfo() throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.getReturnRequirInfo();
  }
  
  public void updatePassword(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    wSWayBillStandardInterfaceSrvProxy.updatePassword(param);
  }
  
  public java.lang.String[] getVehicleTypeInfo() throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.getVehicleTypeInfo();
  }
  
  public java.lang.String[] getStampInfo() throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.getStampInfo();
  }
  
  public void deleteCMReceiveInfo(java.lang.String[] filterParam) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    wSWayBillStandardInterfaceSrvProxy.deleteCMReceiveInfo(filterParam);
  }
  
  public java.lang.String[] getCustomerManagerInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.getCustomerManagerInfo(param);
  }
  
  public java.lang.String[] getTranTypeCusInfo() throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.getTranTypeCusInfo();
  }
  
  public void updateCMReceiveInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    wSWayBillStandardInterfaceSrvProxy.updateCMReceiveInfo(param);
  }
  
  public boolean checkModelNumberUniqe(java.lang.String number, java.lang.String oprtType) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.checkModelNumberUniqe(number, oprtType);
  }
  
  public void deleteCMGoodsInfo(java.lang.String[] filterParam) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    wSWayBillStandardInterfaceSrvProxy.deleteCMGoodsInfo(filterParam);
  }
  
  public java.lang.String[][] getRecordWaybill(java.lang.String[] filterParm) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.getRecordWaybill(filterParm);
  }
  
  public java.lang.String[] getCityInfo(java.lang.String provinceID) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.getCityInfo(provinceID);
  }
  
  public java.lang.String[] saveCMReceiveInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    return wSWayBillStandardInterfaceSrvProxy.saveCMReceiveInfo(param);
  }
  
  public void deleteRecordWaybill(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException{
    if (wSWayBillStandardInterfaceSrvProxy == null)
      _initWSWayBillStandardInterfaceSrvProxyProxy();
    wSWayBillStandardInterfaceSrvProxy.deleteRecordWaybill(param);
  }
  
  
}