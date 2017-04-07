package com.yann;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.xml.rpc.ServiceException;
import client.WSContext;
import localhost.ormrpc.services.EASLogin.EASLoginProxy;
import localhost.ormrpc.services.EASLogin.EASLoginProxyServiceLocator;
//import localhost.ormrpc.services.WSWayBillStandardInterface.WSWayBillStandardInterfaceSrvProxy;
//import localhost.ormrpc.services.WSWayBillStandardInterface.WSWayBillStandardInterfaceSrvProxyServiceLocator;


public class LoginTest {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		try {
//				ͨ��WebService��¼EAS
			EASLoginProxyServiceLocator loginLocator = new EASLoginProxyServiceLocator();
			EASLoginProxy loginProxy = loginLocator.getEASLogin();
			System.out.println("------ ��ʼ��¼������ .... ");
//			WSContext context = loginProxy.login("user", "kduser", "eas", "orcl", "L2", 1);
//			WSContext context = loginProxy.login("�ⲿ�ͻ�", "123456", "eas", "zsk", "L2", 1);//���ؿ�����������ʽ�⣨��ͨ��
			WSContext context = loginProxy.login("�ⲿ�ͻ�", "123456", "eas", "CSK_198", "L2", 1);//���ؿ�����������ʽ���Կ⣨��ͨ��
//			WSContext context = loginProxy.login("������", "wangjin", "eas", "testZS", "L2", 1);
//			WSContext context = loginProxy.login("�ⲿ�ͻ�", "123456", "eas", "csk_199", "L2", 1);
			System.out.println("------ ��½�ɹ���SessionID��" + context.getSessionId());
			System.out.println("------ ��½�ɹ���UserName��" + context.getUserName());
			System.out.println("------ ��½�ɹ���DcName��" + context.getDcName());
			System.out.println("------ ��½�ɹ���Password��" + context.getPassword());
			//	ͨ��Kmye WevService��ȡ��Ϣ
//			WSoutDepartmentOperSrvProxyService recordWaybillLocator = new WSoutDepartmentOperSrvProxyServiceLocator();
//			boolean flag = recordWaybillLocator.getWSoutDepartmentOper().isLoginSuccess("ʷ�", "shiqian");
			
//			WSWayBillStandardInterfaceSrvProxyServiceLocator accountLocator = new WSWayBillStandardInterfaceSrvProxyServiceLocator();
//			WSWayBillStandardInterfaceSrvProxy accountProxy = accountLocator.getWSWayBillStandardInterface();
//			String[] result = accountProxy.login("��άȺ��", "123456");
//			
//			System.out.println("��¼�����" + result[3]);

//			String[] provinceInfo = recordWaybillFacadeProxy.getProvinceInfo();
//			String[] cityInfo = recordWaybillFacadeProxy.getCityInfo("awIwwCIrS9a2KrQKlCG3D6C7m9c=");
//			String[] areaAddressInfo = recordWaybillFacadeProxy.getAreaAddressInfo("w/iCINALSWmFwjl3XvomHjTudZI=");
////			String[] streetInfo = recordWaybillFacadeProxy.getStreetInfo("C5X2T2dBTHClGccConCAf0m8lKA=");
//			String[] streetInfo = recordWaybillFacadeProxy.getStreetInfo("wmdx4TrsS2udmkvK/4JchEm8lKA=");
			
			
//			String[] param2 = {"duY9CK1HT3KNZ0261auuWJkXGXg=","7tzZ4dbsSeiwWOnFzL3f7rNC3jg=","","","","","",""};
//			
////			recordWaybillFacadeProxy.getAppDeliveryInfo(param2);
//			String dd[][] = recordWaybillFacadeProxy.getRecordWaybill(param2);
//			
//			System.out.println(dd[0][0]);
//			System.out.println(dd[0][1]);
//			String d1 = dd[0][0];
//			String ss[] = d1.split("--WSLJF01--");
//			
//			for(int i = 0 ;i<ss.length;i++){
//				System.out.println(ss[i]);
//			}
			
//			BufferedImage img = null;
//			try {
//				img = ImageIO.read(new File("C:\\BOSDownLoad\\1211281558162110.jpg"));
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			ImageOperate.flipImage(img);
//			
//			System.out.println(img);
//			System.out.println(ImageOperate.flipImage(img));
//			
//			recordWaybillFacadeProxy.getAppDeliveryInfo({"",""});
//			String[] paramFilter = {"7tzZ4dbsSeiwWOnFzL3f7rNC3jg="};
			//���Եõ��������Ϣ
//			String[] appDeliveryInfo = recordWaybillFacadeProxy.getAppDeliveryInfo(paramFilter);
//			for(int i = 0 ;i<appDeliveryInfo.length;i++){
//				System.out.print(appDeliveryInfo[i]);
//			}
//			
//			recordWaybillFacadeProxy.getSignatureInfo();
			
			//���Եõ�Ԥ¼����Ϣ����
//			String[][] rwBillInfo = recordWaybillFacadeProxy.getRecordWaybill(null);
//			for(int i = 0;i<rwBillInfo.length;i++){
//				String header = rwBillInfo[i][0];
//				String body = rwBillInfo[i][1];
//				System.out.println(header);
//				String[] tempBody = body.split(";");
//				for(int j = 0;j<tempBody.length;j++){
//					if(j!=tempBody.length-1){
//						System.out.print(tempBody[j]+",");
//					}else{
//						System.out.println(tempBody[j]);
//					}
//				}
//			}
//			System.out.println();
			
//			//�����ջ���Ϣ����
//			String[] arrReceive = {"ifH7Igt7T2ezRk4SfRcPhajxCuQ=-����1-���ϼ���1-13000045316-12503486988-�����б�����1","ifH7Igt7T2ezRk4SfRcPhajxCuQ=-����2-���ϼ���2-13000045316-12503486988-�����б�����2"};
//			String[] cmDeliveryInfo = recordWaybillFacadeProxy.saveCMReceiveInfo(arrReceive);
//			System.out.println(cmDeliveryInfo[0]+cmDeliveryInfo[1]);
			
//			//������Ϣ����
//			String[] arrGoodsInfo = {"ifH7Igt7T2ezRk4SfRcPhajxCuQ=-N97-9TX3Y8lESj6k4/xXwDf2mGlvo+I=-500-50-30-ܳ����B"};
//			String[] cmDeliveryInfo = recordWaybillFacadeProxy.saveCMGoodsInfo(arrGoodsInfo);
//			System.out.println(cmDeliveryInfo[0]);
			
//			//���ջ�����Ϣ����
//			String[] arrDelivery = {"ifH7Igt7T2ezRk4SfRcPhajxCuQ=-����-13528744423-13000045316-075543428888-�����б�����1-���-6225228811997780-����-�����˲�Ҫ̫��ʢ��"};
//			String[] cmDeliveryInfo = recordWaybillFacadeProxy.saveCMCollectionInfo(arrDelivery);
//			System.out.println(cmDeliveryInfo[0]);
			
			//���÷�����ַɾ��
//			String param[] ={"kjgMezHbTGaCoH78wTK7b982O+4="};
//			recordWaybillFacadeProxy.deleteCMDeliveryInfo(param);
			
//			String [][] pass = new String [2][2];
//			
//			recordWaybillFacadeProxy.saveRecordWaybill(pass);
			
//			recordWaybillFacadeProxy.saveCMDeliveryInfo(null);
//			recordWaybillFacadeProxy.updateCMDeliveryInfo(null);
//			String[] filterParam ={"ifH7Igt7T2ezRk4SfRcPhajxCuQ="};
//			String[] deliveryInfo = recordWaybillFacadeProxy.getCMDeliveryInfo(filterParam);		
			//���Գ��÷�������Ϣ
//			for (int i = 0;i<deliveryInfo.length;i++){
//				if(i!=deliveryInfo.length-1){
//					System.out.print(deliveryInfo[i]+",");
//				}else{
//					System.out.print(deliveryInfo[i]);
//				}
//			}
			
//			//��¼��֤
//			if(loginInfo[0].equals("true")){
//				System.out.println("��¼�ɹ����ͻ�IDΪ��"+loginInfo[1]+loginInfo[2]);
//			}
//			if(loginInfo[0].equals("false")){
//				System.out.println("��¼�ɹ�1���ͻ�IDΪ��"+loginInfo[1]+loginInfo[2]);
//			}
////			String[] streetInfo = recordWaybillFacadeProxy.getStreetInfo();
//			
//			//����ʡ����Ϣ
//			for (int i = 0;i<provinceInfo.length;i++){
//				if(i!=provinceInfo.length-1){
//					System.out.print(provinceInfo[i]+",");
//				}else{
//					System.out.print(provinceInfo[i]);
//				}
//			}
//			System.out.println();
//			//���Գ�����Ϣ
//			for (int i = 0;i<cityInfo.length;i++){
//				if(i!=cityInfo.length-1){
//					System.out.print(cityInfo[i]+",");
//				}else{
//					System.out.print(cityInfo[i]);
//				}
//			}
//			System.out.println();
//			//����������Ϣ
//			for (int i = 0;i<areaAddressInfo.length;i++){
//				if(i!=areaAddressInfo.length-1){
//					System.out.print(areaAddressInfo[i]+",");
//				}else{
//					System.out.print(areaAddressInfo[i]);
//				}
//			}
//			System.out.println();
//			//���Խֵ���Ϣ
//			for (int i = 0;i<streetInfo.length;i++){
//				if(i!=streetInfo.length-1){
//					System.out.print(streetInfo[i]+",");
//				}else{
//					System.out.print(streetInfo[i]);
//				}
//			}
//			System.out.println();


//			for (int i = 0;i<cityInfo.length;i++){
//				System.out.println(cityInfo[i]);
//			}
			
//			System.out.println();
//
//			for (int i = 0;i<areaAddressInfo.length;i++){
//				System.out.println(areaAddressInfo[i]);
//			}
//			System.out.println();
//			System.out.println(streetInfo[streetInfo.length-1]);
			
			
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}

