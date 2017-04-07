/**
 * WSWayBillStandardInterfaceSrvProxy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.ormrpc.services.WSWayBillStandardInterface;

public interface WSWayBillStandardInterfaceSrvProxy extends java.rmi.Remote {
    public java.lang.String[] login(java.lang.String userName, java.lang.String userPassword) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] importData(java.lang.String xml) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] saveCMDeliveryInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public void deleteAppDeliveryInfo(java.lang.String[] filterParam) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] saveCMGoodsInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] saveAppDeliveryInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public void updateCMGoodsInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] saveCMCollectionInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] getAppDelivery(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] getAppDeliveryInfo(java.lang.String[] filterParam) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] getTranTypeInfo() throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public void deleteCMDeliveryInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] getCMCollectionInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public void deleteCMCollectionInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] getCMGoodsInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public boolean getIsWaitNotice(java.lang.String customerID) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public void updateAppDeliveryInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public void updateCMDeliveryInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] saveRecordWaybill(java.lang.String[][] recordWaybillParm) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] getModelInfo() throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] saveModeInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] getCMReceiveInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] getAreaAddressInfo(java.lang.String cityID) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] getSpecimensInfo() throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] getCustomerInfo() throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public void setModelIsEnable(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public void updateRecordWaybill(java.lang.String[][] recordWaybillParm) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] selectModelInfo(java.lang.String customerID) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public void updateCMCollectionInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] getGoodsNameInfo() throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public void setCustomerManagerInfo(java.lang.String[] customerManParam) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] getCMDeliveryInfo(java.lang.String[] filterParam) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] getGPSInfo(java.lang.String struckNo) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] getStreetInfo(java.lang.String areaAddressID) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] getBizPersonInfo() throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] getOldPackTypeInfo() throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] getProvinceInfo() throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] getSignatureInfo() throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] getReturnRequirInfo() throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public void updatePassword(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] getVehicleTypeInfo() throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] getStampInfo() throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public void deleteCMReceiveInfo(java.lang.String[] filterParam) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] getCustomerManagerInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] getTranTypeCusInfo() throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public void updateCMReceiveInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public boolean checkModelNumberUniqe(java.lang.String number, java.lang.String oprtType) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public void deleteCMGoodsInfo(java.lang.String[] filterParam) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[][] getRecordWaybill(java.lang.String[] filterParm) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] getCityInfo(java.lang.String provinceID) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public java.lang.String[] saveCMReceiveInfo(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
    public void deleteRecordWaybill(java.lang.String[] param) throws java.rmi.RemoteException, waybillstandardinterface.client.WSInvokeException;
}
