package com.client.rest;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class ApacheHttpClientUtil {
	
	public static HttpResponse sendGetRequest(String url) throws Exception{
		DefaultHttpClient httpClient = getHttpClient();
		HttpGet getRequest = new HttpGet(url);
		getRequest.addHeader("accept", "application/XML");
		HttpResponse response = httpClient.execute(getRequest);
		httpClient.getConnectionManager().shutdown(); 
		return response;
	}
	
	public static HttpResponse sendPOSTRequest(String url,String requestMsg){
		DefaultHttpClient httpClient = getHttpClient();
		return null;
	}
	public static HttpResponse sendPUTRequest(String url,String requestMsg  ){
		DefaultHttpClient httpClient = getHttpClient();
		return null;
	}
	public static HttpResponse sendDELETERequest(String url){
		DefaultHttpClient httpClient = getHttpClient();
		return null;
	}
	
	public static DefaultHttpClient getHttpClient() {
		DefaultHttpClient httpClient = new DefaultHttpClient();
		return httpClient;
	}

	public static boolean validateSuccessStatus(HttpResponse response) {
		return (response.getStatusLine().getStatusCode() != 200);
		// TODO Auto-generated method stub
		
	}

}
