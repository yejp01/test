package com.yann;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.tempuri.EnResultBase;
import org.tempuri.EnShipment;
import org.tempuri.ListEnShipment;
import org.tempuri.PublishAPIServiceLocator;
import org.tempuri.PublishAPIServiceSoap;

public class MaiRuiTest {

	public MaiRuiTest() {
	}

	public static void main(String[] args) {
		PublishAPIServiceLocator apiLocator = new PublishAPIServiceLocator();
		try {
			PublishAPIServiceSoap apiProxy = apiLocator
					.getPublishAPIServiceSoap();

			String paraXml = messageToStringXML();
			try {
//				EnResultBase base = apiProxy.sendTrackings(setMaiRuiTrucksXml());
//				System.out.println(base.getMessage());
				
//				EnResultBase base = apiProxy.getTrackingService(dn, startDate, endDate);
				
				ListEnShipment listShipment = apiProxy.getShipment(paraXml);
				EnShipment[] shipment = listShipment.getItems();
				if (shipment != null) {
					for (int i = 0; i < shipment.length; i++) {
						shipment[i].getDN();
						System.out.println(shipment[i].getDN());
						System.out.println(shipment[i].getShipmentID());
						System.out.println(shipment[i].getPODNUM());
						System.out.println(shipment[i].getPickUpDate());
						System.out.println(shipment[i].getArriveDate());
						System.out.println(shipment[i].getTransportMode());
						System.out.println(shipment[i].getTenderRemark());
						System.out.println(shipment[i].getTotalQuanlity());
						System.out.println(shipment[i].getTotalWeight());
						System.out.println(shipment[i].getTotalVolume());
						System.out.println(shipment[i].getSrcLocationName());
						System.out.println(shipment[i].getSrcCity());
						System.out.println("发货省："
								+ shipment[i].getSrcProvince());

						// String srcAddress = shipment[i].getSrcAddress();
						String srcAddress = "广东省深圳市南山西丽镇百旺信工业园迈瑞制造中心11-5";
						if (srcAddress != null && !"".equals(srcAddress)) {
							String[] retSrc = getAreaAndAddress(srcAddress);
							if (srcAddress.length() > 0) {
								System.out.println(retSrc[0]);
								System.out.println(retSrc[1]);
							}
						}

						System.out.println("发货地址："
								+ shipment[i].getSrcAddress());
						System.out.println(shipment[i].getSrcContact());
						System.out.println(shipment[i].getSrcTel());
						System.out.println(shipment[i].getSrcPhone());
						System.out.println(shipment[i].getDestLocationName());
						System.out.println(shipment[i].getDestCity());
						System.out.println(shipment[i].getDestProvince());
						System.out.println(shipment[i].getDestAddress());
						System.out.println(shipment[i].getDestContact());
						System.out.println(shipment[i].getDestTel());
						System.out.println(shipment[i].getDestPhone());
						System.out.println(shipment[i].getItemType());
						System.out.println(shipment[i].getItemName());
					}
				}

			} catch (RemoteException e) {
				e.printStackTrace();
			}
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}

	private static String[] getAreaAndAddress(String srcAddress) {
		String[] strRet = new String[2];
		// srcAddress = "广东省深圳市南山西丽镇百旺信工业园迈瑞制造中心11-5";
		if (srcAddress != null && !"".equals(srcAddress)) {
			int cityIndex = 0;
			int areaIndex = 0;
			try {
				if (srcAddress.contains("市")) {
					cityIndex = srcAddress.indexOf("市");
				}
				if (srcAddress.contains("区")) {
					areaIndex = srcAddress.indexOf("区");
				}
				if (srcAddress.contains("县")) {
					areaIndex = srcAddress.indexOf("县");
				}
				if (cityIndex > 0 && areaIndex > 0) {
					String area = srcAddress.substring(cityIndex + 1,
							areaIndex + 1);
					String addressInfo = srcAddress.substring(areaIndex + 1,
							srcAddress.length());

					strRet[0] = area;
					strRet[1] = addressInfo;
					// System.out.println(area);
					// System.out.println(addressInfo);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return strRet;
	}

	public static String messageToStringXML() {
//		StringBuilder sb = new StringBuilder();
		StringBuffer sb = new StringBuffer("<?xml version =\"1.0\" encoding = \"UTF-8\"?>");
		sb.append("<param>");
		sb.append("<ServiceProviderGID>");
		sb.append("恒路");
		sb.append("</ServiceProviderGID>");
		sb.append("<Pwd>");
		sb.append("c8ffe9a587b126f152ed3d89a146b445");
		sb.append("</Pwd>");
		sb.append("<ShipmentID>");
		sb.append("");
		sb.append("</ShipmentID>");
		sb.append("<StartDate>");
		sb.append("");
		sb.append("2014-01-01 00:00:00");
		sb.append("</StartDate>");
		sb.append("<EndDate>");
		sb.append("");
		sb.append("2014-02-01 00:00:00");
		sb.append("</EndDate>");
		sb.append("</param>");
		
		return sb.toString();
	}
	
	public static String setMaiRuiTrucksXml(){
		StringBuffer sb = new StringBuffer("<?xml version =\"1.0\" encoding = \"UTF-8\"?>");
		sb.append("<param>");
		
		sb.append("<ServiceProviderGID>");
		sb.append("恒路");
		sb.append("</ServiceProviderGID>");
		sb.append("<Pwd>");
		sb.append("c8ffe9a587b126f152ed3d89a146b445");
		sb.append("</Pwd>");
		sb.append("<ShipmentID>");
		sb.append("SP1405240468");
		sb.append("</ShipmentID>");
		sb.append("<Status>");
		sb.append("");
		sb.append("</Status>");
		sb.append("<IsKeyStop>");
		sb.append("");
		sb.append("</IsKeyStop>");
		sb.append("<StopNum>");
		sb.append("");
		sb.append("</StopNum>");
		sb.append("<PlanStartDate>");
		sb.append("");
		sb.append("</PlanStartDate>");
		sb.append("<PlanEndDate>");
		sb.append("");
		sb.append("</PlanEndDate>");
		
		sb.append("<ActualStartDate>");
		sb.append("");
		sb.append("</ActualStartDate>");
		sb.append("<ActualEndDate>");
		sb.append("");
		sb.append("</ActualEndDate>");
		sb.append("<TrackingDate>");
		sb.append("");
		sb.append("</TrackingDate>");
		sb.append("<City>");
		sb.append("");
		sb.append("</City>");
		sb.append("<Address>");
		sb.append("");
		sb.append("</Address>");
		sb.append("<AWB>");
		sb.append("");
		sb.append("</AWB>");
		
		sb.append("<HWB>");
		sb.append("");
		sb.append("</HWB>");
		sb.append("<FlightNo>");
		sb.append("");
		sb.append("</FlightNo>");
		sb.append("<FlightDate>");
		sb.append("");
		sb.append("</FlightDate>");
		sb.append("<Remark>");
		sb.append("");
		sb.append("</Remark>");
		sb.append("<PODBy>");
		sb.append("");
		sb.append("</PODBy>");
		sb.append("<PODRemark>");
		sb.append("");
		sb.append("</PODRemark>");
		
		sb.append("</param>");
		return sb.toString();
	}
	
	public static String setMaiRuiBillInfo(){
		StringBuffer sb = new StringBuffer("<?xml version =\"1.0\" encoding = \"UTF-8\"?>");
		sb.append("<param>");
		
		sb.append("<ServiceProviderGID>");
		sb.append("恒路");
		sb.append("</ServiceProviderGID>");
		sb.append("<Pwd>");
		sb.append("c8ffe9a587b126f152ed3d89a146b445");
		sb.append("</Pwd>");
		sb.append("<ShipmentID>");
		sb.append("SP1405240468");
		sb.append("</ShipmentID>");
		sb.append("<TotalQuanlity>");
		sb.append("");
		sb.append("</TotalQuanlity>");
		sb.append("<TotalWeight>");
		sb.append("");
		sb.append("</TotalWeight>");
		sb.append("<TotalVolume>");
		sb.append("");
		sb.append("</TotalVolume>");
		sb.append("<Remark>");
		sb.append("");
		sb.append("</Remark>");
		
		sb.append("</param>");
		return sb.toString();
	}
	
	public static String setMaiRuiOtherCharge(){
		StringBuffer sb = new StringBuffer("<?xml version =\"1.0\" encoding = \"UTF-8\"?>");
		sb.append("<param>");
		
		sb.append("<ServiceProviderGID>");
		sb.append("恒路");
		sb.append("</ServiceProviderGID>");
		sb.append("<Pwd>");
		sb.append("c8ffe9a587b126f152ed3d89a146b445");
		sb.append("</Pwd>");
		sb.append("<ShipmentID>");
		sb.append("SP1405240468");
		sb.append("</ShipmentID>");
		sb.append("<ChargeType>");
		sb.append("");
		sb.append("</ChargeType>");
		sb.append("<Amount>");
		sb.append("");
		sb.append("</Amount>");
		sb.append("<CURRENCY_ID>");
		sb.append("");
		sb.append("</CURRENCY_ID>");
		sb.append("<Remark>");
		sb.append("");
		sb.append("</Remark>");
		
		sb.append("</param>");
		return sb.toString();
	}

}
