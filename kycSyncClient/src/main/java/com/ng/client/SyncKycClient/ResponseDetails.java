package com.ng.client.SyncKycClient;



import lombok.Data;

@Data
public class ResponseDetails {

	private String body;
	private String refId;
	private byte[] file_content;
	private int responseCode;
	private String responseStatus;
	private String url;
}
