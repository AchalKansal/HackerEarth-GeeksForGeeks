package com.sap.gfg.prac;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.google.gson.Gson;

public class Test {
	public static void main(String[] args) {
		/*String str = "{\"CreationDate\":\"Apr 6, 2020 6:44:44 AM\",\"Category\":\"2\",\"CreatedByUser\":\"P000020\",\"BusinessPartner\":\"DSD\",\"to_AddressInformation\":[{\"CreationDate\":\"Apr 6, 2020 6:44:44 AM\",\"IsDeleted\":false,\"IsIndependent\":false,\"to_Address\":{\"to_PostalAddress\":[{\"StreetName\":\"\",\"HouseNumber\":\"\",\"Parent_Id\":\"68614cf8-9f0b-4b3c-9d62-ffb5db34178d\",\"PostalCode\":\"\",\"ScriptCode\":\" \",\"CityName\":\"\",\"PoBox\":\"\",\"Id\":\"a96bb899-d876-4d45-871c-65c08747b6ad\"}],\"Id\":\"68614cf8-9f0b-4b3c-9d62-ffb5db34178d\"},\"CreatedByUser\":\"P000020\",\"to_AddressUsage\":[{\"CreationDate\":\"Apr 6, 2020 6:44:44 AM\",\"AddressUsage\":\"XXDEFAULT\",\"Root_Id\":\"0907c42c-06b1-4b83-899a-7d82d97f099e\",\"CreatedByUser\":\"P000020\",\"Address_Id\":\"68614cf8-9f0b-4b3c-9d62-ffb5db34178d\",\"LastChangeDate\":\"Apr 6, 2020 6:44:44 AM\",\"Parent_Id\":\"4a66d34d-32cc-4472-a831-90dfc1c9d41b\",\"ValidityEndDate\":\"Dec 31, 9999 12:00:00 PM\",\"Id\":\"032c0508-45b8-4001-887b-23b1cfb0615d\",\"LastChangedByUser\":\"P000020\",\"ValidityStartDate\":\"Apr 6, 2020 6:44:44 AM\"}],\"Address_Id\":\"68614cf8-9f0b-4b3c-9d62-ffb5db34178d\",\"Parent_Id\":\"0907c42c-06b1-4b83-899a-7d82d97f099e\",\"LastChangedByUser\":\"P000020\",\"LastChangeDate\":\"Apr 6, 2020 6:44:44 AM\",\"ValidityEndDate\":\"Dec 31, 9999 12:00:00 PM\",\"Id\":\"4a66d34d-32cc-4472-a831-90dfc1c9d41b\",\"ValidityStartDate\":\"Apr 6, 2020 6:44:44 AM\"}],\"IsReleased\":true,\"IsMarkedForDeletion\":false,\"to_Organization\":[{\"CreationDate\":\"Apr 6, 2020 6:44:44 AM\",\"CreatedByUser\":\"P000020\",\"ScriptCode\":\" \",\"Parent_Id\":\"0907c42c-06b1-4b83-899a-7d82d97f099e\",\"LastChangedByUser\":\"P000020\",\"LastChangeDate\":\"Apr 6, 2020 6:44:44 AM\",\"OrganizationName1\":\"dsdqad\",\"Id\":\"829066c8-4b21-45de-8ee8-68955b400588\",\"OrganizationName4\":\"\",\"OrganizationName3\":\"\",\"OrganizationName2\":\"\"}],\"IsBlocked\":false,\"Status\":\"04\",\"LastChangedByUser\":\"P000020\",\"LastChangeDate\":\"Apr 6, 2020 6:44:44 AM\",\"AuthorizationGroup\":\"\",\"Id\":\"0907c42c-06b1-4b83-899a-7d82d97f099e\",\"IsBusinessPurposeCompleted\":false}";
		JsonObject jsonObject = new JsonParser().parse(str).getAsJsonObject();
		Gson g = new Gson();
		g.toJson(str);
		System.out.println(jsonObject.get("BusinessPartner") != null ? jsonObject.get("Id").toString() : "");
		Set<String> test = new HashSet<>();
		Iterator<String> str1 = test.iterator();
		while(str1.hasNext()) {
			System.out.println("here");
		}*/
		
	/*	Map<String,Object> test = new HashMap<String,Object>();
		
		test.put("1", "[{CreationDate=2020-05-05 08:26:19.84, IdentificationNumber=00, CreatedByUser=achal.kansal@sap.com, Parent_Id=05401be6-0312-40ca-8b63-3339cb6cc108, IdentificationType=FS0001, LastChangedByUser=achal.kansal@sap.com, Institute=null, LastChangeDate=2020-05-05 08:26:19.84, EntryDate=null, Country=null, Region=null, ValidityEndDate=9999-12-31 12:00:00.0, Id=4493312e-ddf2-4a44-82c1-4629460901f3, ValidityStartDate=2020-05-05 08:26:19.0}]");
		test.put("2","kansal");
		Gson gson = new Gson();
		JsonElement jsonElement = gson.toJsonTree(test);
		System.out.println(jsonElement);*/
		Map<String, Object> mapp = new HashMap<>();
		mapp.put("1", "vlaue");
		System.out.println(mapp.get("1"));
		
		
		String a = "[{\"CreationDate\":\"May 5, 2020 8:26:19 AM\",\"IdentificationNumber\":\"00\",\"CreatedByUser\":\"achal.kansal@sap.com\",\"Parent_Id\":\"05401be6-0312-40ca-8b63-3339cb6cc108\",\"IdentificationType\":\"FS0001\",\"LastChangedByUser\":\"achal.kansal@sap.com\",\"LastChangeDate\":\"May 5, 2020 8:26:19 AM\",\"ValidityEndDate\":\"Dec 31, 9999 12:00:00 PM\",\"Id\":\"4493312e-ddf2-4a44-82c1-4629460901f3\",\"ValidityStartDate\":\"May 5, 2020 8:26:19 AM\"}]";
		
		Map<String, List<Map<String, Object>>> map = new HashMap<String, List<Map<String, Object>>>();
		Gson gson = new Gson();
		List<Map<String, Object>> oldJsonArray = gson.fromJson(a, List.class);
		map.put("to_Identification", oldJsonArray);
		String test = gson.toJson(map);
		System.out.println(test);
		//System.err.println(map);
		
		
		
		String a1  = "";
		String s2 = "   acha ";
		String s3 = "achal";
		System.out.println(StringUtils.isNotEmpty(a1));
		System.out.println(StringUtils.isNotEmpty(s2));
		System.out.println(StringUtils.isNotEmpty(s3));
		System.out.println(StringUtils.isNotBlank(a1));
		System.out.println(StringUtils.isNotBlank(s2));
		System.out.println(StringUtils.isNotBlank(s3));
	}
}
