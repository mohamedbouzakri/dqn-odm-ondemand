package com.united.odt;

public class OnDemandTemplateResponse {

	private String templateName;
	private String templateVersion;

	public OnDemandTemplateResponse() {
		this.templateName = "";
		this.templateVersion = "";
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getTemplateVersion() {
		return templateVersion;
	}

	public void setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
	}

}
