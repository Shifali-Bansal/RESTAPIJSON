package com.ng.client.SyncKycClient;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	KycSyncClient client = new KycSyncClient();
		String ClientId = "";
		String ClientSecret = "";
    	Map<String, String> headers = new HashMap<String, String>();
		headers.put("clientSecret", ClientSecret);
		headers.put("clientId", ClientId);
		String body ="{\"epicNumber\":\"ITR0046391\"}";
    	String response = client.voterCardVerifier(headers, body);
    	System.out.println("response: " + response);
    	
    }
}
