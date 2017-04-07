/**
 * PublishAPIServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface PublishAPIServiceSoap extends java.rmi.Remote {
    public java.lang.String helloWorld() throws java.rmi.RemoteException;
    public java.lang.String getDNInfo(java.lang.String inputString) throws java.rmi.RemoteException;
    public java.lang.String getTrackingService(java.lang.String dn, java.lang.String startDate, java.lang.String endDate) throws java.rmi.RemoteException;
    public org.tempuri.CITY_CRM[] getCityForCRM() throws java.rmi.RemoteException;

    /**
     * 发运单接口(参数采用xml格式,并且使用param为根节点)
     */
    public org.tempuri.ListEnShipment getShipment(java.lang.String paraXml) throws java.rmi.RemoteException;

    /**
     * 跟踪信息同步接口(参数采用xml格式,并且使用param为根节点)
     */
    public org.tempuri.EnResultBase sendTrackings(java.lang.String paraXml) throws java.rmi.RemoteException;

    /**
     * 基础运费接口(参数采用xml格式,并且使用param为根节点)
     */
    public org.tempuri.EnResultBase sendBillInfo(java.lang.String paraXml) throws java.rmi.RemoteException;

    /**
     * 附加费接口(参数采用xml格式,并且使用param为根节点)
     */
    public org.tempuri.EnResultBase sendOtherCharge(java.lang.String paraXml) throws java.rmi.RemoteException;
}
