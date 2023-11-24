package com.ng.client.SyncKycClient;

import java.util.Map;

public class KycSyncClient {
	
	public String caMemeberShip(Map<String, String> headers, String body) {
		Client client = new Client();
		PropertyReader prop = PropertyReader.getInstance();
		String api_url = prop.getProperty("ca_membership_api_url");
		String base_url = prop.getProperty("kyc_sync_base_url");
		String url = base_url + api_url;
		String response = client.post_method(body, headers, url);
		return response;
		
	}
	
	public String aadharVerifier(Map<String, String> headers, String body) {
		Client client = new Client();
		PropertyReader prop = PropertyReader.getInstance();
		String api_url = prop.getProperty("aadhar_verifier_api_url");
		String base_url = prop.getProperty("kyc_sync_base_url");
		String url = base_url + api_url;
		String response = client.post_method(body, headers, url);
		return response;
	}
	public String getOtp(Map<String, String> headers, String body) {
		Client client = new Client();
		PropertyReader prop = PropertyReader.getInstance();
		String api_url = prop.getProperty("get_otp_api_url");
		String base_url = prop.getProperty("kyc_sync_base_url");
		String url = base_url + api_url;
		String response = client.post_method(body, headers, url);
		return response;
	}
	
	public String validateOtp(Map<String, String> headers, String body) {
		Client client = new Client();
		PropertyReader prop = PropertyReader.getInstance();
		String api_url = prop.getProperty("validate_otp_api_url");
		String base_url = prop.getProperty("kyc_sync_base_url");
		String url = base_url + api_url;
		String response = client.post_method(body, headers, url);
		return response;
	}
	
	public String epfoVerifierEnterprise(Map<String, String> headers, String body) {
		Client client = new Client();
		PropertyReader prop = PropertyReader.getInstance();
		String api_url = prop.getProperty("epfo_enterprise_api_url");
		String base_url = prop.getProperty("kyc_sync_base_url");
		String url = base_url + api_url;
		String response = client.post_method(body, headers, url);
		return response;
		
	}
	public String creditRating(Map<String, String> headers, String body) {
		Client client = new Client();
		PropertyReader prop = PropertyReader.getInstance();
		String api_url = prop.getProperty("credit_rating_api_url");
		String base_url = prop.getProperty("kyc_sync_base_url");
		String url = base_url + api_url;
		String response = client.post_method(body, headers, url);
		return response;
		
	}
	public String fdaLicence(Map<String, String> headers, String body) {
		Client client = new Client();
		PropertyReader prop = PropertyReader.getInstance();
		String api_url = prop.getProperty("fda_licence_api_url");
		String base_url = prop.getProperty("kyc_sync_base_url");
		String url = base_url + api_url;
		String response = client.post_method(body, headers, url);
		return response;
		
	}
	
	public String fssaLicence(Map<String, String> headers, String body) {
		Client client = new Client();
		PropertyReader prop = PropertyReader.getInstance();
		String api_url = prop.getProperty("fssa_licence_api_url");
		String base_url = prop.getProperty("kyc_sync_base_url");
		String url = base_url + api_url;
		String response = client.post_method(body, headers, url);
		return response;
		
	}
	public String icmaiMemberShip(Map<String, String> headers, String body) {
		Client client = new Client();
		PropertyReader prop = PropertyReader.getInstance();
		String api_url = prop.getProperty("icmai_membership_api_url");
		String base_url = prop.getProperty("kyc_sync_base_url");
		String url = base_url + api_url;
		String response = client.post_method(body, headers, url);
		return response;
		
	}
	public String voterCardVerifier(Map<String, String> headers, String body) {
		Client client = new Client();
		PropertyReader prop = PropertyReader.getInstance();
		String api_url = prop.getProperty("voter_card_verifier_api_url");
		String base_url = prop.getProperty("kyc_sync_base_url");
		String url = base_url + api_url;
		String response = client.post_method(body, headers, url);
		return response;
		
	}
	public String passportVerification(Map<String, String> headers, String body) {
		Client client = new Client();
		PropertyReader prop = PropertyReader.getInstance();
		String api_url = prop.getProperty("passport_verification_api_url");
		String base_url = prop.getProperty("kyc_sync_base_url");
		String url = base_url + api_url;
		String response = client.post_method(body, headers, url);
		return response;
		
	}
	
	public String panVerification(Map<String, String> headers, String body) {
		Client client = new Client();
		PropertyReader prop = PropertyReader.getInstance();
		String api_url = prop.getProperty("pan_verification_api_url");
		String base_url = prop.getProperty("kyc_sync_base_url");
		String url = base_url + api_url;
		String response = client.post_method(body, headers, url);
		return response;
		
	}
	public String importExportCode(Map<String, String> headers, String body) {
		Client client = new Client();
		PropertyReader prop = PropertyReader.getInstance();
		String api_url = prop.getProperty("import_export_api_url");
		String base_url = prop.getProperty("kyc_sync_base_url");
		String url = base_url + api_url;
		String response = client.post_method(body, headers, url);
		return response;
		
	}
	public String udyogAadharOtp(Map<String, String> headers, String body) {
		Client client = new Client();
		PropertyReader prop = PropertyReader.getInstance();
		String api_url = prop.getProperty("udyog_aadhar_otp_api_url");
		String base_url = prop.getProperty("kyc_sync_base_url");
		String url = base_url + api_url;
		String response = client.post_method(body, headers, url);
		return response;
		
	}
	public String udyogAadharOtpValidate(Map<String, String> headers, String body) {
		Client client = new Client();
		PropertyReader prop = PropertyReader.getInstance();
		String api_url = prop.getProperty("udyog_aadhar_validate_api_url");
		String base_url = prop.getProperty("kyc_sync_base_url");
		String url = base_url + api_url;
		String response = client.post_method(body, headers, url);
		return response;
		
	}
	public String negitiveCheck(Map<String, String> headers, String body) {
		Client client = new Client();
		PropertyReader prop = PropertyReader.getInstance();
		String api_url = prop.getProperty("negitive_api_url");
		String base_url = prop.getProperty("kyc_sync_base_url");
		String url = base_url + api_url;
		String response = client.post_method(body, headers, url);
		return response;
		
	}
	public String electricityCheck(Map<String, String> headers, String body) {
		Client client = new Client();
		PropertyReader prop = PropertyReader.getInstance();
		String api_url = prop.getProperty("electricity_check_api_url");
		String base_url = prop.getProperty("kyc_sync_base_url");
		String url = base_url + api_url;
		String response = client.post_method(body, headers, url);
		return response;
		
	}
	public String vehicleRegistration(Map<String, String> headers, String body) {
		Client client = new Client();
		PropertyReader prop = PropertyReader.getInstance();
		String api_url = prop.getProperty("vehicle_registration_api_url");
		String base_url = prop.getProperty("kyc_sync_base_url");
		String url = base_url + api_url;
		String response = client.post_method(body, headers, url);
		return response;
		
	}
	public String utilityPhoneGenerateOtp(Map<String, String> headers, String body) {
		Client client = new Client();
		PropertyReader prop = PropertyReader.getInstance();
		String api_url = prop.getProperty("utility_phone_generate_otp_api_url");
		String base_url = prop.getProperty("kyc_sync_base_url");
		String url = base_url + api_url;
		String response = client.post_method(body, headers, url);
		return response;
		
	}
	public String utilityPhoneValidate(Map<String, String> headers, String body) {
		Client client = new Client();
		PropertyReader prop = PropertyReader.getInstance();
		String api_url = prop.getProperty("utility_phone_validate_api_url");
		String base_url = prop.getProperty("kyc_sync_base_url");
		String url = base_url + api_url;
		String response = client.post_method(body, headers, url);
		return response;
		
	}
	public String drivingLicenceDataFetch(Map<String, String> headers, String body) {
		Client client = new Client();
		PropertyReader prop = PropertyReader.getInstance();
		String api_url = prop.getProperty("driving_licence_data_fetch_api_url");
		String base_url = prop.getProperty("kyc_sync_base_url");
		String url = base_url + api_url;
		String response = client.post_method(body, headers, url);
		return response;
		
	}
	public String bankAccountVerification(Map<String, String> headers, String body) {
		Client client = new Client();
		PropertyReader prop = PropertyReader.getInstance();
		String api_url = prop.getProperty("bank_account_verification_api_url");
		String base_url = prop.getProperty("kyc_sync_base_url");
		String url = base_url + api_url;
		String response = client.post_method(body, headers, url);
		return response;
		
	}
	public String drivingLicence(Map<String, String> headers, String body) {
		Client client = new Client();
		PropertyReader prop = PropertyReader.getInstance();
		String api_url = prop.getProperty("driving_licence_api_url");
		String base_url = prop.getProperty("kyc_sync_base_url");
		String url = base_url + api_url;
		String response = client.post_method(body, headers, url);
		return response;
		
	}
	
	public String kycEnterprise(Map<String, String> headers, String body) {
		Client client = new Client();
		PropertyReader prop = PropertyReader.getInstance();
		String api_url = prop.getProperty("kyc_enterprise_api_url");
		String base_url = prop.getProperty("kyc_sync_base_url");
		String url = base_url + api_url;
		String response = client.post_method(body, headers, url);
		return response;
		
	}


}
