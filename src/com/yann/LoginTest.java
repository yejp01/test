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
//				通过WebService登录EAS
			EASLoginProxyServiceLocator loginLocator = new EASLoginProxyServiceLocator();
			EASLoginProxy loginProxy = loginLocator.getEASLogin();
			System.out.println("------ 开始登录服务器 .... ");
//			WSContext context = loginProxy.login("user", "kduser", "eas", "orcl", "L2", 1);
//			WSContext context = loginProxy.login("外部客户", "123456", "eas", "zsk", "L2", 1);//本地开发环境，正式库（联通）
			WSContext context = loginProxy.login("外部客户", "123456", "eas", "CSK_198", "L2", 1);//本地开发环境，正式测试库（联通）
//			WSContext context = loginProxy.login("操作部", "wangjin", "eas", "testZS", "L2", 1);
//			WSContext context = loginProxy.login("外部客户", "123456", "eas", "csk_199", "L2", 1);
			System.out.println("------ 登陆成功，SessionID：" + context.getSessionId());
			System.out.println("------ 登陆成功，UserName：" + context.getUserName());
			System.out.println("------ 登陆成功，DcName：" + context.getDcName());
			System.out.println("------ 登陆成功，Password：" + context.getPassword());
			//	通过Kmye WevService获取信息
//			WSoutDepartmentOperSrvProxyService recordWaybillLocator = new WSoutDepartmentOperSrvProxyServiceLocator();
//			boolean flag = recordWaybillLocator.getWSoutDepartmentOper().isLoginSuccess("史骞", "shiqian");
			
//			WSWayBillStandardInterfaceSrvProxyServiceLocator accountLocator = new WSWayBillStandardInterfaceSrvProxyServiceLocator();
//			WSWayBillStandardInterfaceSrvProxy accountProxy = accountLocator.getWSWayBillStandardInterface();
//			String[] result = accountProxy.login("创维群星", "123456");
//			
//			System.out.println("登录情况：" + result[3]);

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
			//测试得到提货单信息
//			String[] appDeliveryInfo = recordWaybillFacadeProxy.getAppDeliveryInfo(paramFilter);
//			for(int i = 0 ;i<appDeliveryInfo.length;i++){
//				System.out.print(appDeliveryInfo[i]);
//			}
//			
//			recordWaybillFacadeProxy.getSignatureInfo();
			
			//测试得到预录单信息方法
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
			
//			//常用收货信息新增
//			String[] arrReceive = {"ifH7Igt7T2ezRk4SfRcPhajxCuQ=-张三1-张氏集团1-13000045316-12503486988-深圳市宝安区1","ifH7Igt7T2ezRk4SfRcPhajxCuQ=-张三2-张氏集团2-13000045316-12503486988-深圳市宝安区2"};
//			String[] cmDeliveryInfo = recordWaybillFacadeProxy.saveCMReceiveInfo(arrReceive);
//			System.out.println(cmDeliveryInfo[0]+cmDeliveryInfo[1]);
			
//			//货物信息新增
//			String[] arrGoodsInfo = {"ifH7Igt7T2ezRk4SfRcPhajxCuQ=-N97-9TX3Y8lESj6k4/xXwDf2mGlvo+I=-500-50-30-艹你吗B"};
//			String[] cmDeliveryInfo = recordWaybillFacadeProxy.saveCMGoodsInfo(arrGoodsInfo);
//			System.out.println(cmDeliveryInfo[0]);
			
//			//代收货款信息新增
//			String[] arrDelivery = {"ifH7Igt7T2ezRk4SfRcPhajxCuQ=-朋友-13528744423-13000045316-075543428888-深圳市宝安区1-李开复-6225228811997780-工行-年轻人不要太气盛！"};
//			String[] cmDeliveryInfo = recordWaybillFacadeProxy.saveCMCollectionInfo(arrDelivery);
//			System.out.println(cmDeliveryInfo[0]);
			
			//常用发货地址删除
//			String param[] ={"kjgMezHbTGaCoH78wTK7b982O+4="};
//			recordWaybillFacadeProxy.deleteCMDeliveryInfo(param);
			
//			String [][] pass = new String [2][2];
//			
//			recordWaybillFacadeProxy.saveRecordWaybill(pass);
			
//			recordWaybillFacadeProxy.saveCMDeliveryInfo(null);
//			recordWaybillFacadeProxy.updateCMDeliveryInfo(null);
//			String[] filterParam ={"ifH7Igt7T2ezRk4SfRcPhajxCuQ="};
//			String[] deliveryInfo = recordWaybillFacadeProxy.getCMDeliveryInfo(filterParam);		
			//测试常用发货人信息
//			for (int i = 0;i<deliveryInfo.length;i++){
//				if(i!=deliveryInfo.length-1){
//					System.out.print(deliveryInfo[i]+",");
//				}else{
//					System.out.print(deliveryInfo[i]);
//				}
//			}
			
//			//登录验证
//			if(loginInfo[0].equals("true")){
//				System.out.println("登录成功，客户ID为："+loginInfo[1]+loginInfo[2]);
//			}
//			if(loginInfo[0].equals("false")){
//				System.out.println("登录成功1，客户ID为："+loginInfo[1]+loginInfo[2]);
//			}
////			String[] streetInfo = recordWaybillFacadeProxy.getStreetInfo();
//			
//			//测试省份信息
//			for (int i = 0;i<provinceInfo.length;i++){
//				if(i!=provinceInfo.length-1){
//					System.out.print(provinceInfo[i]+",");
//				}else{
//					System.out.print(provinceInfo[i]);
//				}
//			}
//			System.out.println();
//			//测试城市信息
//			for (int i = 0;i<cityInfo.length;i++){
//				if(i!=cityInfo.length-1){
//					System.out.print(cityInfo[i]+",");
//				}else{
//					System.out.print(cityInfo[i]);
//				}
//			}
//			System.out.println();
//			//测试区县信息
//			for (int i = 0;i<areaAddressInfo.length;i++){
//				if(i!=areaAddressInfo.length-1){
//					System.out.print(areaAddressInfo[i]+",");
//				}else{
//					System.out.print(areaAddressInfo[i]);
//				}
//			}
//			System.out.println();
//			//测试街道信息
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

