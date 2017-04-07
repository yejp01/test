package com.yann;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import localhost.ormrpc.services.EASLogin.EASLoginProxy;
import localhost.ormrpc.services.EASLogin.EASLoginProxyServiceLocator;
import client.WSContext;

import com.wondersgroup.adage.webservice.interfaces.AdageBusinessWebServiceLocator;
import com.wondersgroup.adage.webservice.interfaces.AdageBusinessWebServicePortType;
import com.wondersgroup.adage.webservice.interfaces.AdageBusinessWebServicePortTypeProxy;

public class AdageTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// °®µÝ¼ª½Ó¿Ú
		AdageBusinessWebServiceLocator adageLocator = new AdageBusinessWebServiceLocator();
		try {
			AdageBusinessWebServicePortType adageProxy = adageLocator
					.getAdageBusinessWebServiceHttpPort();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		adageProxy.dataSend(in0, in1, in2);
//		adageProxy.dataQuery(in0, in1, in2);
//		adageProxy.dataQueryFeedback(in0, in1, in2);
//		adageProxy.dataResponseQuery(in0, in1, in2);

	}
}
