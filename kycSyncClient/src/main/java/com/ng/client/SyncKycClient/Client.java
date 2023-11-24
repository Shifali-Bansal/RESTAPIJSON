package com.ng.client.SyncKycClient;



import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Map;
import org.apache.hc.client5.http.entity.mime.FileBody;
import org.apache.hc.client5.http.entity.mime.HttpMultipartMode;
import org.apache.hc.client5.http.entity.mime.MultipartEntityBuilder;
import org.apache.hc.client5.http.entity.mime.StringBody;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.HttpEntity;


public class Client {

	Connection http_connection = new Connection();

	public String post_method(String body, Map<String, String> headers, String url) {
		try {
			headers.put("Content-Type", "application/json");
			HttpURLConnection conn = http_connection.connect(url, headers);
			conn.setRequestMethod("POST");
			OutputStream os = conn.getOutputStream();
			os.write(body.getBytes());
			StringBuilder sb = new StringBuilder();
		    BufferedReader reader = 
		            new BufferedReader(new InputStreamReader(conn.getInputStream()), 65728);
		     String line = null;
		     while ((line = reader.readLine()) != null) {
		    	 System.out.println(line);
		         sb.append(line);
		     }
		     return sb.toString();	
		} catch (Exception e) {
			return null;
		}
	}

	public String get_method(Map<String, String> headers, String url, String reference_id) {
		try {
			url += "?referenceId" + "=" + reference_id;
			HttpURLConnection conn = http_connection.connect(url, headers);
			conn.setRequestMethod("GET");
			StringBuilder sb = new StringBuilder();
		    BufferedReader reader = 
		            new BufferedReader(new InputStreamReader(conn.getInputStream()), 65728);
		     String line = null;
		     while ((line = reader.readLine()) != null) {
		    	 System.out.println(line);
		         sb.append(line);
		     }
		     return sb.toString();	
		} catch (Exception e) {
			return null;
			// TODO: handle exception
		}
	}
	
	public String mutlipart_method_with_payload(Map<String, ArrayList<File>> files_map, Map<String, String> headers, String url, Map<String, String> payload_map) throws IOException {
		MultipartEntityBuilder builder = MultipartEntityBuilder.create();
		builder.setMode(HttpMultipartMode.LEGACY);
		for(String key: files_map.keySet()) {
			ArrayList<File> files = files_map.get(key);
			for(File f: files ) {
				 FileBody fileBody = new FileBody(f, ContentType.MULTIPART_FORM_DATA);
				builder.addPart(key, fileBody);
			}
		}
		for (String key: payload_map.keySet()) {
			String payload = payload_map.get(key);
			 StringBody stringBody1 = new StringBody(payload, ContentType.MULTIPART_FORM_DATA);
			builder.addPart(key, stringBody1);
			
		}
		HttpEntity entity = builder.build();
		CloseableHttpResponse conn = http_connection.multipart_connection(url, headers, entity);
		HttpEntity resp_entity = conn.getEntity();
		StringBuilder sb = new StringBuilder();
	    BufferedReader reader = 
	            new BufferedReader(new InputStreamReader(resp_entity.getContent()), 65728);
	     String line = null;
	     while ((line = reader.readLine()) != null) {
	    	 System.out.println(line);
	         sb.append(line);
	     }
	     return sb.toString();	
	}
	
	public String mutlipart_method_without_payload(Map<String, ArrayList<File>> files_map, Map<String, String> headers, String url) throws IOException {
		MultipartEntityBuilder builder = MultipartEntityBuilder.create();
		builder.setMode(HttpMultipartMode.LEGACY);
		for(String key: files_map.keySet()) {
			ArrayList<File> files = files_map.get(key);
			for(File f: files ) {
				 FileBody fileBody = new FileBody(f, ContentType.MULTIPART_FORM_DATA);
				builder.addPart(key, fileBody);
			}
		}
		HttpEntity entity = builder.build();
		CloseableHttpResponse conn = http_connection.multipart_connection(url, headers, entity);
		HttpEntity resp_entity = conn.getEntity();
		StringBuilder sb = new StringBuilder();
	    BufferedReader reader = 
	            new BufferedReader(new InputStreamReader(resp_entity.getContent()), 65728);
	     String line = null;
	     while ((line = reader.readLine()) != null) {
	    	 System.out.println(line);
	         sb.append(line);
	     }
	     return sb.toString();	
	}
	
	/*
	 * public ResponseDetails post_method_xml(Map<String, String> headers, String
	 * url) throws IOException {
	 * 
	 * ResponseDetails dto = new ResponseDetails(); dto.setUrl(url);
	 * HttpURLConnection conn = http_connection.connect(url, headers);
	 * headers.put("Content-Type", "text/plain"); conn.setConnectTimeout(6 * 10 *
	 * 1000); conn.setReadTimeout(6 * 10 * 1000); System.out.println(1); try {
	 * conn.setRequestMethod("POST"); StringBuilder sb = new StringBuilder(); try
	 * (BufferedReader reader = new BufferedReader(new
	 * InputStreamReader(conn.getInputStream(), "utf-8"))) { String line = null;
	 * while ((line = reader.readLine()) != null) { sb.append(line); } }
	 * dto.setResponseCode(conn.getResponseCode()); } catch (Exception e) {
	 * System.out.println(e); if (conn != null) { try { StringBuilder sb = new
	 * StringBuilder(); try (BufferedReader reader = new BufferedReader(new
	 * InputStreamReader(conn.getErrorStream()), 65728)) { String line = null;
	 * 
	 * while ((line = reader.readLine()) != null) { sb.append(line); } }
	 * dto.setResponseCode(conn.getResponseCode()); } catch (IOException e1) { } }
	 * // TODO - Handle Error. } return dto; }
	 */
}



