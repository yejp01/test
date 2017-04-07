package com.yann;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

public class Base64Test {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "timestamp=1371458270545&dig	est=OTZhY2FjMWIxNmY3ZTE0NmZiOGI0ODk0MDNhYzI1ZTM%3D%0D%0A&params=%7B%22remark%22%3Anull%2C%22cargoName%22%3A%22sadffd%22%2C%22totalNumber%22%3A3%2C%22transportType%22%3A%22QC_KCZX%22%2C%22sender%22%3A%7B%22address%22%3A%22%E6%9C%AA%E7%9F%A5%22%2C%22name%22%3A%22ff%22%2C%22companyName%22%3A%22ff%22%2C%22province%22%3A%22%E6%B5%99%E6%B1%9F%E7%9C%81%22%2C%22city%22%3A%22%E9%87%91%E5%8D%8E%E5%B8%82%22%2C%22phone%22%3Anull%2C%22county%22%3A%22%E5%A9%BA%E5%9F%8E%E5%8C%BA%22%2C%22mobile%22%3A%221752234568%22%2C%22postCode%22%3A%22321051%22%2C%22aliProvinceCode%22%3A%22330000%22%2C%22aliCityCode%22%3A%22330700%22%2C%22aliCountyCode%22%3A%22330702%22%7D%2C%22businessNetworkNo%22%3Anull%2C%22totalWeight%22%3A30.0%2C%22totalVolume%22%3A0.0%2C%22logisticID%22%3A%22AL00013667792815%22%2C%22toNetworkNo%22%3A%22-1%22%2C%22totalPrice%22%3A220%2C%22smsNotify%22%3A%22N%22%2C%22smsNotifyPrice%22%3Anull%2C%22receiver%22%3A%7B%22address%22%3A%22sfsdfasfasdf%22%2C%22name%22%3A%22fff%22%2C%22companyName%22%3A%22sdfdf%22%2C%22province%22%3A%22%E5%A4%A9%E6%B4%A5%22%2C%22city%22%3A%22%E5%A4%A9%E6%B4%A5%E5%B8%82%22%2C%22phone%22%3Anull%2C%22county%22%3A%22%E5%AE%9D%E5%9D%BB%E5%8C%BA%22%2C%22mobile%22%3A%2213752238457%22%2C%22postCode%22%3A%22301800%22%2C%22aliProvinceCode%22%3A%22120000%22%2C%22aliCityCode%22%3A%22120100%22%2C%22aliCountyCode%22%3A%22120115%22%7D%2C%22materialCostPrice%22%3Anull%2C%22fuelSurchargePrice%22%3Anull%2C%22aliUID%22%3A%22965643315%22%2C%22transportPrice%22%3A220%2C%22payType%22%3A%220%22%2C%22insurancePrice%22%3Anull%2C%22insuranceValue%22%3Anull%2C%22codPrice%22%3Anull%2C%22codType%22%3Anull%2C%22codValue%22%3Anull%2C%22vistReceive%22%3A%22Y%22%2C%22vistReceivePrice%22%3Anull%2C%22deliveryPrice%22%3Anull%2C%22deliveryType%22%3A%221%22%2C%22backSignBill%22%3A%220%22%2C%22backSignBillPrice%22%3Anull%2C%22packageService%22%3Anull%2C%22packageServicePrice%22%3Anull%2C%22waitNotifySend%22%3A%22N%22%2C%22waitNotifySendPrice%22%3Anull%2C%22fuelSurcharge%22%3A%22N%22%2C%22materialCost%22%3A%22N%22%2C%22otherPrice%22%3Anull%2C%22gmtCommit%22%3A1371451309000%2C%22weightRate%22%3A2%2C%22volumeRate%22%3A4000%2C%22leastExpenses%22%3A220%2C%22memberType%22%3A%22PT%22%2C%22promotion%22%3Anull%2C%22attention%22%3Anull%2C%22logisticCompanyID%22%3A%22SPPT%22%7D";
		String d = URLDecoder.decode(s, "utf-8");
		System.out.println(d);
		int i = d.indexOf("params=");
		String srcString = d.substring(i + "params=".length());
		System.out.println(srcString);
		{
			String params = srcString + "1006126" + "nhOgXK}kxDSS";
			System.out.println(params);
			byte[] ff = DigestUtils.md5Hex(params).getBytes();
			String f = Base64.encodeBase64String(ff);
			System.out.println(f);
		}
	}
}