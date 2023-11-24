package com.ng.client.SyncKycClient;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.http.HttpEntity;

public class Connection {

	public HttpURLConnection connect(String url, Map<String, String> headers) throws IOException {
		URL api_url = new URL(url);
		HttpURLConnection conn = (HttpURLConnection) api_url.openConnection();
		conn.setDoOutput(true);

		for (String key : headers.keySet()) {
			String value = headers.get(key);
			conn.setRequestProperty(key, value);
		}
		return conn;
	}
	
	public CloseableHttpResponse multipart_connection(String url, Map<String, String> headers, HttpEntity entity) throws IOException {
		HttpPost post_method = new HttpPost(url);
		System.out.println(url);
		for (String key : headers.keySet()) {
			String value = headers.get(key);
			post_method.addHeader(key, value);
		}
		post_method.setEntity(entity);
		CloseableHttpClient client = HttpClientBuilder.create()
			    .build();
		CloseableHttpResponse response = (CloseableHttpResponse) client
			        .execute(post_method);
		
		return response;
		
	}
}
