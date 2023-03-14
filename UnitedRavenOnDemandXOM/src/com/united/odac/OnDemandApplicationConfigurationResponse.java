package com.united.odac;

public class OnDemandApplicationConfigurationResponse {

	private String deliveryMode;
	private String notificationThreshold;

	public OnDemandApplicationConfigurationResponse() {
		this.deliveryMode = "";
		this.notificationThreshold = "";
	}

	public String getDeliveryMode() {
		return deliveryMode;
	}

	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
	}

	public String getNotificationThreshold() {
		return notificationThreshold;
	}

	public void setNotificationThreshold(String notificationThreshold) {
		this.notificationThreshold = notificationThreshold;
	}

}
