package com.united.odt;

public class OnDemandTemplateRequest {

	private String eventType;
	private String customerId;
	private String mpAccountID;
	private String employeeId;
	private String mpLevel;
	private String countryCode;

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getMpAccountID() {
		return mpAccountID;
	}

	public void setMpAccountID(String mpAccountID) {
		this.mpAccountID = mpAccountID;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getMpLevel() {
		return mpLevel;
	}

	public void setMpLevel(String mpLevel) {
		this.mpLevel = mpLevel;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

}
