package com.yann;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JosnTest {
	// construct json and output it
	public static String jsonTest() throws JSONException {
		JSONObject json = new JSONObject();
		JSONArray jsonMembers = new JSONArray();
		JSONObject member1 = new JSONObject();
		member1.put("loginname", "zhangfan");
		member1.put("password", "userpass");
		member1.put("email", "10371443@qq.com");
		member1.put("sign_date", "2007-06-12");
		jsonMembers.put(member1);

		JSONObject member2 = new JSONObject();
		member2.put("loginname", "zf");
		member2.put("password", "userpass");
		member2.put("email", "8223939@qq.com");
		member2.put("sign_date", "2008-07-16");
		jsonMembers.put(member2);
		json.put("users", jsonMembers);

		return json.toString();
	}

	// construct json from String and resolve it.
	public static String jsonTest2() throws JSONException {
		// String
		// jsonString="{\"users\":[{\"loginname\":\"zhangfan\",\"password\":\"userpass\",\"email\":\"10371443@qq.com\"},{\"loginname\":\"zf\",\"password\":\"userpass\",\"email\":\"822393@qq.com\"}]}";
		// String jsonString = jsonTest();
		String jsonString = parserJosn(null, null);
		JSONObject json = new JSONObject(jsonString);
		// JSONArray jsonArray= json.getJSONArray("users");
		String dd = json.getString("remarkcomments");
		JSONObject jsonSender = new JSONObject(json.getString("sender"));

		String companyName = (String) jsonSender.get("companyName");
		String name = (String) jsonSender.get("name");
		String postCode = (String) jsonSender.get("postCode");
		String phone = (String) jsonSender.get("phone");
		String mobile = (String) jsonSender.get("mobile");
		String province = (String) jsonSender.get("province");
		String city = (String) jsonSender.get("city");
		String county = (String) jsonSender.get("county");
		String address = (String) jsonSender.get("address");

		System.out.println(companyName);
		System.out.println(name);
		System.out.println(postCode);
		System.out.println(phone);
		// String loginNames="loginname list:";
		// for(int i=0;i<jsonArray.length();i++){
		// JSONObject user=(JSONObject) jsonArray.get(i);
		// String userName=(String) user.get("loginname");
		// if(i==jsonArray.length()-1){
		// loginNames+=userName;
		// }else{
		// loginNames+=userName+",";
		// }
		// }
		return dd;
	}

	public static String parserJosn(String mailNo, String statusType) {
		JSONObject json = new JSONObject();
		JSONArray jsonMembers = new JSONArray();
		JSONObject member1 = new JSONObject();

		try {
			json.put("logisticCompanyID", "");
			json.put("LogisticID", "");
			json.put("mailNo", "");
			json.put("gmtUpdated", "");
			json.put("statusType", "");
			json.put("remarkcomments", "");

			json.put("sender", senderJosn());
			json.put("receiver", receiverJosn());

			json.put("cargoName", "");
			json.put("totalWeight", "");
			json.put("totalVolume", "");
			json.put("totalNumber", "");
			json.put("totalPrice", "");
			json.put("transportPrice", "");
			json.put("weightRate", "");
			json.put("volumeRate", "");
			json.put("leastExpenses", "");
			json.put("payType", "");
			json.put("transportType", "");
			json.put("insuranceValue", "");
			json.put("insurancePrice", "");
			json.put("codType", "");
			json.put("codValue", "");
			json.put("codPrice", "");
			json.put("vistReceive", "");
			json.put("vistReceivePrice", "");
			json.put("deliveryType", "");
			json.put("deliveryPrice", "");
			json.put("backSignBill", "");
			json.put("backSignBillPrice", "");
			json.put("packageService", "");
			json.put("packageServicePrice", "");

			json.put("waitNotifySend", "");
			json.put("waitNotifySendPrice", "");
			json.put("smsNotify", "");
			json.put("smsNotifyPrice", "");
			json.put("fuelSurcharge", "");
			json.put("fuelSurchargePrice", "");
			json.put("materialCost", "");
			json.put("materialCostPrice ", "");
			json.put("otherPrice", "");
			json.put("remark", "");

		} catch (JSONException e) {
			e.printStackTrace();
		}

		return json.toString();
	}

	public static String senderJosn() {
		JSONObject json = new JSONObject();
		try {
			json.put("companyName", "1");
			json.put("name", "2");
			json.put("postCode", "3");
			json.put("phone", "");
			json.put("mobile", "");
			json.put("province", "");
			json.put("city", "");
			json.put("county", "");
			json.put("address", "");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return json.toString();
	}

	public static String receiverJosn() {
		JSONObject json = new JSONObject();
		try {
			json.put("companyName", "");
			json.put("name", "");
			json.put("postCode", "");
			json.put("phone", "");
			json.put("mobile", "");
			json.put("province", "");
			json.put("city", "");
			json.put("county", "");
			json.put("address", "");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return json.toString();
	}

	public static void main(String[] args) {
		try {
			System.out.println(jsonTest2());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(parserJosn(null, null));
	}

}
