package com.learn.gfg;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class StringToJson {
	public static void main(String[] args) {
		String s = "{\n" + 
				"	\"namespace\": \"y/mdbp/canperf\",\n" + 
				"	\"xsappname\": \"default-fce2308e-48f8-4375-80c1-8ff5893b38e0-clone!b9461|xbem-service-broker-!b1010\",\n" + 
				"	\"management\": [\n" + 
				"		{\n" + 
				"			\"oa2\": {\n" + 
				"				\"clientid\": \"sb-default-fce2308e-48f8-4375-80c1-8ff5893b38e0-clone!b9461|xbem-service-broker-!b1010\",\n" + 
				"				\"clientsecret\": \"7405bd68-7482-43f3-8cc3-36ea86a558f8$hHD2lKgJS-XyIqSlRiQDYS-JwI7piLKJ2yf50tWPd5g=\",\n" + 
				"				\"tokenendpoint\": \"https://mdbpperf.authentication.sap.hana.ondemand.com/oauth/token\",\n" + 
				"				\"granttype\": \"client_credentials\"\n" + 
				"			},\n" + 
				"			\"uri\": \"https://enterprise-messaging-hub-backend.cfapps.sap.hana.ondemand.com\"\n" + 
				"		}\n" + 
				"	],\n" + 
				"	\"serviceinstanceid\": \"fce2308e-48f8-4375-80c1-8ff5893b38e0\",\n" + 
				"	\"messaging\": [\n" + 
				"		{\n" + 
				"			\"oa2\": {\n" + 
				"				\"clientid\": \"sb-default-fce2308e-48f8-4375-80c1-8ff5893b38e0-clone!b9461|xbem-service-broker-!b1010\",\n" + 
				"				\"clientsecret\": \"7405bd68-7482-43f3-8cc3-36ea86a558f8$hHD2lKgJS-XyIqSlRiQDYS-JwI7piLKJ2yf50tWPd5g=\",\n" + 
				"				\"tokenendpoint\": \"https://mdbpperf.authentication.sap.hana.ondemand.com/oauth/token\",\n" + 
				"				\"granttype\": \"client_credentials\"\n" + 
				"			},\n" + 
				"			\"protocol\": [\n" + 
				"				\"amqp10ws\"\n" + 
				"			],\n" + 
				"			\"broker\": {\n" + 
				"				\"type\": \"sapmgw\"\n" + 
				"			},\n" + 
				"			\"uri\": \"wss://enterprise-messaging-messaging-gateway.cfapps.sap.hana.ondemand.com/protocols/amqp10ws\"\n" + 
				"		},\n" + 
				"		{\n" + 
				"			\"oa2\": {\n" + 
				"				\"clientid\": \"sb-default-fce2308e-48f8-4375-80c1-8ff5893b38e0-clone!b9461|xbem-service-broker-!b1010\",\n" + 
				"				\"clientsecret\": \"7405bd68-7482-43f3-8cc3-36ea86a558f8$hHD2lKgJS-XyIqSlRiQDYS-JwI7piLKJ2yf50tWPd5g=\",\n" + 
				"				\"tokenendpoint\": \"https://mdbpperf.authentication.sap.hana.ondemand.com/oauth/token\",\n" + 
				"				\"granttype\": \"client_credentials\"\n" + 
				"			},\n" + 
				"			\"protocol\": [\n" + 
				"				\"mqtt311ws\"\n" + 
				"			],\n" + 
				"			\"broker\": {\n" + 
				"				\"type\": \"sapmgw\"\n" + 
				"			},\n" + 
				"			\"uri\": \"wss://enterprise-messaging-messaging-gateway.cfapps.sap.hana.ondemand.com/protocols/mqtt311ws\"\n" + 
				"		},\n" + 
				"		{\n" + 
				"			\"oa2\": {\n" + 
				"				\"clientid\": \"sb-default-fce2308e-48f8-4375-80c1-8ff5893b38e0-clone!b9461|xbem-service-broker-!b1010\",\n" + 
				"				\"clientsecret\": \"7405bd68-7482-43f3-8cc3-36ea86a558f8$hHD2lKgJS-XyIqSlRiQDYS-JwI7piLKJ2yf50tWPd5g=\",\n" + 
				"				\"tokenendpoint\": \"https://mdbpperf.authentication.sap.hana.ondemand.com/oauth/token\",\n" + 
				"				\"granttype\": \"client_credentials\"\n" + 
				"			},\n" + 
				"			\"protocol\": [\n" + 
				"				\"httprest\"\n" + 
				"			],\n" + 
				"			\"broker\": {\n" + 
				"				\"type\": \"saprestmgw\"\n" + 
				"			},\n" + 
				"			\"uri\": \"https://enterprise-messaging-pubsub.cfapps.sap.hana.ondemand.com\"\n" + 
				"		}\n" + 
				"	]\n" + 
				"}";
		JsonElement j = new JsonParser().parse(s);
		System.out.println(j.getAsJsonObject().get("xsappname").getAsString());
		
	}
}
